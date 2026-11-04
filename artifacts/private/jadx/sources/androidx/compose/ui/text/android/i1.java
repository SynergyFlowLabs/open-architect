package androidx.compose.ui.text.android;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1124:1\n28#2:1125\n33#2:1126\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n962#1:1125\n965#1:1126\n*E\n"})
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41404a;

    private /* synthetic */ i1(long j10) {
        this.f41404a = j10;
    }

    public static final /* synthetic */ i1 a(long j10) {
        return new i1(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof i1) && j10 == ((i1) obj).i();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        return (int) (j10 & com.rabbitmq.client.k0.f265952a);
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return "VerticalPaddings(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f41404a, obj);
    }

    public int hashCode() {
        return g(this.f41404a);
    }

    public final /* synthetic */ long i() {
        return this.f41404a;
    }

    public String toString() {
        return h(this.f41404a);
    }
}
