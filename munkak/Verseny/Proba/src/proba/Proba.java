package proba;

import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Proba {

    private static int ugyesseg, eletero, szerencse, jatekosTamadoero, aktivElet;
    private static int kocka1, kocka2, dobasokEredmeny;
    private static int tamadoEro;
    private static String jatekosNev, terentmenynev;
    private static int terentmenyUgyesseg, terentmenyEletero, TerentmenyTamadoero;
    private static String cim, szoveg;
    private static int msgTipus, optTipus, gomb;
    private static boolean befejeztemAJatekot;

    public static void main(String[] args) {
        befejeztemAJatekot = true;
        jatekMenet();

    }

    private static void Feladatleiras() {
        cim = "Feladatleírás";
        msgTipus = JOptionPane.DEFAULT_OPTION;
        szoveg = "  Egy versenyre nevezel, aminek a lényege, hogy át kell kelni a halállabirintuson.\n"
                + " A labirintusban tárgyakat találhatsz és szörnyekkel kell harcoljál.";
//        JOptionPane.showMessageDialog(null, szoveg, cim, msgTipus);
        infoKiiras();

    }

    private static void Kalandlap() {
        // Itt tároljuk a játékos adatait    
        UgyesegSzam();
        EleteroSzam();
        SzerencseSzam();
    }

    private static void KalandlapKiiras() {
        cim = "A játékos képességei";
        szoveg = "Ügyesség: " + ugyesseg + "\nÉleterő: " + eletero + "\nSzerencse: " + szerencse;
        infoKiiras();
    }

    private static void Lapok() {
        ElsoOldal();
//        OtvenHatodikO();
//        HatvanhatO();
//        SzazharminchetO();
//        KettotizenotO();
//        KettohetvenO();
//        Kettokilencvenharom();
//        Haromhetvenharom();
//        Haromnyolcvanhet();

    }

    private static void KockaDobas() {
        kocka1 = (int) (Math.random() * 6) + 1;
        kocka2 = (int) (Math.random() * 6) + 1;
        dobasokEredmeny = kocka1 + kocka2;

    }

    private static void UgyesegSzam() {
        KockaDobas();
        ugyesseg = kocka1 + 6;
        //System.out.println(ugyesseg);
    }

    private static void EleteroSzam() {
        KockaDobas();
        eletero = dobasokEredmeny + 12;
        //System.out.println(eletero);

    }

    private static void SzerencseSzam() {
        KockaDobas();
        szerencse = kocka1 + 6;
        //System.out.println(szerencse);
    }

    private static void infoKiiras() {
        JOptionPane.showMessageDialog(null, szoveg, cim, msgTipus);
    }

    private static void ElsoOldal() {
        cim = "Első kör: 1. oldal";
        szoveg = "Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll.\n"
                + " Hat doboz van rajta, egyikükre a te neved festették.\n"
                + " Ha ki akarod nyitni a dobozt, lapozz a 270-re.(jobb)\n"
                + " Ha inkább tovább haladsz észak felé, lapozz a 66-ra.(bal)";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            HatvanhatO();
        } else {
            KettohetvenO();
        }
        //Utvalasztas();

    }

    private static void ValasztoKiiratas() {
        msgTipus = JOptionPane.YES_NO_OPTION;
        optTipus = JOptionPane.INFORMATION_MESSAGE;
        Object[] jobBal = {"Bal", "Jobb"};
        Icon icon = new ImageIcon("src/harc.jpg");
        gomb = JOptionPane.showOptionDialog(null, szoveg, cim, optTipus, msgTipus, icon, jobBal, msgTipus);

    }

    private static void OtvenHatodikO() {
        cim = "56. oldal";
        szoveg = "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy."
                + "\nMegérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373-ra. "
                + "\nHa ketté akarod vágni a kardoddal, lapozz a 215-re.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            Haromhetvenharom();
        } else {
            KettotizenotO();
        }
    }

    private static void HatvanhatO() {
        cim = "66. oldal";
        szoveg = "Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban."
                + "\nEgy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók.\n"
                + " Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, \n"
                + "hogy keletnek megy.Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            Kettokilencvenharom();
        } else {
            OtvenHatodikO();
        }
    }

    private static void SzazharminchetO() {
        cim = "137. oldal";
        szoveg = "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            Haromnyolcvanhet();
        } else {
            Haromnyolcvanhet();
        }

    }

    private static void KettotizenotO() {
        cim = "215. oldal";
        szoveg = "Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. "
                + "\nSűrű barna spórafelhő csap ki a golyóból, és körülvesz. "
                + "\nNémelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. "
                + "\nNagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. "
                + "\nVadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            Haromnyolcvanhet();
        } else {
            Haromnyolcvanhet();
        }
    }

    private static void KettohetvenO() {
        cim = "270. oldal";
        szoveg = "A doboz teteje könnyedén nyílik. "
                + "\nBenne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. "
                + "\nElőbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - "
                + "\n\t„Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. "
                + "\n\tMost azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.”"
                + "\n Az aláírás Szukumvit. Megjegyzed a tanácsot, apró darabokra téped a pergament, és tovább mész észak felé.\n"
                + " Lapozz a 66-ra.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            HatvanhatO();
        }
    }

    private static void Kettokilencvenharom() {
        cim = "293. oldal";
        szoveg = "A három pár nedves lábnyomot követve az alagút nyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. "
                + "\nHa továbbmész nyugat felé a lábnyomokat követve, lapozz a 137-re. "
                + "\nHa inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            SzazharminchetO();
        } else {
            Haromnyolcvanhet();
        }
    }

    private static void Haromhetvenharom() {
        cim = "373. oldal";
        szoveg = "Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. "
                + "\nNehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. "
                + "\nMegkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.";
        ValasztoKiiratas();
        if (gomb == JOptionPane.YES_OPTION) {
            Haromnyolcvanhet();
        } else {
            Haromnyolcvanhet();
        }
    }

    private static void Haromnyolcvanhet() {
        cim = "387. oldal";
        szoveg = "Hallod, hogy elölről súlyos lépések közelednek. "
                + "\nEgy széles, állatbőrökbe öltözött, kőbaltás, primitív lény lép elő. "
                + "\nAhogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. "
                + "\nElőhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.";
        ValasztoKiiratas();
        HarcUzenet();
        Harc();
        jatekosHalott();
        UjraKezdes();
    }
    
    private static void jatekosHalott() {
        if(aktivElet <= 0){
            UjraKezdes();
        }
    }

    private static void UjraKezdes() {
        cim = "Játék vége";
        szoveg = "Újrakezdés?";
        Object[] jobBal = {"Újra", "Befejeztem"};
        Icon icon = new ImageIcon("src/harc.jpg");
        gomb = JOptionPane.showOptionDialog(null, szoveg, cim, optTipus, msgTipus, icon, jobBal, msgTipus);
        
        if (gomb == JOptionPane.YES_OPTION) {
            ElsoOldal();
        } else {
            befejeztemAJatekot = false;
        }

        
    }

    private static void Harc() {
        terentmenynev = "Barlangi Ember";
        terentmenyUgyesseg = 10;
        terentmenyEletero = 7;
        aktivElet = eletero;
        TerentmenyTamadoero();
        JatekosTamadoero();

        while (terentmenyEletero > 0 && aktivElet > 0) {
            TerentmenyTamadoero();
            JatekosTamadoero();
            if (jatekosTamadoero > TerentmenyTamadoero) {
                terentmenyEletero = terentmenyEletero - 2;
            } else if (jatekosTamadoero < TerentmenyTamadoero) {
                aktivElet = aktivElet - 2;
            }
            HarcEredmenye();
        }

    }

    private static void TerentmenyTamadoero() {
        KockaDobas();
        TerentmenyTamadoero = dobasokEredmeny + terentmenyUgyesseg;
    }

    private static void JatekosTamadoero() {
        KockaDobas();
        jatekosTamadoero = dobasokEredmeny + ugyesseg;
    }

    private static void HarcUzenet() {
        cim = "HARC";
        msgTipus = JOptionPane.DEFAULT_OPTION;
        szoveg = "Hacolj az Életedért!";

        infoKiiras();

    }

    private static void HarcEredmenye() {
        cim = "HARC";
        msgTipus = JOptionPane.DEFAULT_OPTION;
        szoveg = "Életerőd: " + aktivElet
                + "\n Terentemeny életereje: " + terentmenyEletero;
        infoKiiras();

    }

//    private static void Utvalasztas() {
//        if (gomb == JOptionPane.YES_OPTION) {
//            HatvanhatO();
//        } else {
//            KettohetvenO();
//        }
//    }

    private static void jatekMenet() {
        while (befejeztemAJatekot == true) {
            Feladatleiras();
            Kalandlap();
            KalandlapKiiras();            
            /*Nevbekeres();*/
            Lapok();
        }

        cim = "Játék vége!";
        JOptionPane.showMessageDialog(null, "Köszönjük a játékot!", cim, msgTipus);
    }

    

}
