package okio;

import io.sentry.k4;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class a1 extends j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Socket f334858u;

    public a1(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f334858u = socket;
    }

    @Override // okio.j
    @NotNull
    protected IOException C(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(k4.f305718l3);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.j
    protected void G() {
        try {
            this.f334858u.close();
        } catch (AssertionError e10) {
            if (!l0.l(e10)) {
                throw e10;
            }
            m0.f335045a.log(Level.WARNING, "Failed to close timed out socket " + this.f334858u, (Throwable) e10);
        } catch (Exception e11) {
            m0.f335045a.log(Level.WARNING, "Failed to close timed out socket " + this.f334858u, (Throwable) e11);
        }
    }
}
