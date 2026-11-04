package com.superwall.sdk.logger;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Logger implements Loggable {

    @NotNull
    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void debug$default(Logger logger, LogLevel logLevel, LogScope logScope, String str, Map map, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "";
        }
        logger.debug(logLevel, logScope, str, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : th2);
    }

    public final void debug(@NotNull LogLevel logLevel, @NotNull LogScope scope, @NotNull String message, @Nullable Map<String, ? extends Object> map, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(message, "message");
        Loggable.Companion.debug(logLevel, scope, message, map, th2);
    }

    public final boolean shouldPrint(@NotNull LogLevel logLevel, @NotNull LogScope scope) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return Loggable.Companion.shouldPrint(logLevel, scope);
    }
}
