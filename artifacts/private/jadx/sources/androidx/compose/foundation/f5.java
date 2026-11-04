package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(31)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1073:1\n1#2:1074\n69#3:1075\n65#3:1078\n69#3:1081\n65#3:1084\n70#4:1076\n60#4:1079\n70#4:1082\n60#4:1085\n22#5:1077\n22#5:1080\n22#5:1083\n22#5:1086\n293#6,27:1087\n120#6,7:1114\n321#6,10:1121\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n*L\n278#1:1075\n295#1:1078\n312#1:1081\n330#1:1084\n278#1:1076\n295#1:1079\n312#1:1082\n330#1:1085\n278#1:1077\n295#1:1080\n312#1:1083\n330#1:1086\n348#1:1087,27\n349#1:1114,7\n348#1:1121,10\n*E\n"})
final class f5 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.t {

    @NotNull
    private final y1 X;

    @Nullable
    private RenderNode Y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final e f14258w;

    public f5(@NotNull androidx.compose.ui.node.j jVar, @NotNull e eVar, @NotNull y1 y1Var) {
        this.f14258w = eVar;
        this.X = y1Var;
        v9(jVar);
    }

    private final boolean G9(EdgeEffect edgeEffect, Canvas canvas) {
        return K9(180.0f, edgeEffect, canvas);
    }

    private final boolean H9(EdgeEffect edgeEffect, Canvas canvas) {
        return K9(270.0f, edgeEffect, canvas);
    }

    private final boolean I9(EdgeEffect edgeEffect, Canvas canvas) {
        return K9(90.0f, edgeEffect, canvas);
    }

    private final boolean J9(EdgeEffect edgeEffect, Canvas canvas) {
        return K9(0.0f, edgeEffect, canvas);
    }

    private final boolean K9(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode L9() {
        RenderNode renderNode = this.Y;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.Y = renderNode2;
        return renderNode2;
    }

    private final boolean M9() {
        y1 y1Var = this.X;
        if (!y1Var.t() && !y1Var.u() && !y1Var.w() && !y1Var.x()) {
            return false;
        }
        return true;
    }

    private final boolean N9() {
        y1 y1Var = this.X;
        return y1Var.A() || y1Var.B() || y1Var.q() || y1Var.r();
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        boolean zH9;
        this.f14258w.p(cVar.d());
        Canvas canvasD = androidx.compose.ui.graphics.c.d(cVar.Z3().f());
        this.f14258w.h().getValue();
        if (n0.n.v(cVar.d())) {
            cVar.E4();
            return;
        }
        if (!canvasD.isHardwareAccelerated()) {
            this.X.f();
            cVar.E4();
            return;
        }
        float fS7 = cVar.S7(m1.b());
        y1 y1Var = this.X;
        boolean zN9 = N9();
        boolean zM9 = M9();
        if (zN9 && zM9) {
            L9().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zN9) {
            L9().setPosition(0, 0, canvasD.getWidth() + (kotlin.math.b.L0(fS7) * 2), canvasD.getHeight());
        } else {
            if (!zM9) {
                cVar.E4();
                return;
            }
            L9().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (kotlin.math.b.L0(fS7) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = L9().beginRecording();
        if (y1Var.u()) {
            EdgeEffect edgeEffectK = y1Var.k();
            I9(edgeEffectK, recordingCanvasBeginRecording);
            edgeEffectK.finish();
        }
        if (y1Var.t()) {
            EdgeEffect edgeEffectJ = y1Var.j();
            zH9 = H9(edgeEffectJ, recordingCanvasBeginRecording);
            if (y1Var.v()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f14258w.e() & com.rabbitmq.client.k0.f265952a));
                w1 w1Var = w1.f21865a;
                w1Var.e(y1Var.k(), w1Var.c(edgeEffectJ), 1 - fIntBitsToFloat);
            }
        } else {
            zH9 = false;
        }
        if (y1Var.B()) {
            EdgeEffect edgeEffectO = y1Var.o();
            G9(edgeEffectO, recordingCanvasBeginRecording);
            edgeEffectO.finish();
        }
        if (y1Var.A()) {
            EdgeEffect edgeEffectN = y1Var.n();
            zH9 = J9(edgeEffectN, recordingCanvasBeginRecording) || zH9;
            if (y1Var.C()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f14258w.e() >> 32));
                w1 w1Var2 = w1.f21865a;
                w1Var2.e(y1Var.o(), w1Var2.c(edgeEffectN), fIntBitsToFloat2);
            }
        }
        if (y1Var.x()) {
            EdgeEffect edgeEffectM = y1Var.m();
            H9(edgeEffectM, recordingCanvasBeginRecording);
            edgeEffectM.finish();
        }
        if (y1Var.w()) {
            EdgeEffect edgeEffectL = y1Var.l();
            zH9 = I9(edgeEffectL, recordingCanvasBeginRecording) || zH9;
            if (y1Var.y()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f14258w.e() & com.rabbitmq.client.k0.f265952a));
                w1 w1Var3 = w1.f21865a;
                w1Var3.e(y1Var.m(), w1Var3.c(edgeEffectL), fIntBitsToFloat3);
            }
        }
        if (y1Var.r()) {
            EdgeEffect edgeEffectI = y1Var.i();
            J9(edgeEffectI, recordingCanvasBeginRecording);
            edgeEffectI.finish();
        }
        if (y1Var.q()) {
            EdgeEffect edgeEffectH = y1Var.h();
            boolean z10 = G9(edgeEffectH, recordingCanvasBeginRecording) || zH9;
            if (y1Var.s()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f14258w.e() >> 32));
                w1 w1Var4 = w1.f21865a;
                w1Var4.e(y1Var.i(), w1Var4.c(edgeEffectH), 1 - fIntBitsToFloat4);
            }
            zH9 = z10;
        }
        if (zH9) {
            this.f14258w.i();
        }
        float f10 = zM9 ? 0.0f : fS7;
        if (zN9) {
            fS7 = 0.0f;
        }
        androidx.compose.ui.unit.w layoutDirection = cVar.getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarB = androidx.compose.ui.graphics.c.b(recordingCanvasBeginRecording);
        long jD = cVar.d();
        androidx.compose.ui.unit.d density = cVar.Z3().getDensity();
        androidx.compose.ui.unit.w layoutDirection2 = cVar.Z3().getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarF = cVar.Z3().f();
        long jD2 = cVar.Z3().d();
        androidx.compose.ui.graphics.layer.c cVarH = cVar.Z3().h();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
        dVarZ3.e(cVar);
        dVarZ3.b(layoutDirection);
        dVarZ3.k(k0VarB);
        dVarZ3.g(jD);
        dVarZ3.j(null);
        k0VarB.save();
        try {
            cVar.Z3().i().c(f10, fS7);
            try {
                cVar.E4();
                float f11 = -f10;
                float f12 = -fS7;
                cVar.Z3().i().c(f11, f12);
                k0VarB.B();
                androidx.compose.ui.graphics.drawscope.d dVarZ4 = cVar.Z3();
                dVarZ4.e(density);
                dVarZ4.b(layoutDirection2);
                dVarZ4.k(k0VarF);
                dVarZ4.g(jD2);
                dVarZ4.j(cVarH);
                L9().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f11, f12);
                canvasD.drawRenderNode(L9());
                canvasD.restoreToCount(iSave);
            } catch (Throwable th2) {
                cVar.Z3().i().c(-f10, -fS7);
                throw th2;
            }
        } catch (Throwable th3) {
            k0VarB.B();
            androidx.compose.ui.graphics.drawscope.d dVarZ5 = cVar.Z3();
            dVarZ5.e(density);
            dVarZ5.b(layoutDirection2);
            dVarZ5.k(k0VarF);
            dVarZ5.g(jD2);
            dVarZ5.j(cVarH);
            throw th3;
        }
    }
}
