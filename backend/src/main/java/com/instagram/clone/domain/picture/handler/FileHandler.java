package com.instagram.clone.domain.picture.handler;

import com.instagram.clone.domain.picture.entity.Picture;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//https://velog.io/@pyo-sh/Spring-Boot-%ED%8C%8C%EC%9D%BC%EC%9D%B4%EB%AF%B8%EC%A7%80-%EC%97%85%EB%A1%9C%EB%93%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
@Component
public class FileHandler {
    public List<Picture> parseFileInfo(Long postId, List<MultipartFile> multipartFiles) {
        List<Picture> pictureList = new ArrayList<>();
        if(multipartFiles.isEmpty()) return pictureList;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String current_date = simpleDateFormat.format(new Date());

        String absolutePath = new File("").getAbsolutePath() + "\\";
        String path = "images/" + current_date;
        File file = new File(path);

        if(!file.exists()) {
            file.mkdirs();
        }

        for(MultipartFile multipartFile : multipartFiles) {
            if (!multipartFile.isEmpty()) {
                String contentType = multipartFile.getContentType();
                String originalFileExtension;

                if(ObjectUtils.isEmpty(contentType)) {
                    break;
                }
                else {
                    if (contentType.contains("image/jpeg")) {
                        originalFileExtension = ".jpg";
                    }
                    else if (contentType.contains("image/png")) {
                        originalFileExtension = ".png";
                    }
                    else if (contentType.contains("image/gif")) {
                        originalFileExtension = ".gif";
                    }
                    else break;
                }
                String new_file_name = Long.toString(System.nanoTime()) + originalFileExtension;
                // 생성 후 리스트에 추가
                Picture picture = Picture.builder()
                        .(boardID)
                        .original_file_name(multipartFile.getOriginalFilename())
                        .stored_file_path(path + "/" + new_file_name)
                        .file_size(multipartFile.getSize())
                        .build();
                fileList.add(boardPicture);

                // 저장된 파일로 변경하여 이를 보여주기 위함
                file = new File(absolutePath + path + "/" + new_file_name);
                multipartFile.transferTo(file);
            }
        }
    }
}
