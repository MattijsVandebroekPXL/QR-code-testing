# QR-code-testing
In this repository I test several QR code libraries to use in Vue, so we can decide which QR code library is the best in our project.

## Libraries that were be tested:
### Html5-qrCode
This library works in JavaScript, and is used for reading codes.
### ZXing
This library (pronounced as Zebra Crossing) works in Java.
### QRcodejs
This library works in JavaScript, and is used for generating the code.

A lot of other libraries are based on ZXing, and therefore come with extra threats. ZXing is still being updated today, making it a better option than the libraries based on it.
Libraries that work in the frontend have an advantage, as they just need a string to generate a code, or convert a code to a string before sending data back.
