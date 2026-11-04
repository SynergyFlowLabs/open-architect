package androidx.collection;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,84:1\n51#1:92\n55#1:94\n22#2,3:85\n22#3:88\n22#3:89\n22#3:90\n22#3:91\n22#3:93\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n82#1:92\n82#1:94\n47#1:85,3\n51#1:88\n55#1:89\n67#1:90\n80#1:91\n82#1:93\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final long f12409a;

    private /* synthetic */ o(long j10) {
        this.f12409a = j10;
    }

    public static final /* synthetic */ o a(long j10) {
        return new o(j10);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    public static long d(float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof o) && j10 == ((o) obj).l();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String k(long j10) {
        return '(' + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f12409a, obj);
    }

    public int hashCode() {
        return j(this.f12409a);
    }

    public final /* synthetic */ long l() {
        return this.f12409a;
    }

    @NotNull
    public String toString() {
        return k(this.f12409a);
    }
}
