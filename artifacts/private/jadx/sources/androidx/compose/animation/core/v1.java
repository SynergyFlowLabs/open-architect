package androidx.compose.animation.core;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,152:1\n60#2:153\n70#2:155\n22#3:154\n22#3:156\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n32#1:153\n35#1:155\n32#1:154\n35#1:156\n*E\n"})
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13328a;

    private /* synthetic */ v1(long j10) {
        this.f13328a = j10;
    }

    public static final /* synthetic */ v1 a(long j10) {
        return new v1(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof v1) && j10 == ((v1) obj).j();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return "Motion(packedValue=" + j10 + ')';
    }

    public final long e() {
        return this.f13328a;
    }

    public boolean equals(Object obj) {
        return c(this.f13328a, obj);
    }

    public int hashCode() {
        return h(this.f13328a);
    }

    public final /* synthetic */ long j() {
        return this.f13328a;
    }

    public String toString() {
        return i(this.f13328a);
    }
}
