package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InetSocketAddress f296206a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull InetSocketAddress address) {
        super(null);
        Intrinsics.checkNotNullParameter(address, "address");
        this.f296206a = address;
    }

    public static /* synthetic */ a0 e(a0 a0Var, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a0Var.g();
        }
        if ((i11 & 2) != 0) {
            i10 = a0Var.h();
        }
        return a0Var.d(str, i10);
    }

    @NotNull
    public final String b() {
        return g();
    }

    public final int c() {
        return h();
    }

    @NotNull
    public final a0 d(@NotNull String hostname, int i10) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return new a0(hostname, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.network.sockets.InetSocketAddress");
        return Intrinsics.areEqual(a(), ((a0) obj).a());
    }

    @Override // io.ktor.network.sockets.i0
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InetSocketAddress a() {
        return this.f296206a;
    }

    @NotNull
    public final String g() {
        String hostName = a().getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "getHostName(...)");
        return hostName;
    }

    public final int h() {
        return a().getPort();
    }

    public int hashCode() {
        return a().hashCode();
    }

    @NotNull
    public String toString() {
        String string = a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull String hostname, int i10) {
        this(new InetSocketAddress(hostname, i10));
        Intrinsics.checkNotNullParameter(hostname, "hostname");
    }
}
