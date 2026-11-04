package androidx.compose.animation.core;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"})
public final class r {
    @NotNull
    public static final q<Float, s> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new q<>(t4.P(kotlin.jvm.internal.z.f312833a), Float.valueOf(f10), x.a(f11), j10, j11, z10);
    }

    @NotNull
    public static final <T, V extends w> q<T, V> b(@NotNull z3<T, V> z3Var, T t10, T t11, long j10, long j11, boolean z10) {
        return new q<>(z3Var, t10, z3Var.a().invoke(t11), j10, j11, z10);
    }

    public static /* synthetic */ q c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j10, j11, z10);
    }

    public static /* synthetic */ q d(z3 z3Var, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return b(z3Var, obj, obj2, j10, j11, z10);
    }

    @NotNull
    public static final q<Float, s> e(@NotNull q<Float, s> qVar, float f10, float f11, long j10, long j11, boolean z10) {
        return new q<>(qVar.d(), Float.valueOf(f10), x.a(f11), j10, j11, z10);
    }

    @NotNull
    public static final <T, V extends w> q<T, V> f(@NotNull q<T, V> qVar, T t10, @Nullable V v10, long j10, long j11, boolean z10) {
        return new q<>(qVar.d(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ q g(q qVar, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) qVar.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((s) qVar.h()).f();
        }
        if ((i10 & 4) != 0) {
            j10 = qVar.b();
        }
        if ((i10 & 8) != 0) {
            j11 = qVar.a();
        }
        if ((i10 & 16) != 0) {
            z10 = qVar.p();
        }
        boolean z11 = z10;
        long j12 = j11;
        return e(qVar, f10, f11, j10, j12, z11);
    }

    public static /* synthetic */ q h(q qVar, Object obj, w wVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = qVar.getValue();
        }
        if ((i10 & 2) != 0) {
            wVar = x.e(qVar.h());
        }
        if ((i10 & 4) != 0) {
            j10 = qVar.b();
        }
        if ((i10 & 8) != 0) {
            j11 = qVar.a();
        }
        if ((i10 & 16) != 0) {
            z10 = qVar.p();
        }
        boolean z11 = z10;
        long j12 = j11;
        return f(qVar, obj, wVar, j10, j12, z11);
    }

    @NotNull
    public static final <T, V extends w> V i(@NotNull z3<T, V> z3Var, T t10) {
        V vInvoke = z3Var.a().invoke(t10);
        vInvoke.d();
        return vInvoke;
    }

    public static final boolean j(@NotNull q<?, ?> qVar) {
        return qVar.a() != Long.MIN_VALUE;
    }
}
