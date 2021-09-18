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

    //alt + insert

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Hành vi - phương thức
    public void  eat(){
        System.out.println("Eat");




    }
}
