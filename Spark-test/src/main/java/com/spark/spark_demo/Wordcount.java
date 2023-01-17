package com.spark.spark_demo;




import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class Wordcount {

    private static void wordCount(String fileName) {

        SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("WordCounter");

        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);
         System.out.println("Spark");
        JavaRDD<String> inputFile = sparkContext.textFile("src/main/resources/sample.txt");
        System.out.println(inputFile +" reading input file" );
        JavaRDD<String> wordsFromFile = inputFile.flatMap(content -> Arrays.asList(content.split(" ")));
        System.out.println(wordsFromFile +"converting");
        JavaPairRDD countData = wordsFromFile.mapToPair(t -> new Tuple2(t, 1)).reduceByKey((x, y) -> (int) x + (int) y);
        System.out.println(countData +" count");

        countData.saveAsTextFile("CountData");
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No files provided.");
            System.exit(0);
        }

        wordCount("example");
    }
}