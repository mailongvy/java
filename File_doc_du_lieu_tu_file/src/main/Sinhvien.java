package main;

import java.io.Serializable;
import java.util.Scanner;

public class Sinhvien implements Comparable<Sinhvien>, Serializable {
	private String Masinhvien;
	private	String hoVaten;
	private int namsinh;
	private double diemtrungbinh;
	public Sinhvien(String masinhvien, String hoVaten, int namsinh, double diemtrungbinh) {
		this.Masinhvien = masinhvien;
		this.hoVaten = hoVaten;
		this.namsinh = namsinh;
		this.diemtrungbinh = diemtrungbinh;
	}
	
	
	
	
	public Sinhvien() {
		GetInformation();
	}




	public String getMasinhvien() {
		return Masinhvien;
	}
	public void setMasinhvien(String masinhvien) {
		Masinhvien = masinhvien;
	}
	public String getHoVaten() {
		return hoVaten;
	}
	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	
	public void GetInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		this.Masinhvien = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap ho va ten sinh vien: ");
		this.hoVaten = sc.nextLine();
		sc.nextLine();
		System.out.println("Moi nhap nam sinh cho sinh vien: ");
		this.namsinh = sc.nextInt();
		System.out.println("Moi ban nhap diem cho sinh vien");
		this.diemtrungbinh = sc.nextDouble();
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "[Masinhvien = " + Masinhvien + ", hoVaten = " + hoVaten + ", namsinh = " + namsinh
				+ ", diemtrungbinh = " + diemtrungbinh + "]";
	}




	@Override
	public int compareTo(Sinhvien o) {
		// TODO Auto-generated method stub
		return (int)this.diemtrungbinh - (int)o.diemtrungbinh;
	}
	

	
	
}
