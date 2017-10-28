package me.steven.ezclub.service;

import me.steven.ezclub.domain.Tag;
import me.steven.ezclub.repo.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TagService {

    private final TagRepo tagRepo;

    @Autowired
    public TagService(TagRepo tagRepo) {
        this.tagRepo = tagRepo;
    }

    @Transactional
    public Tag save(Tag tag) {
        return tagRepo.save(tag);
    }

}
