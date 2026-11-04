package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    @NotNull
    public static final h2 a(@NotNull h2 h2Var, long j10, int i10, @Nullable BlurMaskFilter blurMaskFilter, int i11) {
        h2Var.S(j10);
        h2Var.s(i10);
        h2Var.G(i11);
        d.b(h2Var, blurMaskFilter);
        return h2Var;
    }

    public static /* synthetic */ h2 b(h2 h2Var, long j10, int i10, BlurMaskFilter blurMaskFilter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = q0.f38131b.a();
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            i10 = d0.f37693b.B();
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            blurMaskFilter = null;
        }
        BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i12 & 8) != 0) {
            i11 = j2.f37801b.a();
        }
        return a(h2Var, j11, i13, blurMaskFilter2, i11);
    }
}
