package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class pa0 extends androidx.compose.ui.platform.u2 implements androidx.compose.ui.layout.o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31728d;

    public pa0(boolean z10, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        super(function1);
        this.f31728d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return !this.f31728d ? androidx.compose.ui.layout.c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.material3.na0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pa0.l((androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null) : androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.oa0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pa0.m(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(@Nullable Object obj) {
        pa0 pa0Var = obj instanceof pa0 ? (pa0) obj : null;
        return pa0Var != null && this.f31728d == pa0Var.f31728d;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f31728d);
    }

    public final boolean k() {
        return this.f31728d;
    }
}
