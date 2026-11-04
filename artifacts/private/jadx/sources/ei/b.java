package ei;

import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTimeoutExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeoutExceptions.kt\nio/ktor/client/network/sockets/TimeoutExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class b {
    @NotNull
    public static final SocketTimeoutException a(@NotNull String message, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(message);
        socketTimeoutException.initCause(th2);
        return socketTimeoutException;
    }

    public static /* synthetic */ SocketTimeoutException b(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return a(str, th2);
    }
}
