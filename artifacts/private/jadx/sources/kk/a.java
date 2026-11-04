package kk;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.b;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.h;
import okhttp3.h0;
import okhttp3.o;
import okhttp3.q;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f312235d;

    /* JADX INFO: renamed from: kk.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2246a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312236a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f312236a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C2246a.f312236a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first((List) qVar.a(vVar.F()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // okhttp3.b
    @Nullable
    public d0 a(@Nullable h0 h0Var, @NotNull f0 response) throws IOException {
        Proxy proxy;
        q qVarN;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        okhttp3.a aVarD;
        Intrinsics.checkNotNullParameter(response, "response");
        List<h> listY = response.y();
        d0 d0VarX0 = response.x0();
        v vVarQ = d0VarX0.q();
        boolean z10 = response.E() == 407;
        if (h0Var == null || (proxy = h0Var.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listY) {
            if (StringsKt.N1(hi.a.f285797b, hVar.h(), true)) {
                if (h0Var == null || (aVarD = h0Var.d()) == null || (qVarN = aVarD.n()) == null) {
                    qVarN = this.f312235d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, vVarQ, qVarN), inetSocketAddress.getPort(), vVarQ.X(), hVar.g(), hVar.h(), vVarQ.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String strF = vVarQ.F();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strF, b(proxy, vVarQ, qVarN), vVarQ.N(), vVarQ.X(), hVar.g(), hVar.h(), vVarQ.a0(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return d0VarX0.n().n(str, o.b(userName, new String(password), hVar.f())).b();
                }
            }
        }
        return null;
    }

    public a(@NotNull q defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f312235d = defaultDns;
    }

    public /* synthetic */ a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f334750b : qVar);
    }
}
