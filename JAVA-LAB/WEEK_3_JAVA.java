import java.util.Scanner;

class book {
	String name, author;
	int price, num_pages;
	book (){
		this.name="hi";
		this.author=null;
		this.price=0;
		this.num_pages=0;
		}

	void input (){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name, author, price and number of pages of the book in the given order:");
		this.name = s.next();
		this.author = s.next();
		this.price = s.nextInt();
		this.num_pages = s.nextInt();
		}
	public String toString(){
		return name+ " "+author+" "+price+" "+num_pages;
		}
}

class book_main{
	public static void main(String[] args) {
		int size, choice, x=0;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number of books:");
		size = ss.nextInt();
		book books[] = new book[size];
		for (int i=0; i<size; i++){
			books[i] = new book();
		}

		while (x==0){
		System.out.println("1:Input 2:Display 3:Exit");
		choice = ss.nextInt();
		switch (choice){
			case 1:
				for (int i=0; i<size; i++){
					books[i].input();
				}
				break;

			case 2:
				for (int i=0; i<size; i++){
					System.out.println(books[i]);
				}
				break;

			case 3:x=1;
				break;
			default: System.out.println("Enter a valid input!");	
				break;
		}
	}
}
}
