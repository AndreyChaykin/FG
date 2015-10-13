package fantasygame.choiceheroandattributes;

import fantasygame.exceptions.*;
import fantasygame.hero.*;
import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ChoiceHero implements RandomChoice {

    private static boolean dwarfExist = true;
    private static boolean elfExist = true;
    private static boolean knightExist = true;
    private static boolean magicianExist = true;
    private static boolean orcExist = true;
    private static boolean trollExist = true;
    private static boolean centaurExist = true;
    private static boolean chimeraExist = true;
    private static final Logger LOG = Logger.getLogger(ChoiceHero.class);

    //todo scanner close    --  its probably to close here scanner
    public int enterNumber() throws EnterNumberException {
        Boolean isDigit1 = true;
        int result;
        LOG.debug("Trying to get entered number from user.");
        while (isDigit1) {
            try {
                result = new Scanner(System.in).nextInt();
                isDigit1 = false;
                LOG.debug("Return entered number.");
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter correct value!");
                new ChiefJustice().askingForMakeChoice();
                LOG.debug("Asking user for re-enter number");
            }
        }
        LOG.warn("Throw EnterNumberException: \"Exception in enterNumber method\"");
        throw new EnterNumberException("Exception in enterNumber method");
    }

    public Warrior getHero(int number) throws AbsentHeroException {
        Boolean heroExist = true;
        LOG.debug("Trying to get hero.");

        while (heroExist) {
            heroExist = false;
            ChoiceArmor armor = new ChoiceArmor();
            ChoiceWeapon weapon = new ChoiceWeapon();
            try {
                if (number == 1 && dwarfExist) {
                    LOG.debug("Get Dwarf");
                    dwarfExist = false;
                    return new Dwarf("Tirgolf", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 2 && elfExist) {
                    LOG.debug("Get Elf");
                    elfExist = false;
                    return new Elf("Eelisee Si ", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 3 && knightExist) {
                    LOG.debug("Get Knight");
                    knightExist = false;
                    return new Knight("John Backsword", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 4 && magicianExist) {
                    LOG.debug("Get Magician");
                    magicianExist = false;
                    return new Magician("Rion", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 5 && orcExist) {
                    LOG.debug("Get Orc");
                    orcExist = false;
                    return new Orc("Volg", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 6 && trollExist) {
                    LOG.debug("Get Troll");
                    trollExist = false;
                    return new Troll("Tee", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 7 && centaurExist) {
                    LOG.debug("Get Centaur");
                    centaurExist = false;
                    return new Centaur("Amadeus", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 8 && chimeraExist) {
                    LOG.debug("Get Chimera");
                    chimeraExist = false;
                    return new Chimera("Woorth", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else {
                    heroExist = true;
                    if (number > 8) {
                        System.out.println("Please, enter correct number");
                        LOG.debug("Asking for enter correct number");
                    } else {
                        System.out.println("Such hero already exist. Please, choose another warrior.");
                        LOG.debug("Asking for choose another warrior");
                    }
                    new ChiefJustice().askingForMakeChoice();
                    try {
                        LOG.debug("Getting new number for choice hero.");
                        number = enterNumber();
                    } catch (EnterNumberException e) {
                        e.printStackTrace();
                    }
                }
            } catch (ChoiceArmorException e) {
                //todo in exceptions also must be logs? (in catch resources)
                e.printStackTrace();
            } catch (GetWeaponException e) {
                e.printStackTrace();
            }
        }
        LOG.warn("AbsentHeroException: \"Can`t find such hero\"");
        throw new AbsentHeroException("Can`t find such hero");
    }

    public Warrior getRandomHero(int number) throws AbsentHeroException {
        Boolean heroExist = true;
        LOG.debug("Trying to get random hero.");

        while (heroExist) {
            heroExist = false;
            ChoiceArmor armor = new ChoiceArmor();
            ChoiceWeapon weapon = new ChoiceWeapon();
            try {
                if (number == 1 && dwarfExist) {
                    LOG.debug("Get Dwarf");
                    dwarfExist = false;
                    return new Dwarf("Tirgolf", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 2 && elfExist) {
                    LOG.debug("Get Elf");
                    elfExist = false;
                    return new Elf("Eelisee Si ", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 3 && knightExist) {
                    LOG.debug("Get Knight");
                    knightExist = false;
                    return new Knight("John Backsword", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 4 && magicianExist) {
                    LOG.debug("Get Magician");
                    magicianExist = false;
                    return new Magician("Rion", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 5 && orcExist) {
                    LOG.debug("Get Orc");
                    orcExist = false;
                    return new Orc("Volg", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 6 && trollExist) {
                    LOG.debug("Get Troll");
                    trollExist = false;
                    return new Troll("Tee", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 7 && centaurExist) {
                    LOG.debug("Get Centaur");
                    centaurExist = false;
                    return new Centaur("Amadeus", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 8 && chimeraExist) {
                    LOG.debug("Get Chimera");
                    chimeraExist = false;
                    return new Chimera("Woorth", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else {  //todo cant remove circle
                    heroExist = true;
                    number = getRandomChoice();
                    LOG.debug("Getting new random number.");
                }
            } catch (ChoiceArmorException e) {
                e.printStackTrace();
            } catch (GetWeaponException e) {
                e.printStackTrace();
            }
        }
        LOG.warn("AbsentHeroException: \"Can`t find such hero\"");
        throw new AbsentHeroException("Can`t find such hero");
    }

    public int getRandomChoice() {
        LOG.debug("Getting random number.");
        return new Random().nextInt(9);
    }
}

