package com.example.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam2 {
    public static void main(String[] args) throws Exception{
        User user1 = new User("choi@example.com","그누기",1988);
        User user2 = new User("kim@example.com","김성정",1978);
        User user3 = new User("lee@example.com","이경영",1968);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/userlist.dat"));
        out.writeObject(list);
        out.close();
    }
}
