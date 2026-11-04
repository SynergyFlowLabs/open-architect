package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n103#2,13:320\n1#3:333\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:320,13\n*E\n"})
public final class d4<T> extends kotlinx.coroutines.internal.v0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<Pair<CoroutineContext, Object>> f313924e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public d4(@NotNull CoroutineContext coroutineContext, @NotNull kotlin.coroutines.d<? super T> dVar) {
        e4 e4Var = e4.f314014a;
        super(coroutineContext.get(e4Var) == null ? coroutineContext.plus(e4Var) : coroutineContext, dVar);
        this.f313924e = new ThreadLocal<>();
        if (!(dVar.getContext().get(kotlin.coroutines.e.K2) instanceof n0)) {
            Object objI = kotlinx.coroutines.internal.i1.i(coroutineContext, null);
            kotlinx.coroutines.internal.i1.f(coroutineContext, objI);
            l2(coroutineContext, objI);
        }
    }

    private final void k2() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.f313924e.get();
            if (pair != null) {
                kotlinx.coroutines.internal.i1.f(pair.component1(), pair.component2());
            }
            this.f313924e.remove();
        }
    }

    @Override // kotlinx.coroutines.internal.v0, kotlinx.coroutines.a
    protected void d2(@Nullable Object obj) {
        k2();
        Object objA = f0.a(obj, this.f315130d);
        kotlin.coroutines.d<T> dVar = this.f315130d;
        CoroutineContext context = dVar.getContext();
        Object objI = kotlinx.coroutines.internal.i1.i(context, null);
        d4<?> d4VarM = objI != kotlinx.coroutines.internal.i1.f315077a ? l0.m(dVar, context, objI) : null;
        try {
            this.f315130d.resumeWith(objA);
            Unit unit = Unit.f312394a;
            if (d4VarM == null || d4VarM.j2()) {
                kotlinx.coroutines.internal.i1.f(context, objI);
            }
        } catch (Throwable th2) {
            if (d4VarM == null || d4VarM.j2()) {
                kotlinx.coroutines.internal.i1.f(context, objI);
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.internal.v0
    public void i2() {
        k2();
    }

    public final boolean j2() {
        boolean z10 = this.threadLocalIsSet && this.f313924e.get() == null;
        this.f313924e.remove();
        return !z10;
    }

    public final void l2(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        this.threadLocalIsSet = true;
        this.f313924e.set(TuplesKt.to(coroutineContext, obj));
    }
}
