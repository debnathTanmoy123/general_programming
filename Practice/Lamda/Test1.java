package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {
public static void main(String[] args) {
	List<String> name=Arrays.asList("Mango","Orange","Banana","Apple","Apple2","Apple3");
	Predicate<String> p=(s)->s.startsWith("A");
	for (String st : name) {
		if (p.test(st)) {
			System.out.println(st);
		}
	}
}
}
