package com.example.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
*파일에서 List<User> 정보를 저장하거나 읽어오는 기능
 */
public class UserDao {
    private String fileName;
    public UserDao(String fileName){
        this.fileName = fileName;
    }

    public void saveUser(Iterator<User> iter){
        List<User> users = new ArrayList<>();
        while (iter.hasNext()){
            User user = iter.next();
            users.add(user);
        }
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(users);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<User> getUsers(){
        File file = new File(fileName);
        if (!file.exists()){
            return new ArrayList<>();
        }

        List<User> list = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (List<User>)in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
