
public class VarArgDemo {
	
		public static void main(String[] args) {
			print(1,2,3);
			print();
			print(1,2,3,4,5);
			print(4,5,6,2,3,1,25,78);
		}
		
		public static void print(int...numbers){
			System.out.println("called print method");
			//System.out.println("First parameter---> "+value);
			for(int number:numbers){
				System.out.print(number+" ");
			}
			System.out.println();
		}

	}


