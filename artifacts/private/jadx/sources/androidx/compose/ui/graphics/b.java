package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n36#2,5:373\n36#2,5:388\n65#3:378\n69#3:381\n65#3:383\n69#3:386\n65#3:393\n69#3:396\n65#3:410\n69#3:413\n65#3:416\n69#3:419\n60#4:379\n70#4:382\n60#4:384\n70#4:387\n60#4:394\n70#4:397\n85#4:400\n90#4:402\n85#4:404\n90#4:406\n60#4:411\n70#4:414\n60#4:417\n70#4:420\n22#5:380\n22#5:385\n22#5:395\n22#5:398\n22#5:412\n22#5:418\n54#6:399\n59#6:401\n54#6:403\n59#6:405\n35#7,3:407\n39#7:415\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n128#1:373,5\n199#1:388,5\n139#1:378\n139#1:381\n172#1:383\n172#1:386\n206#1:393\n207#1:396\n271#1:410\n271#1:413\n293#1:416\n293#1:419\n139#1:379\n139#1:382\n172#1:384\n172#1:387\n206#1:394\n207#1:397\n233#1:400\n234#1:402\n239#1:404\n240#1:406\n271#1:411\n271#1:414\n293#1:417\n293#1:420\n139#1:380\n172#1:385\n206#1:395\n207#1:398\n271#1:412\n293#1:418\n233#1:399\n234#1:401\n239#1:403\n240#1:405\n270#1:407,3\n270#1:415\n*E\n"})
public final class b implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Canvas f37525a = c.f37542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Rect f37526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Rect f37527c;

    private final void Q(float[] fArr, h2 h2Var, int i10) {
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            Paint paintD = h2Var.D();
            int i11 = 0;
            while (i11 < fArr.length - 3) {
                this.f37525a.drawLine(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], paintD);
                i11 += i10 * 2;
            }
        }
    }

    private final void R(float[] fArr, h2 h2Var, int i10) {
        if (fArr.length % 2 == 0) {
            Paint paintD = h2Var.D();
            int i11 = 0;
            while (i11 < fArr.length - 1) {
                this.f37525a.drawPoint(fArr[i11], fArr[i11 + 1], paintD);
                i11 += i10;
            }
        }
    }

    @kotlin.a1
    public static /* synthetic */ void T() {
    }

    private final void a(List<n0.g> list, h2 h2Var, int i10) {
        if (list.size() >= 2) {
            Paint paintD = h2Var.D();
            int i11 = 0;
            while (i11 < list.size() - 1) {
                long jB = list.get(i11).B();
                long jB2 = list.get(i11 + 1).B();
                this.f37525a.drawLine(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (jB2 >> 32)), Float.intBitsToFloat((int) (jB2 & com.rabbitmq.client.k0.f265952a)), paintD);
                i11 += i10;
            }
        }
    }

    private final void d(List<n0.g> list, h2 h2Var) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jB = list.get(i10).B();
            this.f37525a.drawPoint(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)), h2Var.D());
        }
    }

    @Override // androidx.compose.ui.graphics.k0
    public void B() {
        this.f37525a.restore();
    }

    @Override // androidx.compose.ui.graphics.k0
    public void D() {
        n0.f38059a.a(this.f37525a, true);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void F(long j10, long j11, @NotNull h2 h2Var) {
        this.f37525a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void H(float f10) {
        this.f37525a.rotate(f10);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void J(float f10, float f11) {
        this.f37525a.skew(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void L(@NotNull float[] fArr) {
        if (d2.b(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        k.a(matrix, fArr);
        this.f37525a.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void M(@NotNull k2 k2Var, @NotNull h2 h2Var) {
        Canvas canvas = this.f37525a;
        if (!(k2Var instanceof n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((n) k2Var).Z(), h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void N(long j10, float f10, @NotNull h2 h2Var) {
        this.f37525a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), f10, h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void P(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull h2 h2Var) {
        this.f37525a.drawRoundRect(f10, f11, f12, f13, f14, f15, h2Var.D());
    }

    @NotNull
    public final Canvas S() {
        return this.f37525a;
    }

    public final void U(@NotNull Canvas canvas) {
        this.f37525a = canvas;
    }

    @NotNull
    public final Region.Op V(int i10) {
        return p0.f(i10, p0.f38096b.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.k0
    public void b(float f10, float f11, float f12, float f13, int i10) {
        this.f37525a.clipRect(f10, f11, f12, f13, V(i10));
    }

    @Override // androidx.compose.ui.graphics.k0
    public void c(float f10, float f11) {
        this.f37525a.translate(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void e(@NotNull k2 k2Var, int i10) {
        Canvas canvas = this.f37525a;
        if (!(k2Var instanceof n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((n) k2Var).Z(), V(i10));
    }

    @Override // androidx.compose.ui.graphics.k0
    public void f(int i10, @NotNull List<n0.g> list, @NotNull h2 h2Var) {
        z2.a aVar = z2.f38718b;
        if (z2.g(i10, aVar.a())) {
            a(list, h2Var, 2);
        } else if (z2.g(i10, aVar.c())) {
            a(list, h2Var, 1);
        } else if (z2.g(i10, aVar.b())) {
            d(list, h2Var);
        }
    }

    @Override // androidx.compose.ui.graphics.k0
    public void g(@NotNull t1 t1Var, long j10, long j11, long j12, long j13, @NotNull h2 h2Var) {
        if (this.f37526b == null) {
            this.f37526b = new Rect();
            this.f37527c = new Rect();
        }
        Canvas canvas = this.f37525a;
        Bitmap bitmapB = j.b(t1Var);
        Rect rect = this.f37526b;
        Intrinsics.checkNotNull(rect);
        rect.left = androidx.compose.ui.unit.q.n(j10);
        rect.top = androidx.compose.ui.unit.q.p(j10);
        rect.right = androidx.compose.ui.unit.q.n(j10) + ((int) (j11 >> 32));
        rect.bottom = androidx.compose.ui.unit.q.p(j10) + ((int) (j11 & com.rabbitmq.client.k0.f265952a));
        Unit unit = Unit.f312394a;
        Rect rect2 = this.f37527c;
        Intrinsics.checkNotNull(rect2);
        rect2.left = androidx.compose.ui.unit.q.n(j12);
        rect2.top = androidx.compose.ui.unit.q.p(j12);
        rect2.right = androidx.compose.ui.unit.q.n(j12) + ((int) (j13 >> 32));
        rect2.bottom = androidx.compose.ui.unit.q.p(j12) + ((int) (j13 & com.rabbitmq.client.k0.f265952a));
        canvas.drawBitmap(bitmapB, rect, rect2, h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void i(int i10, @NotNull float[] fArr, @NotNull h2 h2Var) {
        if (fArr.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        z2.a aVar = z2.f38718b;
        if (z2.g(i10, aVar.a())) {
            Q(fArr, h2Var, 2);
        } else if (z2.g(i10, aVar.c())) {
            Q(fArr, h2Var, 1);
        } else if (z2.g(i10, aVar.b())) {
            R(fArr, h2Var, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.k0
    public void j(@NotNull d4 d4Var, int i10, @NotNull h2 h2Var) {
        this.f37525a.drawVertices(a0.a(d4Var.g()), d4Var.e().length, d4Var.e(), 0, d4Var.f(), 0, d4Var.c(), 0, d4Var.d(), 0, d4Var.d().length, h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void l(@NotNull n0.j jVar, @NotNull h2 h2Var) {
        this.f37525a.saveLayer(jVar.t(), jVar.B(), jVar.x(), jVar.j(), h2Var.D(), 31);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void n(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @NotNull h2 h2Var) {
        this.f37525a.drawArc(f10, f11, f12, f13, f14, f15, z10, h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void q() {
        n0.f38059a.a(this.f37525a, false);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void save() {
        this.f37525a.save();
    }

    @Override // androidx.compose.ui.graphics.k0
    public void v(float f10, float f11) {
        this.f37525a.scale(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.k0
    public void x(float f10, float f11, float f12, float f13, @NotNull h2 h2Var) {
        this.f37525a.drawRect(f10, f11, f12, f13, h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void y(float f10, float f11, float f12, float f13, @NotNull h2 h2Var) {
        this.f37525a.drawOval(f10, f11, f12, f13, h2Var.D());
    }

    @Override // androidx.compose.ui.graphics.k0
    public void z(@NotNull t1 t1Var, long j10, @NotNull h2 h2Var) {
        this.f37525a.drawBitmap(j.b(t1Var), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), h2Var.D());
    }
}
