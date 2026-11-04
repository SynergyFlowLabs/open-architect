package n0;

import androidx.collection.g3;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,187:1\n57#1:192\n61#1:195\n57#1:205\n61#1:208\n57#1:229\n61#1:232\n60#2:188\n70#2:190\n60#2:193\n70#2:196\n53#2,3:198\n60#2:201\n70#2:203\n60#2:206\n70#2:209\n60#2:210\n70#2:212\n53#2,3:213\n60#2:216\n70#2:218\n53#2,3:219\n65#2:222\n75#2:224\n65#2:225\n75#2:227\n60#2:230\n70#2:233\n22#3:189\n22#3:191\n22#3:194\n22#3:197\n22#3:202\n22#3:207\n22#3:211\n22#3:217\n22#3:223\n22#3:226\n22#3:231\n141#4:204\n136#4:228\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n63#1:192\n65#1:195\n90#1:205\n90#1:208\n125#1:229\n125#1:232\n57#1:188\n61#1:190\n63#1:193\n65#1:196\n69#1:198,3\n68#1:201\n68#1:203\n90#1:206\n90#1:209\n101#1:210\n101#1:212\n101#1:213,3\n111#1:216\n111#1:218\n111#1:219,3\n116#1:222\n116#1:224\n121#1:225\n121#1:227\n125#1:230\n125#1:233\n57#1:189\n61#1:191\n63#1:194\n65#1:197\n68#1:202\n90#1:207\n101#1:211\n111#1:217\n116#1:223\n121#1:226\n125#1:231\n90#1:204\n124#1:228\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f332724b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f332725c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f332726d = f(d.f332689d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f332727a;

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

        public final long a() {
            return n.f332726d;
        }

        public final long c() {
            return n.f332725c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(long j10) {
        this.f332727a = j10;
    }

    public static final /* synthetic */ n c(long j10) {
        return new n(j10);
    }

    @k7
    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static long f(long j10) {
        return j10;
    }

    public static final long g(long j10, float f10, float f11) {
        return f((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public static /* synthetic */ long h(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (k0.f265952a & j10));
        }
        return g(j10, f10, f11);
    }

    @k7
    public static final long i(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) / f10;
        return f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    public static boolean j(long j10, Object obj) {
        if ((obj instanceof n) && j10 == ((n) obj).y()) {
            return true;
        }
        return false;
    }

    public static final boolean k(long j10, long j11) {
        return j10 == j11;
    }

    @k7
    public static /* synthetic */ void l() {
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    @k7
    public static /* synthetic */ void n() {
    }

    public static final float o(long j10) {
        return Math.max(Float.intBitsToFloat((int) ((j10 >> 32) & g3.f12256c)), Float.intBitsToFloat((int) (j10 & g3.f12256c)));
    }

    @k7
    public static /* synthetic */ void p() {
    }

    public static final float q(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & g3.f12256c)), Float.intBitsToFloat((int) (j10 & g3.f12256c)));
    }

    @k7
    public static /* synthetic */ void s() {
    }

    public static final float t(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int u(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final boolean v(long j10) {
        return (j10 == d.f332689d) | (Float.intBitsToFloat((int) (j10 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j10 & k0.f265952a)) <= 0.0f);
    }

    @k7
    public static final long w(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) * f10;
        return f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @NotNull
    public static String x(long j10) {
        if (j10 == d.f332689d) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + c.a(Float.intBitsToFloat((int) (j10 & k0.f265952a)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return j(this.f332727a, obj);
    }

    public int hashCode() {
        return u(this.f332727a);
    }

    public final long r() {
        return this.f332727a;
    }

    @NotNull
    public String toString() {
        return x(this.f332727a);
    }

    public final /* synthetic */ long y() {
        return this.f332727a;
    }
}
