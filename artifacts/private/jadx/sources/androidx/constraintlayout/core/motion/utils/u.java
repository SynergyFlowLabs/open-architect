package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f43935m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f43936n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f43937o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f43938p = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f43939a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f43940b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43941c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f43942d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float[] f43943e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43944f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f43945g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f43946h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f43947i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int[] f43948j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean[] f43949k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f43950l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f43944f;
        int[] iArr = this.f43942d;
        if (i11 >= iArr.length) {
            this.f43942d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f43943e;
            this.f43943e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f43942d;
        int i12 = this.f43944f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f43943e;
        this.f43944f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f43941c;
        int[] iArr = this.f43939a;
        if (i12 >= iArr.length) {
            this.f43939a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f43940b;
            this.f43940b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f43939a;
        int i13 = this.f43941c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f43940b;
        this.f43941c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f43947i;
        int[] iArr = this.f43945g;
        if (i11 >= iArr.length) {
            this.f43945g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f43946h;
            this.f43946h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f43945g;
        int i12 = this.f43947i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f43946h;
        this.f43947i = i12 + 1;
        strArr2[i12] = str;
    }

    public void d(int i10, boolean z10) {
        int i11 = this.f43950l;
        int[] iArr = this.f43948j;
        if (i11 >= iArr.length) {
            this.f43948j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f43949k;
            this.f43949k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f43948j;
        int i12 = this.f43950l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f43949k;
        this.f43950l = i12 + 1;
        zArr2[i12] = z10;
    }

    public void e(int i10, String str) {
        if (str != null) {
            c(i10, str);
        }
    }

    public void f(u uVar) {
        for (int i10 = 0; i10 < this.f43941c; i10++) {
            uVar.b(this.f43939a[i10], this.f43940b[i10]);
        }
        for (int i11 = 0; i11 < this.f43944f; i11++) {
            uVar.a(this.f43942d[i11], this.f43943e[i11]);
        }
        for (int i12 = 0; i12 < this.f43947i; i12++) {
            uVar.c(this.f43945g[i12], this.f43946h[i12]);
        }
        for (int i13 = 0; i13 < this.f43950l; i13++) {
            uVar.d(this.f43948j[i13], this.f43949k[i13]);
        }
    }

    public void g(v vVar) {
        for (int i10 = 0; i10 < this.f43941c; i10++) {
            vVar.b(this.f43939a[i10], this.f43940b[i10]);
        }
        for (int i11 = 0; i11 < this.f43944f; i11++) {
            vVar.c(this.f43942d[i11], this.f43943e[i11]);
        }
        for (int i12 = 0; i12 < this.f43947i; i12++) {
            vVar.e(this.f43945g[i12], this.f43946h[i12]);
        }
        for (int i13 = 0; i13 < this.f43950l; i13++) {
            vVar.d(this.f43948j[i13], this.f43949k[i13]);
        }
    }

    public void h() {
        this.f43950l = 0;
        this.f43947i = 0;
        this.f43944f = 0;
        this.f43941c = 0;
    }

    public int i(int i10) {
        for (int i11 = 0; i11 < this.f43941c; i11++) {
            if (this.f43939a[i11] == i10) {
                return this.f43940b[i11];
            }
        }
        return -1;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f43941c + ", mCountFloat=" + this.f43944f + ", mCountString=" + this.f43947i + ", mCountBoolean=" + this.f43950l + AbstractJsonLexerKt.END_OBJ;
    }
}
