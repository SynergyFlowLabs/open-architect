package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ji.e f296090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ji.e f296091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final ji.n f296092c;

    static {
        ji.e eVarP = ji.p.p(ji.p.o(ji.p.p(ji.p.o(ji.p.p(ji.p.o(ji.q.e(), "."), ji.q.e()), "."), ji.q.e()), "."), ji.q.e());
        f296090a = eVarP;
        ji.e eVarO = ji.p.o(ji.p.n("[", ji.p.c(ji.p.l(ji.q.f(), ":"))), "]");
        f296091b = eVarO;
        f296092c = io.ktor.http.parsing.regex.c.b(ji.p.m(eVarP, eVarO));
    }

    public static final boolean a(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return f296092c.a(host);
    }
}
