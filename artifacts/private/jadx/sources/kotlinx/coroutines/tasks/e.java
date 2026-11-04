package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.j;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.n;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.selects.h;
import kotlinx.coroutines.u;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,164:1\n426#2,11:165\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n136#1:165,11\n*E\n"})
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements a1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ x<T> f315651a;

        a(x<T> xVar) {
            this.f315651a = xVar;
        }

        @Override // kotlinx.coroutines.p2
        public o1 E(Function1<? super Throwable, Unit> function1) {
            return this.f315651a.E(function1);
        }

        @Override // kotlinx.coroutines.a1
        public h<T> b1() {
            return this.f315651a.b1();
        }

        @Override // kotlinx.coroutines.p2
        @l(level = n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean c(Throwable th2) {
            return this.f315651a.c(th2);
        }

        @Override // kotlinx.coroutines.p2
        @l(level = n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.f315651a.cancel();
        }

        @Override // kotlinx.coroutines.p2
        public Object d1(kotlin.coroutines.d<? super Unit> dVar) {
            return this.f315651a.d1(dVar);
        }

        @Override // kotlinx.coroutines.p2
        public void e(CancellationException cancellationException) {
            this.f315651a.e(cancellationException);
        }

        @Override // kotlinx.coroutines.p2
        public f f0() {
            return this.f315651a.f0();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) this.f315651a.fold(r10, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
            return (E) this.f315651a.get(bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public CoroutineContext.b<?> getKey() {
            return this.f315651a.getKey();
        }

        @Override // kotlinx.coroutines.p2
        public p2 getParent() {
            return this.f315651a.getParent();
        }

        @Override // kotlinx.coroutines.p2
        public boolean isActive() {
            return this.f315651a.isActive();
        }

        @Override // kotlinx.coroutines.p2
        public boolean isCancelled() {
            return this.f315651a.isCancelled();
        }

        @Override // kotlinx.coroutines.p2
        @k2
        public u j0(w wVar) {
            return this.f315651a.j0(wVar);
        }

        @Override // kotlinx.coroutines.a1
        @c2
        public T m() {
            return this.f315651a.m();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
            return this.f315651a.minusKey(bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return this.f315651a.plus(coroutineContext);
        }

        @Override // kotlinx.coroutines.a1
        public Object q(kotlin.coroutines.d<? super T> dVar) {
            return this.f315651a.q(dVar);
        }

        @Override // kotlinx.coroutines.p2
        public Sequence<p2> r0() {
            return this.f315651a.r0();
        }

        @Override // kotlinx.coroutines.p2
        public boolean start() {
            return this.f315651a.start();
        }

        @Override // kotlinx.coroutines.p2
        @l(level = n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public p2 t(p2 p2Var) {
            return this.f315651a.t(p2Var);
        }

        @Override // kotlinx.coroutines.a1
        @c2
        public Throwable w0() {
            return this.f315651a.w0();
        }

        @Override // kotlinx.coroutines.p2
        public boolean x() {
            return this.f315651a.x();
        }

        @Override // kotlinx.coroutines.p2
        @k2
        public o1 x0(boolean z10, boolean z11, Function1<? super Throwable, Unit> function1) {
            return this.f315651a.x0(z10, z11, function1);
        }

        @Override // kotlinx.coroutines.p2
        @k2
        public CancellationException y0() {
            return this.f315651a.y0();
        }
    }

    static final class b<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f315652a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super T> nVar) {
            this.f315652a = nVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception excP = task.p();
            if (excP != null) {
                kotlin.coroutines.d dVar = this.f315652a;
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(excP)));
                return;
            }
            boolean zS = task.s();
            kotlinx.coroutines.n<T> nVar = this.f315652a;
            if (zS) {
                kotlinx.coroutines.n.a.a(nVar, null, 1, null);
            } else {
                Result.a aVar2 = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(task.q()));
            }
        }
    }

    static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.gms.tasks.b f315653a;

        c(com.google.android.gms.tasks.b bVar) {
            this.f315653a = bVar;
        }

        public final void c(Throwable th2) {
            this.f315653a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final <T> a1<T> e(@NotNull Task<T> task) {
        return g(task, null);
    }

    @c2
    @NotNull
    public static final <T> a1<T> f(@NotNull Task<T> task, @NotNull com.google.android.gms.tasks.b bVar) {
        return g(task, bVar);
    }

    private static final <T> a1<T> g(Task<T> task, final com.google.android.gms.tasks.b bVar) {
        final x xVarC = z.c(null, 1, null);
        if (task.t()) {
            Exception excP = task.p();
            if (excP != null) {
                xVarC.f(excP);
            } else if (task.s()) {
                p2.a.b(xVarC, null, 1, null);
            } else {
                xVarC.R(task.q());
            }
        } else {
            task.e(kotlinx.coroutines.tasks.a.f315645a, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    e.h(xVarC, task2);
                }
            });
        }
        if (bVar != null) {
            xVarC.E(new Function1() { // from class: kotlinx.coroutines.tasks.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.i(bVar, (Throwable) obj);
                }
            });
        }
        return new a(xVarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(x xVar, Task task) {
        Exception excP = task.p();
        if (excP != null) {
            xVar.f(excP);
        } else if (task.s()) {
            p2.a.b(xVar, null, 1, null);
        } else {
            xVar.R(task.q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(com.google.android.gms.tasks.b bVar, Throwable th2) {
        bVar.a();
        return Unit.f312394a;
    }

    @NotNull
    public static final <T> Task<T> j(@NotNull final a1<? extends T> a1Var) {
        final com.google.android.gms.tasks.b bVar = new com.google.android.gms.tasks.b();
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l(bVar.b());
        a1Var.E(new Function1() { // from class: kotlinx.coroutines.tasks.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.k(bVar, a1Var, lVar, (Throwable) obj);
            }
        });
        return lVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(com.google.android.gms.tasks.b bVar, a1 a1Var, com.google.android.gms.tasks.l lVar, Throwable th2) {
        if (th2 instanceof CancellationException) {
            bVar.a();
            return Unit.f312394a;
        }
        Throwable thW0 = a1Var.w0();
        if (thW0 == null) {
            lVar.c(a1Var.m());
        } else {
            Exception jVar = thW0 instanceof Exception ? (Exception) thW0 : null;
            if (jVar == null) {
                jVar = new j(thW0);
            }
            lVar.b(jVar);
        }
        return Unit.f312394a;
    }

    @c2
    @Nullable
    public static final <T> Object l(@NotNull Task<T> task, @NotNull com.google.android.gms.tasks.b bVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return n(task, bVar, dVar);
    }

    @Nullable
    public static final <T> Object m(@NotNull Task<T> task, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return n(task, null, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object n(Task<T> task, com.google.android.gms.tasks.b bVar, kotlin.coroutines.d<? super T> dVar) throws Exception {
        if (!task.t()) {
            p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            task.e(kotlinx.coroutines.tasks.a.f315645a, new b(pVar));
            if (bVar != null) {
                pVar.e0(new c(bVar));
            }
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU;
        }
        Exception excP = task.p();
        if (excP != null) {
            throw excP;
        }
        if (!task.s()) {
            return task.q();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
