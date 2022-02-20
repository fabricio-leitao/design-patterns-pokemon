package com.fabricio.designpatterns.command;

public class CommandDefender implements Command {
    Movimento movimento;

    public CommandDefender(Movimento movimento) {
        this.movimento = movimento;
    }

    @Override
    public void execute() {
        movimento.defender();
    }
}
