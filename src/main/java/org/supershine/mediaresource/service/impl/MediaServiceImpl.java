package org.supershine.mediaresource.service.impl;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.supershine.mediaresource.model.MediaResource;
import org.supershine.mediaresource.repository.MediaRepository;
import org.supershine.mediaresource.service.MediaService;

import java.util.List;

@Service
@Getter
public class MediaServiceImpl implements MediaService {
    @Autowired
    private MediaRepository mediaRepository;
    @Override
    public List<MediaResource> fetchAllMediaResources() {
        return getMediaRepository().findAll();
    }

    @Override
    public List<MediaResource> createMediaResources(List<MediaResource> mediaResourceList) {
        return getMediaRepository().saveAll(mediaResourceList);
    }
}
