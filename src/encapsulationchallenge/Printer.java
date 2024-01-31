package encapsulationchallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel > 100 || tonerLevel < 0) {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {

        if (duplex) {
            System.out.println("It's a duplex printer");
            int printPages = (pages/2) + (pages % 2);
            pagesPrinted += printPages;
            return printPages;
        }
        pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
