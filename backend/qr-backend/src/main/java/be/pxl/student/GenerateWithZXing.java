package be.pxl.student;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;

public class GenerateWithZXing {

    public static void generate() throws IOException {
        String qrText = "Dit is een test.";
        String filePath = "zxingQrcode.png";
        int width = 300;
        int height = 300;

        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(
                    qrText,
                    BarcodeFormat.QR_CODE,
                    width,
                    height,
                    Map.of(EncodeHintType.MARGIN, 1)
            );

            Path path = FileSystems.getDefault().getPath(filePath);
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);

            System.out.println("[ZXing]    QR code saved to: " + filePath);
        } catch (WriterException e) {
            System.err.println("[ZXing]    Failed to generate QR code: " + e.getMessage());
        }
    }
}