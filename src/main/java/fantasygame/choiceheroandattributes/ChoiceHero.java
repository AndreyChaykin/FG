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

    //todo scanner close    --  its difficult to close here scanner
    public int enterNumber() throws EnterNumberException {
        Boolean isDigit1 = true;
        int result;
        if (LOG.isDebugEnabled()) {
            LOG.debug("Trying to get entered number from user.");
        }
        while (isDigit1) {
            try {
                result = new Scanner(System.in).nextInt();
                isDigit1 = false;
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Return entered number " + result);
                }
                return result;
            } catch (InputMismatchException e) {
                LOG.error("User type incorrect value, ", e);
                System.out.println("Please, enter correct value!");
                new ChiefJustice().askingForMakeChoice();
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Asking user for re-enter number");
                }
            }
        }
        LOG.error("Throw EnterNumberException: \"Exception in enterNumber method\"");
        throw new EnterNumberException("Exception in enterNumber method");
    }

    public Warrior getHero(int number) throws AbsentHeroException {
        Boolean heroExist = true;
        if (LOG.isDebugEnabled()) {
            LOG.debug("Trying to get hero by number " + number);
        }

        while (heroExist) {
            heroExist = false;
            ChoiceArmor armor = new ChoiceArmor();
            ChoiceWeapon weapon = new ChoiceWeapon();
            try {
                if (number == 1 && dwarfExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Dwarf");
                    }
                    dwarfExist = false;
                    return new Dwarf("Tirgolf", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 2 && elfExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Elf");
                    }
                    elfExist = false;
                    return new Elf("Eelisee Si ", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 3 && knightExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Knight");
                    }
                    knightExist = false;
                    return new Knight("John Backsword", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 4 && magicianExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Magician");
                    }
                    magicianExist = false;
                    return new Magician("Rion", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 5 && orcExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Orc");
                    }
                    orcExist = false;
                    return new Orc("Volg", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 6 && trollExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Troll");
                    }
                    trollExist = false;
                    return new Troll("Tee", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 7 && centaurExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Centaur");
                    }
                    centaurExist = false;
                    return new Centaur("Amadeus", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 8 && chimeraExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Chimera");
                    }
                    chimeraExist = false;
                    return new Chimera("Woorth", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else {
                    heroExist = true;
                    if (number > 8) {
                        System.out.println("Please, enter correct number.");
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("Number > 8, asking for enter correct number.");
                        }
                    } else {
                        System.out.println("Such hero already exist. Please, choose another warrior.");
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("Such hero already exist. Asking for choose another warrior.");
                        }
                    }
                    new ChiefJustice().askingForMakeChoice();
                    try {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("Getting new number from user.");
                        }
                        number = enterNumber();
                    } catch (EnterNumberException e) {
                        LOG.error("EnterNumberHeroException, ", e);
                        e.printStackTrace();
                    }
                }
            } catch (ChoiceArmorException e) {
                LOG.error("ChoiceArmourException, ", e);
                e.printStackTrace();
            } catch (GetWeaponException e) {
                LOG.error("GetWeaponException, ", e);
                e.printStackTrace();
            }
        }
        LOG.warn("AbsentHeroException: \"Can`t find such hero\"");
        throw new AbsentHeroException("Can`t find such hero");
    }

    public Warrior getRandomHero(int number) throws AbsentHeroException {
        Boolean heroExist = true;
        if (LOG.isDebugEnabled()) {
            LOG.debug("Trying to get random hero by number " + number);
        }

        while (heroExist) {
            heroExist = false;
            ChoiceArmor armor = new ChoiceArmor();
            ChoiceWeapon weapon = new ChoiceWeapon();
            try {
                if (number == 1 && dwarfExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Dwarf");
                    }
                    dwarfExist = false;
                    return new Dwarf("Tirgolf", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 2 && elfExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Elf");
                    }
                    elfExist = false;
                    return new Elf("Eelisee Si ", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 3 && knightExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Knight");
                    }
                    knightExist = false;
                    return new Knight("John Backsword", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 4 && magicianExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Magician");
                    }
                    magicianExist = false;
                    return new Magician("Rion", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 5 && orcExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Orc");
                    }
                    orcExist = false;
                    return new Orc("Volg", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 6 && trollExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Troll");
                    }
                    trollExist = false;
                    return new Troll("Tee", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 7 && centaurExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Centaur");
                    }
                    centaurExist = false;
                    return new Centaur("Amadeus", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else if (number == 8 && chimeraExist) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Return Chimera");
                    }
                    chimeraExist = false;
                    return new Chimera("Woorth", 1000, 22, weapon.getWeapon(weapon.getRandomChoice()), armor.getArmor(armor.getRandomChoice()));
                } else {  //todo cant remove circle
                    heroExist = true;
                    number = getRandomChoice();
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Getting new random number.");
                    }
                }
            } catch (ChoiceArmorException e) {
                LOG.error("ChoiceArmourException, ", e);
                e.printStackTrace();
            } catch (GetWeaponException e) {
                LOG.error("GetWeaponException, ", e);
                e.printStackTrace();
            }
        }
        LOG.warn("AbsentHeroException: \"Can`t find such hero\"");
        throw new AbsentHeroException("Can`t find such hero");
    }

    public int getRandomChoice() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Getting random number.");
        }
        return new Random().nextInt(9);
    }
}

