package com.leetcode.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzSolution {
	/*
	 * write a program to print the string, if the number is multiple of 3 then
	 * print Fizz, if the number is multiple of 5 then pring Buzz, if the number is
	 * multiple of 3 and 5 then print FizzBuzz, if the number is not multiple of any
	 * of the above then print number as it is
	 */
	public static void main(String[] args) {
		System.out.println(new FizzBuzzSolution().fizzBuzz(5));
	}

	public List<String> fizzBuzz(Integer n) {
		List<String> resultList = new ArrayList<String>();

		IntStream.rangeClosed(1, n).forEach(index -> {
			if (index % 5 == 0 && index % 3 == 0) {
				resultList.add("FizzBuzz");
			} else if (index % 3 == 0) {
				resultList.add("Fizz");
			} else if (index % 5 == 0) {
				resultList.add("Buzz");
			} else {
				resultList.add(Integer.toString(index));
			}
		});

		return resultList;
	}
}
