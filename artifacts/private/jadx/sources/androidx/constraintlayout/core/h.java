package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class h extends androidx.constraintlayout.core.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f43404o = 1.0E-4f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f43405p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f43406q = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i[] f43408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i[] f43409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f43411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    c f43412n;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f43433c - iVar2.f43433c;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f43414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f43415b;

        b(h hVar) {
            this.f43415b = hVar;
        }

        public void a(i iVar) {
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f43414a.f43439i;
                float f10 = fArr[i10] + iVar.f43439i[i10];
                fArr[i10] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f43414a.f43439i[i10] = 0.0f;
                }
            }
        }

        public boolean b(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f43414a.f43431a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f43439i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f43414a.f43439i[i10] = f12;
                    } else {
                        this.f43414a.f43439i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f43414a.f43439i;
                float f13 = fArr[i11] + (iVar.f43439i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f43414a.f43439i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.J(this.f43414a);
            }
            return false;
        }

        public void c(i iVar) {
            this.f43414a = iVar;
        }

        public final boolean d() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f43414a.f43439i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i10 = 0; i10 < 9; i10++) {
                if (this.f43414a.f43439i[i10] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f43439i[i10];
                float f11 = this.f43414a.f43439i[i10];
                if (f11 != f10) {
                    if (f11 >= f10) {
                        break;
                    }
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f43414a.f43439i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f43414a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f43414a.f43439i[i10] + " ";
                }
            }
            return str + "] " + this.f43414a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f43407i = 128;
        this.f43408j = new i[128];
        this.f43409k = new i[128];
        this.f43410l = 0;
        this.f43411m = new b(this);
        this.f43412n = cVar;
    }

    private void I(i iVar) {
        int i10;
        int i11 = this.f43410l + 1;
        i[] iVarArr = this.f43408j;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f43408j = iVarArr2;
            this.f43409k = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f43408j;
        int i12 = this.f43410l;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f43410l = i13;
        if (i13 > 1 && iVarArr3[i12].f43433c > iVar.f43433c) {
            int i14 = 0;
            while (true) {
                i10 = this.f43410l;
                if (i14 >= i10) {
                    break;
                }
                this.f43409k[i14] = this.f43408j[i14];
                i14++;
            }
            Arrays.sort(this.f43409k, 0, i10, new a());
            for (int i15 = 0; i15 < this.f43410l; i15++) {
                this.f43408j[i15] = this.f43409k[i15];
            }
        }
        iVar.f43431a = true;
        iVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(i iVar) {
        int i10 = 0;
        while (i10 < this.f43410l) {
            if (this.f43408j[i10] == iVar) {
                while (true) {
                    int i11 = this.f43410l;
                    if (i10 >= i11 - 1) {
                        this.f43410l = i11 - 1;
                        iVar.f43431a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f43408j;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void b(e eVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        i iVar = bVar.f43067a;
        if (iVar == null) {
            return;
        }
        androidx.constraintlayout.core.b.a aVar = bVar.f43071e;
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            i iVarH = aVar.h(i10);
            float fR = aVar.r(i10);
            this.f43411m.c(iVarH);
            if (this.f43411m.b(iVar, fR)) {
                I(iVarH);
            }
            this.f43068b += bVar.f43068b * fR;
        }
        J(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public i c(e eVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f43410l; i11++) {
            i iVar = this.f43408j[i11];
            if (!zArr[iVar.f43433c]) {
                this.f43411m.c(iVar);
                if (i10 == -1) {
                    if (this.f43411m.d()) {
                        i10 = i11;
                    }
                } else if (this.f43411m.f(this.f43408j[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f43408j[i10];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void clear() {
        this.f43410l = 0;
        this.f43068b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void f(i iVar) {
        this.f43411m.c(iVar);
        this.f43411m.g();
        iVar.f43439i[iVar.f43435e] = 1.0f;
        I(iVar);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public boolean isEmpty() {
        return this.f43410l == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        String str = " goal -> (" + this.f43068b + ") : ";
        for (int i10 = 0; i10 < this.f43410l; i10++) {
            this.f43411m.c(this.f43408j[i10]);
            str = str + this.f43411m + " ";
        }
        return str;
    }
}
