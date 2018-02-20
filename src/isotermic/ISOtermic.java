/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isotermic;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;

/**
 *
 * @author root
 */
public class ISOtermic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ISOException {
        
        // Create Packager based on XML that contain DE type
        //GenericPackager packager = new GenericPackager("iso2003ascii.xml");
        GenericPackager packager = new GenericPackager("iso87ascii.xml");
        
        String data = "";
        data = "0210723A40010AC18008060740021700000000008735790220213650449278213650022002216012030080001574492780653PLG00120121111111111112410008115       201802201802NIRWAN PAUNDRA SOEKARNO       0101000000871079000025002018020000008710790000000000000000-00000000360001 ";
        data = "0430723A40010A818000060740020003000000008735790220213655157449213655022002216012030080000001574492253PLG00112410008115       201802201802NIRWAN PAUNDRA SOEKARNO       0101000000871079000025002018020000008710790000000000000000-00000000360";
        System.out.println("length : "+data.length());
        
        // Create ISO Message
        ISOMsg isoMsg = new ISOMsg();
        isoMsg.setPackager(packager);
        ISOMsg isoMsg22 = new ISOMsg();
        isoMsg22.setPackager(packager);
        isoMsg.unpack(data.getBytes());

        // print the DE list
        logISOMsg(isoMsg, data);
        
    }
    
    private static void logISOMsg(ISOMsg msg,String iso) {
        System.out.println("----ISO MESSAGE-----");
        String xxx[] = new String[50];
        try {
            
            System.out.println("  MTI : " + msg.getMTI());

            System.out.println("  Bitmap : " + msg.getValue(-1).toString());
            
            System.out.println("  2 : " + msg.getString(2));
            System.out.println("  3 : " + msg.getString(3));
            System.out.println("  4 : " + msg.getString(4));
            System.out.println("  5 : " + msg.getString(5));
            System.out.println("  6 : " + msg.getString(6));
            System.out.println("  7 : " + msg.getString(7));
            System.out.println("  11 : " + msg.getString(11));
            System.out.println("  12 : " + msg.getString(12));
            System.out.println("  13 : " + msg.getString(13));
            System.out.println("  15 : " + msg.getString(15));
            System.out.println("  17 : " + msg.getString(17));
            System.out.println("  18 : " + msg.getString(18));
            System.out.println("  23 : " + msg.getString(23));
            System.out.println("  26 : " + msg.getString(26));
            System.out.println("  27 : " + msg.getString(27));
            System.out.println("  32 : " + msg.getString(32));
            System.out.println("  33 : " + msg.getString(33));
            System.out.println("  37 : " + msg.getString(37));
            System.out.println("  39 : " + msg.getString(39));
            System.out.println("  40 : " + msg.getString(40));
            System.out.println("  41 : " + msg.getString(41));
            System.out.println("  42 : " + msg.getString(42));
            System.out.println("  48 : " + msg.getString(48));            
            System.out.println("  56 : " + msg.getString(56));
            System.out.println("  61 : " + msg.getString(61));
            System.out.println("  62 : " + msg.getString(62)); 
            System.out.println("  63 : " + msg.getString(63));

        } catch (ISOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("--------------------");
        }

        
    }
    
}
