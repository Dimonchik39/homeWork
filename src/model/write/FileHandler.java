package model.write;

import java.io.*;
// import model.write.Writable;

public class FileHandler {

    public boolean save(Serializable serializable, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Object read(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            return objectInputStream.readObject();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
