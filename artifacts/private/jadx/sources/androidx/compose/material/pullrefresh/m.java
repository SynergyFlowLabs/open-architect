package androidx.compose.material.pullrefresh;

import androidx.compose.material.u7;
import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* synthetic */ class a extends g0 implements Function1<Float, Float> {
        a(Object obj) {
            super(1, obj, q.class, "onPull", "onPull$material(F)F", 0);
        }

        public final Float X(float f10) {
            return Float.valueOf(((q) this.receiver).r(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return X(f10.floatValue());
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2<Float, kotlin.coroutines.d<? super Float>, Object>, kotlin.coroutines.jvm.internal.n {
        b(Object obj) {
            super(2, obj, q.class, "onRelease", "onRelease$material(F)F", 4);
        }

        public final Object c(float f10, kotlin.coroutines.d<? super Float> dVar) {
            return m.f((q) this.receiver, f10, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f10, kotlin.coroutines.d<? super Float> dVar) {
            return c(f10.floatValue(), dVar);
        }
    }

    @u7
    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull q qVar, boolean z10) {
        return c(a0Var, new a(qVar), new b(qVar), z10);
    }

    @u7
    @NotNull
    public static final a0 c(@NotNull a0 a0Var, @NotNull Function1<? super Float, Float> function1, @NotNull Function2<? super Float, ? super kotlin.coroutines.d<? super Float>, ? extends Object> function2, boolean z10) {
        return androidx.compose.ui.input.nestedscroll.c.b(a0Var, new n(function1, function2, z10), null, 2, null);
    }

    public static /* synthetic */ a0 d(a0 a0Var, q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return b(a0Var, qVar, z10);
    }

    public static /* synthetic */ a0 e(a0 a0Var, Function1 function1, Function2 function2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return c(a0Var, function1, function2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object f(q qVar, float f10, kotlin.coroutines.d dVar) {
        return kotlin.coroutines.jvm.internal.b.e(qVar.s(f10));
    }
}
