import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book1> list=new ArrayList<Book1>();
		
		Book1 b1=new Book1(101,"Let us c","yashwant kanetkar","bpb",8);

		Book1 b2=new Book1(101,"data communication","foeouzen","Mc grawl",6);

		Book1 b3=new Book1(102,"Let us c","yashwant kanetkar","bpb",7);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for (Book1 b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}
