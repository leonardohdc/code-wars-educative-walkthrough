package exercises8Kyu;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
      return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
    }
}
