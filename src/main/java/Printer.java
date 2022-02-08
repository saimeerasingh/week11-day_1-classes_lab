public class Printer {
    private int noOfPapers;
    private int tonerVolume;

    public Printer(int noOfPapers, int tonerVolume){
        this.noOfPapers = noOfPapers;
        this.tonerVolume = tonerVolume;
    }

    public int getPaper(){
        return this.noOfPapers;
    }

//    public int getPrintInfo(int pages, int copies){}


}
