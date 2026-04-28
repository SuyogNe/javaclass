// Base class
class SevenWonders {
    void location() {
        System.out.println("Location of the wonder");
    }

    void famousFor() {
        System.out.println("Famous for something special");
    }
}

// Subclasses
class GreatWall extends SevenWonders {
    void location() {
        System.out.println("China");
    }

    void famousFor() {
        System.out.println("Longest wall built for protection");
    }
}

class Petra extends SevenWonders {
    void location() {
        System.out.println("Jordan");
    }

    void famousFor() {
        System.out.println("Rock-cut architecture");
    }
}

class ChristRedeemer extends SevenWonders {
    void location() {
        System.out.println("Brazil");
    }

    void famousFor() {
        System.out.println("Statue of Jesus Christ");
    }
}

class MachuPicchu extends SevenWonders {
    void location() {
        System.out.println("Peru");
    }

    void famousFor() {
        System.out.println("Ancient Incan city");
    }
}

class ChichenItza extends SevenWonders {
    void location() {
        System.out.println("Mexico");
    }

    void famousFor() {
        System.out.println("Mayan pyramid (El Castillo)");
    }
}

class Colosseum extends SevenWonders {
    void location() {
        System.out.println("Italy");
    }

    void famousFor() {
        System.out.println("Ancient Roman amphitheatre");
    }
}

class TajMahal extends SevenWonders {
    void location() {
        System.out.println("India");
    }

    void famousFor() {
        System.out.println("White marble mausoleum");
    }
}

// Main class
class Main {
    public static void main(String args[]) {

        SevenWonders A = new GreatWall();
        SevenWonders M = new Petra();

        SevenWonders Mu = new ChristRedeemer();
        SevenWonders G = new MachuPicchu();

        SevenWonders C = new ChichenItza();
        SevenWonders Co = new Colosseum();
        SevenWonders T = new TajMahal();

        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();

        C.location();
        C.famousFor();

        Co.location();
        Co.famousFor();

        T.location();
        T.famousFor();
    }
}