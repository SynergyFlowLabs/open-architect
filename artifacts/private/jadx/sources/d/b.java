package d;

import android.content.Context;
import android.provider.Settings;
import com.devtodev.core.utils.log.CoreLog;
import com.google.common.base.c;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.g;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static String a(Context context) {
        try {
            return b(Settings.System.getString(context.getContentResolver(), "android_id"));
        } catch (Exception e10) {
            CoreLog.i("DevToDev", "Error generating ODIN-1: ", e10);
            return null;
        }
    }

    private static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(g.f335249c);
            messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
            return c(messageDigest.digest());
        } catch (Exception e10) {
            CoreLog.i("ODIN", "Error generating generating SHA-1: ", e10);
            return null;
        }
    }

    private static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = (bArr[i10] >>> 4) & 15;
            int i12 = 0;
            while (true) {
                if (i11 < 0 || i11 > 9) {
                    stringBuffer.append((char) (i11 + 87));
                } else {
                    stringBuffer.append((char) (i11 + 48));
                }
                i11 = bArr[i10] & c.f116464q;
                int i13 = i12 + 1;
                if (i12 >= 1) {
                    break;
                }
                i12 = i13;
            }
        }
        return stringBuffer.toString();
    }
}
