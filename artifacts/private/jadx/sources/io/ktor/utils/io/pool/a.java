package io.ktor.utils.io.pool;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f297122a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f297123b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final h<byte[]> f297124c = new C2105a();

    /* JADX INFO: renamed from: io.ktor.utils.io.pool.a$a, reason: collision with other inner class name */
    public static final class C2105a extends d<byte[]> {
        C2105a() {
            super(128);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public byte[] d() {
            return new byte[4096];
        }
    }

    @NotNull
    public static final h<byte[]> a() {
        return f297124c;
    }
}
