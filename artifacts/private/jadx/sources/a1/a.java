package a1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.l2;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.graphics.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import n0.j;
import n0.m;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/BulletSpan_androidKt\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,206:1\n62#2:207\n62#2:222\n57#2:223\n62#2:224\n36#3,5:208\n36#3,5:214\n1#4:213\n48#5:219\n60#6:220\n22#7:221\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/BulletSpan_androidKt\n*L\n135#1:207\n163#1:222\n164#1:223\n165#1:224\n136#1:208,5\n144#1:214,5\n148#1:219\n148#1:220\n148#1:221\n*E\n"})
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(f2 f2Var, Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f2Var instanceof f2.a) {
            canvas.save();
            f2.a aVar = (f2.a) f2Var;
            j jVarA = aVar.a();
            canvas.translate(f10, f11 - ((jVarA.j() - jVarA.B()) / 2.0f));
            k2 k2VarB = aVar.b();
            if (!(k2VarB instanceof n)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((n) k2VarB).Z(), paint);
            canvas.restore();
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            if (!(f2Var instanceof f2.b)) {
                throw new k0();
            }
            f2.b bVar = (f2.b) f2Var;
            j jVarB = bVar.b();
            float fJ = f11 - ((jVarB.j() - jVarB.B()) / 2.0f);
            j jVarB2 = bVar.b();
            float fX = f10 + (i10 * (jVarB2.x() - jVarB2.t()));
            j jVarB3 = bVar.b();
            canvas.drawRect(f10, fJ, fX, f11 + ((jVarB3.j() - jVarB3.B()) / 2.0f), paint);
            return;
        }
        f2.c cVar = (f2.c) f2Var;
        if (m.q(cVar.b())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.b().t() >> 32));
            canvas.drawRoundRect(f10, f11 - (cVar.b().p() / 2.0f), (i10 * cVar.b().v()) + f10, (cVar.b().p() / 2.0f) + f11, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        k2 k2VarA = u.a();
        k2.S(k2VarA, cVar.b(), null, 2, null);
        canvas.save();
        canvas.translate(f10, f11 - (cVar.b().p() / 2.0f));
        if (!(k2VarA instanceof n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((n) k2VarA).Z(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Paint paint, i0 i0Var, float f10, long j10, Function0<Unit> function0) {
        Integer numValueOf = null;
        if (i0Var == null) {
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            function0.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (i0Var instanceof s3) {
            int color = paint.getColor();
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            paint.setColor(s0.t(((s3) i0Var).c()));
            function0.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (!(i0Var instanceof m3)) {
            throw new k0();
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f10)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f10 * 255.0f));
        }
        paint.setShader(((m3) i0Var).c(j10));
        function0.invoke();
        paint.setShader(shader);
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Paint paint, i iVar) {
        if (Intrinsics.areEqual(iVar, androidx.compose.ui.graphics.drawscope.m.f37744a)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(iVar instanceof androidx.compose.ui.graphics.drawscope.n)) {
            throw new k0();
        }
        paint.setStyle(Paint.Style.STROKE);
        androidx.compose.ui.graphics.drawscope.n nVar = (androidx.compose.ui.graphics.drawscope.n) iVar;
        paint.setStrokeWidth(nVar.g());
        paint.setStrokeMiter(nVar.e());
        paint.setStrokeCap(e.a(nVar.c()));
        paint.setStrokeJoin(e.b(nVar.d()));
        l2 l2VarF = nVar.f();
        paint.setPathEffect(l2VarF != null ? p.e(l2VarF) : null);
    }
}
