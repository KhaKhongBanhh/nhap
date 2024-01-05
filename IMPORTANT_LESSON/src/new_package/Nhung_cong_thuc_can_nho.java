package new_package;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Nhung_cong_thuc_can_nho {
	public static void main(String args[]) {
		
		System.out.println("Đây là cách viết dấu \" ");
		System.out.println(Integer.MAX_VALUE);
		
		float khoi_tao_bien_float = 2.3f;	// Luôn luôn phải có f trong float
		final int hang_so = 1;				// Thêm final để có hằng số
		
		Scanner sc = new Scanner(System.in);
		
		kiem_tra_loi();
		time();
		math_library();
		random_number();
		char_in_java();
	}
	
	
	public static void kiem_tra_loi() {
		int a = 10;
		int b = 0;
		
		try {
			int c = a /b;
			System.out.println(c);
		}catch(ArithmeticException e) {		// Cái này là tập con của Exception
			System.out.println("Lỗi toán học !!");
			e.printStackTrace();			// Nếu nó bắt được lỗi này, thì nó sẽ dừng lại
		}catch (Exception e) {
			System.out.println("có lỗi !!");
			e.printStackTrace();
		}finally {							// Có lỗi hay không có lỗi đều phải thực hiện
			System.out.println("Kết thúc kiểm tra !!");
		}
	}
	
	
	public static void time() {
		Calendar cal = Calendar.getInstance();	// Phương thức gọi hàm calendar
		
		int nam = cal.get(Calendar.YEAR);		// Cú pháp lấy ngày, tháng, năm
		cal.set(Calendar.DAY_OF_MONTH, 12);		// Cú pháp đặt ngày, tháng, năm
		
		SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a"); 
			// Cần khai báo thư viện java.text.SimpleDateFormat;
		String formattedDate = dinhDang.format(cal.getTime());
			// Chuyển đổi thành chuỗi định dạng dd/MM/yyyy
		System.out.println(formattedDate);
	}
	
	
	public static void math_library() {
		int a = 5, b =3;
		
		Math.abs(a);
		Math.max(a, b);
		Math.min(a, b);
		Math.sqrt(a);
		Math.pow(a, b);
		Math.sin(a);
	}
	
	
	public static void random_number() {
		// Khai báo thư viện java.util.Random;
		Random rd = new Random();
		int ngauNhien = rd.nextInt(0,100);
		double ngauNhienSoThuc = rd.nextDouble(0.100);
		
	}
	
	
	public static void char_in_java() {
		char kitu = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		String day = sc.nextLine();		// Muốn gán dữ liệu cho kí tự từ bàn phím phải thông qua string
		kitu = day.charAt(0);
		char kitu1 = 'a';
		
		int so_sanh = Character.compare(kitu, kitu1);	// So sánh 2 kí tự, trả về 1 số nguyên
		boolean check;
		check = Character.isDigit(kitu1);				// Hàm kiểm tra có phải số không
		check = Character.isLetter(kitu1);				// Hàm kiểm tra có phải kí tự không
		check = Character.isWhitespace(kitu1);			// Hàm kiểm tra có phải dấu space không
		check = Character.isLowerCase(kitu1);			// Hàm kiểm tra có phải in thường không
		check = Character.isUpperCase(kitu1);			// Hàm kiểm tra có phải in hoa không
	}
}
