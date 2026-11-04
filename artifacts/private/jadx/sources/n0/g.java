package n0;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,285:1\n65#1:290\n69#1:293\n65#1:343\n69#1:346\n60#2:286\n70#2:288\n60#2:291\n70#2:294\n53#2,3:296\n60#2:299\n70#2:301\n60#2:302\n70#2:304\n60#2:306\n70#2:308\n60#2:310\n70#2:312\n53#2,3:314\n60#2:317\n70#2:319\n53#2,3:321\n60#2:324\n70#2:326\n53#2,3:327\n60#2:330\n70#2:332\n53#2,3:333\n60#2:336\n70#2:338\n53#2,3:339\n60#2:344\n70#2:347\n22#3:287\n22#3:289\n22#3:292\n22#3:295\n22#3:300\n22#3:303\n22#3:305\n22#3:307\n22#3:309\n22#3:311\n22#3:313\n22#3:318\n22#3:320\n22#3:325\n22#3:331\n22#3:337\n22#3:345\n273#4:342\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n71#1:290\n73#1:293\n227#1:343\n227#1:346\n65#1:286\n69#1:288\n71#1:291\n73#1:294\n77#1:296,3\n76#1:299\n76#1:301\n123#1:302\n124#1:304\n135#1:306\n136#1:308\n164#1:310\n165#1:312\n163#1:314,3\n180#1:317\n181#1:319\n179#1:321,3\n195#1:324\n195#1:326\n195#1:327,3\n208#1:330\n208#1:332\n208#1:333,3\n221#1:336\n221#1:338\n221#1:339,3\n227#1:344\n227#1:347\n65#1:287\n69#1:289\n71#1:292\n73#1:295\n76#1:300\n123#1:303\n124#1:305\n135#1:307\n136#1:309\n164#1:311\n165#1:313\n180#1:318\n181#1:320\n195#1:325\n208#1:331\n221#1:337\n227#1:345\n226#1:342\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f332700b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f332701c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f332702d = g(d.f332688c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f332703e = g(d.f332689d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f332704a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        public final long a() {
            return g.f332702d;
        }

        public final long c() {
            return g.f332703e;
        }

        public final long e() {
            return g.f332701c;
        }

        private a() {
        }
    }

    private /* synthetic */ g(long j10) {
        this.f332704a = j10;
    }

    @k7
    public static final long A(long j10) {
        return g(j10 ^ (-9223372034707292160L));
    }

    public static final /* synthetic */ g d(long j10) {
        return new g(j10);
    }

    @k7
    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static long g(long j10) {
        return j10;
    }

    public static final long h(long j10, float f10, float f11) {
        return g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public static /* synthetic */ long i(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (k0.f265952a & j10));
        }
        return h(j10, f10, f11);
    }

    @k7
    public static final long j(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) / f10;
        return g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof g) && j10 == ((g) obj).B();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    @k7
    public static final float m(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    @k7
    public static final float n(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    @k7
    public static /* synthetic */ void p() {
    }

    public static final float q(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static /* synthetic */ void r() {
    }

    public static final float s(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static int t(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final boolean u(long j10) {
        return (((j10 & 9223372034707292159L) + d.f332694i) & (-9223372034707292160L)) == 0;
    }

    @k7
    public static final long v(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) - Float.intBitsToFloat((int) (j11 & k0.f265952a));
        return g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long w(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) + Float.intBitsToFloat((int) (j11 & k0.f265952a));
        return g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long x(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) % f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) % f10;
        return g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long y(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) * f10;
        return g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @NotNull
    public static String z(long j10) {
        if ((9223372034707292159L & j10) == d.f332689d) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + c.a(Float.intBitsToFloat((int) (j10 & k0.f265952a)), 1) + ')';
    }

    public final /* synthetic */ long B() {
        return this.f332704a;
    }

    public boolean equals(Object obj) {
        return k(this.f332704a, obj);
    }

    public int hashCode() {
        return t(this.f332704a);
    }

    public final long o() {
        return this.f332704a;
    }

    @NotNull
    public String toString() {
        return z(this.f332704a);
    }
}
