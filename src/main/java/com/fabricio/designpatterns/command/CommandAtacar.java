package com.fabricio.designpatterns.command;

public class CommandAtacar implements Command {

    Movimento movimento;

    public CommandAtacar(Movimento movimento) {
        this.movimento = movimento;
    }

    @Override
    public void execute() {
        movimento.atacar();
    }
}
