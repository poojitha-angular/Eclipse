package com.spark.spark_demo;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

import scala.Tuple2;


public class TaskA {
public static void main(String[ ] args) {
	String driver_host = args[0];
    String driver_port = args[1];
    String ui_port = args[2];
    final String MASTER_URL_LOCAL ="spark://192.168.163.43:7077";
    final String MASTER_URL_AWS ="spark://aa08d060ac3384d8d9550fc85e66ca0a-1845150076.eu-central-1.elb.amazonaws.com:7077";

//	SparkConf config = new SparkConf().setAppName("WordCount").setMaster("local[*]");
    SparkSession session = SparkSession
            .builder()
            .appName("SparkApp")
            // .config("spark.driver.host", "10.0.2.157")
            // .config("spark.driver.port", "40555")
            // .config("spark.ui.port", "4040")
            .config("spark.driver.host", driver_host)
            .config("spark.driver.port", driver_port)
            .config("spark.ui.port", ui_port)
            .master(MASTER_URL_AWS)
            .getOrCreate();
	
	JavaSparkContext context = new JavaSparkContext(session.sparkContext());
	JavaRDD<String> rdd = context.textFile("C:\\Users\\Poojitha\\Desktop\\sample.txt");
	JavaRDD<Object> rdd1 = rdd.flatMap(k -> Arrays.asList(k.split(" "))
//			iterator()
			);
	
	JavaPairRDD<String, Integer> prdd1 = rdd1. mapToPair(k -> new Tuple2<String, Integer>((String) k, 1));
	JavaPairRDD<String, Integer> prdd2 = prdd1.reduceByKey((v1, v2) -> v1+v2);
	JavaPairRDD<Integer, String> prdd3 = prdd2. mapToPair (k -> new Tuple2<Integer, String>(k._2(), k._1()));
	JavaPairRDD<Integer, String> prdd4 = prdd3. sortByKey(false);
	
	prdd4.take(100).forEach(System.out::println);
	context.close();
	
}
}