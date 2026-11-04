package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13296a;

    private /* synthetic */ t2(long j10) {
        this.f13296a = j10;
    }

    public static final /* synthetic */ t2 a(long j10) {
        return new t2(j10);
    }

    public static long b(int i10, int i11) {
        return c(i10 * i11);
    }

    private static long c(long j10) {
        return j10;
    }

    public static /* synthetic */ long d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 2) != 0) {
            i11 = u2.f13317b.a();
        }
        return b(i10, i11);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof t2) && j10 == ((t2) obj).k();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return Math.abs((int) j10);
    }

    public static final int h(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            return u2.f13317b.b();
        }
        if (z10) {
            throw new kotlin.k0();
        }
        return u2.f13317b.a();
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        return "StartOffset(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f13296a, obj);
    }

    public int hashCode() {
        return i(this.f13296a);
    }

    public final /* synthetic */ long k() {
        return this.f13296a;
    }

    public String toString() {
        return j(this.f13296a);
    }
}
