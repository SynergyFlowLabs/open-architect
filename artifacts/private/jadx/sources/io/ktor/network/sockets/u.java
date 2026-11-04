package io.ktor.network.sockets;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDatagramSendChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel\n+ 2 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n+ 6 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,195:1\n50#2:196\n51#2,3:201\n99#3:197\n100#3,2:199\n102#3,6:204\n1#4:198\n182#5,5:210\n116#6,11:215\n*S KotlinDebug\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel\n*L\n60#1:196\n60#1:201,3\n60#1:197\n60#1:199,2\n60#1:204,6\n60#1:198\n76#1:210,5\n94#1:215,11\n*E\n"})
public final class u implements kotlinx.coroutines.channels.o0<q> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296327d = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f296328e = AtomicIntegerFieldUpdater.newUpdater(u.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final DatagramChannel f296329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y f296330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f296331c;

    @NotNull
    private volatile /* synthetic */ int closed;

    @NotNull
    private volatile /* synthetic */ Object closedCause;

    @NotNull
    private volatile /* synthetic */ Object onCloseHandler;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0, 1}, l = {201, com.planner5d.library.engine.input.f.b.f160706l1}, m = "send", n = {"element", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296334c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296336e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296334c = obj;
            this.f296336e |= Integer.MIN_VALUE;
            return u.this.G(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {113, okhttp3.internal.ws.g.f334652s}, m = "invokeSuspend", n = {"writeWithPool", "buffer$iv", "head$iv$iv", "bb$iv", "buffer", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDatagramSendChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel$send$2$1\n+ 2 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,195:1\n50#2:196\n51#2,3:201\n99#3:197\n100#3,2:199\n102#3,6:204\n1#4:198\n182#5,5:210\n*S KotlinDebug\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel$send$2$1\n*L\n98#1:196\n98#1:201,3\n98#1:197\n98#1:199,2\n98#1:204,6\n98#1:198\n117#1:210,5\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f296342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f296343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u f296344h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, u uVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f296343g = qVar;
            this.f296344h = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f296343g, this.f296344h, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x010a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:30:0x010c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0113  */
        /* JADX WARN: Code duplicated, block: B:33:0x0119  */
        /* JADX WARN: Code duplicated, block: B:35:0x0123  */
        /* JADX WARN: Code duplicated, block: B:39:0x0132  */
        /* JADX WARN: Code duplicated, block: B:42:0x015e A[Catch: all -> 0x016b, TryCatch #0 {all -> 0x016b, blocks: (B:40:0x013f, B:42:0x015e, B:46:0x0173), top: B:58:0x013f }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0173 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #0 {all -> 0x016b, blocks: (B:40:0x013f, B:42:0x015e, B:46:0x0173), top: B:58:0x013f }] */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
        
            if (r4.l(r6, r1, r14) == r0) goto L49;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.u.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0}, l = {136}, m = "sendSuspend", n = {"buffer", "address"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296347c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296349e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296347c = obj;
            this.f296349e |= Integer.MIN_VALUE;
            return u.this.l(null, null, this);
        }
    }

    public u(@NotNull DatagramChannel channel, @NotNull y socket) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f296329a = channel;
        this.f296330b = socket;
        this.onCloseHandler = null;
        this.closed = 0;
        this.closedCause = null;
        this.f296331c = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    private final void b() {
        do {
            Function1 function1 = (Function1) this.onCloseHandler;
            if (function1 == x.f296354b) {
                return;
            }
            if (function1 != null) {
                if (!androidx.concurrent.futures.b.a(f296327d, this, function1, x.f296354b)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                function1.invoke(this.closedCause);
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f296327d, this, null, x.f296353a));
    }

    @kotlinx.coroutines.f1
    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:18:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(java.nio.ByteBuffer r8, io.ktor.network.sockets.i0 r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.ktor.network.sockets.u.c
            r6 = 4
            if (r0 == 0) goto L14
            r0 = r10
            io.ktor.network.sockets.u$c r0 = (io.ktor.network.sockets.u.c) r0
            int r1 = r0.f296349e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f296349e = r1
            goto L1a
        L14:
            r6 = 3
            io.ktor.network.sockets.u$c r0 = new io.ktor.network.sockets.u$c
            r0.<init>(r10)
        L1a:
            r6 = 7
            java.lang.Object r10 = r0.f296347c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f296349e
            r3 = 1
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.f296346b
            io.ktor.network.sockets.i0 r8 = (io.ktor.network.sockets.i0) r8
            java.lang.Object r9 = r0.f296345a
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            kotlin.ResultKt.m(r10)
            r5 = r9
            r9 = r8
            r8 = r5
            r6 = 6
            goto L63
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            r6 = 6
            kotlin.ResultKt.m(r10)
        L45:
            io.ktor.network.sockets.y r10 = r7.f296330b
            io.ktor.network.selector.g r2 = io.ktor.network.selector.g.WRITE
            r6 = 5
            r10.W3(r2, r3)
            io.ktor.network.sockets.y r10 = r7.f296330b
            io.ktor.network.selector.j r10 = r10.H()
            io.ktor.network.sockets.y r4 = r7.f296330b
            r0.f296345a = r8
            r0.f296346b = r9
            r6 = 5
            r0.f296349e = r3
            java.lang.Object r10 = r10.i3(r4, r2, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            java.nio.channels.DatagramChannel r10 = r7.f296329a
            java.net.SocketAddress r2 = io.ktor.network.sockets.b0.a(r9)
            r6 = 0
            int r10 = r10.send(r8, r2)
            if (r10 == 0) goto L45
            io.ktor.network.sockets.y r7 = r7.f296330b
            io.ktor.network.selector.g r8 = io.ktor.network.selector.g.WRITE
            r9 = 0
            r7.W3(r8, r9)
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.u.l(java.nio.ByteBuffer, io.ktor.network.sockets.i0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return this.closed;
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        if (!f296328e.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = th2;
        if (!this.f296330b.isClosed()) {
            this.f296330b.close();
        }
        b();
        return true;
    }

    @NotNull
    public final DatagramChannel d() {
        return this.f296329a;
    }

    @NotNull
    public final y f() {
        return this.f296330b;
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.b1(expression = "trySend(element).isSuccess", imports = {}))
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean offer(@NotNull q qVar) {
        return kotlinx.coroutines.channels.o0.a.c(this, qVar);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<q, kotlinx.coroutines.channels.o0<q>> i() {
        throw new kotlin.l0("An operation is not implemented: [DatagramSendChannel] doesn't support [onSend] select clause");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object G(@NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        q qVar2;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f296336e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f296336e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f296334c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f296336e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.sync.a aVar4 = this.f296331c;
                aVar.f296332a = qVar;
                aVar.f296333b = aVar4;
                aVar.f296336e = 1;
                if (aVar4.h(null, aVar) != objL) {
                    qVar2 = qVar;
                    aVar2 = aVar4;
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kotlinx.coroutines.sync.a) aVar.f296332a;
                try {
                    ResultKt.m(obj);
                    Unit unit = Unit.f312394a;
                    aVar3.i(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.i(null);
                    throw th2;
                }
            }
            aVar2 = (kotlinx.coroutines.sync.a) aVar.f296333b;
            qVar2 = (q) aVar.f296332a;
            ResultKt.m(obj);
            kotlinx.coroutines.n0 n0VarC = l1.c();
            b bVar = new b(qVar2, this, null);
            aVar.f296332a = aVar2;
            aVar.f296333b = null;
            aVar.f296336e = 2;
            if (kotlinx.coroutines.i.h(n0VarC, bVar, aVar) != objL) {
                aVar3 = aVar2;
                Unit unit2 = Unit.f312394a;
                aVar3.i(null);
                return unit2;
            }
            return objL;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar5 = aVar2;
            th2 = th4;
            aVar3 = aVar5;
            aVar3.i(null);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Object p(@NotNull q element) {
        boolean z10;
        Intrinsics.checkNotNullParameter(element, "element");
        int i10 = 0 << 1;
        if (!kotlinx.coroutines.sync.a.C2318a.c(this.f296331c, null, 1, null)) {
            return kotlinx.coroutines.channels.t.f313893b.b();
        }
        try {
            long j10 = ui.l.j(element.b());
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            kotlinx.io.b bVarN = element.b().n();
            if (bVarN.y1()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            kotlinx.io.t tVarG = bVarN.g();
            Intrinsics.checkNotNull(tVarG);
            byte[] bArrB = tVarG.b(true);
            int iH = tVarG.h();
            ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArrB, iH, tVarG.d() - iH).slice().asReadOnlyBuffer();
            Intrinsics.checkNotNull(byteBufferAsReadOnlyBuffer);
            if (byteBufferAsReadOnlyBuffer.remaining() < j10) {
                z10 = true;
            } else {
                z10 = false;
                if (this.f296329a.send(byteBufferAsReadOnlyBuffer, b0.a(element.a())) == 0) {
                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.limit());
                } else {
                    byteBufferAsReadOnlyBuffer.position(0);
                }
            }
            int iPosition = byteBufferAsReadOnlyBuffer.position();
            if (iPosition != 0) {
                if (iPosition < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iPosition > tVarG.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                bVarN.skip(iPosition);
            }
            if (z10) {
                io.ktor.utils.io.pool.h<ByteBuffer> hVarB = io.ktor.network.util.a.b();
                ByteBuffer byteBufferJc = hVarB.Jc();
                try {
                    ByteBuffer byteBuffer = byteBufferJc;
                    x.j(element.b().peek(), byteBuffer);
                    if (this.f296329a.send(byteBuffer, b0.a(element.a())) == 0) {
                        ui.l.h(element.b(), 0L, 1, null);
                    }
                    Unit unit = Unit.f312394a;
                    hVarB.h8(byteBufferJc);
                } catch (Throwable th2) {
                    hVarB.h8(byteBufferJc);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a.C2318a.d(this.f296331c, null, 1, null);
            return kotlinx.coroutines.channels.t.f313893b.c(Unit.f312394a);
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f296331c, null, 1, null);
            throw th3;
        }
    }

    @Override // kotlinx.coroutines.channels.o0
    @c2
    public void n(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f296327d;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, handler)) {
            return;
        }
        if (this.onCloseHandler != x.f296353a) {
            x.i((Function1) this.onCloseHandler);
        } else {
            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, x.f296353a, x.f296354b)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            handler.invoke(this.closedCause);
        }
    }
}
