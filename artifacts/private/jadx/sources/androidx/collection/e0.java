package androidx.collection;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final long f12191a;

    private /* synthetic */ e0(long j10) {
        this.f12191a = j10;
    }

    public static final /* synthetic */ e0 a(long j10) {
        return new e0(j10);
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int c(long j10) {
        return (int) (j10 & com.rabbitmq.client.k0.f265952a);
    }

    public static long d(int i10, int i11) {
        return e((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof e0) && j10 == ((e0) obj).l();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int i(long j10) {
        return (int) (j10 & com.rabbitmq.client.k0.f265952a);
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String k(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f12191a, obj);
    }

    public int hashCode() {
        return j(this.f12191a);
    }

    public final /* synthetic */ long l() {
        return this.f12191a;
    }

    @NotNull
    public String toString() {
        return k(this.f12191a);
    }
}
