package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.i1(markerClass = {l2.class})
public interface n<T> extends kotlin.coroutines.d<T> {

    public static final class a {
        public static /* synthetic */ boolean a(n nVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return nVar.c(th2);
        }

        public static /* synthetic */ Object b(n nVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            return nVar.c0(obj, obj2);
        }
    }

    <R extends T> void J(R r10, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar);

    @c2
    void K(@NotNull n0 n0Var, @NotNull Throwable th2);

    @kotlin.l(level = kotlin.n.WARNING, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @kotlin.b1(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    void M(T t10, @Nullable Function1<? super Throwable, Unit> function1);

    @k2
    @Nullable
    <R extends T> Object P(R r10, @Nullable Object obj, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar);

    @k2
    void b0(@NotNull Object obj);

    boolean c(@Nullable Throwable th2);

    @k2
    @Nullable
    Object c0(T t10, @Nullable Object obj);

    void e0(@NotNull Function1<? super Throwable, Unit> function1);

    boolean isActive();

    boolean isCancelled();

    @k2
    @Nullable
    Object l0(@NotNull Throwable th2);

    @c2
    void n0(@NotNull n0 n0Var, T t10);

    @k2
    void p0();

    boolean x();
}
