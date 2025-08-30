package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReplyService service = new ReplyService();


        System.out.println(service.reply(null, ReplyType.FORMAL));
        System.out.println(service.reply("hi", ReplyType.FORMAL));
        System.out.println(service.reply("hi", ReplyType.FRIENDLY));
        System.out.println(service.reply("HELLO", ReplyType.CONCISE));
        System.out.println(service.reply("thanks", ReplyType.FRIENDLY));
        System.out.println(service.reply("bye", ReplyType.CONCISE));
        System.out.println(service.reply("what is your name", ReplyType.FORMAL));
        System.out.println(service.reply("random text", ReplyType.CONCISE));
    }
}