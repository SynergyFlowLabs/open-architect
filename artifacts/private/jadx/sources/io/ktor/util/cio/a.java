package io.ktor.util.cio;

import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f296519a = 4098;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f296520b = 2048;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.utils.io.pool.h<ByteBuffer> f296521c = new io.ktor.utils.io.pool.b(2048, 4098);

    @NotNull
    public static final io.ktor.utils.io.pool.h<ByteBuffer> a() {
        return f296521c;
    }
}
