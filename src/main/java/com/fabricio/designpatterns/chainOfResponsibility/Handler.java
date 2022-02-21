package com.fabricio.designpatterns.chainOfResponsibility;

public abstract class Handler {

    protected Handler sucessor;

    public abstract int level();

    public abstract void handle(int level);

    public final void handleRequest(int level){
        if (level <= level()){
            handle(level);
        } else {
            if (null != sucessor){
                sucessor.handleRequest(level);
            } else {
                System.out.println("Não foi possível aprovar este level!");
            }
        }
    }
}
