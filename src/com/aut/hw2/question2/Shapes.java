package com.aut.hw2.question2;

public class Shapes {

    public class Triangle {
        private double firstSide;
        private double secondSide;
        private double thirdSide;
        private double anglefands;
        private double anglefandt;
        private double anglesandt;
        Triangle triangle = new Triangle();

        private void motasaviolazla() {
            if (firstSide == secondSide && firstSide == thirdSide) System.out.println("Yes");
            else System.out.println("No");
        }

        private void motasiosagheyn() {
            if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide)
                System.out.println("motasaviosagheyn");
        }

        private void triangleIdentifier() {
            if (firstSide != secondSide) System.out.println("mokhtalefolazla");
            motasaviolazla();
            motasiosagheyn();
        }

        public void setTriangle(Triangle triangle) {
            this.triangle = triangle;
        }

        private double trianglePerimeter() {
            double perimeter = firstSide + secondSide + thirdSide;
            return perimeter;

        }

        private double triangleSpace() {

            double space = ((1 / 2) * firstSide * secondSide * Math.sin(anglefands);
            return space;
        }

        public double getFirstSide() {
            return firstSide;
        }

        public void setFirstSide(float firstSide) {
            this.firstSide = firstSide;
        }

        public double getSecondSide() {
            return secondSide;
        }

        public void setSecondSide(float secondSide) {
            this.secondSide = secondSide;
        }

        public double getThirdSide() {
            return thirdSide;
        }

        public void setThirdSide(float thirdSide) {
            this.thirdSide = thirdSide;
        }

        public double getAnglefands() {
            return anglefands;
        }

        public void setAnglefands(float anglefands) {
            this.anglefands = anglefands;
        }

        public double getAnglefandt() {
            return anglefandt;
        }

        public void setAnglefandt(float anglefandt) {
            this.anglefandt = anglefandt;
        }

        public double getAnglesandt() {
            return anglesandt;
        }

        public void setAnglesandt(float anglesandt) {
            this.anglesandt = anglesandt;
        }
    }

    public class Circle {
        private static final float PI = 3.14159f;
        private int centerX;
        private int centerY;
        private float radius;
        Circle circle = new Circle();

        public void setCircle(Circle circle) {
            this.circle = circle;
        }

        private double circlePerimeter() {
            float perimeter = (2 * PI * radius);
            return perimeter;

        }

        private double circleSpace() {
            double space = (double) (PI * Math.pow(radius, 2));
            return space;
        }
    }

    public class Rectangle {
        private double firstside;
        private double secondside;
        Rectangle rectangle = new Rectangle();

        public void setRectangle(Rectangle rectangle) {
            this.rectangle = rectangle;
        }

        private void identifier(Rectangle rect, Square squa) {

        }

        private double rectanglePerimeter() {
            double perimeter = 2 * (firstside + secondside);
            return perimeter;
        }

        private double rectangleSpace() {
            double space = firstside * secondside;
            return space;
        }
    }


    public class Square {
        public double side;
        Square square = new Square();

        public void setSquare(Square square) {
            this.square = square;
        }


        private double diameterIdentifier() {
            double diameter = Math.pow(2, 1 / 2) * side;
            return diameter;
        }

        private double squarePerimeter() {
            double perimeter = 4 * side;
            return perimeter;
        }

        private double squareSpace() {
            double space = Math.pow(side, 2);
            return space;
        }
    }

    public static void main(String[] args) {

    }
}
