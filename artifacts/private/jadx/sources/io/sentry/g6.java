package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h6 f305494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Iterable<m7> f305495b;

    @lm.a.c
    public g6(@NotNull h6 h6Var, @NotNull Iterable<m7> iterable) {
        this.f305494a = (h6) io.sentry.util.y.c(h6Var, "SentryEnvelopeHeader is required.");
        this.f305495b = (Iterable) io.sentry.util.y.c(iterable, "SentryEnvelope items are required.");
    }

    @lm.a.c
    @NotNull
    public static g6 a(@NotNull n1 n1Var, @NotNull k4 k4Var, long j10, @Nullable io.sentry.protocol.p pVar) throws io.sentry.exception.c {
        io.sentry.util.y.c(n1Var, "Serializer is required.");
        io.sentry.util.y.c(k4Var, "Profiling trace data is required.");
        return new g6(new io.sentry.protocol.v(k4Var.Q()), pVar, m7.L(k4Var, j10, n1Var));
    }

    @lm.a.c
    @NotNull
    public static g6 b(@NotNull n1 n1Var, @NotNull z5 z5Var, @Nullable io.sentry.protocol.p pVar) throws IOException {
        io.sentry.util.y.c(n1Var, "Serializer is required.");
        io.sentry.util.y.c(z5Var, "item is required.");
        return new g6(z5Var.I(), pVar, m7.I(n1Var, z5Var));
    }

    @lm.a.c
    @NotNull
    public static g6 c(@NotNull n1 n1Var, @NotNull k9 k9Var, @Nullable io.sentry.protocol.p pVar) throws IOException {
        io.sentry.util.y.c(n1Var, "Serializer is required.");
        io.sentry.util.y.c(k9Var, "session is required.");
        return new g6((io.sentry.protocol.v) null, pVar, m7.N(n1Var, k9Var));
    }

    @lm.a.c
    @NotNull
    public h6 d() {
        return this.f305494a;
    }

    @lm.a.c
    @NotNull
    public Iterable<m7> e() {
        return this.f305495b;
    }

    @lm.a.c
    public g6(@Nullable io.sentry.protocol.v vVar, @Nullable io.sentry.protocol.p pVar, @NotNull Iterable<m7> iterable) {
        this.f305494a = new h6(vVar, pVar);
        this.f305495b = (Iterable) io.sentry.util.y.c(iterable, "SentryEnvelope items are required.");
    }

    @lm.a.c
    public g6(@Nullable io.sentry.protocol.v vVar, @Nullable io.sentry.protocol.p pVar, @NotNull m7 m7Var) {
        io.sentry.util.y.c(m7Var, "SentryEnvelopeItem is required.");
        this.f305494a = new h6(vVar, pVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(m7Var);
        this.f305495b = arrayList;
    }
}
