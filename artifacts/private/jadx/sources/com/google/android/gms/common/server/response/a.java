package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public class a<T extends FastJsonResponse> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f106855g = {AbstractJsonLexerKt.UNICODE_ESC, 'l', 'l'};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char[] f106856h = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e'};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char[] f106857i = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e', '\"'};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f106858j = {'a', 'l', ni.f.f333366c, 'e'};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char[] f106859k = {'a', 'l', ni.f.f333366c, 'e', '\"'};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f106860l = {'\n'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final j f106861m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final j f106862n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final j f106863o = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final j f106864p = new e();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final j f106865q = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final j f106866r = new g();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final j f106867s = new h();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f106868t = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f106869a = new char[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f106870b = new char[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f106871c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StringBuilder f106872d = new StringBuilder(32);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StringBuilder f106873e = new StringBuilder(1024);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Stack f106874f = new Stack();

    /* JADX INFO: renamed from: com.google.android.gms.common.server.response.a$a, reason: collision with other inner class name */
    @a0
    @g6.a
    public static class C0972a extends Exception {
        public C0972a(@NonNull String str) {
            super(str);
        }

        public C0972a(@NonNull String str, @NonNull Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public C0972a(@NonNull Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(BufferedReader bufferedReader, boolean z10) throws IOException, C0972a {
        char cK = k(bufferedReader);
        if (cK == '\"') {
            if (z10) {
                throw new C0972a("No boolean value found in string");
            }
            return A(bufferedReader, true);
        }
        if (cK == 'f') {
            z(bufferedReader, z10 ? f106859k : f106858j);
            return false;
        }
        if (cK == 'n') {
            z(bufferedReader, f106855g);
            return false;
        }
        if (cK == 't') {
            z(bufferedReader, z10 ? f106857i : f106856h);
            return true;
        }
        throw new C0972a("Unexpected token: " + cK);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x026d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x026b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean B(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws IOException, C0972a {
        int i10;
        HashMap map;
        char cK;
        Map<String, FastJsonResponse.Field<?, ?>> mapC = fastJsonResponse.c();
        String strS = s(bufferedReader);
        if (strS == null) {
            y(1);
            return false;
        }
        while (strS != null) {
            FastJsonResponse.Field<?, ?> field = mapC.get(strS);
            if (field == null) {
                strS = t(bufferedReader);
            } else {
                this.f106874f.push(4);
                int i11 = field.f106838b;
                switch (i11) {
                    case 0:
                        if (field.f106839c) {
                            fastJsonResponse.R(field, w(bufferedReader, f106861m));
                        } else {
                            fastJsonResponse.Q(field, n(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 1:
                        if (field.f106839c) {
                            fastJsonResponse.C(field, w(bufferedReader, f106867s));
                        } else {
                            fastJsonResponse.A(field, v(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 2:
                        if (field.f106839c) {
                            fastJsonResponse.V(field, w(bufferedReader, f106862n));
                        } else {
                            fastJsonResponse.U(field, p(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 3:
                        if (field.f106839c) {
                            fastJsonResponse.O(field, w(bufferedReader, f106863o));
                        } else {
                            fastJsonResponse.M(field, m(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 4:
                        if (field.f106839c) {
                            fastJsonResponse.K(field, w(bufferedReader, f106864p));
                        } else {
                            fastJsonResponse.I(field, l(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 5:
                        if (field.f106839c) {
                            fastJsonResponse.y(field, w(bufferedReader, f106868t));
                        } else {
                            fastJsonResponse.w(field, u(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 6:
                        if (field.f106839c) {
                            fastJsonResponse.F(field, w(bufferedReader, f106865q));
                        } else {
                            fastJsonResponse.E(field, A(bufferedReader, false));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 7:
                        if (field.f106839c) {
                            fastJsonResponse.r(field, w(bufferedReader, f106866r));
                        } else {
                            fastJsonResponse.p(field, q(bufferedReader));
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.H(field, com.google.android.gms.common.util.c.a(r(bufferedReader, this.f106871c, this.f106873e, f106860l)));
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 9:
                        fastJsonResponse.H(field, com.google.android.gms.common.util.c.b(r(bufferedReader, this.f106871c, this.f106873e, f106860l)));
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 10:
                        char cK2 = k(bufferedReader);
                        if (cK2 == 'n') {
                            z(bufferedReader, f106855g);
                            map = null;
                        } else {
                            if (cK2 != '{') {
                                throw new C0972a("Expected start of a map object");
                            }
                            this.f106874f.push(1);
                            map = new HashMap();
                            while (true) {
                                char cK3 = k(bufferedReader);
                                if (cK3 == 0) {
                                    throw new C0972a("Unexpected EOF");
                                }
                                if (cK3 == '\"') {
                                    String strB = b(bufferedReader, this.f106870b, this.f106872d, null);
                                    if (k(bufferedReader) != ':') {
                                        throw new C0972a("No map value found for key ".concat(String.valueOf(strB)));
                                    }
                                    if (k(bufferedReader) != '\"') {
                                        throw new C0972a("Expected String value for key ".concat(String.valueOf(strB)));
                                    }
                                    map.put(strB, b(bufferedReader, this.f106870b, this.f106872d, null));
                                    char cK4 = k(bufferedReader);
                                    if (cK4 != ',') {
                                        if (cK4 != '}') {
                                            throw new C0972a("Unexpected character while parsing string map: " + cK4);
                                        }
                                        y(1);
                                    }
                                } else if (cK3 == '}') {
                                    y(1);
                                }
                                i10 = 4;
                                y(i10);
                                y(2);
                                cK = k(bufferedReader);
                                if (cK == ',') {
                                    strS = s(bufferedReader);
                                } else {
                                    if (cK != '}') {
                                        throw new C0972a("Expected end of object or field separator, but found: " + cK);
                                    }
                                    strS = null;
                                }
                            }
                        }
                        fastJsonResponse.q(field, map);
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    case 11:
                        if (!field.f106839c) {
                            char cK5 = k(bufferedReader);
                            if (cK5 == 'n') {
                                z(bufferedReader, f106855g);
                                fastJsonResponse.b(field, field.f106842f, null);
                            } else {
                                this.f106874f.push(1);
                                if (cK5 != '{') {
                                    throw new C0972a("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseK3 = field.k3();
                                    B(bufferedReader, fastJsonResponseK3);
                                    fastJsonResponse.b(field, field.f106842f, fastJsonResponseK3);
                                } catch (IllegalAccessException e10) {
                                    throw new C0972a("Error instantiating inner object", e10);
                                } catch (InstantiationException e11) {
                                    throw new C0972a("Error instantiating inner object", e11);
                                }
                            }
                            break;
                        } else {
                            char cK6 = k(bufferedReader);
                            if (cK6 == 'n') {
                                z(bufferedReader, f106855g);
                                fastJsonResponse.a(field, field.f106842f, null);
                            } else {
                                this.f106874f.push(5);
                                if (cK6 != '[') {
                                    throw new C0972a("Expected array start");
                                }
                                fastJsonResponse.a(field, field.f106842f, x(bufferedReader, field));
                            }
                        }
                        i10 = 4;
                        y(i10);
                        y(2);
                        cK = k(bufferedReader);
                        if (cK == ',') {
                            strS = s(bufferedReader);
                        } else {
                            if (cK != '}') {
                                throw new C0972a("Expected end of object or field separator, but found: " + cK);
                            }
                            strS = null;
                        }
                        break;
                    default:
                        throw new C0972a("Invalid field type " + i11);
                }
            }
        }
        y(1);
        return true;
    }

    private static final String b(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @p0 char[] cArr2) throws IOException, C0972a {
        sb2.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 == -1) {
                throw new C0972a("Unexpected EOF while parsing string");
            }
            int i11 = 0;
            while (i11 < i10) {
                char c10 = cArr[i11];
                if (Character.isISOControl(c10) && (cArr2 == null || cArr2[0] != c10)) {
                    throw new C0972a("Unexpected control character while reading string");
                }
                int i12 = i11 + 1;
                if (c10 != '\"') {
                    if (c10 == '\\') {
                        z10 = !z10;
                        z11 = true;
                    }
                    i11 = i12;
                } else if (!z10) {
                    sb2.append(cArr, 0, i11);
                    bufferedReader.reset();
                    bufferedReader.skip(i12);
                    return z11 ? r.c(sb2.toString()) : sb2.toString();
                }
                z10 = false;
                i11 = i12;
            }
            sb2.append(cArr, 0, i10);
            bufferedReader.mark(cArr.length);
        }
    }

    private final char k(BufferedReader bufferedReader) throws IOException, C0972a {
        if (bufferedReader.read(this.f106869a) != -1) {
            while (Character.isWhitespace(this.f106869a[0])) {
                if (bufferedReader.read(this.f106869a) == -1) {
                }
            }
            return this.f106869a[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double l(BufferedReader bufferedReader) throws IOException, C0972a {
        int iO = o(bufferedReader, this.f106871c);
        if (iO == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.f106871c, 0, iO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m(BufferedReader bufferedReader) throws IOException, C0972a {
        int iO = o(bufferedReader, this.f106871c);
        if (iO == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.f106871c, 0, iO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(BufferedReader bufferedReader) throws IOException, C0972a {
        int i10;
        int i11;
        int iO = o(bufferedReader, this.f106871c);
        if (iO == 0) {
            return 0;
        }
        char[] cArr = this.f106871c;
        if (iO <= 0) {
            throw new C0972a("No number to parse");
        }
        char c10 = cArr[0];
        int i12 = c10 == '-' ? Integer.MIN_VALUE : androidx.media3.common.j.f60676f;
        int i13 = c10 == '-' ? 1 : 0;
        if (i13 < iO) {
            i11 = i13 + 1;
            int iDigit = Character.digit(cArr[i13], 10);
            if (iDigit < 0) {
                throw new C0972a("Unexpected non-digit character");
            }
            i10 = -iDigit;
        } else {
            i10 = 0;
            i11 = i13;
        }
        while (i11 < iO) {
            int i14 = i11 + 1;
            int iDigit2 = Character.digit(cArr[i11], 10);
            if (iDigit2 < 0) {
                throw new C0972a("Unexpected non-digit character");
            }
            if (i10 < -214748364) {
                throw new C0972a("Number too large");
            }
            int i15 = i10 * 10;
            if (i15 < i12 + iDigit2) {
                throw new C0972a("Number too large");
            }
            i10 = i15 - iDigit2;
            i11 = i14;
        }
        if (i13 == 0) {
            return -i10;
        }
        if (i11 > 1) {
            return i10;
        }
        throw new C0972a("No digits to parse");
    }

    private final int o(BufferedReader bufferedReader, char[] cArr) throws IOException, C0972a {
        int i10;
        char cK = k(bufferedReader);
        if (cK == 0) {
            throw new C0972a("Unexpected EOF");
        }
        if (cK == ',') {
            throw new C0972a("Missing value");
        }
        if (cK == 'n') {
            z(bufferedReader, f106855g);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cK == '\"') {
            i10 = 0;
            boolean z10 = false;
            while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                char c10 = cArr[i10];
                if (Character.isISOControl(c10)) {
                    throw new C0972a("Unexpected control character while reading string");
                }
                int i11 = i10 + 1;
                if (c10 != '\"') {
                    if (c10 == '\\') {
                        z10 = !z10;
                    }
                    i10 = i11;
                } else if (!z10) {
                    bufferedReader.reset();
                    bufferedReader.skip(i11);
                    return i10;
                }
                z10 = false;
                i10 = i11;
            }
        } else {
            cArr[0] = cK;
            i10 = 1;
            while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                char c11 = cArr[i10];
                if (c11 == '}' || c11 == ',' || Character.isWhitespace(c11) || cArr[i10] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i10 - 1);
                    cArr[i10] = 0;
                    return i10;
                }
                i10++;
            }
        }
        if (i10 == 1024) {
            throw new C0972a("Absurdly long value");
        }
        throw new C0972a("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long p(BufferedReader bufferedReader) throws IOException, C0972a {
        long j10;
        int i10;
        int iO = o(bufferedReader, this.f106871c);
        if (iO == 0) {
            return 0L;
        }
        char[] cArr = this.f106871c;
        if (iO <= 0) {
            throw new C0972a("No number to parse");
        }
        char c10 = cArr[0];
        long j11 = c10 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i11 = c10 == '-' ? 1 : 0;
        if (i11 < iO) {
            i10 = i11 + 1;
            int iDigit = Character.digit(cArr[i11], 10);
            if (iDigit < 0) {
                throw new C0972a("Unexpected non-digit character");
            }
            j10 = -iDigit;
        } else {
            j10 = 0;
            i10 = i11;
        }
        while (i10 < iO) {
            int i12 = i10 + 1;
            int iDigit2 = Character.digit(cArr[i10], 10);
            if (iDigit2 < 0) {
                throw new C0972a("Unexpected non-digit character");
            }
            if (j10 < -922337203685477580L) {
                throw new C0972a("Number too large");
            }
            long j12 = j10 * 10;
            long j13 = iDigit2;
            if (j12 < j11 + j13) {
                throw new C0972a("Number too large");
            }
            j10 = j12 - j13;
            i10 = i12;
        }
        if (i11 == 0) {
            return -j10;
        }
        if (i10 > 1) {
            return j10;
        }
        throw new C0972a("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public final String q(BufferedReader bufferedReader) throws IOException, C0972a {
        return r(bufferedReader, this.f106870b, this.f106872d, null);
    }

    @p0
    private final String r(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @p0 char[] cArr2) throws IOException, C0972a {
        char cK = k(bufferedReader);
        if (cK == '\"') {
            return b(bufferedReader, cArr, sb2, cArr2);
        }
        if (cK != 'n') {
            throw new C0972a("Expected string");
        }
        z(bufferedReader, f106855g);
        int i10 = 5 & 0;
        return null;
    }

    @p0
    private final String s(BufferedReader bufferedReader) throws IOException, C0972a {
        this.f106874f.push(2);
        char cK = k(bufferedReader);
        if (cK == '\"') {
            this.f106874f.push(3);
            String strB = b(bufferedReader, this.f106870b, this.f106872d, null);
            y(3);
            if (k(bufferedReader) == ':') {
                return strB;
            }
            throw new C0972a("Expected key/value separator");
        }
        if (cK == ']') {
            y(2);
            y(1);
            y(5);
            return null;
        }
        if (cK == '}') {
            y(2);
            return null;
        }
        throw new C0972a("Unexpected token: " + cK);
    }

    @p0
    private final String t(BufferedReader bufferedReader) throws IOException, C0972a {
        bufferedReader.mark(1024);
        char cK = k(bufferedReader);
        int i10 = 1;
        if (cK != '\"') {
            if (cK == ',') {
                throw new C0972a("Missing value");
            }
            if (cK == '[') {
                this.f106874f.push(5);
                bufferedReader.mark(32);
                if (k(bufferedReader) == ']') {
                    y(5);
                } else {
                    bufferedReader.reset();
                    boolean z10 = false;
                    boolean z11 = false;
                    while (i10 > 0) {
                        char cK2 = k(bufferedReader);
                        if (cK2 == 0) {
                            throw new C0972a("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cK2)) {
                            throw new C0972a("Unexpected control character while reading array");
                        }
                        if (cK2 == '\"') {
                            if (!z11) {
                                z10 = !z10;
                            }
                            cK2 = '\"';
                        }
                        if (cK2 == '[') {
                            if (!z10) {
                                i10++;
                            }
                            cK2 = '[';
                        }
                        if (cK2 == ']' && !z10) {
                            i10--;
                        }
                        z11 = (cK2 == '\\' && z10) ? !z11 : false;
                    }
                    y(5);
                }
            } else if (cK != '{') {
                bufferedReader.reset();
                o(bufferedReader, this.f106871c);
            } else {
                this.f106874f.push(1);
                bufferedReader.mark(32);
                char cK3 = k(bufferedReader);
                if (cK3 == '}') {
                    y(1);
                } else {
                    if (cK3 != '\"') {
                        throw new C0972a("Unexpected token " + cK3);
                    }
                    bufferedReader.reset();
                    s(bufferedReader);
                    while (t(bufferedReader) != null) {
                    }
                    y(1);
                }
            }
        } else {
            if (bufferedReader.read(this.f106869a) == -1) {
                throw new C0972a("Unexpected EOF while parsing string");
            }
            char c10 = this.f106869a[0];
            boolean z12 = false;
            while (true) {
                if (c10 == '\"') {
                    if (!z12) {
                        break;
                    }
                    z12 = true;
                    c10 = '\"';
                }
                z12 = c10 == '\\' ? !z12 : false;
                if (bufferedReader.read(this.f106869a) == -1) {
                    throw new C0972a("Unexpected EOF while parsing string");
                }
                c10 = this.f106869a[0];
                if (Character.isISOControl(c10)) {
                    throw new C0972a("Unexpected control character while reading string");
                }
            }
        }
        char cK4 = k(bufferedReader);
        if (cK4 == ',') {
            y(2);
            return s(bufferedReader);
        }
        if (cK4 == '}') {
            y(2);
            return null;
        }
        throw new C0972a("Unexpected token " + cK4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public final BigDecimal u(BufferedReader bufferedReader) throws IOException, C0972a {
        int iO = o(bufferedReader, this.f106871c);
        if (iO == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f106871c, 0, iO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public final BigInteger v(BufferedReader bufferedReader) throws IOException, C0972a {
        int iO = o(bufferedReader, this.f106871c);
        if (iO == 0) {
            return null;
        }
        return new BigInteger(new String(this.f106871c, 0, iO));
    }

    @p0
    private final ArrayList w(BufferedReader bufferedReader, j jVar) throws IOException, C0972a {
        char cK = k(bufferedReader);
        if (cK == 'n') {
            z(bufferedReader, f106855g);
            return null;
        }
        if (cK != '[') {
            throw new C0972a("Expected start of array");
        }
        this.f106874f.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cK2 = k(bufferedReader);
            if (cK2 == 0) {
                throw new C0972a("Unexpected EOF");
            }
            if (cK2 != ',') {
                if (cK2 == ']') {
                    y(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(jVar.a(this, bufferedReader));
            }
        }
    }

    @p0
    private final ArrayList x(BufferedReader bufferedReader, FastJsonResponse.Field field) throws IOException, C0972a {
        ArrayList arrayList = new ArrayList();
        char cK = k(bufferedReader);
        if (cK == ']') {
            y(5);
            return arrayList;
        }
        if (cK == 'n') {
            z(bufferedReader, f106855g);
            y(5);
            return null;
        }
        if (cK != '{') {
            throw new C0972a("Unexpected token: " + cK);
        }
        this.f106874f.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseK3 = field.k3();
                if (!B(bufferedReader, fastJsonResponseK3)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseK3);
                char cK2 = k(bufferedReader);
                if (cK2 != ',') {
                    if (cK2 == ']') {
                        y(5);
                        return arrayList;
                    }
                    throw new C0972a("Unexpected token: " + cK2);
                }
                if (k(bufferedReader) != '{') {
                    throw new C0972a("Expected start of next object in array");
                }
                this.f106874f.push(1);
            } catch (IllegalAccessException e10) {
                throw new C0972a("Error instantiating inner object", e10);
            } catch (InstantiationException e11) {
                throw new C0972a("Error instantiating inner object", e11);
            }
        }
    }

    private final void y(int i10) throws C0972a {
        if (this.f106874f.isEmpty()) {
            throw new C0972a("Expected state " + i10 + " but had empty stack");
        }
        int iIntValue = ((Integer) this.f106874f.pop()).intValue();
        if (iIntValue == i10) {
            return;
        }
        throw new C0972a("Expected state " + i10 + " but had " + iIntValue);
    }

    private final void z(BufferedReader bufferedReader, char[] cArr) throws IOException, C0972a {
        int i10 = 0;
        while (true) {
            int length = cArr.length;
            if (i10 >= length) {
                return;
            }
            int i11 = bufferedReader.read(this.f106870b, 0, length - i10);
            if (i11 == -1) {
                throw new C0972a("Unexpected EOF");
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (cArr[i12 + i10] != this.f106870b[i12]) {
                    throw new C0972a("Unexpected character");
                }
            }
            i10 += i11;
        }
    }

    @g6.a
    public void a(@NonNull InputStream inputStream, @NonNull T t10) throws C0972a {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.f106874f.push(0);
                char cK = k(bufferedReader);
                if (cK == 0) {
                    throw new C0972a("No data to parse");
                }
                if (cK == '[') {
                    this.f106874f.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> mapC = t10.c();
                    if (mapC.size() != 1) {
                        throw new C0972a("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = mapC.entrySet().iterator().next().getValue();
                    t10.a(value, value.f106842f, x(bufferedReader, value));
                } else {
                    if (cK != '{') {
                        throw new C0972a("Unexpected token: " + cK);
                    }
                    this.f106874f.push(1);
                    B(bufferedReader, t10);
                }
                y(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } catch (IOException e10) {
                throw new C0972a(e10);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }
}
