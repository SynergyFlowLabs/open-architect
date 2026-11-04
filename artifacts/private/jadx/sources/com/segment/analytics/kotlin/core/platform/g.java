package com.segment.analytics.kotlin.core.platform;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.k;
import com.segment.analytics.kotlin.core.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.p;
import kotlinx.coroutines.s0;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTimeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeline.kt\ncom/segment/analytics/kotlin/core/platform/Timeline\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,156:1\n215#2,2:157\n215#2,2:159\n215#2,2:161\n215#2,2:163\n*S KotlinDebug\n*F\n+ 1 Timeline.kt\ncom/segment/analytics/kotlin/core/platform/Timeline\n*L\n45#1:157,2\n117#1:159,2\n132#1:161,2\n150#1:163,2\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<e.b, com.segment.analytics.kotlin.core.platform.d> f266885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266886b;

    static final class a extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f266887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f266888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f266889c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, e eVar, g gVar) {
            super(1);
            this.f266887a = th2;
            this.f266888b = eVar;
            this.f266889c = gVar;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("error", this.f266887a.toString());
            e eVar = this.f266888b;
            if (!(eVar instanceof com.segment.analytics.kotlin.core.platform.a) || Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar).o(), "")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f266888b.c());
                sb2.append(l.f335457d);
                sb2.append(this.f266888b.getClass());
                it.put("plugin", sb2.toString());
            } else {
                it.put("plugin", this.f266888b.c() + l.f335457d + ((com.segment.analytics.kotlin.core.platform.a) this.f266888b).o());
            }
            it.put("writekey", this.f266889c.h().u().H());
            it.put("message", "Exception executing plugin");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.platform.Timeline$add$2$1", f = "Timeline.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0, com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f266891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f266892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.segment.analytics.kotlin.core.a aVar, e eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f266891b = aVar;
            this.f266892c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f266891b, this.f266892c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
        
            if (r8.g(r1, r2, r7) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 7
                int r1 = r7.f266890a
                java.lang.Class<com.segment.analytics.kotlin.core.v> r2 = com.segment.analytics.kotlin.core.v.class
                r3 = 2
                int r6 = r6 >> r3
                r4 = 1
                r6 = 2
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.ResultKt.m(r8)
                goto L8a
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1f:
                kotlin.ResultKt.m(r8)
                goto L3b
            L23:
                kotlin.ResultKt.m(r8)
                com.segment.analytics.kotlin.core.a r8 = r7.f266891b
                r6 = 5
                sovran.kotlin.e r8 = r8.a()
                kotlin.reflect.d r1 = kotlin.jvm.internal.j1.d(r2)
                r7.f266890a = r4
                java.lang.Object r8 = r8.f(r1, r7)
                r6 = 2
                if (r8 != r0) goto L3b
                goto L89
            L3b:
                com.segment.analytics.kotlin.core.v r8 = (com.segment.analytics.kotlin.core.v) r8
                if (r8 == 0) goto L46
                r6 = 4
                com.segment.analytics.kotlin.core.Settings r1 = r8.l()
                r6 = 7
                goto L48
            L46:
                r6 = 2
                r1 = 0
            L48:
                if (r1 == 0) goto L8a
                r6 = 2
                com.segment.analytics.kotlin.core.platform.e r4 = r7.f266892c
                r6 = 7
                com.segment.analytics.kotlin.core.a r5 = r7.f266891b
                java.util.Set r8 = r8.j()
                java.util.Collection r8 = (java.util.Collection) r8
                r6 = 2
                boolean r8 = r8.isEmpty()
                r6 = 2
                if (r8 != 0) goto L8a
                com.segment.analytics.kotlin.core.platform.e$c r8 = com.segment.analytics.kotlin.core.platform.e.c.Initial
                r6 = 4
                r4.i(r1, r8)
                sovran.kotlin.e r8 = r5.a()
                r6 = 5
                com.segment.analytics.kotlin.core.v$b r1 = new com.segment.analytics.kotlin.core.v$b
                int r4 = r4.hashCode()
                r6 = 1
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.f(r4)
                java.util.Set r4 = kotlin.collections.SetsKt.setOf(r4)
                r6 = 0
                r1.<init>(r4)
                r6 = 4
                kotlin.reflect.d r2 = kotlin.jvm.internal.j1.d(r2)
                r7.f266890a = r3
                java.lang.Object r7 = r8.g(r1, r2, r7)
                if (r7 != r0) goto L8a
            L89:
                return r0
            L8a:
                r6 = 6
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.platform.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f266893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.f266893a = eVar;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("message", "added");
            e eVar = this.f266893a;
            if (!(eVar instanceof com.segment.analytics.kotlin.core.platform.a) || Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar).o(), "")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f266893a.c());
                sb2.append(l.f335457d);
                sb2.append(this.f266893a.getClass());
                it.put("plugin", sb2.toString());
                return;
            }
            it.put("plugin", this.f266893a.c() + l.f335457d + ((com.segment.analytics.kotlin.core.platform.a) this.f266893a).o());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    static final class d extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f266894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.f266894a = eVar;
            int i10 = 3 << 1;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("message", "removed");
            e eVar = this.f266894a;
            if (!(eVar instanceof com.segment.analytics.kotlin.core.platform.a) || Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar).o(), "")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f266894a.c());
                sb2.append(l.f335457d);
                sb2.append(this.f266894a.getClass());
                it.put("plugin", sb2.toString());
                return;
            }
            it.put("plugin", this.f266894a.c() + l.f335457d + ((com.segment.analytics.kotlin.core.platform.a) this.f266894a).o());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        int i10 = 1;
        this.f266885a = MapsKt.mapOf(TuplesKt.to(e.b.Before, new com.segment.analytics.kotlin.core.platform.d(null, i10, 0 == true ? 1 : 0)), TuplesKt.to(e.b.Enrichment, new com.segment.analytics.kotlin.core.platform.d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), TuplesKt.to(e.b.Destination, new com.segment.analytics.kotlin.core.platform.d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), TuplesKt.to(e.b.After, new com.segment.analytics.kotlin.core.platform.d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), TuplesKt.to(e.b.Utility, new com.segment.analytics.kotlin.core.platform.d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)));
    }

    public final void a(@NotNull e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        try {
            plugin.b(h());
        } catch (Throwable th2) {
            k.a(h(), th2, "Caught Exception while setting up plugin " + plugin, w.f267067f, p.i(th2), new a(th2, plugin, this));
        }
        com.segment.analytics.kotlin.core.platform.d dVar = this.f266885a.get(plugin.c());
        if (dVar != null) {
            dVar.a(plugin);
        }
        com.segment.analytics.kotlin.core.a aVarH = h();
        kotlinx.coroutines.k.f(aVarH.c(), aVarH.d(), null, new b(aVarH, plugin, null), 2, null);
        w.f267062a.t(w.f267066e, new c(plugin));
    }

    public final void b(@NotNull Function1<? super e, Unit> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        Iterator<Map.Entry<e.b, com.segment.analytics.kotlin.core.platform.d>> it = this.f266885a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().b(closure);
        }
    }

    @Nullable
    public final BaseEvent c(@Nullable com.segment.analytics.kotlin.core.platform.d dVar, @Nullable BaseEvent baseEvent) {
        if (baseEvent == null) {
            return baseEvent;
        }
        if (dVar != null) {
            return dVar.c(baseEvent);
        }
        return null;
    }

    @Nullable
    public final BaseEvent d(@NotNull e.b type, @Nullable BaseEvent baseEvent) {
        Intrinsics.checkNotNullParameter(type, "type");
        return c(this.f266885a.get(type), baseEvent);
    }

    @Nullable
    public final com.segment.analytics.kotlin.core.platform.a e(@NotNull String destination) {
        e eVar;
        CopyOnWriteArrayList<e> copyOnWriteArrayListF;
        Object next;
        Intrinsics.checkNotNullParameter(destination, "destination");
        com.segment.analytics.kotlin.core.platform.d dVar = this.f266885a.get(e.b.Destination);
        if (dVar == null || (copyOnWriteArrayListF = dVar.f()) == null) {
            eVar = null;
        } else {
            Iterator<T> it = copyOnWriteArrayListF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                e eVar2 = (e) next;
                if ((eVar2 instanceof com.segment.analytics.kotlin.core.platform.a) && Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar2).o(), destination)) {
                    break;
                }
            }
            eVar = (e) next;
        }
        if (eVar instanceof com.segment.analytics.kotlin.core.platform.a) {
            return (com.segment.analytics.kotlin.core.platform.a) eVar;
        }
        return null;
    }

    @Nullable
    public final <T extends e> T f(@NotNull kotlin.reflect.d<T> pluginClass) {
        Intrinsics.checkNotNullParameter(pluginClass, "pluginClass");
        Iterator<Map.Entry<e.b, com.segment.analytics.kotlin.core.platform.d>> it = this.f266885a.entrySet().iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next().getValue().d(pluginClass);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    @NotNull
    public final <T extends e> List<T> g(@NotNull kotlin.reflect.d<T> pluginClass) {
        Intrinsics.checkNotNullParameter(pluginClass, "pluginClass");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<e.b, com.segment.analytics.kotlin.core.platform.d>> it = this.f266885a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getValue().e(pluginClass));
        }
        return arrayList;
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.a h() {
        com.segment.analytics.kotlin.core.a aVar = this.f266886b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @NotNull
    public final Map<e.b, com.segment.analytics.kotlin.core.platform.d> i() {
        return this.f266885a;
    }

    @Nullable
    public final BaseEvent j(@NotNull BaseEvent incomingEvent) {
        Function1<BaseEvent, BaseEvent> function1F;
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        BaseEvent baseEventD = d(e.b.Enrichment, d(e.b.Before, incomingEvent));
        if (baseEventD != null && (function1F = baseEventD.f()) != null) {
            baseEventD = function1F.invoke(baseEventD);
        }
        BaseEvent baseEvent = baseEventD;
        d(e.b.Destination, baseEvent);
        return d(e.b.After, baseEvent);
    }

    public final void k(@NotNull e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Iterator<Map.Entry<e.b, com.segment.analytics.kotlin.core.platform.d>> it = this.f266885a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().g(plugin);
            w.f267062a.t(w.f267066e, new d(plugin));
        }
    }

    public final void l(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266886b = aVar;
    }
}
