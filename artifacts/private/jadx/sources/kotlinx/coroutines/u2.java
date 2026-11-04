package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,692:1\n1317#2,2:693\n1317#2,2:695\n1317#2,2:697\n1317#2,2:699\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n520#1:693,2\n534#1:695,2\n628#1:697,2\n652#1:699,2\n*E\n"})
public final /* synthetic */ class u2 {

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<Throwable, Unit> {
        a(Object obj) {
            super(1, obj, v2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void X(Throwable th2) {
            ((v2) this.receiver).E(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            X(th2);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final o1 A(@NotNull p2 p2Var, boolean z10, @NotNull v2 v2Var) {
        return p2Var instanceof w2 ? ((w2) p2Var).r1(z10, v2Var) : p2Var.x0(v2Var.D(), z10, new a(v2Var));
    }

    public static /* synthetic */ o1 B(p2 p2Var, boolean z10, v2 v2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return s2.B(p2Var, z10, v2Var);
    }

    public static final boolean C(@NotNull CoroutineContext coroutineContext) {
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var != null) {
            return p2Var.isActive();
        }
        return true;
    }

    private static final Throwable D(Throwable th2, p2 p2Var) {
        return th2 == null ? new q2("Job was cancelled", null, p2Var) : th2;
    }

    @NotNull
    public static final a0 a(@Nullable p2 p2Var) {
        return new r2(p2Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @oj.i(name = "Job")
    public static final /* synthetic */ p2 b(p2 p2Var) {
        return s2.a(p2Var);
    }

    public static /* synthetic */ a0 c(p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
        }
        return s2.a(p2Var);
    }

    public static /* synthetic */ p2 d(p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
        }
        return b(p2Var);
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var != null) {
            p2Var.e(cancellationException);
        }
    }

    public static final void g(@NotNull p2 p2Var, @NotNull String str, @Nullable Throwable th2) {
        p2Var.e(x1.a(str, th2));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        CoroutineContext.Element element = coroutineContext.get(p2.M2);
        w2 w2Var = element instanceof w2 ? (w2) element : null;
        if (w2Var == null) {
            return false;
        }
        w2Var.s0(D(th2, w2Var));
        return true;
    }

    public static /* synthetic */ void i(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        s2.f(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void j(p2 p2Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        s2.g(p2Var, str, th2);
    }

    public static /* synthetic */ boolean k(CoroutineContext coroutineContext, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return h(coroutineContext, th2);
    }

    @Nullable
    public static final Object l(@NotNull p2 p2Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        p2.a.b(p2Var, null, 1, null);
        Object objD1 = p2Var.d1(dVar);
        return objD1 == kotlin.coroutines.intrinsics.b.l() ? objD1 : Unit.f312394a;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var == null) {
            return;
        }
        for (p2 p2Var2 : p2Var.r0()) {
            w2 w2Var = p2Var2 instanceof w2 ? (w2) p2Var2 : null;
            if (w2Var != null) {
                w2Var.s0(D(th2, p2Var));
            }
        }
    }

    public static final void o(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        Sequence<p2> sequenceR0;
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var == null || (sequenceR0 = p2Var.r0()) == null) {
            return;
        }
        Iterator<p2> it = sequenceR0.iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(p2 p2Var, Throwable th2) throws Throwable {
        for (p2 p2Var2 : p2Var.r0()) {
            w2 w2Var = p2Var2 instanceof w2 ? (w2) p2Var2 : null;
            if (w2Var != null) {
                w2Var.s0(D(th2, p2Var));
            }
        }
    }

    public static final void r(@NotNull p2 p2Var, @Nullable CancellationException cancellationException) {
        Iterator<p2> it = p2Var.r0().iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    public static /* synthetic */ void s(CoroutineContext coroutineContext, Throwable th2, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        n(coroutineContext, th2);
    }

    public static /* synthetic */ void t(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        s2.o(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void u(p2 p2Var, Throwable th2, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        q(p2Var, th2);
    }

    public static /* synthetic */ void v(p2 p2Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        s2.r(p2Var, cancellationException);
    }

    @NotNull
    public static final o1 w(@NotNull p2 p2Var, @NotNull o1 o1Var) {
        return B(p2Var, false, new q1(o1Var), 1, null);
    }

    public static final void x(@NotNull CoroutineContext coroutineContext) {
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var != null) {
            s2.z(p2Var);
        }
    }

    public static final void y(@NotNull p2 p2Var) {
        if (!p2Var.isActive()) {
            throw p2Var.y0();
        }
    }

    @NotNull
    public static final p2 z(@NotNull CoroutineContext coroutineContext) {
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var != null) {
            return p2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}
