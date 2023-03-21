package finalpractice2;

public class LearningResult {
	private String tenHocKy;
	private float diemTrungBinh;

	public LearningResult(String tenHocKy, float diemTrungBinh) {
		this.tenHocKy = tenHocKy;
		this.diemTrungBinh = diemTrungBinh;
	}

	public void hienThiThongTin() {
		System.out.println("Ten Hoc Ky: " + tenHocKy);
		System.out.println("Diem trung binh: " + diemTrungBinh);
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

}
