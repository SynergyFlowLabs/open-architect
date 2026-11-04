package io.sentry;

import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f305868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private v9 f305869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private v9 f305870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Boolean f305871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d f305872e;

    public m4() {
        this(new io.sentry.protocol.v(), new v9(), null, null, null);
    }

    @NotNull
    public static m4 a(@NotNull String str, @NotNull String str2, @Nullable Double d10, @Nullable Double d11) {
        return new m4(new io.sentry.protocol.v(str), new v9(), new v9(str2), io.sentry.util.o0.h(null, null, d10, d11), null);
    }

    public static m4 b(@NotNull ILogger iLogger, @Nullable String str, @Nullable String str2) {
        return c(iLogger, str, Arrays.asList(str2));
    }

    @NotNull
    public static m4 c(@NotNull ILogger iLogger, @Nullable String str, @Nullable List<String> list) {
        if (str == null) {
            return new m4();
        }
        try {
            return d(new w8(str), d.j(list, iLogger), null);
        } catch (io.sentry.exception.b e10) {
            iLogger.b(y7.DEBUG, e10, "Failed to parse Sentry trace header: %s", e10.getMessage());
            return new m4();
        }
    }

    @NotNull
    public static m4 d(@NotNull w8 w8Var, @Nullable d dVar, @Nullable v9 v9Var) {
        if (v9Var == null) {
            v9Var = new v9();
        }
        return new m4(w8Var.c(), v9Var, w8Var.b(), dVar, w8Var.e());
    }

    @NotNull
    public d e() {
        return this.f305872e;
    }

    @Nullable
    public v9 f() {
        return this.f305870c;
    }

    @NotNull
    public Double g() {
        Double dQ = this.f305872e.q();
        return Double.valueOf(dQ == null ? 0.0d : dQ.doubleValue());
    }

    @NotNull
    public v9 h() {
        return this.f305869b;
    }

    @NotNull
    public io.sentry.protocol.v i() {
        return this.f305868a;
    }

    @Nullable
    public Boolean j() {
        return this.f305871d;
    }

    public void k(@Nullable v9 v9Var) {
        this.f305870c = v9Var;
    }

    public void l(@Nullable Boolean bool) {
        this.f305871d = bool;
    }

    public void m(@NotNull v9 v9Var) {
        this.f305869b = v9Var;
    }

    public void n(@NotNull io.sentry.protocol.v vVar) {
        this.f305868a = vVar;
    }

    @NotNull
    public p9 o() {
        p9 p9Var = new p9(this.f305868a, this.f305869b, "default", null, null);
        p9Var.u("auto");
        return p9Var;
    }

    @Nullable
    public da p() {
        return this.f305872e.V();
    }

    public m4(@NotNull m4 m4Var) {
        this(m4Var.i(), m4Var.h(), m4Var.f(), m4Var.e(), m4Var.j());
    }

    public m4(@NotNull io.sentry.protocol.v vVar, @NotNull v9 v9Var, @Nullable v9 v9Var2, @Nullable d dVar, @Nullable Boolean bool) {
        this.f305868a = vVar;
        this.f305869b = v9Var;
        this.f305870c = v9Var2;
        this.f305872e = io.sentry.util.o0.h(dVar, bool, null, null);
        this.f305871d = bool;
    }
}
