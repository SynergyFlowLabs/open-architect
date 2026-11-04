package androidx.compose.runtime.livedata;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.o;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.lifecycle.compose.d0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.lifecycle.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,70:1\n75#2:71\n1282#3,6:72\n1282#3,6:78\n66#4,5:84\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n*L\n58#1:71\n59#1:72,6\n63#1:78,6\n66#1:84,5\n*E\n"})
public final class c {

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n*L\n1#1,69:1\n66#2:70\n*E\n"})
    public static final class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f36225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d1 f36226b;

        public a(w0 w0Var, d1 d1Var) {
            this.f36225a = w0Var;
            this.f36226b = d1Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f36225a.p(this.f36226b);
        }
    }

    @o
    @NotNull
    public static final <T> n7<T> c(@NotNull w0<T> w0Var, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-2027206144, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:39)");
        }
        n7<T> n7VarD = d(w0Var, w0Var.f(), c0Var, i10 & 14);
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarD;
    }

    @o
    @NotNull
    public static final <R, T extends R> n7<R> d(@NotNull final w0<T> w0Var, R r10, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(411178300, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:56)");
        }
        final o0 o0Var = (o0) c0Var.W(d0.c());
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            if (w0Var.j()) {
                r10 = w0Var.f();
            }
            objI0 = d7.g(r10, null, 2, null);
            c0Var.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        boolean zK0 = c0Var.k0(w0Var) | c0Var.k0(o0Var);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new Function1() { // from class: androidx.compose.runtime.livedata.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.e(w0Var, o0Var, n3Var, (v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        b2.c(w0Var, o0Var, (Function1) objI1, c0Var, i10 & 14);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 e(w0 w0Var, o0 o0Var, final n3 n3Var, v1 v1Var) {
        d1 d1Var = new d1() { // from class: androidx.compose.runtime.livedata.a
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                c.f(n3Var, obj);
            }
        };
        w0Var.k(o0Var, d1Var);
        return new a(w0Var, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(n3 n3Var, Object obj) {
        n3Var.setValue(obj);
    }
}
