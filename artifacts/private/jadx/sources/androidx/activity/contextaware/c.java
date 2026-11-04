package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,88:1\n314#2,11:89\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n76#1:89,11\n*E\n"})
public final class c {

    static final class a extends l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.activity.contextaware.a f9884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f9885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.activity.contextaware.a aVar, b bVar) {
            super(1);
            this.f9884a = aVar;
            this.f9885b = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            this.f9884a.removeOnContextAvailableListener(this.f9885b);
        }
    }

    @SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<R> f9886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Context, R> f9887b;

        public b(n<R> nVar, Function1<Context, R> function1) {
            this.f9886a = nVar;
            this.f9887b = function1;
        }

        @Override // androidx.activity.contextaware.d
        public void a(Context context) {
            Object objM785constructorimpl;
            Intrinsics.checkNotNullParameter(context, "context");
            kotlin.coroutines.d dVar = this.f9886a;
            Function1<Context, R> function1 = this.f9887b;
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(function1.invoke(context));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            dVar.resumeWith(objM785constructorimpl);
        }
    }

    @Nullable
    public static final <R> Object a(@NotNull androidx.activity.contextaware.a aVar, @NotNull Function1<Context, R> function1, @NotNull kotlin.coroutines.d<R> dVar) {
        Context contextPeekAvailableContext = aVar.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        b bVar = new b(pVar, function1);
        aVar.addOnContextAvailableListener(bVar);
        pVar.e0(new a(aVar, bVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objU;
    }

    private static final <R> Object b(androidx.activity.contextaware.a aVar, Function1<Context, R> function1, kotlin.coroutines.d<R> dVar) {
        Context contextPeekAvailableContext = aVar.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        h0.e(0);
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        b bVar = new b(pVar, function1);
        aVar.addOnContextAvailableListener(bVar);
        pVar.e0(new a(aVar, bVar));
        Unit unit = Unit.f312394a;
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        h0.e(1);
        return objU;
    }
}
