package io.ktor.network.sockets;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h0 f296301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.h f296302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.p f296303c;

    public p(@NotNull h0 socket, @NotNull io.ktor.utils.io.h input, @NotNull io.ktor.utils.io.p output) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        this.f296301a = socket;
        this.f296302b = input;
        this.f296303c = output;
    }

    @NotNull
    public final io.ktor.utils.io.h a() {
        return this.f296302b;
    }

    @NotNull
    public final io.ktor.utils.io.p b() {
        return this.f296303c;
    }

    @NotNull
    public final h0 c() {
        return this.f296301a;
    }
}
