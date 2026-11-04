package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f43051l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f43052m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f43053n = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f43055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f43056c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f43054a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43057d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f43058e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f43059f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f43060g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f43061h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43062i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43063j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f43064k = false;

    a(b bVar, c cVar) {
        int i10 = 1 << 0;
        this.f43055b = bVar;
        this.f43056c = cVar;
    }

    public int a() {
        return this.f43062i;
    }

    public final int b(int i10) {
        return this.f43059f[i10];
    }

    public final int c(int i10) {
        return this.f43060g[i10];
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f43062i;
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            i iVar = this.f43056c.f43076d[this.f43059f[i10]];
            if (iVar != null) {
                iVar.q(this.f43055b);
            }
            i10 = this.f43060g[i10];
        }
        this.f43062i = -1;
        this.f43063j = -1;
        this.f43064k = false;
        this.f43054a = 0;
    }

    i d() {
        i iVar = this.f43058e;
        if (iVar != null) {
            return iVar;
        }
        int i10 = this.f43062i;
        i iVar2 = null;
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            if (this.f43061h[i10] < 0.0f) {
                i iVar3 = this.f43056c.f43076d[this.f43059f[i10]];
                if (iVar2 == null || iVar2.f43435e < iVar3.f43435e) {
                    iVar2 = iVar3;
                }
            }
            i10 = this.f43060g[i10];
        }
        return iVar2;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e() {
        return this.f43054a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int f(i iVar) {
        int i10 = this.f43062i;
        if (i10 == -1) {
            return -1;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            if (this.f43059f[i10] == iVar.f43433c) {
                return i10;
            }
            i10 = this.f43060g[i10];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean g(i iVar) {
        int i10 = this.f43062i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            if (this.f43059f[i10] == iVar.f43433c) {
                return true;
            }
            i10 = this.f43060g[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public i h(int i10) {
        int i11 = this.f43062i;
        for (int i12 = 0; i11 != -1 && i12 < this.f43054a; i12++) {
            if (i12 == i10) {
                return this.f43056c.f43076d[this.f43059f[i11]];
            }
            i11 = this.f43060g[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void i(i iVar, float f10) {
        if (f10 == 0.0f) {
            n(iVar, true);
            return;
        }
        int i10 = this.f43062i;
        if (i10 == -1) {
            this.f43062i = 0;
            this.f43061h[0] = f10;
            this.f43059f[0] = iVar.f43433c;
            this.f43060g[0] = -1;
            iVar.f43443m++;
            iVar.b(this.f43055b);
            this.f43054a++;
            if (!this.f43064k) {
                int i11 = this.f43063j + 1;
                this.f43063j = i11;
                int[] iArr = this.f43059f;
                if (i11 >= iArr.length) {
                    this.f43064k = true;
                    this.f43063j = iArr.length - 1;
                }
            }
        } else {
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f43054a; i13++) {
                int i14 = this.f43059f[i10];
                int i15 = iVar.f43433c;
                if (i14 == i15) {
                    this.f43061h[i10] = f10;
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f43060g[i10];
            }
            int length = this.f43063j;
            int i16 = length + 1;
            if (this.f43064k) {
                int[] iArr2 = this.f43059f;
                if (iArr2[length] != -1) {
                    length = iArr2.length;
                }
            } else {
                length = i16;
            }
            int[] iArr3 = this.f43059f;
            if (length >= iArr3.length && this.f43054a < iArr3.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr4 = this.f43059f;
                    if (i17 >= iArr4.length) {
                        break;
                    }
                    if (iArr4[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr5 = this.f43059f;
            if (length >= iArr5.length) {
                length = iArr5.length;
                int i18 = this.f43057d * 2;
                this.f43057d = i18;
                this.f43064k = false;
                this.f43063j = length - 1;
                this.f43061h = Arrays.copyOf(this.f43061h, i18);
                this.f43059f = Arrays.copyOf(this.f43059f, this.f43057d);
                this.f43060g = Arrays.copyOf(this.f43060g, this.f43057d);
            }
            this.f43059f[length] = iVar.f43433c;
            this.f43061h[length] = f10;
            if (i12 != -1) {
                int[] iArr6 = this.f43060g;
                iArr6[length] = iArr6[i12];
                iArr6[i12] = length;
            } else {
                this.f43060g[length] = this.f43062i;
                this.f43062i = length;
            }
            iVar.f43443m++;
            iVar.b(this.f43055b);
            int i19 = this.f43054a + 1;
            this.f43054a = i19;
            if (!this.f43064k) {
                this.f43063j++;
            }
            int[] iArr7 = this.f43059f;
            if (i19 >= iArr7.length) {
                this.f43064k = true;
            }
            if (this.f43063j >= iArr7.length) {
                this.f43064k = true;
                this.f43063j = iArr7.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float j(i iVar) {
        int i10 = this.f43062i;
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            if (this.f43059f[i10] == iVar.f43433c) {
                return this.f43061h[i10];
            }
            i10 = this.f43060g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(float f10) {
        int i10 = this.f43062i;
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            float[] fArr = this.f43061h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f43060g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l(i iVar, float f10, boolean z10) {
        float f11 = f43053n;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f43062i;
            if (i10 == -1) {
                this.f43062i = 0;
                this.f43061h[0] = f10;
                this.f43059f[0] = iVar.f43433c;
                this.f43060g[0] = -1;
                iVar.f43443m++;
                iVar.b(this.f43055b);
                this.f43054a++;
                if (this.f43064k) {
                    return;
                }
                int i11 = this.f43063j + 1;
                this.f43063j = i11;
                int[] iArr = this.f43059f;
                if (i11 >= iArr.length) {
                    this.f43064k = true;
                    this.f43063j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f43054a; i13++) {
                int i14 = this.f43059f[i10];
                int i15 = iVar.f43433c;
                if (i14 == i15) {
                    float[] fArr = this.f43061h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f43053n;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f43062i) {
                            this.f43062i = this.f43060g[i10];
                        } else {
                            int[] iArr2 = this.f43060g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.q(this.f43055b);
                        }
                        if (this.f43064k) {
                            this.f43063j = i10;
                        }
                        iVar.f43443m--;
                        this.f43054a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f43060g[i10];
            }
            int length = this.f43063j;
            int i16 = length + 1;
            if (this.f43064k) {
                int[] iArr3 = this.f43059f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f43059f;
            if (length >= iArr4.length && this.f43054a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f43059f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f43059f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f43057d * 2;
                this.f43057d = i18;
                this.f43064k = false;
                this.f43063j = length - 1;
                this.f43061h = Arrays.copyOf(this.f43061h, i18);
                this.f43059f = Arrays.copyOf(this.f43059f, this.f43057d);
                this.f43060g = Arrays.copyOf(this.f43060g, this.f43057d);
            }
            this.f43059f[length] = iVar.f43433c;
            this.f43061h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f43060g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f43060g[length] = this.f43062i;
                this.f43062i = length;
            }
            iVar.f43443m++;
            iVar.b(this.f43055b);
            this.f43054a++;
            if (!this.f43064k) {
                this.f43063j++;
            }
            int i19 = this.f43063j;
            int[] iArr8 = this.f43059f;
            if (i19 >= iArr8.length) {
                this.f43064k = true;
                this.f43063j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void m() {
        int i10 = this.f43062i;
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            float[] fArr = this.f43061h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f43060g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float n(i iVar, boolean z10) {
        if (this.f43058e == iVar) {
            this.f43058e = null;
        }
        int i10 = this.f43062i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f43054a) {
            if (this.f43059f[i10] == iVar.f43433c) {
                if (i10 == this.f43062i) {
                    this.f43062i = this.f43060g[i10];
                } else {
                    int[] iArr = this.f43060g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.q(this.f43055b);
                }
                iVar.f43443m--;
                this.f43054a--;
                this.f43059f[i10] = -1;
                if (this.f43064k) {
                    this.f43063j = i10;
                }
                return this.f43061h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f43060g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int o() {
        return (this.f43059f.length * 12) + 36;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void p() {
        int i10 = this.f43054a;
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
        b.a aVar = bVar.f43071e;
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            i iVarH = aVar.h(i10);
            l(iVarH, aVar.j(iVarH) * fJ, z10);
        }
        return fJ;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float r(int i10) {
        int i11 = this.f43062i;
        for (int i12 = 0; i11 != -1 && i12 < this.f43054a; i12++) {
            if (i12 == i10) {
                return this.f43061h[i11];
            }
            i11 = this.f43060g[i11];
        }
        return 0.0f;
    }

    public final float s(int i10) {
        return this.f43061h[i10];
    }

    boolean t() {
        int i10 = this.f43062i;
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            if (this.f43061h[i10] > 0.0f) {
                return true;
            }
            i10 = this.f43060g[i10];
        }
        return false;
    }

    public String toString() {
        int i10 = this.f43062i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f43054a; i11++) {
            str = ((str + " -> ") + this.f43061h[i10] + " : ") + this.f43056c.f43076d[this.f43059f[i10]];
            i10 = this.f43060g[i10];
        }
        return str;
    }
}
