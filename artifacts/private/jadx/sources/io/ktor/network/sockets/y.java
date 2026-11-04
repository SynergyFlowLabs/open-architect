package io.ktor.network.sockets;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDatagramSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatagramSocketImpl.kt\nio/ktor/network/sockets/DatagramSocketImpl\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,106:1\n21#2,3:107\n21#2,3:110\n*S KotlinDebug\n*F\n+ 1 DatagramSocketImpl.kt\nio/ktor/network/sockets/DatagramSocketImpl\n*L\n83#1:107,3\n101#1:110,3\n*E\n"})
public final class y extends d0<DatagramChannel> implements g, o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final DatagramChannel f296355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.o0<q> f296356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.n0<q> f296357o;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", i = {0}, l = {90}, m = "receiveSuspend", n = {"buffer"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296360c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296362e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296360c = obj;
            this.f296362e |= Integer.MIN_VALUE;
            return y.this.j0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", i = {0, 1}, l = {52, 52}, m = "invokeSuspend", n = {"$this$produce", "$this$produce"}, s = {"L$0", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super q>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f296365c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = y.this.new b(dVar);
            bVar.f296365c = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0053  */
        /* JADX WARN: Code duplicated, block: B:19:0x0054  */
        /* JADX WARN: Code duplicated, block: B:23:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:16:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 6
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 0
                int r1 = r8.f296364b
                r7 = 5
                r2 = 2
                r3 = 7
                r3 = 1
                r7 = 4
                if (r1 == 0) goto L33
                if (r1 == r3) goto L27
                r7 = 2
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r8.f296365c
                kotlinx.coroutines.channels.l0 r1 = (kotlinx.coroutines.channels.l0) r1
                kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L6b
                r9 = r1
                r7 = 5
                goto L3d
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 0
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L27:
                java.lang.Object r1 = r8.f296363a
                kotlinx.coroutines.channels.o0 r1 = (kotlinx.coroutines.channels.o0) r1
                java.lang.Object r4 = r8.f296365c
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                goto L59
            L33:
                r7 = 0
                kotlin.ResultKt.m(r9)
                r7 = 5
                java.lang.Object r9 = r8.f296365c
                r7 = 7
                kotlinx.coroutines.channels.l0 r9 = (kotlinx.coroutines.channels.l0) r9
            L3d:
                r7 = 6
                kotlinx.coroutines.channels.o0 r1 = r9.s()     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r7 = 5
                io.ktor.network.sockets.y r4 = io.ktor.network.sockets.y.this     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r8.f296365c = r9     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r7 = 1
                r8.f296363a = r1     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r8.f296364b = r3     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                java.lang.Object r4 = io.ktor.network.sockets.y.I(r4, r8)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r7 = 5
                if (r4 != r0) goto L54
                goto L67
            L54:
                r6 = r4
                r6 = r4
                r4 = r9
                r4 = r9
                r9 = r6
            L59:
                r8.f296365c = r4     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r7 = 7
                r5 = 0
                r8.f296363a = r5     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                r8.f296364b = r2     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                java.lang.Object r9 = r1.G(r9, r8)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L6b
                if (r9 != r0) goto L68
            L67:
                return r0
            L68:
                r9 = r4
                r7 = 6
                goto L3d
            L6b:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.y.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.channels.l0<? super q> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull DatagramChannel channel, @NotNull io.ktor.network.selector.j selector) {
        super(channel, selector, io.ktor.network.util.a.b(), null, 8, null);
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f296355m = channel;
        this.f296356n = new u(s(), this);
        int i10 = 3 >> 0;
        this.f296357o = kotlinx.coroutines.channels.j0.h(this, l1.c(), 0, new b(null), 2, null);
    }

    private static /* synthetic */ void f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g0(kotlin.coroutines.d<? super q> dVar) {
        ByteBuffer byteBufferJc = io.ktor.network.util.a.b().Jc();
        try {
            SocketAddress socketAddressReceive = s().receive(byteBufferJc);
            if (socketAddressReceive == null) {
                return j0(byteBufferJc, dVar);
            }
            W3(io.ktor.network.selector.g.READ, false);
            byteBufferJc.flip();
            kotlinx.io.b bVar = new kotlinx.io.b();
            ui.i.a(bVar, byteBufferJc);
            q qVar = new q(bVar, b0.b(socketAddressReceive));
            io.ktor.network.util.a.b().h8(byteBufferJc);
            return qVar;
        } catch (Throwable th2) {
            io.ktor.network.util.a.b().h8(byteBufferJc);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:28:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j0(java.nio.ByteBuffer r6, kotlin.coroutines.d<? super io.ktor.network.sockets.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.network.sockets.y.a
            if (r0 == 0) goto L17
            r0 = r7
            r0 = r7
            r4 = 3
            io.ktor.network.sockets.y$a r0 = (io.ktor.network.sockets.y.a) r0
            int r1 = r0.f296362e
            r4 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r4 = 7
            r0.f296362e = r1
            goto L1d
        L17:
            io.ktor.network.sockets.y$a r0 = new io.ktor.network.sockets.y$a
            r4 = 4
            r0.<init>(r7)
        L1d:
            java.lang.Object r7 = r0.f296360c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f296362e
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L38
            r4 = 0
            java.lang.Object r5 = r0.f296359b
            io.ktor.network.sockets.y r5 = (io.ktor.network.sockets.y) r5
            r4 = 3
            java.lang.Object r6 = r0.f296358a
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            kotlin.ResultKt.m(r7)
            goto L5e
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r4 = 7
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 4
            r5.<init>(r6)
            throw r5
        L42:
            r4 = 5
            kotlin.ResultKt.m(r7)
        L46:
            io.ktor.network.selector.g r7 = io.ktor.network.selector.g.READ
            r5.W3(r7, r3)
            io.ktor.network.selector.j r2 = r5.H()
            r4 = 5
            r0.f296358a = r6
            r0.f296359b = r5
            r0.f296362e = r3
            java.lang.Object r7 = r2.i3(r5, r7, r0)
            if (r7 != r1) goto L5e
            r4 = 0
            return r1
        L5e:
            java.nio.channels.DatagramChannel r7 = r5.s()     // Catch: java.lang.Throwable -> L8d
            java.net.SocketAddress r7 = r7.receive(r6)     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            if (r7 != 0) goto L6a
            goto L46
        L6a:
            io.ktor.network.selector.g r0 = io.ktor.network.selector.g.READ
            r4 = 0
            r1 = 0
            r5.W3(r0, r1)
            r6.flip()
            kotlinx.io.b r5 = new kotlinx.io.b
            r5.<init>()
            ui.i.a(r5, r6)
            io.ktor.network.sockets.i0 r7 = io.ktor.network.sockets.b0.b(r7)
            io.ktor.network.sockets.q r0 = new io.ktor.network.sockets.q
            r0.<init>(r5, r7)
            io.ktor.utils.io.pool.h r5 = io.ktor.network.util.a.b()
            r5.h8(r6)
            return r0
        L8d:
            r5 = move-exception
            io.ktor.utils.io.pool.h r7 = io.ktor.network.util.a.b()
            r7.h8(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.y.j0(java.nio.ByteBuffer, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // io.ktor.network.sockets.d0, io.ktor.network.selector.h
    @NotNull
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public DatagramChannel s() {
        return this.f296355m;
    }

    @Override // io.ktor.network.sockets.s
    @NotNull
    public kotlinx.coroutines.channels.n0<q> a() {
        return this.f296357o;
    }

    @Override // io.ktor.network.sockets.z
    @NotNull
    public kotlinx.coroutines.channels.o0<q> b() {
        return this.f296356n;
    }

    @Override // io.ktor.network.sockets.m0, io.ktor.network.selector.i, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kotlinx.coroutines.channels.n0.a.b(this.f296357o, null, 1, null);
        super.close();
        kotlinx.coroutines.channels.o0.a.a(this.f296356n, null, 1, null);
    }

    @Override // io.ktor.network.sockets.z
    @Nullable
    public Object f(@NotNull q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return g.a.c(this, qVar, dVar);
    }

    @Override // io.ktor.network.sockets.a
    @NotNull
    public i0 getLocalAddress() {
        i0 i0VarB;
        SocketAddress localAddress = c0.b() ? s().getLocalAddress() : s().socket().getLocalSocketAddress();
        if (localAddress == null || (i0VarB = b0.b(localAddress)) == null) {
            throw new IllegalStateException("Channel is not yet bound");
        }
        return i0VarB;
    }

    @Override // io.ktor.network.sockets.b
    @NotNull
    public i0 getRemoteAddress() {
        i0 i0VarB;
        SocketAddress remoteAddress = c0.b() ? s().getRemoteAddress() : s().socket().getRemoteSocketAddress();
        if (remoteAddress == null || (i0VarB = b0.b(remoteAddress)) == null) {
            throw new IllegalStateException("Channel is not yet connected");
        }
        return i0VarB;
    }

    @Override // io.ktor.network.sockets.s
    @Nullable
    public Object j(@NotNull kotlin.coroutines.d<? super q> dVar) {
        return g.a.b(this, dVar);
    }
}
