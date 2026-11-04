package io.ktor.network.sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketImpl.kt\nio/ktor/network/sockets/SocketImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class o0<S extends SocketChannel> extends d0<S> implements h0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final S f296297m;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", i = {}, l = {47, 65}, m = "connect$ktor_network", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0<S> f296299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296300c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o0<? extends S> o0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f296299b = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296298a = obj;
            this.f296300c |= Integer.MIN_VALUE;
            int i10 = 5 << 0;
            return this.f296299b.I(null, this);
        }
    }

    public /* synthetic */ o0(SocketChannel socketChannel, io.ktor.network.selector.j jVar, p0.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(socketChannel, jVar, (i10 & 4) != 0 ? null : eVar);
    }

    private final boolean X() {
        String hostAddress;
        InetAddress address;
        InetAddress address2;
        String hostAddress2;
        InetAddress address3;
        SocketAddress localAddress = c0.b() ? s().getLocalAddress() : s().socket().getLocalSocketAddress();
        SocketAddress remoteAddress = c0.b() ? s().getRemoteAddress() : s().socket().getRemoteSocketAddress();
        if (localAddress == null || remoteAddress == null) {
            throw new IllegalStateException("localAddress and remoteAddress should not be null.");
        }
        InetSocketAddress inetSocketAddress = localAddress instanceof InetSocketAddress ? (InetSocketAddress) localAddress : null;
        InetSocketAddress inetSocketAddress2 = remoteAddress instanceof InetSocketAddress ? (InetSocketAddress) remoteAddress : null;
        if (inetSocketAddress == null && inetSocketAddress2 == null) {
            return false;
        }
        String str = "";
        if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (hostAddress = address3.getHostAddress()) == null) {
            hostAddress = "";
        }
        if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress2 = address2.getHostAddress()) != null) {
            str = hostAddress2;
        }
        return Intrinsics.areEqual(inetSocketAddress != null ? Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? Integer.valueOf(inetSocketAddress2.getPort()) : null) && (((inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress()) || Intrinsics.areEqual(hostAddress, str));
    }

    private final void f0(boolean z10) {
        W3(io.ktor.network.selector.g.CONNECT, z10);
    }

    static /* synthetic */ void g0(o0 o0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        o0Var.f0(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object I(@NotNull SocketAddress socketAddress, @NotNull kotlin.coroutines.d<? super h0> dVar) throws IOException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f296300c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f296300c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f296298a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f296300c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (s().connect(socketAddress)) {
                return this;
            }
            f0(true);
            io.ktor.network.selector.j jVarH = H();
            io.ktor.network.selector.g gVar = io.ktor.network.selector.g.CONNECT;
            aVar.f296300c = 1;
            if (jVarH.i3(this, gVar, aVar) != objL) {
            }
            return objL;
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        while (true) {
            if (!s().finishConnect()) {
                f0(true);
                io.ktor.network.selector.j jVarH2 = H();
                io.ktor.network.selector.g gVar2 = io.ktor.network.selector.g.CONNECT;
                aVar.f296300c = 2;
                if (jVarH2.i3(this, gVar2, aVar) == objL) {
                    break;
                }
            } else {
                if (!X()) {
                    f0(false);
                    return this;
                }
                if (c0.b()) {
                    s().close();
                } else {
                    s().socket().close();
                }
            }
        }
        return objL;
    }

    @Override // io.ktor.network.sockets.d0, io.ktor.network.selector.h
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public S s() {
        return this.f296297m;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull S channel, @NotNull io.ktor.network.selector.j selector, @Nullable p0.e eVar) {
        super(channel, selector, null, eVar);
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f296297m = channel;
        if (s().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }
}
