package com.vishnu.firstspringbootapp.controllers;

import com.vishnu.firstspringbootapp.models.Speaker;
import com.vishnu.firstspringbootapp.repositories.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
@ResponseStatus(HttpStatus.ACCEPTED)
public class SpeakerController {

    @Autowired
    public SpeakerRepository speakerRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    private List<Speaker> speaker() {
        return speakerRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Speaker get(@PathVariable Long id) {
        return speakerRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Speaker create(@RequestBody final Speaker speaker) {
        return speakerRepository.saveAndFlush(speaker);
    }

    // not under-standing this part
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    // @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        speakerRepository.deleteById(id);
    }

    @RequestMapping(name = "{id}", method = RequestMethod.PUT)
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        Speaker existingSpeaker = speakerRepository.getOne(id);
        BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
        return speakerRepository.saveAndFlush(existingSpeaker);
    }
}
