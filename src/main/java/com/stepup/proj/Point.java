package com.stepup.proj;

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Точка координат состоящая из 2-х = " + "{" + x + ";" + y + "}";
    }

}

class Point3D extends Point{
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Точка координат состоящая из 3-х = " + "{" + x + ";" + y + ";" + z + "}";
    }
}
