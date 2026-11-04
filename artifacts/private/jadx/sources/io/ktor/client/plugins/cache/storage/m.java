package io.ktor.client.plugins.cache.storage;

import fi.w;
import io.ktor.http.Url;
import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.o0;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ui.u;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    public static final class a extends io.ktor.client.statement.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l1 f294641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k1 f294642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final GMTDate f294643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final GMTDate f294644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final v0 f294645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final CoroutineContext f294646f;

        a(io.ktor.client.plugins.cache.storage.c cVar, CoroutineContext coroutineContext) {
            this.f294641a = cVar.g();
            this.f294642b = cVar.j();
            this.f294643c = cVar.e();
            this.f294644d = cVar.f();
            this.f294645e = cVar.d();
            this.f294646f = coroutineContext;
        }

        @o0
        public static /* synthetic */ void e() {
        }

        @Override // io.ktor.http.f1
        public v0 O() {
            return this.f294645e;
        }

        @Override // io.ktor.client.statement.c
        public io.ktor.utils.io.h c() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // io.ktor.client.statement.c
        public GMTDate f() {
            return this.f294643c;
        }

        @Override // kotlinx.coroutines.s0
        public CoroutineContext getCoroutineContext() {
            return this.f294646f;
        }

        @Override // io.ktor.client.statement.c
        public io.ktor.client.call.b h() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // io.ktor.client.statement.c
        public GMTDate i() {
            return this.f294644d;
        }

        @Override // io.ktor.client.statement.c
        public l1 j() {
            return this.f294641a;
        }

        @Override // io.ktor.client.statement.c
        public k1 k() {
            return this.f294642b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0}, l = {71}, m = "store", n = {"$this$store", "url"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294650d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294649c = obj;
            this.f294650d |= Integer.MIN_VALUE;
            return m.d(null, null, null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.F1, 159}, m = "store", n = {"$this$store", io.sentry.protocol.n.f306405g, "varyKeys", "url", "isShared", "data"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f294655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f294656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f294657g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294656f = obj;
            this.f294657g |= Integer.MIN_VALUE;
            return m.b(null, null, null, false, this);
        }
    }

    @NotNull
    public static final io.ktor.client.statement.c a(@NotNull io.ktor.client.plugins.cache.storage.c cVar, @NotNull io.ktor.client.c client, @NotNull w request, @NotNull CoroutineContext responseContext) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseContext, "responseContext");
        return new io.ktor.client.call.g(client, request, new a(cVar, responseContext), cVar.b()).k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object b(@NotNull io.ktor.client.plugins.cache.storage.b bVar, @NotNull io.ktor.client.statement.c cVar, @NotNull Map<String, String> map, boolean z10, @NotNull kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) throws Throwable {
        c cVar2;
        io.ktor.client.plugins.cache.storage.b bVar2;
        io.ktor.client.statement.c cVar3;
        Url url;
        Map<String, String> map2;
        boolean z11;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f294657g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f294657g = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object obj = cVar2.f294656f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f294657g;
        if (i11 == 0) {
            ResultKt.m(obj);
            Url url2 = cVar.h().j().getUrl();
            io.ktor.utils.io.h hVarC = cVar.c();
            bVar2 = bVar;
            cVar2.f294651a = bVar2;
            cVar3 = cVar;
            cVar2.f294652b = cVar3;
            cVar2.f294653c = map;
            cVar2.f294654d = url2;
            cVar2.f294655e = z10;
            cVar2.f294657g = 1;
            Object objI = io.ktor.utils.io.k.I(hVarC, cVar2);
            if (objI != objL) {
                url = url2;
                obj = objI;
                map2 = map;
                z11 = z10;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            io.ktor.client.plugins.cache.storage.c cVar4 = (io.ktor.client.plugins.cache.storage.c) cVar2.f294651a;
            ResultKt.m(obj);
            return cVar4;
        }
        z11 = cVar2.f294655e;
        url = (Url) cVar2.f294654d;
        Map<String, String> map3 = (Map) cVar2.f294653c;
        cVar3 = (io.ktor.client.statement.c) cVar2.f294652b;
        io.ktor.client.plugins.cache.storage.b bVar3 = (io.ktor.client.plugins.cache.storage.b) cVar2.f294651a;
        ResultKt.m(obj);
        map2 = map3;
        bVar2 = bVar3;
        byte[] bArrD = u.d((c0) obj);
        io.ktor.client.plugins.cache.storage.c cVar5 = new io.ktor.client.plugins.cache.storage.c(cVar3.h().j().getUrl(), cVar3.j(), cVar3.f(), cVar3.i(), cVar3.k(), io.ktor.client.plugins.cache.e.d(cVar3, z11, null, 2, null), cVar3.O(), map2, bArrD);
        cVar2.f294651a = cVar5;
        cVar2.f294652b = null;
        cVar2.f294653c = null;
        cVar2.f294654d = null;
        cVar2.f294657g = 2;
        return bVar2.a(url, cVar5, cVar2) == objL ? objL : cVar5;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Please use method with `response.varyKeys()` and `isShared` arguments", replaceWith = @b1(expression = "store(response, response.varyKeys(), isShared)", imports = {}))
    @Nullable
    public static final Object c(@NotNull io.ktor.client.plugins.cache.storage.b bVar, @NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) {
        int i10 = (3 & 0) << 0;
        return e(bVar, cVar, io.ktor.client.plugins.cache.e.g(cVar), false, dVar, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object d(@NotNull l lVar, @NotNull Url url, @NotNull io.ktor.client.statement.c cVar, boolean z10, @NotNull kotlin.coroutines.d<? super io.ktor.client.plugins.cache.c> dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f294650d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f294650d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objB = bVar.f294649c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f294650d;
        if (i11 == 0) {
            ResultKt.m(objB);
            bVar.f294647a = lVar;
            bVar.f294648b = url;
            bVar.f294650d = 1;
            objB = io.ktor.client.plugins.cache.e.b(z10, cVar, bVar);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) bVar.f294648b;
            lVar = (l) bVar.f294647a;
            ResultKt.m(objB);
        }
        io.ktor.client.plugins.cache.c cVar2 = (io.ktor.client.plugins.cache.c) objB;
        lVar.g(url, cVar2);
        return cVar2;
    }

    public static /* synthetic */ Object e(io.ktor.client.plugins.cache.storage.b bVar, io.ktor.client.statement.c cVar, Map map, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return b(bVar, cVar, map, z10, dVar);
    }
}
