package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c1 implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41562b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h1 f41563a = k1.a();

    @Override // androidx.compose.ui.text.font.i0
    @Nullable
    public u1 a(@NotNull r1 r1Var, @NotNull d1 d1Var, @NotNull Function1<? super u1.b, Unit> function1, @NotNull Function1<? super r1, ? extends Object> function2) {
        Typeface typefaceB;
        y yVarH = r1Var.h();
        if (yVarH == null || (yVarH instanceof p)) {
            typefaceB = this.f41563a.b(r1Var.k(), r1Var.i());
        } else if (yVarH instanceof z0) {
            typefaceB = this.f41563a.a((z0) r1Var.h(), r1Var.k(), r1Var.i());
        } else {
            if (!(yVarH instanceof a1)) {
                return null;
            }
            n1 n1VarS = ((a1) r1Var.h()).s();
            Intrinsics.checkNotNull(n1VarS, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceB = ((androidx.compose.ui.text.platform.q) n1VarS).b(r1Var.k(), r1Var.i(), r1Var.j());
        }
        return new u1.b(typefaceB, false, 2, null);
    }
}
