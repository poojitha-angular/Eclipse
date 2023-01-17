package jobs.Application;


import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.sql.SparkSession;



public class Wordcount {

   public static void main(String[] args) throws InterruptedException {
        final String MASTER_URL_LOCAL = "spark://192.168.1.6:7077";
        final String MASTER_URL_AWS = "spark://aa08d060ac3384d8d9550fc85e66ca0a-1845150076.eu-central-1.elb.amazonaws.com:7077";

         SparkSession session = SparkSession
                .builder()
                .appName("SparkJavaExample2")
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