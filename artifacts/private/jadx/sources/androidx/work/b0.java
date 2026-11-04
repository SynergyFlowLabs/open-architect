package androidx.work;

import com.google.common.util.concurrent.t1;
import java.util.concurrent.ExecutionException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,30:1\n40#2,8:31\n48#2:48\n60#2,7:49\n48#2:58\n60#2,7:59\n314#3,9:39\n323#3,2:56\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n*L\n29#1:31,8\n29#1:48\n29#1:49,7\n29#1:58\n29#1:59,7\n29#1:39,9\n29#1:56,2\n*E\n"})
public final class b0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.OperationKt", f = "Operation.kt", i = {0}, l = {39}, m = "await", n = {"$this$await$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt$await$1\n*L\n1#1,30:1\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f76492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f76493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f76494c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f76493b = obj;
            this.f76494c |= Integer.MIN_VALUE;
            return b0.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object a(@NotNull a0 a0Var, @NotNull kotlin.coroutines.d<? super a0.b.c> dVar) throws Throwable {
        a aVar;
        Object obj;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f76494c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f76494c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objU = aVar.f76493b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f76494c;
        if (i11 == 0) {
            ResultKt.m(objU);
            t1<a0.b.c> result = a0Var.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "result");
            if (result.isDone()) {
                try {
                    obj = result.get();
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    if (cause == null) {
                        throw e10;
                    }
                    throw cause;
                }
            } else {
                aVar.f76492a = result;
                aVar.f76494c = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
                pVar.p0();
                result.m0(new t.a(pVar, result), k.INSTANCE);
                pVar.e0(new t.b(result));
                objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                if (objU == objL) {
                    return objL;
                }
            }
            Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
            return obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objU);
        obj = objU;
        Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
        return obj;
    }

    private static final Object b(a0 a0Var, kotlin.coroutines.d<? super a0.b.c> dVar) throws Throwable {
        Object objU;
        t1<a0.b.c> result = a0Var.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        if (result.isDone()) {
            try {
                objU = result.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e10;
            }
        } else {
            kotlin.jvm.internal.h0.e(0);
            int i10 = 0 << 1;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            result.m0(new t.a(pVar, result), k.INSTANCE);
            pVar.e0(new t.b(result));
            Unit unit = Unit.f312394a;
            objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            kotlin.jvm.internal.h0.e(1);
        }
        Intrinsics.checkNotNullExpressionValue(objU, "result.await()");
        return objU;
    }
}
