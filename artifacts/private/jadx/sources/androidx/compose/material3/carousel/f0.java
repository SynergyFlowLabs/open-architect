package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.i1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class f0 extends i1 {
    public static final int O = 0;

    @NotNull
    private n3<Function0<Integer>> M;

    @NotNull
    public static final a N = new a(null);

    @NotNull
    private static final androidx.compose.runtime.saveable.c0<f0, ?> P = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.carousel.d0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return f0.U0((androidx.compose.runtime.saveable.g0) obj, (f0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.material3.carousel.e0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return f0.V0((List) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<f0, ?> a() {
            return f0.P;
        }

        private a() {
        }
    }

    public f0(int i10, float f10, @NotNull Function0<Integer> function0) {
        super(i10, f10);
        this.M = d7.g(function0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U0(androidx.compose.runtime.saveable.g0 g0Var, f0 f0Var) {
        return CollectionsKt.listOf(Integer.valueOf(f0Var.E()), Float.valueOf(kotlin.ranges.r.H(f0Var.F(), -0.5f, 0.5f)), f0Var.M.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 V0(final List list) {
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new f0(iIntValue, ((Float) obj2).floatValue(), new Function0() { // from class: androidx.compose.material3.carousel.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(f0.W0(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W0(List list) {
        Object obj = list.get(2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    @Override // androidx.compose.foundation.pager.i1
    public int V() {
        return this.M.getValue().invoke().intValue();
    }

    @NotNull
    public final n3<Function0<Integer>> Y0() {
        return this.M;
    }

    public final void Z0(@NotNull n3<Function0<Integer>> n3Var) {
        this.M = n3Var;
    }
}
