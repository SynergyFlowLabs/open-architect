package androidx.compose.material3.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f29169t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.semantics.e0, Unit> f29170s;

    public t1(@NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        this.f29170s = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x9(androidx.compose.ui.semantics.e0 e0Var, androidx.compose.ui.node.p2 p2Var) {
        Intrinsics.checkNotNull(p2Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((c3) p2Var).w9(e0Var);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z9(androidx.compose.ui.node.p2 p2Var) {
        Intrinsics.checkNotNull(p2Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((c3) p2Var).x9();
        return false;
    }

    public final void A9(@NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        this.f29170s = function1;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        super.f9();
        androidx.compose.ui.node.q2.c(this, d3.f28797a, new Function1() { // from class: androidx.compose.material3.internal.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(t1.z9((androidx.compose.ui.node.p2) obj));
            }
        });
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull final androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.node.q2.c(this, d3.f28797a, new Function1() { // from class: androidx.compose.material3.internal.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(t1.x9(e0Var, (androidx.compose.ui.node.p2) obj));
            }
        });
        this.f29170s.invoke(e0Var);
    }

    @NotNull
    public final Function1<androidx.compose.ui.semantics.e0, Unit> y9() {
        return this.f29170s;
    }
}
