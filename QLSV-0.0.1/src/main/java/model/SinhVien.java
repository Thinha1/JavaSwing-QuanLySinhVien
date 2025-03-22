package model;

public class SinhVien {
	private int maSV;
	private String hoDem;
	private String ten;
	private String gioiTinh;
	private String nganhHoc;
	private float diemTB;
	
	public SinhVien(int maSV, String hoDem, String ten, String gioiTinh, String nganhHoc, float diemTB) {
		this.maSV = maSV;
		this.hoDem = hoDem;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.nganhHoc = nganhHoc;
		this.diemTB = diemTB;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNganhHoc() {
		return nganhHoc;
	}

	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
	
	
}
