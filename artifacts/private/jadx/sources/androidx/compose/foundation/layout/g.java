package androidx.compose.foundation.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n53#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n686#1:709,3\n*E\n"})
final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f16025b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f16024a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final float[] f16026c = new float[101];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final float[] f16027d = new float[101];

    @oj.g
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n60#2:709\n70#2:711\n22#3:710\n22#3:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n698#1:709\n705#1:711\n698#1:710\n705#1:712\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f16028a;

        private /* synthetic */ a(long j10) {
            this.f16028a = j10;
        }

        public static final /* synthetic */ a a(long j10) {
            return new a(j10);
        }

        public static long b(long j10) {
            return j10;
        }

        public static boolean c(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).i();
        }

        public static final boolean d(long j10, long j11) {
            return j10 == j11;
        }

        public static final float e(long j10) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        public static final float f(long j10) {
            return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        }

        public static int g(long j10) {
            return Long.hashCode(j10);
        }

        public static String h(long j10) {
            return "FlingResult(packedValue=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f16028a, obj);
        }

        public int hashCode() {
            return g(this.f16028a);
        }

        public final /* synthetic */ long i() {
            return this.f16028a;
        }

        public String toString() {
            return h(this.f16028a);
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20 = 0.0f;
        int i10 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i10 >= 100) {
                f16027d[100] = 1.0f;
                f16026c[100] = 1.0f;
                return;
            }
            float f23 = i10 / 100;
            float f24 = 1.0f;
            while (true) {
                f10 = ((f24 - f20) / 2.0f) + f20;
                f11 = f22 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f25 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                f14 = f22;
                f15 = f23;
                if (Math.abs(f25 - f23) < 1.0E-5d) {
                    break;
                }
                if (f25 > f15) {
                    f24 = f10;
                } else {
                    f20 = f10;
                }
                f22 = f14;
                f23 = f15;
            }
            f16026c[i10] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f26 = f14;
            while (true) {
                f16 = ((f26 - f21) / 2.0f) + f21;
                f17 = f14 - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f27 = (((f17 * 0.5f) + f16) * f18) + f19;
                if (Math.abs(f27 - f15) >= 1.0E-5d) {
                    if (f27 > f15) {
                        f26 = f16;
                    } else {
                        f21 = f16;
                    }
                }
            }
            f16027d[i10] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
            i10++;
        }
    }

    private g() {
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    public final long b(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f16026c;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f16 + ((f10 - f14) * f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return a.b((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & com.rabbitmq.client.k0.f265952a));
    }
}
