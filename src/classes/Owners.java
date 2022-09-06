package classes;

import service.AliceIsOverRuded;
import service.FeelingsEnum;
import service.OwnersInterface;
import service.PutAble;

public class Owners extends People implements OwnersInterface {

    public Owners() {
        super();
    }

    public Owners(String name) {
        super(name);
    }

    public Owners(String name, FeelingsEnum Feel) {
        super(name, Feel);
    }

    @Override
    public void ChangeFeeling(FeelingsEnum Feeling) {
        this.setFeel(Feeling);
        System.out.println("Хозяин " + getName() + " теперь " + getFeelings().get());

    }

    @Override
    public void JoinToStory() {
        System.out.println("Хозяин " + getName() + " прибыл для участия в истории.");
    }

    @Override
    public void RudeToAlice(Alice A) throws AliceIsOverRuded{
        A.Ruding();
        int rururu = A.getRuded();
        if (rururu < 5) {
            System.out.println("Вы нагрубили Алисе. Текущий уровень огрубленности составляет " + rururu);
        } else {
            throw new AliceIsOverRuded();
        }
    }

    @Override
    public void DoSmthFun(Sonya s) {
        PutAble teapot = new PutAble(){
            @Override
            public void Put(Sonya s) {
                System.out.println("Вы засунули Соню " + s.getName() +" в чайник");
            }
        };
        teapot.Put(s);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return getName().length() * (int) Math.pow(2, 10) + getFeelings().get().length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owners O = (Owners) o;
        return this.hashCode() == O.hashCode();
    }

    public class Hat extends Owners {
        public Hat() {
            super("Шляпа");
        }

        public void interrupt(Alice A) {
            System.out.println("Алиса " + A.getName() + ", помолчи, емае.");
        }

        @Override
        public void JoinToStory() {
            System.out.println("Хозяин Шляпа прибыл для участия в истории и сказал:");
        }
    }

}