package com.planner5d.library.model.manager.performancetracing;

import com.facebook.internal.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPerformanceTracing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerformanceTracing.kt\ncom/planner5d/library/model/manager/performancetracing/PerformanceTracing\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1557#2:39\n1628#2,3:40\n1863#2,2:43\n1863#2,2:45\n1#3:47\n*S KotlinDebug\n*F\n+ 1 PerformanceTracing.kt\ncom/planner5d/library/model/manager/performancetracing/PerformanceTracing\n*L\n22#1:39\n22#1:40,3\n26#1:43,2\n32#1:45,2\n*E\n"})
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f193076a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Class<d>, d> f193077b = new LinkedHashMap();

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.performancetracing.PerformanceTracing", f = "PerformanceTracing.kt", i = {0, 0, 0, 0}, l = {32}, m = "withTransaction", n = {"name", "operation", "parent", w0.f100156c1}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f193078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f193079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f193080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f193083f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f193085h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f193083f = obj;
            this.f193085h |= Integer.MIN_VALUE;
            return e.this.e(null, null, null, null, this);
        }
    }

    private final Collection<d> h() {
        List list;
        synchronized (this.f193076a) {
            try {
                list = CollectionsKt.toList(this.f193077b.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    @NotNull
    public g a(@NotNull String name, @NotNull c operation, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Collection<d> collectionH = h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionH, 10));
        Iterator<T> it = collectionH.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a(name, operation, gVar));
        }
        return new b(arrayList);
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    @Nullable
    public Object b(@NotNull String str, @NotNull c cVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return d.a.b(this, str, cVar, function1, dVar);
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    @NotNull
    public g c(@NotNull String str, @NotNull c cVar) {
        return d.a.a(this, str, cVar);
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    public void d(@NotNull String str, @NotNull c cVar, @NotNull Function0<Unit> function0) {
        d.a.c(this, str, cVar, function0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.model.manager.performancetracing.d
    @Nullable
    public Object e(@NotNull String str, @NotNull c cVar, @Nullable g gVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        Iterator it;
        String str2;
        c cVar2;
        g gVar2;
        Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f193085h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f193085h = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f193083f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f193085h;
        if (i11 == 0) {
            ResultKt.m(obj);
            it = h().iterator();
            str2 = str;
            cVar2 = cVar;
            gVar2 = gVar;
            function2 = function1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.f193082e;
            Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3 = (Function1) aVar.f193081d;
            g gVar3 = (g) aVar.f193080c;
            c cVar3 = (c) aVar.f193079b;
            String str3 = (String) aVar.f193078a;
            ResultKt.m(obj);
            function2 = function3;
            gVar2 = gVar3;
            cVar2 = cVar3;
            str2 = str3;
        }
        a aVar2 = aVar;
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            aVar2.f193078a = str2;
            aVar2.f193079b = cVar2;
            aVar2.f193080c = gVar2;
            aVar2.f193081d = function2;
            aVar2.f193082e = it;
            aVar2.f193085h = 1;
            if (dVar2.e(str2, cVar2, gVar2, function2, aVar2) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.d
    public void f(@NotNull String name, @NotNull c operation, @Nullable g gVar, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = h().iterator();
        while (it.hasNext()) {
            ((d) it.next()).f(name, operation, gVar, action);
        }
    }

    public final void g(@NotNull d tracer) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        synchronized (this.f193076a) {
            this.f193077b.put((Class<d>) tracer.getClass(), tracer);
            Unit unit = Unit.f312394a;
        }
    }

    public final void i(@NotNull Class<? extends d> tracerType) {
        Intrinsics.checkNotNullParameter(tracerType, "tracerType");
        synchronized (this.f193076a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
