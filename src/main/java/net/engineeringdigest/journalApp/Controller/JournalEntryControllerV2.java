package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.Entity.JournalEntry;
import net.engineeringdigest.journalApp.Repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.Service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/__journal")
public class JournalEntryControllerV2 {

//    @Autowired
//    private JournalEntryService journalEntryService;
//
//    @GetMapping
//    public ResponseEntity<List<JournalEntry>> getAllJournalEntries(){
//        List<JournalEntry> journalEntries = journalEntryService.getAll();
//        if(journalEntries != null && !journalEntries.isEmpty()){
//            return new ResponseEntity<>(journalEntries, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @GetMapping("/id/{myId}")
//    public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable ObjectId myId){
//        Optional<JournalEntry> journalEntry= journalEntryService.getById(myId);
//        if(journalEntry.isPresent()){
//            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping
//    public ResponseEntity<JournalEntry> createJournalEntry(@RequestBody JournalEntry myEntry){
//       try{
//           myEntry.setDate(LocalDateTime.now());
//           journalEntryService.saveEntry(myEntry);
//           return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
//       }
//       catch(Exception e) {
//           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//       }
//    }
//
//    @PutMapping("id/{myId}")
//    public ResponseEntity<JournalEntry> updateJournalEntry(@PathVariable ObjectId myId, @RequestBody JournalEntry newEntry){
//        JournalEntry oldEntry = journalEntryService.getById(myId).orElse(null);
//        if(oldEntry != null){
//            oldEntry.setDate(LocalDateTime.now());
//            oldEntry.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : oldEntry.getTitle());
//            oldEntry.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : oldEntry.getContent());
//            journalEntryService.saveEntry(oldEntry);
//            return new ResponseEntity<>(oldEntry, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public ResponseEntity<?> deleteJournalEntry(@PathVariable ObjectId myId){
//        JournalEntry journalEntry = journalEntryService.getById(myId).orElse(null);
//        if(journalEntry != null){
//            journalEntryService.deleteById(myId);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }




}
