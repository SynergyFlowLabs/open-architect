package retrofit2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.b0;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@SourceDebugExtension({"SMAP\nKotlinExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinExtensions.kt\nretrofit2/KotlinExtensions\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n310#2,11:127\n310#2,11:138\n310#2,11:149\n*S KotlinDebug\n*F\n+ 1 KotlinExtensions.kt\nretrofit2/KotlinExtensions\n*L\n32#1:127,11\n66#1:138,11\n93#1:149,11\n*E\n"})
@i(name = "KotlinExtensions")
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    @f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {119}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            int i10 = 6 & 0;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    @Nullable
    public static final <T> Object await(@NotNull Call<T> call, @NotNull kotlin.coroutines.d<? super T> dVar) {
        final p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(new KotlinExtensions$await$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t10) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(t10, "t");
                n<T> nVar = pVar;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    n<T> nVar = pVar;
                    Result.a aVar = Result.Companion;
                    nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new HttpException(response))));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    n<T> nVar2 = pVar;
                    Result.a aVar2 = Result.Companion;
                    nVar2.resumeWith(Result.m785constructorimpl(tBody));
                    return;
                }
                Object objP = call2.request().p(Invocation.class);
                Intrinsics.checkNotNull(objP);
                Invocation invocation = (Invocation) objP;
                b0 b0Var = new b0("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null");
                n<T> nVar3 = pVar;
                Result.a aVar3 = Result.Companion;
                nVar3.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(b0Var)));
            }
        });
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objU;
    }

    @i(name = "awaitNullable")
    @Nullable
    public static final <T> Object awaitNullable(@NotNull Call<T> call, @NotNull kotlin.coroutines.d<? super T> dVar) {
        final p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(new KotlinExtensions$await$4$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t10) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(t10, "t");
                n<T> nVar = pVar;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    n<T> nVar = pVar;
                    Result.a aVar = Result.Companion;
                    nVar.resumeWith(Result.m785constructorimpl(response.body()));
                } else {
                    n<T> nVar2 = pVar;
                    Result.a aVar2 = Result.Companion;
                    nVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new HttpException(response))));
                }
            }
        });
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objU;
    }

    @Nullable
    public static final <T> Object awaitResponse(@NotNull Call<T> call, @NotNull kotlin.coroutines.d<? super Response<T>> dVar) {
        final p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(new KotlinExtensions$awaitResponse$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t10) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(t10, "t");
                n<Response<T>> nVar = pVar;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                n<Response<T>> nVar = pVar;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(response));
            }
        });
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objU;
    }

    @i(name = "awaitUnit")
    @Nullable
    public static final Object awaitUnit(@NotNull Call<Unit> call, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Intrinsics.checkNotNull(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return awaitNullable(call, dVar);
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "<this>");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        T t10 = (T) retrofit.create(Object.class);
        Intrinsics.checkNotNullExpressionValue(t10, "create(...)");
        return t10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object suspendAndThrow(@NotNull final Throwable th2, @NotNull kotlin.coroutines.d<?> dVar) {
        final AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            anonymousClass1.L$0 = th2;
            anonymousClass1.label = 1;
            l1.a().h(anonymousClass1.getContext(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.coroutines.d dVarE = kotlin.coroutines.intrinsics.b.e(anonymousClass1);
                    Result.a aVar = Result.Companion;
                    dVarE.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
                }
            });
            Object objL2 = kotlin.coroutines.intrinsics.b.l();
            if (objL2 == kotlin.coroutines.intrinsics.b.l()) {
                h.c(anonymousClass1);
            }
            if (objL2 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new a0();
    }
}
