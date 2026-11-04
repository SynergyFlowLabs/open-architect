package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<td> f25385a = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material.vd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return wd.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final xd f25386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final xd f25387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.material.ripple.l f25388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.material.ripple.l f25389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.material.ripple.l f25390f;

    static {
        androidx.compose.ui.unit.h.a aVar = androidx.compose.ui.unit.h.f42689b;
        float fE = aVar.e();
        androidx.compose.ui.graphics.q0.a aVar2 = androidx.compose.ui.graphics.q0.f38131b;
        f25386b = new xd(true, fE, aVar2.u(), (DefaultConstructorMarker) null);
        int i10 = 7 << 0;
        f25387c = new xd(false, aVar.e(), aVar2.u(), (DefaultConstructorMarker) null);
        f25388d = new androidx.compose.material.ripple.l(0.16f, 0.24f, 0.08f, 0.24f);
        f25389e = new androidx.compose.material.ripple.l(0.08f, 0.12f, 0.04f, 0.12f);
        f25390f = new androidx.compose.material.ripple.l(0.08f, 0.12f, 0.04f, 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td b() {
        return new td(0L, null, 3, null);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<td> f() {
        return f25385a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.foundation.z2 g(boolean z10, float f10, long j10) {
        if (androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e()) && androidx.compose.ui.graphics.q0.y(j10, androidx.compose.ui.graphics.q0.f38131b.u())) {
            return z10 ? f25386b : f25387c;
        }
        return new xd(z10, f10, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.foundation.z2 h(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        return g(z10, f10, j10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.foundation.z2 i(@NotNull androidx.compose.ui.graphics.x0 x0Var, boolean z10, float f10) {
        return new xd(z10, f10, x0Var, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.foundation.z2 j(androidx.compose.ui.graphics.x0 x0Var, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return i(x0Var, z10, f10);
    }
}
