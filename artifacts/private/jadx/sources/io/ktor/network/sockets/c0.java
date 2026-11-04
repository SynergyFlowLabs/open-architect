package io.ktor.network.sockets;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nJavaSocketOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaSocketOptions.kt\nio/ktor/network/sockets/JavaSocketOptionsKt\n+ 2 TypeOfService.kt\nio/ktor/network/sockets/TypeOfService\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n30#2:141\n30#2:142\n30#2:144\n30#2:145\n1#3:143\n*S KotlinDebug\n*F\n+ 1 JavaSocketOptions.kt\nio/ktor/network/sockets/JavaSocketOptionsKt\n*L\n28#1:141\n30#1:142\n98#1:144\n100#1:145\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f296214a;

    static {
        boolean z10;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f296214a = z10;
    }

    public static final void a(@NotNull SelectableChannel selectableChannel, @NotNull p0 options) throws IllegalAccessException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(selectableChannel, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        if (selectableChannel instanceof SocketChannel) {
            if (!a1.j(options.f(), a1.f296207b.e())) {
                if (f296214a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.IP_TOS, Integer.valueOf(options.f() & 255));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTrafficClass(options.f() & 255);
                }
            }
            if (options.d()) {
                if (f296214a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.e()) {
                r0.f296321a.c((SocketChannel) selectableChannel);
            }
            if (options instanceof p0.d) {
                p0.d dVar = (p0.d) options;
                Integer numValueOf = Integer.valueOf(dVar.m());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (f296214a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_RCVBUF, Integer.valueOf(iIntValue));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue);
                    }
                }
                Integer numValueOf2 = Integer.valueOf(dVar.n());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int iIntValue2 = numValueOf2.intValue();
                    if (f296214a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_SNDBUF, Integer.valueOf(iIntValue2));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSendBufferSize(iIntValue2);
                    }
                }
            }
            if (options instanceof p0.e) {
                p0.e eVar = (p0.e) options;
                Integer numValueOf3 = Integer.valueOf(eVar.u());
                if (numValueOf3.intValue() < 0) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    int iIntValue3 = numValueOf3.intValue();
                    if (f296214a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_LINGER, Integer.valueOf(iIntValue3));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSoLinger(true, iIntValue3);
                    }
                }
                Boolean boolT = eVar.t();
                if (boolT != null) {
                    boolean zBooleanValue = boolT.booleanValue();
                    if (f296214a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_KEEPALIVE, boolT);
                    } else {
                        ((SocketChannel) selectableChannel).socket().setKeepAlive(zBooleanValue);
                    }
                }
                if (f296214a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.valueOf(eVar.v()));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTcpNoDelay(eVar.v());
                }
            }
        }
        if (selectableChannel instanceof ServerSocketChannel) {
            if (options.d()) {
                if (f296214a) {
                    ((ServerSocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.e()) {
                r0.f296321a.b((ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof DatagramChannel) {
            if (!a1.j(options.f(), a1.f296207b.e())) {
                if (f296214a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.IP_TOS, Integer.valueOf(options.f() & 255));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setTrafficClass(options.f() & 255);
                }
            }
            if (options.d()) {
                if (f296214a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.e()) {
                r0.f296321a.a((DatagramChannel) selectableChannel);
            }
            if (options instanceof p0.f) {
                if (f296214a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_BROADCAST, Boolean.valueOf(((p0.f) options).t()));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setBroadcast(((p0.f) options).t());
                }
            }
            if (options instanceof p0.d) {
                p0.d dVar2 = (p0.d) options;
                Integer numValueOf4 = Integer.valueOf(dVar2.m());
                if (numValueOf4.intValue() <= 0) {
                    numValueOf4 = null;
                }
                if (numValueOf4 != null) {
                    int iIntValue4 = numValueOf4.intValue();
                    if (f296214a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_RCVBUF, Integer.valueOf(iIntValue4));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue4);
                    }
                }
                Integer numValueOf5 = Integer.valueOf(dVar2.n());
                Integer num = numValueOf5.intValue() > 0 ? numValueOf5 : null;
                if (num != null) {
                    int iIntValue5 = num.intValue();
                    if (f296214a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_SNDBUF, Integer.valueOf(iIntValue5));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setSendBufferSize(iIntValue5);
                    }
                }
            }
        }
    }

    public static final boolean b() {
        return f296214a;
    }

    public static final void c(@NotNull SelectableChannel selectableChannel) throws IOException {
        Intrinsics.checkNotNullParameter(selectableChannel, "<this>");
        selectableChannel.configureBlocking(false);
    }
}
