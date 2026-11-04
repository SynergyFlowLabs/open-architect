package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,407:1\n60#2:408\n22#3:409\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n*L\n370#1:408\n370#1:409\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39982a;

    private /* synthetic */ r(long j10) {
        this.f39982a = j10;
    }

    public static final /* synthetic */ r a(long j10) {
        return new r(j10);
    }

    public static final int b(long j10, long j11) {
        boolean zJ = j(j10);
        if (zJ != j(j11)) {
            return zJ ? -1 : 1;
        }
        int iSignum = (int) Math.signum(f(j10) - f(j11));
        if (Math.min(f(j10), f(j11)) >= 0.0f && i(j10) != i(j11)) {
            return i(j10) ? -1 : 1;
        }
        return iSignum;
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).l();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean i(long j10) {
        return (j10 & 2) != 0;
    }

    public static final boolean j(long j10) {
        if ((j10 & 1) == 0) {
            return false;
        }
        int i10 = 1 >> 1;
        return true;
    }

    public static String k(long j10) {
        return "DistanceAndFlags(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f39982a, obj);
    }

    public final long g() {
        return this.f39982a;
    }

    public int hashCode() {
        return h(this.f39982a);
    }

    public final /* synthetic */ long l() {
        return this.f39982a;
    }

    public String toString() {
        return k(this.f39982a);
    }
}
