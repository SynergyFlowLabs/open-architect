package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.l1
@androidx.annotation.w0(28)
final class i1 implements h1 {
    private final Typeface d(String str, v0 v0Var, int i10) {
        q0.a aVar = q0.f41690b;
        if (q0.f(i10, aVar.c()) && Intrinsics.areEqual(v0Var, v0.f41742b.m()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), v0Var.O(), q0.f(i10, aVar.a()));
    }

    static /* synthetic */ Typeface e(i1 i1Var, String str, v0 v0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return i1Var.d(str, v0Var, i10);
    }

    private final Typeface f(String str, v0 v0Var, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, v0Var, i10);
        if (Intrinsics.areEqual(typefaceD, q1.f41694a.a(Typeface.DEFAULT, v0Var.O(), q0.f(i10, q0.f41690b.a()))) || Intrinsics.areEqual(typefaceD, d(null, v0Var, i10))) {
            return null;
        }
        return typefaceD;
    }

    @Override // androidx.compose.ui.text.font.h1
    @NotNull
    public Typeface a(@NotNull z0 z0Var, @NotNull v0 v0Var, int i10) {
        return d(z0Var.s(), v0Var, i10);
    }

    @Override // androidx.compose.ui.text.font.h1
    @NotNull
    public Typeface b(@NotNull v0 v0Var, int i10) {
        return d(null, v0Var, i10);
    }

    @Override // androidx.compose.ui.text.font.h1
    @Nullable
    public Typeface c(@NotNull String str, @NotNull v0 v0Var, int i10, @NotNull u0.e eVar, @NotNull Context context) {
        Typeface typefaceA;
        y.a aVar = y.f41770b;
        if (Intrinsics.areEqual(str, aVar.d().s())) {
            typefaceA = a(aVar.d(), v0Var, i10);
        } else if (Intrinsics.areEqual(str, aVar.e().s())) {
            typefaceA = a(aVar.e(), v0Var, i10);
        } else if (Intrinsics.areEqual(str, aVar.c().s())) {
            typefaceA = a(aVar.c(), v0Var, i10);
        } else {
            typefaceA = Intrinsics.areEqual(str, aVar.a().s()) ? a(aVar.a(), v0Var, i10) : f(str, v0Var, i10);
        }
        return k1.c(typefaceA, eVar, context);
    }
}
