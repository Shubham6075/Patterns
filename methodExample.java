public class methodExample {
	public void print(){
		System.out.println("Print method without parameters");
	}
	public void print(String name){
		System.out.println("Print method with parameters");
	}

	public static void main(String[] args) {
		methodExample obj1 = new methodExample();
		obj1.print("XX");
		obj1.print();

	}
}
