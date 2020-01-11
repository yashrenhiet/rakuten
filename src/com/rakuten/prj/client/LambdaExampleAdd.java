package com.rakuten.prj.client;

import java.util.function.BiFunction;

public class LambdaExampleAdd {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (Integer t, Integer u) -> {
			return t + u;
		};

		System.out.println(f.apply(5, 5));
		BiFunction<Integer, Integer, Integer> f2 = (t, u) -> t * u;

		System.out.println(f2.apply(2, 6));
	}

}
