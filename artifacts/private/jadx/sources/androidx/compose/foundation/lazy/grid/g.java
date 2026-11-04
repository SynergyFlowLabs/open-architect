package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.compose.foundation.b2
@SourceDebugExtension({"SMAP\nLazyGridCacheWindowStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridCacheWindowStrategy.kt\nandroidx/compose/foundation/lazy/grid/LazyGridCacheWindowPrefetchStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n55#1,4:165\n55#1,4:169\n1#2:173\n*S KotlinDebug\n*F\n+ 1 LazyGridCacheWindowStrategy.kt\nandroidx/compose/foundation/lazy/grid/LazyGridCacheWindowPrefetchStrategy\n*L\n39#1:165,4\n43#1:169,4\n*E\n"})
public final class g extends androidx.compose.foundation.lazy.layout.g implements d1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f16800p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final i f16801o;

    public g(@NotNull androidx.compose.foundation.lazy.layout.w wVar) {
        super(wVar);
        this.f16801o = new i();
    }

    private final void D(c1 c1Var, n0 n0Var, Function1<? super androidx.compose.foundation.lazy.layout.i, Unit> function1) {
        this.f16801o.s(n0Var);
        this.f16801o.t(c1Var);
        function1.invoke(this.f16801o);
    }

    @Override // androidx.compose.foundation.lazy.grid.d1
    public void a(@NotNull m2 m2Var, int i10) {
        int iE = m2Var.e();
        for (int i11 = 0; i11 < iE; i11++) {
            m2Var.d(i10 + i11);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.d1
    public void d(@NotNull c1 c1Var, float f10, @NotNull n0 n0Var) {
        this.f16801o.s(n0Var);
        this.f16801o.t(c1Var);
        v(this.f16801o, f10);
    }

    @Override // androidx.compose.foundation.lazy.grid.d1
    public void f(@NotNull c1 c1Var, @NotNull n0 n0Var) {
        this.f16801o.s(n0Var);
        this.f16801o.t(c1Var);
        w(this.f16801o);
    }
}
