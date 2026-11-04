package androidx.compose.foundation.lazy.grid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@g1
public interface f1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16798a = new a();

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

    static /* synthetic */ void h(f1 f1Var, Object obj, Object obj2, pj.o oVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        f1Var.a(obj, obj2, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void k(f1 f1Var, Object obj, Function1 function1, Object obj2, pj.n nVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        f1Var.f(obj, function1, obj2, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(f1 f1Var, int i10, Function1 function1, Function2 function2, Function1 function3, pj.o oVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        if ((i11 & 8) != 0) {
            function3 = a.f16798a;
        }
        f1Var.C(i10, function1, function2, function3, oVar);
    }

    void C(int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @Nullable Function2<? super h0, ? super Integer, c> function2, @NotNull Function1<? super Integer, ? extends Object> function3, @NotNull pj.o<? super f0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar);

    void a(@Nullable Object obj, @Nullable Object obj2, @NotNull pj.o<? super f0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar);

    void f(@Nullable Object obj, @Nullable Function1<? super h0, c> function1, @Nullable Object obj2, @NotNull pj.n<? super f0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar);
}
