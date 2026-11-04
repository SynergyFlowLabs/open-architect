package androidx.compose.material;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o4 f24030a = new o4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f24031b = androidx.compose.runtime.internal.w.c(269254275, false, b.f24034a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f24032c = androidx.compose.runtime.internal.w.c(1260131259, false, a.f24033a);

    static final class a implements pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24033a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1260131259, i10, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda$1260131259.<anonymous> (AppBar.kt:164)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24034a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(269254275, i10, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda$269254275.<anonymous> (AppBar.kt:88)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f24032c;
    }

    @NotNull
    public final pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> b() {
        return f24031b;
    }
}
