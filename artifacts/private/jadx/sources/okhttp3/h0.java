package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f333859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Proxy f333860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InetSocketAddress f333861c;

    public h0(@NotNull a address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f333859a = address;
        this.f333860b = proxy;
        this.f333861c = socketAddress;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "address", imports = {}))
    @oj.i(name = "-deprecated_address")
    @NotNull
    public final a a() {
        return this.f333859a;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @oj.i(name = "-deprecated_proxy")
    @NotNull
    public final Proxy b() {
        return this.f333860b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketAddress", imports = {}))
    @oj.i(name = "-deprecated_socketAddress")
    @NotNull
    public final InetSocketAddress c() {
        return this.f333861c;
    }

    @oj.i(name = "address")
    @NotNull
    public final a d() {
        return this.f333859a;
    }

    @oj.i(name = "proxy")
    @NotNull
    public final Proxy e() {
        return this.f333860b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (Intrinsics.areEqual(h0Var.f333859a, this.f333859a) && Intrinsics.areEqual(h0Var.f333860b, this.f333860b) && Intrinsics.areEqual(h0Var.f333861c, this.f333861c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f333859a.v() != null && this.f333860b.type() == Proxy.Type.HTTP;
    }

    @oj.i(name = "socketAddress")
    @NotNull
    public final InetSocketAddress g() {
        return this.f333861c;
    }

    public int hashCode() {
        return ((((527 + this.f333859a.hashCode()) * 31) + this.f333860b.hashCode()) * 31) + this.f333861c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Route{" + this.f333861c + AbstractJsonLexerKt.END_OBJ;
    }
}
