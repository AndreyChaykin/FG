package choiceheroandattributes;

import exceptions.*;
import geroes.*;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ChoiceHero {

    //todo каждый раз при вызове будут инициализироваться обьккты? в метод? 1000 обьектов
    //todo как обработать исключение если в конструкторе обьекта вызывается метод бросающмй искл?


//        try {
//            Dwarf dwarf = new Dwarf("dwarfName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Elf elf = new Elf("elfName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Knight knight = new Knight("knightName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Magician magician = new Magician("magicianName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Warrior orc = new Orc("orcName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Warrior troll = new Troll("trollName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Warrior centaur = new Centaur("centaurName", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//            Warrior chimera = new Chimera("Chimera", 1000, 22, new ChoiceWeapon().getWeapon(), new ChoiceArmor().getArmor());
//        } catch (ChoiceArmorException e) {
//
//        }

    private boolean dwarfExist = true;  //todo if i can make private static?
    private boolean elfExist = true;
    private boolean knightExist = true;
    private boolean magicianExist = true;
    private boolean orcExist = true;
    private boolean trollExist = true;
    private boolean centaurExist = true;
    private boolean chimeraExist = true;

    public int enterNum() throws EnterNumberException {
        Boolean isDigit1 = true;
        int result;
        while (isDigit1) {
            try {
                result = new Scanner(System.in).nextInt();
                isDigit1 = false;
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter correct value!");
                new ChiefJustice().askingForMakeChoice();
            }
        }
        throw new EnterNumberException("Exception in enterNum method");
    }

    public Warrior getEnteredHero(int number) throws AbsentHeroException {
        Boolean heroExist = true;

        while (heroExist) {
            heroExist = false;
            ChoiceArmor armor = new ChoiceArmor();
            ChoiceWeapon weapon = new ChoiceWeapon();
            try {
                if (number == 1 && dwarfExist) {
                    dwarfExist = false;
                    return new Dwarf("dwarfName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 2 && elfExist) {
                    elfExist = false;
                    return new Elf("elfName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 3 && knightExist) {
                    knightExist = false;
                    return new Knight("knightName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 4 && magicianExist) {
                    magicianExist = false;
                    return new Magician("magicianName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 5 && orcExist) {
                    orcExist = false;
                    return new Orc("orcName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 6 && trollExist) {
                    trollExist = false;
                    return new Troll("trollName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 7 && centaurExist) {
                    centaurExist = false;
                    return new Centaur("centaurName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 8 && chimeraExist) {
                    chimeraExist = false;
                    return new Chimera("Chimera", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else {
                    heroExist = true;
                    if (number > 8) {
                        System.out.println("Please, enter correct number");
                    } else {
                        System.out.println("Such hero already exist. Please, choice another warrior.");
                    }
                    new ChiefJustice().askingForMakeChoice();
                    try {
                        number = enterNum();
                    } catch (EnterNumberException e) {
                        e.printStackTrace();
                    }
                }
            } catch (ChoiceArmorException e) {
                e.printStackTrace();
            } catch (GetWeaponException e) {
                e.printStackTrace();
            }
        }
        throw new AbsentHeroException("Can`t find such hero");
    }

    public Warrior getRandomHero(int number) throws AbsentHeroException {

        Boolean heroExist = true;
        ChoiceArmor armor = new ChoiceArmor();
        ChoiceWeapon weapon = new ChoiceWeapon();

        while (heroExist) {
            heroExist = false;
            try {
                if (number == 0 && dwarfExist) {
                    dwarfExist = false;
                    return new Dwarf("dwarfName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 1 && elfExist) {
                    elfExist = false;
                    return new Elf("elfName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 2 && knightExist) {
                    knightExist = false;
                    return new Knight("knightName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 3 && magicianExist) {
                    magicianExist = false;
                    return new Magician("magicianName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 4 && orcExist) {
                    orcExist = false;
                    return new Orc("orcName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 5 && trollExist) {
                    trollExist = false;
                    return new Troll("trollName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 6 && centaurExist) {
                    centaurExist = false;
                    return new Centaur("centaurName", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else if (number == 7 && chimeraExist) {
                    chimeraExist = false;
                    return new Chimera("Chimera", 1000, 22, weapon.getWeapon(weapon.getRandNum()), armor.getArmor(armor.getRandNum()));
                } else {
                    heroExist = true;
                    number = getHeroNumber();
                }
            } catch (ChoiceArmorException e) {
                e.printStackTrace();
            } catch (GetWeaponException e) {
                e.printStackTrace();
            }
        }
        throw new AbsentHeroException("Can`t make random hero choice.");
    }

    public int getHeroNumber() {
        return new Random().nextInt(8);
    }
}

