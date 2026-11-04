package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@p0
public interface o0 {

    static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17984a = new a();

        a() {
        }

        public final Void c(int i10) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void i(o0 o0Var, Object obj, Object obj2, f1 f1Var, pj.n nVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        if ((i10 & 4) != 0) {
            f1Var = null;
        }
        o0Var.n(obj, obj2, f1Var, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void w(o0 o0Var, int i10, Function1 function1, Function1 function2, Function1 function3, pj.o oVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = a.f17984a;
        }
        if ((i11 & 8) != 0) {
            function3 = null;
        }
        o0Var.u(i10, function1, function2, function3, oVar);
    }

    void n(@Nullable Object obj, @Nullable Object obj2, @Nullable f1 f1Var, @NotNull pj.n<? super x, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar);

    void u(int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @Nullable Function1<? super Integer, f1> function3, @NotNull pj.o<? super x, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar);
}
