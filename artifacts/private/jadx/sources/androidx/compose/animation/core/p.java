package androidx.compose.animation.core;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends w> V b(z3<T, V> z3Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return z3Var.a().invoke(t10);
    }

    @k7
    @NotNull
    public static final <T> o<T> c(@NotNull o<T> oVar, long j10) {
        return new r2(oVar, j10);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ g1 d(k0 k0Var, f2 f2Var) {
        return new g1(k0Var, f2Var, t2.d(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ g1 e(k0 k0Var, f2 f2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f2Var = f2.Restart;
        }
        return d(k0Var, f2Var);
    }

    @k7
    @NotNull
    public static final <T> g1<T> f(@NotNull k0<T> k0Var, @NotNull f2 f2Var, long j10) {
        return new g1<>(k0Var, f2Var, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ g1 g(k0 k0Var, f2 f2Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f2Var = f2.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = t2.d(0, 0, 2, null);
        }
        return f(k0Var, f2Var, j10);
    }

    @k7
    @NotNull
    public static final <T> q1<T> h(@NotNull Function1<? super q1.b<T>, Unit> function1) {
        q1.b bVar = new q1.b();
        function1.invoke(bVar);
        return new q1<>(bVar);
    }

    @NotNull
    public static final <T> s1<T> i(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull Function1<? super s1.a<T>, Unit> function1) {
        s1.a aVar = new s1.a();
        function1.invoke(aVar);
        return new s1<>(aVar, f10);
    }

    @NotNull
    public static final <T> s1<T> j(@NotNull Function1<? super s1.a<T>, Unit> function1) {
        s1.a aVar = new s1.a();
        function1.invoke(aVar);
        return new s1<>(aVar);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ g2 k(int i10, k0 k0Var, f2 f2Var) {
        return new g2(i10, k0Var, f2Var, t2.d(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ g2 l(int i10, k0 k0Var, f2 f2Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f2Var = f2.Restart;
        }
        return k(i10, k0Var, f2Var);
    }

    @k7
    @NotNull
    public static final <T> g2<T> m(int i10, @NotNull k0<T> k0Var, @NotNull f2 f2Var, long j10) {
        return new g2<>(i10, k0Var, f2Var, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ g2 n(int i10, k0 k0Var, f2 f2Var, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f2Var = f2.Restart;
        }
        if ((i11 & 8) != 0) {
            j10 = t2.d(0, 0, 2, null);
        }
        return m(i10, k0Var, f2Var, j10);
    }

    @k7
    @NotNull
    public static final <T> l2<T> o(int i10) {
        return new l2<>(i10);
    }

    public static /* synthetic */ l2 p(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return o(i10);
    }

    @k7
    @NotNull
    public static final <T> q2<T> q(float f10, float f11, @Nullable T t10) {
        return new q2<>(f10, f11, t10);
    }

    public static /* synthetic */ q2 r(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return q(f10, f11, obj);
    }

    @k7
    @NotNull
    public static final <T> y3<T> s(int i10, int i11, @NotNull l0 l0Var) {
        return new y3<>(i10, i11, l0Var);
    }

    public static /* synthetic */ y3 t(int i10, int i11, l0 l0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            l0Var = u0.d();
        }
        return s(i10, i11, l0Var);
    }
}
