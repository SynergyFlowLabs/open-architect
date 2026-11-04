package androidx.compose.material3.internal;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a3 f28661a = new a3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28662b = 0;

    @k7
    public interface a {
        int a(@NotNull androidx.compose.ui.unit.s sVar, long j10, int i10, @NotNull androidx.compose.ui.unit.w wVar);
    }

    @k7
    public interface b {
        int a(@NotNull androidx.compose.ui.unit.s sVar, long j10, int i10);
    }

    private a3() {
    }

    public static /* synthetic */ b b(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.a(i10);
    }

    public static /* synthetic */ b d(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.c(i10);
    }

    public static /* synthetic */ b f(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
            int i12 = 3 >> 0;
        }
        return a3Var.e(i10);
    }

    public static /* synthetic */ a h(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.g(i10);
    }

    public static /* synthetic */ a j(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
            int i12 = 3 ^ 0;
        }
        return a3Var.i(i10);
    }

    public static /* synthetic */ a l(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.k(i10);
    }

    public static /* synthetic */ a n(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.m(i10);
    }

    public static /* synthetic */ b p(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.o(i10);
    }

    public static /* synthetic */ b r(a3 a3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a3Var.q(i10);
    }

    @NotNull
    public final b a(int i10) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        return new p.b(aVar.a(), aVar.w(), i10);
    }

    @NotNull
    public final b c(int i10) {
        return new g4.b(androidx.compose.ui.e.f37317a.a(), i10);
    }

    @NotNull
    public final b e(int i10) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        return new p.b(aVar.q(), aVar.w(), i10);
    }

    @NotNull
    public final a g(int i10) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        return new p.a(aVar.s(), aVar.s(), i10);
    }

    @NotNull
    public final a i(int i10) {
        return new g4.a(androidx.compose.ui.a.f36929a.i(), i10);
    }

    @NotNull
    public final a k(int i10) {
        return new g4.a(androidx.compose.ui.a.f36929a.k(), i10);
    }

    @NotNull
    public final a m(int i10) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        return new p.a(aVar.u(), aVar.u(), i10);
    }

    @NotNull
    public final b o(int i10) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        return new p.b(aVar.w(), aVar.a(), i10);
    }

    @NotNull
    public final b q(int i10) {
        return new g4.b(androidx.compose.ui.e.f37317a.w(), i10);
    }
}
