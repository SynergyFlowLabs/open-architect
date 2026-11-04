package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f315167a = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    private static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zH = h(coroutineContext);
        boolean zH2 = h(coroutineContext2);
        if (!zH && !zH2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        hVar.f312751a = coroutineContext2;
        kotlin.coroutines.h hVar2 = kotlin.coroutines.h.f312451a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(hVar2, new Function2() { // from class: kotlinx.coroutines.j0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0.e(hVar, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zH2) {
            hVar.f312751a = ((CoroutineContext) hVar.f312751a).fold(hVar2, new Function2() { // from class: kotlinx.coroutines.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l0.f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) hVar.f312751a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext e(kotlin.jvm.internal.i1.h hVar, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof g0)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) hVar.f312751a).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z10 ? ((g0) element).H() : (g0) element);
        }
        hVar.f312751a = ((CoroutineContext) hVar.f312751a).minusKey(element.getKey());
        return coroutineContext.plus(((g0) element).o(element2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof g0 ? coroutineContext.plus(((g0) element).H()) : coroutineContext.plus(element);
    }

    @Nullable
    public static final String g(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: kotlinx.coroutines.i0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(l0.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10 || (element instanceof g0);
    }

    @k2
    @NotNull
    public static final CoroutineContext j(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    @c2
    @NotNull
    public static final CoroutineContext k(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextD = d(s0Var.getCoroutineContext(), coroutineContext, true);
        if (coroutineContextD != l1.a() && coroutineContextD.get(kotlin.coroutines.e.K2) == null) {
            coroutineContextD = coroutineContextD.plus(l1.a());
        }
        return coroutineContextD;
    }

    @Nullable
    public static final d4<?> l(@NotNull kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof h1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof d4) {
                return (d4) eVar;
            }
        }
        return null;
    }

    @Nullable
    public static final d4<?> m(@NotNull kotlin.coroutines.d<?> dVar, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || coroutineContext.get(e4.f314014a) == null) {
            return null;
        }
        d4<?> d4VarL = l((kotlin.coroutines.jvm.internal.e) dVar);
        if (d4VarL != null) {
            d4VarL.l2(coroutineContext, obj);
        }
        return d4VarL;
    }

    public static final <T> T n(@NotNull kotlin.coroutines.d<?> dVar, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
        CoroutineContext context = dVar.getContext();
        Object objI = kotlinx.coroutines.internal.i1.i(context, obj);
        d4<?> d4VarM = objI != kotlinx.coroutines.internal.i1.f315077a ? m(dVar, context, objI) : null;
        try {
            T tInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            if (d4VarM == null || d4VarM.j2()) {
                kotlinx.coroutines.internal.i1.f(context, objI);
            }
            return tInvoke;
        } finally {
            kotlin.jvm.internal.h0.d(1);
            if (d4VarM == null || d4VarM.j2()) {
                kotlinx.coroutines.internal.i1.f(context, objI);
            }
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final <T> T o(@NotNull CoroutineContext coroutineContext, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
        Object objI = kotlinx.coroutines.internal.i1.i(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.h0.d(1);
            kotlinx.coroutines.internal.i1.f(coroutineContext, objI);
            kotlin.jvm.internal.h0.c(1);
        }
    }
}
