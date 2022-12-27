import java.util.Random;
public class Rabbit extends Animal {

    private final Book lysolution;

    public Book getLysolution(){
        return lysolution;
    }

    Rabbit(){
        setName("Кролик");
        class BookActionComponent implements CanReWrite, CanAppreciate{
            private static Random rand = new Random();
            public void reWrite(){
                lysolution.setText("");
                lysolution.setPagesNumber(rand.nextInt(10));
                for (int i = 0;i < lysolution.getPagesNumber(); ++i){
                    lysolution.setText(lysolution.getText() + "\nadfsg");
                }
            }

            public BookCharacteristics appreciate(){
                try {
                    if (lysolution.getPagesNumber() == 1)      return BookCharacteristics.VeryBad;
                    else if (lysolution.getPagesNumber() == 2) return BookCharacteristics.Bad;
                    else if (lysolution.getPagesNumber() == 3) return BookCharacteristics.Common;
                    else if (lysolution.getPagesNumber() == 4) return BookCharacteristics.Good;
                    else throw new BookException("Книга слишком хороша, нужно переписать");
                }catch (BookException e){
                    System.out.println(e.getMessage());
                    return BookCharacteristics.VeryGood;
                }
            }
        }

        BookActionComponent bac = new BookActionComponent();

        lysolution = new Book("Лизорюция", "afd",1);

        while (bac.appreciate() != BookCharacteristics.Good){
            bac.reWrite();
        }
    }

    public static class ThinkingComponent{
        private static Random rand = new Random();
        private static String[] answers = new String[]{
            "Нормально","Плохо","Хорошо","Пойдет"
        };
        public static void answer(){
            System.out.println("Кролик ответил: ");
            System.out.println("    - " + getRandomAnswer());
        }
        private static String getRandomAnswer(){
            int i = rand.nextInt(answers.length);
            if (i == 2) throw new ThinkException("Кролик хочет дать непозволительный ответ");
            return answers[i];
        }
    }

    public void specialChairAction(){
        CanChairAction stand = new CanChairAction(){
            @Override
            public void chairAction(){
                System.out.println(getName() + " встал со стула");
            }
        };
        stand.chairAction();
    }

    @Override
    public void saySomething(){
        System.out.println("Кролик сказал:");
        System.out.println("    - Я прочитаю тебе свою новую книгу ");
        System.out.println("Кролик читал книгу на протяжении 2 часов ");
    }

    @Override
    public void asking(){ }

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
