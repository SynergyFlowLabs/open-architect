package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.NoNullnessRewrite;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.g;
import com.google.android.play.core.review.ReviewInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nReviewManagerKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewManagerKtx.kt\ncom/google/android/play/core/ktx/ReviewManagerKtxKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,63:1\n351#2,11:64\n*S KotlinDebug\n*F\n+ 1 ReviewManagerKtx.kt\ncom/google/android/play/core/ktx/ReviewManagerKtxKt\n*L\n43#1:64,11\n*E\n"})
public final class d {

    @kotlin.coroutines.jvm.internal.f(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", i = {}, l = {23}, m = "requestReview", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f114930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f114931b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f114930a = obj;
            this.f114931b |= Integer.MIN_VALUE;
            return d.b(null, this);
        }
    }

    static final class b extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f114932a = new b();

        b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    static final class c extends l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f114933a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
            super(1);
            this.f114933a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            this.f114933a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.android.play.core.ktx.d$d, reason: collision with other inner class name */
    static final class C1004d<T> extends l0 implements Function1<T, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f114934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1004d(n<? super T> nVar) {
            super(1);
            this.f114934a = nVar;
        }

        public final void c(T t10) {
            this.f114934a.resumeWith(Result.m785constructorimpl(t10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c(obj);
            return Unit.f312394a;
        }
    }

    static final class e implements com.google.android.gms.tasks.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f114935a;

        /* JADX WARN: Multi-variable type inference failed */
        e(n<? super T> nVar) {
            this.f114935a = nVar;
        }

        @Override // com.google.android.gms.tasks.f
        public final void d(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f114935a.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f114936a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f114936a = function;
        }

        @Override // com.google.android.gms.tasks.g
        public final /* synthetic */ void b(@NoNullnessRewrite(reason = "Can be null for Task<Void> but this is uncommon.") Object obj) {
            this.f114936a.invoke(obj);
        }
    }

    @Nullable
    public static final Object a(@NotNull com.google.android.play.core.review.b bVar, @NotNull Activity activity, @NotNull ReviewInfo reviewInfo, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Task<Void> taskB = bVar.b(activity, reviewInfo);
        Intrinsics.checkNotNullExpressionValue(taskB, "launchReviewFlow(...)");
        Object objD = d(taskB, null, dVar, 2, null);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object b(@NotNull com.google.android.play.core.review.b bVar, @NotNull kotlin.coroutines.d<? super ReviewInfo> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f114931b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f114931b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f114930a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f114931b;
        if (i11 == 0) {
            ResultKt.m(objD);
            Task<ReviewInfo> taskA = bVar.a();
            Intrinsics.checkNotNullExpressionValue(taskA, "requestReviewFlow(...)");
            aVar.f114931b = 1;
            objD = d(taskA, null, aVar, 2, null);
            if (objD == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objD);
        }
        Intrinsics.checkNotNull(objD);
        return objD;
    }

    @Nullable
    public static final <T> Object c(@NotNull Task<T> task, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(new c(function0));
        if (!task.t()) {
            task.j(new f(new C1004d(pVar)));
            task.g(new e(pVar));
        } else if (task.u()) {
            pVar.resumeWith(Result.m785constructorimpl(task.q()));
        } else {
            Exception excP = task.p();
            Intrinsics.checkNotNull(excP);
            pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(excP)));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objU;
    }

    public static /* synthetic */ Object d(Task task, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = b.f114932a;
        }
        return c(task, function0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean e(@NotNull o0<? super E> o0Var, @NonNull E e10) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        return t.m(o0Var.p(e10));
    }
}
