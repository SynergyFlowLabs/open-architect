package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 {
    @NotNull
    public static final t1 a(int i10, int i11, int i12, boolean z10, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        return j.a(i10, i11, i12, z10, cVar);
    }

    public static /* synthetic */ t1 b(int i10, int i11, int i12, boolean z10, androidx.compose.ui.graphics.colorspace.c cVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = u1.f38249b.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            cVar = androidx.compose.ui.graphics.colorspace.k.f37611a.K();
        }
        return a(i10, i11, i12, z10, cVar);
    }

    @NotNull
    public static final t1 c(@NotNull byte[] bArr) {
        return j.d(bArr);
    }

    @NotNull
    public static final y2 d(@NotNull t1 t1Var, int i10, int i11, int i12, int i13, @NotNull int[] iArr, int i14, int i15) {
        t1Var.a(iArr, i10, i11, i12, i13, i14, i15);
        return new y2(iArr, i12, i13, i14, i15);
    }

    public static /* synthetic */ y2 e(t1 t1Var, int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = 0;
        }
        if ((i16 & 2) != 0) {
            i11 = 0;
        }
        if ((i16 & 4) != 0) {
            i12 = t1Var.getWidth();
        }
        if ((i16 & 8) != 0) {
            i13 = t1Var.getHeight();
        }
        if ((i16 & 16) != 0) {
            iArr = new int[i12 * i13];
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        return d(t1Var, i10, i11, i12, i13, iArr, i14, i15);
    }
}
