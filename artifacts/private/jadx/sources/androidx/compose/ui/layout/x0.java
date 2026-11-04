package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x0 implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39584b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<? extends g0> f39585a;

    /* JADX WARN: Multi-variable type inference failed */
    public x0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.layout.w0
    @NotNull
    public g0 K(@NotNull g0 g0Var) {
        u0 u0VarP3;
        u0 u0Var = g0Var instanceof u0 ? (u0) g0Var : null;
        if (u0Var != null) {
            return u0Var;
        }
        Intrinsics.checkNotNull(g0Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        androidx.compose.ui.node.k1 k1Var = (androidx.compose.ui.node.k1) g0Var;
        androidx.compose.ui.node.v0 v0VarN4 = k1Var.N4();
        return (v0VarN4 == null || (u0VarP3 = v0VarN4.p3()) == null) ? k1Var : u0VarP3;
    }

    @Override // androidx.compose.ui.layout.w0
    @NotNull
    public g0 N(@NotNull i2.a aVar) {
        Function0<? extends g0> function0 = this.f39585a;
        Intrinsics.checkNotNull(function0);
        return function0.invoke();
    }

    @Nullable
    public final Function0<g0> a() {
        return this.f39585a;
    }

    public final void b(@Nullable Function0<? extends g0> function0) {
        this.f39585a = function0;
    }

    public x0(@Nullable Function0<? extends g0> function0) {
        this.f39585a = function0;
    }

    public /* synthetic */ x0(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0);
    }
}
