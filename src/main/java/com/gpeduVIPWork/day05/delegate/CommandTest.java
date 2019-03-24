package com.gpeduVIPWork.day05.delegate;

public class CommandTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("加密",new Leader());
    }
}
