package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n0 extends kotlin.coroutines.a implements kotlin.coroutines.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f315180a = new a(null);

    @kotlin.s
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.e, n0> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0 d(CoroutineContext.Element element) {
            if (element instanceof n0) {
                return (n0) element;
            }
            return null;
        }

        private a() {
            super(kotlin.coroutines.e.K2, new Function1() { // from class: kotlinx.coroutines.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.a.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public n0() {
        super(kotlin.coroutines.e.K2);
    }

    public static /* synthetic */ n0 d0(n0 n0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return n0Var.Y(i10, str);
    }

    public boolean N(@NotNull CoroutineContext coroutineContext) {
        return true;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @kotlin.b1(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ n0 T(int i10) {
        return Y(i10, null);
    }

    @NotNull
    public n0 Y(int i10, @Nullable String str) {
        kotlinx.coroutines.internal.a0.a(i10);
        return new kotlinx.coroutines.internal.z(this, i10, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.b(this, bVar);
    }

    public abstract void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable);

    @k2
    public void j(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        kotlinx.coroutines.internal.n.e(this, coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public final <T> kotlin.coroutines.d<T> k0(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.m(this, dVar);
    }

    @Override // kotlin.coroutines.e
    public final void l(@NotNull kotlin.coroutines.d<?> dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((kotlinx.coroutines.internal.m) dVar).s();
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return kotlin.coroutines.e.a.c(this, bVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final n0 o0(@NotNull n0 n0Var) {
        return n0Var;
    }

    @NotNull
    public String toString() {
        return x0.a(this) + '@' + x0.b(this);
    }
}
