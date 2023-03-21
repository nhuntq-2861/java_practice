package finalpractice2;

import java.util.ArrayList;
import java.util.List;

public class Khoa {
	private String ten;
	private List<SinhVien> listSinhVien;

	public Khoa(String ten, List<SinhVien> listSinhVien) {
		this.ten = ten;
		this.listSinhVien = listSinhVien;
	}

	// tổng số sinh viên chính quy của khoa
	public int countSinhVienChinhQuy() {
		int count = 0;
		for (SinhVien student : this.getListSinhVien()) {
			if (student instanceof SinhVienChinhQuy) {
				count += 1;
			}
		}
		return count;
	}

	// sinh viên có điểm đầu vào cao nhất của khoa
	public List<SinhVien> sinhVienCoDiemDauVaoCaoNhat() {
		Float maxPoint = Float.MIN_VALUE;
		List<SinhVien> listSinhVienCoDiemCaoNhat = new ArrayList<SinhVien>();

		for (SinhVien sinhVien : this.getListSinhVien()) {
			if (maxPoint > sinhVien.getDiemDauVao()) {
				continue;
			}
			if (maxPoint < sinhVien.getDiemDauVao()) {
				listSinhVienCoDiemCaoNhat.clear();
				maxPoint = sinhVien.getDiemDauVao();
			}
			listSinhVienCoDiemCaoNhat.add(sinhVien);
		}

		return listSinhVienCoDiemCaoNhat;
	}

	public void hienThiThongTin() {
		System.out.println("Tên khoa: " + ten);
		listSinhVien.forEach(sv -> sv.hienThiThongTin());
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<SinhVien> getListSinhVien() {
		return listSinhVien;
	}

	public void setListSinhVien(List<SinhVien> listSinhVien) {
		this.listSinhVien = listSinhVien;
	}
}
