package androidx.compose.ui.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nValueInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueInsets.android.kt\nandroidx/compose/ui/layout/ValueInsets\n*L\n1#1,67:1\n28#1,10:68\n*S KotlinDebug\n*F\n+ 1 ValueInsets.android.kt\nandroidx/compose/ui/layout/ValueInsets\n*L\n40#1:68,10\n*E\n"})
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39337a;

    private /* synthetic */ f3(long j10) {
        this.f39337a = j10;
    }

    public static final /* synthetic */ f3 a(long j10) {
        return new f3(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof f3) && j10 == ((f3) obj).l();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        return (int) (j10 & okhttp3.internal.ws.g.f334653t);
    }

    public static final int f(long j10) {
        return (int) ((j10 >>> 48) & okhttp3.internal.ws.g.f334653t);
    }

    public static final int h(long j10) {
        return (int) ((j10 >>> 16) & okhttp3.internal.ws.g.f334653t);
    }

    public static final int i(long j10) {
        return (int) ((j10 >>> 32) & okhttp3.internal.ws.g.f334653t);
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String k(long j10) {
        return "ValueInsets(" + ((int) ((j10 >>> 48) & okhttp3.internal.ws.g.f334653t)) + ", " + ((int) ((j10 >>> 32) & okhttp3.internal.ws.g.f334653t)) + ", " + ((int) ((j10 >>> 16) & okhttp3.internal.ws.g.f334653t)) + ", " + ((int) (j10 & okhttp3.internal.ws.g.f334653t)) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f39337a, obj);
    }

    public final long g() {
        return this.f39337a;
    }

    public int hashCode() {
        return j(this.f39337a);
    }

    public final /* synthetic */ long l() {
        return this.f39337a;
    }

    @NotNull
    public String toString() {
        return k(this.f39337a);
    }
}
