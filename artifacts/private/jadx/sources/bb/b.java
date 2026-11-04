package bb;

import androidx.compose.animation.k;
import androidx.compose.animation.l;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    @o
    @p(scheme = "[0[0]]")
    public static final void b(final boolean z10, @Nullable a0 a0Var, @Nullable String str, @NotNull final n<? super l, ? super c0, ? super Integer, Unit> content, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        final a0 a0Var2;
        final String str2;
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(-6498569);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(str) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(content) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c0VarR.d()) {
            c0VarR.u();
            a0Var2 = a0Var;
            str2 = str;
        } else {
            a0 a0Var3 = i13 != 0 ? a0.E : a0Var;
            String str3 = i14 != 0 ? "Planner5DAnimatedVisibility" : str;
            if (m0.l0()) {
                m0.A0(-6498569, i12, -1, "com.planner5d.library.compose.view.theme.AnimatedVisibility (AnimatedVisibility.kt:11)");
            }
            int i15 = i12 & g.f334652s;
            int i16 = i12 << 6;
            a0 a0Var4 = a0Var3;
            String str4 = str3;
            k.j(z10, a0Var4, null, null, str4, content, c0VarR, i15 | (57344 & i16) | (i16 & 458752), 12);
            if (m0.l0()) {
                m0.z0();
            }
            a0Var2 = a0Var4;
            str2 = str4;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: bb.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.c(z10, a0Var2, str2, content, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(boolean z10, a0 a0Var, String str, n nVar, int i10, int i11, c0 c0Var, int i12) {
        b(z10, a0Var, str, nVar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
