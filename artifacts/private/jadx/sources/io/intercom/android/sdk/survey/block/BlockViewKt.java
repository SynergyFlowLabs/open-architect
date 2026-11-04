package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.p3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.CarouselImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
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
@SourceDebugExtension({"SMAP\nBlockView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockView.kt\nio/intercom/android/sdk/survey/block/BlockViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 5 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,183:1\n1#2:184\n75#3:185\n55#4,2:186\n58#4:191\n115#5:188\n124#5:189\n133#5:190\n*S KotlinDebug\n*F\n+ 1 BlockView.kt\nio/intercom/android/sdk/survey/block/BlockViewKt\n*L\n151#1:185\n167#1:186,2\n167#1:191\n171#1:188\n172#1:189\n173#1:190\n*E\n"})
public final class BlockViewKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.HEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockType.CREATETICKETCARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlockType.MESSENGERCARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlockType.CODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlockType.ATTACHMENTLIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlockType.LOCAL_ATTACHMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlockType.CONVERSATIONRATING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlockType.LINKLIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlockType.VIDEOFILE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x038d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BlockView(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockRenderData blockRenderData, boolean z10, @Nullable SuffixText suffixText, boolean z11, @Nullable String str, @Nullable ImageRenderType imageRenderType, @Nullable Function0<Unit> function0, @Nullable Function1<? super TicketType, Unit> function1, boolean z12, @Nullable Function1<? super List<InlineSource>, Unit> function2, @Nullable Function1<? super p3, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        final Function1<? super p3, Unit> function4;
        Function1<? super List<InlineSource>, Unit> function5;
        ImageRenderType imageRenderType2;
        final boolean z13;
        SuffixText suffixText2;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        boolean z15;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-373546060);
        androidx.compose.ui.a0 a0Var3 = (i12 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z16 = (i12 & 4) != 0 ? false : z10;
        SuffixText no_suffix = (i12 & 8) != 0 ? SuffixText.Companion.getNO_SUFFIX() : suffixText;
        boolean z17 = (i12 & 16) != 0 ? true : z11;
        String str2 = (i12 & 32) != 0 ? "" : str;
        ImageRenderType imageRenderType3 = (i12 & 64) != 0 ? ImageRenderType.CROPPED : imageRenderType;
        final Function0<Unit> function6 = (i12 & 128) != 0 ? null : function0;
        final Function1<? super TicketType, Unit> function7 = (i12 & 256) != 0 ? null : function1;
        boolean z18 = (i12 & 512) != 0 ? false : z12;
        Function1<? super List<InlineSource>, Unit> function8 = (i12 & 1024) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockViewKt.BlockView$lambda$0((List) obj);
            }
        } : function2;
        Function1<? super p3, Unit> function9 = (i12 & 2048) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockViewKt.BlockView$lambda$1((p3) obj);
            }
        } : function3;
        androidx.compose.ui.graphics.q0 q0VarM432getTextColorQN2ZGVo = blockRenderData.m432getTextColorQN2ZGVo();
        long jM = q0VarM432getTextColorQN2ZGVo != null ? q0VarM432getTextColorQN2ZGVo.M() : androidx.compose.ui.graphics.q0.f38131b.a();
        final Block block = blockRenderData.getBlock();
        if (!Injector.isNotInitialised()) {
            a0Var2 = a0Var3;
            if (Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.BLOCK_RENDERING_FALLBACK)) {
                c0VarR.E(1198822707);
                m445RenderLegacyBlockssW7UJKQ(block, jM, a0Var2, null, c0VarR, ((i10 << 6) & 896) | 8, 8);
                c0VarR.A();
                z14 = z16;
                suffixText2 = no_suffix;
                function5 = function8;
                imageRenderType2 = imageRenderType3;
                z13 = z18;
                function4 = function9;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z19 = z17;
                final ImageRenderType imageRenderType4 = imageRenderType2;
                final boolean z20 = z14;
                final Function0<Unit> function10 = function6;
                final SuffixText suffixText3 = suffixText2;
                final androidx.compose.ui.a0 a0Var4 = a0Var2;
                final Function1<? super List<InlineSource>, Unit> function11 = function5;
                final String str3 = str2;
                final Function1<? super TicketType, Unit> function12 = function7;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BlockViewKt.BlockView$lambda$5(a0Var4, blockRenderData, z20, suffixText3, z19, str3, imageRenderType4, function10, function12, z13, function11, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        a0Var2 = a0Var3;
        c0VarR.E(1198993083);
        final Function1<? super List<InlineSource>, Unit> function13 = function8;
        final SuffixText suffixText4 = no_suffix;
        final Function1<? super p3, Unit> function14 = function9;
        final boolean z21 = z18;
        function4 = function14;
        function5 = function13;
        boolean z22 = z16;
        imageRenderType2 = imageRenderType3;
        z13 = z21;
        suffixText2 = suffixText4;
        androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-1514621528, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$BlockView$textBlock$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                invoke(c0Var3, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i13) {
                if ((i13 & 11) == 2 && c0Var3.d()) {
                    c0Var3.u();
                } else {
                    TextBlockKt.TextBlock(androidx.compose.ui.a0.E, blockRenderData, suffixText4, function14, z21, function13, c0Var3, 70, 0);
                }
            }
        }, c0VarR, 54);
        BlockType type = block.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                z14 = z22;
                c0VarR.E(-1208237443);
                ImageBlockKt.ImageBlock(block, a0Var2, null, false, imageRenderType2, c0VarR, ((i10 << 3) & com.planner5d.library.engine.input.f.b.B) | 8 | ((i10 >> 6) & 57344), 12);
                c0VarR.A();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z14 = z22;
                c0VarR.E(-1208229124);
                cVarE.invoke(c0VarR, 6);
                c0VarR.A();
                break;
            case 7:
                z14 = z22;
                c0VarR.E(1199675021);
                final boolean z23 = z17 && !block.getTicketType().getArchived();
                CreateTicketCardKt.CreateTicketCard(androidx.compose.ui.a0.E, blockRenderData, z23, new Function0() { // from class: io.intercom.android.sdk.survey.block.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockViewKt.BlockView$lambda$2(z23, function7, block, function6);
                    }
                }, c0VarR, 70, 0);
                c0VarR = c0VarR;
                c0VarR.A();
                break;
            case 8:
                c0VarR.E(1200284853);
                String fallbackUrl = block.getFallbackUrl();
                z14 = z22;
                Intrinsics.checkNotNullExpressionValue(fallbackUrl, "getFallbackUrl(...)");
                if (fallbackUrl.length() > 0) {
                    c0VarR.E(1200334546);
                    String fallbackUrl2 = block.getFallbackUrl();
                    Intrinsics.checkNotNullExpressionValue(fallbackUrl2, "getFallbackUrl(...)");
                    c0Var2 = c0VarR;
                    LegacyMessengerAppCardKt.LegacyMessengerAppCard(fallbackUrl2, IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31), false, c0Var2, (IntercomCardStyle.Style.$stable << 3) | a5.S0);
                    c0Var2.A();
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.E(1200587134);
                    cVarE.invoke(c0Var2, 6);
                    c0Var2.A();
                }
                c0Var2.A();
                c0VarR = c0Var2;
                break;
            case 9:
                z15 = z22;
                c0VarR.E(-1208194301);
                CodeBlockKt.CodeBlock(block, a0Var2, function4, c0VarR, ((i10 << 3) & com.planner5d.library.engine.input.f.b.B) | 8 | ((i11 << 3) & 896), 0);
                c0VarR.A();
                z14 = z15;
                break;
            case 10:
                z15 = z22;
                c0VarR.E(-1208191374);
                AttachmentBlockKt.AttachmentBlock(a0Var2, blockRenderData, z15, c0VarR, (i10 & 14) | 64 | (i10 & 896), 0);
                c0VarR.A();
                z14 = z15;
                break;
            case 11:
                c0VarR.E(-1208187918);
                AttachmentBlockKt.AttachmentBlock(a0Var2, blockRenderData, z22, c0VarR, (i10 & 14) | 64 | (i10 & 896), 0);
                z15 = z22;
                c0VarR.A();
                z14 = z15;
                break;
            case 12:
                c0VarR.E(-1208184286);
                ConversationRatingBlockKt.m455ConversationRatingBlockcf5BqRc(null, blockRenderData, jM, str2, c0VarR, ((i10 >> 6) & 7168) | 64, 1);
                c0VarR.A();
                z14 = z22;
                break;
            case 13:
                c0VarR.E(-1208177500);
                LinkListBlockKt.m456LinkListBlockcf5BqRc(null, block, jM, str2, c0VarR, ((i10 >> 6) & 7168) | 64, 1);
                c0VarR.A();
                z14 = z22;
                break;
            case 14:
                c0VarR.E(-1208171550);
                String url = block.getUrl();
                if (url.length() == 0) {
                    url = block.getLocalUri().toString();
                }
                Intrinsics.checkNotNullExpressionValue(url, "ifEmpty(...)");
                String thumbnailUrl = block.getThumbnailUrl();
                Intrinsics.checkNotNull(thumbnailUrl);
                if (thumbnailUrl.length() <= 0) {
                    thumbnailUrl = null;
                }
                VideoFileBlockKt.VideoFileBlock(a0Var2, url, thumbnailUrl, c0VarR, i10 & 14, 0);
                c0VarR.A();
                z14 = z22;
                break;
            default:
                c0VarR.E(1202013971);
                if (!Injector.isNotInitialised()) {
                    m445RenderLegacyBlockssW7UJKQ(block, jM, a0Var2, null, c0VarR, ((i10 << 6) & 896) | 8, 8);
                }
                c0VarR.A();
                z14 = z22;
                break;
        }
        c0VarR.A();
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final boolean z110 = z17;
            final ImageRenderType imageRenderType5 = imageRenderType2;
            final boolean z24 = z14;
            final Function0 function15 = function6;
            final SuffixText suffixText5 = suffixText2;
            final androidx.compose.ui.a0 a0Var5 = a0Var2;
            final Function1 function16 = function5;
            final String str4 = str2;
            final Function1 function17 = function7;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockViewKt.BlockView$lambda$5(a0Var5, blockRenderData, z24, suffixText5, z110, str4, imageRenderType5, function15, function17, z13, function16, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$1(p3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$2(boolean z10, Function1 function1, Block block, Function0 function0) {
        Intrinsics.checkNotNullParameter(block, "$block");
        if (z10) {
            if (function1 != null) {
                TicketType ticketType = block.getTicketType();
                Intrinsics.checkNotNullExpressionValue(ticketType, "getTicketType(...)");
                function1.invoke(ticketType);
            }
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$5(androidx.compose.ui.a0 a0Var, BlockRenderData blockRenderData, boolean z10, SuffixText suffixText, boolean z11, String str, ImageRenderType imageRenderType, Function0 function0, Function1 function1, boolean z12, Function1 function2, Function1 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        BlockView(a0Var, blockRenderData, z10, suffixText, z11, str, imageRenderType, function0, function1, z12, function2, function3, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: RenderLegacyBlocks-sW7UJKQ, reason: not valid java name */
    public static final void m445RenderLegacyBlockssW7UJKQ(@NotNull final Block block, final long j10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(block, "block");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-119170784);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        String str2 = (i11 & 8) != 0 ? "" : str;
        final Blocks blocks = new Blocks((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), LumberMill.getBlocksTwig());
        UploadingImageCache uploadingImageCache = new UploadingImageCache();
        Api api = Injector.get().getApi();
        Provider<AppConfig> appConfigProvider = Injector.get().getAppConfigProvider();
        Api api2 = Injector.get().getApi();
        Intrinsics.checkNotNullExpressionValue(api2, "getApi(...)");
        final ViewHolderGenerator viewHolderGenerator = new ViewHolderGenerator(uploadingImageCache, api, appConfigProvider, str2, new CarouselImageClickListener(api2), new LinkOpeningButtonClickListener(Injector.get().getApi()), Injector.get().getGson(), Injector.get().getMetricTracker());
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        androidx.compose.ui.viewinterop.e.a(new Function1() { // from class: io.intercom.android.sdk.survey.block.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$7(blocks, block, viewHolderGenerator, j10, (Context) obj);
            }
        }, a0Var3, null, c0VarR, (i10 >> 3) & com.planner5d.library.engine.input.f.b.B, 4);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final String str3 = str2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$8(block, j10, a0Var3, str3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout RenderLegacyBlocks_sW7UJKQ$lambda$7(Blocks blocks, Block block, ViewHolderGenerator generator, long j10, Context it) {
        Intrinsics.checkNotNullParameter(blocks, "$blocks");
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(generator, "$generator");
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout linearLayoutCreateBlocks = blocks.createBlocks(CollectionsKt.listOf(block), generator.getPostHolder());
        Intrinsics.checkNotNull(linearLayoutCreateBlocks);
        int childCount = linearLayoutCreateBlocks.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayoutCreateBlocks.getChildAt(i10);
            if ((childAt instanceof TextView) && !(childAt instanceof Button)) {
                ((TextView) childAt).setTextColor(Color.rgb((androidx.compose.ui.graphics.s0.t(j10) >> 16) & 255, (androidx.compose.ui.graphics.s0.t(j10) >> 8) & 255, androidx.compose.ui.graphics.s0.t(j10) & 255));
            }
        }
        linearLayoutCreateBlocks.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayoutCreateBlocks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenderLegacyBlocks_sW7UJKQ$lambda$8(Block block, long j10, androidx.compose.ui.a0 a0Var, String str, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(block, "$block");
        m445RenderLegacyBlockssW7UJKQ(block, j10, a0Var, str, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
