package io.ktor.client.plugins.cache.storage;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.http.Url;
import io.ktor.util.b0;
import io.ktor.utils.io.t;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,198:1\n168#2,3:199\n116#3,10:202\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage\n*L\n86#1:199,3\n115#1:202,10\n*E\n"})
final class h implements io.ktor.client.plugins.cache.storage.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f294576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n0 f294577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.collections.d<String, kotlinx.coroutines.sync.a> f294578d;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "find", n = {"varyKeys"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294580b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294582d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294580b = obj;
            this.f294582d |= Integer.MIN_VALUE;
            return h.this.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {}, l = {80}, m = "findAll", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294583a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294585c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294583a = obj;
            this.f294585c |= Integer.MIN_VALUE;
            return h.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {204, 122, 125, 127}, m = "readCache", n = {"urlHex", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", AppsFlyerProperties.CHANNEL, "$this$withLock_u24default$iv", AppsFlyerProperties.CHANNEL, "caches", "requestsCount", androidx.media3.exoplayer.upstream.h.f65997k, "$this$withLock_u24default$iv", "caches"}, s = {"L$0", "L$1", "L$0", "L$2", "L$0", "L$2", "L$3", "I$0", "I$1", "L$0", "L$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f294590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f294591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f294592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f294593h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f294595j;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294593h = obj;
            this.f294595j |= Integer.MIN_VALUE;
            return h.this.n(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {161, 162, 162, 163, 164, 167, 168, 171, 172, 173, 174, 177, 178, 182, 184}, m = "readCache", n = {AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, "url", AppsFlyerProperties.CHANNEL, "url", AppsFlyerProperties.CHANNEL, "url", "status", AppsFlyerProperties.CHANNEL, "url", "status", "version", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "headersCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "key", "headersCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u245", "varyKeysCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u245", "key", "varyKeysCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "body"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f294600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f294601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f294602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f294603h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f294604i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f294605j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f294606k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f294607l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f294608m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f294609n;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f294611s;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294609n = obj;
            this.f294611s |= Integer.MIN_VALUE;
            return h.this.m(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0}, l = {75, 76}, m = "invokeSuspend", n = {"urlHex"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$store$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n827#2:199\n855#2,2:200\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$store$2\n*L\n75#1:199\n75#1:200,2\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f294613b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Url f294615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.cache.storage.c f294616e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Url url, io.ktor.client.plugins.cache.storage.c cVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f294615d = url;
            this.f294616e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new e(this.f294615d, this.f294616e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        
            if (r3.q(r1, r10, r9) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f294613b
                r8 = 7
                r2 = 2
                r3 = 7
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L20
                r8 = 0
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r10)
                goto L95
            L16:
                r8 = 7
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                r8 = 2
                throw r9
            L20:
                java.lang.Object r1 = r9.f294612a
                r8 = 0
                java.lang.String r1 = (java.lang.String) r1
                r8 = 4
                kotlin.ResultKt.m(r10)
                goto L46
            L2a:
                r8 = 1
                kotlin.ResultKt.m(r10)
                io.ktor.client.plugins.cache.storage.h r10 = io.ktor.client.plugins.cache.storage.h.this
                r8 = 1
                io.ktor.http.Url r1 = r9.f294615d
                java.lang.String r1 = io.ktor.client.plugins.cache.storage.h.g(r10, r1)
                r8 = 7
                io.ktor.client.plugins.cache.storage.h r10 = io.ktor.client.plugins.cache.storage.h.this
                r9.f294612a = r1
                r9.f294613b = r3
                java.lang.Object r10 = io.ktor.client.plugins.cache.storage.h.i(r10, r1, r9)
                if (r10 != r0) goto L46
                r8 = 3
                goto L94
            L46:
                r8 = 2
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                r8 = 2
                io.ktor.client.plugins.cache.storage.c r3 = r9.f294616e
                java.util.ArrayList r4 = new java.util.ArrayList
                r8 = 2
                r4.<init>()
                java.util.Iterator r10 = r10.iterator()
            L56:
                boolean r5 = r10.hasNext()
                r8 = 5
                if (r5 == 0) goto L7d
                java.lang.Object r5 = r10.next()
                r6 = r5
                r6 = r5
                r8 = 0
                io.ktor.client.plugins.cache.storage.c r6 = (io.ktor.client.plugins.cache.storage.c) r6
                r8 = 0
                java.util.Map r6 = r6.i()
                r8 = 2
                java.util.Map r7 = r3.i()
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                r8 = 3
                if (r6 != 0) goto L56
                r8 = 6
                r4.add(r5)
                r8 = 1
                goto L56
            L7d:
                r8 = 6
                io.ktor.client.plugins.cache.storage.c r10 = r9.f294616e
                java.util.List r10 = kotlin.collections.CollectionsKt.plus(r4, r10)
                io.ktor.client.plugins.cache.storage.h r3 = io.ktor.client.plugins.cache.storage.h.this
                r8 = 0
                r4 = 0
                r8 = 4
                r9.f294612a = r4
                r8 = 3
                r9.f294613b = r2
                java.lang.Object r9 = io.ktor.client.plugins.cache.storage.h.k(r3, r1, r10, r9)
                if (r9 != r0) goto L95
            L94:
                return r0
            L95:
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", i = {0, 0, 1}, l = {204, 105}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    @SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,198:1\n116#2,11:199\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2\n*L\n94#1:199,11\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f294621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f294622f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f294624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<io.ktor.client.plugins.cache.storage.c> f294625i;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", f = "FileCacheStorage.kt", i = {}, l = {99, 101}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f294626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f294627b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.b f294628c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<io.ktor.client.plugins.cache.storage.c> f294629d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ h f294630e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(io.ktor.utils.io.b bVar, List<io.ktor.client.plugins.cache.storage.c> list, h hVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f294628c = bVar;
                this.f294629d = list;
                this.f294630e = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f294628c, this.f294629d, this.f294630e, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x004a  */
            /* JADX WARN: Code duplicated, block: B:22:0x0064 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:25:? A[LOOP:0: B:14:0x0043->B:25:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Iterator<io.ktor.client.plugins.cache.storage.c> it;
                io.ktor.client.plugins.cache.storage.c next;
                h hVar;
                io.ktor.utils.io.b bVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f294627b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.utils.io.b bVar2 = this.f294628c;
                    int size = this.f294629d.size();
                    this.f294627b = 1;
                    if (t.v(bVar2, size, this) == objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f294626a;
                    ResultKt.m(obj);
                }
                while (it.hasNext()) {
                    next = it.next();
                    hVar = this.f294630e;
                    bVar = this.f294628c;
                    this.f294626a = it;
                    this.f294627b = 2;
                    if (hVar.p(bVar, next, this) == objL) {
                        return objL;
                    }
                }
                this.f294628c.close();
                return Unit.f312394a;
                it = this.f294629d.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    hVar = this.f294630e;
                    bVar = this.f294628c;
                    this.f294626a = it;
                    this.f294627b = 2;
                    if (hVar.p(bVar, next, this) == objL) {
                        return objL;
                    }
                }
                this.f294628c.close();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, List<io.ktor.client.plugins.cache.storage.c> list, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f294624h = str;
            this.f294625i = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlinx.coroutines.sync.a m() {
            return kotlinx.coroutines.sync.g.b(false, 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = h.this.new f(this.f294624h, this.f294625i, dVar);
            fVar.f294622f = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            h hVar;
            String str;
            s0 s0Var;
            kotlinx.coroutines.sync.a aVar;
            List<io.ktor.client.plugins.cache.storage.c> list;
            io.ktor.utils.io.b bVar;
            BufferedOutputStream bufferedOutputStream;
            ?? r10;
            Object objB;
            kotlinx.coroutines.sync.a aVar2;
            Throwable th2;
            Object objG;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294621e;
            try {
                try {
                    try {
                        try {
                            if (i10 == 0) {
                                ResultKt.m(obj);
                                s0 s0Var2 = (s0) this.f294622f;
                                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) h.this.f294578d.c(this.f294624h, new Function0() { // from class: io.ktor.client.plugins.cache.storage.i
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return h.f.m();
                                    }
                                });
                                hVar = h.this;
                                str = this.f294624h;
                                List<io.ktor.client.plugins.cache.storage.c> list2 = this.f294625i;
                                this.f294622f = s0Var2;
                                this.f294617a = aVar3;
                                this.f294618b = hVar;
                                this.f294619c = str;
                                this.f294620d = list2;
                                this.f294621e = 1;
                                if (aVar3.h(null, this) != objL) {
                                    s0Var = s0Var2;
                                    aVar = aVar3;
                                    list = list2;
                                }
                                return objL;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r10 = (Closeable) this.f294617a;
                                aVar2 = (kotlinx.coroutines.sync.a) this.f294622f;
                                try {
                                    ResultKt.m(obj);
                                    objB = obj;
                                    r10 = r10;
                                    objG = kotlin.coroutines.jvm.internal.b.g(((Number) objB).longValue());
                                    try {
                                        kotlin.io.c.a(r10, null);
                                    } catch (Exception e10) {
                                        e = e10;
                                        aVar = aVar2;
                                        io.ktor.client.plugins.cache.g.d().J("Exception during saving a cache to a file: " + kotlin.p.i(e));
                                        objG = Unit.f312394a;
                                        aVar2 = aVar;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        kotlinx.coroutines.sync.a aVar4 = aVar2;
                                        aVar4.i(null);
                                        throw th;
                                    }
                                    aVar2.i(null);
                                    return objG;
                                } catch (Throwable th4) {
                                    th = th4;
                                    aVar = aVar2;
                                    ?? r11 = r10;
                                    th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th5) {
                                        kotlin.io.c.a(r11, th2);
                                        throw th5;
                                    }
                                }
                            }
                            list = (List) this.f294620d;
                            str = (String) this.f294619c;
                            hVar = (h) this.f294618b;
                            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f294617a;
                            s0 s0Var3 = (s0) this.f294622f;
                            ResultKt.m(obj);
                            s0Var = s0Var3;
                            aVar = aVar5;
                            objB = io.ktor.utils.io.jvm.javaio.d.b(bVar, r10, 0L, this, 2, null);
                            if (objB != objL) {
                                aVar2 = aVar;
                                r10 = r10;
                                objG = kotlin.coroutines.jvm.internal.b.g(((Number) objB).longValue());
                                kotlin.io.c.a(r10, null);
                                aVar2.i(null);
                                return objG;
                            }
                            return objL;
                        } catch (Throwable th6) {
                            th = th6;
                            ?? r12 = r10;
                            th2 = th;
                            throw th2;
                        }
                        kotlinx.coroutines.k.f(s0Var, null, null, new a(bVar, list, hVar, null), 3, null);
                        this.f294622f = aVar;
                        this.f294617a = bufferedOutputStream;
                        this.f294618b = null;
                        this.f294619c = null;
                        this.f294620d = null;
                        this.f294621e = 2;
                        r10 = bufferedOutputStream;
                    } catch (Throwable th7) {
                        th = th7;
                        r10 = bufferedOutputStream;
                    }
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(hVar.f294576b, str)), 8192);
                } catch (Exception e11) {
                    e = e11;
                    io.ktor.client.plugins.cache.g.d().J("Exception during saving a cache to a file: " + kotlin.p.i(e));
                    objG = Unit.f312394a;
                    aVar2 = aVar;
                    aVar2.i(null);
                    return objG;
                }
                bVar = new io.ktor.utils.io.b(false, 1, null);
            } catch (Throwable th8) {
                th = th8;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<Object> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {138, 139, androidx.media2.widget.f.i.f59773f0, androidx.media2.widget.f.i.f59775g0, 143, 145, 146, com.planner5d.library.engine.input.f.b.G1, com.planner5d.library.engine.input.f.b.H1, 150, 151, 153, androidx.media2.widget.f.i.f59793p0, androidx.media2.widget.f.i.f59797r0, androidx.media2.widget.f.i.f59799s0}, m = "writeCache", n = {AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", "headers", AppsFlyerProperties.CHANNEL, "cache", "value", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", "value", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f294635e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f294637g;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294635e = obj;
            this.f294637g |= Integer.MIN_VALUE;
            return h.this.p(null, null, this);
        }
    }

    public h(@NotNull File directory, @NotNull n0 dispatcher) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f294576b = directory;
        this.f294577c = dispatcher;
        this.f294578d = new io.ktor.util.collections.d<>(0, 1, null);
        directory.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l(Url url) {
        byte[] bArrDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e).digest(StringsKt.I1(url.toString()));
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return b0.h(bArrDigest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0278  */
    /* JADX WARN: Code duplicated, block: B:39:0x0297  */
    /* JADX WARN: Code duplicated, block: B:43:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0312  */
    /* JADX WARN: Code duplicated, block: B:56:0x0341  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0341 -> B:57:0x034b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x047c -> B:82:0x0488). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(io.ktor.utils.io.h r28, kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> r29) {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.m(io.ktor.utils.io.h, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [io.ktor.client.plugins.cache.storage.h$c, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r19v0, types: [io.ktor.client.plugins.cache.storage.h] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.client.plugins.cache.storage.h$c, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0126 -> B:85:0x012b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(java.lang.String r20, kotlin.coroutines.d<? super java.util.Set<io.ktor.client.plugins.cache.storage.c>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.n(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.sync.a o() {
        return kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0104 A[PHI: r13 r14
      0x0104: PHI (r13v13 io.ktor.client.plugins.cache.storage.c) = (r13v10 io.ktor.client.plugins.cache.storage.c), (r13v16 io.ktor.client.plugins.cache.storage.c) binds: [B:41:0x01ce, B:25:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r14v12 io.ktor.utils.io.b) = (r14v9 io.ktor.utils.io.b), (r14v15 io.ktor.utils.io.b) binds: [B:41:0x01ce, B:25:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0173  */
    /* JADX WARN: Code duplicated, block: B:36:0x0176  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a9 A[PHI: r13 r14
      0x01a9: PHI (r13v10 io.ktor.client.plugins.cache.storage.c) = (r13v7 io.ktor.client.plugins.cache.storage.c), (r13v12 io.ktor.client.plugins.cache.storage.c) binds: [B:38:0x01a5, B:27:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r14v9 io.ktor.utils.io.b) = (r14v6 io.ktor.utils.io.b), (r14v11 io.ktor.utils.io.b) binds: [B:38:0x01a5, B:27:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f6 A[PHI: r1 r12 r14
      0x01f6: PHI (r1v19 io.ktor.utils.io.b) = (r1v11 io.ktor.utils.io.b), (r1v18 io.ktor.utils.io.b), (r1v21 io.ktor.utils.io.b) binds: [B:46:0x01f2, B:53:0x0257, B:22:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r12v20 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>) = 
      (r12v17 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v19 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v24 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>)
     binds: [B:46:0x01f2, B:53:0x0257, B:22:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r14v23 io.ktor.client.plugins.cache.storage.c) = 
      (r14v16 io.ktor.client.plugins.cache.storage.c)
      (r14v22 io.ktor.client.plugins.cache.storage.c)
      (r14v26 io.ktor.client.plugins.cache.storage.c)
     binds: [B:46:0x01f2, B:53:0x0257, B:22:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0236 A[PHI: r1 r12 r13 r14
      0x0236: PHI (r1v18 io.ktor.utils.io.b) = (r1v17 io.ktor.utils.io.b), (r1v19 io.ktor.utils.io.b) binds: [B:23:0x00cc, B:50:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r12v19 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>) = 
      (r12v18 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v20 java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>>)
     binds: [B:23:0x00cc, B:50:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r13v22 java.lang.String) = (r13v21 java.lang.String), (r13v30 java.lang.String) binds: [B:23:0x00cc, B:50:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r14v22 io.ktor.client.plugins.cache.storage.c) = (r14v21 io.ktor.client.plugins.cache.storage.c), (r14v23 io.ktor.client.plugins.cache.storage.c) binds: [B:23:0x00cc, B:50:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0257 -> B:47:0x01f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x033d -> B:16:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(io.ktor.utils.io.b r13, io.ktor.client.plugins.cache.storage.c r14, kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.p(io.ktor.utils.io.b, io.ktor.client.plugins.cache.storage.c, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(String str, List<io.ktor.client.plugins.cache.storage.c> list, kotlin.coroutines.d<Object> dVar) {
        return t0.g(new f(str, list, null), dVar);
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object a(@NotNull Url url, @NotNull io.ktor.client.plugins.cache.storage.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f294577c, new e(url, cVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object b(@NotNull Url url, @NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294582d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294582d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objN = aVar.f294580b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294582d;
        if (i11 == 0) {
            ResultKt.m(objN);
            String strL = l(url);
            aVar.f294579a = map;
            aVar.f294582d = 1;
            objN = n(strL, aVar);
            if (objN == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) aVar.f294579a;
            ResultKt.m(objN);
        }
        for (Object obj : (Set) objN) {
            io.ktor.client.plugins.cache.storage.c cVar = (io.ktor.client.plugins.cache.storage.c) obj;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<String, String> next = it.next();
                        String key = next.getKey();
                        if (!Intrinsics.areEqual(cVar.i().get(key), next.getValue())) {
                        }
                    }
                }
            }
            if (map.size() == cVar.i().size()) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object c(@NotNull Url url, @NotNull kotlin.coroutines.d<? super Set<io.ktor.client.plugins.cache.storage.c>> dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f294585c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f294585c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objN = bVar.f294583a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f294585c;
        if (i11 == 0) {
            ResultKt.m(objN);
            String strL = l(url);
            bVar.f294585c = 1;
            objN = n(strL, bVar);
            if (objN == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objN);
        }
        return CollectionsKt.toSet((Iterable) objN);
    }

    public /* synthetic */ h(File file, n0 n0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? l1.c() : n0Var);
    }
}
