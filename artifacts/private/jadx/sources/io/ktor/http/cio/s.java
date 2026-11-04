package io.ktor.http.cio;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f295617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.cio.internals.d f295618b;

    public s(@NotNull q headers, @NotNull io.ktor.http.cio.internals.d builder) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f295617a = headers;
        this.f295618b = builder;
    }

    @NotNull
    public final q a() {
        return this.f295617a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    public final void release() {
        this.f295618b.p();
        this.f295617a.p();
    }
}
