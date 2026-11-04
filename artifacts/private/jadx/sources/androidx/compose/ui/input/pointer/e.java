package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39001d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private c0 f39002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39004c;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @kotlin.l(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void b() {
    }

    @kotlin.l(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void d() {
    }

    public final boolean a() {
        c0 c0VarP;
        c0 c0Var = this.f39002a;
        if (c0Var != null && (c0VarP = c0Var.p()) != null) {
            return c0VarP.q();
        }
        c0 c0Var2 = this.f39002a;
        return c0Var2 != null ? c0Var2.q() : this.f39004c;
    }

    public final boolean c() {
        c0 c0VarP;
        c0 c0Var = this.f39002a;
        if (c0Var != null && (c0VarP = c0Var.p()) != null) {
            return c0VarP.v();
        }
        c0 c0Var2 = this.f39002a;
        return c0Var2 != null ? c0Var2.v() : this.f39003b;
    }

    public final void e(boolean z10) {
        c0 c0VarP;
        c0 c0Var = this.f39002a;
        if (c0Var != null && (c0VarP = c0Var.p()) != null) {
            c0VarP.H(z10);
        }
        c0 c0Var2 = this.f39002a;
        if (c0Var2 != null) {
            c0Var2.H(z10);
        }
        this.f39004c = z10;
    }

    public final void f(boolean z10) {
        c0 c0VarP;
        c0 c0Var = this.f39002a;
        if (c0Var != null && (c0VarP = c0Var.p()) != null) {
            c0VarP.J(z10);
        }
        c0 c0Var2 = this.f39002a;
        if (c0Var2 != null) {
            c0Var2.J(z10);
        }
        this.f39003b = z10;
    }

    public e(boolean z10, boolean z11) {
        this.f39003b = z10;
        this.f39004c = z11;
    }

    public /* synthetic */ e(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    public e(@NotNull c0 c0Var) {
        this(c0Var.v(), c0Var.q());
        this.f39002a = c0Var;
    }
}
