package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.annotation.f1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAddFileButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddFileButton.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/AddFileButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,62:1\n113#2:63\n113#2:64\n113#2:98\n99#3,6:65\n106#3:102\n80#4,6:71\n87#4,3:86\n90#4,2:95\n94#4:101\n391#5,9:77\n400#5:97\n401#5,2:99\n4360#6,6:89\n*S KotlinDebug\n*F\n+ 1 AddFileButton.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/AddFileButtonKt\n*L\n34#1:63\n36#1:64\n47#1:98\n27#1:65,6\n27#1:102\n27#1:71,6\n27#1:86,3\n27#1:95,2\n27#1:101\n27#1:77,9\n27#1:97\n27#1:99,2\n27#1:89,6\n*E\n"})
public final class AddFileButtonKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AddFileButton(@Nullable androidx.compose.ui.a0 a0Var, @f1 final int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        final androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(533336753);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 14) == 0) {
            a0Var2 = a0Var;
            i13 = i11 | (c0VarR.D(a0Var2) ? 4 : 2);
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0Var3 = i14 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarR = d5.r(androidx.compose.ui.draw.j.a(androidx.compose.foundation.v.c(a0Var3, q0.w(intercomTheme.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), intercomTheme.getShapes(c0VarR, i15).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(8));
            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(3)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            y5 y5Var = y5.f16577a;
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            q50.t(u0.i.d(i10, c0VarR, (i13 >> 3) & 14), aVar2, intercomTheme.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i15).getType04Point5(), c0VarR, 1572912, 0, 131000);
            c0VarR = c0VarR;
            ni.o(u0.e.c(R.drawable.intercom_ic_plus, c0VarR, 0), "Add", i6.w(aVar2, androidx.compose.ui.unit.h.r(16)), intercomTheme.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), c0VarR, 440, 0);
            c0VarR.o();
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddFileButtonKt.AddFileButton$lambda$1(a0Var2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddFileButton$lambda$1(androidx.compose.ui.a0 a0Var, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        AddFileButton(a0Var, i10, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void AddFileButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-126735215);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AddFileButtonKt.INSTANCE.m494getLambda1$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddFileButtonKt.AddFileButtonPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddFileButtonPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AddFileButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
