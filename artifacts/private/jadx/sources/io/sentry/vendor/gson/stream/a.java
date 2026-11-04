package io.sentry.vendor.gson.stream;

import com.facebook.internal.z0;
import com.planner5d.library.engine.input.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.k;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class a implements Closeable {
    private static final int H1 = 8;
    private static final int X = 3;
    private static final int Y = 4;
    private static final int Z = 5;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f307039g3 = 10;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f307040h3 = 11;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f307041i3 = 12;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f307042j3 = 13;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f307043k3 = 14;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f307044l3 = 15;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f307045m3 = 16;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f307046n3 = 17;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f307047o3 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f307048p0 = 6;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f307049p1 = 7;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f307050p2 = 9;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f307051p3 = 1;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f307052q3 = 2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f307053r3 = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f307054s = -922337203685477580L;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f307055s3 = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f307056t = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f307057t3 = 5;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f307058u3 = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f307059v = 1;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f307060v3 = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f307061w = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f307062a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f307070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f307071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f307072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f307073l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f307075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f307076o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f307063b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f307064c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f307065d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f307066e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f307067f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f307068g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f307069h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f307074m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f307073l = iArr;
        iArr[0] = 6;
        this.f307075n = new String[32];
        this.f307076o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f307062a = reader;
    }

    private void E() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f307065d;
                if (i11 + i10 < this.f307066e) {
                    char c10 = this.f307064c[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case f.b.f160711n0 /* 91 */:
                                                case f.b.f160700j1 /* 93 */:
                                                    break;
                                                case f.b.f160697i1 /* 92 */:
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        a();
                    }
                    this.f307065d += i10;
                    return;
                }
                this.f307065d = i11 + i10;
            }
        } while (d(1));
    }

    private IOException H(String str) throws IOException {
        throw new e(str + g());
    }

    private void a() throws IOException {
        if (!this.f307063b) {
            throw H("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void b() throws IOException {
        h(true);
        int i10 = this.f307065d;
        int i11 = i10 - 1;
        this.f307065d = i11;
        int i12 = 2 | 5;
        if (i10 + 4 <= this.f307066e || d(5)) {
            char[] cArr = this.f307064c;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f307065d += 5;
            }
        }
    }

    private boolean d(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f307064c;
        int i13 = this.f307068g;
        int i14 = this.f307065d;
        this.f307068g = i13 - i14;
        int i15 = this.f307066e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f307066e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f307066e = 0;
        }
        this.f307065d = 0;
        do {
            Reader reader = this.f307062a;
            int i17 = this.f307066e;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f307066e + i18;
            this.f307066e = i11;
            if (this.f307067f == 0 && (i12 = this.f307068g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f307065d++;
                this.f307068g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0043  */
    private boolean f(char c10) throws IOException {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 == '#') {
                a();
            } else if (c10 != ',') {
                if (c10 == '/' || c10 == '=') {
                    a();
                } else if (c10 != '{' && c10 != '}' && c10 != ':') {
                    if (c10 != ';') {
                        switch (c10) {
                            case f.b.f160711n0 /* 91 */:
                            case f.b.f160700j1 /* 93 */:
                                break;
                            case f.b.f160697i1 /* 92 */:
                                a();
                                break;
                            default:
                                return true;
                        }
                    } else {
                        a();
                    }
                }
            }
        }
        return false;
    }

    private int h(boolean z10) throws IOException {
        char[] cArr = this.f307064c;
        int i10 = this.f307065d;
        int i11 = this.f307066e;
        while (true) {
            if (i10 == i11) {
                this.f307065d = i10;
                if (!d(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + g());
                }
                i10 = this.f307065d;
                i11 = this.f307066e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f307067f++;
                this.f307068g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f307065d = i12;
                    if (i12 == i11) {
                        this.f307065d = i10;
                        boolean zD = d(2);
                        this.f307065d++;
                        if (!zD) {
                        }
                        return c10;
                    }
                    a();
                    int i13 = this.f307065d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f307065d = i13 + 1;
                        if (!x("*/")) {
                            throw H("Unterminated comment");
                        }
                        i10 = this.f307065d + 2;
                        i11 = this.f307066e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f307065d = i13 + 1;
                        y();
                        i10 = this.f307065d;
                        i11 = this.f307066e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f307065d = i12;
                        return c10;
                    }
                    this.f307065d = i12;
                    a();
                    y();
                    i10 = this.f307065d;
                    i11 = this.f307066e;
                }
            }
            i10 = i12;
        }
    }

    private String j(char c10) throws IOException {
        int i10;
        char[] cArr = this.f307064c;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f307065d;
            int i12 = this.f307066e;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f307065d = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f307065d = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(r());
                            i11 = this.f307065d;
                            i12 = this.f307066e;
                        } else {
                            if (c11 == '\n') {
                                this.f307067f++;
                                this.f307068g = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f307065d = i11;
        } while (d(1));
        throw H("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0051. Please report as an issue. */
    private String l() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f307065d;
                if (i12 + i11 < this.f307066e) {
                    char c10 = this.f307064c[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case f.b.f160711n0 /* 91 */:
                                                case f.b.f160700j1 /* 93 */:
                                                    break;
                                                case f.b.f160697i1 /* 92 */:
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        a();
                    }
                    i10 = i11;
                } else if (i11 >= this.f307064c.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f307064c, this.f307065d, i11);
                    this.f307065d += i11;
                    if (!d(1)) {
                    }
                } else if (!d(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f307064c, this.f307065d, i10);
                } else {
                    sb2.append(this.f307064c, this.f307065d, i10);
                    string = sb2.toString();
                }
                this.f307065d += i10;
                return string;
            }
        }
    }

    private int m() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f307064c[this.f307065d];
        if (c10 == 't' || c10 == 'T') {
            str = z0.P;
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = AbstractJsonLexerKt.NULL;
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f307065d + i11 >= this.f307066e && !d(i11 + 1)) {
                return 0;
            }
            char c11 = this.f307064c[this.f307065d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f307065d + length < this.f307066e || d(length + 1)) && f(this.f307064c[this.f307065d + length])) {
            return 0;
        }
        this.f307065d += length;
        this.f307069h = i10;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    private int o() throws IOException {
        char c10;
        int i10;
        char[] cArr = this.f307064c;
        int i11 = this.f307065d;
        int i12 = this.f307066e;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z10 = false;
        int i15 = 1;
        long j10 = 0;
        while (true) {
            char c12 = 2;
            if (i11 + i14 != i12) {
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E' || c10 == 'e') {
                        if (c11 == 2 && c11 != 4) {
                            return i10;
                        }
                        c11 = 5;
                    } else if (c10 == '-') {
                        c12 = 6;
                        if (c11 == 0) {
                            c11 = 1;
                            z10 = true;
                        } else if (c11 != 5) {
                            return i10;
                        }
                    } else if (c10 != '.') {
                        if (c10 < '0' || c10 > '9') {
                            if (!f(c10)) {
                                break;
                            }
                            return i10;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j10 = -(c10 - '0');
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return i10;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            i15 &= (j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10;
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return i10;
                        }
                        c11 = 3;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            } else {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!d(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f307065d;
                i12 = this.f307066e;
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E') {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    } else {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            }
        }
        if (c11 == 2 && i15 != 0 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f307070i = j10;
            this.f307065d += i14;
            this.f307069h = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        }
        this.f307071j = i14;
        this.f307069h = 16;
        return 16;
    }

    private void q(int i10) {
        int i11 = this.f307074m;
        int[] iArr = this.f307073l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f307073l = Arrays.copyOf(iArr, i12);
            this.f307076o = Arrays.copyOf(this.f307076o, i12);
            this.f307075n = (String[]) Arrays.copyOf(this.f307075n, i12);
        }
        int[] iArr2 = this.f307073l;
        int i13 = this.f307074m;
        this.f307074m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char r() throws IOException {
        int i10;
        if (this.f307065d == this.f307066e && !d(1)) {
            throw H("Unterminated escape sequence");
        }
        char[] cArr = this.f307064c;
        int i11 = this.f307065d;
        int i12 = i11 + 1;
        this.f307065d = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f307067f++;
            this.f307068g = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return k.f337188d;
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw H("Invalid escape sequence");
        }
        if (i11 + 5 > this.f307066e && !d(4)) {
            throw H("Unterminated escape sequence");
        }
        int i13 = this.f307065d;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f307064c[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f307064c, this.f307065d, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f307065d += 4;
        return c11;
    }

    private void t(char c10) throws IOException {
        char[] cArr = this.f307064c;
        do {
            int i10 = this.f307065d;
            int i11 = this.f307066e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f307065d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f307065d = i12;
                    r();
                    i10 = this.f307065d;
                    i11 = this.f307066e;
                } else {
                    if (c11 == '\n') {
                        this.f307067f++;
                        this.f307068g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f307065d = i10;
        } while (d(1));
        throw H("Unterminated string");
    }

    private boolean x(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f307065d + length > this.f307066e && !d(length)) {
                return false;
            }
            char[] cArr = this.f307064c;
            int i10 = this.f307065d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f307064c[this.f307065d + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f307067f++;
            this.f307068g = i10 + 1;
            this.f307065d++;
        }
    }

    private void y() throws IOException {
        char c10;
        do {
            if (this.f307065d >= this.f307066e && !d(1)) {
                return;
            }
            char[] cArr = this.f307064c;
            int i10 = this.f307065d;
            int i11 = i10 + 1;
            this.f307065d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f307067f++;
                this.f307068g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public final void C1(boolean z10) {
        this.f307063b = z10;
    }

    public void F0() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + g());
        }
        int i10 = this.f307074m;
        this.f307074m = i10 - 1;
        int[] iArr = this.f307076o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f307069h = 0;
    }

    public void F1() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + g());
        }
        int i10 = this.f307074m;
        int i11 = i10 - 1;
        this.f307074m = i11;
        this.f307075n[i11] = null;
        int[] iArr = this.f307076o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f307069h = 0;
    }

    public void J0() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 3) {
            q(1);
            this.f307076o[this.f307074m - 1] = 0;
            this.f307069h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + g());
        }
    }

    public String S() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f307074m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f307073l[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f307076o[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f307075n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void a7() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 7) {
            this.f307069h = 0;
            int[] iArr = this.f307076o;
            int i10 = this.f307074m - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + g());
    }

    public void a9() throws IOException {
        int i10 = 0;
        do {
            int iC = this.f307069h;
            if (iC == 0) {
                iC = c();
            }
            if (iC == 3) {
                q(1);
            } else {
                if (iC == 1) {
                    q(3);
                } else if (iC == 4 || iC == 2) {
                    this.f307074m--;
                    i10--;
                } else if (iC == 14 || iC == 10) {
                    E();
                } else if (iC == 8 || iC == 12) {
                    t('\'');
                } else if (iC == 9 || iC == 13) {
                    t('\"');
                } else if (iC == 16) {
                    this.f307065d += this.f307071j;
                }
                this.f307069h = 0;
            }
            i10++;
            this.f307069h = 0;
        } while (i10 != 0);
        int[] iArr = this.f307076o;
        int i11 = this.f307074m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f307075n[i11 - 1] = AbstractJsonLexerKt.NULL;
    }

    int c() throws IOException {
        int iH;
        int[] iArr = this.f307073l;
        int i10 = this.f307074m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iH2 = h(true);
            if (iH2 != 44) {
                if (iH2 != 59) {
                    if (iH2 != 93) {
                        throw H("Unterminated array");
                    }
                    this.f307069h = 4;
                    return 4;
                }
                a();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iH = h(true)) != 44) {
                    if (iH != 59) {
                        if (iH != 125) {
                            throw H("Unterminated object");
                        }
                        this.f307069h = 2;
                        return 2;
                    }
                    a();
                }
                int iH3 = h(true);
                if (iH3 == 34) {
                    this.f307069h = 13;
                    return 13;
                }
                if (iH3 == 39) {
                    a();
                    this.f307069h = 12;
                    return 12;
                }
                if (iH3 == 125) {
                    if (i11 == 5) {
                        throw H("Expected name");
                    }
                    this.f307069h = 2;
                    return 2;
                }
                a();
                this.f307065d--;
                if (!f((char) iH3)) {
                    throw H("Expected name");
                }
                this.f307069h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iH4 = h(true);
                if (iH4 != 58) {
                    if (iH4 != 61) {
                        throw H("Expected ':'");
                    }
                    a();
                    if (this.f307065d < this.f307066e || d(1)) {
                        char[] cArr = this.f307064c;
                        int i12 = this.f307065d;
                        if (cArr[i12] == '>') {
                            this.f307065d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f307063b) {
                    b();
                }
                this.f307073l[this.f307074m - 1] = 7;
            } else if (i11 == 7) {
                if (h(false) == -1) {
                    this.f307069h = 17;
                    return 17;
                }
                a();
                this.f307065d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iH5 = h(true);
        if (iH5 == 34) {
            this.f307069h = 9;
            return 9;
        }
        if (iH5 == 39) {
            a();
            this.f307069h = 8;
            return 8;
        }
        if (iH5 != 44 && iH5 != 59) {
            if (iH5 == 91) {
                this.f307069h = 3;
                return 3;
            }
            if (iH5 != 93) {
                if (iH5 == 123) {
                    this.f307069h = 1;
                    return 1;
                }
                this.f307065d--;
                int iM = m();
                if (iM != 0) {
                    return iM;
                }
                int iO = o();
                if (iO != 0) {
                    return iO;
                }
                if (!f(this.f307064c[this.f307065d])) {
                    throw H("Expected value");
                }
                a();
                this.f307069h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f307069h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw H("Unexpected value");
        }
        a();
        this.f307065d--;
        this.f307069h = 7;
        return 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f307069h = 0;
        this.f307073l[0] = 8;
        this.f307074m = 1;
        this.f307062a.close();
    }

    public final boolean e() {
        return this.f307063b;
    }

    String g() {
        return " at line " + (this.f307067f + 1) + " column " + ((this.f307065d - this.f307068g) + 1) + " path " + S();
    }

    public boolean hasNext() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        return (iC == 2 || iC == 4) ? false : true;
    }

    public String jc() throws IOException {
        String str;
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 10) {
            str = l();
        } else if (iC == 8) {
            str = j('\'');
        } else if (iC == 9) {
            str = j('\"');
        } else if (iC == 11) {
            str = this.f307072k;
            this.f307072k = null;
        } else if (iC == 15) {
            str = Long.toString(this.f307070i);
        } else {
            if (iC != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + g());
            }
            str = new String(this.f307064c, this.f307065d, this.f307071j);
            this.f307065d += this.f307071j;
        }
        this.f307069h = 0;
        int[] iArr = this.f307076o;
        int i10 = this.f307074m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public void m1() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 1) {
            q(3);
            this.f307069h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + g());
        }
    }

    public String na() throws IOException {
        String strJ;
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 14) {
            strJ = l();
        } else if (iC == 12) {
            strJ = j('\'');
        } else {
            if (iC != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + g());
            }
            strJ = j('\"');
        }
        this.f307069h = 0;
        this.f307075n[this.f307074m - 1] = strJ;
        return strJ;
    }

    public boolean nextBoolean() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 5) {
            this.f307069h = 0;
            int[] iArr = this.f307076o;
            int i10 = this.f307074m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iC == 6) {
            this.f307069h = 0;
            int[] iArr2 = this.f307076o;
            int i11 = this.f307074m - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + g());
    }

    public double nextDouble() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f307069h = 0;
            int[] iArr = this.f307076o;
            int i10 = this.f307074m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f307070i;
        }
        if (iC == 16) {
            this.f307072k = new String(this.f307064c, this.f307065d, this.f307071j);
            this.f307065d += this.f307071j;
        } else if (iC == 8 || iC == 9) {
            this.f307072k = j(iC == 8 ? '\'' : '\"');
        } else if (iC == 10) {
            this.f307072k = l();
        } else if (iC != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + g());
        }
        this.f307069h = 11;
        double d10 = Double.parseDouble(this.f307072k);
        if (!this.f307063b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new e("JSON forbids NaN and infinities: " + d10 + g());
        }
        this.f307072k = null;
        this.f307069h = 0;
        int[] iArr2 = this.f307076o;
        int i11 = this.f307074m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            long j10 = this.f307070i;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f307069h = 0;
                int[] iArr = this.f307076o;
                int i11 = this.f307074m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f307070i + g());
        }
        if (iC == 16) {
            this.f307072k = new String(this.f307064c, this.f307065d, this.f307071j);
            this.f307065d += this.f307071j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + g());
            }
            if (iC == 10) {
                this.f307072k = l();
            } else {
                this.f307072k = j(iC == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f307072k);
                this.f307069h = 0;
                int[] iArr2 = this.f307076o;
                int i13 = this.f307074m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f307069h = 11;
        double d10 = Double.parseDouble(this.f307072k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f307072k + g());
        }
        this.f307072k = null;
        this.f307069h = 0;
        int[] iArr3 = this.f307076o;
        int i15 = this.f307074m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f307069h = 0;
            int[] iArr = this.f307076o;
            int i10 = this.f307074m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f307070i;
        }
        if (iC == 16) {
            this.f307072k = new String(this.f307064c, this.f307065d, this.f307071j);
            this.f307065d += this.f307071j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + g());
            }
            if (iC == 10) {
                this.f307072k = l();
            } else {
                this.f307072k = j(iC == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f307072k);
                this.f307069h = 0;
                int[] iArr2 = this.f307076o;
                int i11 = this.f307074m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f307069h = 11;
        double d10 = Double.parseDouble(this.f307072k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f307072k + g());
        }
        this.f307072k = null;
        this.f307069h = 0;
        int[] iArr3 = this.f307076o;
        int i12 = this.f307074m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public c peek() throws IOException {
        int iC = this.f307069h;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
                return c.NAME;
            case 15:
            case 16:
                return c.NUMBER;
            case 17:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + g();
    }
}
