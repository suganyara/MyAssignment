package javachallenge;

public class LengthofString {

	public static void main(String[] args) {
		 String input="Hello World";
		 String[] split= input.split(" ");
		 for (int i = 0; i < split.length; i++) {
			 if(i==split.length-1) {
				 System.out.println(split[i].length()+ " World");
			 }
			}
String input1= "fly me to the moon";
String[] split1=input1.split(" ");
for (int j = 0; j < split1.length; j++) {
	if (j==split1.length-1) {
		System.out.println(split1[j].length()+ " moon");
	}
}
String input2="luffy is still joyboy";
String[] split2=input2.split(" ");
for (int k = 0; k < split2.length; k++) {
	if (k==split2.length-1) {
		System.out.println(split2[k].length()+ " joyboy");
	}
}
	}
}
