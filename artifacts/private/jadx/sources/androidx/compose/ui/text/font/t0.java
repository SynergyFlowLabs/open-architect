package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    @NotNull
    public static final Object a(int i10, @NotNull Object obj, @NotNull x xVar, @NotNull v0 v0Var, int i11) {
        boolean z10;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z11 = false;
        if (!r0.k(i10) || Intrinsics.areEqual(xVar.a(), v0Var)) {
            z10 = false;
        } else {
            v0.a aVar = v0.f41742b;
            if (v0Var.compareTo(j.a(aVar)) < 0 || xVar.a().compareTo(j.a(aVar)) >= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (r0.j(i10) && !q0.f(i11, xVar.c())) {
            z11 = true;
        }
        if (z11 || z10) {
            return q1.f41694a.a((Typeface) obj, z10 ? v0Var.O() : xVar.a().O(), z11 ? q0.f(i11, q0.f41690b.a()) : q0.f(xVar.c(), q0.f41690b.a()));
        }
        return obj;
    }
}
