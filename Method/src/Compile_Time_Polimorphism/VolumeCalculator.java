package Compile_Time_Polimorphism;

//🔷 Ek class banaiye: VolumeCalculator
//📦 Method overloading ka use karke teen method banaiye:
//
//volume(int side) → cube ka volume (side × side × side)
//
//volume(int l, int b, int h) → cuboid ka volume (l × b × h)
//
//volume(double radius) → sphere ka volume ((4/3) × π × r³)
//
//        🖊️ main() method mein teenon method ko call karke output print kariye.

public class VolumeCalculator {

    void volume(int side) {
        System.out.println("cube: " + (side*side*side));
    }
    void volume(int x, int y, int z) {
        System.out.println("cuboid: " + (x*y*z));
    }
    void volume(double radius) {
        System.out.println("sphere: " + (4.0/3.0)*Math.PI*radius*radius*radius);
    }

    public static void main(String[] args) {
        VolumeCalculator cac = new VolumeCalculator();
        cac.volume(3,3,3);
        cac.volume(1,2,3);
        cac.volume(4,7,8);
    }
}
