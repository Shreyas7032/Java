package SLL;

public class SLL_Main {
	public static void main(String[] args) {
		Singly s=new Singly();
		s.insert_at_front(12);
		s.insert_at_front(14);
		s.display();
		s.inser_at_end(10);
		s.display();
		s.insert_at_middle(8, 2);
		s.display();
//		s.delete_from_front();
//		s.display();
//		s.delete_at_end();
//		s.display();
//		s.delete_from_middle(3);
//		s.display();
		s.find_Max();
		s.find_Min();
		s.count_Nodes();
	}

}
