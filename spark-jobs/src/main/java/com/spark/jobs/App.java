package com.spark.jobs;


import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.sql.SparkSession;


public class App {

   public static void main(String[] args) throws InterruptedException {
        
        String driver_host = args[0];
            String driver_port = args[1];
            String ui_port = args[2];
            final String MASTER_URL_LOCAL ="spark://192.168.163.43:7077";
            final String MASTER_URL_AWS ="spark://aa08d060ac3384d8d9550fc85e66ca0a-1845150076.eu-central-1.elb.amazonaws.com:7077";
            
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

       try (JavaSparkContext context = new JavaSparkContext(session.sparkContext())) {
            List<Integer> integers = Arrays.asList(1, 4, 5, 6, 7, 8, 9,
                    10, 11, 12, 13, 14, 15);
            JavaRDD<Integer> javaRDD = context.parallelize(integers, 3);
            javaRDD.foreach((VoidFunction<Integer>) integer -> {
                        System.out.println("Java RDD:" + integer);
                        Thread.sleep(3000);
                    });
            Thread.sleep(1000000);
            context.stop();
            
        }
    }
}