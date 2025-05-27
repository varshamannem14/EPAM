package com.epam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class App

{
    public static void main( String[] args )
    {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Square every number in a list and find the sum of squares

        int sumOfSquares=integerList.stream().map(n->n*n).reduce(0,Integer::sum);
        System.out.println(sumOfSquares);

        System.out.println(integerList.stream().filter(n->n%2!=0).reduce(0,Integer::sum));

        List<Integer> list;
        List<Integer> list1;
        list = integerList.stream().filter(n->n%2==0).collect(Collectors.toList());



        integerList.stream().filter(n->n%2!=0)
                .map(n->n*n*n)
                .forEach(System.out::println);

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        courses.stream().filter(course->course.length()>3).forEach(System.out::println);
        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
        list1 = courses.stream().map(String::length).collect(Collectors.toList());

        list1.forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(1,4,3,12,11,10);

        courses.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        System.out.println(list.stream().max(Comparator.naturalOrder()));

        List<Course> coursesList = Arrays.asList(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("Microservices", "Microservices", 97, 22000),
                new Course("FullStack", "FullStack", 96, 25000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 91, 14000),
                new Course("Docker", "Cloud", 90, 20000),
                new Course("Kubernetes", "Cloud", 89, 20000)
        );


       boolean test = coursesList.stream().allMatch(c->c.getReviewScore()>90);
       System.out.println(test); //false;

       test = coursesList.stream().anyMatch(c->c.getReviewScore()<90);
       System.out.println(test);

       test = coursesList.stream().noneMatch(c->c.getReviewScore()<80);
       System.out.println(test);

       Comparator<Course> comparingStudents = Comparator.comparing(Course::getNumberOfStudents);

       Comparator<Course> multipleComparator = Comparator.comparing(Course::getNumberOfStudents)
               .thenComparing(Course::getReviewScore);

       List<Course> sortedList = coursesList.stream().sorted(comparingStudents).collect(Collectors.toList());

        System.out.println("Sorted List");

       for(Course i : sortedList){
           System.out.println(i);
       }

       List<Course> reverseSorted = coursesList.stream().sorted(comparingStudents.reversed()).collect(Collectors.toList());

        System.out.println("Reverse Sorted List");

       for(Course i:reverseSorted){
           System.out.println(i);
       }

       List<Course> multipleComparatorSorted = coursesList.stream().sorted(multipleComparator).collect(Collectors.toList());

        System.out.println("Sorted List with multiple comparators");

       for(Course i: multipleComparatorSorted){
           System.out.println(i);
       }


       List<Course> nextFiveAfterSkipping = coursesList.stream().skip(5).limit(5).collect(Collectors.toList());

        System.out.println("Skip Limit");

       for(Course i : nextFiveAfterSkipping){
           System.out.println(i);
       }


       List<Course> takeWhileList = coursesList.stream().takeWhile(course -> course.getReviewScore()>90).collect(Collectors.toList());

        System.out.println("Take While list");

        takeWhileList.forEach(System.out::println);

        List<Course> dropWhileList = coursesList.stream().dropWhile(course->course.getReviewScore()<90).collect(Collectors.toList());

        System.out.println("Drop while list");

        dropWhileList.forEach(System.out::println);

        Optional<Course> maxCourse = coursesList.stream().max(multipleComparator);

        System.out.println("Maximum course based on multiple comparator");

        System.out.println(maxCourse);

        Optional<Course> minCourse = coursesList.stream().min(multipleComparator);

        System.out.println("Minimum course based on multiple comparator");

        System.out.println(minCourse);


        Optional<Course> firstLowScore = coursesList.stream().filter(course -> course.getReviewScore()<90).findFirst();

        System.out.println("First Low Score");

        System.out.println(firstLowScore);

        Optional<Course> findAnyLowScore = coursesList.stream().filter(course -> course.getReviewScore()>95).findAny();

        System.out.println("Any High Score");

        System.out.println(findAnyLowScore);

        int totalStudents = coursesList.stream().mapToInt(Course::getNumberOfStudents).sum();

        System.out.println("Total Student : "+totalStudents);

        int filteredTotal = coursesList.stream().filter(c->c.getReviewScore()>92).mapToInt(Course::getReviewScore).sum();

        System.out.println("Filtered Total : "+filteredTotal);

        //avg generally results OptionalDouble

        OptionalDouble averageReview = coursesList.stream().mapToInt(Course::getReviewScore).average();

        System.out.println("Average Review : "+ averageReview);

        long countReview = coursesList.stream().filter(course -> course.getReviewScore()>95).mapToInt(Course::getReviewScore).count();

        System.out.println("Number of courses after filtering : " +countReview);

        OptionalInt maxStudents = coursesList.stream().mapToInt(Course::getNumberOfStudents).max();

        System.out.println("Maximum students : "+maxStudents);

        OptionalInt filterAndThenMax = coursesList.stream().filter(course -> course.getReviewScore()<90).mapToInt(Course::getNumberOfStudents).max();

        System.out.println("Maximum students after filtering : " + filterAndThenMax);


        OptionalInt minStudents = coursesList.stream().mapToInt(Course::getNumberOfStudents).min();

        System.out.println("Minimum students : "+minStudents);


        Map<String,List<Course>>  groupByCategory = coursesList.stream().collect(Collectors.groupingBy(Course::getCategory));

        System.out.println("Grouping the courses by category : ");

        for(String k:groupByCategory.keySet()){

            System.out.println(k + " : "+groupByCategory.get(k));

        }


        Map<String,Long> countByCategory = coursesList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting()));

        System.out.println("Grouping and counting");

        for(String k:countByCategory.keySet())
        {
            System.out.println(k +" : "+countByCategory.get(k));
        }



        Map<String, Optional<Course>> groupCategoryAndFindMax = coursesList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore))));

        System.out.println("Grouping Category and Find max in each");

        for (String k: groupCategoryAndFindMax.keySet()){
            System.out.println(k+" : "+ groupCategoryAndFindMax.get(k));

        }



        Map<String,List<String>> groupingAndNameOnly = coursesList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList())));

        System.out.println("Grouping and only names in the list");

        for(String k : groupingAndNameOnly.keySet()){
            System.out.println(k +" : " + groupingAndNameOnly.get(k));
        }






        Map<String, Optional<String>> groupingAndNameOnlyAndMax = coursesList.stream()
                .collect(Collectors.groupingBy(
                        Course::getCategory,
                        Collectors.mapping(
                                course -> course, // Retain the entire course object
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Course::getReviewScore)),
                                        optionalCourse -> optionalCourse.map(Course::getName) // Extract the name
                                )
                        )
                ));


        for(String k : groupingAndNameOnlyAndMax.keySet()){
            System.out.println(k+" : "+groupingAndNameOnlyAndMax.get(k));
        }


        int[] arr = new int[]{1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);
        
        List<Integer> lis = intStream.boxed().collect(Collectors.toList());

    }


}
