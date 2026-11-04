package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.foundation.b5;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u7;
import androidx.compose.foundation.q4;
import androidx.compose.material3.pt;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSurveyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyComponentKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n70#2:345\n67#2,9:346\n77#2:385\n80#3,6:355\n87#3,3:370\n90#3,2:379\n94#3:384\n391#4,9:361\n400#4,3:381\n4360#5,6:373\n607#6:386\n604#6,6:387\n1282#7,3:393\n1285#7,3:397\n605#8:396\n1557#9:400\n1628#9,3:401\n*S KotlinDebug\n*F\n+ 1 SurveyComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyComponentKt\n*L\n86#1:345\n86#1:346,9\n86#1:385\n86#1:355,6\n86#1:370,3\n86#1:379,2\n86#1:384\n86#1:361,9\n86#1:381,3\n86#1:373,6\n132#1:386\n132#1:387,6\n132#1:393,3\n132#1:397,3\n132#1:396\n271#1:400\n271#1:401,3\n*E\n"})
public final class SurveyComponentKt {

    @NotNull
    private static final AppConfig emptyAppConfig = new AppConfig("", 0, 0, 0, false, false, false, 100, 1000, 1000, 1000, 1000, true, true, "", "", false, true, "", SetsKt.emptySet(), SetsKt.emptySet(), "", "", false, true, false, false, false, null, new NexusConfig(), AttachmentSettings.Companion.getDEFAULT(), true, ConversationStateSyncSettings.Companion.getDEFAULT(), false);

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nSurveyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyComponentKt$SurveyContent$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,344:1\n1282#2,6:345\n113#3:351\n113#3:389\n113#3:390\n113#3:392\n113#3:437\n113#3:441\n113#3:447\n113#3:448\n87#4:352\n84#4,9:353\n87#4:394\n84#4,9:395\n94#4:446\n94#4:452\n80#5,6:362\n87#5,3:377\n90#5,2:386\n80#5,6:404\n87#5,3:419\n90#5,2:428\n94#5:445\n94#5:451\n391#6,9:368\n400#6:388\n391#6,9:410\n400#6:430\n401#6,2:443\n401#6,2:449\n4360#7,6:380\n4360#7,6:422\n52#8:391\n52#8:393\n1557#9:431\n1628#9,3:432\n1863#9,2:435\n1872#9,2:438\n1874#9:442\n75#10:440\n*S KotlinDebug\n*F\n+ 1 SurveyComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyComponentKt$SurveyContent$1\n*L\n140#1:345,6\n148#1:351\n151#1:389\n152#1:390\n154#1:392\n168#1:437\n185#1:441\n192#1:447\n203#1:448\n145#1:352\n145#1:353,9\n156#1:394\n156#1:395,9\n156#1:446\n145#1:452\n145#1:362,6\n145#1:377,3\n145#1:386,2\n156#1:404,6\n156#1:419,3\n156#1:428,2\n156#1:445\n145#1:451\n145#1:368,9\n145#1:388\n156#1:410,9\n156#1:430\n156#1:443,2\n145#1:449,2\n145#1:380,6\n156#1:422,6\n152#1:391\n154#1:393\n158#1:431\n158#1:432,3\n158#1:435,2\n170#1:438,2\n170#1:442\n174#1:440\n*E\n"})
    static final class AnonymousClass1 implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ kotlinx.coroutines.s0 $coroutineScope;
        final /* synthetic */ Function1<String, Unit> $onAnswerUpdated;
        final /* synthetic */ Function1<kotlinx.coroutines.s0, Unit> $onContinue;
        final /* synthetic */ Function1<SurveyState.Content.SecondaryCta, Unit> $onSecondaryCtaClicked;
        final /* synthetic */ SurveyState.Content $state;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SurveyState.Content content, Function1<? super SurveyState.Content.SecondaryCta, Unit> function1, Function1<? super String, Unit> function2, Function1<? super kotlinx.coroutines.s0, Unit> function3, kotlinx.coroutines.s0 s0Var) {
            this.$state = content;
            this.$onSecondaryCtaClicked = function1;
            this.$onAnswerUpdated = function2;
            this.$onContinue = function3;
            this.$coroutineScope = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$6$lambda$5$lambda$4(CharSequence charSequence, androidx.compose.ui.semantics.e0 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            androidx.compose.ui.semantics.b0.v1(semantics, charSequence.toString());
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(Function1 onContinue, kotlinx.coroutines.s0 coroutineScope) {
            Intrinsics.checkNotNullParameter(onContinue, "$onContinue");
            Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
            onContinue.invoke(coroutineScope);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var, int i10) {
            String strD;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((((i10 & 14) == 0 ? i10 | (c0Var.D(BoxWithConstraints) ? 4 : 2) : i10) & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            float fG = BoxWithConstraints.g();
            b5 b5VarF = q4.f(0, c0Var, 0, 1);
            c0Var.E(1705494839);
            boolean zD = c0Var.D(b5VarF);
            Object objI0 = c0Var.i0();
            Object obj = null;
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new SurveyComponentKt$SurveyContent$1$1$1(b5VarF, null);
                c0Var.Y(objI0);
            }
            c0Var.A();
            b2.i("", (Function2) objI0, c0Var, 70);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            float f10 = 0.0f;
            float f11 = 16;
            androidx.compose.ui.a0 a0VarM = q4.m(d5.t(i6.f(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f11), 0.0f, 2, null), b5VarF, true, null, false, 12, null);
            SurveyState.Content content = this.$state;
            Function1<SurveyState.Content.SecondaryCta, Unit> function1 = this.$onSecondaryCtaClicked;
            Function1<String, Unit> function2 = this.$onAnswerUpdated;
            Function1<kotlinx.coroutines.s0, Unit> function3 = this.$onContinue;
            kotlinx.coroutines.s0 s0Var = this.$coroutineScope;
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarM);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f11)), c0Var, 6);
            float fR = androidx.compose.ui.unit.h.r(fG - androidx.compose.ui.unit.h.r(96));
            int size = content.getSecondaryCtaActions().size();
            for (int i11 = 0; i11 < size; i11++) {
                fR = androidx.compose.ui.unit.h.r(fR - androidx.compose.ui.unit.h.r(64));
            }
            androidx.compose.ui.a0 a0VarB = i6.b(androidx.compose.ui.a0.E, 0.0f, fR, 1, null);
            boolean z10 = false;
            a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarB);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
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
            androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
            c0Var.E(412604363);
            List<Block.Builder> stepTitle = content.getStepTitle();
            ArrayList<Block> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stepTitle, 10));
            Iterator<T> it = stepTitle.iterator();
            while (it.hasNext()) {
                arrayList.add(((Block.Builder) it.next()).build());
            }
            for (Block block : arrayList) {
                androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, f10, 1, obj);
                Intrinsics.checkNotNull(block);
                BlockViewKt.BlockView(a0VarH, new BlockRenderData(block, androidx.compose.ui.graphics.q0.n(content.getSurveyUiColors().m426getOnBackground0d7_KjU()), null, null, null, 28, null), false, null, false, null, null, null, null, false, null, null, c0Var, 70, 0, 4092);
                content = content;
                function1 = function1;
                function2 = function2;
                function3 = function3;
                s0Var = s0Var;
                z10 = false;
                obj = null;
                f10 = 0.0f;
            }
            final kotlinx.coroutines.s0 s0Var2 = s0Var;
            SurveyState.Content content2 = content;
            Function1<SurveyState.Content.SecondaryCta, Unit> function4 = function1;
            Function1<String, Unit> function5 = function2;
            final Function1<kotlinx.coroutines.s0, Unit> function6 = function3;
            c0Var.A();
            float f12 = 8;
            int i12 = 6;
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f12)), c0Var, 6);
            c0Var.E(412619710);
            int i13 = 0;
            for (Object obj2 : content2.getQuestions()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                QuestionState questionState = (QuestionState) obj2;
                final CharSequence charSequence = Phrase.from((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_surveys_question_question_number_of_question_count).put("questioin_number", i14).put("question_count", content2.getQuestions().size()).format();
                Function1<String, Unit> function7 = function5;
                QuestionComponentKt.m469QuestionComponentlzVJ5Jw(d5.t(androidx.compose.ui.semantics.t.e(androidx.compose.ui.a0.E, true, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return SurveyComponentKt.AnonymousClass1.invoke$lambda$8$lambda$6$lambda$5$lambda$4(charSequence, (androidx.compose.ui.semantics.e0) obj3);
                    }
                }), 0.0f, androidx.compose.ui.unit.h.r(f12), 1, null), null, questionState, null, function7, 0L, 0.0f, null, 0L, null, c0Var, 512, 1002);
                i12 = i12;
                i13 = i14;
                f12 = f12;
                function5 = function7;
            }
            float f13 = f12;
            int i15 = i12;
            c0Var.A();
            c0Var.o();
            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
            l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f13)), c0Var, i15);
            SurveyState.Content.PrimaryCta primaryCta = content2.getPrimaryCta();
            c0Var.E(-1140607254);
            if (primaryCta instanceof SurveyState.Content.PrimaryCta.Custom) {
                strD = ((SurveyState.Content.PrimaryCta.Custom) primaryCta).getText();
            } else {
                if (!(primaryCta instanceof SurveyState.Content.PrimaryCta.Fallback)) {
                    throw new kotlin.k0();
                }
                strD = u0.i.d(((SurveyState.Content.PrimaryCta.Fallback) primaryCta).getFallbackTextRes(), c0Var, 0);
            }
            String str = strD;
            c0Var.A();
            SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(null, str, content2.getSecondaryCtaActions(), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SurveyComponentKt.AnonymousClass1.invoke$lambda$8$lambda$7(function6, s0Var2);
                }
            }, function4, content2.getSurveyUiColors(), c0Var, 512, 1);
            l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f11)), c0Var, i15);
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SimpleSurvey(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(126014647);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null));
            Avatar avatarCreate = Avatar.create("", "AD");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(avatarCreate, "Andy", emptyAppConfig, true, surveyUiColors, new ProgressBarState(true, 0.5f));
            List listListOf = CollectionsKt.listOf((Object[]) new Block.Builder[]{new Block.Builder().withText("<b>Step 1</b>").withType(BlockType.HEADING.getSerializedName()), new Block.Builder().withText("Get tailored discounts to your inbox").withType(BlockType.PARAGRAPH.getSerializedName())});
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            QuestionState questionState = new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel(string, CollectionsKt.listOf(new Block.Builder().withText("Is this a preview?")), true, "Let us know", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, null, null, 448, null), surveyUiColors);
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            QuestionState questionState2 = new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(string2, CollectionsKt.listOf(new Block.Builder().withText("Question Title")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C", "Option D"}), false), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)));
            String string3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            List listListOf2 = CollectionsKt.listOf(new Block.Builder().withText("How would your rate your experience?"));
            SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType = SurveyData.Step.Question.QuestionData.QuestionSubType.STARS;
            IntRange intRange = new IntRange(1, 5);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((IntIterator) it).nextInt()));
            }
            SurveyComponent(new SurveyState.Content(listListOf, CollectionsKt.listOf((Object[]) new QuestionState[]{questionState, questionState2, new QuestionState(new SurveyData.Step.Question.NumericRatingQuestionModel(string3, listListOf2, true, arrayList, "Poor", "Excellent", 1, 5, questionSubType), surveyUiColors)}), CollectionsKt.emptyList(), new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button), surveyUiColors, senderTopBarState), new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SurveyComponentKt.SimpleSurvey$lambda$6((kotlinx.coroutines.s0) obj);
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SurveyComponentKt.SimpleSurvey$lambda$8((String) obj);
                }
            }, null, c0VarR, 3512, 16);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyComponentKt.SimpleSurvey$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleSurvey$lambda$6(kotlinx.coroutines.s0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleSurvey$lambda$8(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleSurvey$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SimpleSurvey(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x023e  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyComponent(@NotNull final SurveyState state, @NotNull final Function1<? super kotlinx.coroutines.s0, Unit> onContinue, @NotNull final Function0<Unit> onClose, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super SurveyState.Content.SecondaryCta, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function1<? super String, Unit> function3;
        int i13;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function4;
        int i14;
        final Function1<? super String, Unit> function5;
        final Function1<? super SurveyState.Content.SecondaryCta, Unit> function6;
        List listListOf;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(290100480);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.k0(onContinue) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(onClose) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 7168) == 0) {
                function3 = function1;
                i12 |= c0VarR.k0(function3) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i12 & 46811) == 9362 || !c0VarR.d()) {
                    if (i15 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function6 = function4;
                    }
                    if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                        listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                    } else {
                        listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                    }
                    androidx.compose.ui.graphics.i0 i0VarT = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.v.b(aVar, i0VarT, null, 0.0f, 6, null);
                    a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
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
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    c0Var2 = c0VarR;
                    pt.f(u7.b(aVar), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                            if ((i16 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                        }
                    }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(g5Var, c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                            if ((i16 & 14) == 0) {
                                i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                            }
                            if ((i16 & 91) == 18 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            SurveyState surveyState = state;
                            if (surveyState instanceof SurveyState.Content) {
                                c0Var3.E(-509523482);
                                SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                                c0Var3.A();
                                return;
                            }
                            if (surveyState instanceof SurveyState.Error) {
                                c0Var3.E(-509512239);
                                ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                                c0Var3.A();
                            } else if (surveyState instanceof SurveyState.Loading) {
                                c0Var3.E(-509506157);
                                LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                                c0Var3.A();
                            } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                                c0Var3.E(1385361405);
                                c0Var3.A();
                            } else {
                                c0Var3.E(-509524940);
                                c0Var3.A();
                                throw new kotlin.k0();
                            }
                        }
                    }, c0VarR, 54), c0Var2, 806879280, 444);
                    c0Var2.o();
                } else {
                    c0VarR.u();
                    c0Var2 = c0VarR;
                    function5 = function3;
                    function6 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SurveyComponentKt.SurveyComponent$lambda$3(state, onContinue, onClose, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function4 = function2;
            if ((i12 & 46811) == 9362) {
                if (i15 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                }
                androidx.compose.ui.graphics.i0 i0VarT2 = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.v.b(aVar3, i0VarT2, null, 0.0f, 6, null);
                a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                c0Var2 = c0VarR;
                pt.f(u7.b(aVar3), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                        if ((i16 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                    }
                }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(g5Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i16 & 14) == 0) {
                            i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                        }
                        if ((i16 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyState surveyState = state;
                        if (surveyState instanceof SurveyState.Content) {
                            c0Var3.E(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                            c0Var3.A();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            c0Var3.E(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            c0Var3.E(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                            c0Var3.E(1385361405);
                            c0Var3.A();
                        } else {
                            c0Var3.E(-509524940);
                            c0Var3.A();
                            throw new kotlin.k0();
                        }
                    }
                }, c0VarR, 54), c0Var2, 806879280, 444);
                c0Var2.o();
            } else {
                if (i15 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                }
                androidx.compose.ui.graphics.i0 i0VarT3 = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
                androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarB3 = androidx.compose.foundation.v.b(aVar5, i0VarT3, null, 0.0f, 6, null);
                a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
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
                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                c0Var2 = c0VarR;
                pt.f(u7.b(aVar5), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                        if ((i16 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                    }
                }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(g5Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i16 & 14) == 0) {
                            i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                        }
                        if ((i16 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyState surveyState = state;
                        if (surveyState instanceof SurveyState.Content) {
                            c0Var3.E(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                            c0Var3.A();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            c0Var3.E(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            c0Var3.E(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                            c0Var3.E(1385361405);
                            c0Var3.A();
                        } else {
                            c0Var3.E(-509524940);
                            c0Var3.A();
                            throw new kotlin.k0();
                        }
                    }
                }, c0VarR, 54), c0Var2, 806879280, 444);
                c0Var2.o();
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SurveyComponentKt.SurveyComponent$lambda$3(state, onContinue, onClose, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function3 = function1;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                function4 = function2;
                if (c0VarR.k0(function4)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i12 & 46811) == 9362) {
                if (i15 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                }
                androidx.compose.ui.graphics.i0 i0VarT4 = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
                androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarB4 = androidx.compose.foundation.v.b(aVar7, i0VarT4, null, 0.0f, 6, null);
                a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarB4);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                function0A = aVar8.a();
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
                y7.n(c0VarD, a1VarK4, aVar8.e());
                y7.n(c0VarD, b1VarK4, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar8.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                c0Var2 = c0VarR;
                pt.f(u7.b(aVar7), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                        if ((i16 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                    }
                }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(g5Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i16 & 14) == 0) {
                            i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                        }
                        if ((i16 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyState surveyState = state;
                        if (surveyState instanceof SurveyState.Content) {
                            c0Var3.E(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                            c0Var3.A();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            c0Var3.E(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            c0Var3.E(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                            c0Var3.E(1385361405);
                            c0Var3.A();
                        } else {
                            c0Var3.E(-509524940);
                            c0Var3.A();
                            throw new kotlin.k0();
                        }
                    }
                }, c0VarR, 54), c0Var2, 806879280, 444);
                c0Var2.o();
            } else {
                if (i15 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function6 = function4;
                }
                if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
                }
                androidx.compose.ui.graphics.i0 i0VarT5 = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
                androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarB5 = androidx.compose.foundation.v.b(aVar9, i0VarT5, null, 0.0f, 6, null);
                a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarB5);
                androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                function0A = aVar10.a();
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
                y7.n(c0VarD, a1VarK5, aVar10.e());
                y7.n(c0VarD, b1VarK5, aVar10.g());
                function2B = aVar10.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar10.f());
                androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                c0Var2 = c0VarR;
                pt.f(u7.b(aVar9), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                        if ((i16 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                    }
                }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(g5Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i16 & 14) == 0) {
                            i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                        }
                        if ((i16 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        SurveyState surveyState = state;
                        if (surveyState instanceof SurveyState.Content) {
                            c0Var3.E(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                            c0Var3.A();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            c0Var3.E(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            c0Var3.E(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                            c0Var3.E(1385361405);
                            c0Var3.A();
                        } else {
                            c0Var3.E(-509524940);
                            c0Var3.A();
                            throw new kotlin.k0();
                        }
                    }
                }, c0VarR, 54), c0Var2, 806879280, 444);
                c0Var2.o();
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SurveyComponentKt.SurveyComponent$lambda$3(state, onContinue, onClose, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function4 = function2;
        if ((i12 & 46811) == 9362) {
            if (i15 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i13 != 0) {
                function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                    }
                };
            } else {
                function6 = function4;
            }
            if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
            } else {
                listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
            }
            androidx.compose.ui.graphics.i0 i0VarT6 = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
            androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB6 = androidx.compose.foundation.v.b(aVar11, i0VarT6, null, 0.0f, 6, null);
            a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarB6);
            androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
            function0A = aVar12.a();
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
            y7.n(c0VarD, a1VarK6, aVar12.e());
            y7.n(c0VarD, b1VarK6, aVar12.g());
            function2B = aVar12.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN6, aVar12.f());
            androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
            c0Var2 = c0VarR;
            pt.f(u7.b(aVar11), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                    if ((i16 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                }
            }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(g5Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i16 & 14) == 0) {
                        i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                    }
                    if ((i16 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    SurveyState surveyState = state;
                    if (surveyState instanceof SurveyState.Content) {
                        c0Var3.E(-509523482);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                        c0Var3.A();
                        return;
                    }
                    if (surveyState instanceof SurveyState.Error) {
                        c0Var3.E(-509512239);
                        ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                        c0Var3.A();
                    } else if (surveyState instanceof SurveyState.Loading) {
                        c0Var3.E(-509506157);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                        c0Var3.A();
                    } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                        c0Var3.E(1385361405);
                        c0Var3.A();
                    } else {
                        c0Var3.E(-509524940);
                        c0Var3.A();
                        throw new kotlin.k0();
                    }
                }
            }, c0VarR, 54), c0Var2, 806879280, 444);
            c0Var2.o();
        } else {
            if (i15 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i13 != 0) {
                function6 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                    }
                };
            } else {
                function6 = function4;
            }
            if (ColorExtensionsKt.m735isDarkColor8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())) {
                listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m728darken8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
            } else {
                listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.q0[]{androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU())), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(state.getSurveyUiColors().m422getBackground0d7_KjU()), androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.m738lighten8_81llA(state.getSurveyUiColors().m422getBackground0d7_KjU()))});
            }
            androidx.compose.ui.graphics.i0 i0VarT7 = androidx.compose.ui.graphics.i0.a.t(androidx.compose.ui.graphics.i0.f37796b, listListOf, 0.0f, 0.0f, 0, 14, null);
            androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB7 = androidx.compose.foundation.v.b(aVar13, i0VarT7, null, 0.0f, 6, null);
            a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarB7);
            androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
            function0A = aVar14.a();
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
            y7.n(c0VarD, a1VarK7, aVar14.e());
            y7.n(c0VarD, b1VarK7, aVar14.g());
            function2B = aVar14.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar14.f());
            androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
            c0Var2 = c0VarR;
            pt.f(u7.b(aVar13), androidx.compose.runtime.internal.w.e(-365860662, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i16) {
                    if ((i16 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, u7.j(androidx.compose.ui.a0.E), c0Var3, 0, 0);
                }
            }, c0VarR, 54), null, null, null, 0, androidx.compose.ui.graphics.q0.f38131b.s(), 0L, null, androidx.compose.runtime.internal.w.e(-1342576427, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(g5Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i16) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i16 & 14) == 0) {
                        i16 |= c0Var3.D(contentPadding) ? 4 : 2;
                    }
                    if ((i16 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    SurveyState surveyState = state;
                    if (surveyState instanceof SurveyState.Content) {
                        c0Var3.E(-509523482);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, function5, function6, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 8, 0);
                        c0Var3.A();
                        return;
                    }
                    if (surveyState instanceof SurveyState.Error) {
                        c0Var3.E(-509512239);
                        ErrorComponentKt.SurveyError((SurveyState.Error) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                        c0Var3.A();
                    } else if (surveyState instanceof SurveyState.Loading) {
                        c0Var3.E(-509506157);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                        c0Var3.A();
                    } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                        c0Var3.E(1385361405);
                        c0Var3.A();
                    } else {
                        c0Var3.E(-509524940);
                        c0Var3.A();
                        throw new kotlin.k0();
                    }
                }
            }, c0VarR, 54), c0Var2, 806879280, 444);
            c0Var2.o();
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyComponentKt.SurveyComponent$lambda$3(state, onContinue, onClose, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyComponent$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyComponent$lambda$1(SurveyState.Content.SecondaryCta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyComponent$lambda$3(SurveyState state, Function1 onContinue, Function0 onClose, Function1 function1, Function1 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onContinue, "$onContinue");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        SurveyComponent(state, onContinue, onClose, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyContent(@NotNull final SurveyState.Content state, @NotNull final Function1<? super kotlinx.coroutines.s0, Unit> onContinue, @NotNull final Function1<? super String, Unit> onAnswerUpdated, @NotNull final Function1<? super SurveyState.Content.SecondaryCta, Unit> onSecondaryCtaClicked, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "onSecondaryCtaClicked");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(433920899);
        androidx.compose.ui.a0 a0Var2 = (i11 & 16) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Object objI0 = c0VarR.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
            c0VarR.Y(objI0);
        }
        androidx.compose.foundation.layout.g0.c(i6.f(a0Var2, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1844267539, true, new AnonymousClass1(state, onSecondaryCtaClicked, onAnswerUpdated, onContinue, (kotlinx.coroutines.s0) objI0), c0VarR, 54), c0VarR, 3072, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyComponentKt.SurveyContent$lambda$4(state, onContinue, onAnswerUpdated, onSecondaryCtaClicked, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyContent$lambda$4(SurveyState.Content state, Function1 onContinue, Function1 onAnswerUpdated, Function1 onSecondaryCtaClicked, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onContinue, "$onContinue");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "$onSecondaryCtaClicked");
        SurveyContent(state, onContinue, onAnswerUpdated, onSecondaryCtaClicked, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyErrorState(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1165269984);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            Avatar avatarCreate = Avatar.create("", "AD");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            SurveyComponent(new SurveyState.Error.WithCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new TopBarState.SenderTopBarState(avatarCreate, "Andy", emptyAppConfig, true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 32, null), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, 1, null), new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SurveyComponentKt.SurveyErrorState$lambda$11((kotlinx.coroutines.s0) obj);
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SurveyComponentKt.SurveyErrorState$lambda$13((String) obj);
                }
            }, null, c0VarR, 3504, 16);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyComponentKt.SurveyErrorState$lambda$14(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyErrorState$lambda$11(kotlinx.coroutines.s0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyErrorState$lambda$13(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyErrorState$lambda$14(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SurveyErrorState(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final AppConfig getEmptyAppConfig() {
        return emptyAppConfig;
    }
}
