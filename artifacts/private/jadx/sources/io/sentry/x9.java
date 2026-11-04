package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public enum x9 implements k2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(com.google.api.client.http.a0.f115563p),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(com.google.api.client.http.a0.f115563p),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements a2<x9> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x9 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            return x9.valueOf(y3Var.jc().toUpperCase(Locale.ROOT));
        }
    }

    static {
        int i10 = 7 & 6;
    }

    x9(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    @Nullable
    public static x9 fromApiNameSafely(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public static x9 fromHttpStatusCode(int i10) {
        for (x9 x9Var : values()) {
            if (x9Var.matches(i10)) {
                return x9Var;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.b(apiName());
    }

    @NotNull
    public static x9 fromHttpStatusCode(@Nullable Integer num, @NotNull x9 x9Var) {
        x9 x9VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : x9Var;
        return x9VarFromHttpStatusCode != null ? x9VarFromHttpStatusCode : x9Var;
    }

    x9(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
