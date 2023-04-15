
USPS - Barcodes

Java Imeplementation to take a 5-digit zipcode and transform and return it in a USPS-standard bar encoding (PostNet.
Each digit [0,9] has its own specific bar encoding: ex --> "||:::"

The last digit of the barcode is the check digit, calculated by taking modulo 10 of sum of all check digits in barcode. This digits bar encoding is added at the end. 


![postnet2](https://user-images.githubusercontent.com/130812782/232252613-7b96957c-add6-4d67-bb02-ed654f49b22b.gif)

Bar encodings for zipcode are useful for efficient sorting of mail by USPS.

