package io.ktor.client.engine;

import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f294353a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f294353a = iArr;
        }
    }

    @NotNull
    public static final s a(@NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(proxy, "<this>");
        Proxy.Type type = proxy.type();
        int i10 = type == null ? -1 : a.f294353a[type.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? s.UNKNOWN : s.HTTP;
        }
        return s.SOCKS;
    }

    @NotNull
    public static final SocketAddress b(@NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(proxy, "<this>");
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNullExpressionValue(socketAddressAddress, "address(...)");
        return socketAddressAddress;
    }
}
