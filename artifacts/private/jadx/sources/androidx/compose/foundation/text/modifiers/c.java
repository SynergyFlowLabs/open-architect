package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.j5;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return androidx.compose.ui.unit.b.f42658b.b(0, c(j10, z10, i10, f10), 0, androidx.compose.ui.unit.b.o(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !d(i10)) {
            return kotlin.ranges.r.u(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iP = ((z10 || d(i10)) && androidx.compose.ui.unit.b.j(j10)) ? androidx.compose.ui.unit.b.p(j10) : Integer.MAX_VALUE;
        return androidx.compose.ui.unit.b.r(j10) == iP ? iP : kotlin.ranges.r.I(j5.a(f10), androidx.compose.ui.unit.b.r(j10), iP);
    }

    public static final boolean d(int i10) {
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        return androidx.compose.ui.text.style.v.i(i10, aVar.c()) || androidx.compose.ui.text.style.v.i(i10, aVar.g()) || androidx.compose.ui.text.style.v.i(i10, aVar.e());
    }
}
