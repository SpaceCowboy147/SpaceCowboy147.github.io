package com.dylanharper.navigationBar;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class controller {

    @GetMapping("/")
    public String homePage() {

        return "homePage";
    }

    @GetMapping("/webApps")
    public String webAppPage() {
        return "webProjects";
    }

    @GetMapping("/gameApps")
    public String gameAppPage() {
        return "gameProjects";
    }

    @GetMapping("/aboutMe")
    public String aboutMePage() {
        return "aboutDylan";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @GetMapping("/DylanHarper_resume.pdf")
    public void downloadResume(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            File resumePDF = new File("C:\\Users\\dylan\\Documents\\GitHub\\portfolio\\src\\main\\resources\\templates\\DylanHarper_resume.pdf");
            if (resumePDF.exists()) {
                Files.copy(resumePDF.toPath(), response.getOutputStream());

            }


        } catch (IOException e) {
            e.printStackTrace();
    }

}
}



