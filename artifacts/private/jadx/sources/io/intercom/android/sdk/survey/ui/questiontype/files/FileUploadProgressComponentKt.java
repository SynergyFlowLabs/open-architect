package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFileUploadProgressComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUploadProgressComponent.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileUploadProgressComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,59:1\n87#2:60\n84#2,9:61\n94#2:102\n80#3,6:70\n87#3,3:85\n90#3,2:94\n94#3:101\n391#4,9:76\n400#4:96\n401#4,2:99\n4360#5,6:88\n113#6:97\n113#6:98\n*S KotlinDebug\n*F\n+ 1 FileUploadProgressComponent.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileUploadProgressComponentKt\n*L\n21#1:60\n21#1:61,9\n21#1:102\n21#1:70,6\n21#1:85,3\n21#1:94,2\n21#1:101\n21#1:76,9\n21#1:96\n21#1:99,2\n21#1:88,6\n29#1:97\n36#1:98\n*E\n"})
public final class FileUploadProgressComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FileUploadProgressComponent(@NotNull final String title, @NotNull Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        final Function0<Unit> onStopUploading = function0;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onStopUploading, "onStopUploading");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1826067636);
        if ((i10 & 14) == 0) {
            i11 = i10 | (c0VarR.D(title) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(onStopUploading) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            c0Var2 = c0VarR;
            q50.t(title, d5.r(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0Var2, (i12 & 14) | 48, 0, 131068);
            IntercomDividerKt.IntercomDivider(d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(4), 1, null), c0Var2, 6, 0);
            FileUploadErrorComponentKt.m507ActionRowFHprtrg(null, R.drawable.intercom_close, R.string.intercom_stop_upload, 0, 0L, function0, c0Var2, (i12 << 12) & 458752, 25);
            onStopUploading = function0;
            c0Var2.o();
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileUploadProgressComponentKt.FileUploadProgressComponent$lambda$1(title, onStopUploading, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileUploadProgressComponent$lambda$1(String title, Function0 onStopUploading, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(onStopUploading, "$onStopUploading");
        FileUploadProgressComponent(title, onStopUploading, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UploadingActionSheetContentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2021767087);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadProgressComponentKt.INSTANCE.m504getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileUploadProgressComponentKt.UploadingActionSheetContentPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadingActionSheetContentPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UploadingActionSheetContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
