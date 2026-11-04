package kotlin.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f312449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Result<? extends T>, Unit> f312450b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, Function1<? super Result<? extends T>, Unit> function1) {
            this.f312449a = coroutineContext;
            this.f312450b = function1;
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            return this.f312449a;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            this.f312450b.invoke(Result.a(obj));
        }
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> d<T> a(CoroutineContext context, Function1<? super Result<? extends T>, Unit> resumeWith) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    @e1(version = "1.3")
    @NotNull
    public static final <T> d<Unit> b(@NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new j(kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.b(function1, completion)), kotlin.coroutines.intrinsics.b.l());
    }

    @e1(version = "1.3")
    @NotNull
    public static final <R, T> d<Unit> c(@NotNull Function2<? super R, ? super d<? super T>, ? extends Object> function2, R r10, @NotNull d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new j(kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.c(function2, r10, completion)), kotlin.coroutines.intrinsics.b.l());
    }

    private static final CoroutineContext d() {
        throw new l0("Implemented as intrinsic");
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    public static /* synthetic */ void e() {
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void f(d<? super T> dVar, T t10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Result.a aVar = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(t10));
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void g(d<? super T> dVar, Throwable exception) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Result.a aVar = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(exception)));
    }

    @e1(version = "1.3")
    public static final <T> void h(@NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        d dVarE = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.b(function1, completion));
        Result.a aVar = Result.Companion;
        dVarE.resumeWith(Result.m785constructorimpl(Unit.f312394a));
    }

    @e1(version = "1.3")
    public static final <R, T> void i(@NotNull Function2<? super R, ? super d<? super T>, ? extends Object> function2, R r10, @NotNull d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        d dVarE = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.c(function2, r10, completion));
        Result.a aVar = Result.Companion;
        dVarE.resumeWith(Result.m785constructorimpl(Unit.f312394a));
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object j(Function1<? super d<? super T>, Unit> function1, d<? super T> dVar) {
        h0.e(0);
        j jVar = new j(kotlin.coroutines.intrinsics.b.e(dVar));
        function1.invoke(jVar);
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        h0.e(1);
        return objA;
    }
}
