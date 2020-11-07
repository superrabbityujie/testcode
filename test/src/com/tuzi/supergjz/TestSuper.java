package com.tuzi.supergjz;

public class TestSuper {

}class A extends B{
public void zx(){
    test();
    super.test();
}
}class B extends C{
    @Override
    public void test() {
        super.test();
    }
}class C{
    public void test(){
        System.out.println("c");
    }
}
