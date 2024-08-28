package com.renu;

public class City {
        private String[] cityNames = new String[7];
        private int index;

        public void store(String Name)
        {
            this.cityNames[this.index] = Name;
            this.index++;
        }
        public void display()
        {
            for(String ref : cityNames)
            {
                System.out.println(ref);
            }
        }
        public static void main(String[] args)
        {
            City city = new City();
            city.store("Banglore");
            city.store ("Mysore");
            city.store ("Shimogga");
            city.store ("Udpi");
            city.store("Mangalore");
            city.store("Koppa");
            city.store("Chikkamagaluru");

            city.display();
}
    }

