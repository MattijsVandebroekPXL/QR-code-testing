//import { Html5QrcodeScanner, Html5Qrcode } from "html5-qrcode";
//const { Html5QrcodeScanner, Html5Qrcode } = require("html5-qrcode");

function onScanSuccess(decodedText, decodedResult)
{
    console.log(`Code matched = ${decodedText}`, decodedResult);
}

const html5QrcodeScanner = new Html5QrcodeScanner("reader", { fps: 10, qrbox: {width: 250, height: 250}}, true);
html5QrcodeScanner.render(onScanSuccess);

// De code van github

/*import {Html5QrcodeScanner} from "html5-qrcode";

function onScanSuccess(decodedText, decodedResult)
{
    console.log(`Code matched = ${decodedText}`, decodedResult);
}

function onScanFailure(error)
{
    console.warn(`Code scan error = ${error}`);
}

let html5QrcodeScanner = new Html5QrcodeScanner("reader", {fps: 10, qrbox: {width: 250, height: 250}}, false);
html5QrcodeScanner.render(onScanSuccess, onScanFailure);*/