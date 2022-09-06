package service;

import classes.Alice;
import classes.Sonya;

public interface OwnersInterface {
    void RudeToAlice(Alice A) throws AliceIsOverRuded;

    void DoSmthFun(Sonya s);
}
