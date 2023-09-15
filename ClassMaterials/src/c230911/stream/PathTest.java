package c230911.stream;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void test() { //Path -> 얘는 윈도우랑 맥이 저장하는 경로가 다르면 자동으로 맞춰준다.
		// String path
		Path path = Paths.get("src/c230911/../c230908"); //경로를 지정할 수 있다.
		System.out.println(path.toAbsolutePath().normalize()); //절대경로
		
		File file = new File(path.toString() + "\\Main1.java");
		System.out.println(file.exists());
		try {
//			file.createNewFile();
			file.mkdir(); //폴더 생성 메서드
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
