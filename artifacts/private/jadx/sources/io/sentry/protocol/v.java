package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.e9;
import io.sentry.k2;
import io.sentry.util.q0;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f306474b = new v(io.sentry.util.h0.f306956b.replace("-", ""));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<String> f306475a;

    public static final class a implements a2<v> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            return new v(y3Var.jc());
        }
    }

    public v() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(v vVar, UUID uuid) {
        vVar.getClass();
        return vVar.d(q0.c(uuid));
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public String d(@NotNull String str) {
        return io.sentry.util.h0.h(str).replace("-", "");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            return this.f306475a.a().equals(((v) obj).f306475a.a());
        }
        return false;
    }

    public int hashCode() {
        return this.f306475a.a().hashCode();
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.b(toString());
    }

    public String toString() {
        return this.f306475a.a();
    }

    public v(@Nullable final UUID uuid) {
        if (uuid != null) {
            this.f306475a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.protocol.r
                @Override // io.sentry.util.s.a
                public final Object a() {
                    return v.a(this.f306469a, uuid);
                }
            });
        } else {
            this.f306475a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.protocol.s
                @Override // io.sentry.util.s.a
                public final Object a() {
                    return e9.a();
                }
            });
        }
    }

    public v(@NotNull String str) {
        final String strH = io.sentry.util.h0.h(str);
        if (strH.length() != 32 && strH.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strH.length() == 36) {
            this.f306475a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.s.a
                public final Object a() {
                    return this.f306471a.d(strH);
                }
            });
        } else {
            this.f306475a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.protocol.u
                @Override // io.sentry.util.s.a
                public final Object a() {
                    return v.b(strH);
                }
            });
        }
    }
}
