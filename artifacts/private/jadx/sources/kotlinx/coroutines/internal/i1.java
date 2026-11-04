package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.r3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final z0 f315077a = new z0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function2<Object, CoroutineContext.Element, Object> f315078b = new Function2() { // from class: kotlinx.coroutines.internal.f1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return i1.d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function2<r3<?>, CoroutineContext.Element, r3<?>> f315079c = new Function2() { // from class: kotlinx.coroutines.internal.g1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return i1.e((r3) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Function2<o1, CoroutineContext.Element, o1> f315080d = new Function2() { // from class: kotlinx.coroutines.internal.h1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return i1.h((o1) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof r3)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r3<?> e(r3<?> r3Var, CoroutineContext.Element element) {
        if (r3Var != null) {
            return r3Var;
        }
        if (element instanceof r3) {
            return (r3) element;
        }
        return null;
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f315077a) {
            return;
        }
        if (obj instanceof o1) {
            ((o1) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f315079c);
        Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((r3) objFold).I(coroutineContext, obj);
    }

    @NotNull
    public static final Object g(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f315078b);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o1 h(o1 o1Var, CoroutineContext.Element element) {
        if (element instanceof r3) {
            r3<?> r3Var = (r3) element;
            o1Var.a(r3Var, r3Var.l1(o1Var.f315107a));
        }
        return o1Var;
    }

    @Nullable
    public static final Object i(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f315077a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new o1(coroutineContext, ((Number) obj).intValue()), f315080d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((r3) obj).l1(coroutineContext);
    }
}
