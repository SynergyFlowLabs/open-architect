package androidx.compose.foundation;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.semantics.d0<Function0<n0.g>> f14265a = new androidx.compose.ui.semantics.d0<>("MagnifierPositionInRoot", (Function2) null, 2, (DefaultConstructorMarker) null);

    public static final boolean a(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    @NotNull
    public static final androidx.compose.ui.semantics.d0<Function0<n0.g>> b() {
        return f14265a;
    }

    @androidx.annotation.k(api = 28)
    public static final boolean c(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return c(i10);
    }

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.unit.d, n0.g> function1, @Nullable Function1<? super androidx.compose.ui.unit.d, n0.g> function2, @Nullable Function1<? super androidx.compose.ui.unit.l, Unit> function3, float f10, long j10, float f11, float f12, boolean z10) {
        return h(a0Var, function1, function2, function3, f10, false, j10, f11, f12, z10, null, 512, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, Function1 function1, Function1 function2, Function1 function3, float f10, long j10, float f11, float f12, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            j10 = androidx.compose.ui.unit.l.f42704b.a();
        }
        if ((i10 & 32) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 64) != 0) {
            f12 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 128) != 0) {
            z10 = true;
        }
        return e(a0Var, function1, function2, function3, f10, j10, f11, f12, z10);
    }

    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.unit.d, n0.g> function1, @Nullable Function1<? super androidx.compose.ui.unit.d, n0.g> function2, @Nullable Function1<? super androidx.compose.ui.unit.l, Unit> function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, @Nullable d4 d4Var) {
        if (d(0, 1, null)) {
            return a0Var.B2(new MagnifierElement(function1, function2, function3, f10, z10, j10, f11, f12, z11, d4Var == null ? d4.f14136a.a() : d4Var, null));
        }
        return a0Var;
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, Function1 function1, Function1 function2, Function1 function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            j10 = androidx.compose.ui.unit.l.f42704b.a();
        }
        if ((i10 & 64) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 128) != 0) {
            f12 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        if ((i10 & 512) != 0) {
            d4Var = null;
        }
        return g(a0Var, function1, function2, function3, f10, z10, j10, f11, f12, z11, d4Var);
    }
}
