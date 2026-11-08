package com.hillel.newone;

public class Main {
    public static void main(String[] args) {
        Liste L = new Liste();
        Node drei = new Node(); //ein neues Knoten-Objekt im Speicher, drei → [ data=0 | next=null ]
        drei.data = 3;          //drei → [ 3 | null ]
        Node fuenf = new Node(); //ein neues knoten objekt im speicher, fünf
        fuenf.data = 5;

        drei.next = fuenf;
        L.head = drei;

        L.ausgeben();
        L.einfuegeAmAnfang(9);
        L.ausgeben();
    }
}
