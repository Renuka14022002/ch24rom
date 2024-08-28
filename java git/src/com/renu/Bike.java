package com.renu;

public class Bike {

        private String[] bikeNames =new String[7];
        private  int index;
        public void store(String name)
        {
            this.bikeNames[this.index]=name;
            this.index++;

        }
        public void display(){
            for(String ref:bikeNames){
                System.out.println(ref);
            }

        }

        public static void main(String[] args) {
            Bike bike = new Bike();
            bike.store("KTM");
            bike.store("RX 135");
            bike.store("MT");
            bike.store("Himalayan");
            bike.store("Duke");
            bike.store("Royal Enfeild");
            bike.store("Yamaha");

            bike.display();


        }}
