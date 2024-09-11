package bai9;

import java.text.NumberFormat;
import java.util.Locale;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private double soSP;
	private double donGia;
	
	
	//đóng gói
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) throws Exception {
		if (maCN != null) {
			this.maCN = maCN;
		}else {
			throw new Exception("Lỗi! Mã công nhân không được rỗng!");
		}
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) throws Exception {
		if (mHo != null) {
			this.mHo = mHo;
		}else {
			throw new Exception("Lỗi! Họ công nhân không được rỗng!");
		}
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) throws Exception {
		if (mTen != null) {
			this.mTen = mTen;
		}else {
			throw new Exception("Lỗi! Tên công nhân không được rỗng!");
		}
	}
	public double getSoSP() {
		return soSP;
	}
	public void setSoSP(double soSP) throws Exception {
		if (soSP >= 0) {
			this.soSP = soSP;
		}else {
			throw new Exception("Lỗi! Số sản phẩm phải >=0");
		}
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) throws Exception {
		if (donGia > 0) {
			this.donGia = donGia;
		}else {
			throw new Exception("Lỗi! Đơn giá phải > 0");
		}
	}
	public CongNhan(String maCN, String mHo, String mTen, double soSP, double d) throws Exception {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		if (soSP >= 0) {
			this.soSP = soSP;
		}else {
			throw new Exception("Lỗi! Số sản phẩm phải >=0");
		}
		this.donGia = d;
	}
	
	//phương thức
	public double getTinhLuong() {
		double l = 0;
		l = getSoSP()*getDonGia();
		return l;
	}
	
	//from tiền tệ Việt Nam
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mã công nhân: " + maCN + ", Họ công nhân: " + mHo + ", Tên công nhân: " + mTen + ", Số sản phẩm: " + soSP + 
				", Đơn giá: " + donGia + ", Tiền lương: " + nf.format(getTinhLuong()) + "1";
	}
}
