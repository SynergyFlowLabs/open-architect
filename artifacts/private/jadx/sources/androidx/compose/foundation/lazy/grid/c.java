package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.o2;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@o2
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16783a;

    private /* synthetic */ c(long j10) {
        this.f16783a = j10;
    }

    public static final /* synthetic */ c a(long j10) {
        return new c(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof c) && j10 == ((c) obj).h();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        return (int) j10;
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f16783a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f16783a;
    }

    public int hashCode() {
        return f(this.f16783a);
    }

    public String toString() {
        return g(this.f16783a);
    }
}
