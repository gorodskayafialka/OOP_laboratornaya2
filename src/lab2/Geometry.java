package lab2;
/*
Классы Circle, Triangle, Rectangle, Square хранят информацию о круге, треуугольнике, прямоугольнике и
квадрате соответственно. Их методыы вычисляют площадь и периметр сответствующей фигуры. Пользователь
задаёт фигуру, указывая необходимые для вычисления параметры: радиус или стороны(у). Очевидно, эти
параметры должны быть положительны, поэтому для отрицательных значений будет принят их модуль, а нулевые
значения будут по умолчанию заменены на 0.1.
*/

class Circle implements Shape {
    double Radius;

    Circle(double Radius) {
        try {
            if (Radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        catch (IllegalArgumentException e) {
            if (Radius == 0) Radius = 0.1;
            if (Radius < 0) Radius = Radius * (-1);
        }
        finally {
            this.Radius = Radius;
        }
    }

    @java.lang.Override
    public double calcArea() {
        return 3.14 * Math.pow(Radius, 2);
    }

    @java.lang.Override
    public double calcPerimeter() {
        return 2 * 3.14 * Radius;
    }

    @Override
    public String toString() {
        String Info = "окружность с раудиусом " + Radius + "; S = " + calcArea() + ", P = " + calcPerimeter();
        return Info;
    }
}

class Triangle implements Shape {
    double A, B, C;
    Triangle(double A, double B, double C) {
        try {
            if ((A <= 0)||(B <= 0)||(C <= 0))
                throw new IllegalArgumentException("Стороны должны быть положительными");
        }
        catch (IllegalArgumentException e) {
            if (A == 0) A = 0.1;
            if (B == 0) B = 0.1;
            if (C == 0) C = 0.1;
            if (A < 0) A = A * (-1);
            if (B < 0) B = B * (-1);
            if (C < 0) C = C * (-1);
        }
        finally{
            this.A = A;
            this.B = B;
            this.C = C;
        }

    }

    @java.lang.Override
    public double calcArea() {
        double AB, BC, AC;
        double p = calcPerimeter()/2;
        return Math.pow((p*(p-A)*(p-B)*(p-C)),0.5);
    }

    @java.lang.Override
    public double calcPerimeter() {
        return A+B+C;
    }

    @Override
    public String toString() {
        return " треугольник со сторанами " + A + ", " + B + " и " + C + "; S = " + calcArea() + ", P = " + calcPerimeter();
    }
}

class Rectangle implements Shape
{
    double A, B;
    Rectangle(double A, double B)
    {
        try {
            if ((A <= 0)||(B <= 0))
                throw new IllegalArgumentException("Стороны должны быть положительными");
        }
        catch (IllegalArgumentException e) {
            if (A == 0) A = 0.1;
            if (B == 0) B = 0.1;
            if (A < 0) A = A * (-1);
            if (B < 0) B = B * (-1);
        }
        finally
        {
        this.A = A;
        this.B = B;
        }
    }

    @java.lang.Override
    public double calcArea() {
        return A * B;
    }

    @java.lang.Override
    public double calcPerimeter() {
        return 2 * (A + B);
    }

    @Override
    public String toString() {
        return "прямоугольник с длиной " + A +" и  шириной " + B + "; S = " + calcArea() + ", P = " + calcPerimeter();
    }
}

class Square implements Shape
{
    double A;

    Square(double A)
    {
        try {
            if (A <= 0) throw new IllegalArgumentException("Сторона должна быть положительна");
        }
        catch (IllegalArgumentException e) {
            if (A == 0) A = 0.1;
            if (A < 0) A = A * (-1);
        }
        this.A = A;
    }

    @Override
    public double calcArea() {
        return A * A;
    }

    @Override
    public double calcPerimeter() {
        return 4 * A;
    }

    @Override
    public String toString() {
        return "квадрат со стороной " + A + "; S = " + calcArea() + ", P = " + calcPerimeter();
    }
}
