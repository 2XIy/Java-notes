package P0206;
import p.Author;
import p.Triangle;
public class Example4_14 {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(12,-3,6);
        triangle.jisuanmianji();
        triangle.xiugaisanbian(3,4,5);
        triangle.jisuanmianji();
        Author author=new Author();
        author.showAuther();
    }
}
