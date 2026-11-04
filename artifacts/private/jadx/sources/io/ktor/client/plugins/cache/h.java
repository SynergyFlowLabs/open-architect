package io.ktor.client.plugins.cache;

import fi.f0;
import fi.k0;
import fi.w;
import fi.y;
import fi.z;
import io.ktor.client.plugins.cache.storage.l;
import io.ktor.client.plugins.cache.storage.m;
import io.ktor.http.Url;
import io.ktor.http.c1;
import io.ktor.http.d1;
import io.ktor.http.i1;
import io.ktor.http.l1;
import io.ktor.http.r0;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.http.w2;
import io.ktor.util.date.GMTDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCacheLegacy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,160:1\n30#2:161\n1#3:162\n1068#4:163\n295#4:164\n296#4:168\n168#5,3:165\n168#5,3:169\n*S KotlinDebug\n*F\n+ 1 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n*L\n84#1:161\n139#1:163\n140#1:164\n140#1:168\n141#1:165,3\n153#1:169,3\n*E\n"})
public final class h {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {}, l = {109}, m = "cacheResponse", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f294527b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294526a = obj;
            this.f294527b |= Integer.MIN_VALUE;
            return h.c(null, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n*L\n1#1,121:1\n139#2:122\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((io.ktor.client.plugins.cache.c) t11).c().i(), ((io.ktor.client.plugins.cache.c) t10).c().i());
        }
    }

    /* synthetic */ class c extends g0 implements Function1<String, String> {
        c(Object obj) {
            super(1, obj, w0.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((w0) this.receiver).get(p10);
        }
    }

    /* synthetic */ class d extends g0 implements Function1<String, List<? extends String>> {
        d(Object obj) {
            super(1, obj, w0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((w0) this.receiver).b(p10);
        }
    }

    /* synthetic */ class e extends g0 implements Function1<String, String> {
        e(Object obj) {
            super(1, obj, v0.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((v0) this.receiver).get(p10);
        }
    }

    /* synthetic */ class f extends g0 implements Function1<String, List<? extends String>> {
        f(Object obj) {
            super(1, obj, v0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((v0) this.receiver).b(p10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {0}, l = {61, com.planner5d.library.engine.input.f.b.I0, 71}, m = "interceptReceiveLegacy", n = {"$this$interceptReceiveLegacy"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294530c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294529b = obj;
            this.f294530c |= Integer.MIN_VALUE;
            return h.g(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object c(io.ktor.client.plugins.cache.b bVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294527b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294527b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f294526a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294527b;
        if (i11 == 0) {
            ResultKt.m(objD);
            w wVarJ = cVar.h().j();
            List<r0> listA = i1.a(cVar);
            List<r0> listA2 = i1.a(wVarJ);
            io.ktor.client.plugins.cache.a aVar2 = io.ktor.client.plugins.cache.a.f294466a;
            l lVarL = listA.contains(aVar2.e()) ? bVar.l() : bVar.n();
            if (listA.contains(aVar2.c()) || listA2.contains(aVar2.c())) {
                return cVar;
            }
            Url url = wVarJ.getUrl();
            boolean zP = bVar.p();
            aVar.f294527b = 1;
            objD = m.d(lVarL, url, cVar, zP, aVar);
            if (objD == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objD);
        }
        return ((io.ktor.client.plugins.cache.c) objD).f();
    }

    private static final io.ktor.client.statement.c d(io.ktor.client.plugins.cache.b bVar, w wVar, io.ktor.client.statement.c cVar) {
        Url url = cVar.h().j().getUrl();
        l lVarL = i1.a(cVar).contains(io.ktor.client.plugins.cache.a.f294466a.e()) ? bVar.l() : bVar.n();
        Map<String, String> mapG = io.ktor.client.plugins.cache.e.g(cVar);
        io.ktor.client.plugins.cache.c cVarF = f(bVar, lVarL, mapG, url, wVar);
        if (cVarF == null) {
            return null;
        }
        if (mapG.isEmpty()) {
            mapG = cVarF.e();
        }
        lVarL.g(url, new io.ktor.client.plugins.cache.c(io.ktor.client.plugins.cache.e.d(cVar, bVar.p(), null, 2, null), mapG, cVarF.c(), cVarF.a()));
        return cVarF.f();
    }

    private static final io.ktor.client.plugins.cache.c e(io.ktor.client.plugins.cache.b bVar, y yVar, io.ktor.http.content.w wVar) {
        Map.Entry<String, String> next;
        String key;
        Url urlE = w2.e(yVar.i());
        Function1<String, String> function1E = io.ktor.client.plugins.cache.g.e(wVar, new c(yVar.O()), new d(yVar.O()));
        for (io.ktor.client.plugins.cache.c cVar : SetsKt.plus((Set) bVar.l().f(urlE), (Iterable) bVar.n().f(urlE))) {
            Map<String, String> mapE = cVar.e();
            if (!mapE.isEmpty()) {
                if (mapE.isEmpty()) {
                    return cVar;
                }
                Iterator<Map.Entry<String, String>> it = mapE.entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        key = next.getKey();
                    }
                } while (Intrinsics.areEqual(function1E.invoke(key), next.getValue()));
            }
            return cVar;
        }
        return null;
    }

    private static final io.ktor.client.plugins.cache.c f(io.ktor.client.plugins.cache.b bVar, l lVar, Map<String, String> map, Url url, w wVar) {
        Object next;
        Map.Entry<String, String> next2;
        String key;
        if (!map.isEmpty()) {
            return lVar.e(url, map);
        }
        Function1<String, String> function1E = io.ktor.client.plugins.cache.g.e(wVar.getContent(), new e(wVar.O()), new f(wVar.O()));
        Iterator it = CollectionsKt.sortedWith(lVar.f(url), new b()).iterator();
        while (it.hasNext()) {
            next = it.next();
            Map<String, String> mapE = ((io.ktor.client.plugins.cache.c) next).e();
            if (!mapE.isEmpty()) {
                Iterator<Map.Entry<String, String>> it2 = mapE.entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        key = next2.getKey();
                    }
                } while (Intrinsics.areEqual(function1E.invoke(key), next2.getValue()));
            }
            return (io.ktor.client.plugins.cache.c) next;
        }
        next = null;
        return (io.ktor.client.plugins.cache.c) next;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r7.k(r9, r0) == r1) goto L34;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@org.jetbrains.annotations.NotNull io.ktor.util.pipeline.e<io.ktor.client.statement.c, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull io.ktor.client.statement.c r8, @org.jetbrains.annotations.NotNull io.ktor.client.plugins.cache.b r9, @org.jetbrains.annotations.NotNull io.ktor.client.c r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.h.g(io.ktor.util.pipeline.e, io.ktor.client.statement.c, io.ktor.client.plugins.cache.b, io.ktor.client.c, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object h(@NotNull io.ktor.util.pipeline.e<Object, y> eVar, @NotNull io.ktor.client.plugins.cache.b bVar, @NotNull io.ktor.http.content.w wVar, @NotNull io.ktor.client.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH;
        io.ktor.client.plugins.cache.c cVarE = e(bVar, eVar.f(), wVar);
        if (cVarE == null) {
            return (c1.f(eVar.f().O().get(d1.f295782a.u())).contains(io.ktor.client.plugins.cache.a.f294466a.d()) && (objH = io.ktor.client.plugins.cache.b.f294472g.h(eVar, cVar, dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objH : Unit.f312394a;
        }
        io.ktor.client.call.b bVarH = cVarE.f().h();
        k kVarF = io.ktor.client.plugins.cache.e.f(cVarE.b(), cVarE.c().O(), eVar.f());
        if (kVarF == k.ShouldNotValidate) {
            Object objG = io.ktor.client.plugins.cache.b.f294472g.g(eVar, cVar, bVarH, dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
        if (kVarF == k.ShouldWarn) {
            Object objI = i(eVar, bVarH, cVar, dVar);
            return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
        }
        v0 v0VarD = cVarE.d();
        d1 d1Var = d1.f295782a;
        String str = v0VarD.get(d1Var.J());
        if (str != null) {
            k0.h(eVar.f(), d1Var.T(), str);
        }
        String str2 = cVarE.d().get(d1Var.X());
        if (str2 != null) {
            k0.h(eVar.f(), d1Var.S(), str2);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(io.ktor.util.pipeline.e<Object, y> eVar, io.ktor.client.call.b bVar, io.ktor.client.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        z zVarB = eVar.f().b();
        l1 l1VarJ = bVar.k().j();
        GMTDate gMTDateF = bVar.k().f();
        v0.a aVar = v0.f296123a;
        w0 w0Var = new w0(0, 1, null);
        w0Var.j(bVar.k().O());
        w0Var.l(d1.f295782a.P0(), "110");
        Unit unit = Unit.f312394a;
        io.ktor.client.call.b bVar2 = new io.ktor.client.call.b(cVar, zVarB, new f0(l1VarJ, gMTDateF, w0Var.build(), bVar.k().k(), bVar.k().c(), bVar.k().getCoroutineContext()));
        eVar.e();
        cVar.r().b(io.ktor.client.plugins.cache.b.f294472g.d(), bVar2.k());
        Object objK = eVar.k(bVar2, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : unit;
    }
}
