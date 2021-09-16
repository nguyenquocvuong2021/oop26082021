public class Cat extends Animal {

    //extends : từ khóa kế thừa giữa class với class
    // alt + enter: gợi ý sửa lỗi

    int width;

    public Cat(int height, String color, int weight, int width) {
        super(height, color, weight);
        this.width = width;
    }

    public void run() {
        System.out.println("Chạy bằng 4 chân");
    }

//    public String info() {
//        return "Thông tin của con Mèo " + "\n" +
//                "Cân năng : " + weight + "\n" +
//                "chiều cao : " + height + "\n" +
//                "Màu lông : " + color + "\n" +
//                "Chiều dài : " + width + "\n";
//

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }
}

      //alt + insert : hiển thị công cự




