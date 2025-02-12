package net.engineeringdigest.jurnalApp.controller;

import net.engineeringdigest.jurnalApp.entity.JournalEntry;
import net.engineeringdigest.jurnalApp.entity.JurnalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Journal")
public class JournalEntryControllerV2 {
    @Autowired
    private JurnalEntryService jurnalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return jurnalEntryService.getAll();

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        jurnalEntryService.saveEntry(myEntry);
        System.out.println("Entry created:");
        return true;
    }



  @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myid){
      return jurnalEntryService.findById(myid).orElse(null);
    }

    @DeleteMapping("id/{myid}")
    public boolean deleteJournalById(@PathVariable ObjectId myid){
        jurnalEntryService.deleteById(myid);
        System.out.println("Entry deleted");
        return true;
    }







}
