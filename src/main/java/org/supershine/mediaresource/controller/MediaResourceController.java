package org.supershine.mediaresource.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.supershine.mediaresource.model.MediaResource;
import org.supershine.mediaresource.service.MediaService;

import java.util.List;

@RestController
@RequestMapping("/MediaResourceController")
@Getter
public class MediaResourceController {

    @Autowired
    private MediaService mediaService;
    @GetMapping("/fetchAllMediaResources")
    public List<MediaResource> fetchAllMediaResources() {
        return getMediaService().fetchAllMediaResources();
    }

    @PostMapping("/createMediaResources")
    public List<MediaResource> createMediaResources(@RequestBody List<MediaResource> mediaResourceList) {
        return getMediaService().createMediaResources(mediaResourceList);
    }
}
