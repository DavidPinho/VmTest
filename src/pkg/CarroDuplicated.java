package pkg;

public class CarroDuplicated{

  private String cor;
  private int year;
  
  public String getCor(){
    return this.cor;
  }

public void dupliMethod(){
  for (int i=0; i<10; i++) {
	if (i==1)
	  System.out.println(i);

	if (i==2) {
	  System.out.println(i);
	} else {
	  System.out.println("10");
	}
  }
}

}
