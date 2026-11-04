package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f43454n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f43455o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static float f43456p = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43457a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43458b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43459c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f43460d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f43461e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f43462f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f43463g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f43464h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f43465i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f43466j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f43467k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f43468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f43469m;

    j(b bVar, c cVar) {
        this.f43468l = bVar;
        this.f43469m = cVar;
        clear();
    }

    private void a(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f43433c % this.f43459c;
        int[] iArr2 = this.f43460d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f43461e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f43461e[i10] = -1;
    }

    private void b(int i10, i iVar, float f10) {
        this.f43462f[i10] = iVar.f43433c;
        this.f43463g[i10] = f10;
        this.f43464h[i10] = -1;
        this.f43465i[i10] = -1;
        iVar.b(this.f43468l);
        iVar.f43443m++;
        this.f43466j++;
    }

    private void c() {
        for (int i10 = 0; i10 < this.f43459c; i10++) {
            if (this.f43460d[i10] != -1) {
                String str = hashCode() + " hash [" + i10 + "] => ";
                int i11 = this.f43460d[i10];
                boolean z10 = false;
                while (!z10) {
                    str = str + " " + this.f43462f[i11];
                    int i12 = this.f43461e[i11];
                    if (i12 != -1) {
                        i11 = i12;
                    } else {
                        z10 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int d() {
        for (int i10 = 0; i10 < this.f43458b; i10++) {
            if (this.f43462f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void s() {
        int i10 = this.f43458b * 2;
        this.f43462f = Arrays.copyOf(this.f43462f, i10);
        this.f43463g = Arrays.copyOf(this.f43463g, i10);
        this.f43464h = Arrays.copyOf(this.f43464h, i10);
        this.f43465i = Arrays.copyOf(this.f43465i, i10);
        this.f43461e = Arrays.copyOf(this.f43461e, i10);
        for (int i11 = this.f43458b; i11 < i10; i11++) {
            this.f43462f[i11] = -1;
            this.f43461e[i11] = -1;
        }
        this.f43458b = i10;
    }

    private void t(int i10, i iVar, float f10) {
        int iD = d();
        b(iD, iVar, f10);
        if (i10 != -1) {
            this.f43464h[iD] = i10;
            int[] iArr = this.f43465i;
            iArr[iD] = iArr[i10];
            iArr[i10] = iD;
        } else {
            this.f43464h[iD] = -1;
            if (this.f43466j > 0) {
                this.f43465i[iD] = this.f43467k;
                this.f43467k = iD;
            } else {
                this.f43465i[iD] = -1;
            }
        }
        int i11 = this.f43465i[iD];
        if (i11 != -1) {
            this.f43464h[i11] = iD;
        }
        a(iVar, iD);
    }

    private void u(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f43433c;
        int i12 = i11 % this.f43459c;
        int[] iArr2 = this.f43460d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f43462f[i13] == i11) {
            int[] iArr3 = this.f43461e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f43461e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f43462f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f43462f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i10 = this.f43466j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarH = h(i11);
            if (iVarH != null) {
                iVarH.q(this.f43468l);
            }
        }
        for (int i12 = 0; i12 < this.f43458b; i12++) {
            this.f43462f[i12] = -1;
            this.f43461e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f43459c; i13++) {
            this.f43460d[i13] = -1;
        }
        this.f43466j = 0;
        this.f43467k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e() {
        return this.f43466j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int f(i iVar) {
        if (this.f43466j != 0 && iVar != null) {
            int i10 = iVar.f43433c;
            int i11 = this.f43460d[i10 % this.f43459c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f43462f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f43461e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f43462f[i11] != i10);
            if (i11 != -1 && this.f43462f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean g(i iVar) {
        return f(iVar) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public i h(int i10) {
        int i11 = this.f43466j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f43467k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f43469m.f43076d[this.f43462f[i12]];
            }
            i12 = this.f43465i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void i(i iVar, float f10) {
        float f11 = f43456p;
        if (f10 > (-f11) && f10 < f11) {
            n(iVar, true);
            return;
        }
        if (this.f43466j == 0) {
            b(0, iVar, f10);
            a(iVar, 0);
            this.f43467k = 0;
            return;
        }
        int iF = f(iVar);
        if (iF != -1) {
            this.f43463g[iF] = f10;
            return;
        }
        if (this.f43466j + 1 >= this.f43458b) {
            s();
        }
        int i10 = this.f43466j;
        int i11 = this.f43467k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f43462f[i11];
            int i15 = iVar.f43433c;
            if (i14 == i15) {
                this.f43463g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f43465i[i11];
            if (i11 == -1) {
                break;
            }
        }
        t(i12, iVar, f10);
    }

    @Override // androidx.constraintlayout.core.b.a
    public float j(i iVar) {
        int iF = f(iVar);
        if (iF != -1) {
            return this.f43463g[iF];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(float f10) {
        int i10 = this.f43466j;
        int i11 = this.f43467k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f43463g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f43465i[i11];
            if (i11 == -1) {
                break;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l(i iVar, float f10, boolean z10) {
        float f11 = f43456p;
        if (f10 <= (-f11) || f10 >= f11) {
            int iF = f(iVar);
            if (iF == -1) {
                i(iVar, f10);
                return;
            }
            float[] fArr = this.f43463g;
            float f12 = fArr[iF] + f10;
            fArr[iF] = f12;
            float f13 = f43456p;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iF] = 0.0f;
            n(iVar, z10);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void m() {
        int i10 = this.f43466j;
        int i11 = this.f43467k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f43463g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f43465i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float n(i iVar, boolean z10) {
        int iF = f(iVar);
        if (iF == -1) {
            return 0.0f;
        }
        u(iVar);
        float f10 = this.f43463g[iF];
        if (this.f43467k == iF) {
            this.f43467k = this.f43465i[iF];
        }
        this.f43462f[iF] = -1;
        int[] iArr = this.f43464h;
        int i10 = iArr[iF];
        if (i10 != -1) {
            int[] iArr2 = this.f43465i;
            iArr2[i10] = iArr2[iF];
        }
        int i11 = this.f43465i[iF];
        if (i11 != -1) {
            iArr[i11] = iArr[iF];
        }
        this.f43466j--;
        iVar.f43443m--;
        if (z10) {
            iVar.q(this.f43468l);
        }
        return f10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int o() {
        return 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void p() {
        int i10 = this.f43466j;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarH = h(i11);
            if (iVarH != null) {
                System.out.print(iVarH + " = " + r(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.b.a
    public float q(b bVar, boolean z10) {
        float fJ = j(bVar.f43067a);
        n(bVar.f43067a, z10);
        j jVar = (j) bVar.f43071e;
        int iE = jVar.e();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iE) {
            int i12 = jVar.f43462f[i11];
            if (i12 != -1) {
                l(this.f43469m.f43076d[i12], jVar.f43463g[i11] * fJ, z10);
                i10++;
            }
            i11++;
        }
        return fJ;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float r(int i10) {
        int i11 = this.f43466j;
        int i12 = this.f43467k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f43463g[i12];
            }
            i12 = this.f43465i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f43466j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarH = h(i11);
            if (iVarH != null) {
                String str2 = str + iVarH + " = " + r(i11) + " ";
                int iF = f(iVarH);
                String str3 = str2 + "[p: ";
                String str4 = (this.f43464h[iF] != -1 ? str3 + this.f43469m.f43076d[this.f43462f[this.f43464h[iF]]] : str3 + "none") + ", n: ";
                str = (this.f43465i[iF] != -1 ? str4 + this.f43469m.f43076d[this.f43462f[this.f43465i[iF]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
