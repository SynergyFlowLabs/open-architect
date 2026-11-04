package com.google.gson.stream;

import com.facebook.internal.z0;
import com.google.gson.internal.a0;
import com.google.gson.internal.bind.g;
import com.google.gson.internal.k0;
import com.google.gson.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.k;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Closeable {
    private static final int H1 = 7;
    private static final int X = 2;
    private static final int Y = 3;
    private static final int Z = 4;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f125559g3 = 9;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f125560h3 = 10;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f125561i3 = 11;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f125562j3 = 12;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f125563k3 = 13;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f125564l3 = 14;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f125565m3 = 15;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f125566n3 = 16;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f125567o3 = 17;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f125568p0 = 5;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f125569p1 = 6;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f125570p2 = 8;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f125571p3 = 0;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f125572q3 = 1;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f125573r3 = 2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f125574s3 = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f125575t = -922337203685477580L;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f125576t3 = 4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f125577u3 = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f125578v = 0;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f125579v3 = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f125580w = 1;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f125581w3 = 7;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    static final int f125582x3 = 255;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    static final int f125583y3 = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f125584a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f125593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f125594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f125595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f125596m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String[] f125598o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f125599s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f125585b = y.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f125586c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f125587d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f125588e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f125589f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f125590g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f125591h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f125592i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f125597n = 1;

    /* JADX INFO: renamed from: com.google.gson.stream.a$a, reason: collision with other inner class name */
    class C1202a extends a0 {
        C1202a() {
        }

        @Override // com.google.gson.internal.a0
        public void a(a aVar) throws IOException {
            if (aVar instanceof g) {
                ((g) aVar).x0();
                return;
            }
            int iD = aVar.f125592i;
            if (iD == 0) {
                iD = aVar.d();
            }
            if (iD == 13) {
                aVar.f125592i = 9;
            } else if (iD == 12) {
                aVar.f125592i = 8;
            } else {
                if (iD != 14) {
                    throw aVar.g0("a name");
                }
                aVar.f125592i = 10;
            }
        }
    }

    static {
        a0.f125319a = new C1202a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f125596m = iArr;
        iArr[0] = 6;
        this.f125598o = new String[32];
        this.f125599s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f125584a = reader;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    private int E() throws IOException {
        char c10;
        int i10;
        char[] cArr = this.f125587d;
        int i11 = this.f125588e;
        int i12 = this.f125589f;
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
                            if (!m(c10)) {
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
                if (!e(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f125588e;
                i12 = this.f125589f;
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
            this.f125593j = j10;
            this.f125588e += i14;
            this.f125592i = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        }
        this.f125594k = i14;
        this.f125592i = 16;
        return 16;
    }

    private void H(int i10) throws e {
        int i11 = this.f125597n;
        if (i11 - 1 >= this.f125586c) {
            throw new e("Nesting limit " + this.f125586c + " reached" + o());
        }
        int[] iArr = this.f125596m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f125596m = Arrays.copyOf(iArr, i12);
            this.f125599s = Arrays.copyOf(this.f125599s, i12);
            this.f125598o = (String[]) Arrays.copyOf(this.f125598o, i12);
        }
        int[] iArr2 = this.f125596m;
        int i13 = this.f125597n;
        this.f125597n = i13 + 1;
        iArr2[i13] = i10;
    }

    private char I() throws IOException {
        int i10;
        if (this.f125588e == this.f125589f && !e(1)) {
            throw f0("Unterminated escape sequence");
        }
        char[] cArr = this.f125587d;
        int i11 = this.f125588e;
        int i12 = i11 + 1;
        this.f125588e = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
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
                            throw f0("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f125589f && !e(4)) {
                            throw f0("Unterminated escape sequence");
                        }
                        int i13 = this.f125588e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f125587d[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw f0("Malformed Unicode escape \\u" + new String(this.f125587d, this.f125588e, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f125588e += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f125585b == y.STRICT) {
            throw f0("Cannot escape a newline character in strict mode");
        }
        this.f125590g++;
        this.f125591h = i12;
        if (this.f125585b == y.STRICT) {
            throw f0("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    private void T(char c10) throws IOException {
        char[] cArr = this.f125587d;
        do {
            int i10 = this.f125588e;
            int i11 = this.f125589f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f125588e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f125588e = i12;
                    I();
                    i10 = this.f125588e;
                    i11 = this.f125589f;
                } else {
                    if (c11 == '\n') {
                        this.f125590g++;
                        this.f125591h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f125588e = i10;
        } while (e(1));
        throw f0("Unterminated string");
    }

    private boolean X(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f125588e + length > this.f125589f && !e(length)) {
                return false;
            }
            char[] cArr = this.f125587d;
            int i10 = this.f125588e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f125587d[this.f125588e + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f125590g++;
            this.f125591h = i10 + 1;
            this.f125588e++;
        }
    }

    private void Y() throws IOException {
        char c10;
        do {
            if (this.f125588e >= this.f125589f && !e(1)) {
                break;
            }
            char[] cArr = this.f125587d;
            int i10 = this.f125588e;
            int i11 = i10 + 1;
            this.f125588e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f125590g++;
                this.f125591h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void b() throws e {
        if (this.f125585b != y.LENIENT) {
            throw f0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void c() throws IOException {
        q(true);
        int i10 = this.f125588e;
        this.f125588e = i10 - 1;
        if (i10 + 4 <= this.f125589f || e(5)) {
            int i11 = this.f125588e;
            char[] cArr = this.f125587d;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f125588e = i11 + 5;
            }
        }
    }

    private void d0() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f125588e;
                if (i11 + i10 < this.f125589f) {
                    char c10 = this.f125587d[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                                                case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                                                    break;
                                                case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
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
                        b();
                    }
                    this.f125588e += i10;
                    return;
                }
                this.f125588e = i11 + i10;
                int i12 = 1 >> 1;
            }
        } while (e(1));
    }

    private boolean e(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f125587d;
        int i13 = this.f125591h;
        int i14 = this.f125588e;
        this.f125591h = i13 - i14;
        int i15 = this.f125589f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f125589f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f125589f = 0;
        }
        this.f125588e = 0;
        do {
            Reader reader = this.f125584a;
            int i17 = this.f125589f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f125589f + i18;
            this.f125589f = i11;
            if (this.f125590g == 0 && (i12 = this.f125591h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f125588e++;
                this.f125591h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private e f0(String str) throws e {
        throw new e(str + o() + "\nSee " + k0.a("malformed-json"));
    }

    private String g(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f125597n;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f125596m[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f125599s[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(i13);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f125598o[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException g0(String str) throws IOException {
        return new IllegalStateException("Expected " + str + " but was " + x() + o() + "\nSee " + k0.a(x() == c.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    private boolean m(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                        case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                            return false;
                        case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b();
        return false;
    }

    private int q(boolean z10) throws IOException {
        char[] cArr = this.f125587d;
        int i10 = this.f125588e;
        int i11 = this.f125589f;
        while (true) {
            if (i10 == i11) {
                this.f125588e = i10;
                if (!e(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + o());
                }
                i10 = this.f125588e;
                i11 = this.f125589f;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f125590g++;
                this.f125591h = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f125588e = i12;
                    if (i12 == i11) {
                        this.f125588e = i10;
                        boolean zE = e(2);
                        this.f125588e++;
                        if (!zE) {
                        }
                        return c10;
                    }
                    b();
                    int i13 = this.f125588e;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f125588e = i13 + 1;
                        if (!X("*/")) {
                            throw f0("Unterminated comment");
                        }
                        i10 = this.f125588e + 2;
                        i11 = this.f125589f;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f125588e = i13 + 1;
                        Y();
                        i10 = this.f125588e;
                        i11 = this.f125589f;
                    }
                } else {
                    if (c10 != '#') {
                        this.f125588e = i12;
                        return c10;
                    }
                    this.f125588e = i12;
                    b();
                    Y();
                    i10 = this.f125588e;
                    i11 = this.f125589f;
                }
            }
            i10 = i12;
        }
    }

    private String r(char c10) throws IOException {
        int i10;
        char[] cArr = this.f125587d;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f125588e;
            int i12 = this.f125589f;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (this.f125585b == y.STRICT && c11 < ' ') {
                            throw f0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c11 == c10) {
                            this.f125588e = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f125588e = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(I());
                            i11 = this.f125588e;
                            i12 = this.f125589f;
                        } else {
                            if (c11 == '\n') {
                                this.f125590g++;
                                this.f125591h = i14;
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
            this.f125588e = i11;
        } while (e(1));
        throw f0("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0050. Please report as an issue. */
    private String t() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f125588e;
                if (i12 + i11 < this.f125589f) {
                    char c10 = this.f125587d[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                                                case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                                                    break;
                                                case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
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
                        b();
                    }
                    i10 = i11;
                } else if (i11 >= this.f125587d.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f125587d, this.f125588e, i11);
                    this.f125588e += i11;
                    if (!e(1)) {
                    }
                } else if (!e(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f125587d, this.f125588e, i10);
                } else {
                    sb2.append(this.f125587d, this.f125588e, i10);
                    string = sb2.toString();
                }
                this.f125588e += i10;
                return string;
            }
        }
    }

    private int y() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f125587d[this.f125588e];
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
        boolean z10 = this.f125585b != y.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f125588e + i11 >= this.f125589f && !e(i11 + 1)) {
                return 0;
            }
            char c11 = this.f125587d[this.f125588e + i11];
            if (c11 != str.charAt(i11) && (!z10 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f125588e + length < this.f125589f || e(length + 1)) && m(this.f125587d[this.f125588e + length])) {
            return 0;
        }
        this.f125588e += length;
        this.f125592i = i10;
        return i10;
    }

    @Deprecated
    public final void C1(boolean z10) {
        R(z10 ? y.LENIENT : y.LEGACY_STRICT);
    }

    public void F0() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw g0("END_ARRAY");
        }
        int i10 = this.f125597n;
        this.f125597n = i10 - 1;
        int[] iArr = this.f125599s;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f125592i = 0;
    }

    public void F1() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw g0("END_OBJECT");
        }
        int i10 = this.f125597n;
        int i11 = i10 - 1;
        this.f125597n = i11;
        this.f125598o[i11] = null;
        int[] iArr = this.f125599s;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f125592i = 0;
    }

    public void J0() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 3) {
            throw g0("BEGIN_ARRAY");
        }
        H(1);
        this.f125599s[this.f125597n - 1] = 0;
        this.f125592i = 0;
    }

    public final void N(int i10) {
        if (i10 >= 0) {
            this.f125586c = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid nesting limit: " + i10);
    }

    public final void R(y yVar) {
        Objects.requireNonNull(yVar);
        this.f125585b = yVar;
    }

    public String S() {
        return g(false);
    }

    public void a7() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            throw g0(AbstractJsonLexerKt.NULL);
        }
        this.f125592i = 0;
        int[] iArr = this.f125599s;
        int i10 = this.f125597n - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public void a9() throws IOException {
        int i10 = 0;
        do {
            int iD = this.f125592i;
            if (iD == 0) {
                iD = d();
            }
            switch (iD) {
                case 1:
                    H(3);
                    i10++;
                    this.f125592i = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f125598o[this.f125597n - 1] = null;
                    }
                    this.f125597n--;
                    i10--;
                    this.f125592i = 0;
                    break;
                case 3:
                    H(1);
                    i10++;
                    this.f125592i = 0;
                    break;
                case 4:
                    this.f125597n--;
                    i10--;
                    this.f125592i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f125592i = 0;
                    break;
                case 8:
                    T('\'');
                    this.f125592i = 0;
                    break;
                case 9:
                    T('\"');
                    this.f125592i = 0;
                    break;
                case 10:
                    d0();
                    this.f125592i = 0;
                    break;
                case 12:
                    T('\'');
                    if (i10 == 0) {
                        this.f125598o[this.f125597n - 1] = "<skipped>";
                    }
                    this.f125592i = 0;
                    break;
                case 13:
                    T('\"');
                    if (i10 == 0) {
                        this.f125598o[this.f125597n - 1] = "<skipped>";
                    }
                    this.f125592i = 0;
                    break;
                case 14:
                    d0();
                    if (i10 == 0) {
                        this.f125598o[this.f125597n - 1] = "<skipped>";
                    }
                    this.f125592i = 0;
                    break;
                case 16:
                    this.f125588e += this.f125594k;
                    this.f125592i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f125599s;
        int i11 = this.f125597n - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f125592i = 0;
        this.f125596m[0] = 8;
        this.f125597n = 1;
        this.f125584a.close();
    }

    int d() throws IOException {
        int iQ;
        int[] iArr = this.f125596m;
        int i10 = this.f125597n;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iQ2 = q(true);
            if (iQ2 != 44) {
                if (iQ2 != 59) {
                    if (iQ2 != 93) {
                        throw f0("Unterminated array");
                    }
                    this.f125592i = 4;
                    return 4;
                }
                b();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iQ = q(true)) != 44) {
                    if (iQ != 59) {
                        if (iQ != 125) {
                            throw f0("Unterminated object");
                        }
                        this.f125592i = 2;
                        return 2;
                    }
                    b();
                }
                int iQ3 = q(true);
                if (iQ3 == 34) {
                    this.f125592i = 13;
                    return 13;
                }
                if (iQ3 == 39) {
                    b();
                    this.f125592i = 12;
                    return 12;
                }
                if (iQ3 == 125) {
                    if (i11 == 5) {
                        throw f0("Expected name");
                    }
                    this.f125592i = 2;
                    return 2;
                }
                b();
                this.f125588e--;
                if (!m((char) iQ3)) {
                    throw f0("Expected name");
                }
                this.f125592i = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iQ4 = q(true);
                if (iQ4 != 58) {
                    if (iQ4 != 61) {
                        throw f0("Expected ':'");
                    }
                    b();
                    if (this.f125588e < this.f125589f || e(1)) {
                        char[] cArr = this.f125587d;
                        int i12 = this.f125588e;
                        if (cArr[i12] == '>') {
                            this.f125588e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f125585b == y.LENIENT) {
                    c();
                }
                this.f125596m[this.f125597n - 1] = 7;
            } else if (i11 == 7) {
                if (q(false) == -1) {
                    this.f125592i = 17;
                    return 17;
                }
                b();
                this.f125588e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iQ5 = q(true);
        if (iQ5 == 34) {
            this.f125592i = 9;
            return 9;
        }
        if (iQ5 == 39) {
            b();
            this.f125592i = 8;
            return 8;
        }
        if (iQ5 != 44 && iQ5 != 59) {
            if (iQ5 == 91) {
                this.f125592i = 3;
                return 3;
            }
            if (iQ5 != 93) {
                if (iQ5 == 123) {
                    this.f125592i = 1;
                    return 1;
                }
                this.f125588e--;
                int iY = y();
                if (iY != 0) {
                    return iY;
                }
                int iE = E();
                if (iE != 0) {
                    return iE;
                }
                if (!m(this.f125587d[this.f125588e])) {
                    throw f0("Expected value");
                }
                b();
                this.f125592i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f125592i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw f0("Unexpected value");
        }
        b();
        this.f125588e--;
        this.f125592i = 7;
        return 7;
    }

    public final int f() {
        return this.f125586c;
    }

    public String h() {
        return g(true);
    }

    public boolean hasNext() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 17) ? false : true;
    }

    public final y j() {
        return this.f125585b;
    }

    public String jc() throws IOException {
        String str;
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = t();
        } else if (iD == 8) {
            str = r('\'');
        } else if (iD == 9) {
            str = r('\"');
        } else if (iD == 11) {
            str = this.f125595l;
            this.f125595l = null;
        } else if (iD == 15) {
            str = Long.toString(this.f125593j);
        } else {
            if (iD != 16) {
                throw g0("a string");
            }
            str = new String(this.f125587d, this.f125588e, this.f125594k);
            this.f125588e += this.f125594k;
        }
        this.f125592i = 0;
        int[] iArr = this.f125599s;
        int i10 = this.f125597n - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final boolean l() {
        return this.f125585b == y.LENIENT;
    }

    public void m1() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 1) {
            throw g0("BEGIN_OBJECT");
        }
        H(3);
        this.f125592i = 0;
    }

    public String na() throws IOException {
        String strR;
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strR = t();
        } else if (iD == 12) {
            strR = r('\'');
        } else {
            if (iD != 13) {
                throw g0("a name");
            }
            strR = r('\"');
        }
        this.f125592i = 0;
        this.f125598o[this.f125597n - 1] = strR;
        return strR;
    }

    public boolean nextBoolean() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.f125592i = 0;
            int[] iArr = this.f125599s;
            int i10 = this.f125597n - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iD != 6) {
            throw g0("a boolean");
        }
        this.f125592i = 0;
        int[] iArr2 = this.f125599s;
        int i11 = this.f125597n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f125592i = 0;
            int[] iArr = this.f125599s;
            int i10 = this.f125597n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f125593j;
        }
        if (iD == 16) {
            this.f125595l = new String(this.f125587d, this.f125588e, this.f125594k);
            this.f125588e += this.f125594k;
        } else if (iD == 8 || iD == 9) {
            this.f125595l = r(iD == 8 ? '\'' : '\"');
        } else if (iD == 10) {
            this.f125595l = t();
        } else if (iD != 11) {
            throw g0("a double");
        }
        this.f125592i = 11;
        double d10 = Double.parseDouble(this.f125595l);
        if (this.f125585b != y.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw f0("JSON forbids NaN and infinities: " + d10);
        }
        this.f125595l = null;
        this.f125592i = 0;
        int[] iArr2 = this.f125599s;
        int i11 = this.f125597n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j10 = this.f125593j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f125592i = 0;
                int[] iArr = this.f125599s;
                int i11 = this.f125597n - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f125593j + o());
        }
        if (iD == 16) {
            this.f125595l = new String(this.f125587d, this.f125588e, this.f125594k);
            this.f125588e += this.f125594k;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw g0("an int");
            }
            if (iD == 10) {
                this.f125595l = t();
            } else {
                this.f125595l = r(iD == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f125595l);
                this.f125592i = 0;
                int[] iArr2 = this.f125599s;
                int i13 = this.f125597n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f125592i = 11;
        double d10 = Double.parseDouble(this.f125595l);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f125595l + o());
        }
        this.f125595l = null;
        this.f125592i = 0;
        int[] iArr3 = this.f125599s;
        int i15 = this.f125597n - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f125592i = 0;
            int[] iArr = this.f125599s;
            int i10 = this.f125597n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f125593j;
        }
        if (iD == 16) {
            this.f125595l = new String(this.f125587d, this.f125588e, this.f125594k);
            this.f125588e += this.f125594k;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw g0("a long");
            }
            if (iD == 10) {
                this.f125595l = t();
            } else {
                this.f125595l = r(iD == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f125595l);
                this.f125592i = 0;
                int[] iArr2 = this.f125599s;
                int i11 = this.f125597n - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f125592i = 11;
        double d10 = Double.parseDouble(this.f125595l);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f125595l + o());
        }
        this.f125595l = null;
        this.f125592i = 0;
        int[] iArr3 = this.f125599s;
        int i12 = this.f125597n - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    String o() {
        return " at line " + (this.f125590g + 1) + " column " + ((this.f125588e - this.f125591h) + 1) + " path " + S();
    }

    public String toString() {
        return getClass().getSimpleName() + o();
    }

    public c x() throws IOException {
        int iD = this.f125592i;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
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
}
