package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface n0<E> {

    public static final class a {

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.n0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {770}, m = "receiveOrNull", n = {}, s = {})
        static final class C2270a<E> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f313832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f313833b;

            C2270a(kotlin.coroutines.d<? super C2270a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f313832a = obj;
                this.f313833b |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(n0 n0Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            n0Var.e(cancellationException);
        }

        public static /* synthetic */ boolean c(n0 n0Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return n0Var.c(th2);
        }

        @NotNull
        public static <E> kotlinx.coroutines.selects.h<E> d(@NotNull n0<? extends E> n0Var) {
            Intrinsics.checkNotNull(n0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((n) n0Var).v();
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @b1(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @f1
        public static /* synthetic */ void f() {
        }

        @c2
        public static /* synthetic */ void g() {
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E h(@NotNull n0<? extends E> n0Var) throws Throwable {
            Object objW = n0Var.w();
            if (t.m(objW)) {
                return (E) t.i(objW);
            }
            Throwable thF = t.f(objW);
            if (thF == null) {
                return null;
            }
            throw y0.m(thF);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @kotlin.internal.h
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object i(@NotNull n0<? extends E> n0Var, @NotNull kotlin.coroutines.d<? super E> dVar) {
            C2270a c2270a;
            Object objA;
            if (dVar instanceof C2270a) {
                c2270a = (C2270a) dVar;
                int i10 = c2270a.f313833b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2270a.f313833b = i10 - Integer.MIN_VALUE;
                } else {
                    c2270a = new C2270a(dVar);
                }
            } else {
                c2270a = new C2270a(dVar);
            }
            Object obj = c2270a.f313832a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2270a.f313833b;
            if (i11 == 0) {
                ResultKt.m(obj);
                c2270a.f313833b = 1;
                objA = n0Var.A(c2270a);
                if (objA == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objA = ((t) obj).o();
            }
            return t.h(objA);
        }
    }

    @Nullable
    Object A(@NotNull kotlin.coroutines.d<? super t<? extends E>> dVar);

    boolean C();

    @NotNull
    kotlinx.coroutines.selects.h<E> D();

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean c(Throwable th2);

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void e(@Nullable CancellationException cancellationException);

    boolean isEmpty();

    @NotNull
    r<E> iterator();

    @Nullable
    Object j(@NotNull kotlin.coroutines.d<? super E> dVar);

    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E poll();

    @NotNull
    kotlinx.coroutines.selects.h<t<E>> u();

    @NotNull
    kotlinx.coroutines.selects.h<E> v();

    @NotNull
    Object w();

    @kotlin.internal.h
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    Object z(@NotNull kotlin.coroutines.d<? super E> dVar);
}
