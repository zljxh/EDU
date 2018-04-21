package com.zl.edu.controller.backend;

import com.zl.edu.util.DrawIdentifyImgUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/backend")
public class BackendJCaptchaController extends BaseBackendController {

    @RequestMapping("/jcaptcha.jpg")
    public void jcaptcha(HttpServletResponse response) {
        DrawIdentifyImgUtil draw = new DrawIdentifyImgUtil();
        String jpg = draw.genCodeStr(5);
        BufferedImage image = draw.drawImg(jpg);

        OutputStream os = null;
        try {
            os = response.getOutputStream();
            ImageIO.write(image, "PNG", os);
            draw.genImgFile("d:\\" + jpg + ".png");
            image.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
