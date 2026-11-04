package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,257:1\n48#2:258\n53#2:261\n48#2:264\n53#2:267\n48#2:270\n53#2:273\n48#2:276\n53#2:279\n60#3:259\n70#3:262\n60#3:265\n70#3:268\n60#3:271\n70#3:274\n60#3:277\n70#3:280\n60#3:288\n70#3:291\n60#3:293\n70#3:296\n22#4:260\n22#4:263\n22#4:266\n22#4:269\n22#4:272\n22#4:275\n22#4:278\n22#4:281\n22#4:289\n22#4:294\n36#5,5:282\n36#5,5:297\n65#6:287\n69#6:290\n65#6:292\n69#6:295\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n160#1:258\n161#1:261\n163#1:264\n164#1:267\n166#1:270\n167#1:273\n169#1:276\n170#1:279\n160#1:259\n161#1:262\n163#1:265\n164#1:268\n166#1:271\n167#1:274\n169#1:277\n170#1:280\n187#1:288\n187#1:291\n204#1:293\n204#1:296\n160#1:260\n161#1:263\n163#1:266\n164#1:269\n166#1:272\n167#1:275\n169#1:278\n170#1:281\n187#1:289\n204#1:294\n187#1:282,5\n231#1:297,5\n187#1:287\n187#1:290\n204#1:292\n204#1:295\n*E\n"})
public final class n implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Path f38055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private RectF f38056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private float[] f38057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Matrix f38058e;

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void a0() {
    }

    private final void b0(n0.j jVar) {
        if (Float.isNaN(jVar.t()) || Float.isNaN(jVar.B()) || Float.isNaN(jVar.x()) || Float.isNaN(jVar.j())) {
            u.e("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // androidx.compose.ui.graphics.k2
    public void A(float f10, float f11) {
        this.f38055b.moveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void C(@NotNull n0.j jVar) {
        O(jVar, k2.c.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void E(@NotNull k2 k2Var, long j10) {
        Path path = this.f38055b;
        if (!(k2Var instanceof n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((n) k2Var).Z(), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
    }

    @Override // androidx.compose.ui.graphics.k2
    public void F(float f10, float f11) {
        this.f38055b.lineTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.k2
    public boolean G() {
        return this.f38055b.isConvex();
    }

    @Override // androidx.compose.ui.graphics.k2
    public void I(@NotNull n0.j jVar) {
        Q(jVar, k2.c.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void J(float f10, float f11, float f12, float f13) {
        this.f38055b.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void M(int i10) {
        this.f38055b.setFillType(m2.f(i10, m2.f38048b.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void N(float f10, float f11, float f12, float f13) {
        this.f38055b.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void O(@NotNull n0.j jVar, @NotNull k2.c cVar) {
        b0(jVar);
        if (this.f38056c == null) {
            this.f38056c = new RectF();
        }
        RectF rectF = this.f38056c;
        Intrinsics.checkNotNull(rectF);
        rectF.set(jVar.t(), jVar.B(), jVar.x(), jVar.j());
        Path path = this.f38055b;
        RectF rectF2 = this.f38056c;
        Intrinsics.checkNotNull(rectF2);
        path.addRect(rectF2, u.f(cVar));
    }

    @Override // androidx.compose.ui.graphics.k2
    public void P() {
        this.f38055b.rewind();
    }

    @Override // androidx.compose.ui.graphics.k2
    public void Q(@NotNull n0.j jVar, @NotNull k2.c cVar) {
        if (this.f38056c == null) {
            this.f38056c = new RectF();
        }
        RectF rectF = this.f38056c;
        Intrinsics.checkNotNull(rectF);
        rectF.set(jVar.t(), jVar.B(), jVar.x(), jVar.j());
        Path path = this.f38055b;
        RectF rectF2 = this.f38056c;
        Intrinsics.checkNotNull(rectF2);
        path.addOval(rectF2, u.f(cVar));
    }

    @Override // androidx.compose.ui.graphics.k2
    public void U(@NotNull n0.j jVar, float f10, float f11) {
        z(jVar, i1.a(f10), i1.a(f11));
    }

    @Override // androidx.compose.ui.graphics.k2
    public void V(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f38055b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.k2
    public boolean X(@NotNull k2 k2Var, @NotNull k2 k2Var2, int i10) {
        Path.Op op;
        t2.a aVar = t2.f38235b;
        if (t2.i(i10, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (t2.i(i10, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (t2.i(i10, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = t2.i(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f38055b;
        if (!(k2Var instanceof n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathZ = ((n) k2Var).Z();
        if (k2Var2 instanceof n) {
            return path.op(pathZ, ((n) k2Var2).Z(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.k2
    public void Y(float f10, float f11) {
        this.f38055b.rLineTo(f10, f11);
    }

    @NotNull
    public final Path Z() {
        return this.f38055b;
    }

    @Override // androidx.compose.ui.graphics.k2
    public void a(@NotNull float[] fArr) {
        if (this.f38058e == null) {
            this.f38058e = new Matrix();
        }
        Matrix matrix = this.f38058e;
        Intrinsics.checkNotNull(matrix);
        k.a(matrix, fArr);
        Path path = this.f38055b;
        Matrix matrix2 = this.f38058e;
        Intrinsics.checkNotNull(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void close() {
        this.f38055b.close();
    }

    @Override // androidx.compose.ui.graphics.k2
    public void d(@NotNull n0.l lVar, @NotNull k2.c cVar) {
        if (this.f38056c == null) {
            this.f38056c = new RectF();
        }
        RectF rectF = this.f38056c;
        Intrinsics.checkNotNull(rectF);
        rectF.set(lVar.q(), lVar.s(), lVar.r(), lVar.m());
        if (this.f38057d == null) {
            this.f38057d = new float[8];
        }
        float[] fArr = this.f38057d;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = Float.intBitsToFloat((int) (lVar.t() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (lVar.t() & com.rabbitmq.client.k0.f265952a));
        fArr[2] = Float.intBitsToFloat((int) (lVar.u() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (lVar.u() & com.rabbitmq.client.k0.f265952a));
        fArr[4] = Float.intBitsToFloat((int) (lVar.o() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (lVar.o() & com.rabbitmq.client.k0.f265952a));
        fArr[6] = Float.intBitsToFloat((int) (lVar.n() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (lVar.n() & com.rabbitmq.client.k0.f265952a));
        Path path = this.f38055b;
        RectF rectF2 = this.f38056c;
        Intrinsics.checkNotNull(rectF2);
        float[] fArr2 = this.f38057d;
        Intrinsics.checkNotNull(fArr2);
        path.addRoundRect(rectF2, fArr2, u.f(cVar));
    }

    @Override // androidx.compose.ui.graphics.k2
    public void e(float f10, float f11) {
        this.f38055b.rMoveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f38055b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.k2
    @NotNull
    public n0.j getBounds() {
        if (this.f38056c == null) {
            this.f38056c = new RectF();
        }
        RectF rectF = this.f38056c;
        Intrinsics.checkNotNull(rectF);
        this.f38055b.computeBounds(rectF, true);
        return new n0.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void h(float f10, float f11, float f12, float f13) {
        this.f38055b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.k2
    public boolean isEmpty() {
        return this.f38055b.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.k2
    public void m(long j10) {
        Matrix matrix = this.f38058e;
        if (matrix == null) {
            this.f38058e = new Matrix();
        } else {
            Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f38058e;
        Intrinsics.checkNotNull(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
        Path path = this.f38055b;
        Matrix matrix3 = this.f38058e;
        Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void n(@NotNull n0.l lVar) {
        d(lVar, k2.c.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void r(float f10, float f11, float f12, float f13) {
        this.f38055b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.k2
    public void reset() {
        this.f38055b.reset();
    }

    @Override // androidx.compose.ui.graphics.k2
    public void w(@NotNull n0.j jVar, float f10, float f11, boolean z10) {
        float fT = jVar.t();
        float fB = jVar.B();
        float fX = jVar.x();
        float fJ = jVar.j();
        if (this.f38056c == null) {
            this.f38056c = new RectF();
        }
        RectF rectF = this.f38056c;
        Intrinsics.checkNotNull(rectF);
        rectF.set(fT, fB, fX, fJ);
        Path path = this.f38055b;
        RectF rectF2 = this.f38056c;
        Intrinsics.checkNotNull(rectF2);
        path.arcTo(rectF2, f10, f11, z10);
    }

    @Override // androidx.compose.ui.graphics.k2
    public int x() {
        return this.f38055b.getFillType() == Path.FillType.EVEN_ODD ? m2.f38048b.a() : m2.f38048b.b();
    }

    @Override // androidx.compose.ui.graphics.k2
    public void z(@NotNull n0.j jVar, float f10, float f11) {
        b0(jVar);
        if (this.f38056c == null) {
            this.f38056c = new RectF();
        }
        RectF rectF = this.f38056c;
        Intrinsics.checkNotNull(rectF);
        rectF.set(jVar.t(), jVar.B(), jVar.x(), jVar.j());
        Path path = this.f38055b;
        RectF rectF2 = this.f38056c;
        Intrinsics.checkNotNull(rectF2);
        path.addArc(rectF2, f10, f11);
    }

    public n(@NotNull Path path) {
        this.f38055b = path;
    }

    public /* synthetic */ n(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
