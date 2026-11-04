package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13131a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13132b = 1000;

    @NotNull
    public static final f0<Float, s> c(@NotNull a1 a1Var, float f10, float f11) {
        return new f0<>((g0<Float>) i0.e(a1Var), t4.P(kotlin.jvm.internal.z.f312833a), Float.valueOf(f10), x.a(f11));
    }

    public static /* synthetic */ f0 d(a1 a1Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return c(a1Var, f10, f11);
    }

    @NotNull
    public static final <T, V extends w> g3<T, V> e(@NotNull o<T> oVar, @NotNull z3<T, V> z3Var, T t10, T t11, T t12) {
        return new g3<>(oVar, z3Var, t10, t11, z3Var.a().invoke(t12));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public static final <V extends w> g3<V, V> f(@NotNull u4<V> u4Var, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return new g3<>(u4Var, (z3<V, V>) t4.K(new Function1() { // from class: androidx.compose.animation.core.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.g((w) obj);
            }
        }, new Function1() { // from class: androidx.compose.animation.core.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.h((w) obj);
            }
        }), v10, v11, v12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w g(w wVar) {
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w h(w wVar) {
        return wVar;
    }

    public static final long i(@NotNull g<?, ?> gVar) {
        return gVar.e() / 1000000;
    }

    public static final <T, V extends w> T j(@NotNull g<T, V> gVar, long j10) {
        return (T) gVar.f().b().invoke(gVar.i(j10));
    }
}
