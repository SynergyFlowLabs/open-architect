package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c3 extends kotlin.coroutines.a implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c3 f313552a = new c3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f313553b = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private c3() {
        super(p2.M2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public static /* synthetic */ void N() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public static /* synthetic */ void T() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public static /* synthetic */ void Y() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public static /* synthetic */ void d0() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public static /* synthetic */ void h() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public static /* synthetic */ void j() {
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    @NotNull
    public o1 E(@NotNull Function1<? super Throwable, Unit> function1) {
        return d3.f313923a;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean c(Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    @Nullable
    public Object d1(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public void e(@Nullable CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public kotlinx.coroutines.selects.f f0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.p2
    @Nullable
    public p2 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.p2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.p2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    @NotNull
    public u j0(@NotNull w wVar) {
        return d3.f313923a;
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public Sequence<p2> r0() {
        return kotlin.sequences.o.g();
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    public boolean start() {
        return false;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public p2 t(@NotNull p2 p2Var) {
        return p2.a.j(this, p2Var);
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.p2
    public boolean x() {
        return false;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    @NotNull
    public o1 x0(boolean z10, boolean z11, @NotNull Function1<? super Throwable, Unit> function1) {
        return d3.f313923a;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.WARNING, message = f313553b)
    @NotNull
    public CancellationException y0() {
        throw new IllegalStateException("This job is always active");
    }
}
