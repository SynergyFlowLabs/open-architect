package io.ktor.http.cio.internals;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f295562a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f295563b = 2048;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.utils.io.pool.h<char[]> f295564c;

    public static final class a extends io.ktor.utils.io.pool.g<char[]> {
        a() {
        }

        @Override // io.ktor.utils.io.pool.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] Jc() {
            return new char[2048];
        }
    }

    public static final class b extends io.ktor.utils.io.pool.d<char[]> {
        b() {
            super(4096);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public char[] d() {
            return new char[2048];
        }
    }

    static {
        f295564c = e.a() ? new a() : new b();
    }

    @NotNull
    public static final io.ktor.utils.io.pool.h<char[]> a() {
        return f295564c;
    }
}
