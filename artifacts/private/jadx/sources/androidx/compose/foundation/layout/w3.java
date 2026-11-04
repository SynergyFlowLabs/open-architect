package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class w3 extends androidx.core.view.l2.b implements Runnable, androidx.core.view.b1, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final a7 f16514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f16516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.core.view.g3 f16517h;

    public w3(@NotNull a7 a7Var) {
        super(!a7Var.f() ? 1 : 0);
        this.f16514e = a7Var;
    }

    @Override // androidx.core.view.b1
    @NotNull
    public androidx.core.view.g3 b(@NotNull View view, @NotNull androidx.core.view.g3 g3Var) {
        this.f16517h = g3Var;
        this.f16514e.D(g3Var);
        if (this.f16515f) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f16516g) {
            this.f16514e.C(g3Var);
            a7.B(this.f16514e, g3Var, 0, 2, null);
        }
        return this.f16514e.f() ? androidx.core.view.g3.f48754c : g3Var;
    }

    @Override // androidx.core.view.l2.b
    public void c(@NotNull androidx.core.view.l2 l2Var) {
        this.f16515f = false;
        this.f16516g = false;
        androidx.core.view.g3 g3Var = this.f16517h;
        if (l2Var.b() > 0 && g3Var != null) {
            this.f16514e.C(g3Var);
            this.f16514e.D(g3Var);
            a7.B(this.f16514e, g3Var, 0, 2, null);
        }
        this.f16517h = null;
        super.c(l2Var);
    }

    @Override // androidx.core.view.l2.b
    public void d(@NotNull androidx.core.view.l2 l2Var) {
        this.f16515f = true;
        this.f16516g = true;
        super.d(l2Var);
    }

    @Override // androidx.core.view.l2.b
    @NotNull
    public androidx.core.view.g3 e(@NotNull androidx.core.view.g3 g3Var, @NotNull List<androidx.core.view.l2> list) {
        a7.B(this.f16514e, g3Var, 0, 2, null);
        return this.f16514e.f() ? androidx.core.view.g3.f48754c : g3Var;
    }

    @Override // androidx.core.view.l2.b
    @NotNull
    public androidx.core.view.l2.a f(@NotNull androidx.core.view.l2 l2Var, @NotNull androidx.core.view.l2.a aVar) {
        this.f16515f = false;
        return super.f(l2Var, aVar);
    }

    @NotNull
    public final a7 g() {
        return this.f16514e;
    }

    public final boolean h() {
        return this.f16515f;
    }

    public final boolean i() {
        return this.f16516g;
    }

    @Nullable
    public final androidx.core.view.g3 j() {
        return this.f16517h;
    }

    public final void k(boolean z10) {
        this.f16515f = z10;
    }

    public final void l(boolean z10) {
        this.f16516g = z10;
    }

    public final void m(@Nullable androidx.core.view.g3 g3Var) {
        this.f16517h = g3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f16515f) {
            this.f16515f = false;
            this.f16516g = false;
            androidx.core.view.g3 g3Var = this.f16517h;
            if (g3Var != null) {
                this.f16514e.C(g3Var);
                a7.B(this.f16514e, g3Var, 0, 2, null);
                this.f16517h = null;
            }
        }
    }
}
