package io.ktor.network.sockets;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nServerSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSocketImpl.kt\nio/ktor/network/sockets/ServerSocketImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class g0 extends io.ktor.network.selector.i implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ServerSocketChannel f296221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.ktor.network.selector.j f296222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f296223f;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.ServerSocketImpl", f = "ServerSocketImpl.kt", i = {}, l = {41}, m = "acceptSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296224a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296226c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296224a = obj;
            this.f296226c |= Integer.MIN_VALUE;
            return g0.this.m(this);
        }
    }

    public g0(@NotNull ServerSocketChannel channel, @NotNull io.ktor.network.selector.j selector) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f296221d = channel;
        this.f296222e = selector;
        if (s().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
        this.f296223f = u2.c(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:19:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(kotlin.coroutines.d<? super io.ktor.network.sockets.h0> r6) {
        /*
            r5 = this;
            java.lang.String r4 = "Androeed.ru"
            boolean r0 = r6 instanceof io.ktor.network.sockets.g0.a
            if (r0 == 0) goto L17
            r0 = r6
            r0 = r6
            io.ktor.network.sockets.g0$a r0 = (io.ktor.network.sockets.g0.a) r0
            int r1 = r0.f296226c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f296226c = r1
            goto L1c
        L17:
            io.ktor.network.sockets.g0$a r0 = new io.ktor.network.sockets.g0$a
            r0.<init>(r6)
        L1c:
            java.lang.Object r6 = r0.f296224a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f296226c
            r4 = 7
            r3 = 1
            r4 = 7
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2f
            kotlin.ResultKt.m(r6)
            goto L51
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "/ rmv/tsebkolconei//oloteo/ iti/n ruheu mewafc/ / e"
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            r4 = 2
            throw r5
        L3a:
            r4 = 5
            kotlin.ResultKt.m(r6)
        L3e:
            r4 = 4
            io.ktor.network.selector.g r6 = io.ktor.network.selector.g.ACCEPT
            r5.W3(r6, r3)
            io.ktor.network.selector.j r2 = r5.f296222e
            r0.f296226c = r3
            java.lang.Object r6 = r2.i3(r5, r6, r0)
            r4 = 3
            if (r6 != r1) goto L51
            r4 = 2
            return r1
        L51:
            java.nio.channels.ServerSocketChannel r6 = r5.s()
            java.nio.channels.SocketChannel r6 = r6.accept()
            if (r6 == 0) goto L3e
            r4 = 3
            io.ktor.network.sockets.h0 r5 = r5.o(r6)
            r4 = 4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.g0.m(kotlin.coroutines.d):java.lang.Object");
    }

    private final h0 o(SocketChannel socketChannel) throws IOException {
        W3(io.ktor.network.selector.g.ACCEPT, false);
        socketChannel.configureBlocking(false);
        if (getLocalAddress() instanceof a0) {
            if (c0.b()) {
                socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new o0(socketChannel, this.f296222e, null, 4, null);
    }

    @Override // io.ktor.network.selector.i, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                s().close();
                this.f296222e.g3(this);
                b8().complete();
            } catch (Throwable th2) {
                this.f296222e.g3(this);
                throw th2;
            }
        } catch (Throwable th3) {
            b8().f(th3);
        }
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
        f0.a.a(this);
    }

    @Override // io.ktor.network.sockets.a
    @NotNull
    public i0 getLocalAddress() {
        SocketAddress localAddress = c0.b() ? s().getLocalAddress() : s().socket().getLocalSocketAddress();
        Intrinsics.checkNotNull(localAddress);
        return b0.b(localAddress);
    }

    @Override // io.ktor.network.sockets.f
    @Nullable
    public Object o8(@NotNull kotlin.coroutines.d<? super h0> dVar) throws IOException {
        SocketChannel socketChannelAccept = s().accept();
        return socketChannelAccept != null ? o(socketChannelAccept) : m(dVar);
    }

    @Override // io.ktor.network.selector.h
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ServerSocketChannel s() {
        return this.f296221d;
    }

    @NotNull
    public final io.ktor.network.selector.j t() {
        return this.f296222e;
    }

    @Override // io.ktor.network.sockets.d
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.a0 b8() {
        return this.f296223f;
    }
}
