package bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCongNhan {
	private List<CongNhan> danhSachCongNhan;
	public int count;
	CongNhan[] ls;
	public ListCongNhan(int n) {
		ls = new CongNhan[n];
		count = 0;
	}
	
	//Tăng kích thước mảng
	public void tangKT() {
		CongNhan[] tam = new CongNhan[ls.length*2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls = tam;
	}
	
	public boolean themCongNhan(CongNhan cn) {
		if (count == ls.length) {
			tangKT();
		}
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaCN().equalsIgnoreCase(cn.getMaCN())) {
				return false;
			}
		}
		ls[count]=cn;
		count++;
		return true;	
	}
	
	//Xóa CN
		public boolean xoa(String maXoa) {
			int viTri = -1;
			for (int i = 0; i < count; i++) {
				if(ls[i].getMaCN().equalsIgnoreCase(maXoa)) {
					viTri = i;
				}
			}
			if (viTri != -1) {
				for (int i = 0; i < count-1; i++)
					ls[i] = ls[i+1];
					count--;
					return true;
				} else {
					return false;
				}
			}
			
	
		//cập nhật CN
			public boolean capNhat(String ma, double sp) throws Exception {
				int viTri = -1;
				for (int i = 0; i < count; i++) {
					if (ls[i].getMaCN().equalsIgnoreCase(ma)) {
						viTri = i;
					}
				}
				if (viTri != -1) {
					ls[viTri].setSoSP(sp);
					return true;
				}else {
					return false;
				}
		}
			
			// Phương thức xuất thông tin các công nhân làm >200 sản phẩm
		    public void xuatCongNhanLamNhieuHon200() {
		        System.out.println("Danh sách công nhân làm hơn 200 sản phẩm:");
		        for (CongNhan cn : ls) {
		            if (cn.getSoSP() > 200) {
		                System.out.println(cn);
		            }
		        }
		    }
			
			//sắp xếp
		    public void sapXep() {
				for (int i = 0; i < count; i++) {
					for (int j = 0; j < count-1; j++) {
						if (ls[i].getSoSP()>0) {
							CongNhan tam = ls[i];
							ls[i] = ls[j];
							ls[j] = tam;	
						}
					}
				}
			}
			//in ra kết quả
//		    public void inDanhSachCongNhan() {
//		        for (CongNhan cn : danhSachCongNhan) {
//		            System.out.println(cn);
//		        }
//		    }
		    public CongNhan[] getAll() {
				return ls;
			}
	
//	private List<CongNhan> danhSachCongNhan;
//
//    // Constructor khởi tạo danh sách công nhân với số lượng n phần tử
//    public ListCongNhan(int n) {
//        danhSachCongNhan = new ArrayList<>(n);
//    }
//
//    // Thêm công nhân vào danh sách
//    public void themCongNhan(CongNhan congNhan) {
//        if (congNhan != null && danhSachCongNhan.size() < danhSachCongNhan.size()) {
//            danhSachCongNhan.add(congNhan);
//        }
//    }
//
//    // Xóa công nhân khỏi danh sách theo mã công nhân
//    public boolean xoaCongNhan(String maCN) {
//        for (CongNhan cn : danhSachCongNhan) {
//            if (cn.getMaCN().equals(maCN)) {
//                danhSachCongNhan.remove(cn);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Cập nhật công nhân theo mã công nhân
//    public boolean capNhatCongNhan(String maCN, CongNhan congNhanMoi) {
//        if (congNhanMoi != null && congNhanMoi.getMaCN().equals(maCN)) {
//            for (int i = 0; i < danhSachCongNhan.size(); i++) {
//                if (danhSachCongNhan.get(i).getMaCN().equals(maCN)) {
//                    danhSachCongNhan.set(i, congNhanMoi);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//
//    // Xuất thông tin các công nhân làm trên 200 sản phẩm
//    public void xuatCongNhanLamTren200() {
//        System.out.println("Danh sách công nhân làm trên 200 sản phẩm:");
//        for (CongNhan cn : danhSachCongNhan) {
//            if (cn.getSoSP() > 200) {
//                System.out.println(cn);
//            }
//        }
//    }
//
//    // Sắp xếp công nhân theo số sản phẩm giảm dần
//    public void sapXepCongNhanTheoSoSP() {
//        Collections.sort(danhSachCongNhan, new Comparator<CongNhan>() {
//            @Override
//            public int compare(CongNhan cn1, CongNhan cn2) {
//                return Double.compare(cn2.getSoSP(), cn1.getSoSP());
//            }
//        });
//    }
//    
//
//    // Xuất toàn bộ thông tin công nhân
//    public ListCongNhan xuatDanhSachCongNhan() {
//        for (CongNhan cn : danhSachCongNhan) {
//            System.out.println(cn);
//        }
//		return null;
//    }
}
