package com.badlogic.gdx.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f95186e = e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final short[] f95187f = i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f95188g = m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f95189h = k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f95190i = j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short[] f95191j = g();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f95192k = h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f95193l = n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f95194m = l();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f95195n = f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f95196o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f95197p = 35;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f95198q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f95199r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f95200s = 23;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f95201t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<c0> f95202a = new b<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<c0> f95203b = new b<>(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f95204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c0 f95205d;

    private void c(String str, c0 c0Var) {
        c0Var.d1(str);
        c0 c0Var2 = this.f95205d;
        if (c0Var2 == null) {
            this.f95205d = c0Var;
            this.f95204c = c0Var;
            return;
        }
        if (!c0Var2.t0() && !this.f95205d.F0()) {
            this.f95204c = this.f95205d;
            return;
        }
        c0 c0Var3 = this.f95205d;
        if (c0Var3.f95237i == 0) {
            c0Var3.f95234f = c0Var;
        } else {
            c0 c0VarPop = this.f95203b.pop();
            c0VarPop.f95235g = c0Var;
            c0Var.f95236h = c0VarPop;
        }
        this.f95203b.c(c0Var);
        this.f95205d.f95237i++;
    }

    private static byte[] e() {
        return new byte[]{0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5};
    }

    private static byte[] f() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    }

    private static short[] g() {
        return new short[]{0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, 111, 113, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207};
    }

    private static byte[] h() {
        return new byte[]{1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, 3, com.google.common.base.c.f116464q, 11, 10, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, com.google.common.base.c.f116465r, 3, 19, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, 19, 3, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, 3, com.google.common.base.c.f116472y, com.google.common.base.c.f116472y, com.google.common.base.c.B, 3, com.google.common.base.c.C, 3, com.google.common.base.c.D, 3, com.google.common.base.c.E, com.google.common.base.c.f116472y, com.google.common.base.c.A, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.H, com.google.common.base.c.I, 32, 3, 33, 34, 33, 33, com.google.common.base.c.f116462o, 35, com.google.common.base.c.f116464q, 3, 34, 34, com.google.common.base.c.f116461n, 36, 37, 3, com.google.common.base.c.f116464q, 34, 10, com.google.common.base.c.f116465r, 3, 36, 36, com.google.common.base.c.f116461n, 3, 38, 3, 3, 36, 10, 39, 39, 3, 40, 40, 3, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116461n, 3, 41, 3, com.google.common.base.c.f116464q, com.google.common.base.c.f116462o, 10, 42, 42, 3, 43, 43, 3, com.google.common.base.c.F, 3, 44, 44, 3, 45, 45, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 54, 54, 56, 57, 58, 3, 59, 60, 59, 59, 49, kotlin.io.encoding.a.f312535i, 52, 3, 60, 60, 48, 62, 63, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, com.google.common.primitives.t.f119782a, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0};
    }

    private static short[] i() {
        return new short[]{0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184};
    }

    private static byte[] j() {
        return new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
    }

    private static byte[] k() {
        return new byte[]{0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0};
    }

    private static byte[] l() {
        return new byte[]{com.google.common.base.c.f116462o, 0, com.google.common.base.c.f116464q, 0, 0, 7, 3, 11, 1, 11, 17, 0, com.google.common.base.c.f116471x, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, com.google.common.base.c.f116462o, com.google.common.base.c.f116464q, 0, 7, 3, 1, 1, 1, 1, com.google.common.base.c.A, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, com.google.common.base.c.f116462o, 0, com.google.common.base.c.f116464q, 0, 0, 7, 9, 3, 1, 1, 1, 1, com.google.common.base.c.D, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0};
    }

    private static char[] m() {
        return new char[]{org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_OBJ, '\t', '\n', '*', '/', '\"', '*', '/', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.END_OBJ, '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', '/', AbstractJsonLexerKt.COLON, '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', '/', AbstractJsonLexerKt.COLON, '\t', '\n', '*', '/', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_OBJ, '\t', '\n', '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.END_OBJ, '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.END_OBJ, org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.END_OBJ, '\t', '\n', '\"', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.END_OBJ, '\t', '\n', '*', '/', '*', '/', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.END_OBJ, '\t', '\n', '*', '/', '*', '/', '\"', '*', '/', '*', '/', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_OBJ, '\t', '\n', '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.END_LIST, '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.END_LIST, org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_OBJ, '\t', '\n', '\"', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_OBJ, '\t', '\n', '*', '/', '*', '/', org.apache.commons.lang3.k.f337188d, ' ', '\"', AbstractJsonLexerKt.COMMA, '/', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_OBJ, '\t', '\n', '*', '/', '*', '/', '*', '/', org.apache.commons.lang3.k.f337188d, ' ', '/', '\t', '\n', org.apache.commons.lang3.k.f337188d, ' ', '/', '\t', '\n', 0};
    }

    private static byte[] n() {
        return new byte[]{35, 1, 3, 0, 4, 36, 36, 36, 36, 1, 6, 5, com.google.common.base.c.f116462o, 17, com.google.common.base.c.f116473z, 37, 7, 8, 9, 7, 8, 9, 7, 10, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, 11, 11, 11, com.google.common.base.c.f116461n, 17, 19, 37, 11, com.google.common.base.c.f116461n, 19, com.google.common.base.c.f116463p, com.google.common.base.c.f116465r, com.google.common.base.c.f116464q, com.google.common.base.c.f116463p, com.google.common.base.c.f116461n, com.google.common.base.c.f116468u, 17, 11, 9, 5, com.google.common.base.c.B, com.google.common.base.c.A, com.google.common.base.c.E, com.google.common.base.c.I, 34, com.google.common.base.c.C, 38, com.google.common.base.c.C, com.google.common.base.c.C, com.google.common.base.c.D, com.google.common.base.c.I, 33, 38, com.google.common.base.c.C, com.google.common.base.c.D, 33, com.google.common.base.c.F, com.google.common.base.c.H, com.google.common.base.c.G, com.google.common.base.c.F, com.google.common.base.c.D, 32, com.google.common.base.c.I, com.google.common.base.c.C, com.google.common.base.c.A, 2, 36, 2};
    }

    private String x(String str) {
        int length = str.length();
        f1 f1Var = new f1(length + 16);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\\') {
                f1Var.append(cCharAt);
                i10 = i11;
            } else {
                if (i11 == length) {
                    break;
                }
                int i12 = i10 + 2;
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == 'u') {
                    i10 += 6;
                    f1Var.q(Character.toChars(Integer.parseInt(str.substring(i12, i10), 16)));
                } else {
                    if (cCharAt2 != '\"' && cCharAt2 != '/' && cCharAt2 != '\\') {
                        if (cCharAt2 == 'b') {
                            cCharAt2 = '\b';
                        } else if (cCharAt2 == 'f') {
                            cCharAt2 = '\f';
                        } else if (cCharAt2 == 'n') {
                            cCharAt2 = '\n';
                        } else if (cCharAt2 == 'r') {
                            cCharAt2 = org.apache.commons.lang3.k.f337188d;
                        } else {
                            if (cCharAt2 != 't') {
                                throw new y0("Illegal escaped character: \\" + cCharAt2);
                            }
                            cCharAt2 = '\t';
                        }
                    }
                    f1Var.append(cCharAt2);
                    i10 = i12;
                }
            }
        }
        return f1Var.toString();
    }

    @Override // com.badlogic.gdx.utils.f
    public c0 a(InputStream inputStream) {
        try {
            try {
                c0 c0VarQ = q(new InputStreamReader(inputStream, "UTF-8"));
                e1.a(inputStream);
                return c0VarQ;
            } catch (IOException e10) {
                throw new y0(e10);
            }
        } catch (Throwable th2) {
            e1.a(inputStream);
            throw th2;
        }
    }

    @Override // com.badlogic.gdx.utils.f
    public c0 b(com.badlogic.gdx.files.a aVar) {
        try {
            return q(aVar.L("UTF-8"));
        } catch (Exception e10) {
            throw new y0("Error parsing file: " + aVar, e10);
        }
    }

    protected void d(String str, boolean z10) {
        c(str, new c0(z10));
    }

    protected void o(String str, double d10, String str2) {
        c(str, new c0(d10, str2));
    }

    protected void p(String str, long j10, String str2) {
        c(str, new c0(j10, str2));
    }

    public c0 q(Reader reader) {
        try {
            try {
                char[] cArr = new char[1024];
                int i10 = 0;
                while (true) {
                    int i11 = reader.read(cArr, i10, cArr.length - i10);
                    if (i11 == -1) {
                        c0 c0VarS = s(cArr, 0, i10);
                        e1.a(reader);
                        return c0VarS;
                    }
                    if (i11 == 0) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        cArr = cArr2;
                    } else {
                        i10 += i11;
                    }
                }
            } catch (IOException e10) {
                throw new y0(e10);
            }
        } catch (Throwable th2) {
            e1.a(reader);
            throw th2;
        }
    }

    public c0 r(String str) {
        char[] charArray = str.toCharArray();
        return s(charArray, 0, charArray.length);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public com.badlogic.gdx.utils.c0 s(char[] r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.b0.s(char[], int, int):com.badlogic.gdx.utils.c0");
    }

    protected void t() {
        this.f95204c = this.f95202a.pop();
        if (this.f95205d.f95237i > 0) {
            this.f95203b.pop();
        }
        b<c0> bVar = this.f95202a;
        this.f95205d = bVar.f95174b > 0 ? bVar.peek() : null;
    }

    protected void u(String str) {
        c0 c0Var = new c0(c0.d.array);
        if (this.f95205d != null) {
            c(str, c0Var);
        }
        this.f95202a.c(c0Var);
        this.f95205d = c0Var;
    }

    protected void v(String str) {
        c0 c0Var = new c0(c0.d.object);
        if (this.f95205d != null) {
            c(str, c0Var);
        }
        this.f95202a.c(c0Var);
        this.f95205d = c0Var;
    }

    protected void w(String str, String str2) {
        c(str, new c0(str2));
    }
}
