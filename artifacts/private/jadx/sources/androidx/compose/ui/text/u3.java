package androidx.compose.ui.text;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainter\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,389:1\n54#2:390\n59#2:392\n85#3:391\n90#3:393\n53#3,3:395\n33#4:394\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainter\n*L\n57#1:390\n58#1:392\n57#1:391\n58#1:393\n59#1:395,3\n59#1:394\n*E\n"})
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u3 f42312a = new u3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42313b = 0;

    private u3() {
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    public final void a(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull p3 p3Var) {
        androidx.compose.ui.graphics.k0 k0Var2;
        Throwable th2;
        androidx.compose.ui.graphics.k0 k0Var3;
        float fR;
        boolean z10 = p3Var.i() && !androidx.compose.ui.text.style.v.i(p3Var.l().h(), androidx.compose.ui.text.style.v.f42256b.i());
        if (z10) {
            float fC = (int) (p3Var.C() >> 32);
            n0.j jVarC = n0.k.c(n0.g.f332700b.e(), n0.n.f((((long) Float.floatToRawIntBits((int) (p3Var.C() & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fC)) << 32)));
            k0Var.save();
            int i10 = 5 ^ 2;
            k0Var2 = null;
            androidx.compose.ui.graphics.k0.p(k0Var, jVarC, 0, 2, null);
        }
        c3 c3VarO = p3Var.l().m().O();
        androidx.compose.ui.text.style.k kVarY = c3VarO.y();
        if (kVarY == null) {
            kVarY = androidx.compose.ui.text.style.k.f42215b.d();
        }
        androidx.compose.ui.text.style.k kVar = kVarY;
        androidx.compose.ui.graphics.o3 o3VarX = c3VarO.x();
        if (o3VarX == null) {
            o3VarX = androidx.compose.ui.graphics.o3.f38091d.a();
        }
        androidx.compose.ui.graphics.o3 o3Var = o3VarX;
        androidx.compose.ui.graphics.drawscope.i iVarN = c3VarO.n();
        if (iVarN == null) {
            iVarN = androidx.compose.ui.graphics.drawscope.m.f37744a;
        }
        androidx.compose.ui.graphics.drawscope.i iVar = iVarN;
        try {
            androidx.compose.ui.graphics.i0 i0VarL = c3VarO.l();
            try {
                if (i0VarL != null) {
                    if (c3VarO.z() != androidx.compose.ui.text.style.p.b.f42233b) {
                        try {
                            fR = c3VarO.z().r();
                        } catch (Throwable th3) {
                            th2 = th3;
                            k0Var2 = k0Var;
                            if (z10) {
                                k0Var2.B();
                            }
                            throw th2;
                        }
                    } else {
                        fR = 1.0f;
                    }
                    k0Var3 = k0Var;
                    f0.T(p3Var.x(), k0Var3, i0VarL, fR, o3Var, kVar, iVar, 0, 64, null);
                } else {
                    k0Var3 = k0Var;
                    p3Var.x().O(k0Var3, (32 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : c3VarO.z() != androidx.compose.ui.text.style.p.b.f42233b ? c3VarO.z().u() : androidx.compose.ui.graphics.q0.f38131b.a(), (32 & 4) != 0 ? null : o3Var, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? iVar : null, (32 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : 0);
                }
                if (z10) {
                    k0Var3.B();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                if (z10) {
                    k0Var2.B();
                }
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            k0Var2 = k0Var;
        }
    }
}
