package com.renu;

public class Sweet {

        private  String[] sweetNames = new String[7];
        private int index;

        public void store(String Name)
        {
            this.sweetNames[this.index] = Name;
            this.index++;
        }

        public void display()
        {
            for(String ref : sweetNames)
            {
                System.out.println(ref);
            }
        }

        public static void main(String[] args) {

            Sweet sweet = new Sweet();
            sweet.store("Laddu");
            sweet.store("Gulab jamun");
            sweet.store("Peda");
            sweet.store("Rasgulla");
            sweet.store("Champakali");
            sweet.store("Barfi");
            sweet.store("Kajuu");

            sweet.display();
}
    }


