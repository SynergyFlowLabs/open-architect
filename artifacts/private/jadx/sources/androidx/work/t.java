package androidx.work;

import androidx.annotation.b1;
import com.google.common.util.concurrent.t1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n314#2,11:92\n*S KotlinDebug\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n*L\n47#1:92,11\n*E\n"})
public final class t {

    @SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt$await$2$1\n*L\n1#1,91:1\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<R> f77438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1<R> f77439b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.n<? super R> nVar, t1<R> t1Var) {
            this.f77438a = nVar;
            this.f77439b = t1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                kotlin.coroutines.d dVar = this.f77438a;
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(this.f77439b.get()));
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    cause = th2;
                }
                if (th2 instanceof CancellationException) {
                    this.f77438a.c(cause);
                    return;
                }
                kotlin.coroutines.d dVar2 = this.f77438a;
                Result.a aVar2 = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(cause)));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt$await$2$2\n*L\n1#1,91:1\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1<R> f77440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t1<R> t1Var) {
            super(1);
            this.f77440a = t1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            this.f77440a.cancel(false);
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public static final <R> Object a(@NotNull t1<R> t1Var, @NotNull kotlin.coroutines.d<? super R> dVar) throws Throwable {
        if (t1Var.isDone()) {
            try {
                return t1Var.get();
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        t1Var.m0(new a(pVar, t1Var), k.INSTANCE);
        pVar.e0(new b(t1Var));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @b1({b1.a.LIBRARY_GROUP})
    private static final <R> Object b(t1<R> t1Var, kotlin.coroutines.d<? super R> dVar) throws Throwable {
        if (t1Var.isDone()) {
            try {
                return t1Var.get();
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        }
        kotlin.jvm.internal.h0.e(0);
        int i10 = 5 & 1;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        t1Var.m0(new a(pVar, t1Var), k.INSTANCE);
        pVar.e0(new b(t1Var));
        Unit unit = Unit.f312394a;
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.h0.e(1);
        return objU;
    }
}
