package io.ktor.client.plugins.cookies;

import fi.e0;
import fi.g0;
import fi.y;
import io.ktor.client.plugins.z;
import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.http.c0;
import io.ktor.http.d1;
import io.ktor.http.h0;
import io.ktor.http.i1;
import io.ktor.http.n2;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.r0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.s;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,164:1\n126#2:165\n153#2,3:166\n1869#3,2:169\n1869#3,2:171\n1869#3,2:173\n21#4:175\n65#5,18:176\n*S KotlinDebug\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies\n*L\n56#1:165\n56#1:166,3\n58#1:169,2\n78#1:171,2\n81#1:173,2\n123#1:175\n123#1:176,18\n*E\n"})
public final class h implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f294719d = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<h> f294720e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.plugins.cookies.f f294721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Function2<io.ktor.client.plugins.cookies.f, kotlin.coroutines.d<? super Unit>, Object>> f294722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p2 f294723c;

    public static final class a implements z<b, h> {

        /* JADX INFO: renamed from: io.ktor.client.plugins.cookies.h$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1", f = "HttpCookies.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        static final class C2063a extends o implements n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294724a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294725b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f294726c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2063a(h hVar, kotlin.coroutines.d<? super C2063a> dVar) {
                super(3, dVar);
                this.f294726c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f294724a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f294725b;
                    h hVar = this.f294726c;
                    y yVar = (y) eVar.f();
                    this.f294724a = 1;
                    if (hVar.d(yVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                C2063a c2063a = new C2063a(this.f294726c, dVar);
                c2063a.f294725b = eVar;
                return c2063a.invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$2", f = "HttpCookies.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294727a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f294729c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f294729c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f294727a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f294728b;
                    h hVar = this.f294729c;
                    y yVar = (y) eVar.f();
                    this.f294727a = 1;
                    if (hVar.g(yVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar = new b(this.f294729c, dVar);
                bVar.f294728b = eVar;
                return bVar.invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3", f = "HttpCookies.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements n<io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit>, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294730a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f294731b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f294732c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h hVar, kotlin.coroutines.d<? super c> dVar) {
                super(3, dVar);
                this.f294732c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f294730a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.client.statement.c cVar = (io.ktor.client.statement.c) this.f294731b;
                    h hVar = this.f294732c;
                    this.f294730a = 1;
                    if (hVar.f(cVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> eVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                c cVar2 = new c(this.f294732c, dVar);
                cVar2.f294731b = cVar;
                return cVar2.invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.ktor.client.plugins.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull h plugin, @NotNull io.ktor.client.c scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.x().q(e0.f275224h.d(), new C2063a(plugin, null));
            scope.E().q(g0.f275238h.e(), new b(plugin, null));
            scope.t().q(io.ktor.client.statement.b.f295326h.c(), new c(plugin, null));
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Function1<? super b, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            b bVar = new b();
            block.invoke(bVar);
            return bVar.a();
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        public io.ktor.util.a<h> getKey() {
            return h.f294720e;
        }

        private a() {
        }
    }

    @r0
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Function2<io.ktor.client.plugins.cookies.f, kotlin.coroutines.d<? super Unit>, Object>> f294733a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private io.ktor.client.plugins.cookies.f f294734b = new io.ktor.client.plugins.cookies.d(null, 1, null);

        @NotNull
        public final h a() {
            return new h(this.f294734b, this.f294733a);
        }

        public final void b(@NotNull Function2<? super io.ktor.client.plugins.cookies.f, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f294733a.add(block);
        }

        @NotNull
        public final io.ktor.client.plugins.cookies.f c() {
            return this.f294734b;
        }

        public final void d(@NotNull io.ktor.client.plugins.cookies.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.f294734b = fVar;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "captureHeaderCookies$ktor_client_core", n = {"url"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294737c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f294739e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294737c = obj;
            this.f294739e |= Integer.MIN_VALUE;
            return h.this.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {43, 44}, m = "get", n = {"requestUrl"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294741b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294743d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294741b = obj;
            this.f294743d |= Integer.MIN_VALUE;
            return h.this.R8(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies$initializer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1869#2,2:165\n*S KotlinDebug\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies$initializer$1\n*L\n34#1:165,2\n*E\n"})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294746c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h hVar;
            Iterator it;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294746c;
            if (i10 == 0) {
                ResultKt.m(obj);
                List list = h.this.f294722b;
                hVar = h.this;
                it = list.iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f294745b;
                hVar = (h) this.f294744a;
                ResultKt.m(obj);
            }
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                io.ktor.client.plugins.cookies.f fVar = hVar.f294721a;
                this.f294744a = hVar;
                this.f294745b = it;
                this.f294746c = 1;
                if (function2.invoke(fVar, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "saveCookiesFrom$ktor_client_core", n = {"url"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294750c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f294752e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294750c = obj;
            this.f294752e |= Integer.MIN_VALUE;
            return h.this.f(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {63}, m = "sendCookiesWith$ktor_client_core", n = {"builder"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294754b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294756d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294754b = obj;
            this.f294756d |= Integer.MIN_VALUE;
            return h.this.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        s sVarA = null;
        kotlin.reflect.d dVarD = j1.d(h.class);
        try {
            sVarA = j1.A(h.class);
        } catch (Throwable unused) {
        }
        f294720e = new io.ktor.util.a<>("HttpCookies", new ri.b(dVarD, sVarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull io.ktor.client.plugins.cookies.f storage, @NotNull List<? extends Function2<? super io.ktor.client.plugins.cookies.f, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> defaults) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        this.f294721a = storage;
        this.f294722b = defaults;
        this.f294723c = k.f(f2.f314023a, l1.g(), null, new e(null), 2, null);
    }

    private static /* synthetic */ void e() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object R8(@NotNull Url url, @NotNull kotlin.coroutines.d<? super List<Cookie>> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f294743d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f294743d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f294741b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f294743d;
        if (i11 == 0) {
            ResultKt.m(obj);
            p2 p2Var = this.f294723c;
            dVar2.f294740a = url;
            dVar2.f294743d = 1;
            if (p2Var.d1(dVar2) != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        url = (Url) dVar2.f294740a;
        ResultKt.m(obj);
        io.ktor.client.plugins.cookies.f fVar = this.f294721a;
        dVar2.f294740a = null;
        dVar2.f294743d = 2;
        Object objR8 = fVar.R8(url, dVar2);
        if (objR8 != objL) {
            return objR8;
        }
        return objL;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f294721a.close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object d(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        Iterator it;
        Url url;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f294739e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f294739e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f294737c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f294739e;
        if (i11 == 0) {
            ResultKt.m(obj);
            Url urlB = n2.n(yVar.i()).b();
            String str = yVar.O().get(d1.f295782a.D());
            ArrayList arrayList = null;
            if (str != null) {
                i.f294757a.J("Saving cookie " + str + " for " + yVar.i());
                Map mapL = h0.l(str, false, 2, null);
                arrayList = new ArrayList(mapL.size());
                for (Map.Entry entry : mapL.entrySet()) {
                    arrayList.add(new Cookie((String) entry.getKey(), (String) entry.getValue(), (c0) null, (Integer) null, (GMTDate) null, (String) null, (String) null, false, false, (Map) null, 1020, (DefaultConstructorMarker) null));
                }
            }
            if (arrayList != null) {
                it = arrayList.iterator();
                url = urlB;
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) cVar.f294736b;
        url = (Url) cVar.f294735a;
        ResultKt.m(obj);
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            io.ktor.client.plugins.cookies.f fVar = this.f294721a;
            cVar.f294735a = url;
            cVar.f294736b = it;
            cVar.f294739e = 1;
            if (fVar.Nd(url, cookie, cVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object f(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        f fVar;
        Iterator it;
        Url url;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f294752e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f294752e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f294750c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f294752e;
        if (i11 == 0) {
            ResultKt.m(obj);
            Url url2 = io.ktor.client.statement.e.h(cVar).getUrl();
            List<String> listB = cVar.O().b(d1.f295782a.B0());
            if (listB != null) {
                for (String str : listB) {
                    i.f294757a.J("Received cookie " + str + " in response for " + cVar.h().j().getUrl());
                }
            }
            it = i1.n(cVar).iterator();
            url = url2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) fVar.f294749b;
            url = (Url) fVar.f294748a;
            ResultKt.m(obj);
        }
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            io.ktor.client.plugins.cookies.f fVar2 = this.f294721a;
            fVar.f294748a = url;
            fVar.f294749b = it;
            fVar.f294752e = 1;
            if (fVar2.Nd(url, cookie, fVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object g(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f294756d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f294756d = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objR8 = gVar.f294754b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f294756d;
        if (i11 == 0) {
            ResultKt.m(objR8);
            Url urlB = n2.n(yVar.i()).b();
            gVar.f294753a = yVar;
            gVar.f294756d = 1;
            objR8 = R8(urlB, gVar);
            if (objR8 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (y) gVar.f294753a;
            ResultKt.m(objR8);
        }
        List list = (List) objR8;
        if (list.isEmpty()) {
            yVar.O().remove(d1.f295782a.D());
        } else {
            String strF = i.f(list);
            yVar.O().a(d1.f295782a.D(), strF);
            i.f294757a.J("Sending cookie " + strF + " for " + yVar.i());
        }
        return Unit.f312394a;
    }
}
