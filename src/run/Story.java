package run;

import classes.Alice;
import classes.Owners;
import classes.People;
import classes.Sonya;
import service.AliceIsOverRuded;
import service.FeelingsEnum;

public class Story {

    public static void main(String[] args) {
        Alice A = new Alice("Из Яндекса", FeelingsEnum.NoneFeelings, 0);
        Owners O1 = new Owners("Барин", FeelingsEnum.NoneFeelings);
        Owners O2 = new Owners("Барыня", FeelingsEnum.NoneFeelings);
        Sonya S = new Sonya("Солнышко");
        A.JoinToStory();
        O1.JoinToStory();
        O2.JoinToStory();
        S.JoinToStory();
        A.Beginning();
        Owners.Hat H = O1.new Hat();
        H.JoinToStory();
        H.interrupt(A);
        for (int i = 0; i < 5; ++i) {
            try {
                System.out.println("Буллим Алису " + A.getName() + " ...");
                O1.RudeToAlice(A);
            } catch (AliceIsOverRuded err) {
                System.out.println("Вы забуллили Алису");
                A.ChangeFeeling(FeelingsEnum.OUTRAGED);
                System.out.println("Алиса возмущена до предела (степень опасности " + A.getRuded() + "). Бегите, глупцы!");
                A.Sad();
            }
        }
        A.TryToImpressOwners(new People[]{O1, O2, S/*, A*/});
        O1.ChangeFeeling(FeelingsEnum.NoneFeelings);
        O2.ChangeFeeling(FeelingsEnum.NoneFeelings);
        S.ChangeFeeling(FeelingsEnum.SLEEPING);
        for (int i = 0; i < 3; ++i) {
            A.TurnAround();
        }
        O1.DoSmthFun(S);
        O2.DoSmthFun(S);
        S.DoSmthFun(S);
        class Tree {
            public void Being() {
                System.out.println("Дверца-то открывается");
            }
        }
        Tree T = new Tree();
        T.Being();
    }
}
