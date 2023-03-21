package finalpractice2;

import java.util.ArrayList;
import java.util.List;

public abstract class SinhVien {
	private String msv;
	private String ten;
	private String ngaySinh;
	private int namNhapHoc;
	private float diemDauVao;
	private List<LearningResult> resultList = new ArrayList<LearningResult>();
	
	public SinhVien(String msv, String ten, String ngaySinh, int namNhapHoc, float diemDauVao,
			List<LearningResult> resultList) {
		this.msv = msv;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.namNhapHoc = namNhapHoc;
		this.diemDauVao = diemDauVao;
		this.resultList = resultList;
	}
	
	// Hiển thị điểm trung bình các kỳ học của sinh viên
	public void checkDiemTB() {
		float sumPoint = 0;
		for (LearningResult LearningResult : resultList) {
			sumPoint += LearningResult.getDiemTrungBinh();
		}
		System.out.println(
				"Điểm trung bình của sinh viên " + this.getTen() + " la: " + sumPoint / resultList.size());
	}
//	Trả về thông tin sinh viên có phải là chính quy hay không?
	public void checkLoaiSV() {
		if (this instanceof SinhVienChinhQuy) {
			System.out.println(this.getTen() + " là sinh viên chính quy");
			return;
		}
		
		if (this instanceof SinhVienTaiChuc) {
			System.out.println(this.getTen() + " là sinh viên tại chức");
			return;
		}

		System.out.println("Chưa thể xác định loại sinh viên");
	}
	
	public void hienThiThongTin() {
		System.out.println("msv: " + msv);
		System.out.println("Tên: " + ten);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Năm nhập học: " + namNhapHoc);
		System.out.println("Điểm đầu vào: " + diemDauVao);
	}
	
	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getNamNhapHoc() {
		return namNhapHoc;
	}

	public void setNamNhapHoc(int namNhapHoc) {
		this.namNhapHoc = namNhapHoc;
	}

	public float getDiemDauVao() {
		return diemDauVao;
	}

	public void setDiemDauVao(float diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public List<LearningResult> getResultList() {
		return resultList;
	}

	public void setResultList(List<LearningResult> resultList) {
		this.resultList = resultList;
	}


	
}
