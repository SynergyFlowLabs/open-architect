package androidx.compose.ui.node;

import androidx.compose.ui.graphics.z3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f39730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f39731g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f39725a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39726b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f39732h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39733i = z3.f38723b.a();

    public final void a(@NotNull androidx.compose.ui.graphics.r1 r1Var) {
        this.f39725a = r1Var.B();
        this.f39726b = r1Var.F();
        this.f39727c = r1Var.p();
        this.f39728d = r1Var.o();
        this.f39729e = r1Var.D();
        this.f39730f = r1Var.q();
        this.f39731g = r1Var.v();
        this.f39732h = r1Var.i();
        this.f39733i = r1Var.c6();
    }

    public final void b(@NotNull e0 e0Var) {
        this.f39725a = e0Var.f39725a;
        this.f39726b = e0Var.f39726b;
        this.f39727c = e0Var.f39727c;
        this.f39728d = e0Var.f39728d;
        this.f39729e = e0Var.f39729e;
        this.f39730f = e0Var.f39730f;
        this.f39731g = e0Var.f39731g;
        this.f39732h = e0Var.f39732h;
        this.f39733i = e0Var.f39733i;
    }

    public final boolean c(@NotNull e0 e0Var) {
        return this.f39725a == e0Var.f39725a && this.f39726b == e0Var.f39726b && this.f39727c == e0Var.f39727c && this.f39728d == e0Var.f39728d && this.f39729e == e0Var.f39729e && this.f39730f == e0Var.f39730f && this.f39731g == e0Var.f39731g && this.f39732h == e0Var.f39732h && z3.i(this.f39733i, e0Var.f39733i);
    }
}
