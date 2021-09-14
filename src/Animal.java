public class Animal {
    // tính chất - thuộc tính (properties)
    String color;
    int height;
    int weight;

    // constructor (Phương thức khởi tạo)
    public Animal(int height , String color , int weight) {
        this.height = height;
        this.color = color;
        this.weight = weight;
    }

    //Hành vi - phương thức
    public void  eat(){
        System.out.println("Eat");

    }
}
