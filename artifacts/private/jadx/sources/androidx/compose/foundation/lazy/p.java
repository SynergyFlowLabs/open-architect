package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyListCacheWindowStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListCacheWindowStrategy.kt\nandroidx/compose/foundation/lazy/LazyListCacheWindowStrategy\n*L\n1#1,147:1\n65#1,4:148\n65#1,4:152\n*S KotlinDebug\n*F\n+ 1 LazyListCacheWindowStrategy.kt\nandroidx/compose/foundation/lazy/LazyListCacheWindowStrategy\n*L\n41#1:148,4\n45#1:152,4\n*E\n"})
public final class p extends androidx.compose.foundation.lazy.layout.g implements t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f17694p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final o f17695o;

    public p(@NotNull androidx.compose.foundation.lazy.layout.w wVar) {
        super(wVar);
        this.f17695o = new o();
    }

    private final void D(s0 s0Var, f0 f0Var, Function1<? super androidx.compose.foundation.lazy.layout.i, Unit> function1) {
        this.f17695o.r(f0Var);
        this.f17695o.s(s0Var);
        function1.invoke(this.f17695o);
    }

    @Override // androidx.compose.foundation.lazy.t0
    public void a(@NotNull m2 m2Var, int i10) {
        int iE = m2Var.e() == -1 ? 2 : m2Var.e();
        for (int i11 = 0; i11 < iE; i11++) {
            m2Var.d(i10 + i11);
        }
    }

    @Override // androidx.compose.foundation.lazy.t0
    public void e(@NotNull s0 s0Var, float f10, @NotNull f0 f0Var) {
        this.f17695o.r(f0Var);
        this.f17695o.s(s0Var);
        v(this.f17695o, f10);
    }

    @Override // androidx.compose.foundation.lazy.t0
    public void g(@NotNull s0 s0Var, @NotNull f0 f0Var) {
        this.f17695o.r(f0Var);
        this.f17695o.s(s0Var);
        w(this.f17695o);
    }
}
