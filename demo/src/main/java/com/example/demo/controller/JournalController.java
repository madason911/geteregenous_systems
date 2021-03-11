package com.example.demo.controller;

import com.example.demo.dao.JournalJdbc;
import com.example.demo.model.Journal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class JournalController {


    private final JournalJdbc journalJdbc;

    public JournalController(JournalJdbc journalJdbc) {
        this.journalJdbc = journalJdbc;
    }

    //    {"id":3,  "surname":"Petrov","name":"Alexander","second_name":"Ivanovich", "study_group_id": 2}
//    @PostMapping("/student")
//    int newStudent(@RequestBody Journal newJournal) {
//        try{
//            return journalJdbc.UpdateJournal(newJournal);
//        }
//        catch (Exception e){
//            return -1;
//        }
//    }

    @GetMapping("/journal/{id}")
    public Journal getJournal(@PathVariable int id){
        return journalJdbc.get(id);
    }

//    @GetMapping("/journal/group/{student_group_id}")
//    public List<Journal> getJournalByGroup(@PathVariable int journal_group_id){
//        return journalJdbc.getJournalByGroup(journal_group_id);
//    }
//
//    @GetMapping("/journal/all")
//    public List<Journal> getJournalByGroup(){
//        return journalJdbc.getAll();
//    }
}
