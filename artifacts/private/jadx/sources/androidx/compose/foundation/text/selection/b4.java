package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.i5;
import androidx.compose.foundation.text.k5;
import androidx.compose.foundation.text.y6;
import androidx.compose.runtime.s5;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1348:1\n1282#2,6:1349\n1282#2,6:1355\n1282#2,6:1361\n65#3:1367\n60#4:1368\n85#4:1371\n53#4,3:1373\n22#5:1369\n54#6:1370\n30#7:1372\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n1251#1:1349,6\n1254#1:1355,6\n1260#1:1361,6\n1311#1:1367\n1311#1:1368\n1331#1:1371\n1341#1:1373,3\n1311#1:1369\n1331#1:1370\n1341#1:1372\n*E\n"})
public final class b4 {

    static final class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u3 f21010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21011b;

        a(u3 u3Var, boolean z10) {
            this.f21010a = u3Var;
            this.f21011b = z10;
        }

        @Override // androidx.compose.foundation.text.selection.w
        public final long a() {
            return this.f21010a.W(this.f21011b);
        }
    }

    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k5 f21012a;

        b(k5 k5Var) {
            this.f21012a = k5Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objK = androidx.compose.foundation.text.s4.k(l0Var, this.f21012a, dVar);
            return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21013a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.k3.values().length];
            try {
                iArr[androidx.compose.foundation.text.k3.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.k3.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.k3.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21013a = iArr;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(final boolean z10, @NotNull final androidx.compose.ui.text.style.i iVar, @NotNull final u3 u3Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.K(iVar.ordinal()) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(u3Var) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1344558920, i11, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1249)");
            }
            int i12 = i11 & 14;
            boolean zD = (i12 == 4) | c0VarR.D(u3Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = u3Var.r0(z10);
                c0VarR.Y(objI0);
            }
            k5 k5Var = (k5) objI0;
            boolean zK0 = c0VarR.k0(u3Var) | (i12 == 4);
            Object objI1 = c0VarR.i0();
            if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new a(u3Var, z10);
                c0VarR.Y(objI1);
            }
            w wVar = (w) objI1;
            boolean zM = androidx.compose.ui.text.w3.m(u3Var.p0().l());
            float fV = u3Var.V(z10);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zK1 = c0VarR.k0(k5Var);
            Object objI2 = c0VarR.i0();
            if (zK1 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new b(k5Var);
                c0VarR.Y(objI2);
            }
            g.g(wVar, z10, iVar, zM, 0L, fV, androidx.compose.ui.input.pointer.w0.e(aVar, k5Var, (PointerInputEventHandler) objI2), c0VarR, (i11 << 3) & 1008, 16);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.a4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b4.c(z10, iVar, u3Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(boolean z10, androidx.compose.ui.text.style.i iVar, u3 u3Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        b(z10, iVar, u3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final long d(@NotNull u3 u3Var, long j10) {
        int iN;
        y6 y6VarN;
        i5 i5VarA;
        androidx.compose.ui.text.f fVarN;
        n0.g gVarP = u3Var.P();
        if (gVarP == null) {
            return n0.g.f332700b.c();
        }
        long jB = gVarP.B();
        androidx.compose.ui.text.f fVarN0 = u3Var.n0();
        if (fVarN0 == null || fVarN0.length() == 0) {
            return n0.g.f332700b.c();
        }
        androidx.compose.foundation.text.k3 k3VarR = u3Var.R();
        int i10 = k3VarR == null ? -1 : c.f21013a[k3VarR.ordinal()];
        if (i10 == -1) {
            return n0.g.f332700b.c();
        }
        if (i10 == 1 || i10 == 2) {
            iN = androidx.compose.ui.text.w3.n(u3Var.p0().l());
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            iN = androidx.compose.ui.text.w3.i(u3Var.p0().l());
        }
        androidx.compose.foundation.text.g4 g4VarF0 = u3Var.f0();
        if (g4VarF0 == null || (y6VarN = g4VarF0.n()) == null) {
            return n0.g.f332700b.c();
        }
        androidx.compose.foundation.text.g4 g4VarF1 = u3Var.f0();
        if (g4VarF1 != null && (i5VarA = g4VarF1.A()) != null && (fVarN = i5VarA.n()) != null) {
            int I = kotlin.ranges.r.I(u3Var.b0().b(iN), 0, fVarN.length());
            float fIntBitsToFloat = Float.intBitsToFloat((int) (y6VarN.m(jB) >> 32));
            androidx.compose.ui.text.p3 p3VarI = y6VarN.i();
            int iR = p3VarI.r(I);
            float fT = p3VarI.t(iR);
            float fU = p3VarI.u(iR);
            float fH = kotlin.ranges.r.H(fIntBitsToFloat, Math.min(fT, fU), Math.max(fT, fU));
            if (!androidx.compose.ui.unit.u.h(j10, androidx.compose.ui.unit.u.f42720b.a()) && Math.abs(fIntBitsToFloat - fH) > ((int) (j10 >> 32)) / 2) {
                return n0.g.f332700b.c();
            }
            float fW = p3VarI.w(iR);
            return n0.g.g((((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(((p3VarI.n(iR) - fW) / 2) + fW)) & com.rabbitmq.client.k0.f265952a));
        }
        return n0.g.f332700b.c();
    }

    public static final boolean e(@NotNull u3 u3Var, boolean z10) {
        androidx.compose.ui.layout.g0 g0VarM;
        n0.j jVarI;
        androidx.compose.foundation.text.g4 g4VarF0 = u3Var.f0();
        if (g4VarF0 == null || (g0VarM = g4VarF0.m()) == null || (jVarI = n2.i(g0VarM)) == null) {
            return false;
        }
        return n2.d(jVarI, u3Var.W(z10));
    }
}
