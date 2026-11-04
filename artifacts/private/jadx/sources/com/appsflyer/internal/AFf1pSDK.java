package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int getCurrencyIso4217Code = 1;
    private static int[] getMediationNetwork;

    static {
        getMediationNetwork();
        ViewConfiguration.getLongPressTimeout();
        int i10 = getCurrencyIso4217Code + 3;
        AFAdRevenueData = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
    }

    @l1
    private static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
        String revenue;
        int i10 = AFAdRevenueData + 85;
        getCurrencyIso4217Code = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[2];
            strArr[0] = str2;
            strArr[1] = str3;
            strArr[5] = str4;
            strArr[5] = str5;
            strArr[4] = "";
            revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", strArr), str);
            if (revenue.length() < 63) {
                return revenue;
            }
        } else {
            revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
            if (revenue.length() < 12) {
                return revenue;
            }
        }
        String strSubstring = revenue.substring(0, 12);
        int i11 = AFAdRevenueData + 47;
        getCurrencyIso4217Code = i11 % 128;
        if (i11 % 2 != 0) {
            return strSubstring;
        }
        throw null;
    }

    private static void a(int[] iArr, int i10, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMediationNetwork;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            $10 = ($11 + 59) % 128;
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 39;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    iArr3[i11] = (int) (((long) iArr2[i11]) * 3670241895213185600L);
                    i11 %= 1;
                } else {
                    iArr3[i11] = (int) (((long) iArr2[i11]) ^ 3670241895213185600L);
                    i11++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMediationNetwork;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i13 = 0; i13 < length3; i13++) {
                $11 = ($10 + 79) % 128;
                iArr6[i13] = (int) (((long) iArr5[i13]) ^ 3670241895213185600L);
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
            $11 = ($10 + 51) % 128;
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
                $10 = ($11 + 9) % 128;
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

    @NonNull
    private static AFi1uSDK getMediationNetwork(@NonNull AFi1wSDK aFi1wSDK, @androidx.annotation.p0 String str, @NonNull String str2, @NonNull String str3) {
        String string;
        boolean z10 = false | true;
        if (str == null) {
            return new AFi1uSDK(aFi1wSDK.AFAdRevenueData == AFh1aSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{-643013363, -1773125790, -901337036, 656549561, -1731661770, 1258424067, -1532942264, 934407696, -1450123275, -1059473533, 82834636, 73705576, -1221507016, 1763733418, -1711569501, 1840946075, -1493249449, -1523654642, 594617170, -836811800, 1195240337, 1166309858, 1004762227, 96245697, 395058159, 64877192, 56299164, -104828535, -4786395, 2101942765, -285338731, 1554123850}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 64, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1wSDK.AFAdRevenueData == AFh1aSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = AFAdRevenueData(new StringBuilder(str3).reverse().toString(), aFi1wSDK.getCurrencyIso4217Code, "android", "v1", string).equals(str);
        return new AFi1uSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @NonNull
    public final AFi1uSDK getRevenue(@NonNull AFi1wSDK aFi1wSDK, @androidx.annotation.p0 String str, @NonNull String str2, @NonNull String str3) {
        int i10;
        if (aFi1wSDK != null) {
            int i11 = AFAdRevenueData;
            int i12 = i11 + 29;
            getCurrencyIso4217Code = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 9 / 0;
                if (str2 != null) {
                    if (str3 != null) {
                        getCurrencyIso4217Code = (i11 + 67) % 128;
                        AFi1uSDK mediationNetwork = getMediationNetwork(aFi1wSDK, str, str2, str3);
                        i10 = getCurrencyIso4217Code + 51;
                        AFAdRevenueData = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i14 = 27 / 0;
                        }
                        return mediationNetwork;
                    }
                }
            } else if (str2 != null) {
                if (str3 != null) {
                    getCurrencyIso4217Code = (i11 + 67) % 128;
                    AFi1uSDK mediationNetwork2 = getMediationNetwork(aFi1wSDK, str, str2, str3);
                    i10 = getCurrencyIso4217Code + 51;
                    AFAdRevenueData = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i15 = 27 / 0;
                    }
                    return mediationNetwork2;
                }
            }
        }
        getCurrencyIso4217Code = (AFAdRevenueData + 21) % 128;
        return new AFi1uSDK(false, AFi1ySDK.INTERNAL_ERROR);
    }

    static void getMediationNetwork() {
        getMediationNetwork = new int[]{-1667361725, -1699441632, 432593808, 251732126, -1427520749, -699397331, 585070146, 1483439762, 1609066215, 453290560, -192666392, -1278453714, -213940739, 2102241028, -1309214613, 1294459639, 1092066826, -1216170440};
    }
}
