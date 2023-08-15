package LMS.Bai_2;

public class Main {
    public static void main(String[] args) {

        //Hình tròn có bán kính lần lượt là 3.5 và 6.
        StaticMethod.calCircleArea(3.5);
        StaticMethod.calCircleArea(6);

        //Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
        StaticMethod.calTriangleArea(3,4,5);
        StaticMethod.calTriangleArea(4.5,7,6);

        //Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
        StaticMethod.calRectangleArea(2.5,6);
        StaticMethod.calRectangleArea(4,7);
    }
}
