package io.ktor.websocket;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final r0 f297311a = new r0("ws-ponger");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final r0 f297312b = new r0("ws-pinger");

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {66, 75, com.planner5d.library.engine.input.f.b.f160715o1}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f297316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f297317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<io.ktor.websocket.a, kotlin.coroutines.d<? super Unit>, Object> f297318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<e.C2109e> f297319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.o0<e> f297320h;

        /* JADX INFO: renamed from: io.ktor.websocket.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
        static final class C2110a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f297321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.p<e.C2109e> f297322b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2110a(kotlinx.coroutines.channels.p<e.C2109e> pVar, kotlin.coroutines.d<? super C2110a> dVar) {
                super(2, dVar);
                this.f297322b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2110a(this.f297322b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.channels.p<e.C2109e> pVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f297321a;
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                do {
                    pVar = this.f297322b;
                    this.f297321a = 1;
                } while (pVar.j(this) != objL);
                return objL;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2110a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p, com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f297323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.o0<e> f297324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f297325c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.p<e.C2109e> f297326d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.channels.o0<? super e> o0Var, String str, kotlinx.coroutines.channels.p<e.C2109e> pVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f297324b = o0Var;
                this.f297325c = str;
                this.f297326d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f297324b, this.f297325c, this.f297326d, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
            
                if (r11 == r0) goto L16;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0057 -> B:17:0x005a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r9 = 7
                    int r1 = r10.f297323a
                    r2 = 2
                    r3 = 2
                    r3 = 1
                    r9 = 7
                    if (r1 == 0) goto L28
                    if (r1 == r3) goto L23
                    r9 = 3
                    if (r1 != r2) goto L16
                    kotlin.ResultKt.m(r11)
                    goto L5a
                L16:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    r9 = 4
                    java.lang.String r11 = "bos/ u//ooosfet irewle/eu//nc/aee/l tcihovr tknmr i"
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r9 = 1
                    r10.<init>(r11)
                    r9 = 1
                    throw r10
                L23:
                    r9 = 4
                    kotlin.ResultKt.m(r11)
                    goto L4e
                L28:
                    kotlin.ResultKt.m(r11)
                    org.slf4j.c r11 = io.ktor.websocket.d.f()
                    r9 = 7
                    java.lang.String r1 = "WebSocket Pinger: sending ping frame"
                    r11.J(r1)
                    kotlinx.coroutines.channels.o0<io.ktor.websocket.e> r11 = r10.f297324b
                    io.ktor.websocket.e$d r1 = new io.ktor.websocket.e$d
                    java.lang.String r4 = r10.f297325c
                    java.nio.charset.Charset r5 = kotlin.text.Charsets.f313189f
                    byte[] r4 = ui.u.l(r4, r5)
                    r1.<init>(r4)
                    r9 = 0
                    r10.f297323a = r3
                    java.lang.Object r11 = r11.G(r1, r10)
                    if (r11 != r0) goto L4e
                    goto L59
                L4e:
                    r9 = 6
                    kotlinx.coroutines.channels.p<io.ktor.websocket.e$e> r11 = r10.f297326d
                    r10.f297323a = r2
                    java.lang.Object r11 = r11.j(r10)
                    if (r11 != r0) goto L5a
                L59:
                    return r0
                L5a:
                    io.ktor.websocket.e$e r11 = (io.ktor.websocket.e.C2109e) r11
                    byte[] r3 = r11.d()
                    byte[] r1 = r11.d()
                    r9 = 7
                    int r5 = r1.length
                    r9 = 2
                    r7 = 4
                    r8 = 0
                    r4 = 0
                    r6 = 0
                    r9 = r9 & r6
                    java.lang.String r1 = kotlin.text.StringsKt.H1(r3, r4, r5, r6, r7, r8)
                    java.lang.String r3 = r10.f297325c
                    r9 = 4
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 == 0) goto L97
                    r9 = 6
                    org.slf4j.c r10 = io.ktor.websocket.d.f()
                    r9 = 0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "WebSocket Pinger: received valid pong frame "
                    r9 = 5
                    r0.append(r1)
                    r0.append(r11)
                    java.lang.String r11 = r0.toString()
                    r10.J(r11)
                    kotlin.Unit r10 = kotlin.Unit.f312394a
                    return r10
                L97:
                    r9 = 0
                    org.slf4j.c r1 = io.ktor.websocket.d.f()
                    r9 = 2
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r9 = 7
                    r3.<init>()
                    java.lang.String r4 = "WebSocket Pinger: received invalid pong frame "
                    r3.append(r4)
                    r3.append(r11)
                    r9 = 1
                    java.lang.String r11 = ", continue waiting"
                    r3.append(r11)
                    r9 = 0
                    java.lang.String r11 = r3.toString()
                    r1.J(r11)
                    goto L4e
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j10, long j11, Function2<? super io.ktor.websocket.a, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlinx.coroutines.channels.p<e.C2109e> pVar, kotlinx.coroutines.channels.o0<? super e> o0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f297316d = j10;
            this.f297317e = j11;
            this.f297318f = function2;
            this.f297319g = pVar;
            this.f297320h = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f297316d, this.f297317e, this.f297318f, this.f297319g, this.f297320h, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0098  */
        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d7 A[Catch: c0 | CancellationException | c0 | d0 -> 0x0109, c0 | CancellationException | c0 | d0 -> 0x0109, c0 | CancellationException | c0 | d0 -> 0x0109, c0 | CancellationException | c0 | d0 -> 0x0109, PHI: r1 r6 r14
          0x00d7: PHI (r1v7 byte[]) = (r1v5 byte[]), (r1v13 byte[]) binds: [B:24:0x00d4, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x00d7: PHI (r6v11 kotlin.random.f) = (r6v7 kotlin.random.f), (r6v15 kotlin.random.f) binds: [B:24:0x00d4, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x00d7: PHI (r14v7 java.lang.Object) = (r14v5 java.lang.Object), (r14v0 java.lang.Object) binds: [B:24:0x00d4, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {c0 | CancellationException | c0 | d0 -> 0x0109, blocks: (B:8:0x0014, B:13:0x002c, B:13:0x002c, B:13:0x002c, B:13:0x002c, B:26:0x00d7, B:26:0x00d7, B:26:0x00d7, B:26:0x00d7, B:28:0x00dc, B:28:0x00dc, B:28:0x00dc, B:28:0x00dc, B:19:0x0080, B:19:0x0080, B:19:0x0080, B:19:0x0080, B:23:0x009a, B:23:0x009a, B:23:0x009a, B:23:0x009a, B:16:0x0039, B:16:0x0039, B:16:0x0039, B:16:0x0039), top: B:36:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:28:0x00dc A[Catch: c0 | CancellationException | c0 | d0 -> 0x0109, c0 | CancellationException | c0 | d0 -> 0x0109, c0 | CancellationException | c0 | d0 -> 0x0109, c0 | CancellationException | c0 | d0 -> 0x0109, TRY_LEAVE, TryCatch #0 {c0 | CancellationException | c0 | d0 -> 0x0109, blocks: (B:8:0x0014, B:13:0x002c, B:13:0x002c, B:13:0x002c, B:13:0x002c, B:26:0x00d7, B:26:0x00d7, B:26:0x00d7, B:26:0x00d7, B:28:0x00dc, B:28:0x00dc, B:28:0x00dc, B:28:0x00dc, B:19:0x0080, B:19:0x0080, B:19:0x0080, B:19:0x0080, B:23:0x009a, B:23:0x009a, B:23:0x009a, B:23:0x009a, B:16:0x0039, B:16:0x0039, B:16:0x0039, B:16:0x0039), top: B:36:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d4 -> B:26:0x00d7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {119, 33}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
    @SourceDebugExtension({"SMAP\nPingPong.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$ponger$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,114:1\n160#2:115\n94#2,3:116\n161#2,2:119\n101#2:121\n97#2,3:122\n*S KotlinDebug\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$ponger$1\n*L\n31#1:115\n31#1:116,3\n31#1:119,2\n31#1:121\n31#1:122,3\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<e.d> f297331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.o0<e.C2109e> f297332f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.channels.p<e.d> pVar, kotlinx.coroutines.channels.o0<? super e.C2109e> o0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f297331e = pVar;
            this.f297332f = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f297331e, this.f297332f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0061  */
        /* JADX WARN: Code duplicated, block: B:26:0x006f A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0020, B:20:0x0050, B:24:0x0065, B:26:0x006f, B:30:0x009b, B:15:0x0040, B:19:0x004c), top: B:43:0x000c, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x009b A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:8:0x0020, B:20:0x0050, B:24:0x0065, B:26:0x006f, B:30:0x009b, B:15:0x0040, B:19:0x004c), top: B:43:0x000c, outer: #2 }] */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        
            if (r5.G(r7, r11) == r0) goto L28;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0097 -> B:9:0x0024). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r10 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f297330d
                r10 = 0
                r2 = 1
                r10 = 6
                r3 = 2
                r10 = 2
                if (r1 == 0) goto L44
                r10 = 7
                if (r1 == r2) goto L32
                if (r1 != r3) goto L29
                java.lang.Object r1 = r11.f297329c
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                r10 = 0
                java.lang.Object r4 = r11.f297328b
                kotlinx.coroutines.channels.n0 r4 = (kotlinx.coroutines.channels.n0) r4
                java.lang.Object r5 = r11.f297327a
                kotlinx.coroutines.channels.o0 r5 = (kotlinx.coroutines.channels.o0) r5
                r10 = 4
                kotlin.ResultKt.m(r12)     // Catch: java.lang.Throwable -> L27
            L24:
                r12 = r5
                r10 = 7
                goto L50
            L27:
                r11 = move-exception
                goto La1
            L29:
                r10 = 1
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L32:
                java.lang.Object r1 = r11.f297329c
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r11.f297328b
                r10 = 0
                kotlinx.coroutines.channels.n0 r4 = (kotlinx.coroutines.channels.n0) r4
                r10 = 4
                java.lang.Object r5 = r11.f297327a
                kotlinx.coroutines.channels.o0 r5 = (kotlinx.coroutines.channels.o0) r5
                kotlin.ResultKt.m(r12)     // Catch: java.lang.Throwable -> L27
                goto L65
            L44:
                kotlin.ResultKt.m(r12)
                r10 = 5
                kotlinx.coroutines.channels.p<io.ktor.websocket.e$d> r4 = r11.f297331e     // Catch: kotlinx.coroutines.channels.d0 -> La8
                kotlinx.coroutines.channels.o0<io.ktor.websocket.e$e> r12 = r11.f297332f     // Catch: kotlinx.coroutines.channels.d0 -> La8
                kotlinx.coroutines.channels.r r1 = r4.iterator()     // Catch: java.lang.Throwable -> L27
            L50:
                r11.f297327a = r12     // Catch: java.lang.Throwable -> L27
                r11.f297328b = r4     // Catch: java.lang.Throwable -> L27
                r11.f297329c = r1     // Catch: java.lang.Throwable -> L27
                r11.f297330d = r2     // Catch: java.lang.Throwable -> L27
                java.lang.Object r5 = r1.c(r11)     // Catch: java.lang.Throwable -> L27
                r10 = 2
                if (r5 != r0) goto L61
                r10 = 0
                goto L99
            L61:
                r9 = r5
                r5 = r12
                r12 = r9
                r12 = r9
            L65:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L27
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L27
                r6 = 1
                r6 = 0
                if (r12 == 0) goto L9b
                r10 = 4
                java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L27
                io.ktor.websocket.e$d r12 = (io.ktor.websocket.e.d) r12     // Catch: java.lang.Throwable -> L27
                org.slf4j.c r7 = io.ktor.websocket.d.f()     // Catch: java.lang.Throwable -> L27
                r10 = 5
                java.lang.String r8 = "Received ping message, sending pong message"
                r7.J(r8)     // Catch: java.lang.Throwable -> L27
                io.ktor.websocket.e$e r7 = new io.ktor.websocket.e$e     // Catch: java.lang.Throwable -> L27
                byte[] r12 = r12.d()     // Catch: java.lang.Throwable -> L27
                r7.<init>(r12, r6, r3, r6)     // Catch: java.lang.Throwable -> L27
                r11.f297327a = r5     // Catch: java.lang.Throwable -> L27
                r11.f297328b = r4     // Catch: java.lang.Throwable -> L27
                r11.f297329c = r1     // Catch: java.lang.Throwable -> L27
                r10 = 7
                r11.f297330d = r3     // Catch: java.lang.Throwable -> L27
                java.lang.Object r12 = r5.G(r7, r11)     // Catch: java.lang.Throwable -> L27
                r10 = 7
                if (r12 != r0) goto L24
            L99:
                r10 = 1
                return r0
            L9b:
                kotlin.Unit r11 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L27
                kotlinx.coroutines.channels.v.b(r4, r6)     // Catch: kotlinx.coroutines.channels.d0 -> La8
                goto La8
            La1:
                r10 = 0
                throw r11     // Catch: java.lang.Throwable -> La3
            La3:
                r12 = move-exception
                kotlinx.coroutines.channels.v.b(r4, r11)     // Catch: kotlinx.coroutines.channels.d0 -> La8
                throw r12     // Catch: kotlinx.coroutines.channels.d0 -> La8
            La8:
                r10 = 5
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final kotlinx.coroutines.channels.o0<e.C2109e> b(@NotNull s0 s0Var, @NotNull kotlinx.coroutines.channels.o0<? super e> outgoing, long j10, long j11, @NotNull Function2<? super io.ktor.websocket.a, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> onTimeout) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        final kotlinx.coroutines.a0 a0VarC = u2.c(null, 1, null);
        kotlinx.coroutines.channels.p pVarD = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
        kotlinx.coroutines.k.f(s0Var, a0VarC.plus(f297312b), null, new a(j10, j11, onTimeout, pVarD, outgoing, null), 2, null);
        CoroutineContext.Element element = s0Var.getCoroutineContext().get(p2.M2);
        Intrinsics.checkNotNull(element);
        ((p2) element).E(new Function1() { // from class: io.ktor.websocket.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.c(a0VarC, (Throwable) obj);
            }
        });
        return pVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(kotlinx.coroutines.a0 a0Var, Throwable th2) {
        p2.a.b(a0Var, null, 1, null);
        return Unit.f312394a;
    }

    @NotNull
    public static final kotlinx.coroutines.channels.o0<e.d> d(@NotNull s0 s0Var, @NotNull kotlinx.coroutines.channels.o0<? super e.C2109e> outgoing) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        kotlinx.coroutines.channels.p pVarD = kotlinx.coroutines.channels.s.d(5, null, null, 6, null);
        kotlinx.coroutines.k.f(s0Var, f297311a, null, new b(pVarD, outgoing, null), 2, null);
        return pVarD;
    }
}
