
#Write Name and Address into khadijah.txt
#----------------------------------------
import binascii;
name = raw_input("Enter Yourname: ");
address = raw_input("Enter Address: ");

with open("khadijah.txt","w") as printtext:
 printtext.write("Name: {} \nAddress: {}".format(name,address));
 

#Read file khadijah.txt, and write (in binary mode) into khadijah.bin
#------------------------------------------------------------------
rd = [rf.rstrip('\n') for rf in open("name.txt","r")];
with open("name.bin","wb") as wb:
 for data in rd:
  bd = bin(int(binascii.b2a_hex(data),16))
  wb.write("{}\n".format(bd));

#Read khadijah.bin, and write back (in text mode) into last.txt
#--------------------------------------------------------------
with open("khadijah.bin","rb") as binarystring, open("last.txt","w") as textstring:
 for data in binarystring:
  y = int(data,2)
  textstring.write("{}\n".format(binascii.a2b_hex('%x' % y)));
