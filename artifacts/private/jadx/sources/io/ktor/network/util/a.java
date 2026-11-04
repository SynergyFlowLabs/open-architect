package io.ktor.network.util;

import io.ktor.utils.io.pool.f;
import io.ktor.utils.io.pool.h;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f296369a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f296370b = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final h<ByteBuffer> f296371c = new f(4096, 4096);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final h<ByteBuffer> f296372d = new f(2048, 65535);

    @NotNull
    public static final h<ByteBuffer> a() {
        return f296371c;
    }

    @NotNull
    public static final h<ByteBuffer> b() {
        return f296372d;
    }
}
