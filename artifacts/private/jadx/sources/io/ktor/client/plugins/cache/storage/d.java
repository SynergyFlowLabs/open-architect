package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/CachingCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,198:1\n168#2,3:199\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/CachingCacheStorage\n*L\n50#1:199,3\n*E\n"})
public final class d implements io.ktor.client.plugins.cache.storage.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.plugins.cache.storage.b f294554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.collections.d<Url, Set<io.ktor.client.plugins.cache.storage.c>> f294555c;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {46}, m = "find", n = {"url", "varyKeys"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f294560e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f294562g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294560e = obj;
            this.f294562g |= Integer.MIN_VALUE;
            return d.this.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "findAll", n = {"url"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f294566d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f294568f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294566d = obj;
            this.f294568f |= Integer.MIN_VALUE;
            return d.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {40, 41}, m = "store", n = {"url"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294571c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f294573e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294571c = obj;
            this.f294573e |= Integer.MIN_VALUE;
            return d.this.a(null, null, this);
        }
    }

    public d(@NotNull io.ktor.client.plugins.cache.storage.b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f294554b = delegate;
        int i10 = 4 ^ 1;
        this.f294555c = new io.ktor.util.collections.d<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object a(@NotNull Url url, @NotNull io.ktor.client.plugins.cache.storage.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar2;
        Url url2;
        Map map;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f294573e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f294573e = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object objC = cVar2.f294571c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f294573e;
        if (i11 == 0) {
            ResultKt.m(objC);
            io.ktor.client.plugins.cache.storage.b bVar = this.f294554b;
            cVar2.f294569a = url;
            cVar2.f294573e = 1;
            if (bVar.a(url, cVar, cVar2) != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            url = (Url) cVar2.f294569a;
            ResultKt.m(objC);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url2 = (Url) cVar2.f294570b;
            map = (Map) cVar2.f294569a;
            ResultKt.m(objC);
        }
        map.put(url2, objC);
        return Unit.f312394a;
        io.ktor.util.collections.d<Url, Set<io.ktor.client.plugins.cache.storage.c>> dVar2 = this.f294555c;
        io.ktor.client.plugins.cache.storage.b bVar2 = this.f294554b;
        cVar2.f294569a = dVar2;
        cVar2.f294570b = url;
        cVar2.f294573e = 2;
        objC = bVar2.c(url, cVar2);
        if (objC != objL) {
            url2 = url;
            map = dVar2;
            map.put(url2, objC);
            return Unit.f312394a;
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:1: B:29:0x00a9->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object b(@NotNull Url url, @NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) {
        a aVar;
        Map<String, String> map2;
        Map map3;
        Url url2;
        io.ktor.client.plugins.cache.storage.c cVar;
        Iterator<Map.Entry<String, String>> it;
        Map.Entry<String, String> next;
        String key;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294562g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294562g = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f294560e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294562g;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!this.f294555c.containsKey(url)) {
                io.ktor.util.collections.d<Url, Set<io.ktor.client.plugins.cache.storage.c>> dVar2 = this.f294555c;
                io.ktor.client.plugins.cache.storage.b bVar = this.f294554b;
                aVar.f294556a = url;
                aVar.f294557b = map;
                aVar.f294558c = dVar2;
                aVar.f294559d = url;
                aVar.f294562g = 1;
                Object objC = bVar.c(url, aVar);
                if (objC == objL) {
                    return objL;
                }
                map2 = map;
                map3 = dVar2;
                obj = objC;
                url2 = url;
            }
            for (Object obj2 : (Set) MapsKt.getValue(this.f294555c, url)) {
                cVar = (io.ktor.client.plugins.cache.storage.c) obj2;
                if (map.isEmpty()) {
                    it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            key = next.getKey();
                            if (!Intrinsics.areEqual(cVar.i().get(key), next.getValue())) {
                            }
                        }
                    }
                }
                if (map.size() == cVar.i().size()) {
                    return obj2;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        url = (Url) aVar.f294559d;
        map3 = (Map) aVar.f294558c;
        map2 = (Map) aVar.f294557b;
        url2 = (Url) aVar.f294556a;
        ResultKt.m(obj);
        map3.put(url, obj);
        url = url2;
        map = map2;
        while (r5.hasNext()) {
            cVar = (io.ktor.client.plugins.cache.storage.c) obj2;
            if (map.isEmpty()) {
                it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        key = next.getKey();
                        if (!Intrinsics.areEqual(cVar.i().get(key), next.getValue())) {
                        }
                    }
                }
            }
            if (map.size() == cVar.i().size()) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object c(@NotNull Url url, @NotNull kotlin.coroutines.d<? super Set<io.ktor.client.plugins.cache.storage.c>> dVar) {
        b bVar;
        Map map;
        Url url2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f294568f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f294568f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f294566d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f294568f;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!this.f294555c.containsKey(url)) {
                io.ktor.util.collections.d<Url, Set<io.ktor.client.plugins.cache.storage.c>> dVar2 = this.f294555c;
                io.ktor.client.plugins.cache.storage.b bVar2 = this.f294554b;
                bVar.f294563a = url;
                bVar.f294564b = dVar2;
                bVar.f294565c = url;
                bVar.f294568f = 1;
                Object objC = bVar2.c(url, bVar);
                if (objC == objL) {
                    return objL;
                }
                map = dVar2;
                obj = objC;
                url2 = url;
            }
            return MapsKt.getValue(this.f294555c, url);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        url = (Url) bVar.f294565c;
        map = (Map) bVar.f294564b;
        url2 = (Url) bVar.f294563a;
        ResultKt.m(obj);
        map.put(url, obj);
        url = url2;
        return MapsKt.getValue(this.f294555c, url);
    }
}
