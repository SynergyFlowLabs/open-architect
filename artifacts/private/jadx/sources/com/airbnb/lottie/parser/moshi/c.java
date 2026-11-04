package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.l;
import okio.m;
import okio.n;
import okio.o;
import okio.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f88689g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f88690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f88691b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f88692c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f88693d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f88694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f88695f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f88696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p0 f88697b;

        private a(String[] strArr, p0 p0Var) {
            this.f88696a = strArr;
            this.f88697b = p0Var;
        }

        public static a a(String... strArr) {
            try {
                o[] oVarArr = new o[strArr.length];
                l lVar = new l();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.g(lVar, strArr[i10]);
                    lVar.readByte();
                    oVarArr[i10] = lVar.r7();
                }
                return new a((String[]) strArr.clone(), p0.n(oVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f88689g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f88689g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static c b(n nVar) {
        return new e(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public static void g(m mVar, String str) throws IOException {
        String str2;
        String[] strArr = f88689g;
        mVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        mVar.K3(str, i10, i11);
                    }
                    mVar.pa(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    mVar.K3(str, i10, i11);
                }
                mVar.pa(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            mVar.K3(str, i10, length);
        }
        mVar.writeByte(34);
    }

    public abstract void F0() throws IOException;

    public abstract void F1() throws IOException;

    public abstract void J0() throws IOException;

    public final String S() {
        return d.a(this.f88690a, this.f88691b, this.f88692c, this.f88693d);
    }

    public abstract void a9() throws IOException;

    public abstract b c() throws IOException;

    final void d(int i10) {
        int i11 = this.f88690a;
        int[] iArr = this.f88691b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new com.airbnb.lottie.parser.moshi.a("Nesting too deep at " + S());
            }
            this.f88691b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f88692c;
            this.f88692c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f88693d;
            this.f88693d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f88691b;
        int i12 = this.f88690a;
        this.f88690a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int e(a aVar) throws IOException;

    public abstract void f() throws IOException;

    final com.airbnb.lottie.parser.moshi.b h(String str) throws com.airbnb.lottie.parser.moshi.b {
        throw new com.airbnb.lottie.parser.moshi.b(str + " at path " + S());
    }

    public abstract boolean hasNext() throws IOException;

    public abstract String jc() throws IOException;

    public abstract void m1() throws IOException;

    public abstract String na() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;
}
