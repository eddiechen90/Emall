package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Eddie on 2017/5/30.
 */
public interface IFileService {
    public String upload(MultipartFile file, String path);
}
