package ConceptProgramLangHomework2;

import java.util.ArrayList;

//Zaki Khalid Abu Qaoud 20172106
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ 
//20172106
public class Testing {

	public static void main(String[] args){
		//Object1 Test addAtBegin and addAtEnd
		MyList fruits = new MyList();
		fruits.addAtBegin("Banana");
		fruits.addAtBegin("Apple");
		fruits.addAtEnd("orange");
		System.out.println(fruits.toString());
		System.out.println(fruits.length);
		System.out.println("////////////////////////////");
		//object2 test addAtBegin and addAtEnd
		MyList numbers = new MyList();
		numbers.addAtBegin("two");
		numbers.addAtBegin("one");
		numbers.addAtEnd(18);
		numbers.addAtBegin(0);
		System.out.println(numbers.toString());
		System.out.println(numbers.length);
		System.out.println("////////////////////////////");
		//object 3 test deleteUsingLoop
		MyList vegetaple = new MyList();
		vegetaple.addAtBegin("Tomato");
		System.out.println(vegetaple.toString());
		System.out.println(vegetaple.length);
		vegetaple.deleteUsingLoop("Tomato");
		System.out.println(vegetaple.toString());
		System.out.println(vegetaple.length);
		vegetaple.addAtBegin("Tomato");
		vegetaple.addAtBegin("Potato");
		vegetaple.addAtBegin("Carrots");
		System.out.println(vegetaple.toString());
		System.out.println(vegetaple.length);
		vegetaple.deleteUsingLoop("Tomato");
		vegetaple.deleteUsingLoop("Carrots");
		System.out.println(vegetaple.toString());
		System.out.println(vegetaple.length);
		System.out.println("////////////////////////////");
		//object 4 test delete
		MyList anime = new MyList();
		anime.addAtEnd("Attack");
		anime.addAtEnd("DemonSlayer");
		anime.addAtBegin("DragonBall");
		System.out.println(anime.toString());
		System.out.println(anime.length);
		anime.delete(2);
		System.out.println(anime.toString());
		System.out.println(anime.length);
		System.out.println("////////////////////////////");
		//object 5 and 6 test intersection
		MyList menNames = new MyList();
		menNames.addAtEnd("Nahed");
		menNames.addAtEnd("Mohammed");
		menNames.addAtEnd("Noor");
		menNames.addAtEnd("Ahmed");
		menNames.addAtEnd("Rayan");
		MyList womenNames = new MyList();
		womenNames.addAtEnd("Noor");
		womenNames.addAtEnd("Sara");
		womenNames.addAtEnd("Rayan");
		womenNames.addAtEnd("Yasmeen");
		womenNames.addAtEnd("Nahed");
		ArrayList<String> intersection = menNames.intersection(womenNames);
		System.out.println("intersection is : ");
		for(int i=0;i<intersection.size();i++){
			System.out.print(intersection.get(i) + "\t");
		}
		System.out.println("\n////////////////////////////");
		//Object 7 test deleteUsingRecursion method
		MyList animals = new MyList();
		animals.addAtBegin("lion");
		animals.addAtEnd("tiger");
		animals.addAtEnd("cat");
		animals.addAtEnd("dog");
		animals.addAtEnd("cow");
		animals.addAtEnd("fox");
		System.out.println(animals.toString());
		System.out.println(animals.length);
		animals.deleteUsingRecursion("lion");
		animals.deleteUsingRecursion("dog");
		animals.deleteUsingRecursion("fox");
		System.out.println(animals.toString());
		System.out.println(animals.length);
		System.out.println("////////////////////////////");
		
		
	}
}
