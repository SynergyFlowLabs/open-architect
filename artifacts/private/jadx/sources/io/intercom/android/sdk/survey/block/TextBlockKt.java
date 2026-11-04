package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.text.q3;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.r3;
import androidx.compose.ui.text.s3;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.w0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTextBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextBlock.kt\nio/intercom/android/sdk/survey/block/TextBlockKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,483:1\n1574#2:484\n1394#2,6:485\n1574#2:544\n1508#2,3:546\n1512#2,2:551\n1574#2:566\n1416#2,3:574\n1420#2,2:579\n1416#2,6:581\n1282#3,6:491\n1282#3,6:497\n1282#3,6:553\n70#4:503\n67#4,9:504\n77#4:543\n80#5,6:513\n87#5,3:528\n90#5,2:537\n94#5:542\n391#6,9:519\n400#6,3:539\n4360#7,6:531\n75#8:545\n75#8:559\n75#8:563\n75#8:570\n1863#9,2:549\n1557#9:567\n1628#9,2:568\n1630#9:571\n1872#9,2:572\n1863#9,2:577\n1874#9:587\n3193#9,10:588\n1611#9,9:598\n1863#9:607\n1864#9:609\n1620#9:610\n1#10:560\n1#10:608\n54#11:561\n59#11:564\n85#12:562\n90#12:565\n*S KotlinDebug\n*F\n+ 1 TextBlock.kt\nio/intercom/android/sdk/survey/block/TextBlockKt\n*L\n67#1:484\n69#1:485,6\n173#1:544\n202#1:546,3\n202#1:551,2\n241#1:566\n260#1:574,3\n260#1:579,2\n276#1:581,6\n78#1:491,6\n120#1:497,6\n227#1:553,6\n117#1:503\n117#1:504,9\n117#1:543\n117#1:513,6\n117#1:528,3\n117#1:537,2\n117#1:542\n117#1:519,9\n117#1:539,3\n117#1:531,6\n176#1:545\n233#1:559\n234#1:563\n252#1:570\n206#1:549,2\n243#1:567\n243#1:568,2\n243#1:571\n259#1:572,2\n265#1:577,2\n259#1:587\n291#1:588,10\n295#1:598,9\n295#1:607\n295#1:609\n295#1:610\n295#1:608\n233#1:561\n234#1:564\n233#1:562\n234#1:565\n*E\n"})
public final class TextBlockKt {

    @NotNull
    private static final String formattedText = "Hello <b>World</b>. This <i><strike>text</strike>sentence</i> is form<b>att<u>ed</u></b> in simple html. <a href=\"https://github.com/ch4rl3x/HtmlText\">HtmlText</a>";

    @NotNull
    private static final List<String> items = CollectionsKt.listOf((Object[]) new String[]{"First item", "Second item with very long text. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", formattedText});

    @NotNull
    private static final String textWithSources = "Hello World! This is <a href=\"https://github.com/ch4rl3x/HtmlText\">simple link</a>. And this is source link <a class=\"inline-citation\" data-entity-id=\"111\" data-entity-type=\"article\" data-source-index=\"1\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Leaving Elephant Energy\">link here</a> <a class=\"inline-citation\" data-entity-id=\"222\" data-entity-type=\"article\" data-source-index=\"2\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Article 2\">link here</a>";

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nTextBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextBlock.kt\nio/intercom/android/sdk/survey/block/TextBlockKt$TextBlock$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,483:1\n1282#2,6:484\n1282#2,6:494\n1557#3:490\n1628#3,3:491\n*S KotlinDebug\n*F\n+ 1 TextBlock.kt\nio/intercom/android/sdk/survey/block/TextBlockKt$TextBlock$3\n*L\n89#1:484,6\n90#1:494,6\n94#1:490\n94#1:491,3\n*E\n"})
    static final class AnonymousClass3 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Block $block;
        final /* synthetic */ BlockRenderData $blockRenderData;
        final /* synthetic */ BlockRenderTextStyle $blockRenderTextStyle;
        final /* synthetic */ androidx.compose.ui.text.f $finalTextToRender;
        final /* synthetic */ Set<InlineSource> $inlineSources;
        final /* synthetic */ n3<p3> $layoutResult;
        final /* synthetic */ androidx.compose.ui.a0 $modifier;
        final /* synthetic */ Function1<p3, Unit> $onLayoutResult;
        final /* synthetic */ SuffixText $suffixText;
        final /* synthetic */ androidx.compose.ui.text.f $textToRender;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(BlockRenderTextStyle blockRenderTextStyle, BlockRenderData blockRenderData, Block block, androidx.compose.ui.a0 a0Var, androidx.compose.ui.text.f fVar, SuffixText suffixText, Set<InlineSource> set, androidx.compose.ui.text.f fVar2, Function1<? super p3, Unit> function1, n3<p3> n3Var) {
            this.$blockRenderTextStyle = blockRenderTextStyle;
            this.$blockRenderData = blockRenderData;
            this.$block = block;
            this.$modifier = a0Var;
            this.$textToRender = fVar;
            this.$suffixText = suffixText;
            this.$inlineSources = set;
            this.$finalTextToRender = fVar2;
            this.$onLayoutResult = function1;
            this.$layoutResult = n3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(androidx.compose.ui.text.f textToRender, SuffixText suffixText, androidx.compose.ui.semantics.e0 semantics) {
            Intrinsics.checkNotNullParameter(textToRender, "$textToRender");
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            androidx.compose.ui.semantics.b0.v1(semantics, ((Object) textToRender) + suffixText.getTtsText());
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(n3 layoutResult, Function1 function1, p3 it) {
            Intrinsics.checkNotNullParameter(layoutResult, "$layoutResult");
            Intrinsics.checkNotNullParameter(it, "it");
            layoutResult.setValue(it);
            function1.invoke(it);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            int textAlign;
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            long jM440getFontSizeXSAIIZE = this.$blockRenderTextStyle.m440getFontSizeXSAIIZE();
            androidx.compose.ui.graphics.q0 q0VarM444getTextColorQN2ZGVo = this.$blockRenderTextStyle.m444getTextColorQN2ZGVo();
            if (q0VarM444getTextColorQN2ZGVo == null) {
                q0VarM444getTextColorQN2ZGVo = this.$blockRenderData.m432getTextColorQN2ZGVo();
            }
            c0Var.E(231563533);
            long jM714getPrimaryText0d7_KjU = q0VarM444getTextColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m714getPrimaryText0d7_KjU() : q0VarM444getTextColorQN2ZGVo.M();
            c0Var.A();
            androidx.compose.ui.text.style.j jVarM443getTextAlignbuA522U = this.$blockRenderTextStyle.m443getTextAlignbuA522U();
            if (jVarM443getTextAlignbuA522U != null) {
                textAlign = jVarM443getTextAlignbuA522U.n();
            } else {
                BlockAlignment align = this.$block.getAlign();
                Intrinsics.checkNotNullExpressionValue(align, "getAlign(...)");
                textAlign = BlockExtensionsKt.getTextAlign(align);
            }
            long jM441getLineHeightXSAIIZE = this.$blockRenderTextStyle.m441getLineHeightXSAIIZE();
            v0 fontWeight = this.$blockRenderTextStyle.getFontWeight();
            androidx.compose.ui.a0 a0Var = this.$modifier;
            c0Var.E(231575459);
            boolean zD = c0Var.D(this.$textToRender) | c0Var.D(this.$suffixText);
            final androidx.compose.ui.text.f fVar = this.$textToRender;
            final SuffixText suffixText = this.$suffixText;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextBlockKt.AnonymousClass3.invoke$lambda$1$lambda$0(fVar, suffixText, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null);
            c0Var.E(231583295);
            Set<InlineSource> set = this.$inlineSources;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (final InlineSource inlineSource : set) {
                arrayList.add(TuplesKt.to(inlineSource.getDataEntityId(), new androidx.compose.foundation.text.p3(new androidx.compose.ui.text.v0(androidx.compose.ui.unit.a0.e(1.5d), androidx.compose.ui.unit.a0.e(1.1d), w0.f42324b.c(), null), androidx.compose.runtime.internal.w.e(-1830349960, true, new pj.n<String, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3$2$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(String str, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(str, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(String it, androidx.compose.runtime.c0 c0Var2, int i11) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i11 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                        } else {
                            TextBlockKt.m464InlineSourceBadgeFNF3uiM(inlineSource.getDataSourceIndex(), null, 0L, c0Var2, 0, 6);
                        }
                    }
                }, c0Var, 54))));
                textAlign = textAlign;
                jM714getPrimaryText0d7_KjU = jM714getPrimaryText0d7_KjU;
                jM440getFontSizeXSAIIZE = jM440getFontSizeXSAIIZE;
            }
            long j10 = jM714getPrimaryText0d7_KjU;
            long j11 = jM440getFontSizeXSAIIZE;
            c0Var.A();
            Map map = MapsKt.toMap(arrayList);
            androidx.compose.ui.text.f fVar2 = this.$finalTextToRender;
            androidx.compose.ui.text.style.j jVarH = androidx.compose.ui.text.style.j.h(textAlign);
            c0Var.E(231578616);
            boolean zD2 = c0Var.D(this.$onLayoutResult);
            final n3<p3> n3Var = this.$layoutResult;
            final Function1<p3, Unit> function1 = this.$onLayoutResult;
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.block.q0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextBlockKt.AnonymousClass3.invoke$lambda$4$lambda$3(n3Var, function1, (p3) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            c0Var.A();
            q50.u(fVar2, a0VarF, j10, null, j11, null, fontWeight, null, 0L, null, jVarH, jM441getLineHeightXSAIIZE, 0, false, 0, 0, map, (Function1) objI1, null, c0Var, 0, 2097152, 324520);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HeadingTextBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1066073995);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.HEADING.getSerializedName()).withText("Heading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(1821427103, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.HeadingTextBlockPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1844474362, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.HeadingTextBlockPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, c0Var3, 64, 61);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.HeadingTextBlockPreview$lambda$27(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeadingTextBlockPreview$lambda$27(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        HeadingTextBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x01da  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: InlineSourceBadge-FNF3uiM, reason: not valid java name */
    public static final void m464InlineSourceBadgeFNF3uiM(final String str, androidx.compose.ui.a0 a0Var, long j10, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        String str2;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        final long jM719getSourceBackground0d7_KjU;
        androidx.compose.ui.a0 a0Var3;
        boolean z10;
        Object objI0;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var4;
        final long j11;
        s5 s5VarT;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(234500363);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 14) == 0) {
            str2 = str;
            i12 = (c0VarR.D(str2) ? 4 : 2) | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                jM719getSourceBackground0d7_KjU = j10;
                if ((i11 & 4) == 0 || !c0VarR.L(jM719getSourceBackground0d7_KjU)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                jM719getSourceBackground0d7_KjU = j10;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM719getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m719getSourceBackground0d7_KjU();
                        i12 &= -897;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                }
                c0VarR.Z();
                z10 = true;
                androidx.compose.ui.a0 a0VarF = i6.f(a0Var3, 0.0f, 1, null);
                c0VarR.E(-1159000328);
                if ((((i12 & 896) ^ a5.S0) > 256 || !c0VarR.L(jM719getSourceBackground0d7_KjU)) && (i12 & a5.S0) != 256) {
                }
                objI0 = c0VarR.i0();
                if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(jM719getSourceBackground0d7_KjU, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarB = androidx.compose.ui.draw.n.b(a0VarF, (Function1) objI0);
                androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                function0A = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.d0.f15956a.b(androidx.compose.ui.a0.E, aVar.i());
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                c0Var2 = c0VarR;
                q50.t(str2, a0VarB2, intercomTheme.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 1, 0, null, intercomTheme.getTypography(c0VarR, i15).getType05(), c0Var2, (i12 & 14) | 1572864, 24576, 114616);
                c0Var2.o();
                a0Var4 = a0Var3;
                j11 = jM719getSourceBackground0d7_KjU;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                a0Var4 = a0Var2;
                j11 = jM719getSourceBackground0d7_KjU;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9(str, a0Var4, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & 896) == 0) {
            jM719getSourceBackground0d7_KjU = j10;
            if ((i11 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            jM719getSourceBackground0d7_KjU = j10;
        }
        if ((i12 & 731) == 146) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM719getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m719getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            } else {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM719getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m719getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            }
            c0VarR.Z();
            z10 = true;
            androidx.compose.ui.a0 a0VarF2 = i6.f(a0Var3, 0.0f, 1, null);
            c0VarR.E(-1159000328);
            z10 = ((i12 & 896) ^ a5.S0) > 256 ? false : false;
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(jM719getSourceBackground0d7_KjU, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(jM719getSourceBackground0d7_KjU, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarB3 = androidx.compose.ui.draw.n.b(a0VarF2, (Function1) objI0);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            function0A = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK2, aVar4.e());
            y7.n(c0VarD, b1VarK2, aVar4.g());
            function2B = aVar4.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar4.f());
            androidx.compose.ui.a0 a0VarB4 = androidx.compose.foundation.layout.d0.f15956a.b(androidx.compose.ui.a0.E, aVar3.i());
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            c0Var2 = c0VarR;
            q50.t(str2, a0VarB4, intercomTheme2.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), null, 0L, null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 1, 0, null, intercomTheme2.getTypography(c0VarR, i16).getType05(), c0Var2, (i12 & 14) | 1572864, 24576, 114616);
            c0Var2.o();
            a0Var4 = a0Var3;
            j11 = jM719getSourceBackground0d7_KjU;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM719getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m719getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            } else {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM719getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m719getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            }
            c0VarR.Z();
            z10 = true;
            androidx.compose.ui.a0 a0VarF3 = i6.f(a0Var3, 0.0f, 1, null);
            c0VarR.E(-1159000328);
            if (((i12 & 896) ^ a5.S0) > 256) {
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(jM719getSourceBackground0d7_KjU, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(jM719getSourceBackground0d7_KjU, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarB5 = androidx.compose.ui.draw.n.b(a0VarF3, (Function1) objI0);
            androidx.compose.ui.e.a aVar5 = androidx.compose.ui.e.f37317a;
            a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar5.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB5);
            androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
            function0A = aVar6.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK3, aVar6.e());
            y7.n(c0VarD, b1VarK3, aVar6.g());
            function2B = aVar6.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar6.f());
            androidx.compose.ui.a0 a0VarB6 = androidx.compose.foundation.layout.d0.f15956a.b(androidx.compose.ui.a0.E, aVar5.i());
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            c0Var2 = c0VarR;
            q50.t(str2, a0VarB6, intercomTheme3.getColors(c0VarR, i17).m714getPrimaryText0d7_KjU(), null, 0L, null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 1, 0, null, intercomTheme3.getTypography(c0VarR, i17).getType05(), c0Var2, (i12 & 14) | 1572864, 24576, 114616);
            c0Var2.o();
            a0Var4 = a0Var3;
            j11 = jM719getSourceBackground0d7_KjU;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9(str, a0Var4, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(long j10, androidx.compose.ui.graphics.drawscope.f drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        androidx.compose.ui.graphics.drawscope.f.B4(drawBehind, j10, 0.0f, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourceBadge_FNF3uiM$lambda$9(String index, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(index, "$index");
        m464InlineSourceBadgeFNF3uiM(index, a0Var, j10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InlineSourcesTextBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1209811272);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(textWithSources).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(2099084386, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.InlineSourcesTextBlockPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(954415229, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.InlineSourcesTextBlockPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, true, null, c0Var3, 24640, 45);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.InlineSourcesTextBlockPreview$lambda$32(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesTextBlockPreview$lambda$32(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        InlineSourcesTextBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void OrderedListTextBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(627599340);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.ORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(644450326, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.OrderedListTextBlockPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-585789711, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.OrderedListTextBlockPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, c0Var3, 64, 61);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.OrderedListTextBlockPreview$lambda$30(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderedListTextBlockPreview$lambda$30(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        OrderedListTextBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubheadingTextBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1598324377);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.SUBHEADING.getSerializedName()).withText("Subheading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(-756436689, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.SubheadingTextBlockPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1350311180, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.SubheadingTextBlockPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, c0Var3, 64, 61);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.SubheadingTextBlockPreview$lambda$28(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubheadingTextBlockPreview$lambda$28(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubheadingTextBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextBlock(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockRenderData blockRenderData, @Nullable SuffixText suffixText, @Nullable Function1<? super p3, Unit> function1, boolean z10, @Nullable Function1<? super List<InlineSource>, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.text.f fVarC;
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-295791429);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        SuffixText no_suffix = (i11 & 4) != 0 ? SuffixText.Companion.getNO_SUFFIX() : suffixText;
        Function1<? super p3, Unit> function3 = (i11 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextBlockKt.TextBlock$lambda$0((p3) obj);
            }
        } : function1;
        boolean z11 = (i11 & 16) != 0 ? false : z10;
        Function1<? super List<InlineSource>, Unit> function4 = (i11 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextBlockKt.TextBlock$lambda$1((List) obj);
            }
        } : function2;
        Block block = blockRenderData.getBlock();
        BlockRenderTextStyle textStyle = blockRenderData.getTextStyle();
        int i12 = i10 >> 6;
        Pair<androidx.compose.ui.text.f, Set<InlineSource>> pairTextToRender = textToRender(block, textStyle, z11, function4, c0VarR, (i12 & 896) | 8 | (i12 & 7168));
        final boolean z12 = z11;
        final Function1<? super List<InlineSource>, Unit> function5 = function4;
        androidx.compose.ui.text.f fVarComponent1 = pairTextToRender.component1();
        Set<InlineSource> setComponent2 = pairTextToRender.component2();
        if (Intrinsics.areEqual(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
            fVarC = fVarComponent1;
        } else {
            androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
            bVar.n(fVarComponent1);
            int iZ = bVar.z(new c3(no_suffix.m463getColor0d7_KjU(), 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, androidx.media3.extractor.y0.f69665l, (DefaultConstructorMarker) null));
            try {
                bVar.p(no_suffix.getText());
                Unit unit = Unit.f312394a;
                bVar.u(iZ);
                fVarC = bVar.C();
            } catch (Throwable th2) {
                bVar.u(iZ);
                throw th2;
            }
        }
        c0VarR.E(1265159187);
        Object objI0 = c0VarR.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d7.g(null, null, 2, null);
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        final SuffixText suffixText2 = no_suffix;
        androidx.compose.foundation.text.selection.y0.h(androidx.compose.runtime.internal.w.e(-1368971764, true, new AnonymousClass3(textStyle, blockRenderData, block, a0Var3, fVarComponent1, suffixText2, setComponent2, fVarC, function3, (n3) objI0), c0VarR, 54), c0VarR, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function1<? super p3, Unit> function6 = function3;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.TextBlock$lambda$5(a0Var3, blockRenderData, suffixText2, function6, z12, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlock$lambda$0(p3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlock$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlock$lambda$5(androidx.compose.ui.a0 a0Var, BlockRenderData blockRenderData, SuffixText suffixText, Function1 function1, boolean z10, Function1 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        TextBlock(a0Var, blockRenderData, suffixText, function1, z10, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextBlockAlignmentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1235422502);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextBlockKt.INSTANCE.m454getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.TextBlockAlignmentPreview$lambda$26(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlockAlignmentPreview$lambda$26(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextBlockAlignmentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(443046075);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formattedText).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(-140923183, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(30237398, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, BlockRenderTextStyle.m433copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0L, null, 0L, null, androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.c()), null, 47, null), 14, null), null, null, false, null, c0Var3, 64, 61);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.TextBlockPreview$lambda$25(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlockPreview$lambda$25(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextBlockWithSuffixPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-979323118);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Paragraph with suffix").build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(960883112, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockWithSuffixPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(367008621, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockWithSuffixPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), new SuffixText("*", "", androidx.compose.ui.graphics.q0.f38131b.q(), null), null, false, null, c0Var3, 64, 57);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.TextBlockWithSuffixPreview$lambda$29(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlockWithSuffixPreview$lambda$29(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextBlockWithSuffixPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnorderedListTextBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-321451131);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.UNORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(-1307522769, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.UnorderedListTextBlockPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        final Block block = blockBuild;
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1842775370, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.UnorderedListTextBlockPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                Intrinsics.checkNotNull(block2);
                                int i13 = 6 >> 0;
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, c0Var3, 64, 61);
                            }
                        }, c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextBlockKt.UnorderedListTextBlockPreview$lambda$31(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnorderedListTextBlockPreview$lambda$31(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UnorderedListTextBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources(androidx.compose.ui.text.f.b bVar, androidx.compose.ui.text.f fVar, final Set<InlineSource> set, final Function1<? super List<InlineSource>, Unit> function1) {
        int i10 = 2 >> 0;
        int iW = bVar.w(new androidx.compose.ui.text.b0.a("inline_source", null, new androidx.compose.ui.text.c0() { // from class: io.intercom.android.sdk.survey.block.e0
            @Override // androidx.compose.ui.text.c0
            public final void a(androidx.compose.ui.text.b0 b0Var) {
                TextBlockKt.appendInlineSources$lambda$11(function1, set, b0Var);
            }
        }, 2, null));
        try {
            bVar.n(fVar);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                q3.b(bVar, ((InlineSource) it.next()).getDataEntityId(), null, 2, null);
            }
            Unit unit = Unit.f312394a;
        } finally {
            bVar.u(iW);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources$lambda$11(Function1 onInlineSourcesClick, Set sources, androidx.compose.ui.text.b0 it) {
        Intrinsics.checkNotNullParameter(onInlineSourcesClick, "$onInlineSourcesClick");
        Intrinsics.checkNotNullParameter(sources, "$sources");
        Intrinsics.checkNotNullParameter(it, "it");
        onInlineSourcesClick.invoke(CollectionsKt.toList(sources));
    }

    private static final Pair<Set<InlineSource>, String> extractInlineSources(String str) {
        List<String> listO = new Regex("((?=<a)|(?<=</a>))").o(str, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listO) {
            String str2 = (String) obj;
            if (StringsKt.V2(str2, "<a", false, 2, null) && StringsKt.V2(str2, "</a>", false, 2, null) && StringsKt.V2(str2, "inline-citation", false, 2, null)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<String> list = (List) pair.component1();
        List list2 = (List) pair.component2();
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : list) {
            String strFindAttribute = findAttribute(str3, "href");
            String strFindAttribute2 = findAttribute(str3, "data-entity-id");
            String strFindAttribute3 = findAttribute(str3, "data-source-index");
            InlineSource inlineSource = (strFindAttribute == null || strFindAttribute.length() == 0 || strFindAttribute2 == null || strFindAttribute2.length() == 0 || strFindAttribute3 == null || strFindAttribute3.length() == 0) ? null : new InlineSource(strFindAttribute2, findAttribute(str3, "data-entity-type"), strFindAttribute3, strFindAttribute, findAttribute(str3, "title"));
            if (inlineSource != null) {
                arrayList3.add(inlineSource);
            }
        }
        int i10 = 7 ^ 0;
        return TuplesKt.to(CollectionsKt.toSet(arrayList3), CollectionsKt.joinToString$default(list2, "", null, null, 0, null, null, 62, null));
    }

    private static final String findAttribute(String str, String str2) {
        Pattern patternCompile = Pattern.compile(str2 + "=\".*?\"", 0);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return StringsKt.x5(StringsKt.p5(strGroup, "\"", null, 2, null), "\"", null, 2, null);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final Pair<androidx.compose.ui.text.f, Set<InlineSource>> textListToRender(@NotNull List<String> items2, boolean z10, @NotNull BlockRenderTextStyle blockRenderTextStyle, @Nullable Function1<? super List<InlineSource>, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(items2, "items");
        Intrinsics.checkNotNullParameter(blockRenderTextStyle, "blockRenderTextStyle");
        c0Var.E(239669781);
        y3 textStyle$intercom_sdk_base_release = blockRenderTextStyle.toTextStyle$intercom_sdk_base_release();
        r3 r3VarA = s3.a(0, c0Var, 0, 1);
        c0Var.E(1608522809);
        boolean zD = c0Var.D(textStyle$intercom_sdk_base_release) | c0Var.D(r3VarA);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            i11 = 1;
            objI0 = androidx.compose.ui.unit.u.b(r3.b(r3VarA, textListToRender$bullet(z10, items2.size()), textStyle$intercom_sdk_base_release, 0, false, 0, 0L, null, null, null, false, 1020, null).C());
            c0Var.Y(objI0);
        } else {
            i11 = 1;
        }
        long jQ = ((androidx.compose.ui.unit.u) objI0).q();
        c0Var.A();
        t0 t0Var = new t0(0, 0, ((androidx.compose.ui.unit.d) c0Var.W(q1.m())).j1((int) (jQ & com.rabbitmq.client.k0.f265952a)), new androidx.compose.ui.text.style.s(0L, ((androidx.compose.ui.unit.d) c0Var.W(q1.m())).j1((int) (jQ >> 32)), 1, null), (x0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 499, (DefaultConstructorMarker) null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, i11, null);
        List<String> list = items2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            Pair<Set<InlineSource>, String> pairExtractInlineSources = function1 != null ? extractInlineSources(str) : TuplesKt.to(SetsKt.emptySet(), str);
            Set<InlineSource> setComponent1 = pairExtractInlineSources.component1();
            String strComponent2 = pairExtractInlineSources.component2();
            linkedHashSet.addAll(setComponent1);
            Spanned spannedA = androidx.core.text.c.a(strComponent2, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
            Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
            androidx.compose.ui.text.style.k kVarF = androidx.compose.ui.text.style.k.f42215b.f();
            androidx.compose.ui.graphics.q0 q0VarM442getLinkTextColorQN2ZGVo = blockRenderTextStyle.m442getLinkTextColorQN2ZGVo();
            arrayList.add(TuplesKt.to(BlockExtensionsKt.toAnnotatedString(spannedA, context, new c3(q0VarM442getLinkTextColorQN2ZGVo != null ? q0VarM442getLinkTextColorQN2ZGVo.M() : androidx.compose.ui.graphics.q0.f38131b.u(), 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, kVarF, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61438, (DefaultConstructorMarker) null)), setComponent1));
        }
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            androidx.compose.ui.text.f fVar = (androidx.compose.ui.text.f) pair.component1();
            Set set = (Set) pair.component2();
            int iY = bVar.y(t0Var);
            try {
                bVar.p(textListToRender$bullet(z10, i13));
                int length = String.valueOf(items2.size()).length();
                if (length > i11) {
                    Iterator<Integer> it = kotlin.ranges.r.W1(0, length - String.valueOf(i13).length()).iterator();
                    while (it.hasNext()) {
                        ((IntIterator) it).nextInt();
                        bVar.p("\t");
                    }
                }
                if (function1 == null || set.isEmpty()) {
                    bVar.n(fVar);
                } else {
                    appendInlineSources(bVar, fVar, set, function1);
                }
                Unit unit = Unit.f312394a;
                bVar.u(iY);
                if (i12 < CollectionsKt.getLastIndex(items2)) {
                    int iY2 = bVar.y(new t0(0, 0, androidx.compose.ui.unit.a0.m(0), (androidx.compose.ui.text.style.s) null, (x0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, androidx.constraintlayout.core.motion.utils.v.g.f44095o, (DefaultConstructorMarker) null));
                    try {
                        Intrinsics.checkNotNullExpressionValue(bVar.append('\n'), "append(...)");
                        bVar.u(iY2);
                    } catch (Throwable th2) {
                        bVar.u(iY2);
                        throw th2;
                    }
                }
                i12 = i13;
                i11 = 1;
            } catch (Throwable th3) {
                bVar.u(iY);
                throw th3;
            }
        }
        Pair<androidx.compose.ui.text.f, Set<InlineSource>> pair2 = TuplesKt.to(bVar.C(), linkedHashSet);
        c0Var.A();
        return pair2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textListToRender$bullet(boolean z10, int i10) {
        if (!z10) {
            return "•\t\t";
        }
        return i10 + ".\t\t";
    }

    @androidx.compose.runtime.o
    private static final Pair<androidx.compose.ui.text.f, Set<InlineSource>> textToRender(Block block, BlockRenderTextStyle blockRenderTextStyle, boolean z10, Function1<? super List<InlineSource>, Unit> function1, androidx.compose.runtime.c0 c0Var, int i10) {
        Pair<androidx.compose.ui.text.f, Set<InlineSource>> pairTextListToRender;
        Pair<Set<InlineSource>, String> pairExtractInlineSources;
        c0Var.E(1340770584);
        BlockType type = block.getType();
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            c0Var.E(-1598782922);
            List<String> items2 = block.getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "getItems(...)");
            pairTextListToRender = textListToRender(items2, false, blockRenderTextStyle, function1, c0Var, ((i10 << 3) & 896) | 56 | (i10 & 7168));
            c0Var.A();
        } else if (i11 != 2) {
            c0Var.E(1977764865);
            if (z10) {
                String text = block.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                pairExtractInlineSources = extractInlineSources(text);
            } else {
                pairExtractInlineSources = TuplesKt.to(SetsKt.emptySet(), block.getText());
            }
            Set<InlineSource> setComponent1 = pairExtractInlineSources.component1();
            String strComponent2 = pairExtractInlineSources.component2();
            androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
            Spanned spannedA = androidx.core.text.c.a(strComponent2, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
            Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
            androidx.compose.ui.text.style.k kVarF = androidx.compose.ui.text.style.k.f42215b.f();
            androidx.compose.ui.graphics.q0 q0VarM442getLinkTextColorQN2ZGVo = blockRenderTextStyle.m442getLinkTextColorQN2ZGVo();
            androidx.compose.ui.text.f annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, context, new c3(q0VarM442getLinkTextColorQN2ZGVo != null ? q0VarM442getLinkTextColorQN2ZGVo.M() : androidx.compose.ui.graphics.q0.f38131b.u(), 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, kVarF, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61438, (DefaultConstructorMarker) null));
            if (!z10 || setComponent1.isEmpty()) {
                bVar.n(annotatedString);
            } else {
                appendInlineSources(bVar, annotatedString, setComponent1, function1);
            }
            pairTextListToRender = TuplesKt.to(bVar.C(), setComponent1);
            c0Var.A();
        } else {
            c0Var.E(-1598776075);
            List<String> items3 = block.getItems();
            Intrinsics.checkNotNullExpressionValue(items3, "getItems(...)");
            pairTextListToRender = textListToRender(items3, true, blockRenderTextStyle, function1, c0Var, ((i10 << 3) & 896) | 56 | (i10 & 7168));
            c0Var.A();
        }
        c0Var.A();
        return pairTextListToRender;
    }
}
