package homework.intro;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * Created by Владислав on 23.09.2017.
 */

/**
 * Запись в блокноте.
 * Хранит строку.
 */
class NotepadRecord{
    public String record;

    NotepadRecord(String record){
        this.record = record;
    }

    public String getRecord(){
        return this.record;
    }

    void setRecord(String record){
        this.record = record;
    }
}

/**
 * Блокнот.
 * Хранит набор записей.
 */
class Notepad{
    public ArrayList<NotepadRecord> Records;

    Notepad(){
        this.Records = new ArrayList<NotepadRecord>();
    }

    /**
     * Добавляет запись в блокнот.
     * @param record
     */
    public void addRecord(String record){
        this.Records.add(new NotepadRecord(record));
    }

    /**
     * Удаляет запись по индексу.
     * @param index
     */
    public void removeRecord(int index){
        if(!this.Records.isEmpty()) {
            this.Records.remove(index);
        }
    }

    /**
     * Выводит в консоль все записи.
     */
    public void showAllRecords(){
        if(!this.Records.isEmpty()){
            int i = 0;
            for(NotepadRecord nr : this.Records){
                System.out.println("Record № " + i + " : " + nr.getRecord());
                i++;
            }
        } else {
            System.out.println("No records found!");
        }
    }
}

public class Ex6Intro {
    public static void main(String[] args){
        Notepad n = new Notepad();
        n.addRecord("Bla-bla");
        n.addRecord("Short record");
        n.addRecord("Very interesting record");
        n.showAllRecords();
        n.removeRecord(1);
        n.showAllRecords();
    }
}
