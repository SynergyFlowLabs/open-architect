package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<l> f334070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f334071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f334072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f334073d;

    public b(@NotNull List<l> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f334070a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f334070a.size();
        for (int i10 = this.f334071b; i10 < size; i10++) {
            if (this.f334070a.get(i10).h(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final l a(@NotNull SSLSocket sslSocket) throws IOException {
        l lVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f334071b;
        int size = this.f334070a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f334070a.get(i10);
            if (lVar.h(sslSocket)) {
                this.f334071b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f334072c = c(sslSocket);
            lVar.f(sslSocket, this.f334073d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f334073d);
        sb2.append(", modes=");
        sb2.append(this.f334070a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(@NotNull IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f334073d = true;
        if (!this.f334072c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
