public class Cop extends Human {

    private int rank;

    public Cop(){
        System.out.println("I'm a Cop!");
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Cop withRank(int rank){
        this.rank = rank;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "I'm a good Cop";
    }
}
