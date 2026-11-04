package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class h2 implements i2, e2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16071e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y2 f16073b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f16075d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ j2 f16072a = j2.f16141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f16074c = v2.b(null, new Function0() { // from class: androidx.compose.foundation.layout.f2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(h2.t(this.f16011a));
        }
    }, 1, null);

    public h2(@NotNull y2 y2Var) {
        this.f16073b = y2Var;
        boolean z10 = false & false;
        this.f16075d = v2.a(y2Var.o(), new Function0() { // from class: androidx.compose.foundation.layout.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(h2.s(this.f16031a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(h2 h2Var) {
        return h2Var.f16073b.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(h2 h2Var) {
        return h2Var.f16073b.j();
    }

    @Override // androidx.compose.foundation.layout.e2
    public int a() {
        return ((Number) this.f16074c.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16072a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.i2
    @u1
    @NotNull
    public androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return this.f16072a.g(a0Var, f10);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16072a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.e2
    public int i() {
        return ((Number) this.f16075d.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.h3 h3Var) {
        return this.f16072a.n(a0Var, h3Var);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.b bVar) {
        return this.f16072a.p(a0Var, bVar);
    }
}
