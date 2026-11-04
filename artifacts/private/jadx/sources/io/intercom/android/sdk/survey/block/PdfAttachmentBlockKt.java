package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPdfAttachmentBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PdfAttachmentBlock.kt\nio/intercom/android/sdk/survey/block/PdfAttachmentBlockKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n113#2:216\n113#2:219\n113#2:220\n113#2:221\n113#2:222\n113#2:260\n113#2:261\n113#2:304\n75#3:217\n75#3:218\n99#4:223\n96#4,9:224\n106#4:265\n80#5,6:233\n87#5,3:248\n90#5,2:257\n94#5:264\n80#5,6:272\n87#5,3:287\n90#5,2:296\n94#5:301\n391#6,9:239\n400#6:259\n401#6,2:262\n391#6,9:278\n400#6,3:298\n4360#7,6:251\n4360#7,6:290\n87#8,6:266\n94#8:302\n1#9:303\n*S KotlinDebug\n*F\n+ 1 PdfAttachmentBlock.kt\nio/intercom/android/sdk/survey/block/PdfAttachmentBlockKt\n*L\n55#1:216\n91#1:219\n92#1:220\n93#1:221\n94#1:222\n99#1:260\n103#1:261\n160#1:304\n56#1:217\n57#1:218\n64#1:223\n64#1:224,9\n64#1:265\n64#1:233,6\n64#1:248,3\n64#1:257,2\n64#1:264\n115#1:272,6\n115#1:287,3\n115#1:296,2\n115#1:301\n64#1:239,9\n64#1:259\n64#1:262,2\n115#1:278,9\n115#1:298,3\n64#1:251,6\n115#1:290,6\n115#1:266,6\n115#1:302\n*E\n"})
public final class PdfAttachmentBlockKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: PdfAttachmentBlock-ww6aTOc, reason: not valid java name */
    public static final void m457PdfAttachmentBlockww6aTOc(@NotNull final BlockAttachment blockAttachment, final boolean z10, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        long jM714getPrimaryText0d7_KjU;
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        long j11;
        Intrinsics.checkNotNullParameter(blockAttachment, "blockAttachment");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(369048797);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
        } else {
            jM714getPrimaryText0d7_KjU = j10;
            i12 = i10;
        }
        float fR = androidx.compose.ui.unit.h.r(90);
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
        final String strD = u0.i.d(R.string.intercom_permission_denied, c0VarR, 0);
        final String strD2 = u0.i.d(R.string.intercom_file_saved, c0VarR, 0);
        final String strD3 = u0.i.d(R.string.intercom_something_went_wrong_try_again, c0VarR, 0);
        final String strD4 = u0.i.d(R.string.intercom_saving, c0VarR, 0);
        String url = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        String str = (String) CollectionsKt.first(StringsKt.split$default(url, new String[]{com.planner5d.library.model.payments.a.f222474i}, false, 0, 6, null));
        androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
        float f10 = 4;
        androidx.compose.ui.a0 a0VarU = d5.u(i1.j(i6.H(a0Var2, null, false, 3, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$0(context, blockAttachment, strD4, strD2, strD3, strD);
            }
        }, 15, null), androidx.compose.ui.unit.h.r(z10 ? 16 : 4), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(z10 ? 4 : 16), androidx.compose.ui.unit.h.r(f10));
        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0VarR, 48);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarU);
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
        if (z10) {
            c0VarR.E(189348674);
            c0Var2 = c0VarR;
            m458PdfDetailsFNF3uiM(y5Var, blockAttachment, jM714getPrimaryText0d7_KjU, true, c0Var2, 3142 | ((i12 >> 3) & 896));
            l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
            m459PdfThumbnail3xixttE(context, str, blockAttachment, dVar, fR, c0Var2, 25096);
            c0Var2.A();
            j11 = jM714getPrimaryText0d7_KjU;
        } else {
            c0Var2 = c0VarR;
            c0Var2.E(189553057);
            m459PdfThumbnail3xixttE(context, str, blockAttachment, dVar, fR, c0Var2, 25096);
            l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
            j11 = jM714getPrimaryText0d7_KjU;
            m458PdfDetailsFNF3uiM(y5Var, blockAttachment, j11, false, c0Var2, 3142 | ((i12 >> 3) & 896));
            c0Var2.A();
        }
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final long j12 = j11;
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$2(blockAttachment, z10, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PdfAttachmentBlockPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1883421095);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m452getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdfAttachmentBlockKt.PdfAttachmentBlockPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfAttachmentBlockPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PdfAttachmentBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfAttachmentBlock_ww6aTOc$lambda$0(Context context, BlockAttachment blockAttachment, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        Intrinsics.checkNotNullParameter(fileSavingText, "$fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "$fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "$saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "$permissionDeniedText");
        IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
        String url = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        List listListOf = CollectionsKt.listOf(new IntercomPreviewFile.NetworkFile(url, "application/pdf"));
        String url2 = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
        context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listListOf, null, null, false, new DownloadState(url2.length() > 0, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText), 14, null)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfAttachmentBlock_ww6aTOc$lambda$2(BlockAttachment blockAttachment, boolean z10, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        m457PdfAttachmentBlockww6aTOc(blockAttachment, z10, a0Var, j10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: PdfDetails-FNF3uiM, reason: not valid java name */
    private static final void m458PdfDetailsFNF3uiM(final x5 x5Var, final BlockAttachment blockAttachment, final long j10, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1205911716);
        androidx.compose.ui.a0 a0VarH = x5Var.h(androidx.compose.ui.a0.E, 1.0f, false);
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), z10 ? aVar.u() : aVar.s(), c0VarR, 6);
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
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        String name = blockAttachment.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        y3 type04 = intercomTheme.getTypography(c0VarR, i11).getType04();
        androidx.compose.ui.text.style.v.a aVar3 = androidx.compose.ui.text.style.v.f42256b;
        int i12 = i10 & 896;
        q50.t(name, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, type04, c0VarR, i12, 24960, 110586);
        String humanFileSize = blockAttachment.getHumanFileSize();
        Intrinsics.checkNotNullExpressionValue(humanFileSize, "getHumanFileSize(...)");
        q50.t(humanFileSize, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, intercomTheme.getTypography(c0VarR, i11).getType05(), c0VarR, i12, 24960, 110586);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdfAttachmentBlockKt.PdfDetails_FNF3uiM$lambda$4(x5Var, blockAttachment, j10, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfDetails_FNF3uiM$lambda$4(x5 this_PdfDetails, BlockAttachment blockAttachment, long j10, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(this_PdfDetails, "$this_PdfDetails");
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        m458PdfDetailsFNF3uiM(this_PdfDetails, blockAttachment, j10, z10, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    /* JADX INFO: renamed from: PdfThumbnail-3xixttE, reason: not valid java name */
    private static final void m459PdfThumbnail3xixttE(final Context context, final String str, final BlockAttachment blockAttachment, final androidx.compose.ui.unit.d dVar, final float f10, androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1296049859);
        coil.request.i iVarF = new coil.request.i.a(context).H(str).o(str).j(blockAttachment.getUrl()).e0((int) dVar.S7(f10), (int) dVar.S7(f10)).i(true).r(R.drawable.intercom_image_load_failed).f();
        coil.j imageLoader = IntercomImageLoaderKt.getImageLoader(context);
        String name = blockAttachment.getName();
        androidx.compose.ui.a0 a0VarW = i6.w(androidx.compose.ui.draw.j.a(androidx.compose.ui.a0.E, androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(5))), f10);
        androidx.compose.ui.layout.l lVarA = androidx.compose.ui.layout.l.f39405a.a();
        ComposableSingletons$PdfAttachmentBlockKt composableSingletons$PdfAttachmentBlockKt = ComposableSingletons$PdfAttachmentBlockKt.INSTANCE;
        coil.compose.a0.f(iVarF, name, imageLoader, a0VarW, null, composableSingletons$PdfAttachmentBlockKt.m449getLambda1$intercom_sdk_base_release(), null, composableSingletons$PdfAttachmentBlockKt.m450getLambda2$intercom_sdk_base_release(), null, null, null, null, lVarA, 0.0f, null, 0, false, null, c0VarR, 12780040, a5.S0, 257872);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdfAttachmentBlockKt.PdfThumbnail_3xixttE$lambda$7(context, str, blockAttachment, dVar, f10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfThumbnail_3xixttE$lambda$7(Context context, String str, BlockAttachment blockAttachment, androidx.compose.ui.unit.d density, float f10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        Intrinsics.checkNotNullParameter(density, "$density");
        m459PdfThumbnail3xixttE(context, str, blockAttachment, density, f10, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
