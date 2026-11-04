package androidx.compose.ui.text.android;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f1 f41448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41449b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f41450c;

    public y(@NotNull f1 f1Var) {
        this.f41448a = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private final float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i11 = 1;
        if (z10) {
            int iA = c0.a(this.f41448a.k(), i10, z10);
            int iB = this.f41448a.B(iA);
            int iV = this.f41448a.v(iA);
            if (i10 == iB || i10 == iV) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f41449b == i13) {
            return this.f41450c;
        }
        float fJ = z12 ? this.f41448a.J(i10, z10) : this.f41448a.M(i10, z10);
        if (z11) {
            this.f41449b = i13;
            this.f41450c = fJ;
        }
        return fJ;
    }

    @NotNull
    public final f1 b() {
        return this.f41448a;
    }

    public final float c(int i10) {
        return a(i10, false, false, true);
    }

    public final float d(int i10) {
        return a(i10, true, true, true);
    }

    public final float e(int i10) {
        return a(i10, false, false, false);
    }

    public final float f(int i10) {
        return a(i10, true, true, false);
    }
}
