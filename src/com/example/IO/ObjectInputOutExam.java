package com.example.IO;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputOutExam {
    public static void main(String[] args)throws Exception{
        User user1 = new User("hong@example.com","홍홍홍",1980);
        User user2 = new User("choi@example.com","최최최",1970);
        User user3 = new User("kim@example.com","김김김",1950);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ArrayList<User> list2 = copy(list);

        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }

        /*ArrayList<User> list2 = list;

        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }*/
    }

    private static ArrayList<User> copy(ArrayList<User> list) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(list);
        out.close();
        bout.close();

        byte[] array = bout.toByteArray();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> list2 = (ArrayList)in.readObject();
        in.close();
        return list2;
    }
}
