package com.example.demo.cmm.utl;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.service.CommonMapper;

@Component
public class Util {
	@Autowired CommonMapper mapper;
	public static Consumer<String> print = System.out :: println;
	public static Function<Object, String> string = String :: valueOf;
	public static Function<String, Integer> integer = Integer :: valueOf;
	public static BiPredicate<String, String> equals = String :: equals;
	public static BiFunction<Integer, Integer, Integer> random =(t,u)->(int)(Math.random()*(u-t))+t;
	public static Function<Integer, int[]> intArr = int[] :: new;
	public static Supplier<LocalDate> today = () -> LocalDate.now();
	public static Supplier<LocalTime> time = () -> LocalTime.now();
	public static BiFunction<String,String,File> mkDir = File::new;
	public static BiFunction<File,String, File> mkFile = File::new;
}
