package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,1073:1\n61#2:1074\n57#2:1085\n57#2:1092\n61#2:1095\n70#3:1075\n53#3,3:1078\n53#3,3:1082\n60#3:1086\n53#3,3:1089\n60#3:1093\n70#3:1096\n53#3,3:1098\n60#3:1102\n70#3:1105\n22#4:1076\n22#4:1087\n22#4:1094\n22#4:1103\n30#5:1077\n30#5:1081\n30#5:1088\n30#5:1097\n65#6:1101\n69#6:1104\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n*L\n461#1:1074\n481#1:1085\n494#1:1092\n494#1:1095\n461#1:1075\n461#1:1078,3\n471#1:1082,3\n481#1:1086\n483#1:1089,3\n494#1:1093\n494#1:1096\n494#1:1098,3\n511#1:1102\n511#1:1105\n461#1:1076\n481#1:1087\n494#1:1094\n511#1:1103\n461#1:1077\n471#1:1081\n483#1:1088\n494#1:1097\n511#1:1101\n511#1:1104\n*E\n"})
final class l2 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.t {

    @NotNull
    private final y1 X;

    @NotNull
    private final androidx.compose.foundation.layout.g5 Y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final e f15767w;

    public l2(@NotNull androidx.compose.ui.node.j jVar, @NotNull e eVar, @NotNull y1 y1Var, @NotNull androidx.compose.foundation.layout.g5 g5Var) {
        this.f15767w = eVar;
        this.X = y1Var;
        this.Y = g5Var;
        v9(jVar);
    }

    private final boolean G9(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fS7 = fVar.S7(this.Y.a());
        float f10 = -Float.intBitsToFloat((int) (fVar.d() >> 32));
        float f11 = (-Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a))) + fS7;
        return K9(180.0f, n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)), edgeEffect, canvas);
    }

    private final boolean H9(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float f10 = -Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        float fS7 = fVar.S7(this.Y.b(fVar.getLayoutDirection()));
        return K9(270.0f, n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(fS7)))), edgeEffect, canvas);
    }

    private final boolean I9(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return K9(90.0f, n0.g.g((((long) Float.floatToRawIntBits((-kotlin.math.b.L0(Float.intBitsToFloat((int) (fVar.d() >> 32)))) + fVar.S7(this.Y.c(fVar.getLayoutDirection())))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean J9(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fS7 = fVar.S7(this.Y.d());
        return K9(0.0f, n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fS7)) & com.rabbitmq.client.k0.f265952a)), edgeEffect, canvas);
    }

    private final boolean K9(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f15767w.p(cVar.d());
        if (n0.n.v(cVar.d())) {
            cVar.E4();
            return;
        }
        cVar.E4();
        this.f15767w.h().getValue();
        Canvas canvasD = androidx.compose.ui.graphics.c.d(cVar.Z3().f());
        y1 y1Var = this.X;
        boolean zH9 = y1Var.t() ? H9(cVar, y1Var.j(), canvasD) : false;
        if (y1Var.A()) {
            zH9 = J9(cVar, y1Var.n(), canvasD) || zH9;
        }
        if (y1Var.w()) {
            zH9 = I9(cVar, y1Var.l(), canvasD) || zH9;
        }
        if (y1Var.q()) {
            zH9 = G9(cVar, y1Var.h(), canvasD) || zH9;
        }
        if (zH9) {
            this.f15767w.i();
        }
    }
}
