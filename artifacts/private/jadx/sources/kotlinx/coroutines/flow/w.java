package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<Object, Object> f314838a = new Function1() { // from class: kotlinx.coroutines.flow.u
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return w.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function2<Object, Object, Boolean> f314839b = new Function2() { // from class: kotlinx.coroutines.flow.v
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(w.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar) {
        return iVar instanceof z0 ? iVar : h(iVar, f314838a, f314839b);
    }

    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        Function1<Object, Object> function1 = f314838a;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return h(iVar, function1, (Function2) r1.q(function2, 2));
    }

    @NotNull
    public static final <T, K> i<T> g(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends K> function1) {
        return h(iVar, function1, f314839b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> i<T> h(i<? extends T> iVar, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f314223b == function1 && gVar.f314224c == function2) {
                return iVar;
            }
        }
        return new g(iVar, function1, function2);
    }
}
