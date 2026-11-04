package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n1#2:221\n103#3,10:222\n114#3,2:236\n204#4:232\n205#4:235\n57#5,2:233\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n82#1:222,10\n82#1:236,2\n95#1:232\n95#1:235\n95#1:233,2\n*E\n"})
public abstract class i1<T> extends kotlinx.coroutines.scheduling.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f315036c;

    public i1(int i10) {
        this.f315036c = i10;
    }

    public void a(@Nullable Object obj, @NotNull Throwable th2) {
    }

    @NotNull
    public abstract kotlin.coroutines.d<T> d();

    @Nullable
    public Throwable e(@Nullable Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f313551a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(@Nullable Object obj) {
        return obj;
    }

    public final void g(@NotNull Throwable th2) {
        p0.b(d().getContext(), new v0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    @Nullable
    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            kotlin.coroutines.d<T> dVarD = d();
            Intrinsics.checkNotNull(dVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) dVarD;
            kotlin.coroutines.d<T> dVar = mVar.f315093e;
            Object obj = mVar.f315095g;
            CoroutineContext context = dVar.getContext();
            Object objI = kotlinx.coroutines.internal.i1.i(context, obj);
            p2 p2Var = null;
            d4<?> d4VarM = objI != kotlinx.coroutines.internal.i1.f315077a ? l0.m(dVar, context, objI) : null;
            try {
                CoroutineContext context2 = dVar.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null && j1.c(this.f315036c)) {
                    p2Var = (p2) context2.get(p2.M2);
                }
                if (p2Var != null && !p2Var.isActive()) {
                    CancellationException cancellationExceptionY0 = p2Var.y0();
                    a(objH, cancellationExceptionY0);
                    Result.a aVar = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(cancellationExceptionY0)));
                } else if (thE != null) {
                    Result.a aVar2 = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thE)));
                } else {
                    Result.a aVar3 = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(f(objH)));
                }
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
        } catch (g1 e10) {
            p0.b(d().getContext(), e10.getCause());
        } catch (Throwable th3) {
            g(th3);
        }
    }
}
