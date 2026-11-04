package io.intercom.android.sdk.survey.ui.questiontype;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.t0;
import androidx.compose.material3.a4;
import androidx.compose.material3.h80;
import androidx.compose.material3.i9;
import androidx.compose.material3.ni;
import androidx.compose.material3.pj;
import androidx.compose.material3.q50;
import androidx.compose.material3.s70;
import androidx.compose.material3.u10;
import androidx.compose.material3.x7;
import androidx.compose.material3.z9;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.q1;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDatePickerQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/DatePickerQuestionKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,332:1\n87#2:333\n84#2,9:334\n94#2:415\n80#3,6:343\n87#3,3:358\n90#3,2:367\n80#3,6:380\n87#3,3:395\n90#3,2:404\n94#3:410\n94#3:414\n80#3,6:430\n87#3,3:445\n90#3,2:454\n94#3:461\n80#3,6:489\n87#3,3:504\n90#3,2:513\n94#3:520\n391#4,9:349\n400#4:369\n391#4,9:386\n400#4:406\n401#4,2:408\n401#4,2:412\n391#4,9:436\n400#4:456\n401#4,2:459\n391#4,9:495\n400#4:515\n401#4,2:518\n4360#5,6:361\n4360#5,6:398\n4360#5,6:448\n4360#5,6:507\n113#6:370\n113#6:407\n113#6:423\n113#6:457\n113#6:458\n113#6:482\n113#6:516\n113#6:517\n99#7:371\n97#7,8:372\n106#7:411\n99#7,6:424\n106#7:462\n99#7,6:483\n106#7:521\n75#8:416\n75#8:475\n1282#9,6:417\n1282#9,6:463\n1282#9,6:469\n1282#9,6:476\n1282#9,6:522\n1282#9,6:528\n1611#10,9:534\n1863#10:543\n1864#10:545\n1620#10:546\n1#11:544\n1#11:547\n85#12:548\n117#12,2:549\n85#12:551\n117#12,2:552\n*S KotlinDebug\n*F\n+ 1 DatePickerQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/DatePickerQuestionKt\n*L\n58#1:333\n58#1:334,9\n58#1:415\n58#1:343,6\n58#1:358,3\n58#1:367,2\n61#1:380,6\n61#1:395,3\n61#1:404,2\n61#1:410\n58#1:414\n80#1:430,6\n80#1:445,3\n80#1:454,2\n80#1:461\n187#1:489,6\n187#1:504,3\n187#1:513,2\n187#1:520\n58#1:349,9\n58#1:369\n61#1:386,9\n61#1:406\n61#1:408,2\n58#1:412,2\n80#1:436,9\n80#1:456\n80#1:459,2\n187#1:495,9\n187#1:515\n187#1:518,2\n58#1:361,6\n61#1:398,6\n80#1:448,6\n187#1:507,6\n60#1:370\n63#1:407\n83#1:423\n99#1:457\n107#1:458\n190#1:482\n206#1:516\n214#1:517\n61#1:371\n61#1:372,8\n61#1:411\n80#1:424,6\n80#1:462\n187#1:483,6\n187#1:521\n72#1:416\n179#1:475\n73#1:417,6\n115#1:463,6\n119#1:469,6\n180#1:476,6\n222#1:522,6\n226#1:528,6\n238#1:534,9\n238#1:543\n238#1:545\n238#1:546\n238#1:544\n73#1:548\n73#1:549,2\n180#1:551\n180#1:552,2\n*E\n"})
public final class DatePickerQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nDatePickerQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/DatePickerQuestionKt$ComposeDatePickerDialog$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,332:1\n1282#2,6:333\n*S KotlinDebug\n*F\n+ 1 DatePickerQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/DatePickerQuestionKt$ComposeDatePickerDialog$1\n*L\n142#1:333,6\n*E\n"})
    static final class AnonymousClass1 implements Function2<c0, Integer, Unit> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ z9 $datePickerState;
        final /* synthetic */ Function1<Answer, Unit> $onAnswer;
        final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(z9 z9Var, Answer answer, Function1<? super Answer, Unit> function1, Function0<Unit> function0) {
            this.$datePickerState = z9Var;
            this.$answer = answer;
            this.$onAnswer = function1;
            this.$onDismiss = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(z9 datePickerState, Answer answer, Function1 onAnswer, Function0 onDismiss) {
            Answer.DateTimeAnswer dateTimeAnswer;
            Intrinsics.checkNotNullParameter(datePickerState, "$datePickerState");
            Intrinsics.checkNotNullParameter(answer, "$answer");
            Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
            Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
            Long lJ = datePickerState.j();
            if (lJ != null) {
                if (answer instanceof Answer.DateTimeAnswer) {
                    dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, lJ.longValue(), 0, 0, 6, null);
                } else {
                    long jCurrentTimeMillis = Injector.get().getTimeProvider().currentTimeMillis();
                    List utcTime = DatePickerQuestionKt.getUtcTime(TimeFormatter.getHour(jCurrentTimeMillis), TimeFormatter.getMinute(jCurrentTimeMillis));
                    dateTimeAnswer = new Answer.DateTimeAnswer(lJ.longValue(), Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)));
                }
                onAnswer.invoke(dateTimeAnswer);
            } else {
                onDismiss.invoke();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            c0Var.E(313001213);
            boolean zD = c0Var.D(this.$datePickerState) | c0Var.D(this.$answer) | c0Var.D(this.$onAnswer) | c0Var.D(this.$onDismiss);
            final z9 z9Var = this.$datePickerState;
            final Answer answer = this.$answer;
            final Function1<Answer, Unit> function1 = this.$onAnswer;
            final Function0<Unit> function0 = this.$onDismiss;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DatePickerQuestionKt.AnonymousClass1.invoke$lambda$1$lambda$0(z9Var, answer, function1, function0);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            a4.p((Function0) objI0, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m475getLambda2$intercom_sdk_base_release(), c0Var, 805306368, v.g.f44098r);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void ComposeDatePickerDialog(final Answer answer, final Function1<? super Answer, Unit> function1, final Function0<Unit> function0, c0 c0Var, final int i10) {
        int i11;
        long jCurrentTimeMillis;
        c0 c0VarR = c0Var.R(-307045537);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(answer) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() > 0) {
                    jCurrentTimeMillis = dateTimeAnswer.getDate();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            final z9 z9VarX0 = i9.X0(Long.valueOf(jCurrentTimeMillis), null, null, 0, null, c0VarR, 0, 30);
            x7.b(function0, w.e(308986865, true, new AnonymousClass1(z9VarX0, answer, function1, function0), c0VarR, 54), null, w.e(1712856051, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeDatePickerDialog.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var2, int i12) {
                    if ((i12 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        a4.p(function0, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m476getLambda3$intercom_sdk_base_release(), c0Var2, 805306368, v.g.f44098r);
                    }
                }
            }, c0VarR, 54), null, 0.0f, null, null, w.e(-725444728, true, new pj.n<m0, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeDatePickerDialog.3
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, c0 c0Var2, Integer num) {
                    invoke(m0Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(m0 DatePickerDialog, c0 c0Var2, int i12) {
                    Intrinsics.checkNotNullParameter(DatePickerDialog, "$this$DatePickerDialog");
                    if ((i12 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    i9.L(z9VarX0, d5.r(a0.E, androidx.compose.ui.unit.h.r(16)), null, null, null, null, false, null, c0Var2, 48, com.planner5d.library.engine.input.f.b.V1);
                }
            }, c0VarR, 54), c0VarR, ((i11 >> 6) & 14) | 100666416, 244);
            c0VarR = c0VarR;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerQuestionKt.ComposeDatePickerDialog$lambda$13(answer, function1, function0, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeDatePickerDialog$lambda$13(Answer answer, Function1 onAnswer, Function0 onDismiss, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        ComposeDatePickerDialog(answer, onAnswer, onDismiss, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void ComposeTimePickerDialog(final Answer answer, final Function1<? super Answer, Unit> function1, final Function0<Unit> function0, c0 c0Var, final int i10) {
        int i11;
        final Function0<Unit> function2;
        Object obj = 0;
        c0 c0VarR = c0Var.R(-1295396418);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(answer) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            function2 = function0;
        } else {
            List<String> localTime = getLocalTime(answer);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = localTime.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            final h80 h80VarR1 = s70.R1(((Number) (arrayList.size() > 0 ? arrayList.get(0) : obj)).intValue(), ((Number) (1 < arrayList.size() ? arrayList.get(1) : 0)).intValue(), true, c0VarR, a5.S0, 0);
            function2 = function0;
            androidx.compose.ui.window.b.a(function2, null, w.e(-1529528875, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeTimePickerDialog.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1$1, reason: invalid class name and collision with other inner class name */
                @SourceDebugExtension({"SMAP\nDatePickerQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/DatePickerQuestionKt$ComposeTimePickerDialog$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,332:1\n113#2:333\n113#2:371\n113#2:372\n113#2:409\n87#3:334\n84#3,9:335\n94#3:417\n80#4,6:344\n87#4,3:359\n90#4,2:368\n80#4,6:382\n87#4,3:397\n90#4,2:406\n94#4:412\n94#4:416\n391#5,9:350\n400#5:370\n391#5,9:388\n400#5:408\n401#5,2:410\n401#5,2:414\n4360#6,6:362\n4360#6,6:400\n99#7:373\n97#7,8:374\n106#7:413\n*S KotlinDebug\n*F\n+ 1 DatePickerQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/DatePickerQuestionKt$ComposeTimePickerDialog$1$1\n*L\n255#1:333\n262#1:371\n264#1:372\n272#1:409\n254#1:334\n254#1:335,9\n254#1:417\n254#1:344,6\n254#1:359,3\n254#1:368,2\n265#1:382,6\n265#1:397,3\n265#1:406,2\n265#1:412\n254#1:416\n254#1:350,9\n254#1:370\n265#1:388,9\n265#1:408\n265#1:410,2\n254#1:414,2\n254#1:362,6\n265#1:400,6\n265#1:373\n265#1:374,8\n265#1:413\n*E\n"})
                static final class C20441 implements Function2<c0, Integer, Unit> {
                    final /* synthetic */ Answer $answer;
                    final /* synthetic */ Function1<Answer, Unit> $onAnswer;
                    final /* synthetic */ Function0<Unit> $onDismiss;
                    final /* synthetic */ h80 $timePickerState;

                    /* JADX WARN: Multi-variable type inference failed */
                    C20441(h80 h80Var, Function0<Unit> function0, Answer answer, Function1<? super Answer, Unit> function1) {
                        this.$timePickerState = h80Var;
                        this.$onDismiss = function0;
                        this.$answer = answer;
                        this.$onAnswer = function1;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(h80 timePickerState, Answer answer, Function1 onAnswer) {
                        Intrinsics.checkNotNullParameter(timePickerState, "$timePickerState");
                        Intrinsics.checkNotNullParameter(answer, "$answer");
                        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
                        List utcTime = DatePickerQuestionKt.getUtcTime(timePickerState.a(), timePickerState.f());
                        onAnswer.invoke(answer instanceof Answer.DateTimeAnswer ? Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, 0L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)), 1, null) : new Answer.DateTimeAnswer(-1L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1))));
                        return Unit.f312394a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                        invoke(c0Var, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(c0 c0Var, int i10) {
                        if ((i10 & 11) == 2 && c0Var.d()) {
                            c0Var.u();
                            return;
                        }
                        a0.a aVar = a0.E;
                        float f10 = 24;
                        a0 a0VarR = d5.r(aVar, androidx.compose.ui.unit.h.r(f10));
                        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.b bVarM = aVar2.m();
                        final h80 h80Var = this.$timePickerState;
                        Function0<Unit> function0 = this.$onDismiss;
                        final Answer answer = this.$answer;
                        final Function1<Answer, Unit> function1 = this.$onAnswer;
                        q qVar = q.f16330a;
                        a1 a1VarB = j0.b(qVar.y(), bVarM, c0Var, 48);
                        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                        b1 b1VarK = c0Var.k();
                        a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarR);
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
                        c0 c0VarD = y7.d(c0Var);
                        y7.n(c0VarD, a1VarB, aVar3.e());
                        y7.n(c0VarD, b1VarK, aVar3.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar3.f());
                        n0 n0Var = n0.f16227a;
                        q50.t("Select time", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pj.f31758a.e(c0Var, pj.f31759b).y(), c0Var, 6, 0, 131070);
                        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
                        s70.H0(h80Var, null, null, 0, c0Var, 8, 14);
                        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
                        a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
                        a1 a1VarE = u5.e(qVar.o(), aVar2.w(), c0Var, 6);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                        b1 b1VarK2 = c0Var.k();
                        a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarH);
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
                        c0 c0VarD2 = y7.d(c0Var);
                        y7.n(c0VarD2, a1VarE, aVar3.e());
                        y7.n(c0VarD2, b1VarK2, aVar3.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN2, aVar3.f());
                        y5 y5Var = y5.f16577a;
                        ComposableSingletons$DatePickerQuestionKt composableSingletons$DatePickerQuestionKt = ComposableSingletons$DatePickerQuestionKt.INSTANCE;
                        a4.p(function0, null, false, null, null, null, null, null, null, composableSingletons$DatePickerQuestionKt.m477getLambda4$intercom_sdk_base_release(), c0Var, 805306368, v.g.f44098r);
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var, 6);
                        a4.p(new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DatePickerQuestionKt.C28351.C20441.invoke$lambda$2$lambda$1$lambda$0(h80Var, answer, function1);
                            }
                        }, null, false, null, null, null, null, null, null, composableSingletons$DatePickerQuestionKt.m478getLambda5$intercom_sdk_base_release(), c0Var, 805306368, v.g.f44098r);
                        c0Var.o();
                        c0Var.o();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var2, int i12) {
                    if ((i12 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    u10.c(i6.h(a0.E, 0.0f, 1, null), pj.f31758a.d(c0Var2, pj.f31759b).g(), 0L, 0L, androidx.compose.ui.unit.h.r(6), 0.0f, null, w.e(-1066676752, true, new C20441(h80VarR1, function0, answer, function1), c0Var2, 54), c0Var2, 12607494, 108);
                }
            }, c0VarR, 54), c0VarR, ((i11 >> 6) & 14) | a5.S0, 2);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DatePickerQuestionKt.ComposeTimePickerDialog$lambda$27(answer, function1, function2, i10, (c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeTimePickerDialog$lambda$27(Answer answer, Function1 onAnswer, Function0 onDismiss, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        ComposeTimePickerDialog(answer, onAnswer, onDismiss, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void DatePicker(final a0 a0Var, Answer answer, Function1<? super Answer, Unit> function1, c0 c0Var, final int i10) {
        int i11;
        String timeInMillisAsDate;
        final Answer answer2;
        final n3 n3Var;
        final Function1<? super Answer, Unit> function2 = function1;
        c0 c0VarR = c0Var.R(2133326452);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.D(answer) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            answer2 = answer;
        } else {
            final androidx.compose.ui.focus.q qVar = (androidx.compose.ui.focus.q) c0VarR.W(q1.n());
            c0VarR.E(995397106);
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            final n3 n3Var2 = (n3) objI0;
            c0VarR.A();
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() != -1) {
                    timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(dateTimeAnswer.getDate(), "dd - MM - YYYY");
                } else {
                    timeInMillisAsDate = "DD - MM - YYYY";
                }
            } else {
                timeInMillisAsDate = "DD - MM - YYYY";
            }
            float fR = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            String str = timeInMillisAsDate;
            a0 a0VarJ = i1.j(androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.i(a0Var, fR, q0.w(intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), intercomTheme.getShapes(c0VarR, i12).m()), intercomTheme.getShapes(c0VarR, i12).m()), intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DatePickerQuestionKt.DatePicker$lambda$6(qVar, n3Var2);
                }
            }, 15, null);
            a1 a1VarE = u5.e(q.f16330a.s(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            Intrinsics.checkNotNull(str);
            a0.a aVar3 = a0.E;
            float f10 = 16;
            q50.t(str, i6.H(d5.r(aVar3, androidx.compose.ui.unit.h.r(f10)), null, false, 3, null), q0.w(intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), contentAlpha(!Intrinsics.areEqual(str, "DD - MM - YYYY"), c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i12).getType04(), c0VarR, 48, 0, 131064);
            c0VarR = c0VarR;
            ni.o(u0.e.c(R.drawable.intercom_ic_pick_date, c0VarR, 0), u0.i.d(R.string.intercom_choose_the_date, c0VarR, 0), d5.r(aVar3, androidx.compose.ui.unit.h.r(f10)), intercomTheme.getColors(c0VarR, i12).m684getAction0d7_KjU(), c0VarR, 392, 0);
            c0VarR.o();
            if (DatePicker$lambda$4(n3Var2)) {
                c0VarR.E(995446935);
                boolean z10 = (i11 & 896) == 256;
                Object objI1 = c0VarR.i0();
                if (z10 || objI1 == aVar.a()) {
                    function2 = function1;
                    n3Var = n3Var2;
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DatePickerQuestionKt.DatePicker$lambda$9$lambda$8(function2, n3Var, (Answer) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    function2 = function1;
                    n3Var = n3Var2;
                }
                Function1 function3 = (Function1) objI1;
                c0VarR.A();
                c0VarR.E(995450986);
                Object objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DatePickerQuestionKt.DatePicker$lambda$11$lambda$10(n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                int i13 = ((i11 >> 3) & 14) | a5.S0;
                answer2 = answer;
                ComposeDatePickerDialog(answer2, function3, (Function0) objI2, c0VarR, i13);
            } else {
                answer2 = answer;
                function2 = function1;
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerQuestionKt.DatePicker$lambda$12(a0Var, answer2, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$11$lambda$10(n3 showDatePicker$delegate) {
        Intrinsics.checkNotNullParameter(showDatePicker$delegate, "$showDatePicker$delegate");
        DatePicker$lambda$5(showDatePicker$delegate, false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$12(a0 modifier, Answer answer, Function1 onAnswer, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        DatePicker(modifier, answer, onAnswer, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final boolean DatePicker$lambda$4(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void DatePicker$lambda$5(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$6(androidx.compose.ui.focus.q focusManager, n3 showDatePicker$delegate) {
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(showDatePicker$delegate, "$showDatePicker$delegate");
        int i10 = 2 >> 1;
        androidx.compose.ui.focus.q.o(focusManager, false, 1, null);
        DatePicker$lambda$5(showDatePicker$delegate, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$9$lambda$8(Function1 onAnswer, n3 showDatePicker$delegate, Answer newAnswer) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(showDatePicker$delegate, "$showDatePicker$delegate");
        Intrinsics.checkNotNullParameter(newAnswer, "newAnswer");
        onAnswer.invoke(newAnswer);
        DatePicker$lambda$5(showDatePicker$delegate, false);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DatePickerQuestion(@Nullable a0 a0Var, @NotNull final SurveyData.Step.Question.DatePickerQuestionModel questionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @Nullable Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10, final int i11) {
        a0 a0Var2;
        int i12;
        Answer answer2;
        int i13;
        int i14;
        Function2<? super c0, ? super Integer, Unit> function2M474getLambda1$intercom_sdk_base_release;
        int i15;
        a0 a0Var3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        final a0 a0Var4;
        final Answer answer3;
        final Function2<? super c0, ? super Integer, Unit> function3;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        c0 c0VarR = c0Var.R(1725209962);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                answer2 = answer;
                i12 |= c0VarR.D(answer2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.k0(onAnswer)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((57344 & i10) == 0) {
                    function2M474getLambda1$intercom_sdk_base_release = function2;
                    if (c0VarR.k0(function2M474getLambda1$intercom_sdk_base_release)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((46731 & i12) == 9346 || !c0VarR.d()) {
                    if (i16 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i14 != 0) {
                        function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    }
                    q qVar = q.f16330a;
                    q.m mVarY = qVar.y();
                    androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarB = j0.b(mVarY, aVar.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK = c0VarR.k();
                    a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    a0 a0Var5 = a0Var3;
                    y7.n(c0VarD, a1VarB, aVar2.e());
                    y7.n(c0VarD, b1VarK, aVar2.g());
                    function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar2.f());
                    n0 n0Var = n0.f16227a;
                    function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                    a0.a aVar3 = a0.E;
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0 a0VarH = i6.h(aVar3, 0.0f, 1, null);
                    a1 a1VarE = u5.e(qVar.s(), aVar.w(), c0VarR, 6);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK2 = c0VarR.k();
                    a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarH);
                    function0A2 = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE, aVar2.e());
                    y7.n(c0VarD2, b1VarK2, aVar2.g());
                    function2B2 = aVar2.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar2.f());
                    y5 y5Var = y5.f16577a;
                    a0 a0VarG = i6.g(aVar3, 0.5f);
                    int i18 = i12 >> 3;
                    int i19 = (i18 & 896) | (i18 & com.planner5d.library.engine.input.f.b.B) | 6;
                    DatePicker(a0VarG, answer2, onAnswer, c0VarR, i19);
                    l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    TimePicker(i6.g(aVar3, 1.0f), answer2, onAnswer, c0VarR, i19);
                    c0VarR.o();
                    c0VarR.o();
                    a0Var4 = a0Var5;
                } else {
                    c0VarR.u();
                    a0Var4 = a0Var2;
                }
                answer3 = answer2;
                function3 = function2M474getLambda1$intercom_sdk_base_release;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerQuestionKt.DatePickerQuestion$lambda$2(a0Var4, questionModel, answer3, onAnswer, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function2M474getLambda1$intercom_sdk_base_release = function2;
            if ((46731 & i12) == 9346) {
                if (i16 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                }
                q qVar2 = q.f16330a;
                q.m mVarY2 = qVar2.y();
                androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
                a1 a1VarB2 = j0.b(mVarY2, aVar4.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                function0A = aVar5.a();
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
                a0 a0Var6 = a0Var3;
                y7.n(c0VarD, a1VarB2, aVar5.e());
                y7.n(c0VarD, b1VarK3, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar5.f());
                n0 n0Var2 = n0.f16227a;
                function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                a0.a aVar6 = a0.E;
                l6.a(i6.i(aVar6, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0 a0VarH2 = i6.h(aVar6, 0.0f, 1, null);
                a1 a1VarE2 = u5.e(qVar2.s(), aVar4.w(), c0VarR, 6);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarH2);
                function0A2 = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE2, aVar5.e());
                y7.n(c0VarD2, b1VarK4, aVar5.g());
                function2B2 = aVar5.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN4, aVar5.f());
                y5 y5Var2 = y5.f16577a;
                a0 a0VarG2 = i6.g(aVar6, 0.5f);
                int i110 = i12 >> 3;
                int i111 = (i110 & 896) | (i110 & com.planner5d.library.engine.input.f.b.B) | 6;
                DatePicker(a0VarG2, answer2, onAnswer, c0VarR, i111);
                l6.a(i6.B(aVar6, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                TimePicker(i6.g(aVar6, 1.0f), answer2, onAnswer, c0VarR, i111);
                c0VarR.o();
                c0VarR.o();
                a0Var4 = a0Var6;
            } else {
                if (i16 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                }
                q qVar3 = q.f16330a;
                q.m mVarY3 = qVar3.y();
                androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                a1 a1VarB3 = j0.b(mVarY3, aVar7.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                a0 a0Var7 = a0Var3;
                y7.n(c0VarD, a1VarB3, aVar8.e());
                y7.n(c0VarD, b1VarK5, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar8.f());
                n0 n0Var3 = n0.f16227a;
                function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                a0.a aVar9 = a0.E;
                l6.a(i6.i(aVar9, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0 a0VarH3 = i6.h(aVar9, 0.0f, 1, null);
                a1 a1VarE3 = u5.e(qVar3.s(), aVar7.w(), c0VarR, 6);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK6 = c0VarR.k();
                a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarH3);
                function0A2 = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE3, aVar8.e());
                y7.n(c0VarD2, b1VarK6, aVar8.g());
                function2B2 = aVar8.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN6, aVar8.f());
                y5 y5Var3 = y5.f16577a;
                a0 a0VarG3 = i6.g(aVar9, 0.5f);
                int i112 = i12 >> 3;
                int i113 = (i112 & 896) | (i112 & com.planner5d.library.engine.input.f.b.B) | 6;
                DatePicker(a0VarG3, answer2, onAnswer, c0VarR, i113);
                l6.a(i6.B(aVar9, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                TimePicker(i6.g(aVar9, 1.0f), answer2, onAnswer, c0VarR, i113);
                c0VarR.o();
                c0VarR.o();
                a0Var4 = a0Var7;
            }
            answer3 = answer2;
            function3 = function2M474getLambda1$intercom_sdk_base_release;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerQuestionKt.DatePickerQuestion$lambda$2(a0Var4, questionModel, answer3, onAnswer, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        answer2 = answer;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c0VarR.k0(onAnswer)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i11 & 16;
        if (i14 != 0) {
            if ((57344 & i10) == 0) {
                function2M474getLambda1$intercom_sdk_base_release = function2;
                if (c0VarR.k0(function2M474getLambda1$intercom_sdk_base_release)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46731 & i12) == 9346) {
                if (i16 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                }
                q qVar4 = q.f16330a;
                q.m mVarY4 = qVar4.y();
                androidx.compose.ui.e.a aVar10 = androidx.compose.ui.e.f37317a;
                a1 a1VarB4 = j0.b(mVarY4, aVar10.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK7 = c0VarR.k();
                a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                function0A = aVar11.a();
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
                a0 a0Var8 = a0Var3;
                y7.n(c0VarD, a1VarB4, aVar11.e());
                y7.n(c0VarD, b1VarK7, aVar11.g());
                function2B = aVar11.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar11.f());
                n0 n0Var4 = n0.f16227a;
                function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                a0.a aVar12 = a0.E;
                l6.a(i6.i(aVar12, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0 a0VarH4 = i6.h(aVar12, 0.0f, 1, null);
                a1 a1VarE4 = u5.e(qVar4.s(), aVar10.w(), c0VarR, 6);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK8 = c0VarR.k();
                a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarH4);
                function0A2 = aVar11.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE4, aVar11.e());
                y7.n(c0VarD2, b1VarK8, aVar11.g());
                function2B2 = aVar11.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN8, aVar11.f());
                y5 y5Var4 = y5.f16577a;
                a0 a0VarG4 = i6.g(aVar12, 0.5f);
                int i114 = i12 >> 3;
                int i115 = (i114 & 896) | (i114 & com.planner5d.library.engine.input.f.b.B) | 6;
                DatePicker(a0VarG4, answer2, onAnswer, c0VarR, i115);
                l6.a(i6.B(aVar12, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                TimePicker(i6.g(aVar12, 1.0f), answer2, onAnswer, c0VarR, i115);
                c0VarR.o();
                c0VarR.o();
                a0Var4 = a0Var8;
            } else {
                if (i16 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                }
                q qVar5 = q.f16330a;
                q.m mVarY5 = qVar5.y();
                androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                a1 a1VarB5 = j0.b(mVarY5, aVar13.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK9 = c0VarR.k();
                a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                a0 a0Var9 = a0Var3;
                y7.n(c0VarD, a1VarB5, aVar14.e());
                y7.n(c0VarD, b1VarK9, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN9, aVar14.f());
                n0 n0Var5 = n0.f16227a;
                function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                a0.a aVar15 = a0.E;
                l6.a(i6.i(aVar15, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0 a0VarH5 = i6.h(aVar15, 0.0f, 1, null);
                a1 a1VarE5 = u5.e(qVar5.s(), aVar13.w(), c0VarR, 6);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK10 = c0VarR.k();
                a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarH5);
                function0A2 = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE5, aVar14.e());
                y7.n(c0VarD2, b1VarK10, aVar14.g());
                function2B2 = aVar14.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN10, aVar14.f());
                y5 y5Var5 = y5.f16577a;
                a0 a0VarG5 = i6.g(aVar15, 0.5f);
                int i116 = i12 >> 3;
                int i117 = (i116 & 896) | (i116 & com.planner5d.library.engine.input.f.b.B) | 6;
                DatePicker(a0VarG5, answer2, onAnswer, c0VarR, i117);
                l6.a(i6.B(aVar15, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                TimePicker(i6.g(aVar15, 1.0f), answer2, onAnswer, c0VarR, i117);
                c0VarR.o();
                c0VarR.o();
                a0Var4 = a0Var9;
            }
            answer3 = answer2;
            function3 = function2M474getLambda1$intercom_sdk_base_release;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerQuestionKt.DatePickerQuestion$lambda$2(a0Var4, questionModel, answer3, onAnswer, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function2M474getLambda1$intercom_sdk_base_release = function2;
        if ((46731 & i12) == 9346) {
            if (i16 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i17 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i14 != 0) {
                function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
            }
            q qVar6 = q.f16330a;
            q.m mVarY6 = qVar6.y();
            androidx.compose.ui.e.a aVar16 = androidx.compose.ui.e.f37317a;
            a1 a1VarB6 = j0.b(mVarY6, aVar16.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK11 = c0VarR.k();
            a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
            function0A = aVar17.a();
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
            a0 a0Var10 = a0Var3;
            y7.n(c0VarD, a1VarB6, aVar17.e());
            y7.n(c0VarD, b1VarK11, aVar17.g());
            function2B = aVar17.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN11, aVar17.f());
            n0 n0Var6 = n0.f16227a;
            function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
            a0.a aVar18 = a0.E;
            l6.a(i6.i(aVar18, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            a0 a0VarH6 = i6.h(aVar18, 0.0f, 1, null);
            a1 a1VarE6 = u5.e(qVar6.s(), aVar16.w(), c0VarR, 6);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK12 = c0VarR.k();
            a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarH6);
            function0A2 = aVar17.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE6, aVar17.e());
            y7.n(c0VarD2, b1VarK12, aVar17.g());
            function2B2 = aVar17.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN12, aVar17.f());
            y5 y5Var6 = y5.f16577a;
            a0 a0VarG6 = i6.g(aVar18, 0.5f);
            int i118 = i12 >> 3;
            int i119 = (i118 & 896) | (i118 & com.planner5d.library.engine.input.f.b.B) | 6;
            DatePicker(a0VarG6, answer2, onAnswer, c0VarR, i119);
            l6.a(i6.B(aVar18, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
            TimePicker(i6.g(aVar18, 1.0f), answer2, onAnswer, c0VarR, i119);
            c0VarR.o();
            c0VarR.o();
            a0Var4 = a0Var10;
        } else {
            if (i16 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i17 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i14 != 0) {
                function2M474getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
            }
            q qVar7 = q.f16330a;
            q.m mVarY7 = qVar7.y();
            androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
            a1 a1VarB7 = j0.b(mVarY7, aVar19.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK13 = c0VarR.k();
            a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
            function0A = aVar110.a();
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
            a0 a0Var11 = a0Var3;
            y7.n(c0VarD, a1VarB7, aVar110.e());
            y7.n(c0VarD, b1VarK13, aVar110.g());
            function2B = aVar110.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN13, aVar110.f());
            n0 n0Var7 = n0.f16227a;
            function2M474getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
            a0.a aVar111 = a0.E;
            l6.a(i6.i(aVar111, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            a0 a0VarH7 = i6.h(aVar111, 0.0f, 1, null);
            a1 a1VarE7 = u5.e(qVar7.s(), aVar19.w(), c0VarR, 6);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK14 = c0VarR.k();
            a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarH7);
            function0A2 = aVar110.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE7, aVar110.e());
            y7.n(c0VarD2, b1VarK14, aVar110.g());
            function2B2 = aVar110.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN14, aVar110.f());
            y5 y5Var7 = y5.f16577a;
            a0 a0VarG7 = i6.g(aVar111, 0.5f);
            int i1110 = i12 >> 3;
            int i1111 = (i1110 & 896) | (i1110 & com.planner5d.library.engine.input.f.b.B) | 6;
            DatePicker(a0VarG7, answer2, onAnswer, c0VarR, i1111);
            l6.a(i6.B(aVar111, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
            TimePicker(i6.g(aVar111, 1.0f), answer2, onAnswer, c0VarR, i1111);
            c0VarR.o();
            c0VarR.o();
            a0Var4 = a0Var11;
        }
        answer3 = answer2;
        function3 = function2M474getLambda1$intercom_sdk_base_release;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerQuestionKt.DatePickerQuestion$lambda$2(a0Var4, questionModel, answer3, onAnswer, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerQuestion$lambda$2(a0 a0Var, SurveyData.Step.Question.DatePickerQuestionModel questionModel, Answer answer, Function1 onAnswer, Function2 function2, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(questionModel, "$questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        DatePickerQuestion(a0Var, questionModel, answer, onAnswer, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void DatePickerQuestionPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1652233850);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m480getLambda7$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerQuestionKt.DatePickerQuestionPreview$lambda$28(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerQuestionPreview$lambda$28(int i10, c0 c0Var, int i11) {
        DatePickerQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void TimePicker(final a0 a0Var, Answer answer, Function1<? super Answer, Unit> function1, c0 c0Var, final int i10) {
        int i11;
        String localTime;
        final Answer answer2;
        final n3 n3Var;
        final Function1<? super Answer, Unit> function2 = function1;
        c0 c0VarR = c0Var.R(1270472949);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.D(answer) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            answer2 = answer;
        } else {
            final androidx.compose.ui.focus.q qVar = (androidx.compose.ui.focus.q) c0VarR.W(q1.n());
            c0VarR.E(-1349242735);
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            final n3 n3Var2 = (n3) objI0;
            c0VarR.A();
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (StringsKt.w3(dateTimeAnswer.getLocalTime())) {
                    localTime = "HH:MM";
                } else {
                    localTime = dateTimeAnswer.getLocalTime();
                }
            } else {
                localTime = "HH:MM";
            }
            float fR = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            String str = localTime;
            a0 a0VarJ = i1.j(androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.i(a0Var, fR, q0.w(intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), intercomTheme.getShapes(c0VarR, i12).m()), intercomTheme.getShapes(c0VarR, i12).m()), intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DatePickerQuestionKt.TimePicker$lambda$17(qVar, n3Var2);
                }
            }, 15, null);
            a1 a1VarE = u5.e(q.f16330a.s(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            a0.a aVar3 = a0.E;
            float f10 = 16;
            q50.t(str, i6.H(d5.r(aVar3, androidx.compose.ui.unit.h.r(f10)), null, false, 3, null), q0.w(intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), contentAlpha(!Intrinsics.areEqual(str, "HH:MM"), c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i12).getType04(), c0VarR, 48, 0, 131064);
            c0VarR = c0VarR;
            ni.o(u0.e.c(R.drawable.intercom_ic_pick_time, c0VarR, 0), u0.i.d(R.string.intercom_choose_the_date, c0VarR, 0), d5.r(aVar3, androidx.compose.ui.unit.h.r(f10)), intercomTheme.getColors(c0VarR, i12).m684getAction0d7_KjU(), c0VarR, 392, 0);
            c0VarR.o();
            if (TimePicker$lambda$15(n3Var2)) {
                c0VarR.E(-1349194218);
                boolean z10 = (i11 & 896) == 256;
                Object objI1 = c0VarR.i0();
                if (z10 || objI1 == aVar.a()) {
                    function2 = function1;
                    n3Var = n3Var2;
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DatePickerQuestionKt.TimePicker$lambda$20$lambda$19(function2, n3Var, (Answer) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    function2 = function1;
                    n3Var = n3Var2;
                }
                Function1 function3 = (Function1) objI1;
                c0VarR.A();
                c0VarR.E(-1349190167);
                Object objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DatePickerQuestionKt.TimePicker$lambda$22$lambda$21(n3Var);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                int i13 = ((i11 >> 3) & 14) | a5.S0;
                answer2 = answer;
                ComposeTimePickerDialog(answer2, function3, (Function0) objI2, c0VarR, i13);
            } else {
                answer2 = answer;
                function2 = function1;
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerQuestionKt.TimePicker$lambda$23(a0Var, answer2, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean TimePicker$lambda$15(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void TimePicker$lambda$16(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$17(androidx.compose.ui.focus.q focusManager, n3 showTimePicker$delegate) {
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(showTimePicker$delegate, "$showTimePicker$delegate");
        androidx.compose.ui.focus.q.o(focusManager, false, 1, null);
        TimePicker$lambda$16(showTimePicker$delegate, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$20$lambda$19(Function1 onAnswer, n3 showTimePicker$delegate, Answer newAnswer) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(showTimePicker$delegate, "$showTimePicker$delegate");
        Intrinsics.checkNotNullParameter(newAnswer, "newAnswer");
        onAnswer.invoke(newAnswer);
        TimePicker$lambda$16(showTimePicker$delegate, false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$22$lambda$21(n3 showTimePicker$delegate) {
        Intrinsics.checkNotNullParameter(showTimePicker$delegate, "$showTimePicker$delegate");
        TimePicker$lambda$16(showTimePicker$delegate, false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$23(a0 modifier, Answer answer, Function1 onAnswer, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        TimePicker(modifier, answer, onAnswer, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final float contentAlpha(boolean z10, @Nullable c0 c0Var, int i10) {
        c0Var.E(2064501839);
        float f10 = z10 ? 1.0f : 0.6f;
        c0Var.A();
        return f10;
    }

    private static final List<String> getLocalTime(Answer answer) {
        return answer instanceof Answer.DateTimeAnswer ? StringsKt.split$default(((Answer.DateTimeAnswer) answer).getLocalTime(), new String[]{":"}, false, 0, 6, null) : CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getUtcTime(int i10, int i11) {
        String toUtcTime = TimeFormatter.formatToUtcTime(i10, i11);
        Intrinsics.checkNotNullExpressionValue(toUtcTime, "formatToUtcTime(...)");
        return StringsKt.split$default(toUtcTime, new String[]{":"}, false, 0, 6, null);
    }
}
