package com.planner5d.library.model.manager.performancetracing.sentry;

import com.planner5d.library.model.manager.performancetracing.g;
import io.sentry.ia;
import io.sentry.p1;
import io.sentry.r1;
import io.sentry.t5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nSentryPerformanceTracer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryPerformanceTracer.kt\ncom/planner5d/library/model/manager/performancetracing/sentry/SentryPerformanceTracer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1#2:58\n808#3,11:59\n*S KotlinDebug\n*F\n+ 1 SentryPerformanceTracer.kt\ncom/planner5d/library/model/manager/performancetracing/sentry/SentryPerformanceTracer\n*L\n52#1:59,11\n*E\n"})
public final class c implements com.planner5d.library.model.manager.performancetracing.d {

    @f(c = "com.planner5d.library.model.manager.performancetracing.sentry.SentryPerformanceTracer", f = "SentryPerformanceTracer.kt", i = {0}, l = {34}, m = "withTransaction", n = {"span"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f193117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f193118b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f193120d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f193118b = obj;
            this.f193120d |= Integer.MIN_VALUE;
            boolean z10 = false & false;
            return c.this.e(null, null, null, null, this);
        }
    }

    private final p1 g(g gVar) {
        if (Intrinsics.areEqual(gVar, g.f193086a.a())) {
            return t5.V();
        }
        if (gVar instanceof d) {
            return ((d) gVar).c();
        }
        if (gVar instanceof com.planner5d.library.model.manager.performancetracing.b) {
            Collection<g> collectionC = ((com.planner5d.library.model.manager.performancetracing.b) gVar).c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionC) {
                if (obj instanceof d) {
                    arrayList.add(obj);
                }
            }
            d dVar = (d) CollectionsKt.firstOrNull((List) arrayList);
            if (dVar != null) {
                return dVar.c();
            }
        }
        return null;
    }

    private final p1 h(String str, com.planner5d.library.model.manager.performancetracing.c cVar, g gVar) {
        p1 p1VarP;
        p1 p1VarG = g(gVar);
        if (p1VarG != null && (p1VarP = p1VarG.P(cVar.a(), str)) != null) {
            return p1VarP;
        }
        String strA = cVar.a();
        ia iaVar = new ia();
        iaVar.v(true);
        Unit unit = Unit.f312394a;
        r1 r1VarR0 = t5.R0(str, strA, iaVar);
        Intrinsics.checkNotNullExpressionValue(r1VarR0, "startTransaction(...)");
        return r1VarR0;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    @NotNull
    public g a(@NotNull String name, @NotNull com.planner5d.library.model.manager.performancetracing.c operation, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new d(h(name, operation, gVar));
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    @Nullable
    public Object b(@NotNull String str, @NotNull com.planner5d.library.model.manager.performancetracing.c cVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return com.planner5d.library.model.manager.performancetracing.d.a.b(this, str, cVar, function1, dVar);
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    @NotNull
    public g c(@NotNull String str, @NotNull com.planner5d.library.model.manager.performancetracing.c cVar) {
        return com.planner5d.library.model.manager.performancetracing.d.a.a(this, str, cVar);
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    public void d(@NotNull String str, @NotNull com.planner5d.library.model.manager.performancetracing.c cVar, @NotNull Function0<Unit> function0) {
        com.planner5d.library.model.manager.performancetracing.d.a.c(this, str, cVar, function0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.planner5d.library.model.manager.performancetracing.sentry.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [io.sentry.p1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Unit] */
    @Override // com.planner5d.library.model.manager.performancetracing.d
    @Nullable
    public Object e(@NotNull String str, @NotNull com.planner5d.library.model.manager.performancetracing.c cVar, @Nullable g gVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        p1 p1VarH;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f193120d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f193120d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f193118b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f193120d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                p1VarH = h(str, cVar, gVar);
                aVar.f193117a = p1VarH;
                aVar.f193120d = 1;
                if (function1.invoke(aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p1VarH = (p1) aVar.f193117a;
                ResultKt.m(obj);
            }
            p1VarH.u();
            this = Unit.f312394a;
            return this;
        } catch (Throwable th2) {
            try {
                this.D(th2);
                throw th2;
            } catch (Throwable th3) {
                this.u();
                throw th3;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    public void f(@NotNull String name, @NotNull com.planner5d.library.model.manager.performancetracing.c operation, @Nullable g gVar, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(action, "action");
        p1 p1VarH = h(name, operation, gVar);
        try {
            action.invoke();
            p1VarH.u();
        } catch (Throwable th2) {
            try {
                p1VarH.D(th2);
                throw th2;
            } catch (Throwable th3) {
                p1VarH.u();
                throw th3;
            }
        }
    }
}
