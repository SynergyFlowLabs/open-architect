package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<dt> f28023a = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.ft
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return gt.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ht f28024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final ht f28025c;

    static {
        androidx.compose.ui.unit.h.a aVar = androidx.compose.ui.unit.h.f42689b;
        float fE = aVar.e();
        androidx.compose.ui.graphics.q0.a aVar2 = androidx.compose.ui.graphics.q0.f38131b;
        f28024b = new ht(true, fE, aVar2.u(), (DefaultConstructorMarker) null);
        f28025c = new ht(false, aVar.e(), aVar2.u(), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt b() {
        return new dt(0L, null, 3, null);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<dt> c() {
        return f28023a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.foundation.z2 d(boolean z10, float f10, long j10) {
        if (androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e()) && androidx.compose.ui.graphics.q0.y(j10, androidx.compose.ui.graphics.q0.f38131b.u())) {
            return z10 ? f28024b : f28025c;
        }
        return new ht(z10, f10, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.foundation.z2 e(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        return d(z10, f10, j10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.foundation.z2 f(@NotNull androidx.compose.ui.graphics.x0 x0Var, boolean z10, float f10) {
        return new ht(z10, f10, x0Var, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.foundation.z2 g(androidx.compose.ui.graphics.x0 x0Var, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return f(x0Var, z10, f10);
    }
}
