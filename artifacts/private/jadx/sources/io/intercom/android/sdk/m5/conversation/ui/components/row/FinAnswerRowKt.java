package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.material3.o6;
import androidx.compose.material3.u10;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nFinAnswerRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinAnswerRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/FinAnswerRowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,249:1\n1#2:250\n113#3:251\n113#3:252\n113#3:253\n113#3:254\n113#3:255\n113#3:256\n113#3:306\n99#4:257\n96#4,9:258\n106#4:316\n80#5,6:267\n87#5,3:282\n90#5,2:291\n94#5:315\n391#6,9:273\n400#6:293\n401#6,2:313\n4360#7,6:285\n1282#8,6:294\n1282#8,6:300\n1282#8,6:307\n85#9:317\n117#9,2:318\n*S KotlinDebug\n*F\n+ 1 FinAnswerRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/FinAnswerRowKt\n*L\n129#1:251\n130#1:252\n134#1:253\n149#1:254\n151#1:255\n153#1:256\n190#1:306\n168#1:257\n168#1:258,9\n168#1:316\n168#1:267,6\n168#1:282,3\n168#1:291,2\n168#1:315\n168#1:273,9\n168#1:293\n168#1:313,2\n168#1:285,6\n180#1:294,6\n184#1:300,6\n191#1:307,6\n180#1:317\n180#1:318,2\n*E\n"})
public final class FinAnswerRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FinAnswerMetadata(@NotNull final List<AvatarWrapper> avatars, @NotNull final String title, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable Long l10, @Nullable AiAnswerInfo aiAnswerInfo, boolean z10, @Nullable Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        AiAnswerInfo aiAnswerInfo2;
        final boolean z11;
        final Function0<Unit> function1;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(title, "title");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-93262433);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final String str2 = (i11 & 8) != 0 ? null : str;
        final Long l11 = (i11 & 16) != 0 ? null : l10;
        AiAnswerInfo aiAnswerInfo3 = (i11 & 32) != 0 ? null : aiAnswerInfo;
        boolean z12 = (i11 & 64) != 0 ? false : z10;
        Function0<Unit> function2 = (i11 & 128) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        androidx.compose.ui.a0 a0VarH = i6.h(a0Var2, 0.0f, 1, null);
        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
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
        MessageMetadataKt.MessageMetadata(avatars, title, y5Var.h(aVar2, 1.0f, true), str2, l11, c0VarR, (i10 & com.planner5d.library.engine.input.f.b.B) | 8 | (i10 & 7168) | (57344 & i10), 0);
        c0VarR.E(1671218723);
        if (aiAnswerInfo3 == null) {
            aiAnswerInfo2 = aiAnswerInfo3;
            z11 = z12;
            function1 = function2;
        } else {
            c0VarR.E(1468237645);
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar3 = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar3.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            final n3 n3Var = (n3) objI0;
            c0VarR.A();
            c0VarR.E(1671220792);
            if (FinAnswerMetadata$lambda$12$lambda$11$lambda$5(n3Var)) {
                c0VarR.E(1468242817);
                Object objI1 = c0VarR.i0();
                if (objI1 == aVar3.a()) {
                    objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.n0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinAnswerRowKt.FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7(n3Var);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                AiAnswerInfo aiAnswerInfo4 = aiAnswerInfo3;
                boolean z13 = z12;
                Function0<Unit> function3 = function2;
                AnswerInfoDialogKt.AnswerInfoDialog(aiAnswerInfo4, z13, (Function0) objI1, function3, c0VarR, ((i10 >> 15) & com.planner5d.library.engine.input.f.b.B) | a5.S0 | ((i10 >> 12) & 7168), 0);
                aiAnswerInfo2 = aiAnswerInfo4;
                z11 = z13;
                function1 = function3;
            } else {
                aiAnswerInfo2 = aiAnswerInfo3;
                z11 = z12;
                function1 = function2;
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarW = i6.w(aVar2, androidx.compose.ui.unit.h.r(24));
            c0VarR.E(1468251936);
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar3.a()) {
                objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinAnswerRowKt.FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9(n3Var);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            ei.D((Function0) objI2, a0VarW, false, null, null, null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m291getLambda1$intercom_sdk_base_release(), c0VarR, 1572918, 60);
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final AiAnswerInfo aiAnswerInfo5 = aiAnswerInfo2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinAnswerRowKt.FinAnswerMetadata$lambda$13(avatars, title, a0Var3, str2, l11, aiAnswerInfo5, z11, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9(n3 showDialog$delegate) {
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        FinAnswerMetadata$lambda$12$lambda$11$lambda$6(showDialog$delegate, true);
        return Unit.f312394a;
    }

    private static final boolean FinAnswerMetadata$lambda$12$lambda$11$lambda$5(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void FinAnswerMetadata$lambda$12$lambda$11$lambda$6(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7(n3 showDialog$delegate) {
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        FinAnswerMetadata$lambda$12$lambda$11$lambda$6(showDialog$delegate, false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerMetadata$lambda$13(List avatars, String title, androidx.compose.ui.a0 a0Var, String str, Long l10, AiAnswerInfo aiAnswerInfo, boolean z10, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(title, "$title");
        FinAnswerMetadata(avatars, title, a0Var, str, l10, aiAnswerInfo, z10, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FinAnswerRow(@NotNull final Part conversationPart, @NotNull final GroupingPosition groupingPosition, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @NotNull final Function1<? super List<InlineSource>, Unit> onInlineSourcesClick, boolean z10, @Nullable Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
        Intrinsics.checkNotNullParameter(onInlineSourcesClick, "onInlineSourcesClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1672821743);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        String str2 = (i11 & 8) != 0 ? null : str;
        final boolean z11 = (i11 & 32) != 0 ? true : z10;
        final Function0<Unit> function1 = (i11 & 64) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        int i12 = i10 >> 3;
        final FinRowStyle finRowStyle = getFinRowStyle(groupingPosition, c0VarR, i12 & 14);
        final String str3 = str2;
        ClickableMessageRowKt.ClickableMessageRow(conversationPart, a0Var2, str2 != null ? new BottomMetadata(str2, 0.0f, false, 6, null) : null, finRowStyle.getRowAlignment(), finRowStyle.getRowPadding(), null, androidx.compose.runtime.internal.w.e(813335324, true, new pj.p<androidx.compose.foundation.layout.m0, Part, Function0<? extends Unit>, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.FinAnswerRow.3
            @Override // pj.p
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, Part part, Function0<? extends Unit> function2, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(m0Var, part, (Function0<Unit>) function2, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.layout.m0 ClickableMessageRow, final Part part, final Function0<Unit> onClick, androidx.compose.runtime.c0 c0Var2, int i13) {
                Intrinsics.checkNotNullParameter(ClickableMessageRow, "$this$ClickableMessageRow");
                Intrinsics.checkNotNullParameter(part, "part");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                q3 shape = finRowStyle.getBubbleStyle().getShape();
                long jM315getColor0d7_KjU = finRowStyle.getBubbleStyle().m315getColor0d7_KjU();
                androidx.compose.foundation.a1 borderStroke = finRowStyle.getBubbleStyle().getBorderStroke();
                final FinRowStyle finRowStyle2 = finRowStyle;
                final boolean z12 = z11;
                final Function0<Unit> function2 = function1;
                final Function1<List<InlineSource>, Unit> function3 = onInlineSourcesClick;
                u10.c(null, shape, jM315getColor0d7_KjU, 0L, 0.0f, 0.0f, borderStroke, androidx.compose.runtime.internal.w.e(1447194679, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.FinAnswerRow.3.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                        androidx.compose.runtime.c0 c0Var4 = c0Var3;
                        if ((i14 & 11) == 2 && c0Var4.d()) {
                            c0Var4.u();
                            return;
                        }
                        androidx.compose.ui.a0 a0VarP = d5.p(androidx.compose.ui.a0.E, finRowStyle2.getBubbleStyle().getPadding());
                        androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(16));
                        Part part2 = part;
                        boolean z13 = z12;
                        Function0<Unit> function4 = function2;
                        FinRowStyle finRowStyle3 = finRowStyle2;
                        Function0<Unit> function5 = onClick;
                        Function1<List<InlineSource>, Unit> function6 = function3;
                        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, androidx.compose.ui.e.f37317a.u(), c0Var4, 6);
                        int i15 = 0;
                        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var4, 0));
                        androidx.compose.runtime.b1 b1VarK = c0Var4.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var4, a0VarP);
                        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                        if (c0Var4.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var4.q();
                        if (c0Var4.P()) {
                            c0Var4.q0(function0A);
                        } else {
                            c0Var4.l();
                        }
                        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var4);
                        y7.n(c0VarD, a1VarB, aVar.e());
                        y7.n(c0VarD, b1VarK, aVar.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar.f());
                        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                        Metadata metadata = part2.getMetadata();
                        c0Var4.E(-179725371);
                        if (metadata != null) {
                            List<Avatar> avatars = metadata.getAvatars();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                            Iterator<T> it = avatars.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                            }
                            FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), part2.getAiAnswerInfo(), z13, function4, c0Var4, 8, 4);
                        }
                        c0Var4.A();
                        c0Var4.E(-179706024);
                        List<Block> blocks = part2.getBlocks();
                        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                        for (Block block : blocks) {
                            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(androidx.compose.ui.a0.E, finRowStyle3.getContentShape());
                            Intrinsics.checkNotNull(block);
                            Function1<List<InlineSource>, Unit> function7 = function6;
                            Function0<Unit> function8 = function5;
                            BlockViewKt.BlockView(a0VarA, new BlockRenderData(block, androidx.compose.ui.graphics.q0.n(o6.g(finRowStyle3.getBubbleStyle().m315getColor0d7_KjU(), c0Var4, i15)), null, null, BlockRenderTextStyle.m433copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0L, null, 0L, null, androidx.compose.ui.graphics.q0.n(IntercomTheme.INSTANCE.getColors(c0Var4, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), false, null, false, null, null, function8, null, true, function7, null, c0Var3, 805306432, 0, 2428);
                            c0Var4 = c0Var3;
                            function5 = function8;
                            function6 = function7;
                            finRowStyle3 = finRowStyle3;
                            i15 = i15;
                        }
                        c0Var3.A();
                        c0Var3.o();
                    }
                }, c0Var2, 54), c0Var2, 12582912, 57);
            }
        }, c0VarR, 54), c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572872, 32);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final boolean z12 = z11;
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            final Function0<Unit> function2 = function1;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinAnswerRowKt.FinAnswerRow$lambda$2(conversationPart, groupingPosition, a0Var3, str3, onInlineSourcesClick, z12, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerRow$lambda$2(Part conversationPart, GroupingPosition groupingPosition, androidx.compose.ui.a0 a0Var, String str, Function1 onInlineSourcesClick, boolean z10, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "$groupingPosition");
        Intrinsics.checkNotNullParameter(onInlineSourcesClick, "$onInlineSourcesClick");
        FinAnswerRow(conversationPart, groupingPosition, a0Var, str, onInlineSourcesClick, z10, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FinAnswerRowPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1987882525);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m292getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.q0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinAnswerRowKt.FinAnswerRowPreview$lambda$14(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerRowPreview$lambda$14(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FinAnswerRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final FinRowStyle getFinRowStyle(@NotNull GroupingPosition groupingPosition, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
        c0Var.E(1658672574);
        float fR = androidx.compose.ui.unit.h.r(20);
        float fR2 = androidx.compose.ui.unit.h.r(4);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        long jM687getAdminBackground0d7_KjU = intercomTheme.getColors(c0Var, i11).m687getAdminBackground0d7_KjU();
        float f10 = 16;
        g5 g5VarG = d5.g(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(12));
        float f11 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? fR2 : fR;
        if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
            fR2 = fR;
        }
        FinRowStyle finRowStyle = new FinRowStyle(new FinRowStyle.BubbleStyle(jM687getAdminBackground0d7_KjU, g5VarG, androidx.compose.foundation.shape.o.i(f11, fR, fR, fR2), androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), intercomTheme.getColors(c0Var, i11).m688getAdminBorder0d7_KjU()), null), androidx.compose.ui.e.f37317a.u(), d5.j(androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 10, null), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(8)));
        c0Var.A();
        return finRowStyle;
    }
}
