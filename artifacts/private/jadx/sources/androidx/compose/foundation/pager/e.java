package androidx.compose.foundation.pager;

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
final class e extends i1 {

    @NotNull
    public static final a N = new a(null);

    @NotNull
    private static final androidx.compose.runtime.saveable.c0<e, ?> O = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.pager.c
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return e.U0((androidx.compose.runtime.saveable.g0) obj, (e) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.pager.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return e.V0((List) obj);
        }
    });

    @NotNull
    private n3<Function0<Integer>> M;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<e, ?> a() {
            return e.O;
        }

        private a() {
        }
    }

    public e(int i10, float f10, @NotNull Function0<Integer> function0) {
        super(i10, f10);
        this.M = d7.g(function0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U0(androidx.compose.runtime.saveable.g0 g0Var, e eVar) {
        return CollectionsKt.listOf(Integer.valueOf(eVar.E()), Float.valueOf(kotlin.ranges.r.H(eVar.F(), -0.5f, 0.5f)), Integer.valueOf(eVar.V()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e V0(final List list) {
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new e(iIntValue, ((Float) obj2).floatValue(), new Function0() { // from class: androidx.compose.foundation.pager.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(e.W0(list));
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
