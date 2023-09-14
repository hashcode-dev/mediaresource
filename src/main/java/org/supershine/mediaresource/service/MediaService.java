package org.supershine.mediaresource.service;

import org.supershine.mediaresource.model.MediaResource;

import java.util.List;

public interface MediaService {
    public List<MediaResource> fetchAllMediaResources();
    public List<MediaResource> createMediaResources(List<MediaResource> mediaResourceList);
}
