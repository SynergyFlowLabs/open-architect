package io.grpc.okhttp.internal.proxy;

import com.google.common.base.c;
import com.superwall.sdk.network.Api;
import java.io.EOFException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.locationtech.jts.geom.l;
import org.slf4j.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f290664e = {l.f338160j, l.f338161k, l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', l.f338157g};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f290665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f290666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f290667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f290668d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f290669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f290670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f290671c = -1;

        private static String b(String str, int i10, int i11) {
            String strH = a.h(str, i10, i11, false);
            if (!strH.startsWith("[") || !strH.endsWith("]")) {
                return f(strH);
            }
            InetAddress inetAddressE = e(strH, 1, strH.length() - 1);
            if (inetAddressE == null) {
                return null;
            }
            byte[] address = inetAddressE.getAddress();
            if (address.length == 16) {
                return i(address);
            }
            throw new AssertionError();
        }

        private static boolean c(String str) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean d(String str, int i10, int i11, byte[] bArr, int i12) {
            int i13 = i12;
            while (i10 < i11) {
                if (i13 == bArr.length) {
                    return false;
                }
                if (i13 != i12) {
                    if (str.charAt(i10) != '.') {
                        return false;
                    }
                    i10++;
                }
                int i14 = i10;
                int i15 = 0;
                while (i14 < i11) {
                    char cCharAt = str.charAt(i14);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                        break;
                    }
                    if ((i15 != 0 || i10 == i14) && (i15 = ((i15 * 10) + cCharAt) - 48) <= 255) {
                        i14++;
                    }
                    return false;
                }
                if (i14 - i10 == 0) {
                    return false;
                }
                bArr[i13] = (byte) i15;
                i13++;
                i10 = i14;
            }
            return i13 == i12 + 4;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0055  */
        /* JADX WARN: Code duplicated, block: B:34:0x0060 A[LOOP:1: B:30:0x0053->B:34:0x0060, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:59:0x0066 A[EDGE_INSN: B:59:0x0066->B:35:0x0066 BREAK  A[LOOP:1: B:30:0x0053->B:34:0x0060], SYNTHETIC] */
        private static InetAddress e(String str, int i10, int i11) {
            int i12;
            int i13;
            int iB;
            byte[] bArr = new byte[16];
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            while (i10 < i11) {
                if (i14 == 16) {
                    return null;
                }
                int i17 = i10 + 2;
                if (i17 <= i11 && str.regionMatches(i10, "::", 0, 2)) {
                    if (i15 != -1) {
                        return null;
                    }
                    i14 += 2;
                    i15 = i14;
                    if (i17 == i11) {
                        break;
                    }
                    i16 = i17;
                    i12 = 0;
                    i10 = i16;
                    while (i10 < i11) {
                        iB = a.b(str.charAt(i10));
                        if (iB == -1) {
                            break;
                            break;
                        }
                        i12 = (i12 << 4) + iB;
                        i10++;
                    }
                    i13 = i10 - i16;
                    if (i13 != 0) {
                    }
                    return null;
                }
                if (i14 != 0) {
                    if (!str.regionMatches(i10, ":", 0, 1)) {
                        if (!str.regionMatches(i10, ".", 0, 1) || !d(str, i16, i11, bArr, i14 - 2)) {
                            return null;
                        }
                        i14 += 2;
                        break;
                    }
                    i10++;
                }
                i16 = i10;
                i12 = 0;
                i10 = i16;
                while (i10 < i11) {
                    iB = a.b(str.charAt(i10));
                    if (iB == -1) {
                        break;
                    }
                    i12 = (i12 << 4) + iB;
                    i10++;
                }
                i13 = i10 - i16;
                if (i13 != 0 || i13 > 4) {
                    return null;
                }
                int i18 = i14 + 1;
                bArr[i14] = (byte) ((i12 >>> 8) & 255);
                i14 += 2;
                bArr[i18] = (byte) (i12 & 255);
            }
            if (i14 != 16) {
                if (i15 == -1) {
                    return null;
                }
                int i19 = i14 - i15;
                System.arraycopy(bArr, i15, bArr, 16 - i19, i19);
                Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static String f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty() || c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static String i(byte[] bArr) {
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < bArr.length) {
                int i14 = i12;
                while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                    i14 += 2;
                }
                int i15 = i14 - i12;
                if (i15 > i13) {
                    i10 = i12;
                    i13 = i15;
                }
                i12 = i14 + 2;
            }
            okio.l lVar = new okio.l();
            while (i11 < bArr.length) {
                if (i11 == i10) {
                    lVar.writeByte(58);
                    i11 += i13;
                    if (i11 == 16) {
                        lVar.writeByte(58);
                    }
                } else {
                    if (i11 > 0) {
                        lVar.writeByte(58);
                    }
                    lVar.q7(((bArr[i11] & 255) << 8) | (bArr[i11 + 1] & 255));
                    i11 += 2;
                }
            }
            return lVar.O7();
        }

        public a a() {
            if (this.f290669a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f290670b != null) {
                return new a(this);
            }
            throw new IllegalStateException("host == null");
        }

        int g() {
            int i10 = this.f290671c;
            return i10 != -1 ? i10 : a.c(this.f290669a);
        }

        public b h(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strB = b(str, 0, str.length());
            if (strB != null) {
                this.f290670b = strB;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public b j(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f290671c = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        public b k(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f290669a = "http";
                return this;
            }
            if (str.equalsIgnoreCase(Api.scheme)) {
                this.f290669a = Api.scheme;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f290669a);
            sb2.append("://");
            if (this.f290670b.indexOf(58) != -1) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f290670b);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb2.append(this.f290670b);
            }
            int iG = g();
            if (iG != a.c(this.f290669a)) {
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(iG);
            }
            return sb2.toString();
        }
    }

    static void a(okio.l lVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12) {
        okio.l lVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z11) {
                    lVar.pa(z10 ? h.f339615a3 : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z12) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && !z10))) {
                    if (lVar2 == null) {
                        lVar2 = new okio.l();
                    }
                    lVar2.d9(iCodePointAt);
                    while (!lVar2.y1()) {
                        try {
                            d();
                            byte b10 = lVar2.readByte();
                            lVar.writeByte(37);
                            char[] cArr = f290664e;
                            lVar.writeByte(cArr[((b10 & 255) >> 4) & 15]);
                            lVar.writeByte(cArr[b10 & c.f116464q]);
                        } catch (EOFException e10) {
                            throw new IndexOutOfBoundsException(e10.getMessage());
                        }
                    }
                } else {
                    lVar.d9(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static int b(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - l.f338160j;
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Api.scheme) ? 443 : -1;
    }

    private static void d() throws EOFException {
    }

    static String h(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                okio.l lVar = new okio.l();
                lVar.K3(str, i10, i12);
                i(lVar, str, i12, i11, z10);
                return lVar.O7();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    static void i(okio.l lVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iB = b(str.charAt(i10 + 1));
                int iB2 = b(str.charAt(i12));
                if (iB == -1 || iB2 == -1) {
                    lVar.d9(iCodePointAt);
                } else {
                    lVar.writeByte((iB << 4) + iB2);
                    i10 = i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                lVar.writeByte(32);
            } else {
                lVar.d9(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public String e() {
        return this.f290666b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f290668d.equals(this.f290668d);
    }

    public boolean f() {
        return this.f290665a.equals(Api.scheme);
    }

    public b g() {
        b bVar = new b();
        String str = this.f290665a;
        bVar.f290669a = str;
        bVar.f290670b = this.f290666b;
        bVar.f290671c = this.f290667c != c(str) ? this.f290667c : -1;
        return bVar;
    }

    public int hashCode() {
        return this.f290668d.hashCode();
    }

    public int j() {
        return this.f290667c;
    }

    public String k() {
        return this.f290665a;
    }

    public String toString() {
        return this.f290668d;
    }

    private a(b bVar) {
        this.f290665a = bVar.f290669a;
        this.f290666b = bVar.f290670b;
        this.f290667c = bVar.g();
        this.f290668d = bVar.toString();
    }
}
