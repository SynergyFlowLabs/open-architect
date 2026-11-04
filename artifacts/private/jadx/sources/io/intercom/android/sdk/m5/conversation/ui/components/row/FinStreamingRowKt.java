package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.material3.o6;
import androidx.compose.material3.u10;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.p3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFinStreamingRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinStreamingRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/FinStreamingRowKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 13 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,161:1\n70#2:162\n67#2,9:163\n77#2:202\n80#3,6:172\n87#3,3:187\n90#3,2:196\n94#3:201\n391#4,9:178\n400#4,3:198\n4360#5,6:190\n1282#6,6:203\n1282#6,6:212\n1282#6,6:218\n75#7:209\n1#8:210\n113#9:211\n30#10:224\n53#11,3:225\n53#11,3:229\n53#11,3:233\n33#12:228\n33#13:232\n*S KotlinDebug\n*F\n+ 1 FinStreamingRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/FinStreamingRowKt\n*L\n47#1:162\n47#1:163,9\n47#1:202\n47#1:172,6\n47#1:187,3\n47#1:196,2\n47#1:201\n47#1:178,9\n47#1:198,3\n47#1:190,6\n95#1:203,6\n100#1:212,6\n121#1:218,6\n96#1:209\n97#1:211\n113#1:224\n113#1:225,3\n114#1:229,3\n115#1:233,3\n114#1:228\n115#1:232\n*E\n"})
public final class FinStreamingRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FinStreamingBlock(@NotNull final BlockRenderData blockRenderData, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1420678116);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final boolean z11 = (i11 & 4) != 0 ? false : z10;
        c0VarR.E(-382486785);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(null, null, 2, null);
            c0VarR.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        c0VarR.A();
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
        Pair pair = TuplesKt.to(Float.valueOf(dVar.S7(androidx.compose.ui.unit.h.r(3)) * dVar.m0()), Float.valueOf(dVar.S7(androidx.compose.ui.unit.h.r(12)) * dVar.m0()));
        final float fFloatValue = ((Number) pair.component1()).floatValue();
        final float fFloatValue2 = ((Number) pair.component2()).floatValue();
        c0VarR.E(-382476587);
        boolean zI = ((((i10 & 896) ^ a5.S0) > 256 && c0VarR.G(z11)) || (i10 & a5.S0) == 256) | c0VarR.I(fFloatValue2) | c0VarR.I(fFloatValue);
        Object objI1 = c0VarR.i0();
        if (zI || objI1 == aVar.a()) {
            objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z11, n3Var, fFloatValue2, fFloatValue, (androidx.compose.ui.graphics.drawscope.c) obj);
                }
            };
            c0VarR.Y(objI1);
        }
        c0VarR.A();
        androidx.compose.ui.a0 a0VarD = androidx.compose.ui.draw.n.d(a0Var2, (Function1) objI1);
        c0VarR.E(-382442246);
        Object objI2 = c0VarR.i0();
        if (objI2 == aVar.a()) {
            objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.u0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(n3Var, (p3) obj);
                }
            };
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        BlockViewKt.BlockView(a0VarD, blockRenderData, false, null, false, null, null, null, null, false, null, (Function1) objI2, c0VarR, 64, 48, 2044);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.v0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinStreamingRowKt.FinStreamingBlock$lambda$9(blockRenderData, a0Var2, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingBlock$lambda$6$lambda$5(boolean z10, n3 layoutResult, float f10, float f11, androidx.compose.ui.graphics.drawscope.c drawWithContent) {
        p3 p3Var;
        Intrinsics.checkNotNullParameter(layoutResult, "$layoutResult");
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.E4();
        if (z10 && (p3Var = (p3) layoutResult.getValue()) != null) {
            int iO = p3Var.o() - 1;
            float fN = p3Var.n(iO) - p3Var.w(iO);
            float fU = p3Var.u(iO) + 12.0f;
            float fW = p3Var.w(iO);
            float f12 = 2;
            androidx.compose.ui.graphics.drawscope.f.y8(drawWithContent, androidx.compose.ui.graphics.q0.f38131b.a(), n0.g.g((((long) Float.floatToRawIntBits(fW + ((fN / f12) - (f10 / f12)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fU)) << 32)), n0.n.f((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)), n0.a.e((((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32)), null, 0.0f, null, 0, 240, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingBlock$lambda$8$lambda$7(n3 layoutResult, p3 it) {
        Intrinsics.checkNotNullParameter(layoutResult, "$layoutResult");
        Intrinsics.checkNotNullParameter(it, "it");
        layoutResult.setValue(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingBlock$lambda$9(BlockRenderData blockRenderData, androidx.compose.ui.a0 a0Var, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        FinStreamingBlock(blockRenderData, a0Var, z10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FinStreamingRow(@NotNull final List<? extends Block> blocks, @NotNull final StreamingPart streamingPart, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(streamingPart, "streamingPart");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-918532595);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final FinRowStyle finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, c0VarR, 6);
        androidx.compose.ui.a0 a0VarP = d5.p(a0Var2, finRowStyle.getRowPadding());
        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
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
        y7.n(c0VarD, a1VarK, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        u10.c(null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m315getColor0d7_KjU(), 0L, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), androidx.compose.runtime.internal.w.e(610304332, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$FinStreamingRow$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i12) {
                androidx.compose.runtime.c0 c0Var3 = c0Var2;
                if ((i12 & 11) == 2 && c0Var3.d()) {
                    c0Var3.u();
                    return;
                }
                androidx.compose.ui.a0 a0VarP2 = d5.p(androidx.compose.ui.a0.E, finRowStyle.getBubbleStyle().getPadding());
                androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(16));
                StreamingPart streamingPart2 = streamingPart;
                List<Block> list = blocks;
                FinRowStyle finRowStyle2 = finRowStyle;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, androidx.compose.ui.e.f37317a.u(), c0Var3, 6);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                androidx.compose.runtime.b1 b1VarK2 = c0Var3.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var3, a0VarP2);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A2);
                } else {
                    c0Var3.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var3);
                y7.n(c0VarD2, a1VarB, aVar2.e());
                y7.n(c0VarD2, b1VarK2, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar2.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                Metadata metadata = streamingPart2.getMetadata();
                c0Var3.E(-989627254);
                if (metadata != null) {
                    List<Avatar> avatars = metadata.getAvatars();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                    Iterator<T> it = avatars.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                    }
                    FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), null, false, null, c0Var2, 196616, 196);
                    c0Var3 = c0Var2;
                }
                c0Var3.A();
                c0Var3.E(-989612763);
                int i13 = 0;
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    FinStreamingRowKt.FinStreamingBlock(new BlockRenderData((Block) obj, androidx.compose.ui.graphics.q0.n(o6.g(finRowStyle2.getBubbleStyle().m315getColor0d7_KjU(), c0Var3, 0)), null, null, BlockRenderTextStyle.m433copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0L, null, 0L, null, androidx.compose.ui.graphics.q0.n(IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), androidx.compose.ui.draw.j.a(androidx.compose.ui.a0.E, finRowStyle2.getContentShape()), i13 == CollectionsKt.getLastIndex(list), c0Var3, 8, 0);
                    c0Var3 = c0Var2;
                    i13 = i14;
                }
                c0Var2.A();
                c0Var2.o();
            }
        }, c0VarR, 54), c0VarR, 12582912, 57);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.w0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinStreamingRowKt.FinStreamingRow$lambda$1(blocks, streamingPart, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingRow$lambda$1(List blocks, StreamingPart streamingPart, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blocks, "$blocks");
        Intrinsics.checkNotNullParameter(streamingPart, "$streamingPart");
        FinStreamingRow(blocks, streamingPart, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FinStreamingRowPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1248993407);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinStreamingRowKt.INSTANCE.m293getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.x0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinStreamingRowKt.FinStreamingRowPreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingRowPreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FinStreamingRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
