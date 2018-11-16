import java.util.function.*;
class f {
    static interface IntToIntFunction extends IntUnaryOperator {
    }
    static public void main(String[] arg) {
        IntToIntFunction add1   =  x ->  1 + x;
        IntToIntFunction add10  =  x ->  10 + x;
        IntToIntFunction add1_10_v1 = x -> add10.applyAsInt(add1.applyAsInt(x)) ;
        IntToIntFunction add1_10_v2 = x -> add1.compose(add10).applyAsInt(x);
        //IntToIntFunction add1_10_v3 = add1.compose(add10);

        System.out.println("hi: " + add1.applyAsInt(3));
        System.out.println("hi: " + add10.applyAsInt(3));
        System.out.println("hi: " + add1_10_v1.applyAsInt(3));
        System.out.println("hi: " + add1_10_v2.applyAsInt(3));
    }
}
