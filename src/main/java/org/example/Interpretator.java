package org.example;

public class Interpretator {
    Parser   pars;
    Executer E = new Executer();
    public
    Interpretator(String program) {
    	pars = new Parser (program);
    }
    void interpretation() {
        pars.analyze();
        E.Execute(pars.poliz);
    }
}
