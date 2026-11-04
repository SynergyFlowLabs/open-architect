package io.ktor.client.plugins.websocket;

import androidx.collection.g3;
import fi.k0;
import io.ktor.http.d1;
import io.ktor.http.l1;
import io.ktor.http.t2;
import io.ktor.utils.io.r0;
import io.ktor.websocket.h0;
import io.ktor.websocket.i0;
import io.ktor.websocket.m0;
import io.ktor.websocket.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,249:1\n1374#2:250\n1460#2,5:251\n774#2:257\n865#2,2:258\n1#3:256\n21#4:260\n65#5,18:261\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets\n*L\n80#1:250\n80#1:251,5\n93#1:257\n93#1:258,2\n159#1:260\n159#1:261,18\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f295204e = new b(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<d0> f295205f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f295206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f295207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m0 f295208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final io.ktor.serialization.h f295209d;

    @r0
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f295211b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private io.ktor.serialization.h f295213d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final m0 f295210a = new m0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f295212c = g3.f12256c;

        public final void a(@NotNull Function1<? super m0, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(this.f295210a);
        }

        @Nullable
        public final io.ktor.serialization.h b() {
            return this.f295213d;
        }

        @NotNull
        public final m0 c() {
            return this.f295210a;
        }

        public final long d() {
            return this.f295212c;
        }

        public final long e() {
            return this.f295211b;
        }

        public final void f(@Nullable io.ktor.serialization.h hVar) {
            this.f295213d = hVar;
        }

        public final void g(long j10) {
            this.f295212c = j10;
        }

        public final void h(long j10) {
            this.f295211b = j10;
        }
    }

    public static final class b implements io.ktor.client.plugins.z<a, d0> {

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,249:1\n37#2,2:250\n37#2,2:252\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1\n*L\n177#1:250,2\n181#1:252,2\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f295214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f295215b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f295216c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d0 f295217d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, d0 d0Var, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f295216c = z10;
                this.f295217d = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f295214a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f295215b;
                    if (!t2.b(((fi.y) eVar.f()).i().o())) {
                        org.slf4j.c cVarB = e0.b();
                        if (pi.b.a(cVarB)) {
                            cVarB.J("Skipping WebSocket plugin for non-websocket request: " + ((fi.y) eVar.f()).i());
                        }
                        return Unit.f312394a;
                    }
                    org.slf4j.c cVarB2 = e0.b();
                    if (pi.b.a(cVarB2)) {
                        cVarB2.J("Sending WebSocket request " + ((fi.y) eVar.f()).i());
                    }
                    ((fi.y) eVar.f()).m(y.f295257a, Unit.f312394a);
                    if (this.f295216c) {
                        this.f295217d.j((fi.y) eVar.f());
                    }
                    z zVar = new z();
                    this.f295214a = 1;
                    if (eVar.k(zVar, this) == objL) {
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
            public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(this.f295216c, this.f295217d, dVar);
                aVar.f295215b = eVar;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.plugins.websocket.d0$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$2\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,249:1\n37#2,2:250\n37#2,2:252\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$2\n*L\n197#1:250,2\n212#1:252,2\n*E\n"})
        static final class C2073b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f295218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f295219b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f295220c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d0 f295221d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f295222e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2073b(d0 d0Var, boolean z10, kotlin.coroutines.d<? super C2073b> dVar) {
                super(3, dVar);
                this.f295221d = d0Var;
                this.f295222e = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object wVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f295218a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f295219b;
                    io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.f295220c;
                    ri.b bVarA = dVar.a();
                    Object objB = dVar.b();
                    io.ktor.client.statement.c cVarK = ((io.ktor.client.call.b) eVar.f()).k();
                    l1 l1VarJ = cVarK.j();
                    io.ktor.http.content.w content = io.ktor.client.statement.e.h(cVarK).getContent();
                    if (!(content instanceof z)) {
                        org.slf4j.c cVarB = e0.b();
                        if (pi.b.a(cVarB)) {
                            cVarB.J("Skipping non-websocket response from " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + ": " + content);
                        }
                        return Unit.f312394a;
                    }
                    l1.a aVar = l1.f295939c;
                    if (!Intrinsics.areEqual(l1VarJ, aVar.S())) {
                        throw new b0("Handshake exception, expected status code " + aVar.S().H0() + " but was " + l1VarJ.H0());
                    }
                    if (!(objB instanceof o0)) {
                        throw new b0("Handshake exception, expected `WebSocketSession` content but was " + j1.d(objB.getClass()));
                    }
                    org.slf4j.c cVarB2 = e0.b();
                    if (pi.b.a(cVarB2)) {
                        cVarB2.J("Receive websocket session from " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + ": " + objB);
                    }
                    if (this.f295221d.h() != g3.f12256c) {
                        ((o0) objB).R0(this.f295221d.h());
                    }
                    if (Intrinsics.areEqual(bVarA.b(), j1.d(v.class))) {
                        v vVar = new v((io.ktor.client.call.b) eVar.f(), this.f295221d.f((o0) objB));
                        vVar.h1(this.f295222e ? this.f295221d.e((io.ktor.client.call.b) eVar.f()) : CollectionsKt.emptyList());
                        wVar = vVar;
                    } else {
                        wVar = new w((io.ktor.client.call.b) eVar.f(), (o0) objB);
                    }
                    io.ktor.client.statement.d dVar2 = new io.ktor.client.statement.d(bVarA, wVar);
                    this.f295219b = null;
                    this.f295218a = 1;
                    if (eVar.k(dVar2, this) == objL) {
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
            public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
                C2073b c2073b = new C2073b(this.f295221d, this.f295222e, dVar2);
                c2073b.f295219b = eVar;
                c2073b.f295220c = dVar;
                return c2073b.invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.ktor.client.plugins.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull d0 plugin, @NotNull io.ktor.client.c scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            boolean zContains = scope.o().l6().contains(c0.f295203a);
            scope.x().q(fi.e0.f275224h.b(), new a(zContains, plugin, null));
            scope.y().q(io.ktor.client.statement.f.f295340h.e(), new C2073b(plugin, zContains, null));
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d0 a(@NotNull Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new d0(aVar.e(), aVar.d(), aVar.c(), aVar.b());
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        public io.ktor.util.a<d0> getKey() {
            return d0.f295205f;
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.s sVarA = null;
        kotlin.reflect.d dVarD = j1.d(d0.class);
        try {
            sVarA = j1.A(d0.class);
        } catch (Throwable unused) {
        }
        f295205f = new io.ktor.util.a<>("Websocket", new ri.b(dVarD, sVarA));
    }

    public d0(long j10, long j11, @NotNull m0 extensionsConfig, @Nullable io.ktor.serialization.h hVar) {
        Intrinsics.checkNotNullParameter(extensionsConfig, "extensionsConfig");
        this.f295206a = j10;
        this.f295207b = j11;
        this.f295208c = extensionsConfig;
        this.f295209d = hVar;
    }

    private final void d(fi.y yVar, List<h0> list) {
        if (list.isEmpty()) {
            return;
        }
        k0.h(yVar, d1.f295782a.w0(), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<io.ktor.websocket.e0<?>> e(io.ktor.client.call.b bVar) {
        List<h0> listEmptyList;
        String str = bVar.k().O().get(d1.f295782a.w0());
        if (str == null || (listEmptyList = i0.a(str)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = (List) bVar.getAttributes().f(e0.f295223a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((io.ktor.websocket.e0) obj).f(listEmptyList)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(fi.y yVar) {
        List<io.ktor.websocket.e0<?>> listC = this.f295208c.c();
        yVar.c().a(e0.f295223a, listC);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((io.ktor.websocket.e0) it.next()).b());
        }
        d(yVar, arrayList);
    }

    @NotNull
    public final io.ktor.websocket.b f(@NotNull o0 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (session instanceof io.ktor.websocket.b) {
            return (io.ktor.websocket.b) session;
        }
        long j10 = this.f295206a;
        io.ktor.websocket.b bVarA = io.ktor.websocket.d.a(session, j10, ((long) 2) * j10);
        bVarA.R0(this.f295207b);
        return bVarA;
    }

    @Nullable
    public final io.ktor.serialization.h g() {
        return this.f295209d;
    }

    public final long h() {
        return this.f295207b;
    }

    public final long i() {
        return this.f295206a;
    }

    public /* synthetic */ d0(long j10, long j11, m0 m0Var, io.ktor.serialization.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, m0Var, (i10 & 8) != 0 ? null : hVar);
    }

    public /* synthetic */ d0(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? g3.f12256c : j11);
    }

    public d0(long j10, long j11) {
        this(j10, j11, new m0(), null, 8, null);
    }

    public d0() {
        this(0L, g3.f12256c, new m0(), null, 8, null);
    }
}
