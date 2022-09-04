package flowControl;

public class LoopsDemo1 {
	public static void main(String[] args) {
		for(int i=1, j=1; i<10 && j<10 ;i++,j++) {
			j++;
			System.out.println(i +"\t"+j);
		}
	}
}
