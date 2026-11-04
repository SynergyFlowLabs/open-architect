package com.badlogic.gdx.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f95673e = d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f95674f = g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f95675g = k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f95676h = i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f95677i = h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short[] f95678j = e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f95679k = f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f95680l = l();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f95681m = j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f95682n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f95683o = 34;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f95684p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f95685q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f95686r = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f95688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f95689c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<a> f95687a = new b<>(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1 f95690d = new f1(64);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f95691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k0<String, String> f95692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b<a> f95693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f95694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a f95695e;

        public a(String str, a aVar) {
            this.f95691a = str;
            this.f95695e = aVar;
        }

        private void q(String str, b<a> bVar) {
            if (this.f95693c != null) {
                int i10 = 0;
                while (true) {
                    b<a> bVar2 = this.f95693c;
                    if (i10 >= bVar2.f95174b) {
                        break;
                    }
                    a aVar = bVar2.get(i10);
                    if (aVar.f95691a.equals(str)) {
                        bVar.c(aVar);
                    }
                    aVar.q(str, bVar);
                    i10++;
                }
            }
        }

        public a A() {
            return this.f95695e;
        }

        public String B() {
            return this.f95694d;
        }

        public void C() {
            this.f95695e.E(this);
        }

        public void D(int i10) {
            b<a> bVar = this.f95693c;
            if (bVar != null) {
                bVar.A(i10);
            }
        }

        public void E(a aVar) {
            b<a> bVar = this.f95693c;
            if (bVar != null) {
                bVar.C(aVar, true);
            }
        }

        public void F(String str, String str2) {
            if (this.f95692b == null) {
                this.f95692b = new k0<>(8);
            }
            this.f95692b.C(str, str2);
        }

        public void G(String str) {
            this.f95694d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public String H(String str) {
            String str2;
            f1 f1Var = new f1(128);
            f1Var.o(str);
            f1Var.append(kotlin.text.b0.f313280e);
            f1Var.o(this.f95691a);
            k0<String, String> k0Var = this.f95692b;
            if (k0Var != null) {
                k0.a<String, String> it = k0Var.m().iterator();
                while (it.hasNext()) {
                    k0.b next = it.next();
                    f1Var.append(' ');
                    f1Var.o((String) next.f95630a);
                    f1Var.o("=\"");
                    f1Var.o((String) next.f95631b);
                    f1Var.append('\"');
                }
            }
            if (this.f95693c == null && ((str2 = this.f95694d) == null || str2.length() == 0)) {
                f1Var.o("/>");
            } else {
                f1Var.o(">\n");
                String str3 = str + '\t';
                String str4 = this.f95694d;
                if (str4 != null && str4.length() > 0) {
                    f1Var.o(str3);
                    f1Var.o(this.f95694d);
                    f1Var.append('\n');
                }
                b<a> bVar = this.f95693c;
                if (bVar != null) {
                    Iterator<a> it2 = bVar.iterator();
                    while (it2.hasNext()) {
                        f1Var.o(it2.next().H(str3));
                        f1Var.append('\n');
                    }
                }
                f1Var.o(str);
                f1Var.o("</");
                f1Var.o(this.f95691a);
                f1Var.append(kotlin.text.b0.f313281f);
            }
            return f1Var.toString();
        }

        public void a(a aVar) {
            if (this.f95693c == null) {
                this.f95693c = new b<>(8);
            }
            this.f95693c.c(aVar);
        }

        public String b(String str) {
            String strC = c(str, null);
            if (strC != null) {
                return strC;
            }
            throw new t("Element " + this.f95691a + " doesn't have attribute or child: " + str);
        }

        public String c(String str, String str2) {
            String strB;
            String strP;
            k0<String, String> k0Var = this.f95692b;
            if (k0Var != null && (strP = k0Var.p(str)) != null) {
                return strP;
            }
            a aVarL = l(str);
            return (aVarL == null || (strB = aVarL.B()) == null) ? str2 : strB;
        }

        public String d(String str) {
            k0<String, String> k0Var = this.f95692b;
            if (k0Var == null) {
                throw new t("Element " + str + " doesn't have attribute: " + str);
            }
            String strP = k0Var.p(str);
            if (strP != null) {
                return strP;
            }
            throw new t("Element " + str + " doesn't have attribute: " + str);
        }

        public String e(String str, String str2) {
            String strP;
            k0<String, String> k0Var = this.f95692b;
            return (k0Var == null || (strP = k0Var.p(str)) == null) ? str2 : strP;
        }

        public k0<String, String> f() {
            return this.f95692b;
        }

        public boolean g(String str) {
            String strC = c(str, null);
            if (strC != null) {
                return Boolean.parseBoolean(strC);
            }
            throw new t("Element " + this.f95691a + " doesn't have attribute or child: " + str);
        }

        public boolean h(String str, boolean z10) {
            String strC = c(str, null);
            return strC == null ? z10 : Boolean.parseBoolean(strC);
        }

        public boolean i(String str) {
            return Boolean.parseBoolean(d(str));
        }

        public boolean j(String str, boolean z10) {
            String strE = e(str, null);
            return strE == null ? z10 : Boolean.parseBoolean(strE);
        }

        public a k(int i10) {
            b<a> bVar = this.f95693c;
            if (bVar != null) {
                return bVar.get(i10);
            }
            throw new t("Element has no children: " + this.f95691a);
        }

        public a l(String str) {
            if (this.f95693c == null) {
                return null;
            }
            int i10 = 0;
            while (true) {
                b<a> bVar = this.f95693c;
                if (i10 >= bVar.f95174b) {
                    return null;
                }
                a aVar = bVar.get(i10);
                if (aVar.f95691a.equals(str)) {
                    return aVar;
                }
                i10++;
            }
        }

        public a m(String str) {
            if (this.f95693c == null) {
                return null;
            }
            int i10 = 0;
            while (true) {
                b<a> bVar = this.f95693c;
                if (i10 >= bVar.f95174b) {
                    return null;
                }
                a aVar = bVar.get(i10);
                if (aVar.f95691a.equals(str)) {
                    return aVar;
                }
                a aVarM = aVar.m(str);
                if (aVarM != null) {
                    return aVarM;
                }
                i10++;
            }
        }

        public int n() {
            b<a> bVar = this.f95693c;
            if (bVar == null) {
                return 0;
            }
            return bVar.f95174b;
        }

        public b<a> o(String str) {
            b<a> bVar = new b<>();
            if (this.f95693c != null) {
                int i10 = 0;
                while (true) {
                    b<a> bVar2 = this.f95693c;
                    if (i10 >= bVar2.f95174b) {
                        break;
                    }
                    a aVar = bVar2.get(i10);
                    if (aVar.f95691a.equals(str)) {
                        bVar.c(aVar);
                    }
                    i10++;
                }
            }
            return bVar;
        }

        public b<a> p(String str) {
            b<a> bVar = new b<>();
            q(str, bVar);
            return bVar;
        }

        public float r(String str) {
            String strC = c(str, null);
            if (strC != null) {
                return Float.parseFloat(strC);
            }
            throw new t("Element " + this.f95691a + " doesn't have attribute or child: " + str);
        }

        public float s(String str, float f10) {
            String strC = c(str, null);
            return strC == null ? f10 : Float.parseFloat(strC);
        }

        public float t(String str) {
            return Float.parseFloat(d(str));
        }

        public String toString() {
            return H("");
        }

        public float u(String str, float f10) {
            String strE = e(str, null);
            return strE == null ? f10 : Float.parseFloat(strE);
        }

        public int v(String str) {
            String strC = c(str, null);
            if (strC != null) {
                return Integer.parseInt(strC);
            }
            throw new t("Element " + this.f95691a + " doesn't have attribute or child: " + str);
        }

        public int w(String str, int i10) {
            String strC = c(str, null);
            return strC == null ? i10 : Integer.parseInt(strC);
        }

        public int x(String str) {
            return Integer.parseInt(d(str));
        }

        public int y(String str, int i10) {
            String strE = e(str, null);
            return strE == null ? i10 : Integer.parseInt(strE);
        }

        public String z() {
            return this.f95691a;
        }
    }

    private static byte[] d() {
        return new byte[]{0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 2, 0, 6, 2, 1, 4, 2, 2, 4};
    }

    private static short[] e() {
        return new short[]{0, 0, 4, 9, 14, 20, 26, 30, 35, 37, 39, 44, 48, 52, 54, 56, 60, 62, 67, 72, 78, 84, 88, 93, 95, 97, 102, 106, 110, 112, 116, 118, 120, 122, 124, 127};
    }

    private static byte[] f() {
        return new byte[]{0, 2, 0, 1, 2, 1, 1, 2, 3, 5, 6, 7, 5, 4, 9, 10, 1, 11, 9, 8, com.google.common.base.c.f116462o, 1, com.google.common.base.c.f116463p, 1, com.google.common.base.c.f116462o, com.google.common.base.c.f116461n, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, com.google.common.base.c.f116464q, 1, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, com.google.common.base.c.f116465r, 1, com.google.common.base.c.f116471x, 19, com.google.common.base.c.f116473z, com.google.common.base.c.f116472y, 9, 10, 11, 9, 1, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.A, 1, com.google.common.base.c.C, 11, com.google.common.base.c.C, 1, com.google.common.base.c.f116471x, com.google.common.base.c.D, com.google.common.base.c.f116473z, com.google.common.base.c.E, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.G, com.google.common.base.c.F, 32, com.google.common.base.c.I, com.google.common.base.c.H, 34, 1, com.google.common.base.c.H, 33, 36, 37, 38, 36, 35, 40, 41, 1, 42, 40, 39, 44, 1, 45, 1, 44, 43, 46, 47, 46, 1, 47, 48, 49, 47, 1, 51, 50, 53, 52, 40, 41, 42, 40, 1, 54, 55, 54, 1, 56, 42, 56, 1, 57, 1, 57, 34, 57, 1, 1, 58, 59, 58, 51, 60, 53, kotlin.io.encoding.a.f312535i, 62, 62, 1, 1, 0};
    }

    private static byte[] g() {
        return new byte[]{0, 0, 4, 9, com.google.common.base.c.f116463p, com.google.common.base.c.f116471x, com.google.common.base.c.D, com.google.common.base.c.H, 35, 36, 37, 42, 46, 50, 51, 52, 56, 57, 62, 67, 73, 79, 83, 88, 89, 90, 95, 99, 103, 104, 108, 109, 110, 111, 112, 115};
    }

    private static byte[] h() {
        return new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0};
    }

    private static byte[] i() {
        return new byte[]{0, 2, 3, 3, 4, 4, 2, 3, 1, 1, 3, 2, 2, 1, 1, 2, 1, 3, 3, 4, 4, 2, 3, 1, 1, 3, 2, 2, 1, 2, 1, 1, 1, 1, 1, 0};
    }

    private static byte[] j() {
        return new byte[]{0, 0, 0, 1, 0, 3, 3, com.google.common.base.c.f116471x, 1, 0, 0, 9, 0, 11, 11, 0, 0, 0, 0, 1, 17, 0, com.google.common.base.c.f116462o, 5, com.google.common.base.c.A, 0, 1, 0, 1, 0, 0, 0, com.google.common.base.c.f116464q, 1, 0, 0, 3, 3, com.google.common.base.c.f116471x, 1, 0, 0, 9, 0, 11, 11, 0, 0, 0, 0, 1, 17, 0, com.google.common.base.c.f116462o, 5, com.google.common.base.c.A, 0, 0, 0, 7, 1, 0, 0};
    }

    private static char[] k() {
        return new char[]{' ', kotlin.text.b0.f313280e, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', '=', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', '=', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '=', '\t', org.apache.commons.lang3.k.f337188d, ' ', '\"', '\'', '\t', org.apache.commons.lang3.k.f337188d, '\"', '\"', ' ', '/', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, '\'', '\'', ' ', kotlin.text.b0.f313280e, '\t', org.apache.commons.lang3.k.f337188d, kotlin.text.b0.f313280e, ' ', '/', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', '=', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '/', '=', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', '=', '\t', org.apache.commons.lang3.k.f337188d, ' ', '\"', '\'', '\t', org.apache.commons.lang3.k.f337188d, '\"', '\"', ' ', '/', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, ' ', kotlin.text.b0.f313281f, '\t', org.apache.commons.lang3.k.f337188d, kotlin.text.b0.f313280e, ' ', '/', '\t', org.apache.commons.lang3.k.f337188d, kotlin.text.b0.f313281f, kotlin.text.b0.f313281f, '\'', '\'', ' ', '\t', org.apache.commons.lang3.k.f337188d, 0};
    }

    private static byte[] l() {
        return new byte[]{1, 0, 2, 3, 3, 4, 11, 34, 5, 4, 11, 34, 5, 6, 7, 6, 7, 8, com.google.common.base.c.f116462o, 9, 10, 9, 10, com.google.common.base.c.f116461n, 34, com.google.common.base.c.f116461n, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116465r, com.google.common.base.c.f116464q, 17, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, com.google.common.base.c.H, com.google.common.base.c.f116468u, 19, com.google.common.base.c.D, com.google.common.base.c.F, com.google.common.base.c.f116471x, 19, com.google.common.base.c.D, com.google.common.base.c.F, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, 32, com.google.common.base.c.B, com.google.common.base.c.C, com.google.common.base.c.B, com.google.common.base.c.C, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.E, com.google.common.base.c.G, com.google.common.base.c.I, 35, 33, 33, 34};
    }

    protected void a(String str, String str2) {
        this.f95689c.F(str, str2);
    }

    protected void b() {
        this.f95688b = this.f95687a.pop();
        b<a> bVar = this.f95687a;
        this.f95689c = bVar.f95174b > 0 ? bVar.peek() : null;
    }

    protected String c(String str) {
        if (str.equals("lt")) {
            return "<";
        }
        if (str.equals("gt")) {
            return ">";
        }
        if (str.equals("amp")) {
            return "&";
        }
        if (str.equals("apos")) {
            return "'";
        }
        if (str.equals("quot")) {
            return "\"";
        }
        if (str.startsWith("#x")) {
            return Character.toString((char) Integer.parseInt(str.substring(2), 16));
        }
        return null;
    }

    protected void m(String str) {
        a aVar = new a(str, this.f95689c);
        a aVar2 = this.f95689c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        this.f95687a.c(aVar);
        this.f95689c = aVar;
    }

    public a n(com.badlogic.gdx.files.a aVar) throws IOException {
        try {
            return p(aVar.L("UTF-8"));
        } catch (Exception e10) {
            throw new y0("Error parsing file: " + aVar, e10);
        }
    }

    public a o(InputStream inputStream) throws IOException {
        try {
            try {
                a aVarP = p(new InputStreamReader(inputStream, "UTF-8"));
                e1.a(inputStream);
                return aVarP;
            } catch (IOException e10) {
                throw new y0(e10);
            }
        } catch (Throwable th2) {
            e1.a(inputStream);
            throw th2;
        }
    }

    public a p(Reader reader) throws IOException {
        try {
            try {
                char[] cArr = new char[1024];
                int i10 = 0;
                while (true) {
                    int i11 = reader.read(cArr, i10, cArr.length - i10);
                    if (i11 == -1) {
                        a aVarR = r(cArr, 0, i10);
                        e1.a(reader);
                        return aVarR;
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

    public a q(String str) {
        char[] charArray = str.toCharArray();
        return r(charArray, 0, charArray.length);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:131:0x021b A[LOOP:8: B:129:0x0217->B:131:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x021e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0236  */
    /* JADX WARN: Code duplicated, block: B:155:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7 A[LOOP:5: B:63:0x00ed->B:66:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x014a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00be. Please report as an issue. */
    public a r(char[] cArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b10;
        int i17;
        int i18;
        int i19;
        int i20;
        char c10;
        char c11;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        String str;
        String strC;
        char c12;
        int i26 = 1;
        int i27 = i10;
        byte b11 = 1;
        int i28 = 0;
        int i29 = 0;
        String str2 = null;
        int i30 = 0;
        while (true) {
            char c13 = ' ';
            char c14 = '\n';
            int i31 = 2;
            if (i28 != 0) {
                if (i28 != i26) {
                    i12 = i26;
                    i13 = 0;
                    if (i28 != 2) {
                    }
                }
                if (b11 == 0) {
                    i26 = i12;
                    i28 = 5;
                } else {
                    i27++;
                    if (i27 != i11) {
                        i26 = i12;
                        i28 = i26;
                    }
                }
            } else if (i27 == i11) {
                i28 = 4;
            } else if (b11 == 0) {
                i28 = 5;
            }
            int i32 = f95674f[b11];
            short s10 = f95678j[b11];
            byte b12 = f95676h[b11];
            if (b12 > 0) {
                int i33 = i32 + b12;
                i12 = i26;
                int i34 = i32;
                int i35 = i33 - 1;
                while (true) {
                    if (i35 < i34) {
                        i32 = i33;
                        i14 = s10 + b12;
                    } else {
                        int i36 = i34 + ((i35 - i34) >> 1);
                        i15 = i31;
                        char c15 = cArr[i27];
                        char c16 = f95675g[i36];
                        if (c15 < c16) {
                            i35 = i36 - 1;
                        } else if (c15 > c16) {
                            i34 = i36 + 1;
                        } else {
                            i16 = s10 + (i36 - i32);
                        }
                        i31 = i15;
                    }
                    byte b13 = f95679k[i16];
                    byte b14 = f95680l[b13];
                    b10 = f95681m[b13];
                    if (b10 != 0) {
                        i17 = b10 + 1;
                        i18 = f95673e[b10];
                        while (true) {
                            i19 = i18 - 1;
                            if (i18 > 0) {
                                i20 = i17 + 1;
                                switch (f95673e[i17]) {
                                    case 0:
                                        i29 = i27;
                                        i18 = i19;
                                        i17 = i20;
                                        c13 = ' ';
                                        c14 = '\n';
                                        break;
                                    case 1:
                                        c10 = cArr[i29];
                                        if (c10 != '?' || c10 == '!') {
                                            c11 = cArr[i29 + 1];
                                            if (c11 != '[' && cArr[i29 + 2] == 'C' && cArr[i29 + 3] == 'D' && cArr[i29 + 4] == 'A' && cArr[i29 + 5] == 'T' && cArr[i29 + 6] == 'A' && cArr[i29 + 7] == '[') {
                                                int i37 = i29 + 8;
                                                int i38 = i29 + 10;
                                                while (true) {
                                                    if (cArr[i38 - 2] == ']' && cArr[i38 - 1] == ']' && cArr[i38] == '>') {
                                                        s(new String(cArr, i37, (i38 - i37) - 2));
                                                        i27 = i38;
                                                        i29 = i37;
                                                    } else {
                                                        i38++;
                                                    }
                                                }
                                            } else if (c10 != '!' && c11 == '-' && cArr[i29 + 2] == '-') {
                                                int i39 = i29 + 3;
                                                while (true) {
                                                    if (cArr[i39] == '-' && cArr[i39 + 1] == '-') {
                                                        int i40 = i39 + 2;
                                                        if (cArr[i40] == '>') {
                                                            i27 = i40;
                                                        }
                                                    }
                                                    i39++;
                                                }
                                            } else {
                                                while (cArr[i27] != '>') {
                                                    i27++;
                                                }
                                            }
                                            i26 = i12;
                                            i28 = i15;
                                            b11 = com.google.common.base.c.f116464q;
                                        } else {
                                            m(new String(cArr, i29, i27 - i29));
                                            i30 = i12;
                                            i18 = i19;
                                            i17 = i20;
                                            c13 = ' ';
                                            c14 = '\n';
                                        }
                                        break;
                                    case 2:
                                        b();
                                        i30 = 0;
                                        i26 = i12;
                                        i28 = i15;
                                        b11 = com.google.common.base.c.f116464q;
                                        break;
                                    case 3:
                                        b();
                                        i26 = i12;
                                        i28 = i15;
                                        b11 = com.google.common.base.c.f116464q;
                                        break;
                                    case 4:
                                        if (i30 != 0) {
                                            i26 = i12;
                                            i28 = i15;
                                            b11 = com.google.common.base.c.f116464q;
                                        } else {
                                            i18 = i19;
                                            i17 = i20;
                                            c13 = ' ';
                                            c14 = '\n';
                                        }
                                        break;
                                    case 5:
                                        str2 = new String(cArr, i29, i27 - i29);
                                        i18 = i19;
                                        i17 = i20;
                                        c13 = ' ';
                                        c14 = '\n';
                                        break;
                                    case 6:
                                        a(str2, new String(cArr, i29, i27 - i29));
                                        i18 = i19;
                                        i17 = i20;
                                        c13 = ' ';
                                        c14 = '\n';
                                        break;
                                    case 7:
                                        for (i21 = i27; i21 != i29; i21--) {
                                            c12 = cArr[i21 - 1];
                                            if (c12 == '\t' && c12 != c14 && c12 != '\r' && c12 != c13) {
                                                i22 = i29;
                                                i23 = 0;
                                                while (i29 != i21) {
                                                    i24 = i29 + 1;
                                                    if (cArr[i29] != '&') {
                                                        i29 = i24;
                                                    } else {
                                                        i29 = i24;
                                                        while (i29 != i21) {
                                                            i25 = i29 + 1;
                                                            if (cArr[i29] != ';') {
                                                                i29 = i25;
                                                            } else {
                                                                this.f95690d.r(cArr, i22, (i24 - i22) - 1);
                                                                str = new String(cArr, i24, (i25 - i24) - 1);
                                                                strC = c(str);
                                                                f1 f1Var = this.f95690d;
                                                                if (strC != null) {
                                                                    str = strC;
                                                                }
                                                                f1Var.o(str);
                                                                i22 = i25;
                                                                i29 = i22;
                                                                i23 = i12;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (i23 != 0) {
                                                    if (i22 < i21) {
                                                        this.f95690d.r(cArr, i22, i21 - i22);
                                                    }
                                                    s(this.f95690d.toString());
                                                    this.f95690d.o0(0);
                                                } else {
                                                    s(new String(cArr, i22, i21 - i22));
                                                }
                                                i29 = i22;
                                                i18 = i19;
                                                i17 = i20;
                                                c13 = ' ';
                                                c14 = '\n';
                                            }
                                            break;
                                        }
                                        i22 = i29;
                                        i23 = 0;
                                        while (i29 != i21) {
                                            i24 = i29 + 1;
                                            if (cArr[i29] != '&') {
                                                i29 = i24;
                                            } else {
                                                i29 = i24;
                                                while (i29 != i21) {
                                                    i25 = i29 + 1;
                                                    if (cArr[i29] != ';') {
                                                        i29 = i25;
                                                    } else {
                                                        this.f95690d.r(cArr, i22, (i24 - i22) - 1);
                                                        str = new String(cArr, i24, (i25 - i24) - 1);
                                                        strC = c(str);
                                                        f1 f1Var2 = this.f95690d;
                                                        if (strC != null) {
                                                            str = strC;
                                                        }
                                                        f1Var2.o(str);
                                                        i22 = i25;
                                                        i29 = i22;
                                                        i23 = i12;
                                                    }
                                                }
                                            }
                                        }
                                        if (i23 != 0) {
                                            if (i22 < i21) {
                                                this.f95690d.r(cArr, i22, i21 - i22);
                                            }
                                            s(this.f95690d.toString());
                                            this.f95690d.o0(0);
                                        } else {
                                            s(new String(cArr, i22, i21 - i22));
                                        }
                                        i29 = i22;
                                        i18 = i19;
                                        i17 = i20;
                                        c13 = ' ';
                                        c14 = '\n';
                                        break;
                                    default:
                                        i18 = i19;
                                        i17 = i20;
                                        c13 = ' ';
                                        c14 = '\n';
                                        break;
                                }
                            }
                        }
                    }
                    i13 = 0;
                    b11 = b14;
                    if (b11 == 0) {
                        i26 = i12;
                        i28 = 5;
                    } else {
                        i27++;
                        if (i27 != i11) {
                            i26 = i12;
                            i28 = i26;
                        }
                    }
                }
            } else {
                i12 = i26;
                i14 = s10;
            }
            i15 = i31;
            byte b15 = f95677i[b11];
            i16 = i14;
            if (b15 > 0) {
                int i41 = ((b15 << 1) + i32) - 2;
                int i42 = i32;
                while (true) {
                    if (i41 < i42) {
                        i16 = i14 + b15;
                    } else {
                        int i43 = (((i41 - i42) >> 1) & (-2)) + i42;
                        char c17 = cArr[i27];
                        char[] cArr2 = f95675g;
                        if (c17 < cArr2[i43]) {
                            i41 = i43 - 2;
                        } else if (c17 > cArr2[i43 + 1]) {
                            i42 = i43 + 2;
                        } else {
                            i16 = i14 + ((i43 - i32) >> 1);
                        }
                    }
                }
            }
            byte b16 = f95679k[i16];
            byte b17 = f95680l[b16];
            b10 = f95681m[b16];
            if (b10 != 0) {
                i17 = b10 + 1;
                i18 = f95673e[b10];
                while (true) {
                    i19 = i18 - 1;
                    if (i18 > 0) {
                        i20 = i17 + 1;
                        switch (f95673e[i17]) {
                            case 0:
                                i29 = i27;
                                i18 = i19;
                                i17 = i20;
                                c13 = ' ';
                                c14 = '\n';
                                break;
                            case 1:
                                c10 = cArr[i29];
                                if (c10 != '?') {
                                }
                                c11 = cArr[i29 + 1];
                                if (c11 != '[') {
                                    if (c10 != '!') {
                                        while (cArr[i27] != '>') {
                                            i27++;
                                        }
                                    } else {
                                        while (cArr[i27] != '>') {
                                            i27++;
                                        }
                                    }
                                } else if (c10 != '!') {
                                    while (cArr[i27] != '>') {
                                        i27++;
                                    }
                                } else {
                                    while (cArr[i27] != '>') {
                                        i27++;
                                    }
                                }
                                i26 = i12;
                                i28 = i15;
                                b11 = com.google.common.base.c.f116464q;
                                break;
                            case 2:
                                b();
                                i30 = 0;
                                i26 = i12;
                                i28 = i15;
                                b11 = com.google.common.base.c.f116464q;
                                break;
                            case 3:
                                b();
                                i26 = i12;
                                i28 = i15;
                                b11 = com.google.common.base.c.f116464q;
                                break;
                            case 4:
                                if (i30 != 0) {
                                    i26 = i12;
                                    i28 = i15;
                                    b11 = com.google.common.base.c.f116464q;
                                } else {
                                    i18 = i19;
                                    i17 = i20;
                                    c13 = ' ';
                                    c14 = '\n';
                                }
                                break;
                            case 5:
                                str2 = new String(cArr, i29, i27 - i29);
                                i18 = i19;
                                i17 = i20;
                                c13 = ' ';
                                c14 = '\n';
                                break;
                            case 6:
                                a(str2, new String(cArr, i29, i27 - i29));
                                i18 = i19;
                                i17 = i20;
                                c13 = ' ';
                                c14 = '\n';
                                break;
                            case 7:
                                while (i21 != i29) {
                                    c12 = cArr[i21 - 1];
                                    if (c12 == '\t') {
                                    }
                                }
                                i22 = i29;
                                i23 = 0;
                                while (i29 != i21) {
                                    i24 = i29 + 1;
                                    if (cArr[i29] != '&') {
                                        i29 = i24;
                                    } else {
                                        i29 = i24;
                                        while (i29 != i21) {
                                            i25 = i29 + 1;
                                            if (cArr[i29] != ';') {
                                                i29 = i25;
                                            } else {
                                                this.f95690d.r(cArr, i22, (i24 - i22) - 1);
                                                str = new String(cArr, i24, (i25 - i24) - 1);
                                                strC = c(str);
                                                f1 f1Var3 = this.f95690d;
                                                if (strC != null) {
                                                    str = strC;
                                                }
                                                f1Var3.o(str);
                                                i22 = i25;
                                                i29 = i22;
                                                i23 = i12;
                                            }
                                        }
                                    }
                                }
                                if (i23 != 0) {
                                    if (i22 < i21) {
                                        this.f95690d.r(cArr, i22, i21 - i22);
                                    }
                                    s(this.f95690d.toString());
                                    this.f95690d.o0(0);
                                } else {
                                    s(new String(cArr, i22, i21 - i22));
                                }
                                i29 = i22;
                                i18 = i19;
                                i17 = i20;
                                c13 = ' ';
                                c14 = '\n';
                                break;
                            default:
                                i18 = i19;
                                i17 = i20;
                                c13 = ' ';
                                c14 = '\n';
                                break;
                        }
                    }
                }
            }
            i13 = 0;
            b11 = b17;
            if (b11 == 0) {
                i26 = i12;
                i28 = 5;
            } else {
                i27++;
                if (i27 != i11) {
                    i26 = i12;
                    i28 = i26;
                }
            }
        }
        if (i27 >= i11) {
            b<a> bVar = this.f95687a;
            if (bVar.f95174b == 0) {
                a aVar = this.f95688b;
                this.f95688b = null;
                return aVar;
            }
            a aVarPeek = bVar.peek();
            this.f95687a.clear();
            throw new y0("Error parsing XML, unclosed element: " + aVarPeek.z());
        }
        int i44 = i12;
        for (int i45 = i13; i45 < i27; i45++) {
            if (cArr[i45] == '\n') {
                i44++;
            }
        }
        throw new y0("Error parsing XML on line " + i44 + " near: " + new String(cArr, i27, Math.min(32, i11 - i27)));
    }

    protected void s(String str) {
        String strB = this.f95689c.B();
        a aVar = this.f95689c;
        if (strB != null) {
            str = strB + str;
        }
        aVar.G(str);
    }
}
