package finalpractice2;

import java.util.List;

public class SinhVienTaiChuc extends SinhVien {
	private String noiLienKetDaoTao;

	public SinhVienTaiChuc(String msv, String ten, String ngaySinh, int namNhapHoc, float diemDauVao,
			List<LearningResult> resultList, String noiLienKetDaoTao) {
		super(msv, ten, ngaySinh, namNhapHoc, diemDauVao, resultList);
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Nơi liên kết đào tạo: " + noiLienKetDaoTao);
	}

	public String getNoiLienKetDaoTao() {
		return noiLienKetDaoTao;
	}

	public void setNoiLienKetDaoTao(String noiLienKetDaoTao) {
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

}
