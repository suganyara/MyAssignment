package Assignment1;

public class RemoveDuplicate {

	public static void main(String s []) {
String text = "We learn java basics as part of java sessions in java week1";        
int count=0;
String  temp="";
String[] split = text.split(" ");
        for (int i = 0; i < split.length; i++) {
        //we
            for (int j = i+1; j < split.length; j++)
            {
                if(split[i].equals(split[j])) {
                    temp=split[i];
                    count+=1;
            
                }}}
	}}
        
      
           
  