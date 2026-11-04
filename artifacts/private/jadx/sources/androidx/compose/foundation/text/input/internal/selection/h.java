package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.q6;
import androidx.compose.foundation.text.input.internal.r6;
import androidx.compose.foundation.text.input.internal.w6;
import androidx.compose.foundation.text.k3;
import androidx.compose.foundation.text.selection.n2;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.w3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n278#2:124\n30#2:130\n65#3:125\n60#4:126\n85#4:129\n53#4,3:131\n22#5:127\n54#6:128\n1#7:134\n*S KotlinDebug\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n*L\n73#1:124\n117#1:130\n89#1:125\n89#1:126\n107#1:129\n117#1:131,3\n89#1:127\n107#1:128\n*E\n"})
public final class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19970a;

        static {
            int[] iArr = new int[k3.values().length];
            try {
                iArr[k3.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k3.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k3.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19970a = iArr;
        }
    }

    public static final long a(@NotNull w6 w6Var, @NotNull d0 d0Var, @NotNull q6 q6Var, long j10) {
        int iN;
        long jW0 = d0Var.w0();
        if ((9223372034707292159L & jW0) != n0.d.f332689d && w6Var.u().length() != 0) {
            long jH = w6Var.u().h();
            k3 k3VarU0 = d0Var.u0();
            int i10 = k3VarU0 == null ? -1 : a.f19970a[k3VarU0.ordinal()];
            if (i10 == -1) {
                return n0.g.f332700b.c();
            }
            if (i10 == 1 || i10 == 2) {
                iN = w3.n(jH);
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                iN = w3.i(jH);
            }
            p3 p3VarF = q6Var.f();
            if (p3VarF == null) {
                return n0.g.f332700b.c();
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jW0 >> 32));
            int iR = p3VarF.r(iN);
            float fT = p3VarF.t(iR);
            float fU = p3VarF.u(iR);
            float fH = kotlin.ranges.r.H(fIntBitsToFloat, Math.min(fT, fU), Math.max(fT, fU));
            if (!androidx.compose.ui.unit.u.h(j10, androidx.compose.ui.unit.u.f42720b.a()) && Math.abs(fIntBitsToFloat - fH) > ((int) (j10 >> 32)) / 2) {
                return n0.g.f332700b.c();
            }
            float fW = p3VarF.w(iR);
            long jG = n0.g.g((((long) Float.floatToRawIntBits(((p3VarF.n(iR) - fW) / 2) + fW)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fH)) << 32));
            androidx.compose.ui.layout.g0 g0VarK = q6Var.k();
            if (g0VarK != null) {
                if (!g0VarK.I()) {
                    g0VarK = null;
                }
                if (g0VarK != null) {
                    jG = r6.a(jG, n2.i(g0VarK));
                }
            }
            return r6.c(q6Var, jG);
        }
        return n0.g.f332700b.c();
    }
}
