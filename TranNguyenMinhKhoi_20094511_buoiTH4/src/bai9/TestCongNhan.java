package bai9;

import java.util.Scanner;

public class TestCongNhan {

	public static void main(String[] args) throws Exception{
		CongNhan cn1 = new CongNhan("CN001", "Trần", "Khôi", 200, 0.55);
		System.out.println("Danh sách công nhân:");
		ListCongNhan ls = new ListCongNhan(10);
		ls.themCongNhan(cn1);
		CongNhan cn2 = new CongNhan("CN002", "Trần", "Khang", 100, 0.5);
		CongNhan cn3 = new CongNhan("CN003", "Nguyễn", "Minh", 400, 0.6);
		CongNhan cn4 = new CongNhan("CN004", "Lê", "Nam", 199, 0.5);
		CongNhan cn5 = new CongNhan("CN005", "Lý", "Hà", 600, 0.65);
		ls.themCongNhan(cn2);
		ls.themCongNhan(cn3);
		ls.themCongNhan(cn4);
		ls.themCongNhan(cn5);
		
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getAll()[i].toString());
		}
		
		//Test sắp xếp
		System.out.println("Sắp xếp: ");
		ls.sapXep();
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getAll()[i].toString());
		}
		
		//Test xóa
		System.out.println("Xóa xong:");
		ls.xoa("CN001");
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getAll()[i].toString());
		}
		
		//Test Cập nhật
//		System.out.println("Mã CN: CN111");
//		System.out.println("Cập nhật = 11111111");
//		ls.capNhat("CN111", 11111111);
//		for (int i = 0; i < ls.count; i++) {
//			System.out.println(ls.getAll()[i].toString());
//		}
		
		//Xuất công nhân làm >200 sản phẩm
		System.out.println("Công nhân làm trên 200 sản phẩm: ");
		ls.xuatCongNhanLamNhieuHon200();
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getAll()[i].toString());
		}
	}
}


