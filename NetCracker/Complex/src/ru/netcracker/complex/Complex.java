package ru.netcracker.complex;



public  class Complex {
    private double real;
    private double image;

    public Complex(double a, double i){
        this.real = a;
        this.image = i;
    }
    Complex(double a ){
        this.real=a;
        this.image=0;
    }
    public  Complex add( Complex b){

        this.image+=b.image;
        this.real+=b.real;
        return this;
    }
    public  Complex sub( Complex b){

        this.real-=b.real;
        this.image-=b.image;
        return this;
    }
    public  Complex mult( Complex b){

        this.real=this.real*b.real-this.image*b.image;
        this.image=this.image*b.real+this.real*b.image;
        return this;
    }
    public  String print(Complex a){

        return Integer.toString((int)a.real) + " " + Integer.toString((int) a.image)+ "i";
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }

        if (obj.getClass() != this.getClass()){
            return  false;
        }
        final Complex other= (Complex) obj;
        if (this.real!=other.real){
            return false;
        }
        return this.image == other.image;
    }
}
