package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,74:1\n60#2:75\n70#2:77\n22#3:76\n22#3:78\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n42#1:75\n50#1:77\n42#1:76\n50#1:78\n*E\n"})
public final class z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38723b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f38724c = a4.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38725a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return z3.f38724c;
        }

        private a() {
        }
    }

    private /* synthetic */ z3(long j10) {
        this.f38725a = j10;
    }

    public static final /* synthetic */ z3 b(long j10) {
        return new z3(j10);
    }

    @k7
    public static final float c(long j10) {
        return k(j10);
    }

    @k7
    public static final float d(long j10) {
        return l(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return a4.a(f10, f11);
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = k(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = l(j10);
        }
        return f(j10, f10, f11);
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof z3) && j10 == ((z3) obj).o();
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    @kotlin.a1
    public static /* synthetic */ void j() {
    }

    public static final float k(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float l(long j10) {
        return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    public static int m(long j10) {
        return Long.hashCode(j10);
    }

    public static String n(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f38725a, obj);
    }

    public int hashCode() {
        return m(this.f38725a);
    }

    public final /* synthetic */ long o() {
        return this.f38725a;
    }

    public String toString() {
        return n(this.f38725a);
    }
}
