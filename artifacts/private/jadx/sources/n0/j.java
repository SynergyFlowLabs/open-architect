package n0;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
@SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,288:1\n57#1,6:289\n57#1,6:304\n57#1,6:310\n57#1:320\n62#1:329\n57#1,6:334\n62#1:344\n57#1:353\n33#2:295\n53#3,3:296\n60#3:300\n70#3:303\n53#3,3:317\n53#3,3:322\n53#3,3:326\n53#3,3:331\n53#3,3:341\n53#3,3:346\n53#3,3:350\n53#3,3:355\n53#3,3:359\n60#3:363\n70#3:366\n65#4:299\n69#4:302\n65#4:362\n69#4:365\n22#5:301\n22#5:364\n22#5:367\n30#6:316\n30#6:321\n30#6:325\n30#6:330\n30#6:340\n30#6:345\n30#6:349\n30#6:354\n30#6:358\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n67#1:289,6\n162#1:304,6\n166#1:310,6\n174#1:320\n182#1:329\n191#1:334,6\n195#1:344\n204#1:353\n67#1:295\n67#1:296,3\n101#1:300\n101#1:303\n170#1:317,3\n174#1:322,3\n178#1:326,3\n182#1:331,3\n191#1:341,3\n195#1:346,3\n199#1:350,3\n204#1:355,3\n210#1:359,3\n220#1:363\n221#1:366\n101#1:299\n101#1:302\n220#1:362\n221#1:365\n101#1:301\n220#1:364\n221#1:367\n170#1:316\n174#1:321\n178#1:325\n182#1:330\n191#1:340\n195#1:345\n199#1:349\n204#1:354\n210#1:358\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f332706f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f332708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f332709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f332710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f332711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f332705e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final j f332707g = new j(0.0f, 0.0f, 0.0f, 0.0f);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final j a() {
            return j.f332707g;
        }

        private a() {
        }
    }

    static {
        int i10 = 3 & 0;
    }

    public j(float f10, float f11, float f12, float f13) {
        this.f332708a = f10;
        this.f332709b = f11;
        this.f332710c = f12;
        this.f332711d = f13;
    }

    @k7
    public static /* synthetic */ void A() {
    }

    @k7
    public static /* synthetic */ void C() {
    }

    @k7
    public static /* synthetic */ void H() {
    }

    @k7
    public static /* synthetic */ void M() {
    }

    @k7
    public static /* synthetic */ void O() {
    }

    @k7
    public static /* synthetic */ void Q() {
    }

    public static /* synthetic */ j h(j jVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = jVar.f332708a;
        }
        if ((i10 & 2) != 0) {
            f11 = jVar.f332709b;
        }
        if ((i10 & 4) != 0) {
            f12 = jVar.f332710c;
        }
        if ((i10 & 8) != 0) {
            f13 = jVar.f332711d;
        }
        return jVar.g(f10, f11, f12, f13);
    }

    @k7
    public static /* synthetic */ void k() {
    }

    @k7
    public static /* synthetic */ void s() {
    }

    @k7
    public static /* synthetic */ void u() {
    }

    @k7
    public static /* synthetic */ void y() {
    }

    public final float B() {
        return this.f332709b;
    }

    public final long D() {
        float fX = this.f332708a + ((x() - t()) / 2.0f);
        float f10 = this.f332709b;
        return g.g((((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a));
    }

    public final long E() {
        float f10 = this.f332708a;
        float f11 = this.f332709b;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final long F() {
        float f10 = this.f332710c;
        float f11 = this.f332709b;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final float G() {
        return x() - t();
    }

    @k7
    @NotNull
    public final j I(float f10) {
        return new j(this.f332708a - f10, this.f332709b - f10, this.f332710c + f10, this.f332711d + f10);
    }

    @k7
    @NotNull
    public final j J(float f10, float f11, float f12, float f13) {
        return new j(Math.max(this.f332708a, f10), Math.max(this.f332709b, f11), Math.min(this.f332710c, f12), Math.min(this.f332711d, f13));
    }

    @k7
    @NotNull
    public final j K(@NotNull j jVar) {
        return new j(Math.max(this.f332708a, jVar.f332708a), Math.max(this.f332709b, jVar.f332709b), Math.min(this.f332710c, jVar.f332710c), Math.min(this.f332711d, jVar.f332711d));
    }

    public final boolean L() {
        return (this.f332708a >= this.f332710c) | (this.f332709b >= this.f332711d);
    }

    public final boolean N() {
        return ((Float.floatToRawIntBits(this.f332708a) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f332709b) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f332710c) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f332711d) & Integer.MAX_VALUE) < 2139095040);
    }

    public final boolean P() {
        return (this.f332708a == Float.POSITIVE_INFINITY) | (this.f332709b == Float.POSITIVE_INFINITY) | (this.f332710c == Float.POSITIVE_INFINITY) | (this.f332711d == Float.POSITIVE_INFINITY);
    }

    public final boolean R(@NotNull j jVar) {
        return (this.f332708a < jVar.f332710c) & (jVar.f332708a < this.f332710c) & (this.f332709b < jVar.f332711d) & (jVar.f332709b < this.f332711d);
    }

    @k7
    @NotNull
    public final j S(float f10, float f11) {
        return new j(this.f332708a + f10, this.f332709b + f11, this.f332710c + f10, this.f332711d + f11);
    }

    @k7
    @NotNull
    public final j T(long j10) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = this.f332708a + Float.intBitsToFloat(i10);
        float f10 = this.f332709b;
        int i11 = (int) (j10 & k0.f265952a);
        return new j(fIntBitsToFloat, f10 + Float.intBitsToFloat(i11), this.f332710c + Float.intBitsToFloat(i10), this.f332711d + Float.intBitsToFloat(i11));
    }

    public final float b() {
        return this.f332708a;
    }

    public final float c() {
        return this.f332709b;
    }

    public final float d() {
        return this.f332710c;
    }

    public final float e() {
        return this.f332711d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f332708a, jVar.f332708a) == 0 && Float.compare(this.f332709b, jVar.f332709b) == 0 && Float.compare(this.f332710c, jVar.f332710c) == 0 && Float.compare(this.f332711d, jVar.f332711d) == 0;
    }

    public final boolean f(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
        int i10 = 2 >> 1;
        return (fIntBitsToFloat >= this.f332708a) & (fIntBitsToFloat < this.f332710c) & (fIntBitsToFloat2 >= this.f332709b) & (fIntBitsToFloat2 < this.f332711d);
    }

    @NotNull
    public final j g(float f10, float f11, float f12, float f13) {
        return new j(f10, f11, f12, f13);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f332708a) * 31) + Float.hashCode(this.f332709b)) * 31) + Float.hashCode(this.f332710c)) * 31) + Float.hashCode(this.f332711d);
    }

    @k7
    @NotNull
    public final j i(float f10) {
        return I(-f10);
    }

    public final float j() {
        return this.f332711d;
    }

    public final long l() {
        float fX = this.f332708a + ((x() - t()) / 2.0f);
        float f10 = this.f332711d;
        return g.g((((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a));
    }

    public final long m() {
        float f10 = this.f332708a;
        float f11 = this.f332711d;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final long n() {
        float f10 = this.f332710c;
        float f11 = this.f332711d;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final long o() {
        float fX = this.f332708a + ((x() - t()) / 2.0f);
        return g.g((((long) Float.floatToRawIntBits(this.f332709b + ((j() - B()) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(fX) << 32));
    }

    public final long p() {
        float f10 = this.f332708a;
        return g.g((((long) Float.floatToRawIntBits(this.f332709b + ((j() - B()) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final long q() {
        float f10 = this.f332710c;
        return g.g((((long) Float.floatToRawIntBits(this.f332709b + ((j() - B()) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float r() {
        return j() - B();
    }

    public final float t() {
        return this.f332708a;
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f332708a, 1) + ", " + c.a(this.f332709b, 1) + ", " + c.a(this.f332710c, 1) + ", " + c.a(this.f332711d, 1) + ')';
    }

    public final float v() {
        return Math.max(Math.abs(x() - t()), Math.abs(j() - B()));
    }

    public final float w() {
        return Math.min(Math.abs(x() - t()), Math.abs(j() - B()));
    }

    public final float x() {
        return this.f332710c;
    }

    public final long z() {
        float fX = x() - t();
        return n.f((((long) Float.floatToRawIntBits(j() - B())) & k0.f265952a) | (Float.floatToRawIntBits(fX) << 32));
    }
}
