
package com.rays.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamStartWithT {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Sona", "Shivanshi", "shivanshi", "Minne", "Minne");

		list.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("S")).distinct().sorted()
				.forEach(System.out::println);

	}
}

//      list.stream(): List ko stream mein convert kiya gaya, jo ek sequence
//      of elements provide karta hai jisme operations perform kar sakte hain.
//		map(): Pehle sabhi elements ko uppercase mein convert karo.
//		filter(): Sirf un elements ko raho jo "S" se shuru hote hain.
//		distinct(): Duplicates ko hata do.
//		sorted() function ka use strings ko alphabetically arrange karne ke liye kiya gaya.
//  	forEach(): Har sorted aur filtered element ko print karo.
