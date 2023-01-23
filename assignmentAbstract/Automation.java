package assignmentAbstract;

public class Automation extends MultipleLanguage implements  Language,TestTool {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void Java() {
	System.out.println("Java");
		
	}

	@Override
	public void ruby() {
	System.out.println("ruby");
	
		
	}

}
