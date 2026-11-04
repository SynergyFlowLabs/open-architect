package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.i1(markerClass = {l2.class})
public interface p2 extends CoroutineContext.Element {

    @NotNull
    public static final b M2 = b.f315194a;

    public static final class a {
        public static /* synthetic */ void b(p2 p2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            p2Var.e(cancellationException);
        }

        public static /* synthetic */ boolean c(p2 p2Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return p2Var.c(th2);
        }

        public static <R> R d(@NotNull p2 p2Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(p2Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E e(@NotNull p2 p2Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(p2Var, bVar);
        }

        @c2
        public static /* synthetic */ void f() {
        }

        public static /* synthetic */ o1 g(p2 p2Var, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return p2Var.x0(z10, z11, function1);
        }

        @NotNull
        public static CoroutineContext h(@NotNull p2 p2Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(p2Var, bVar);
        }

        @NotNull
        public static CoroutineContext i(@NotNull p2 p2Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(p2Var, coroutineContext);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static p2 j(@NotNull p2 p2Var, @NotNull p2 p2Var2) {
            return p2Var2;
        }
    }

    public static final class b implements CoroutineContext.b<p2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f315194a = new b();

        private b() {
        }
    }

    @NotNull
    o1 E(@NotNull Function1<? super Throwable, Unit> function1);

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean c(Throwable th2);

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @Nullable
    Object d1(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    void e(@Nullable CancellationException cancellationException);

    @NotNull
    kotlinx.coroutines.selects.f f0();

    @Nullable
    p2 getParent();

    boolean isActive();

    boolean isCancelled();

    @k2
    @NotNull
    u j0(@NotNull w wVar);

    @NotNull
    Sequence<p2> r0();

    boolean start();

    @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    p2 t(@NotNull p2 p2Var);

    boolean x();

    @k2
    @NotNull
    o1 x0(boolean z10, boolean z11, @NotNull Function1<? super Throwable, Unit> function1);

    @k2
    @NotNull
    CancellationException y0();
}
