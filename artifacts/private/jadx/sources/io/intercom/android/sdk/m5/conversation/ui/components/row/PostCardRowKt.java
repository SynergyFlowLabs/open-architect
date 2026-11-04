package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Arrays;
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
@SourceDebugExtension({"SMAP\nPostCardRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCardRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/PostCardRowKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n75#2:205\n75#2:208\n113#3:206\n113#3:207\n113#3:284\n113#3:285\n113#3:290\n113#3:293\n113#3:294\n113#3:295\n87#4:209\n84#4,9:210\n94#4:300\n80#5,6:219\n87#5,3:234\n90#5,2:243\n80#5,6:257\n87#5,3:272\n90#5,2:281\n94#5:288\n94#5:299\n391#6,9:225\n400#6:245\n391#6,9:263\n400#6:283\n401#6,2:286\n401#6,2:297\n4360#7,6:237\n4360#7,6:275\n99#8:246\n95#8,10:247\n106#8:289\n1872#9,2:291\n1874#9:296\n*S KotlinDebug\n*F\n+ 1 PostCardRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/PostCardRowKt\n*L\n53#1:205\n132#1:208\n62#1:206\n63#1:207\n136#1:284\n139#1:285\n149#1:290\n168#1:293\n169#1:294\n170#1:295\n133#1:209\n133#1:210,9\n133#1:300\n133#1:219,6\n133#1:234,3\n133#1:243,2\n134#1:257,6\n134#1:272,3\n134#1:281,2\n134#1:288\n133#1:299\n133#1:225,9\n133#1:245\n134#1:263,9\n134#1:283\n134#1:286,2\n133#1:297,2\n133#1:237,6\n134#1:275,6\n134#1:246\n134#1:247,10\n134#1:289\n150#1:291,2\n150#1:296\n*E\n"})
public final class PostCardRowKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt$PostCardRow$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nPostCardRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCardRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/PostCardRowKt$PostCardRow$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,204:1\n87#2:205\n83#2,10:206\n87#2:244\n84#2,9:245\n94#2:286\n94#2:290\n80#3,6:216\n87#3,3:231\n90#3,2:240\n80#3,6:254\n87#3,3:269\n90#3,2:278\n94#3:285\n94#3:289\n391#4,9:222\n400#4:242\n391#4,9:260\n400#4:280\n401#4,2:283\n401#4,2:287\n4360#5,6:234\n4360#5,6:272\n113#6:243\n113#6:281\n113#6:282\n113#6:291\n113#6:295\n61#7:292\n70#8:293\n53#8,3:297\n22#9:294\n30#10:296\n*S KotlinDebug\n*F\n+ 1 PostCardRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/PostCardRowKt$PostCardRow$1\n*L\n66#1:205\n66#1:206,10\n88#1:244\n88#1:245,9\n88#1:286\n66#1:290\n66#1:216,6\n66#1:231,3\n66#1:240,2\n88#1:254,6\n88#1:269,3\n88#1:278,2\n88#1:285\n66#1:289\n66#1:222,9\n66#1:242\n88#1:260,9\n88#1:280\n88#1:283,2\n66#1:287,2\n66#1:234,6\n88#1:272,6\n86#1:243\n111#1:281\n117#1:282\n82#1:291\n83#1:295\n83#1:292\n83#1:293\n83#1:297,3\n83#1:294\n83#1:296\n*E\n"})
    static final class AnonymousClass1 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ long $actionColor;
        final /* synthetic */ String $companyName;
        final /* synthetic */ Context $context;
        final /* synthetic */ Pair<Float, androidx.compose.ui.graphics.q0>[] $gradientColors;
        final /* synthetic */ Part $part;

        AnonymousClass1(Part part, String str, long j10, Pair<Float, androidx.compose.ui.graphics.q0>[] pairArr, Context context) {
            this.$part = part;
            this.$companyName = str;
            this.$actionColor = j10;
            this.$gradientColors = pairArr;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$0(Pair[] gradientColors, androidx.compose.ui.graphics.drawscope.c drawWithContent) {
            Intrinsics.checkNotNullParameter(gradientColors, "$gradientColors");
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            drawWithContent.E4();
            float f10 = 120;
            androidx.compose.ui.graphics.drawscope.f.b3(drawWithContent, androidx.compose.ui.graphics.i0.a.u(androidx.compose.ui.graphics.i0.f37796b, (Pair[]) Arrays.copyOf(gradientColors, gradientColors.length), 0.0f, 0.0f, 0, 14, null), n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithContent.d() & com.rabbitmq.client.k0.f265952a)) - androidx.compose.ui.unit.h.r(f10))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32)), n0.n.h(drawWithContent.d(), 0.0f, androidx.compose.ui.unit.h.r(f10), 1, null), 0.0f, null, null, 0, 120, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$1(Context context, Part part) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(part, "$part");
            context.startActivity(IntercomPostActivity.buildPostIntent(context, part, part.getParentConversation().getId(), part.getParentConversation().lastParticipatingAdmin(), part.getParentConversation().getComposerState().isVisible(), false));
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            final Part part = this.$part;
            String str = this.$companyName;
            long j10 = this.$actionColor;
            final Pair<Float, androidx.compose.ui.graphics.q0>[] pairArr = this.$gradientColors;
            final Context context = this.$context;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            List<Block> blocks = part.getBlocks();
            Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
            String forename = part.getParticipant().getForename();
            Intrinsics.checkNotNullExpressionValue(forename, "getForename(...)");
            Avatar avatar = part.getParticipant().getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            PostCardRowKt.m320PostContentFHprtrg(blocks, forename, str, new AvatarWrapper(avatar, false), j10, d5.r(androidx.compose.ui.draw.n.d(androidx.compose.foundation.layout.m0.o(n0Var, aVar, 1.0f, false, 2, null), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PostCardRowKt.AnonymousClass1.invoke$lambda$3$lambda$0(pairArr, (androidx.compose.ui.graphics.drawscope.c) obj);
                }
            }), androidx.compose.ui.unit.h.r(12)), c0Var, 4104, 0);
            androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.i1.j(androidx.compose.foundation.v.d(a0VarH, intercomTheme.getColors(c0Var, i11).m690getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostCardRowKt.AnonymousClass1.invoke$lambda$3$lambda$1(context, part);
                }
            }, 15, null);
            androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar2.m(), c0Var, 48);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarJ);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var);
            y7.n(c0VarD2, a1VarB2, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            IntercomDividerKt.IntercomDivider(n0Var.p(i6.g(aVar, 0.9f), aVar2.m()), c0Var, 0, 0);
            float f10 = 14;
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
            q50.t(u0.i.d(R.string.intercom_view_post, c0Var, 0), null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04SemiBold(), c0Var, 0, 0, 131066);
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
            c0Var.o();
            c0Var.o();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PostCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(620144177);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PostCardRowKt.INSTANCE.m297getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.h1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostCardRowKt.PostCardPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostCardPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PostCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PostCardRow(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Part part, @NotNull final String companyName, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1691901714);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        IntercomCardKt.IntercomCard(i6.i(d5.s(a0Var2, androidx.compose.ui.unit.h.r(14), androidx.compose.ui.unit.h.r(12)), androidx.compose.ui.unit.h.r(200)), IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.w.e(1178622818, true, new AnonymousClass1(part, companyName, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(c0VarR, i12).m684getAction0d7_KjU()), new Pair[]{TuplesKt.to(Float.valueOf(0.0f), androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU()))}, context), c0VarR, 54), c0VarR, (IntercomCardStyle.Style.$stable << 3) | a5.S0, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.i1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostCardRowKt.PostCardRow$lambda$0(a0Var3, part, companyName, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostCardRow$lambda$0(androidx.compose.ui.a0 a0Var, Part part, String companyName, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(part, "$part");
        Intrinsics.checkNotNullParameter(companyName, "$companyName");
        PostCardRow(a0Var, part, companyName, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: PostContent-FHprtrg, reason: not valid java name */
    public static final void m320PostContentFHprtrg(@NotNull final List<? extends Block> blocks, @NotNull final String participantName, @NotNull final String participantCompanyName, @NotNull final AvatarWrapper participantAvatarWrapper, final long j10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        float fR;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(participantName, "participantName");
        Intrinsics.checkNotNullParameter(participantCompanyName, "participantCompanyName");
        Intrinsics.checkNotNullParameter(participantAvatarWrapper, "participantAvatarWrapper");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1350453300);
        androidx.compose.ui.a0 a0Var2 = (i11 & 32) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
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
        androidx.compose.ui.e.c cVarQ = aVar.q();
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.w(), cVarQ, c0VarR, 48);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarE, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        y5 y5Var = y5.f16577a;
        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar3, androidx.compose.ui.unit.h.r(24)), participantAvatarWrapper, null, false, 0L, null, c0VarR, 70, 60);
        l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(12)), c0VarR, 6);
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        q50.t(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", participantName).put("company", participantCompanyName).format().toString(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, 0, 0, 131070);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        c0Var2.o();
        int i12 = 16;
        float f10 = 16;
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
        c0Var2.E(-83078379);
        Iterator it = blocks.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Block block = (Block) next;
            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = i6.h(aVar4, 0.0f, 1, null);
            long jM = androidx.compose.ui.unit.a0.m(20);
            androidx.compose.ui.text.font.v0.a aVar5 = androidx.compose.ui.text.font.v0.f41742b;
            int i15 = i12;
            androidx.compose.runtime.c0 c0Var3 = c0Var2;
            float f11 = f10;
            Iterator it2 = it;
            BlockViewKt.BlockView(a0VarH, new BlockRenderData(block, null, new BlockRenderTextStyle(jM, aVar5.k(), 0L, androidx.compose.ui.graphics.q0.n(j10), null, null, 52, null), new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(i12), aVar5.m(), 0L, androidx.compose.ui.graphics.q0.n(j10), null, null, 52, null), null, 18, null), false, null, false, null, null, null, null, false, null, null, c0Var3, 70, 0, 4092);
            c0Var2 = c0Var3;
            BlockType type = block.getType();
            int i16 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i16 != 1) {
                fR = i16 != 2 ? androidx.compose.ui.unit.h.r(8) : androidx.compose.ui.unit.h.r(f11);
            } else {
                fR = androidx.compose.ui.unit.h.r(32);
            }
            c0Var2.E(-83051140);
            if (i13 != CollectionsKt.getLastIndex(blocks)) {
                l6.a(i6.i(aVar4, fR), c0Var2, 0);
            }
            c0Var2.A();
            it = it2;
            i13 = i14;
            f10 = f11;
            i12 = i15;
        }
        c0Var2.A();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.g1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostCardRowKt.PostContent_FHprtrg$lambda$4(blocks, participantName, participantCompanyName, participantAvatarWrapper, j10, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContent_FHprtrg$lambda$4(List blocks, String participantName, String participantCompanyName, AvatarWrapper participantAvatarWrapper, long j10, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blocks, "$blocks");
        Intrinsics.checkNotNullParameter(participantName, "$participantName");
        Intrinsics.checkNotNullParameter(participantCompanyName, "$participantCompanyName");
        Intrinsics.checkNotNullParameter(participantAvatarWrapper, "$participantAvatarWrapper");
        m320PostContentFHprtrg(blocks, participantName, participantCompanyName, participantAvatarWrapper, j10, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
