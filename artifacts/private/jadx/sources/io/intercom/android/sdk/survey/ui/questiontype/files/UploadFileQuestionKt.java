package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
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
@SourceDebugExtension({"SMAP\nUploadFileQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/UploadFileQuestionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,115:1\n75#2:116\n*S KotlinDebug\n*F\n+ 1 UploadFileQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/UploadFileQuestionKt\n*L\n38#1:116\n*E\n"})
public final class UploadFileQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nUploadFileQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/UploadFileQuestionKt$UploadFileQuestion$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n87#2:116\n84#2,9:117\n94#2:158\n80#3,6:126\n87#3,3:141\n90#3,2:150\n94#3:157\n391#4,9:132\n400#4:152\n401#4,2:155\n4360#5,6:144\n113#6:153\n113#6:154\n1611#7,9:159\n1863#7:168\n1864#7:170\n1620#7:171\n1557#7:172\n1628#7,3:173\n1#8:169\n*S KotlinDebug\n*F\n+ 1 UploadFileQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/UploadFileQuestionKt$UploadFileQuestion$2\n*L\n40#1:116\n40#1:117,9\n40#1:158\n40#1:126,6\n40#1:141,3\n40#1:150,2\n40#1:157\n40#1:132,9\n40#1:152\n40#1:155,2\n40#1:144,6\n42#1:153\n58#1:154\n68#1:159,9\n68#1:168\n68#1:170\n68#1:171\n69#1:172\n69#1:173,3\n68#1:169\n*E\n"})
    static final class AnonymousClass2 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ Context $context;
        final /* synthetic */ androidx.compose.ui.a0 $modifier;
        final /* synthetic */ Function1<Answer, Unit> $onAnswer;
        final /* synthetic */ Function1<AnswerClickData, Unit> $onAnswerClick;
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> $questionHeader;
        final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel $questionModel;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(androidx.compose.ui.a0 a0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Answer answer, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Function1<? super AnswerClickData, Unit> function1, Function1<? super Answer, Unit> function3, Context context) {
            this.$modifier = a0Var;
            this.$questionHeader = function2;
            this.$answer = answer;
            this.$questionModel = uploadFileQuestionModel;
            this.$onAnswerClick = function1;
            this.$onAnswer = function3;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$0(Function1 function1, SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer.MediaAnswer.MediaItem item) {
            Intrinsics.checkNotNullParameter(questionModel, "$questionModel");
            Intrinsics.checkNotNullParameter(item, "item");
            function1.invoke(new AnswerClickData(item, questionModel.getId()));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(Answer answer, Function1 onAnswer, Context context, List uris) {
            Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(uris, "uris");
            ArrayList arrayList = new ArrayList();
            Iterator it = uris.iterator();
            while (it.hasNext()) {
                MediaData.Media mediaData$default = URIExtensionsKt.getMediaData$default((Uri) it.next(), context, false, 2, null);
                if (mediaData$default != null) {
                    arrayList.add(mediaData$default);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Answer.MediaAnswer.MediaItem((MediaData.Media) it2.next()));
            }
            if (answer instanceof Answer.NoAnswer.InitialNoAnswer) {
                onAnswer.invoke(new Answer.MediaAnswer(arrayList2));
            } else {
                ArrayList arrayList3 = new ArrayList();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                arrayList3.addAll(((Answer.MediaAnswer) answer).getMediaItems());
                arrayList3.addAll(arrayList2);
                onAnswer.invoke(new Answer.MediaAnswer(arrayList3));
            }
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
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0 a0Var = this.$modifier;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.$questionHeader;
            final Answer answer = this.$answer;
            final SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = this.$questionModel;
            final Function1<AnswerClickData, Unit> function1 = this.$onAnswerClick;
            final Function1<Answer, Unit> function3 = this.$onAnswer;
            final Context context = this.$context;
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            y7.n(c0VarD, a1VarB, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            n0 n0Var = n0.f16227a;
            function2.invoke(c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            float f10 = 8;
            l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
            c0Var.E(903574919);
            boolean z10 = answer instanceof Answer.MediaAnswer;
            if (z10) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                FileAttachmentListKt.FileAttachmentList(mediaAnswer.getMediaItems(), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.l0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UploadFileQuestionKt.AnonymousClass2.invoke$lambda$5$lambda$0(function1, uploadFileQuestionModel, (Answer.MediaAnswer.MediaItem) obj);
                    }
                }, c0Var, 8);
                if (!mediaAnswer.getMediaItems().isEmpty()) {
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
                }
            }
            c0Var.A();
            int size = z10 ? ((Answer.MediaAnswer) answer).getMediaItems().size() : 0;
            c0Var.E(903602132);
            if (size < uploadFileQuestionModel.getMaxSelection()) {
                MediaPickerButtonKt.MediaPickerButton(uploadFileQuestionModel.getMaxSelection() - size, null, MediaType.All, uploadFileQuestionModel.getSupportedFileType(), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UploadFileQuestionKt.AnonymousClass2.invoke$lambda$5$lambda$4(answer, function3, context, (List) obj);
                    }
                }, new MediaPickerButtonCTAStyle.TextButton(u0.i.d(R.string.intercom_add, c0Var, 0)), null, androidx.compose.runtime.internal.w.e(562613810, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2$1$3
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
                            AddFileButtonKt.AddFileButton(null, uploadFileQuestionModel.getMaxSelection() == 1 ? R.string.intercom_tickets_add_file : R.string.intercom_tickets_add_files, c0Var2, 0, 1);
                        }
                    }
                }, c0Var, 54), c0Var, (MediaPickerButtonCTAStyle.TextButton.$stable << 15) | 12587392, 66);
            }
            c0Var.A();
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void UploadFileQuestion(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final SurveyData.Step.Question.UploadFileQuestionModel questionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @Nullable Function1<? super AnswerClickData, Unit> function1, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1688907441);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        Function1<? super AnswerClickData, Unit> function3 = (i11 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadFileQuestionKt.UploadFileQuestion$lambda$0((AnswerClickData) obj);
            }
        } : function1;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2M505getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$UploadFileQuestionKt.INSTANCE.m505getLambda1$intercom_sdk_base_release() : function2;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        final Answer answer3 = answer2;
        final Function1<? super AnswerClickData, Unit> function4 = function3;
        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1739158412, true, new AnonymousClass2(a0Var2, function2M505getLambda1$intercom_sdk_base_release, answer2, questionModel, function3, onAnswer, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())), c0VarR, 54), c0VarR, 12582912, 127);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UploadFileQuestionKt.UploadFileQuestion$lambda$1(a0Var3, questionModel, answer3, onAnswer, function4, function2M505getLambda1$intercom_sdk_base_release, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestion$lambda$0(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestion$lambda$1(androidx.compose.ui.a0 a0Var, SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer answer, Function1 onAnswer, Function1 function1, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(questionModel, "$questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        UploadFileQuestion(a0Var, questionModel, answer, onAnswer, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Light Mode", uiMode = 16), @d1.c(name = "Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void UploadFileQuestionPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(21672603);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadFileQuestionKt.INSTANCE.m506getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UploadFileQuestionKt.UploadFileQuestionPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestionPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UploadFileQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
