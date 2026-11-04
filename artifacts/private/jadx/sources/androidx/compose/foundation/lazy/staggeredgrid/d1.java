package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1474:1\n1135#1:1478\n1132#1:1480\n80#2:1475\n85#2:1476\n90#2:1477\n90#2:1479\n85#2:1481\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n1138#1:1478\n1138#1:1480\n1129#1:1475\n1132#1:1476\n1135#1:1477\n1138#1:1479\n1138#1:1481\n*E\n"})
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17797a;

    private /* synthetic */ d1(long j10) {
        this.f17797a = j10;
    }

    public static final /* synthetic */ d1 a(long j10) {
        return new d1(j10);
    }

    public static long b(int i10, int i11) {
        return c((((long) (i11 + i10)) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
    }

    private static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof d1) && j10 == ((d1) obj).l();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & com.rabbitmq.client.k0.f265952a);
    }

    public static final int h(long j10) {
        return ((int) (com.rabbitmq.client.k0.f265952a & j10)) - ((int) (j10 >> 32));
    }

    public static final int i(long j10) {
        return (int) (j10 >> 32);
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static String k(long j10) {
        return "SpanRange(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f17797a, obj);
    }

    public final long g() {
        return this.f17797a;
    }

    public int hashCode() {
        return j(this.f17797a);
    }

    public final /* synthetic */ long l() {
        return this.f17797a;
    }

    public String toString() {
        return k(this.f17797a);
    }
}
