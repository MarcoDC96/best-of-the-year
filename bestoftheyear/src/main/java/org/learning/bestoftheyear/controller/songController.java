package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
@RequestMapping("/songs")
public class songController {
    @GetMapping
    private String ListOfSongs(Model model) {
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "SongList";
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Destri", "Gazzelle"));
        songs.add(new Song(2, "Californication", "RHCP"));
        songs.add(new Song(3, "Scar Tissue", "RHCP"));
        songs.add(new Song(4, "Bohemian Rhapsody", "Queen"));
        songs.add(new Song(5, "Imagine", "John Lennon"));

        return songs;
    }
}