package com.fasterxml.jackson.core.io;

import androidx.collection.g3;
import com.facebook.appevents.p;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f102444a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f102445b = 1000000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f102446c = 1000000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f102447d = -2147483648L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f102448e = 2147483647L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f102449f = String.valueOf(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f102450g = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f102451h = new int[1000];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f102452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f102453j;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f102451h[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        f102452i = new String[]{p.f99189d0, "1", "2", androidx.exifinterface.media.a.f51345a5, "4", "5", "6", "7", "8", "9", "10"};
        f102453j = new String[]{CreateTicketViewModelKt.EmailId, "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int i10, byte[] bArr, int i11) {
        int i12 = f102451h[i10];
        bArr[i11] = (byte) (i12 >> 16);
        int i13 = i11 + 2;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        int i14 = i11 + 3;
        bArr[i13] = (byte) i12;
        return i14;
    }

    private static int b(int i10, char[] cArr, int i11) {
        int i12 = f102451h[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & 127);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & 127);
        return i14;
    }

    private static int c(int i10, byte[] bArr, int i11) {
        int i12 = f102451h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i11] = (byte) (i12 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i12 >> 8);
            i11++;
        }
        int i13 = i11 + 1;
        bArr[i11] = (byte) i12;
        return i13;
    }

    private static int d(int i10, char[] cArr, int i11) {
        int i12 = f102451h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    private static int e(int i10, byte[] bArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int[] iArr = f102451h;
        int i16 = iArr[i14];
        bArr[i11] = (byte) (i16 >> 16);
        bArr[i11 + 1] = (byte) (i16 >> 8);
        bArr[i11 + 2] = (byte) i16;
        int i17 = iArr[i15];
        bArr[i11 + 3] = (byte) (i17 >> 16);
        bArr[i11 + 4] = (byte) (i17 >> 8);
        bArr[i11 + 5] = (byte) i17;
        int i18 = iArr[i13];
        bArr[i11 + 6] = (byte) (i18 >> 16);
        int i19 = i11 + 8;
        bArr[i11 + 7] = (byte) (i18 >> 8);
        int i20 = i11 + 9;
        bArr[i19] = (byte) i18;
        return i20;
    }

    private static int f(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = f102451h;
        int i15 = iArr[i14];
        cArr[i11] = (char) (i15 >> 16);
        cArr[i11 + 1] = (char) ((i15 >> 8) & 127);
        cArr[i11 + 2] = (char) (i15 & 127);
        int i16 = iArr[i12 - (i14 * 1000)];
        cArr[i11 + 3] = (char) (i16 >> 16);
        cArr[i11 + 4] = (char) ((i16 >> 8) & 127);
        cArr[i11 + 5] = (char) (i16 & 127);
        int i17 = iArr[i13];
        cArr[i11 + 6] = (char) (i17 >> 16);
        int i18 = i11 + 8;
        cArr[i11 + 7] = (char) ((i17 >> 8) & 127);
        int i19 = i11 + 9;
        cArr[i18] = (char) (i17 & 127);
        return i19;
    }

    private static int g(byte[] bArr, int i10) {
        int length = f102449f.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) f102449f.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    private static int h(char[] cArr, int i10) {
        String str = f102449f;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int i(byte[] bArr, int i10) {
        int length = f102450g.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) f102450g.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    private static int j(char[] cArr, int i10) {
        String str = f102450g;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int k(int i10, byte[] bArr, int i11) {
        if (i10 < f102444a) {
            if (i10 < 1000) {
                return c(i10, bArr, i11);
            }
            int i12 = i10 / 1000;
            return m(bArr, i11, i12, i10 - (i12 * 1000));
        }
        int i13 = i10 / 1000;
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        int i16 = i13 - (i15 * 1000);
        int iC = c(i15, bArr, i11);
        int[] iArr = f102451h;
        int i17 = iArr[i16];
        bArr[iC] = (byte) (i17 >> 16);
        bArr[iC + 1] = (byte) (i17 >> 8);
        bArr[iC + 2] = (byte) i17;
        int i18 = iArr[i14];
        bArr[iC + 3] = (byte) (i18 >> 16);
        int i19 = iC + 5;
        bArr[iC + 4] = (byte) (i18 >> 8);
        int i20 = iC + 6;
        bArr[i19] = (byte) i18;
        return i20;
    }

    private static int l(int i10, char[] cArr, int i11) {
        if (i10 < f102444a) {
            if (i10 < 1000) {
                return d(i10, cArr, i11);
            }
            int i12 = i10 / 1000;
            return n(cArr, i11, i12, i10 - (i12 * 1000));
        }
        int i13 = i10 / 1000;
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        int i16 = i13 - (i15 * 1000);
        int iD = d(i15, cArr, i11);
        int[] iArr = f102451h;
        int i17 = iArr[i16];
        cArr[iD] = (char) (i17 >> 16);
        cArr[iD + 1] = (char) ((i17 >> 8) & 127);
        cArr[iD + 2] = (char) (i17 & 127);
        int i18 = iArr[i14];
        cArr[iD + 3] = (char) (i18 >> 16);
        int i19 = iD + 5;
        cArr[iD + 4] = (char) ((i18 >> 8) & 127);
        int i20 = iD + 6;
        cArr[i19] = (char) (i18 & 127);
        return i20;
    }

    private static int m(byte[] bArr, int i10, int i11, int i12) {
        int[] iArr = f102451h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                bArr[i10] = (byte) (i13 >> 16);
                i10++;
            }
            bArr[i10] = (byte) (i13 >> 8);
            i10++;
        }
        bArr[i10] = (byte) i13;
        int i14 = iArr[i12];
        bArr[i10 + 1] = (byte) (i14 >> 16);
        int i15 = i10 + 3;
        bArr[i10 + 2] = (byte) (i14 >> 8);
        int i16 = i10 + 4;
        bArr[i15] = (byte) i14;
        return i16;
    }

    private static int n(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = f102451h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & 127);
            i10++;
        }
        cArr[i10] = (char) (i13 & 127);
        int i14 = iArr[i12];
        cArr[i10 + 1] = (char) (i14 >> 16);
        int i15 = i10 + 3;
        cArr[i10 + 2] = (char) ((i14 >> 8) & 127);
        int i16 = i10 + 4;
        cArr[i15] = (char) (i14 & 127);
        return i16;
    }

    public static int o(int i10, byte[] bArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return g(bArr, i11);
            }
            bArr[i11] = 45;
            i10 = -i10;
            i11++;
        }
        if (i10 < f102444a) {
            if (i10 >= 1000) {
                int i13 = i10 / 1000;
                return a(i10 - (i13 * 1000), bArr, c(i13, bArr, i11));
            }
            if (i10 >= 10) {
                return c(i10, bArr, i11);
            }
            int i14 = i11 + 1;
            bArr[i11] = (byte) (i10 + 48);
            return i14;
        }
        int i15 = f102445b;
        if (i10 < i15) {
            int i16 = i10 / 1000;
            int i17 = i16 / 1000;
            return a(i10 - (i16 * 1000), bArr, a(i16 - (i17 * 1000), bArr, c(i17, bArr, i11)));
        }
        int i18 = i10 - i15;
        if (i18 >= i15) {
            i18 -= i15;
            i12 = i11 + 1;
            bArr[i11] = 50;
        } else {
            i12 = i11 + 1;
            bArr[i11] = 49;
        }
        return e(i18, bArr, i12);
    }

    public static int p(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return h(cArr, i11);
            }
            cArr[i11] = org.apache.commons.codec.language.l.f335457d;
            i10 = -i10;
            i11++;
        }
        if (i10 < f102444a) {
            if (i10 >= 1000) {
                int i13 = i10 / 1000;
                return b(i10 - (i13 * 1000), cArr, d(i13, cArr, i11));
            }
            if (i10 >= 10) {
                return d(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        int i14 = f102445b;
        if (i10 < i14) {
            int i15 = i10 / 1000;
            int i16 = i15 / 1000;
            return b(i10 - (i15 * 1000), cArr, b(i15 - (i16 * 1000), cArr, d(i16, cArr, i11)));
        }
        int i17 = i10 - i14;
        if (i17 >= i14) {
            i17 -= i14;
            i12 = i11 + 1;
            cArr[i11] = org.locationtech.jts.geom.l.f338162l;
        } else {
            i12 = i11 + 1;
            cArr[i11] = org.locationtech.jts.geom.l.f338161k;
        }
        return f(i17, cArr, i12);
    }

    public static int q(long j10, byte[] bArr, int i10) {
        int iE;
        if (j10 < 0) {
            if (j10 > f102447d) {
                return o((int) j10, bArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return i(bArr, i10);
            }
            bArr[i10] = 45;
            j10 = -j10;
            i10++;
        } else if (j10 <= f102448e) {
            return o((int) j10, bArr, i10);
        }
        long j11 = f102446c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            iE = k((int) j12, bArr, i10);
        } else {
            long j14 = j12 / j11;
            int iC = c((int) j14, bArr, i10);
            iE = e((int) (j12 - (j11 * j14)), bArr, iC);
        }
        return e((int) j13, bArr, iE);
    }

    public static int r(long j10, char[] cArr, int i10) {
        int iF;
        if (j10 < 0) {
            if (j10 > f102447d) {
                return p((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return j(cArr, i10);
            }
            cArr[i10] = org.apache.commons.codec.language.l.f335457d;
            j10 = -j10;
            i10++;
        } else if (j10 <= f102448e) {
            return p((int) j10, cArr, i10);
        }
        long j11 = f102446c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            iF = l((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int iD = d((int) j14, cArr, i10);
            iF = f((int) (j12 - (j11 * j14)), cArr, iD);
        }
        return f((int) j13, cArr, iF);
    }

    public static String s(double d10) {
        return Double.toString(d10);
    }

    public static String t(float f10) {
        return Float.toString(f10);
    }

    public static String u(int i10) {
        String[] strArr = f102452i;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = f102453j;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    public static String v(long j10) {
        return (j10 > g3.f12256c || j10 < g3.f12261h) ? Long.toString(j10) : u((int) j10);
    }
}
