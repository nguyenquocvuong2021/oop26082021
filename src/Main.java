import java.security.PrivateKey;

public class Main {

    public static void main(String[] args) {


        //class & object
        //1. Class là lớp
        //2/ Object là đối tượng
        //class (đại diện cho một tập thể) -> Object (đại diện cho một cá thể)
        //Exp: Person nguyenVanTeo = new person ()
        // khởi tạo object
        //kieudulieu tenbien

        //ctrl + space : gợi ý code
        // ctrl + p : xem tham số truyền vào
//        Animal cat = new Animal(1, "gray", 3);
//        cat.eat();
//        System.out.println("Cân năng" + cat.weight);
//        System.out.println("Cân năng" + cat.height);
//        System.out.println("Cân năng" + cat.color);

       Cat cat = new Cat( 1, "gray", 3, 2);
       String info = cat.toString();
       System.out.println(info);


        // access modifier: phạm vi hoạt động
        // public , private , protected
        // 4 phạm vi
        // 1 - Trong class
        // 2 - ngoài class và không bởi lớp con
        // 3 - ngoài package bởi lớp con
        // 4 - trong package

        //́́́́́16.09/2021
        //Tính chất
        //Tính kế thừa
        //Tính đa hình
        //Tính trườu tượng
        //Tính đóng gói  (access modifier)


    }

    //1: access modifier
    //2 : giá trả về sau khi phước thức xử lý xong
    //3. Tên phương thức
    // void : là kiểu dữ liệu đặc biệt không cần trả về


    //1   2  3 => Phương thức tính tổng
    private static int tinhTong(int a , int b){
        int result = a + b;
        return result;

    }

    public void xuly(){
        int ketQua = tinhTong(5,10);
        System.out.println(ketQua);
    }
    public void run(){
        System.out.println(" chạy bằng 4 chân");
    }





}
