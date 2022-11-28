package org.example.DataGenerator;

import java.util.Random;

public class NameGenerator {

    public String RandomUpper(String name){
        name=name.toLowerCase();
        char[] arr= name.toCharArray();
        Random rnd = new Random();
        for(int i=0;i<=name.length()/2;i++){
            int index = rnd.nextInt(name.length());
            arr[index]=Character.toUpperCase(arr[index]);
        }
        String str = new String(arr);
        return str;
    };
    public String NameGen(){
        String[] lastName={"An","Banh","Bui","Bach","Cao","Chu","Chung","Chau","Chu","Diep","Doan","Duong","Duu","Giang","Hoang","Huynh","Ha","Han","Ho","Kim","Kieu","La","Lieu","Lam","Le","Ly","Luu","Luong","Mai","Ma","Mac","Mach","Nghiem","Nguyen","Ngo","Phan","Phung","Pham","Quach","Thai","Than","Thach","Trieu","Truong","Tran","Trinh","To","Ta","Tong","Vo","Van","Vinh","Vu","Vuong","Dinh","Dao","Dang","Do"};
        String[] middleNameMale ={"Ba","Bach","Binh","Cao","Chien","Chi","Chinh","Chan","Cong","Cuong","Canh","Danh","Dung","Duong","Hieu","Hiep","Huy","Hao","Hoa","Hung","Ho","Huu","Khoi","Khai","Khac","Kien","Long","Luong","Lac","Lap","Manh","Nam","Nghia","Nhan","Nhat","Phu","Phuc","Phuoc","Quang","Quyet","Quy","Quang","Quoc","Sy","Thieu","Thuan","Thanh","Thang","Thuong","The","Thinh","Thong","Thu","Tien","Tieu","Toan","Trieu","Trung","Tri","Truong","Trong","Tuan","Tai","Tan","Ton","Ta","Tat","Tu","Uy","Vinh","Viet","Vien","Van","Vuong","Van","An","Dinh","Dang","Dai","Dat","Dac","Dinh","Duc"};
        String[] middleNameFemale={"Bich","Bang","Bach","Boi","Chi","Cam","Diem","Diep","Dieu","Duyen","Da","Giang","Hien","Hoa","Hoan","Huyen","Hue","Huong","Ha","Hanh","Hao","Khue","Khuc","Kha","Kiet","Kieu","Ky","Lan","Linh","Loan","Ly","Le","Luu","Mai","Mong","My","Nghi","Nguyet","Ngan","Nha","Phuong","Que","Quynh","San","Suong","Thi","Thu","Thy","Thuy","Thuong","Thao","Thuc","Trang","Tra","Tram","Tran","Truc","Tuyet","Tue","Tu","Tinh","To","Uyen","Vi","Vy","Yen","Ai","Anh","Doan","Dai","Y","Dan"};
        String[] firstNameMale ={"Bach","Bac","Bang","Buu","Canh","Cao","Chinh","Chien","Chieu","Chuyen","Chinh","Chuong","Chan","Cung","Cong","Co","Cuong","Canh","Can","Danh","Doanh","Du","Duy","Duyet","Due","Dan","Dung","Gia","Giap","Hieu","Hien","Hiep","Hoang","Hoan","Hoat","Huy","Huan","Huynh","Hanh","Hao","Han","Hung","Hoi","Huu","Kha","Khang","Khiem","Khoa","Khuong","Khai","Kien","Kiet","Ky","Lai","Liem","Long","Luan","Luan","Luat","Lan","Linh","Luong","Lap","Le","Loc","Loi","Mien","Manh","Nam","Nghiem","Nghiep","Nghia","Nghi","Ngon","Ngan","Nhan","Nhat","Nhat","Ninh","Phi","Phat","Phu","Quang","Quyet","Quyen","Quy","Quang","Quoc","Sinh","Sieu","Sang","Son","Sy","Thien","Thuyet","Thuan","Thanh","Thai","Thong","Thach","Thang","The","Thinh","Tho","Thong","Thuy","Tien","Toan","Triet","Trieu","Trung","Trac","Trang","Trinh","Tri","Truong","Trong","Tru","Tuan","Tai","Tan","Tin","Tung","Tan","Tu","Uy","Vinh","Vien","Viet","Vo","Van","Vi","Vinh","Vu","Vuong","Vinh","Dien","Doan","Dinh","Don","Dong","Dang","Dai","Dao","Dat","Dinh","Duc","An"};
        String[] firstNameFemale={"Bich","Bang","Chi","Chieu","Cuc","Cam","Dao","Diem","Diep","Dung","Duyen","Giao","Hoa","Hoan","Huyen","Hue","Han","Huong","Ha","Hang","Khai","Khuyen","Khue","Kieu","Lam","Lan","Lien","Lieu","Loan","Ly","Le","Mai","Mi","My","Man","Nga","Nghi","Nguyet","Ngan","Nhi","Nhung","Nhan","Nha","Nhu","Nuong","Nu","Oanh","Phuong","Quyen","Que","Sa","Suong","Thi","Thoa","Thu","Thuy","Tho","Thu","Thuong","Thao","Tham","Thuc","Tien","Trang","Trinh","Tra","Tram","Tran","Truc","Tuyen","Tuyet","Tuyen","Uyen","Vi","Vy","Van","Xuyen","Xuan","Yen","Ai","Anh","Doan","Dai","Dao","Duong","Y","Dan","Diep","Phung","Ngoc","Tu"};
        String name="";
        Random rnd = new Random();
        boolean gender = rnd.nextBoolean();
        //System.out.println(gender);
        int i = rnd.nextInt(lastName.length);
        name+=lastName[i];
        if(gender)
        {
            i= rnd.nextInt(middleNameMale.length);
            name=name + " "+ middleNameMale[i];
            i=rnd.nextInt(firstNameMale.length);
            name=name+" "+firstNameMale[i];
        }
        else {
            i= rnd.nextInt(middleNameFemale.length);
            name=name + " "+ middleNameFemale[i];
            i=rnd.nextInt(firstNameFemale.length);
            name=name+" "+firstNameFemale[i];
        }
        name = RandomUpper(name);
        return name;
    }


    public static void main(String args[]){
        NameGenerator ng = new NameGenerator();
        System.out.println(ng.NameGen());
    }
}
