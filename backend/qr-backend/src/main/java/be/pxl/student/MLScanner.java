package be.pxl.student;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MLScanner {

    public static void scan(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("[Scanner]  File not found, skipping: " + filePath);
            return;
        }

        BufferedImage image = ImageIO.read(file);
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        try {
            Result result = new MultiFormatReader().decode(
                    bitmap,
                    Map.of(
                            DecodeHintType.POSSIBLE_FORMATS, List.of(BarcodeFormat.QR_CODE),
                            DecodeHintType.TRY_HARDER, Boolean.TRUE
                    )
            );
            System.out.println("[Scanner]  " + filePath + " -> \"" + result.getText() + "\"");
        } catch (NotFoundException e) {
            System.err.println("[Scanner]  No QR code found in: " + filePath);
        }
    }
}