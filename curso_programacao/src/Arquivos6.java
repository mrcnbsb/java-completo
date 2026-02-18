import java.io.File;
import java.util.Scanner;

public class Arquivos6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter a file path: ");
//		String strPath = sc.nextLine();
		String strPath = "c:\\temp\\in.txt";
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); //pega o nome e despreza o caminho
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		System.out.println("getParentFile: " + path.getParentFile());
		
		sc.close();		
	}
}