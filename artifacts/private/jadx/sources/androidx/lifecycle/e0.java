package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.l0
@SourceDebugExtension({"SMAP\nLifecycleController.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,69:1\n55#1,3:70\n55#1,3:73\n*S KotlinDebug\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n47#1:70,3\n34#1:73,3\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f52310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c0.b f52311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r f52312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final j0 f52313d;

    public e0(@NotNull c0 lifecycle, @NotNull c0.b minState, @NotNull r dispatchQueue, @NotNull final kotlinx.coroutines.p2 parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.f52310a = lifecycle;
        this.f52311b = minState;
        this.f52312c = dispatchQueue;
        j0 j0Var = new j0() { // from class: androidx.lifecycle.d0
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, c0.a aVar) {
                e0.d(this.f52306a, parentJob, o0Var, aVar);
            }
        };
        this.f52313d = j0Var;
        if (lifecycle.d() != c0.b.DESTROYED) {
            lifecycle.c(j0Var);
            return;
        }
        int i10 = 4 | 1;
        kotlinx.coroutines.p2.a.b(parentJob, null, 1, null);
        b();
    }

    private final void c(kotlinx.coroutines.p2 p2Var) {
        kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e0 e0Var, kotlinx.coroutines.p2 p2Var, o0 source, c0.a aVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        if (source.getLifecycle().d() == c0.b.DESTROYED) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            e0Var.b();
        } else if (source.getLifecycle().d().compareTo(e0Var.f52311b) < 0) {
            e0Var.f52312c.h();
        } else {
            e0Var.f52312c.i();
        }
    }

    @androidx.annotation.l0
    public final void b() {
        this.f52310a.g(this.f52313d);
        this.f52312c.g();
    }
}
