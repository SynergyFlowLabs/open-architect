package androidx.compose.ui.input.pointer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u0 implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39136b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private n0 f39137a;

    @Nullable
    public final n0 c() {
        return this.f39137a;
    }

    public void d(boolean z10) {
        n0 n0Var = this.f39137a;
        if (n0Var != null) {
            n0Var.f(z10);
        }
    }

    public final void f(@Nullable n0 n0Var) {
        this.f39137a = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        d(bool.booleanValue());
        return Unit.f312394a;
    }
}
