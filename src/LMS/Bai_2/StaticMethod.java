package LMS.Bai_2;

public class StaticMethod {
    static float PI = 3.14f;
    static void calCircleArea(double R){
        double circleArea = Math.pow(R,2)*PI;
        System.out.printf("Dien tich Hinh tron (R: %2.1f): %3.2f \n",R,circleArea);
    }
    static void calRectangleArea(double width,double height){
 double rectangleArea = width*height;
        System.out.printf("Dien tich hinh chu nhat(%3.1f, %3.1f): %3.2f \n",width,height,rectangleArea);

    }
    static  void calTriangleArea(double a, double b, double c){
        double perimeter = (a+b+c)/2;
        double triangArea = Math.sqrt((perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c)));
        System.out.printf("Dien tich hinh tam giac (%4.1f , %4.1f , %4.1f): %3.2f \n",a,b,c,triangArea);
    }
}
