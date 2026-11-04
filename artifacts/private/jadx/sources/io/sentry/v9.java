package io.sentry;

import java.io.IOException;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class v9 implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f307008b = new v9(io.sentry.util.h0.f306956b.replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<String> f307009a;

    public static final class a implements a2<v9> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v9 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            return new v9(y3Var.jc());
        }
    }

    public v9(@NotNull final String str) {
        Objects.requireNonNull(str, "value is required");
        this.f307009a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.u9
            @Override // io.sentry.util.s.a
            public final Object a() {
                return v9.a(str);
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i10 = 1 >> 1;
            return true;
        }
        if (obj == null || v9.class != obj.getClass()) {
            return false;
        }
        return this.f307009a.a().equals(((v9) obj).f307009a.a());
    }

    public int hashCode() {
        return this.f307009a.a().hashCode();
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.b(this.f307009a.a());
    }

    public String toString() {
        return this.f307009a.a();
    }

    public v9() {
        this.f307009a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.t9
            @Override // io.sentry.util.s.a
            public final Object a() {
                return e9.b();
            }
        });
    }
}
