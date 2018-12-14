package com.hk2t;

public class mylistrun {
    public static void main(String[] args) {
        mylisttest<Integer> elements = new mylisttest<Integer>();
        System.out.println("Truoc khi nhap du lieu vao:");
        elements.printList();

        elements.add(2);
        elements.add(4);
        elements.add(6);
        elements.add(8);
        elements.add(10);
        elements.add(12);
        elements.add(14);
        elements.add(16);
        elements.add(18);
        elements.add(20);

        System.out.println("Sau khi nhap du lieu vao:");
        elements.printList();
        elements.size();

        elements.add(22);
        System.out.println("Sau khi them phan tu thu 10:");
        elements.printList();

        elements.remove(5);
        System.out.println("Xoa phan tu co chi so 5:");
        elements.printList();
        System.out.println(Integer.toString(elements.size()));
    }
}
