package new_package;

import java.util.Scanner;

public class String_trong_java {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String xau1 = "Hello World";
		
		String a = "Xin chào";
		String b = "Tôi là người Việt";
		
		StringBuilder sb = new StringBuilder();		// Đây là một lớp chuyên làm việc với string
			// Sau khi gọi lớp StringBuilder, sb lập tức trở thành 1 lớp
			// LƯU Ý QUAN TRỌNG : Nếu muốn lớp StringBuilder phục vụ xau1 thì ta cần
			// 		StringBuilder sb = new StringBuilder(xau1);
			//	-> Chèn xau1 vào trong ngoặc
		
		sb.append("Hello");							// Cú pháp thêm 1 string mới
		sb.insert(2, "xin chào");					// Cú pháp chèn 1 string vào vị trí index
		sb.delete(0, 0);							// Cú pháp xóa từ vị trí start đến end-1
		sb.deleteCharAt(0);
		
		
		sb.indexOf(xau1);							// Kiểm tra vị trí xuất hiện đầu tiên của kí tự
		sb.lastIndexOf(xau1);						// Kiểm tra vị trí xuất hiện cuối cùng
		sb.substring(0);							// Lấy một chuỗi con từ một chuỗi dài hơn
		sb.substring(0, 0);
		
		xau1.contains("Hello");
		xau1 = a.replace("Hello", "Xin chào");		// Thay thế toàn bộ (giá trị xâu a chuyển toàn 
		xau1 = b.replaceFirst(b, a);				//  bộ sang xau1 và thay thế all
		xau1 = a.trim();							// Xóa toàn bộ khoảng trắng ở đầu và ở cuối
		
	}
}
