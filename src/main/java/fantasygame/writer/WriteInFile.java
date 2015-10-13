package fantasygame.writer;


import fantasygame.hero.Warrior;
import org.apache.log4j.Logger;

import java.io.*;
import java.text.*;
import java.util.*;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class WriteInFile {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());
    private BufferedWriter bf;
    private DateFormat dateFormat = new SimpleDateFormat();
    private Calendar calendar = new GregorianCalendar();

    public void printDateBeginningBattle() {
        LOG.debug("Trying to write date of the beginning battle in the file.");
        try {
            bf = new BufferedWriter(new FileWriter("WriteInTextFile.txt", true));
            bf.newLine();
            bf.newLine();
            bf.write("The new battle begin on: ");
            bf.write(dateFormat.format(calendar.getTime()));
            bf.flush();
            LOG.debug("Recording is completed.");
        } catch (IOException e) {
            e.printStackTrace();
            LOG.warn("IOException " + e.getMessage());
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                    LOG.debug("The thread is closed.");
                }
            } catch (IOException e) {
                LOG.warn("Can`t close thread.");
            }
        }
    }

    public void writeWhichHeroUserChose(Warrior hero) {
        LOG.debug("Trying to write into the file which hero user chose.");
        try {
            bf = new BufferedWriter(new FileWriter("WriteInTextFile.txt", true));
            bf.newLine();
            bf.write("User chose: ");
            bf.write(hero.toString());
            bf.flush();
            LOG.debug("Recording is completed.");
        } catch (IOException e) {
            e.printStackTrace();
            LOG.warn("IOException " + e.getMessage());
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                    LOG.debug("The thread is closed.");
                }
            } catch (IOException e) {
             LOG.warn("Can`t close thread.");
            }
        }
    }


    public void writeListOfHeroes(List<Warrior> warriorList) {
        LOG.debug("Trying to write into the file list of heroes.");
        try {
            bf = new BufferedWriter(new FileWriter("WriteInTextFile.txt", true));
            bf.newLine();
            bf.write("Heroes in the round:\n");
            for (int i = 0; i < warriorList.size(); i++) {
                bf.write(i + ". " + warriorList.get(i).toString());
                bf.newLine();
            }
            LOG.debug("Recording is completed.");
        } catch (IOException e) {
            e.printStackTrace();
            LOG.warn("IOException " + e.getMessage());
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                    LOG.debug("The thread is closed.");
                }
            } catch (IOException e) {
                LOG.warn("Can`t close thread.");
            }
        }
    }

    public void writeWhoChampion(Warrior warrior) {
        LOG.debug("Trying to write into the file who is champion.");
        try {
            bf = new BufferedWriter(new FileWriter("WriteInTextFile.txt", true));
            bf.newLine();
            if (warrior != null) {
                bf.write("The champion is : " + warrior.getName());
                LOG.debug("Recording is completed.");
            } else {
                bf.write("All heroes die.");
                LOG.debug("Recording is completed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            LOG.warn("IOException " + e.getMessage());
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                    LOG.debug("The thread is closed.");
                }
            } catch (IOException e) {
                LOG.warn("Can`t close thread.");
            }
        }
    }
}
