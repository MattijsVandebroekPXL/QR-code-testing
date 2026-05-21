package be.pxl.student;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) throws IOException {
        // --- GENERATION ---
        System.out.println("--- Generating QR code with ZXing ---");
        GenerateWithZXing.generate();

        // --- SCANNING ---
        System.out.println("\n--- Scanning QR code with MLScanner ---");
        MLScanner.scan("zxingQrcode.png");
    }
}