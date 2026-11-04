package com.segment.analytics.kotlin.core;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HttpURLConnection f266822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final InputStream f266823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final OutputStream f266824c;

    public h(@NotNull HttpURLConnection connection, @Nullable InputStream inputStream, @Nullable OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f266822a = connection;
        this.f266823b = inputStream;
        this.f266824c = outputStream;
    }

    @NotNull
    public final HttpURLConnection a() {
        return this.f266822a;
    }

    @Nullable
    public final InputStream b() {
        return this.f266823b;
    }

    @Nullable
    public final OutputStream c() {
        return this.f266824c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f266822a.disconnect();
    }
}
