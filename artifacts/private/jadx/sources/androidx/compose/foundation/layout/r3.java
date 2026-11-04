package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r3 implements s3, o3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16390e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y2 f16392b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f16394d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t3 f16391a = t3.f16433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f16393c = v2.b(null, new Function0() { // from class: androidx.compose.foundation.layout.p3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(r3.u(this.f16271a));
        }
    }, 1, null);

    public r3(@NotNull y2 y2Var) {
        this.f16392b = y2Var;
        this.f16394d = v2.a(y2Var.o(), new Function0() { // from class: androidx.compose.foundation.layout.q3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(r3.t(this.f16362a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(r3 r3Var) {
        return r3Var.f16392b.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(r3 r3Var) {
        return r3Var.f16392b.j();
    }

    @Override // androidx.compose.foundation.layout.o3
    public int a() {
        return ((Number) this.f16393c.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.s3
    @u1
    @NotNull
    public androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return this.f16391a.c(a0Var, f10);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16391a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16391a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.o3
    public int i() {
        return ((Number) this.f16394d.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.s sVar) {
        return this.f16391a.k(a0Var, sVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar) {
        return this.f16391a.n(a0Var, cVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var) {
        return this.f16391a.o(a0Var);
    }
}
