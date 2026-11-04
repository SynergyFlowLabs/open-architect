package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAttachmentBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachmentBlock.kt\nio/intercom/android/sdk/survey/block/AttachmentBlockKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,106:1\n113#2:107\n113#2:151\n87#3:108\n85#3,8:109\n94#3:149\n80#4,6:117\n87#4,3:132\n90#4,2:141\n94#4:148\n80#4,6:158\n87#4,3:173\n90#4,2:182\n94#4:187\n391#5,9:123\n400#5:143\n401#5,2:146\n391#5,9:164\n400#5,3:184\n4360#6,6:135\n4360#6,6:176\n1863#7,2:144\n75#8:150\n99#9,6:152\n106#9:188\n*S KotlinDebug\n*F\n+ 1 AttachmentBlock.kt\nio/intercom/android/sdk/survey/block/AttachmentBlockKt\n*L\n30#1:107\n61#1:151\n30#1:108\n30#1:109,8\n30#1:149\n30#1:117,6\n30#1:132,3\n30#1:141,2\n30#1:148\n54#1:158,6\n54#1:173,3\n54#1:182,2\n54#1:187\n30#1:123,9\n30#1:143\n30#1:146,2\n54#1:164,9\n54#1:184,3\n30#1:135,6\n54#1:176,6\n35#1:144,2\n53#1:150\n54#1:152,6\n54#1:188\n*E\n"})
public final class AttachmentBlockKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AttachmentBlock(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockRenderData blockRenderData, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0Var2;
        long j10;
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1719159681);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8)), androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
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
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        androidx.compose.ui.graphics.q0 q0VarM444getTextColorQN2ZGVo = blockRenderData.getTextStyle().m444getTextColorQN2ZGVo();
        if (q0VarM444getTextColorQN2ZGVo == null) {
            q0VarM444getTextColorQN2ZGVo = blockRenderData.m432getTextColorQN2ZGVo();
        }
        c0VarR.E(-1626976079);
        long jM714getPrimaryText0d7_KjU = q0VarM444getTextColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU() : q0VarM444getTextColorQN2ZGVo.M();
        c0VarR.A();
        c0VarR.E(-1626970016);
        List<BlockAttachment> attachments = blockRenderData.getBlock().getAttachments();
        Intrinsics.checkNotNullExpressionValue(attachments, "getAttachments(...)");
        for (BlockAttachment blockAttachment : attachments) {
            String contentType = blockAttachment.getContentType();
            Intrinsics.checkNotNullExpressionValue(contentType, "getContentType(...)");
            if (ContentTypeExtensionKt.isVideo(contentType)) {
                c0VarR.E(1321275707);
                Intrinsics.checkNotNull(blockAttachment);
                VideoAttachmentBlock(androidx.compose.ui.draw.j.a(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m()), blockAttachment, c0VarR, 64, 0);
                c0VarR.A();
                c0Var2 = c0VarR;
                j10 = jM714getPrimaryText0d7_KjU;
            } else {
                String contentType2 = blockAttachment.getContentType();
                Intrinsics.checkNotNullExpressionValue(contentType2, "getContentType(...)");
                if (ContentTypeExtensionKt.isPdf(contentType2)) {
                    c0VarR.E(1321435977);
                    Intrinsics.checkNotNull(blockAttachment);
                    c0Var2 = c0VarR;
                    j10 = jM714getPrimaryText0d7_KjU;
                    PdfAttachmentBlockKt.m457PdfAttachmentBlockww6aTOc(blockAttachment, z10, null, j10, c0Var2, ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B) | 8, 4);
                    c0Var2.A();
                } else {
                    androidx.compose.runtime.c0 c0Var3 = c0VarR;
                    long j11 = jM714getPrimaryText0d7_KjU;
                    c0Var3.E(1321554459);
                    Intrinsics.checkNotNull(blockAttachment);
                    m428TextAttachmentBlockFNF3uiM(null, blockAttachment, j11, c0Var3, 64, 1);
                    c0Var2 = c0Var3;
                    j10 = j11;
                    c0Var2.A();
                }
            }
            jM714getPrimaryText0d7_KjU = j10;
            c0VarR = c0Var2;
        }
        androidx.compose.runtime.c0 c0Var4 = c0VarR;
        c0Var4.A();
        c0Var4.o();
        s5 s5VarT = c0Var4.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var2 = a0Var;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachmentBlockKt.AttachmentBlock$lambda$2(a0Var2, blockRenderData, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachmentBlock$lambda$2(androidx.compose.ui.a0 a0Var, BlockRenderData blockRenderData, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        AttachmentBlock(a0Var, blockRenderData, z10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void AttachmentBlockPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-550090117);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 0 << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttachmentBlockKt.INSTANCE.m446getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachmentBlockKt.AttachmentBlockPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachmentBlockPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AttachmentBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: TextAttachmentBlock-FNF3uiM, reason: not valid java name */
    public static final void m428TextAttachmentBlockFNF3uiM(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockAttachment blockAttachment, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        long jM714getPrimaryText0d7_KjU;
        int i12;
        Intrinsics.checkNotNullParameter(blockAttachment, "blockAttachment");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1146554998);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        if ((i11 & 4) != 0) {
            jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
            i12 = i10 & (-897);
        } else {
            jM714getPrimaryText0d7_KjU = j10;
            i12 = i10;
        }
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.a0 a0VarJ = i1.j(a0Var2, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$3(blockAttachment, context);
            }
        }, 15, null);
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(4)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
        final long j11 = jM714getPrimaryText0d7_KjU;
        ni.o(u0.e.c(R.drawable.intercom_ic_attachment, c0VarR, 0), "Attachment Icon", null, j11, c0VarR, ((i12 << 3) & 7168) | 56, 4);
        String name = blockAttachment.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        q50.t(name, null, j11, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null), c0VarR, i12 & 896, 0, 131066);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$5(a0Var3, blockAttachment, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttachmentBlock_FNF3uiM$lambda$3(BlockAttachment blockAttachment, Context context) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        Intrinsics.checkNotNullParameter(context, "$context");
        LinkOpener.handleUrl(blockAttachment.getUrl(), context, Injector.get().getApi());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttachmentBlock_FNF3uiM$lambda$5(androidx.compose.ui.a0 a0Var, BlockAttachment blockAttachment, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        m428TextAttachmentBlockFNF3uiM(a0Var, blockAttachment, j10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void VideoAttachmentBlock(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockAttachment blockAttachment, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(blockAttachment, "blockAttachment");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-745319067);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        String url = blockAttachment.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        VideoFileBlockKt.VideoFileBlock(a0Var2, url, null, c0VarR, (i10 & 14) | a5.S0, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachmentBlockKt.VideoAttachmentBlock$lambda$6(a0Var2, blockAttachment, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoAttachmentBlock$lambda$6(androidx.compose.ui.a0 a0Var, BlockAttachment blockAttachment, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockAttachment, "$blockAttachment");
        VideoAttachmentBlock(a0Var, blockAttachment, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
