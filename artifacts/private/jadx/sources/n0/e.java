package n0;

import androidx.compose.runtime.internal.w0;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,232:1\n37#1,5:233\n37#1,5:247\n37#1,5:252\n37#1:261\n41#1:270\n37#1,5:275\n41#1:284\n37#1:293\n33#2:238\n53#3,3:239\n60#3:243\n70#3:246\n53#3,3:258\n53#3,3:263\n53#3,3:267\n53#3,3:272\n53#3,3:281\n53#3,3:286\n53#3,3:290\n53#3,3:295\n53#3,3:299\n60#3:303\n70#3:306\n65#4:242\n69#4:245\n65#4:302\n69#4:305\n22#5:244\n22#5:304\n22#5:307\n30#6:257\n30#6:262\n30#6:266\n30#6:271\n30#6:280\n30#6:285\n30#6:289\n30#6:294\n30#6:298\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n45#1:233,5\n121#1:247,5\n125#1:252,5\n133#1:261\n141#1:270\n150#1:275,5\n154#1:284\n163#1:293\n45#1:238\n45#1:239,3\n69#1:243\n69#1:246\n129#1:258,3\n133#1:263,3\n137#1:267,3\n141#1:272,3\n150#1:281,3\n154#1:286,3\n158#1:290,3\n163#1:295,3\n169#1:299,3\n179#1:303\n180#1:306\n69#1:242\n69#1:245\n179#1:302\n180#1:305\n69#1:244\n179#1:304\n180#1:307\n129#1:257\n133#1:262\n137#1:266\n141#1:271\n150#1:280\n154#1:285\n158#1:289\n163#1:294\n169#1:298\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f332695e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f332696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f332697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f332698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f332699d;

    public e(float f10, float f11, float f12, float f13) {
        this.f332696a = f10;
        this.f332697b = f11;
        this.f332698c = f12;
        this.f332699d = f13;
    }

    public final boolean A(@NotNull j jVar) {
        return (this.f332696a < jVar.x()) & (jVar.t() < this.f332698c) & (this.f332697b < jVar.j()) & (jVar.B() < this.f332699d);
    }

    public final void B(float f10, float f11, float f12, float f13) {
        this.f332696a = f10;
        this.f332697b = f11;
        this.f332698c = f12;
        this.f332699d = f13;
    }

    public final void C(float f10) {
        this.f332699d = f10;
    }

    public final void D(float f10) {
        this.f332696a = f10;
    }

    public final void E(float f10) {
        this.f332698c = f10;
    }

    public final void F(float f10) {
        this.f332697b = f10;
    }

    public final void G(float f10, float f11) {
        this.f332696a += f10;
        this.f332697b += f11;
        this.f332698c += f10;
        this.f332699d += f11;
    }

    public final void H(long j10) {
        G(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & k0.f265952a)));
    }

    public final boolean a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
        return (fIntBitsToFloat >= this.f332696a) & (fIntBitsToFloat < this.f332698c) & (fIntBitsToFloat2 >= this.f332697b) & (fIntBitsToFloat2 < this.f332699d);
    }

    public final void b(float f10) {
        u(-f10);
    }

    public final float c() {
        return this.f332699d;
    }

    public final long d() {
        float fN = this.f332696a + ((n() - k()) / 2.0f);
        float f10 = this.f332699d;
        return g.g((((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a));
    }

    public final long e() {
        float f10 = this.f332696a;
        float f11 = this.f332699d;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final long f() {
        float f10 = this.f332698c;
        float f11 = this.f332699d;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final long g() {
        float fN = this.f332696a + ((n() - k()) / 2.0f);
        return g.g((((long) Float.floatToRawIntBits(this.f332697b + ((c() - p()) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(fN) << 32));
    }

    public final long h() {
        float f10 = this.f332696a;
        return g.g((((long) Float.floatToRawIntBits(this.f332697b + ((c() - p()) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final long i() {
        float f10 = this.f332698c;
        return g.g((((long) Float.floatToRawIntBits(this.f332697b + ((c() - p()) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float j() {
        return c() - p();
    }

    public final float k() {
        return this.f332696a;
    }

    public final float l() {
        return Math.max(Math.abs(n() - k()), Math.abs(c() - p()));
    }

    public final float m() {
        return Math.min(Math.abs(n() - k()), Math.abs(c() - p()));
    }

    public final float n() {
        return this.f332698c;
    }

    public final long o() {
        float fN = n() - k();
        return n.f((((long) Float.floatToRawIntBits(c() - p())) & k0.f265952a) | (Float.floatToRawIntBits(fN) << 32));
    }

    public final float p() {
        return this.f332697b;
    }

    public final long q() {
        float fN = this.f332696a + ((n() - k()) / 2.0f);
        float f10 = this.f332697b;
        return g.g((((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a));
    }

    public final long r() {
        float f10 = this.f332696a;
        float f11 = this.f332697b;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final long s() {
        float f10 = this.f332698c;
        float f11 = this.f332697b;
        return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public final float t() {
        return n() - k();
    }

    @NotNull
    public String toString() {
        return "MutableRect(" + c.a(this.f332696a, 1) + ", " + c.a(this.f332697b, 1) + ", " + c.a(this.f332698c, 1) + ", " + c.a(this.f332699d, 1) + ')';
    }

    public final void u(float f10) {
        this.f332696a -= f10;
        this.f332697b -= f10;
        this.f332698c += f10;
        this.f332699d += f10;
    }

    public final void v(float f10, float f11, float f12, float f13) {
        this.f332696a = Math.max(f10, this.f332696a);
        this.f332697b = Math.max(f11, this.f332697b);
        this.f332698c = Math.min(f12, this.f332698c);
        this.f332699d = Math.min(f13, this.f332699d);
    }

    public final boolean w() {
        return (this.f332696a >= this.f332698c) | (this.f332697b >= this.f332699d);
    }

    public final boolean x() {
        return ((Float.floatToRawIntBits(this.f332696a) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f332697b) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f332698c) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f332699d) & Integer.MAX_VALUE) < 2139095040);
    }

    public final boolean y() {
        return (this.f332696a == Float.POSITIVE_INFINITY) | (this.f332697b == Float.POSITIVE_INFINITY) | (this.f332698c == Float.POSITIVE_INFINITY) | (this.f332699d == Float.POSITIVE_INFINITY);
    }

    public final boolean z(@NotNull e eVar) {
        return this.f332698c > eVar.f332696a && eVar.f332698c > this.f332696a && this.f332699d > eVar.f332697b && eVar.f332699d > this.f332697b;
    }
}
