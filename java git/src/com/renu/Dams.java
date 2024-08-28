package com.renu;

public class Dams {

        private String[] damNames = new String[7];
        private int index;

        public void store(String Name)
        {
            this.damNames[this.index] = Name;
            this.index++;
        }

        public void display()
        {
            for (String ref : damNames)
            {
                System.out.println(ref);
            }
        }

        public static void main(String[] args)
        {
            Dams dam = new Dams();
            dam.store("BRP");
            dam.store("TungaBadra");
            dam.store("Linganamakki");
            dam.store("Supa");
            dam.store("varahi");
            dam.store("Gajnuru");
            dam.store("Theerthalli");

            dam.display();
}
    }
