package com.company;

public class Main {

    public static void main(String[] args) {
         Warrior warrior = new Warrior();
         warrior.setDamage(22);
         warrior.setHealth(100);
         warrior.setSuperpower("Ultra Hit");

         Medic medic = new Medic();
         medic.setDamage(0);
         medic.setHealth(100);
         medic.setSuperpower("Resurrect the Fallen");

         Magic magic = new Magic();
         magic.setDamage(21);
         magic.setHealth(100);
         magic.setSuperpower("Lighting hit");



        Hero[] hero = {warrior, medic, magic};

        for (Hero heroes : hero) {
            heroes.applySuperAbility(heroes.getSuperpower());
        }

    }

}

