package com.planner5d.library.services.exceptions;

import android.content.Context;
import com.planner5d.library.api.e;
import com.planner5d.library.services.utility.i1;
import ij.a;
import ij.f;
import io.sentry.k4;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@f
public final class NetworkErrorUtility {

    @NotNull
    private final i1 internetStateMonitor;

    @a
    public NetworkErrorUtility(@NotNull i1 internetStateMonitor) {
        Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
        this.internetStateMonitor = internetStateMonitor;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf A[RETURN] */
    public final boolean isNetworkBehindGreatWall(@NotNull Context context, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!this.internetStateMonitor.b().getValue().booleanValue()) {
            return false;
        }
        if (!(throwable instanceof SocketException) && !(throwable instanceof SocketTimeoutException) && !(throwable instanceof UnknownHostException) && !(throwable instanceof SSLHandshakeException)) {
            String error = ErrorMessageException.getError(context, throwable);
            if (error == null) {
                return false;
            }
            String simpleName = SocketException.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (!StringsKt.V2(error, simpleName, false, 2, null)) {
                String simpleName2 = SocketTimeoutException.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                if (!StringsKt.V2(error, simpleName2, false, 2, null)) {
                    String simpleName3 = UnknownHostException.class.getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
                    if (!StringsKt.V2(error, simpleName3, false, 2, null)) {
                        String simpleName4 = SSLHandshakeException.class.getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
                        if (!StringsKt.V2(error, simpleName4, false, 2, null)) {
                            String simpleName5 = ConnectException.class.getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName5, "getSimpleName(...)");
                            if (StringsKt.V2(error, simpleName5, false, 2, null)) {
                                if (!StringsKt.V2(error, "ECONNREFUSED", false, 2, null)) {
                                    String lowerCase = error.toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                    if (!StringsKt.V2(lowerCase, "failed to connect", false, 2, null)) {
                                        if (!StringsKt.V2(error, "Network is unreachable", false, 2, null)) {
                                            return false;
                                        }
                                    }
                                }
                            } else if (!StringsKt.V2(error, "Network is unreachable", false, 2, null)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean isNetworkError(@NotNull Context context, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!isNetworkTimeout(context, throwable) && !isNetworkBehindGreatWall(context, throwable)) {
            e eVar = throwable instanceof e ? (e) throwable : null;
            if ((eVar != null ? eVar.a() : null) != e.b.NETWORK) {
                return false;
            }
        }
        return true;
    }

    public final boolean isNetworkTimeout(@NotNull Context context, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (th2 == null) {
            return false;
        }
        if (th2 instanceof SocketTimeoutException) {
            return true;
        }
        String error = ErrorMessageException.getError(context, th2);
        if (error != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = error.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.V2(lowerCase, k4.f305718l3, false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
