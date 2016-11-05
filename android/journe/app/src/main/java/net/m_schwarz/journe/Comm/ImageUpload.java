package net.m_schwarz.journe.Comm;

import android.util.Log;

import java.io.File;
import java.util.List;

/**
 * Created by michael on 05.11.16.
 */

public class ImageUpload {
    public void doIt(File file) {
        try {
            String charset = "UTF-8";
            String requestURL = Config.baseUrl + "/savePicture/22/3/5/";

            MultipartUtility multipart = new MultipartUtility(requestURL, charset);

            multipart.addFilePart("imagefile", file);

            List<String> response = multipart.finish();

            Log.v("rht", "SERVER REPLIED:");

            for (String line : response) {
                Log.v("rht", "Line : " + line);
            }
        }

        catch(Exception e) {
            e.printStackTrace();
        }
    }
}