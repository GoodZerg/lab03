public class Rabbit extends Animal implements CanReWrite, CanAppreciate{

    private Book lysolution;

    public void setLysolutionName(Book lysolution) {
        this.lysolution = lysolution;
    }

    public Book getLysolution(){
        return lysolution;
    }

    Rabbit(){
        setName("Кролик");
        lysolution = new Book("Лизорюция", "afd",1);
    }

    @Override
    public void saySomething(){
        System.out.println("Я прочитаю тебе свою новую книгу:\n " + lysolution.getText());
    }

    public void reWrite(){
        lysolution.setPagesNumber(lysolution.getPagesNumber() + 1);
        lysolution.setText(lysolution.getText() + "\nadfsg");
    }

    public BookCharacteristics appreciate() {
        if (lysolution.getPagesNumber() == 1)      return BookCharacteristics.VeryBad;
        else if (lysolution.getPagesNumber() == 2) return BookCharacteristics.Bad;
        else if (lysolution.getPagesNumber() == 3) return BookCharacteristics.Common;
        else if (lysolution.getPagesNumber() == 4) return BookCharacteristics.Good;
        else                                       return BookCharacteristics.VeryGood;

    }
    @Override
    public boolean equals(Object o) {
        Rabbit rabbit = (Rabbit) o;
        return getName() == rabbit.getName() &&
                lysolution.equals(rabbit.getLysolution());
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getLysolution().hashCode();
    }
}
