package io.ktor.websocket;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.o7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n37#2,2:393\n37#2,2:395\n37#2,2:397\n1803#3,3:399\n1803#3,3:402\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl\n*L\n153#1:393,2\n279#1:395,2\n299#1:397,2\n358#1:399,3\n361#1:402,3\n*E\n"})
public final class c implements io.ktor.websocket.b, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o0 f297212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.x<io.ktor.websocket.a> f297213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<io.ktor.websocket.e> f297214c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<io.ktor.websocket.e> f297215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f297216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<e0<?>> f297217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f297218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f297219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f297220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final a1<io.ktor.websocket.a> f297221j;

    @NotNull
    volatile /* synthetic */ Object pinger;

    @NotNull
    private volatile /* synthetic */ int started;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f297207k = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final io.ktor.websocket.e.C2109e f297211o = new io.ktor.websocket.e.C2109e(new byte[0], j.f297309a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f297208l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "pinger");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f297209m = AtomicIntegerFieldUpdater.newUpdater(c.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f297210n = AtomicIntegerFieldUpdater.newUpdater(c.class, "started");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0}, l = {352}, m = "checkMaxFrameSize", n = {"size"}, s = {"I$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297223b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297225d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297223b = obj;
            this.f297225d |= Integer.MIN_VALUE;
            return c.this.m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.websocket.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {}, l = {278, 282, 292}, m = "outgoingProcessorLoop", n = {}, s = {})
    static final class C2108c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297227b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297229d;

        C2108c(kotlin.coroutines.d<? super C2108c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297227b = obj;
            this.f297229d |= Integer.MIN_VALUE;
            return c.this.p(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {397, 199, com.planner5d.library.engine.input.f.b.V1, 205, 206, 208, 223, 238, com.planner5d.library.engine.input.f.b.V1, com.planner5d.library.engine.input.f.b.V1, com.planner5d.library.engine.input.f.b.V1, com.planner5d.library.engine.input.f.b.V1}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", androidx.constraintlayout.core.motion.utils.v.a.L, "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
    @SourceDebugExtension({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n+ 3 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,392:1\n160#2:393\n94#2,3:394\n161#2:397\n101#2:400\n162#2:401\n97#2,3:402\n37#3,2:398\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1\n*L\n194#1:393\n194#1:394,3\n194#1:397\n194#1:400\n194#1:401\n194#1:402,3\n195#1:398,2\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f297233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f297234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f297235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f297236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f297237h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f297238i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f297239j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.o0<io.ktor.websocket.e.d> f297241l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(kotlinx.coroutines.channels.o0<? super io.ktor.websocket.e.d> o0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f297241l = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = c.this.new d(this.f297241l, dVar);
            dVar2.f297239j = obj;
            return dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0177  */
        /* JADX WARN: Code duplicated, block: B:44:0x018a A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:108:0x03c7, B:42:0x0182, B:44:0x018a, B:46:0x019a, B:47:0x01b6, B:49:0x01ba, B:51:0x01c4, B:53:0x01d2, B:54:0x01d6, B:57:0x01f4, B:70:0x023f, B:72:0x0243, B:74:0x0249, B:77:0x0264, B:78:0x0268, B:80:0x026c, B:83:0x0287, B:84:0x028b, B:110:0x03ce, B:14:0x0070, B:22:0x00c6, B:25:0x00eb, B:30:0x0108, B:33:0x012d), top: B:161:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:46:0x019a A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:108:0x03c7, B:42:0x0182, B:44:0x018a, B:46:0x019a, B:47:0x01b6, B:49:0x01ba, B:51:0x01c4, B:53:0x01d2, B:54:0x01d6, B:57:0x01f4, B:70:0x023f, B:72:0x0243, B:74:0x0249, B:77:0x0264, B:78:0x0268, B:80:0x026c, B:83:0x0287, B:84:0x028b, B:110:0x03ce, B:14:0x0070, B:22:0x00c6, B:25:0x00eb, B:30:0x0108, B:33:0x012d), top: B:161:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:70:0x023f A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:108:0x03c7, B:42:0x0182, B:44:0x018a, B:46:0x019a, B:47:0x01b6, B:49:0x01ba, B:51:0x01c4, B:53:0x01d2, B:54:0x01d6, B:57:0x01f4, B:70:0x023f, B:72:0x0243, B:74:0x0249, B:77:0x0264, B:78:0x0268, B:80:0x026c, B:83:0x0287, B:84:0x028b, B:110:0x03ce, B:14:0x0070, B:22:0x00c6, B:25:0x00eb, B:30:0x0108, B:33:0x012d), top: B:161:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:78:0x0268 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:108:0x03c7, B:42:0x0182, B:44:0x018a, B:46:0x019a, B:47:0x01b6, B:49:0x01ba, B:51:0x01c4, B:53:0x01d2, B:54:0x01d6, B:57:0x01f4, B:70:0x023f, B:72:0x0243, B:74:0x0249, B:77:0x0264, B:78:0x0268, B:80:0x026c, B:83:0x0287, B:84:0x028b, B:110:0x03ce, B:14:0x0070, B:22:0x00c6, B:25:0x00eb, B:30:0x0108, B:33:0x012d), top: B:161:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:80:0x026c A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:108:0x03c7, B:42:0x0182, B:44:0x018a, B:46:0x019a, B:47:0x01b6, B:49:0x01ba, B:51:0x01c4, B:53:0x01d2, B:54:0x01d6, B:57:0x01f4, B:70:0x023f, B:72:0x0243, B:74:0x0249, B:77:0x0264, B:78:0x0268, B:80:0x026c, B:83:0x0287, B:84:0x028b, B:110:0x03ce, B:14:0x0070, B:22:0x00c6, B:25:0x00eb, B:30:0x0108, B:33:0x012d), top: B:161:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0285  */
        /* JADX WARN: Code duplicated, block: B:83:0x0287 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:9:0x0047, B:108:0x03c7, B:42:0x0182, B:44:0x018a, B:46:0x019a, B:47:0x01b6, B:49:0x01ba, B:51:0x01c4, B:53:0x01d2, B:54:0x01d6, B:57:0x01f4, B:70:0x023f, B:72:0x0243, B:74:0x0249, B:77:0x0264, B:78:0x0268, B:80:0x026c, B:83:0x0287, B:84:0x028b, B:110:0x03ce, B:14:0x0070, B:22:0x00c6, B:25:0x00eb, B:30:0x0108, B:33:0x012d), top: B:161:0x000c }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v42, types: [T, io.ktor.websocket.e] */
        /* JADX WARN: Type inference failed for: r0v80 */
        /* JADX WARN: Type inference failed for: r0v97 */
        /* JADX WARN: Type inference failed for: r4v29, types: [T, kotlinx.io.x] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0320 -> B:103:0x0329). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x03bc -> B:108:0x03c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0247 -> B:103:0x0329). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instruction units count: 1308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", f = "DefaultWebSocketSession.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.websocket.a, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297243b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = c.this.new e(dVar);
            eVar.f297243b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f297242a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.websocket.a aVar = (io.ktor.websocket.a) this.f297243b;
                c cVar = c.this;
                IOException iOException = new IOException("Ping timeout");
                this.f297242a = 1;
                if (cVar.w(aVar, iOException, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.websocket.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", i = {}, l = {262, com.badlogic.gdx.utils.compression.lzma.a.A, com.badlogic.gdx.utils.compression.lzma.a.A, com.badlogic.gdx.utils.compression.lzma.a.A, 266, com.badlogic.gdx.utils.compression.lzma.a.A, com.badlogic.gdx.utils.compression.lzma.a.A, 270, com.badlogic.gdx.utils.compression.lzma.a.A, com.badlogic.gdx.utils.compression.lzma.a.A}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f297246b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new f(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0137  */
        /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        
            if (r11 == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        
            if (io.ktor.websocket.p0.c(r12, null, r11, 1, null) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
        
            if (io.ktor.websocket.p0.c(r12, null, r11, 1, null) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
        
            if (io.ktor.websocket.p0.c(r11, null, r7, 1, null) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
        
            if (io.ktor.websocket.p0.c(r11, null, r7, 1, null) == r1) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v16, types: [io.ktor.websocket.c$f] */
        /* JADX WARN: Type inference failed for: r11v18, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v2, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v29, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v35 */
        /* JADX WARN: Type inference failed for: r11v36 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v2, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r7v5, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7, types: [io.ktor.websocket.c$f, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0}, l = {306}, m = "sendCloseSequence", n = {o7.b.f305964e, "reasonToSend"}, s = {"L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297250c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297252e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297250c = obj;
            this.f297252e |= Integer.MIN_VALUE;
            return c.this.w(null, null, this);
        }
    }

    public c(@NotNull o0 raw, long j10, long j11) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f297212a = raw;
        this.pinger = null;
        kotlinx.coroutines.x<io.ktor.websocket.a> xVarC = kotlinx.coroutines.z.c(null, 1, null);
        this.f297213b = xVarC;
        this.f297214c = kotlinx.coroutines.channels.s.d(8, null, null, 6, null);
        this.f297215d = kotlinx.coroutines.channels.s.d(u.b(), null, null, 6, null);
        this.closed = 0;
        kotlinx.coroutines.a0 a0VarA = s2.a((p2) raw.getCoroutineContext().get(p2.M2));
        this.f297216e = a0VarA;
        this.f297217f = new ArrayList();
        this.started = 0;
        this.f297218g = raw.getCoroutineContext().plus(a0VarA).plus(new r0("ws-default"));
        this.f297219h = j10;
        this.f297220i = j11;
        this.f297221j = xVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object m(kotlinx.io.x xVar, io.ktor.websocket.e eVar, kotlin.coroutines.d<? super Unit> dVar) throws h {
        b bVar;
        int i10;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f297225d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f297225d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f297223b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = bVar.f297225d;
        if (i12 == 0) {
            ResultKt.m(obj);
            int length = eVar.d().length + (xVar != null ? ui.j.f(xVar) : 0);
            if (length <= T()) {
                return Unit.f312394a;
            }
            if (xVar != null) {
                xVar.close();
            }
            io.ktor.websocket.a aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC2106a.TOO_BIG, "Frame is too big: " + length + ". Max size is " + T());
            bVar.f297222a = length;
            bVar.f297225d = 1;
            if (p0.a(this, aVar, bVar) == objL) {
                return objL;
            }
            i10 = length;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = bVar.f297222a;
            ResultKt.m(obj);
        }
        throw new h(i10);
    }

    public static /* synthetic */ Object o(c cVar, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Server is going down";
        }
        return cVar.n(str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f7 -> B:14:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(kotlin.coroutines.d<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c.p(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.websocket.e q(io.ktor.websocket.e eVar) {
        Iterator<T> it = O0().iterator();
        while (it.hasNext()) {
            eVar = ((e0) it.next()).d(eVar);
        }
        return eVar;
    }

    private final io.ktor.websocket.e r(io.ktor.websocket.e eVar) {
        Iterator<T> it = O0().iterator();
        while (it.hasNext()) {
            eVar = ((e0) it.next()).c(eVar);
        }
        return eVar;
    }

    private final p2 t(kotlinx.coroutines.channels.o0<? super io.ktor.websocket.e.d> o0Var) {
        return kotlinx.coroutines.k.f(this, io.ktor.websocket.d.f297255c.plus(l1.g()), null, new d(o0Var, null), 2, null);
    }

    private final void u() {
        c cVar;
        kotlinx.coroutines.channels.o0<io.ktor.websocket.e.C2109e> o0VarB;
        long jM0 = M0();
        if (this.closed == 0 && jM0 > 0) {
            cVar = this;
            o0VarB = l.b(cVar, this.f297212a.b(), jM0, N(), new e(null));
        } else {
            cVar = this;
            o0VarB = null;
        }
        kotlinx.coroutines.channels.o0 o0Var = (kotlinx.coroutines.channels.o0) f297208l.getAndSet(cVar, o0VarB);
        if (o0Var != null) {
            kotlinx.coroutines.channels.o0.a.a(o0Var, null, 1, null);
        }
        if (o0VarB != null) {
            kotlinx.coroutines.channels.t.m(o0VarB.p(f297211o));
        }
        if (cVar.closed == 0 || o0VarB == null) {
            return;
        }
        cVar.u();
    }

    private final p2 v() {
        return kotlinx.coroutines.i.d(this, io.ktor.websocket.d.f297256d.plus(l1.g()), u0.UNDISPATCHED, new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object w(io.ktor.websocket.a aVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f297252e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f297252e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f297250c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f297252e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (!y()) {
                    return Unit.f312394a;
                }
                org.slf4j.c cVarF = io.ktor.websocket.d.f();
                if (pi.b.a(cVarF)) {
                    cVarF.J("Sending Close Sequence for session " + this + " with reason " + aVar + " and exception " + th2);
                }
                this.f297216e.complete();
                if (aVar == null) {
                    aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC2106a.NORMAL, "");
                }
                u();
                if (aVar.e() != io.ktor.websocket.a.EnumC2106a.CLOSED_ABNORMALLY.n()) {
                    kotlinx.coroutines.channels.o0<io.ktor.websocket.e> o0VarB = this.f297212a.b();
                    io.ktor.websocket.e.b bVar = new io.ktor.websocket.e.b(aVar);
                    gVar.f297248a = th2;
                    gVar.f297249b = aVar;
                    gVar.f297252e = 1;
                    if (o0VarB.G(bVar, gVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (io.ktor.websocket.a) gVar.f297249b;
                th2 = (Throwable) gVar.f297248a;
                ResultKt.m(obj);
            }
            this.f297213b.R(aVar);
            if (th2 != null) {
                this.f297215d.F(th2);
                this.f297214c.F(th2);
            }
            return Unit.f312394a;
        } catch (Throwable th3) {
            this.f297213b.R(aVar);
            if (th2 != null) {
                this.f297215d.F(th2);
                this.f297214c.F(th2);
            }
            throw th3;
        }
    }

    static /* synthetic */ Object x(c cVar, io.ktor.websocket.a aVar, Throwable th2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return cVar.w(aVar, th2, dVar);
    }

    private final boolean y() {
        return f297209m.compareAndSet(this, 0, 1);
    }

    @Override // io.ktor.websocket.b
    public long M0() {
        return this.f297219h;
    }

    @Override // io.ktor.websocket.b
    public long N() {
        return this.f297220i;
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public List<e0<?>> O0() {
        return this.f297217f;
    }

    @Override // io.ktor.websocket.o0
    public void R0(long j10) {
        this.f297212a.R0(j10);
    }

    @Override // io.ktor.websocket.o0
    public long T() {
        return this.f297212a.T();
    }

    @Override // io.ktor.websocket.o0
    public void Y(boolean z10) {
        this.f297212a.Y(z10);
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.n0<io.ktor.websocket.e> a() {
        return this.f297214c;
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.o0<io.ktor.websocket.e> b() {
        return this.f297215d;
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f297212a.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // io.ktor.websocket.b
    public void d0(long j10) {
        this.f297220i = j10;
        u();
    }

    @Override // io.ktor.websocket.b
    public void e1(long j10) {
        this.f297219h = j10;
        u();
    }

    @Override // io.ktor.websocket.b
    @NotNull
    public a1<io.ktor.websocket.a> g() {
        return this.f297221j;
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object g1(@NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return io.ktor.websocket.b.a.a(this, eVar, dVar);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f297218g;
    }

    @Override // io.ktor.websocket.b
    public void h1(@NotNull List<? extends e0<?>> negotiatedExtensions) {
        Intrinsics.checkNotNullParameter(negotiatedExtensions, "negotiatedExtensions");
        if (!f297210n.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        org.slf4j.c cVarF = io.ktor.websocket.d.f();
        if (pi.b.a(cVarF)) {
            cVarF.J("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + CollectionsKt.joinToString$default(negotiatedExtensions, null, null, null, 0, null, null, 63, null));
        }
        this.f297217f.addAll(negotiatedExtensions);
        u();
        t(l.d(this, b()));
        v();
    }

    @Nullable
    public final Object n(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objX = x(this, new io.ktor.websocket.a(io.ktor.websocket.a.EnumC2106a.GOING_AWAY, str), null, dVar, 2, null);
        return objX == kotlin.coroutines.intrinsics.b.l() ? objX : Unit.f312394a;
    }

    @Override // io.ktor.websocket.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Use cancel() instead.", replaceWith = @b1(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void o0() {
        p2.a.b(this.f297216e, null, 1, null);
        t0.f(this.f297212a, null, 1, null);
    }

    @Override // io.ktor.websocket.o0
    public boolean o1() {
        return this.f297212a.o1();
    }
}
