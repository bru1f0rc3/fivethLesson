package ru.yandex.practicum.model;

public class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount(){
        return this.moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount){
        this.moneyAmount = newMoneyAmount;
    }

    public void withdrawAll(){
        System.out.println("Со счёта снято " + this.moneyAmount + " р.");
        this.moneyAmount = 0;
    }
}
