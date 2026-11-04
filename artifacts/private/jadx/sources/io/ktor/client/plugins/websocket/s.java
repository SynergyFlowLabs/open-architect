package io.ktor.client.plugins.websocket;

import com.devtodev.core.data.metrics.MetricConsts;
import fi.k0;
import io.ktor.http.j1;
import io.ktor.http.k2;
import io.ktor.http.r2;
import io.ktor.http.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 4 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 5 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 6 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,265:1\n93#2:266\n52#2:267\n93#2:268\n52#2:269\n131#3:270\n132#3,3:273\n135#3,3:295\n308#4,2:271\n310#4,2:298\n162#5:276\n65#6,18:277\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt\n*L\n36#1:266\n36#1:267\n105#1:268\n105#1:269\n112#1:270\n112#1:273,3\n112#1:295,3\n112#1:271,2\n112#1:298,2\n112#1:276\n112#1:277,18\n*E\n"})
public final class s {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.websocket.BuildersKt", f = "builders.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {271, 274, 114, androidx.media3.extractor.metadata.dvbsi.b.f67479d, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 295, 295}, m = "webSocket", n = {"block", "this_$iv", "block", "this_$iv", "response$iv", "this_$iv", "response$iv", MetricConsts.Install, "this_$iv", "response$iv", MetricConsts.Install, "this_$iv", "response$iv", MetricConsts.Install}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f295244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295245f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295244e = obj;
            this.f295245f |= Integer.MIN_VALUE;
            return s.w(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 1, 1, 2, 2}, l = {269, com.badlogic.gdx.utils.compression.lzma.a.f95331z, com.planner5d.library.engine.input.f.b.f160729t0, 293, 293}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt$webSocketSession$2\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,265:1\n131#2:266\n132#2,3:269\n135#2,3:291\n308#3,2:267\n310#3,2:294\n162#4:272\n65#5,18:273\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/websocket/BuildersKt$webSocketSession$2\n*L\n46#1:266\n46#1:269,3\n46#1:291,3\n46#1:267,2\n46#1:294,2\n46#1:272\n46#1:273,18\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.statement.g f295250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.x<v> f295251f;

        static final class a implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.x<Unit> f295252a;

            a(kotlinx.coroutines.x<Unit> xVar) {
                this.f295252a = xVar;
            }

            public final void c(Throwable th2) {
                if (th2 != null) {
                    this.f295252a.f(th2);
                } else {
                    this.f295252a.R(Unit.f312394a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                c(th2);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.client.statement.g gVar, kotlinx.coroutines.x<v> xVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f295250e = gVar;
            this.f295251f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f295250e, this.f295251f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00be A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:27:0x005b, B:50:0x00be, B:58:0x00f2, B:59:0x00f9), top: B:70:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:27:0x005b, B:50:0x00be, B:58:0x00f2, B:59:0x00f9), top: B:70:0x005b }] */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
        
            if (r2.c(r0, r14) == r1) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0107, code lost:
        
            if (r2.c(r15, r14) == r1) goto L63;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.s.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(j1 j1Var, String str, Integer num, String str2, Function1 function1, fi.y webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.p(j1Var);
        fi.d0.r(webSocket, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocket);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(String str, Function1 function1, fi.y webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.i().C(s2.f296093c.f());
        webSocket.i().B(k0.g(webSocket));
        r2.m(webSocket.i(), str);
        function1.invoke(webSocket);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(k2 url, k2 it) {
        Intrinsics.checkNotNullParameter(url, "$this$url");
        Intrinsics.checkNotNullParameter(it, "it");
        url.C(s2.f296093c.f());
        return Unit.f312394a;
    }

    @Nullable
    public static final Object E(@NotNull io.ktor.client.c cVar, @NotNull final j1 j1Var, @Nullable final String str, @Nullable final Integer num, @Nullable final String str2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super v> dVar) {
        return G(cVar, new Function1() { // from class: io.ktor.client.plugins.websocket.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.L(j1Var, str, num, str2, function1, (fi.y) obj);
            }
        }, dVar);
    }

    @Nullable
    public static final Object F(@NotNull io.ktor.client.c cVar, @NotNull final String str, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super v> dVar) {
        return G(cVar, new Function1() { // from class: io.ktor.client.plugins.websocket.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.N(str, function1, (fi.y) obj);
            }
        }, dVar);
    }

    @Nullable
    public static final Object G(@NotNull io.ktor.client.c cVar, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super v> dVar) {
        io.ktor.client.plugins.a0.b(cVar, d0.f295204e);
        int i10 = 2 >> 1;
        kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c(null, 1, null);
        fi.y yVar = new fi.y();
        yVar.s(new Function2() { // from class: io.ktor.client.plugins.websocket.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s.J((k2) obj, (k2) obj2);
            }
        });
        function1.invoke(yVar);
        kotlinx.coroutines.k.f(cVar, null, null, new b(new io.ktor.client.statement.g(yVar, cVar), xVarC, null), 3, null);
        return xVarC.q(dVar);
    }

    public static /* synthetic */ Object H(io.ktor.client.c cVar, j1 j1Var, String str, Integer num, String str2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j1Var = j1.f295897b.c();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.K((fi.y) obj2);
                }
            };
        }
        return E(cVar, j1Var, str, num, str2, function1, dVar);
    }

    public static /* synthetic */ Object I(io.ktor.client.c cVar, String str, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.M((fi.y) obj2);
                }
            };
        }
        return F(cVar, str, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(k2 url, k2 it) {
        Intrinsics.checkNotNullParameter(url, "$this$url");
        Intrinsics.checkNotNullParameter(it, "it");
        url.C(s2.f296093c.f());
        url.B(url.o().k());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(j1 j1Var, String str, Integer num, String str2, Function1 function1, fi.y webSocketSession) {
        Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        webSocketSession.p(j1Var);
        fi.d0.r(webSocketSession, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocketSession);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, Function1 function1, fi.y webSocketSession) {
        Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        r2.m(webSocketSession.i(), str);
        function1.invoke(webSocketSession);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object O(@NotNull io.ktor.client.c cVar, @NotNull j1 j1Var, @Nullable String str, @Nullable Integer num, @Nullable String str2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objU = u(cVar, j1Var, str, num, str2, function1, function2, dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Nullable
    public static final Object P(@NotNull io.ktor.client.c cVar, @NotNull String str, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objV = v(cVar, str, function1, function2, dVar);
        return objV == kotlin.coroutines.intrinsics.b.l() ? objV : Unit.f312394a;
    }

    @Nullable
    public static final Object Q(@NotNull io.ktor.client.c cVar, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objW = w(cVar, function1, function2, dVar);
        return objW == kotlin.coroutines.intrinsics.b.l() ? objW : Unit.f312394a;
    }

    public static /* synthetic */ Object R(io.ktor.client.c cVar, j1 j1Var, String str, Integer num, String str2, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j1Var = j1.f295897b.c();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.T((fi.y) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return O(cVar, j1Var, str, num, str2, function3, function2, dVar);
    }

    public static /* synthetic */ Object S(io.ktor.client.c cVar, String str, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.U((fi.y) obj2);
                }
            };
        }
        return P(cVar, str, function1, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object V(@NotNull io.ktor.client.c cVar, @NotNull j1 j1Var, @Nullable String str, @Nullable final Integer num, @Nullable String str2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objU = u(cVar, j1Var, str, num, str2, new Function1() { // from class: io.ktor.client.plugins.websocket.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.e0(num, function1, (fi.y) obj);
            }
        }, function2, dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Nullable
    public static final Object W(@NotNull io.ktor.client.c cVar, @NotNull final String str, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objX = X(cVar, new Function1() { // from class: io.ktor.client.plugins.websocket.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.c0(str, function1, (fi.y) obj);
            }
        }, function2, dVar);
        return objX == kotlin.coroutines.intrinsics.b.l() ? objX : Unit.f312394a;
    }

    @Nullable
    public static final Object X(@NotNull io.ktor.client.c cVar, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objW = w(cVar, new Function1() { // from class: io.ktor.client.plugins.websocket.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.a0(function1, (fi.y) obj);
            }
        }, function2, dVar);
        return objW == kotlin.coroutines.intrinsics.b.l() ? objW : Unit.f312394a;
    }

    public static /* synthetic */ Object Y(io.ktor.client.c cVar, j1 j1Var, String str, Integer num, String str2, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j1Var = j1.f295897b.c();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.d0((fi.y) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return V(cVar, j1Var, str, num, str2, function3, function2, dVar);
    }

    public static /* synthetic */ Object Z(io.ktor.client.c cVar, String str, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.b0((fi.y) obj2);
                }
            };
        }
        return W(cVar, str, function1, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(Function1 function1, fi.y webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.i().C(s2.f296093c.g());
        webSocket.i().B(webSocket.i().o().k());
        function1.invoke(webSocket);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(String str, Function1 function1, fi.y wss) {
        Intrinsics.checkNotNullParameter(wss, "$this$wss");
        r2.m(wss.i(), str);
        function1.invoke(wss);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(Integer num, Function1 function1, fi.y webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.i().C(s2.f296093c.g());
        if (num != null) {
            webSocket.i().B(num.intValue());
        }
        function1.invoke(webSocket);
        return Unit.f312394a;
    }

    public static final void s(@NotNull io.ktor.client.j<?> jVar, @NotNull final Function1<? super d0.a, Unit> config) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        jVar.r(d0.f295204e, new Function1() { // from class: io.ktor.client.plugins.websocket.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.t(config, (d0.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, d0.a install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object u(@NotNull io.ktor.client.c cVar, @NotNull final j1 j1Var, @Nullable final String str, @Nullable final Integer num, @Nullable final String str2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objW = w(cVar, new Function1() { // from class: io.ktor.client.plugins.websocket.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.A(j1Var, str, num, str2, function1, (fi.y) obj);
            }
        }, function2, dVar);
        return objW == kotlin.coroutines.intrinsics.b.l() ? objW : Unit.f312394a;
    }

    @Nullable
    public static final Object v(@NotNull io.ktor.client.c cVar, @NotNull final String str, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super v, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objU = u(cVar, j1.f295897b.c(), null, null, null, new Function1() { // from class: io.ktor.client.plugins.websocket.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.C(str, function1, (fi.y) obj);
            }
        }, function2, dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0063, blocks: (B:19:0x005e, B:72:0x017e, B:73:0x0187, B:24:0x0077, B:61:0x0149, B:58:0x0136, B:69:0x016a, B:32:0x00ac, B:53:0x0120, B:74:0x0188, B:75:0x0190), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149 A[Catch: all -> 0x0063, PHI: r0 r8 r10
      0x0149: PHI (r0v17 io.ktor.client.statement.g) = (r0v14 io.ktor.client.statement.g), (r0v19 io.ktor.client.statement.g) binds: [B:59:0x0145, B:24:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r8v27 io.ktor.client.plugins.websocket.v) = (r8v23 io.ktor.client.plugins.websocket.v), (r8v33 io.ktor.client.plugins.websocket.v) binds: [B:59:0x0145, B:24:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r10v19 io.ktor.client.statement.c) = (r10v13 io.ktor.client.statement.c), (r10v22 io.ktor.client.statement.c) binds: [B:59:0x0145, B:24:0x0077] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0063, blocks: (B:19:0x005e, B:72:0x017e, B:73:0x0187, B:24:0x0077, B:61:0x0149, B:58:0x0136, B:69:0x016a, B:32:0x00ac, B:53:0x0120, B:74:0x0188, B:75:0x0190), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188 A[Catch: all -> 0x0063, TryCatch #3 {all -> 0x0063, blocks: (B:19:0x005e, B:72:0x017e, B:73:0x0187, B:24:0x0077, B:61:0x0149, B:58:0x0136, B:69:0x016a, B:32:0x00ac, B:53:0x0120, B:74:0x0188, B:75:0x0190), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a7, code lost:
    
        if (r0.c(r10, r1) == r2) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.ktor.client.statement.g] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.client.statement.c] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v4 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(@org.jetbrains.annotations.NotNull io.ktor.client.c r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super fi.y, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.v, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.s.w(io.ktor.client.c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object x(io.ktor.client.c cVar, j1 j1Var, String str, Integer num, String str2, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j1Var = j1.f295897b.c();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.z((fi.y) obj2);
                }
            };
        }
        Function1 function3 = function1;
        return u(cVar, j1Var, str, num, str2, function3, function2, dVar);
    }

    public static /* synthetic */ Object y(io.ktor.client.c cVar, String str, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.B((fi.y) obj2);
                }
            };
        }
        return v(cVar, str, function1, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }
}
