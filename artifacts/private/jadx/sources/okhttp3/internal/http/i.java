package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.d0;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f334198a = new i();

    private i() {
    }

    private final boolean b(d0 d0Var, Proxy.Type type) {
        return !d0Var.l() && type == Proxy.Type.HTTP;
    }

    @NotNull
    public final String a(@NotNull d0 request, @NotNull Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m());
        sb2.append(' ');
        i iVar = f334198a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.q());
        } else {
            sb2.append(iVar.c(request.q()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String c(@NotNull v url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strX = url.x();
        String strZ = url.z();
        if (strZ == null) {
            return strX;
        }
        return strX + '?' + strZ;
    }
}
