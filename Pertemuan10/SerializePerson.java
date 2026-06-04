/**
 * File         : ReadSerializedPerson.java
 * Deskripsi    : Program untuk deserialisasi objek Person
 * Pembuat      : Quinta Aurabiansyah / 24060124120016
 * Tanggal      : Rabu, 25 Mei 2026
 */

import java.io.*;

//class SerializePerson
public class SerializePerson{
    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}