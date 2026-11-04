package androidx.activity;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {173}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f9907c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9906b = obj;
            this.f9907c |= Integer.MIN_VALUE;
            return f0.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Unit] */
    @Nullable
    public static final Object a(@NotNull e0 e0Var, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        e0 e0Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f9907c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f9907c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f9906b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f9907c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                e0Var.c();
                if (e0Var.e()) {
                    return Unit.f312394a;
                }
                aVar.f9905a = e0Var;
                aVar.f9907c = 1;
                e0Var2 = e0Var;
                if (function1.invoke(aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0 e0Var3 = (e0) aVar.f9905a;
                ResultKt.m(obj);
                e0Var2 = e0Var3;
            }
            kotlin.jvm.internal.h0.d(1);
            e0Var2.h();
            kotlin.jvm.internal.h0.c(1);
            e0Var = Unit.f312394a;
            return e0Var;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            e0Var.h();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    private static final Object b(e0 e0Var, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
        e0Var.c();
        if (e0Var.e()) {
            return Unit.f312394a;
        }
        try {
            function1.invoke(dVar);
            return Unit.f312394a;
        } finally {
            kotlin.jvm.internal.h0.d(1);
            e0Var.h();
            kotlin.jvm.internal.h0.c(1);
        }
    }
}
