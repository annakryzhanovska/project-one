package com.hillel.newone;

public class Liste {
    Node head;
    void einfuegeAmAnfang(int w){
        Node knoten = new Node(); //Ein neuer, leerer Knoten entsteht. Die Variable knoten zeigt darauf, das objekt haben wir schon allgemein
        //knoten → [ data=0 | next=null ]
        //head   → [3] → [5] → null


        knoten.data = w;       // den wert reinschreiben, zb 9
        //knoten → [ 9 | null ]
        //head   → [3] → [5] → null

        knoten.next = head;     // den head setzen Lies das als: „Der neue Knoten soll dorthin zeigen, wohin head gerade zeigt.“
                                // head zeigt auf die 3, also zeigt jetzt auch knoten.next auf die 3.
        //knoten → [ 9 | ● ]
        //                ↓
        //head   →       [3] → [5] → null

        head = knoten;
        //Lies das als: „head soll dorthin zeigen, wohin knoten zeigt.“
        //knoten zeigt auf die 9, also zeigt head jetzt auch auf die 9.
        //head → [9] → [3] → [5] → null

    }

    //Die Methode gibt die Liste auf der Konsole aus, damit du siehst, was drin ist. Ohne sie würdest du beim Ausführen nichts sehen.
    //Node k = head	Ein Laufzeiger k startet beim ersten Knoten.
    //k != null	Solange k noch auf einen Knoten zeigt, weitermachen.
    //k = k.next	Nach jedem Durchlauf einen Knoten weiterspringen.

    void ausgeben(){
        for (Node k = head; k != null; k = k.next) System.out.println(k.data + "->");
        System.out.println("null");
    }


}