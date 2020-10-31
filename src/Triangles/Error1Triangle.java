package Triangles;
//Error1Triangle
public class Error1Triangle {
    int a;
    int b;
    int c;

    public Error1Triangle(int var1, int var2, int var3) throws InvalidTriangleException {
        this.a = var1;
        this.b = var2;
        this.c = var3;
        int var4 = (var1 + var2 + var3) / 2;
        boolean var5 = var1 == 0 || var2 == 0 || var3 == 0 || var1 < 0 || var2 < 0 || var3 < 0 || var4 <= var1 || var4 <= var2 || var4 <= var3;
        if (var5) {
            throw new InvalidTriangleException();
        }
    }

    public boolean isScalene() {
        return this.a != this.b && this.a != this.c && this.b != this.c;
    }

    public boolean isIsosceles() {
        return this.a == this.b || this.a == this.c || this.b == this.c;
    }

    public boolean isEquilateral() {
        return this.a == this.b && this.b == this.c && !this.isIsosceles();
    }
}

