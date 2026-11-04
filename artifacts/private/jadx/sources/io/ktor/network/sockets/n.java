package io.ktor.network.sockets;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolFamily;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nConnectUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectUtilsJvm.kt\nio/ktor/network/sockets/ConnectUtilsJvmKt\n+ 2 SelectorManager.kt\nio/ktor/network/selector/SelectorManagerKt\n*L\n1#1,64:1\n61#2,8:65\n61#2,8:73\n*S KotlinDebug\n*F\n+ 1 ConnectUtilsJvm.kt\nio/ktor/network/sockets/ConnectUtilsJvmKt\n*L\n16#1:65,8\n29#1:73,8\n*E\n"})
public final class n {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", i = {0}, l = {21}, m = "tcpConnect", n = {"result$iv"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296294d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296293c = obj;
            this.f296294d |= Integer.MIN_VALUE;
            return n.d(null, null, null, this);
        }
    }

    public static final ServerSocketChannel a(@NotNull SelectorProvider selectorProvider, @Nullable i0 i0Var) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(selectorProvider, "<this>");
        if (i0Var != null && !(i0Var instanceof a0)) {
            if (!(i0Var instanceof g1)) {
                throw new kotlin.k0();
            }
            Object objInvoke = SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.nio.channels.ServerSocketChannel");
            return (ServerSocketChannel) objInvoke;
        }
        return selectorProvider.openServerSocketChannel();
    }

    public static final SocketChannel b(@NotNull SelectorProvider selectorProvider, @NotNull i0 address) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(selectorProvider, "<this>");
        Intrinsics.checkNotNullParameter(address, "address");
        if (address instanceof a0) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof g1)) {
            throw new kotlin.k0();
        }
        Object objInvoke = SelectorProvider.class.getMethod("openSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (SocketChannel) objInvoke;
    }

    @Nullable
    public static final Object c(@NotNull io.ktor.network.selector.j jVar, @Nullable i0 i0Var, @NotNull p0.a aVar, @NotNull kotlin.coroutines.d<? super f0> dVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ServerSocketChannel serverSocketChannelA = a(jVar.u0(), i0Var);
        try {
            if (i0Var instanceof a0) {
                Intrinsics.checkNotNull(serverSocketChannelA);
                c0.a(serverSocketChannelA, aVar);
            }
            Intrinsics.checkNotNull(serverSocketChannelA);
            c0.c(serverSocketChannelA);
            g0 g0Var = new g0(serverSocketChannelA, jVar);
            if (c0.b()) {
                g0Var.s().bind(i0Var != null ? b0.a(i0Var) : null, aVar.m());
                return g0Var;
            }
            g0Var.s().socket().bind(i0Var != null ? b0.a(i0Var) : null, aVar.m());
            return g0Var;
        } catch (Throwable th2) {
            serverSocketChannelA.close();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object d(@NotNull io.ktor.network.selector.j jVar, @NotNull i0 i0Var, @NotNull p0.e eVar, @NotNull kotlin.coroutines.d<? super h0> dVar) throws Throwable {
        a aVar;
        Closeable closeable;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f296294d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f296294d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f296293c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f296294d;
        if (i11 == 0) {
            ResultKt.m(obj);
            SocketChannel socketChannelB = b(jVar.u0(), i0Var);
            try {
                if (i0Var instanceof a0) {
                    Intrinsics.checkNotNull(socketChannelB);
                    c0.a(socketChannelB, eVar);
                }
                Intrinsics.checkNotNull(socketChannelB);
                c0.c(socketChannelB);
                o0 o0Var = new o0(socketChannelB, jVar, eVar);
                SocketAddress socketAddressA = b0.a(i0Var);
                aVar.f296291a = socketChannelB;
                aVar.f296292b = o0Var;
                aVar.f296294d = 1;
                return o0Var.I(socketAddressA, aVar) == objL ? objL : o0Var;
            } catch (Throwable th2) {
                th = th2;
                closeable = socketChannelB;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0 o0Var2 = (o0) aVar.f296292b;
            closeable = (Closeable) aVar.f296291a;
            try {
                ResultKt.m(obj);
                return o0Var2;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        closeable.close();
        throw th;
    }
}
