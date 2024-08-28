package com.renu.inheritence;

import com.renu.inheritence.Halwa;
import com.renu.inheritence.Owner;
import com.renu.inheritence.Name;

    public class Runner {

        public static void main(String[] args) {

            Name name = new Name();
            name.type="carrot halwa";
            name.cost=89;
            name.color="orange";
            name.display();

            Owner owner = new Name();
            owner.type="abc";
            owner.cost=39;
            owner.color="red";
            owner.display();

            Halwa halwa = new Owner();
            halwa.type="xyz";
            halwa.cost=90;
            halwa.color="yellow";
            halwa.display();



}
    }

}
