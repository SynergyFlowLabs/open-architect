package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.foundation.layout.m0;
import androidx.compose.material3.q50;
import androidx.compose.material3.r;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.t;
import androidx.compose.ui.focus.q;
import androidx.constraintlayout.core.motion.utils.v;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDropDownQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropDownQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/dropdown/DropDownQuestionKt$DropDownQuestion$1$1$1$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n1872#2,2:188\n1874#2:196\n1282#3,6:190\n*S KotlinDebug\n*F\n+ 1 DropDownQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/dropdown/DropDownQuestionKt$DropDownQuestion$1$1$1$4\n*L\n119#1:188,2\n119#1:196\n121#1:190,6\n*E\n"})
final class DropDownQuestionKt$DropDownQuestion$1$1$1$4 implements n<m0, c0, Integer, Unit> {
    final /* synthetic */ SurveyData.Step.Question.DropDownQuestionModel $dropDownQuestionModel;
    final /* synthetic */ n3<Boolean> $expanded$delegate;
    final /* synthetic */ q $focusManager;
    final /* synthetic */ Function1<Answer, Unit> $onAnswer;

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1", f = "DropDownQuestion.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ q $focusManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(q qVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$focusManager = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$focusManager, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            q.o(this.$focusManager, false, 1, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    DropDownQuestionKt$DropDownQuestion$1$1$1$4(SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, q qVar, Function1<? super Answer, Unit> function1, n3<Boolean> n3Var) {
        this.$dropDownQuestionModel = dropDownQuestionModel;
        this.$focusManager = qVar;
        this.$onAnswer = function1;
        this.$expanded$delegate = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 onAnswer, String optionText, n3 expanded$delegate) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(optionText, "$optionText");
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        onAnswer.invoke(new Answer.SingleAnswer(optionText));
        boolean z10 = true | false;
        DropDownQuestionKt.DropDownQuestion$lambda$2(expanded$delegate, false);
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, c0 c0Var, Integer num) {
        invoke(m0Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(m0 DropdownMenu, c0 c0Var, int i10) {
        c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i10 & 81) == 16 && c0Var2.d()) {
            c0Var2.u();
            return;
        }
        b2.i("", new AnonymousClass1(this.$focusManager, null), c0Var2, 70);
        List<String> options = this.$dropDownQuestionModel.getOptions();
        final Function1<Answer, Unit> function1 = this.$onAnswer;
        final n3<Boolean> n3Var = this.$expanded$delegate;
        int i11 = 0;
        for (Object obj : options) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            androidx.compose.runtime.internal.c cVarE = w.e(-864903633, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var3, int i13) {
                    if ((i13 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else {
                        q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                    }
                }
            }, c0Var2, 54);
            c0Var2.E(55713838);
            boolean zD = c0Var2.D(function1) | c0Var2.D(str);
            Object objI0 = c0Var2.i0();
            if (zD || objI0 == c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DropDownQuestionKt$DropDownQuestion$1$1$1$4.invoke$lambda$2$lambda$1$lambda$0(function1, str, n3Var);
                    }
                };
                c0Var2.Y(objI0);
            }
            c0Var2.A();
            r.i(cVarE, (Function0) objI0, null, null, null, false, null, null, null, c0Var2, 6, v.g.f44096p);
            c0Var2 = c0Var;
            i11 = i12;
        }
    }
}
