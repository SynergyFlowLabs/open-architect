package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1gSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int areAllFieldsValid = 1;
    private static int[] getCurrencyIso4217Code;
    private static int getMonetizationNetwork;
    private final Map<String, Object> getMediationNetwork;
    private final Context getRevenue;

    @l1
    public static class AFa1vSDK {
        static byte[] getMediationNetwork(@NonNull byte[] bArr) throws Exception {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ ((i10 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        static byte[] getMonetizationNetwork(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        getMediationNetwork();
        TextUtils.indexOf("", "");
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getScrollDefaultDelay();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getTapTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        int i10 = getMonetizationNetwork + 5;
        areAllFieldsValid = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @m1
    public AFc1gSDK(Map<String, Object> map, Context context) {
        this.getMediationNetwork = map;
        this.getRevenue = context;
        put(getMonetizationNetwork(), getCurrencyIso4217Code());
    }

    private static void a(String str, int i10, Object[] objArr) {
        Object charArray;
        int i11 = $10 + 21;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            charArray = str;
            charArray = str.toCharArray();
        }
        charArray = str;
        char[] cArr = (char[]) charArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        aFk1pSDK.getMediationNetwork = i10;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1pSDK.getRevenue = 0;
        while (true) {
            int i12 = aFk1pSDK.getRevenue;
            if (i12 >= cArr.length) {
                break;
            }
            jArr[i12] = (((long) cArr[i12]) ^ (((long) i12) * ((long) aFk1pSDK.getMediationNetwork))) ^ (AFAdRevenueData ^ 199061409475100049L);
            aFk1pSDK.getRevenue = i12 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1pSDK.getRevenue = 0;
        while (true) {
            int i13 = aFk1pSDK.getRevenue;
            if (i13 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i14 = $11 + 97;
            int i15 = i14 % 128;
            $10 = i15;
            if (i14 % 2 != 0) {
                cArr2[i13] = (char) jArr[i13];
            } else {
                cArr2[i13] = (char) jArr[i13];
                i13++;
            }
            aFk1pSDK.getRevenue = i13;
            $11 = (i15 + 95) % 128;
        }
    }

    private static void b(int[] iArr, int i10, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getCurrencyIso4217Code;
        if (iArr2 != null) {
            $11 = ($10 + 61) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr3[i11] = (int) (((long) iArr2[i11]) ^ 3670241895213185600L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getCurrencyIso4217Code;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 57;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    iArr6[i12] = (int) (((long) iArr5[i12]) / 3670241895213185600L);
                    i12 >>= 1;
                } else {
                    iArr6[i12] = (int) (((long) iArr5[i12]) ^ 3670241895213185600L);
                    i12++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i14 = aFk1kSDK.getCurrencyIso4217Code;
            if (i14 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            int i15 = iArr[i14];
            char c10 = (char) (i15 >> 16);
            cArr[0] = c10;
            char c11 = (char) i15;
            cArr[1] = c11;
            char c12 = (char) (iArr[i14 + 1] >> 16);
            cArr[2] = c12;
            char c13 = (char) iArr[i14 + 1];
            cArr[3] = c13;
            aFk1kSDK.AFAdRevenueData = (c10 << 16) + c11;
            aFk1kSDK.getMonetizationNetwork = (c12 << 16) + c13;
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i16 = 0; i16 < 16; i16++) {
                int i17 = aFk1kSDK.AFAdRevenueData ^ iArr4[i16];
                aFk1kSDK.AFAdRevenueData = i17;
                int iAFAdRevenueData = AFk1kSDK.AFAdRevenueData(i17) ^ aFk1kSDK.getMonetizationNetwork;
                int i18 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = iAFAdRevenueData;
                aFk1kSDK.getMonetizationNetwork = i18;
            }
            int i19 = aFk1kSDK.AFAdRevenueData;
            int i20 = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.AFAdRevenueData = i20;
            aFk1kSDK.getMonetizationNetwork = i19;
            int i21 = i19 ^ iArr4[16];
            aFk1kSDK.getMonetizationNetwork = i21;
            int i22 = i20 ^ iArr4[17];
            aFk1kSDK.AFAdRevenueData = i22;
            cArr[0] = (char) (i22 >>> 16);
            cArr[1] = (char) i22;
            cArr[2] = (char) (i21 >>> 16);
            cArr[3] = (char) i21;
            AFk1kSDK.getMediationNetwork(iArr4);
            int i23 = aFk1kSDK.getCurrencyIso4217Code;
            cArr2[i23 * 2] = cArr[0];
            cArr2[(i23 * 2) + 1] = cArr[1];
            cArr2[(i23 * 2) + 2] = cArr[2];
            cArr2[(i23 * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code = i23 + 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x01b0  */
    private String getCurrencyIso4217Code() {
        String string;
        int i10;
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("ٓ䛅蝏쟵П䒊蔱얶ˎ䍊菵쁹", TextUtils.getCapsMode("", 0, 0) + 16529, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            b(new int[]{-2010068804, 540027562, -1611408693, 1290839385, -1409557867, 1221376410, 1124754813, -1552552339}, 15 - Drawable.resolveOpacity(0, 0), objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a("\u0604䏅趱힎ᅸ嬿", KeyEvent.keyCodeFromString("") + 17881, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new int[]{-500104792, -1719657709, -1010008550, 1926287854}, View.MeasureSpec.getMode(0) + 5, objArr4);
            String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(string3);
            sb2.append(strReplaceAll);
            String monetizationNetwork = AFj1cSDK.getMonetizationNetwork(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append(monetizationNetwork.substring(0, 16));
            string = sb3.toString();
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            b(new int[]{1412659751, -1225518006, 773104622, 1068029282, -141638432, 1353047013, 1075026864, 1832361899, -1682230360, 559510922, -697688254, 1914000959, 812386368, -220880964, 205571840, 667018555, -2049150556, -1682711385, -806296611, -80359859}, (Process.myTid() >> 22) + 38, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, -984596794, -978390891, 878183437, 2057824704, 1541426602, 1401202182, -1442141497, 1653693558, -345898809, 1573805036, 244475260, 1779591003}, TextUtils.lastIndexOf("", org.locationtech.jts.geom.l.f338160j) + 45, objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e10);
            AFLogger.afRDLog(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("");
            Object[] objArr7 = new Object[1];
            b(new int[]{1526111022, -471598143, -1921753797, -132556607, -1402220075, -512792088, 445237066, 69508151, 892799620, -65302862}, View.resolveSize(0, 0) + 18, objArr7);
            sb5.append(((String) objArr7[0]).intern());
            string = sb5.toString();
        }
        String str = string;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a("ٓ⦩妼覟릉\ue992᧨䦯秳꧁\ud9d4\u09d0㤠椷饺줈更⤃奡襲른\ue905\u197e䥰碞ꢋ\ud895ࢷ㢧梬飇죑\uf8d3⣩壿蠈렂", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12276, objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentRegisterReceiver != null) {
                Object[] objArr9 = new Object[1];
                b(new int[]{-928491678, 1479704380, -891867092, 74755836, -1761205169, 1640230696}, TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j) + 12, objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.getRevenue.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                getMonetizationNetwork = (areAllFieldsValid + 49) % 128;
                Object[] objArr10 = new Object[1];
                a("ي氡퉒", Gravity.getAbsoluteGravity(0, 0) + 27179, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    areAllFieldsValid = (getMonetizationNetwork + 93) % 128;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            Context context2 = this.getRevenue;
            try {
                Object[] objArr11 = new Object[1];
                b(new int[]{39584719, 152510957, 1115452019, -1177671545}, KeyEvent.keyCodeFromString("") + 6, objArr11);
                int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                StringBuilder sb6 = new StringBuilder();
                Object[] objArr12 = new Object[1];
                b(new int[]{-262877734, -1049246313}, -TextUtils.lastIndexOf("", org.locationtech.jts.geom.l.f338160j, 0), objArr12);
                sb6.append(((String) objArr12[0]).intern());
                sb6.append(intExtra);
                Object[] objArr13 = new Object[1];
                a("ؔ\ue32d", 58726 - ImageFormat.getBitsPerPixel(0), objArr13);
                sb6.append(((String) objArr13[0]).intern());
                sb6.append(i10);
                Object[] objArr14 = new Object[1];
                a("ؔ\uf1be", 63486 - TextUtils.lastIndexOf("", org.locationtech.jts.geom.l.f338160j, 0), objArr14);
                sb6.append(((String) objArr14[0]).intern());
                sb6.append(size);
                Object[] objArr15 = new Object[1];
                b(new int[]{-400266022, -1154682097}, 1 - ImageFormat.getBitsPerPixel(0), objArr15);
                sb6.append(((String) objArr15[0]).intern());
                sb6.append(this.getMediationNetwork.size());
                String string4 = sb6.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                byte[] mediationNetwork = AFa1vSDK.getMediationNetwork(AFa1vSDK.getMonetizationNetwork(string4));
                StringBuilder sb8 = new StringBuilder();
                for (byte b10 : mediationNetwork) {
                    String hexString = Integer.toHexString(b10);
                    if (hexString.length() == 1) {
                        int i11 = getMonetizationNetwork + 23;
                        areAllFieldsValid = i11 % 128;
                        if (i11 % 2 == 0) {
                            com.facebook.appevents.p.f99189d0.concat(hexString);
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        hexString = com.facebook.appevents.p.f99189d0.concat(hexString);
                    }
                    sb8.append(hexString);
                }
                sb7.append(sb8.toString());
                return sb7.toString();
            } catch (Exception e11) {
                e = e11;
                Object[] objArr16 = new Object[1];
                b(new int[]{1412659751, -1225518006, 773104622, 1068029282, -1961924635, 1375008509, 776083721, -1573871477}, 16 - Color.red(0), objArr16);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e);
                StringBuilder sb9 = new StringBuilder();
                Object[] objArr17 = new Object[1];
                b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, -984596794, -978390891, 878183437, 2057824704, 1541426602, 1401202182, -1442141497, 1653693558, -345898809, 1573805036, 244475260, 1779591003}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, objArr17);
                sb9.append(((String) objArr17[0]).intern());
                sb9.append(e);
                AFLogger.afRDLog(sb9.toString());
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                Object[] objArr18 = new Object[1];
                b(new int[]{-683062148, -858043544, -2064842399, 815261139, 1867195511, 963766349, -1317296620, -449999879}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr18);
                sb10.append(((String) objArr18[0]).intern());
                return sb10.toString();
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @l1
    private static StringBuilder getMediationNetwork(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Integer.valueOf(strArr[i10].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iIntValue; i11++) {
            getMonetizationNetwork = (areAllFieldsValid + 47) % 128;
            Integer numValueOf = null;
            for (int i12 = 0; i12 < 3; i12++) {
                int iCharAt = strArr[i12].charAt(i11);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb2;
    }

    @NonNull
    private String getMonetizationNetwork() {
        getMonetizationNetwork = (areAllFieldsValid + 3) % 128;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("ٓ䛅蝏쟵П䒊蔱얶ˎ䍊菵쁹", 16530 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a("ِ彗둽ങ戊", View.getDefaultSize(0, 0) + 22807, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                areAllFieldsValid = (getMonetizationNetwork + 29) % 128;
                Object[] objArr3 = new Object[1];
                a("ټ\u0cd4ጿᦋⳄ㌾㦊䳩", 2729 - View.MeasureSpec.getSize(0), objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder mediationNetwork = getMediationNetwork(string, string3, sb2.toString());
            int length = mediationNetwork.length();
            if (length > 4) {
                mediationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    mediationNetwork.append(org.locationtech.jts.geom.l.f338161k);
                }
            }
            Object[] objArr4 = new Object[1];
            b(new int[]{-269708407, 691550562}, Color.green(0) + 3, objArr4);
            mediationNetwork.insert(0, ((String) objArr4[0]).intern());
            return mediationNetwork.toString();
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            b(new int[]{854565745, 306981016, 2092009709, 1211146027, -1997348285, -2069302082, -1014555636, -1115818356, 1491143540, 297822326, -891867092, 74755836, -538226225, -689317204, -1794805564, -1830683349, -1867036264, 1235626699, 1541426602, 1401202182}, 40 - Color.argb(0, 0, 0, 0), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, 1632684225, -344979390, -1051640727, -1500483547, 1921909678, 1197372451, 1709650531, 1369506269, 1275252993, 1437497808, 761424572, -1240279331}, 42 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e10);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            b(new int[]{-2132896634, 840027810, -513331929, 1353535124}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    static void getMediationNetwork() {
        AFAdRevenueData = -8351283963653293149L;
        getCurrencyIso4217Code = new int[]{442543737, -1490671600, 624544975, 963078580, -38548639, -1507093695, -433807488, 2027768116, 1333435861, -1679971940, -735591064, 871109200, 1542131051, 1882103064, 1923897460, -2041115963, 1803608463, -148454374};
    }
}
