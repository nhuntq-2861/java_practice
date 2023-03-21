package finalpractice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Data của sinh viên 1
		LearningResult result1sv1 = new LearningResult("Học kỳ 1", 6.5f);
		LearningResult result2sv1 = new LearningResult("Học kỳ 2", 7f);
		List<LearningResult> resutlsv1 = new ArrayList<LearningResult>();
		resutlsv1.add(result1sv1);
		resutlsv1.add(result2sv1);
		SinhVien sv1 = new SinhVienChinhQuy("sv_01", "Nguyễn Quỳnh Anh", "20/11/200", 2021, 8.0f,
				resutlsv1);

		// Data của sinh viên 2
		LearningResult result1sv2 = new LearningResult("Học kỳ 1", 8.5f);
		LearningResult result2sv2 = new LearningResult("Học kỳ 2", 8.5f);
		List<LearningResult> resutlsv2 = new ArrayList<LearningResult>();
		resutlsv2.add(result1sv2);
		resutlsv2.add(result1sv2);
		SinhVien sv2 = new SinhVienTaiChuc("sv_02", "Lê Sao Mai", "16/04/2000", 2021, 9.0f,
				resutlsv2, "Quảng Nam");

		// Data của sinh viên 3
		LearningResult result1sv3 = new LearningResult("Học kỳ 1", 6.5f);
		LearningResult result2sv3 = new LearningResult("Học kỳ 2", 4.5f);
		List<LearningResult> resutlsv3 = new ArrayList<LearningResult>();
		resutlsv3.add(result1sv3);
		resutlsv3.add(result1sv3);
		SinhVien sv3 = new SinhVienTaiChuc("sv_03", "Huỳnh Hiểu Minh", "13/08/2000", 2021, 4.0f,
				resutlsv2, "Quảng Bình");

		// Data của sinh viên 4
		LearningResult result1sv4 = new LearningResult("Học kỳ 1", 7.5f);
		LearningResult result2sv4 = new LearningResult("Học kỳ 2", 8.5f);
		List<LearningResult> resutlsv4 = new ArrayList<LearningResult>();
		resutlsv4.add(result1sv4);
		resutlsv4.add(result2sv4);
		SinhVien sv4 = new SinhVienChinhQuy("sv_04", "Hoàng Ngọc Anh", "01/11/200", 2021, 8.0f,
				resutlsv4);
		
		// Data của Khoa
		List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
		danhSachSinhVien.add(sv1);
		danhSachSinhVien.add(sv2);
		danhSachSinhVien.add(sv3);
		danhSachSinhVien.add(sv4);
		Khoa khoa = new Khoa("Khoa tin học", danhSachSinhVien);
		
		System.out.println("\nDanh sách sinh viên của khoa");
		// Hiển thị thông tin khoa và Danh sách Sinh viên của Khoa
		khoa.hienThiThongTin();
		
		// Xác định tổng số sinh viên chính quy của khoa
		System.out.println("\nTổng số sinh viên chính quy của khoa: " + khoa.countSinhVienChinhQuy());

		System.out.println("\nHiển thị  điểm trung bình của từng sinh viên");
		// Hiển thị điểm trung bình của từng sinh viên
		khoa.getListSinhVien().forEach(sv -> sv.checkDiemTB());

		System.out.println("\nHiển thị Danh sách sinh viên theo loại:");
		// Kiểm tra xem có phải sinh viên chính quy không?
		khoa.getListSinhVien().forEach(sv -> sv.checkLoaiSV());


		System.out.println("\nSinh viên có điểm đầu vào cao nhất");
		// Lấy ra Sinh viên có điểm đầu vào cao nhất
		khoa.sinhVienCoDiemDauVaoCaoNhat().forEach(sv -> sv.hienThiThongTin());
		
	}

}