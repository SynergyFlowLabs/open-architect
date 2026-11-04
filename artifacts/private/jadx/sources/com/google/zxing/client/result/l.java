package com.google.zxing.client.result;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends u {
    private static String q(int i10, String str) {
        char cCharAt;
        if (str.charAt(i10) != '(') {
            return null;
        }
        String strSubstring = str.substring(i10 + 1);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < strSubstring.length() && (cCharAt = strSubstring.charAt(i11)) != ')'; i11++) {
            if (cCharAt >= '0' && cCharAt <= '9') {
                sb2.append(cCharAt);
            }
            return null;
        }
        return sb2.toString();
    }

    private static String r(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(i10);
        for (int i11 = 0; i11 < strSubstring.length(); i11++) {
            char cCharAt = strSubstring.charAt(i11);
            if (cCharAt != '(') {
                sb2.append(cCharAt);
            } else {
                if (q(i11, strSubstring) != null) {
                    break;
                }
                sb2.append('(');
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public k k(com.google.zxing.r rVar) {
        if (rVar.b() != com.google.zxing.a.RSS_EXPANDED) {
            return null;
        }
        String strC = u.c(rVar);
        HashMap map = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String strSubstring = null;
        String strSubstring2 = null;
        String strSubstring3 = null;
        String strSubstring4 = null;
        int i10 = 0;
        while (i10 < strC.length()) {
            String strQ = q(i10, strC);
            if (strQ == null) {
                return null;
            }
            byte b10 = 2;
            int length = i10 + strQ.length() + 2;
            String strR = r(length, strC);
            int length2 = length + strR.length();
            switch (strQ.hashCode()) {
                case 1536:
                    if (!strQ.equals("00")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 1537:
                    if (!strQ.equals("01")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 1567:
                    if (!strQ.equals("10")) {
                        b10 = -1;
                    }
                    break;
                case 1568:
                    if (!strQ.equals("11")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 1570:
                    if (!strQ.equals("13")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1572:
                    if (!strQ.equals("15")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 1574:
                    if (!strQ.equals("17")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1567966:
                    if (!strQ.equals("3100")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1567967:
                    if (!strQ.equals("3101")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 1567968:
                    if (!strQ.equals("3102")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1567969:
                    if (!strQ.equals("3103")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1567970:
                    if (!strQ.equals("3104")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 1567971:
                    if (!strQ.equals("3105")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116461n;
                    }
                    break;
                case 1567972:
                    if (!strQ.equals("3106")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116462o;
                    }
                    break;
                case 1567973:
                    if (!strQ.equals("3107")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116463p;
                    }
                    break;
                case 1567974:
                    if (!strQ.equals("3108")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116464q;
                    }
                    break;
                case 1567975:
                    if (!strQ.equals("3109")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116465r;
                    }
                    break;
                case 1568927:
                    if (!strQ.equals("3200")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 1568928:
                    if (!strQ.equals("3201")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116468u;
                    }
                    break;
                case 1568929:
                    if (!strQ.equals("3202")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case 1568930:
                    if (!strQ.equals("3203")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116471x;
                    }
                    break;
                case 1568931:
                    if (!strQ.equals("3204")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116472y;
                    }
                    break;
                case 1568932:
                    if (!strQ.equals("3205")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116473z;
                    }
                    break;
                case 1568933:
                    if (!strQ.equals("3206")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.A;
                    }
                    break;
                case 1568934:
                    if (!strQ.equals("3207")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.B;
                    }
                    break;
                case 1568935:
                    if (!strQ.equals("3208")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.C;
                    }
                    break;
                case 1568936:
                    if (!strQ.equals("3209")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.D;
                    }
                    break;
                case 1575716:
                    if (!strQ.equals("3920")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.E;
                    }
                    break;
                case 1575717:
                    if (!strQ.equals("3921")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.F;
                    }
                    break;
                case 1575718:
                    if (!strQ.equals("3922")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.G;
                    }
                    break;
                case 1575719:
                    if (!strQ.equals("3923")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.H;
                    }
                    break;
                case 1575747:
                    if (!strQ.equals("3930")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.I;
                    }
                    break;
                case 1575748:
                    if (!strQ.equals("3931")) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                case 1575749:
                    if (!strQ.equals("3932")) {
                        b10 = -1;
                    } else {
                        b10 = 33;
                    }
                    break;
                case 1575750:
                    if (!strQ.equals("3933")) {
                        b10 = -1;
                    } else {
                        b10 = 34;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    str2 = strR;
                    i10 = length2;
                    break;
                case 1:
                    str = strR;
                    i10 = length2;
                    break;
                case 2:
                    str3 = strR;
                    i10 = length2;
                    break;
                case 3:
                    str4 = strR;
                    i10 = length2;
                    break;
                case 4:
                    str5 = strR;
                    i10 = length2;
                    break;
                case 5:
                    str6 = strR;
                    i10 = length2;
                    break;
                case 6:
                    str7 = strR;
                    i10 = length2;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    strSubstring = strQ.substring(3);
                    str9 = k.f130224q;
                    str8 = strR;
                    map = map;
                    i10 = length2;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    strSubstring = strQ.substring(3);
                    str9 = k.f130225r;
                    str8 = strR;
                    map = map;
                    i10 = length2;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    map = map;
                    strSubstring3 = strQ.substring(3);
                    strSubstring2 = strR;
                    map = map;
                    i10 = length2;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    if (strR.length() < 4) {
                        return null;
                    }
                    strSubstring2 = strR.substring(3);
                    map = map;
                    strSubstring4 = strR.substring(0, 3);
                    strSubstring3 = strQ.substring(3);
                    map = map;
                    i10 = length2;
                    break;
                default:
                    map.put(strQ, strR);
                    i10 = length2;
                    break;
            }
        }
        return new k(strC, str, str2, str3, str4, str5, str6, str7, str8, str9, strSubstring, strSubstring2, strSubstring3, strSubstring4, map);
    }
}
