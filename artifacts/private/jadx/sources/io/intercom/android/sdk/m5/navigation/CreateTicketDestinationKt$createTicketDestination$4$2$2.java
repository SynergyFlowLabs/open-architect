package io.intercom.android.sdk.m5.navigation;

import androidx.compose.foundation.layout.u7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCreateTicketDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketDestination.kt\nio/intercom/android/sdk/m5/navigation/CreateTicketDestinationKt$createTicketDestination$4$2$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,174:1\n70#2:175\n67#2,9:176\n77#2:215\n80#3,6:185\n87#3,3:200\n90#3,2:209\n94#3:214\n391#4,9:191\n400#4,3:211\n4360#5,6:203\n*S KotlinDebug\n*F\n+ 1 CreateTicketDestination.kt\nio/intercom/android/sdk/m5/navigation/CreateTicketDestinationKt$createTicketDestination$4$2$2\n*L\n130#1:175\n130#1:176,9\n130#1:215\n130#1:185,6\n130#1:200,3\n130#1:209,2\n130#1:214\n130#1:191,9\n130#1:211,3\n130#1:203,6\n*E\n"})
final class CreateTicketDestinationKt$createTicketDestination$4$2$2 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ n3<AnswerClickData> $answerClickedData;
    final /* synthetic */ AnswerClickData $data;
    final /* synthetic */ kotlinx.coroutines.s0 $scope;
    final /* synthetic */ CreateTicketViewModel $viewModel;

    CreateTicketDestinationKt$createTicketDestination$4$2$2(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, kotlinx.coroutines.s0 s0Var, n3<AnswerClickData> n3Var) {
        this.$data = answerClickData;
        this.$viewModel = createTicketViewModel;
        this.$scope = s0Var;
        this.$answerClickedData = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$0(CreateTicketViewModel viewModel, AnswerClickData data, kotlinx.coroutines.s0 scope, n3 answerClickedData) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        viewModel.onRetryFileClicked(data);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1(CreateTicketViewModel viewModel, AnswerClickData data, kotlinx.coroutines.s0 scope, n3 answerClickedData) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        viewModel.onDeleteFileClicked(data);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$2(CreateTicketViewModel viewModel, AnswerClickData data, kotlinx.coroutines.s0 scope, n3 answerClickedData) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        viewModel.onDeleteFileClicked(data);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(kotlinx.coroutines.s0 scope, n3 answerClickedData) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(m0Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.foundation.layout.m0 ModalBottomSheet, androidx.compose.runtime.c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i10 & 81) == 16 && c0Var.d()) {
            c0Var.u();
            return;
        }
        androidx.compose.ui.a0 a0VarE = u7.e(androidx.compose.ui.a0.E);
        final AnswerClickData answerClickData = this.$data;
        final CreateTicketViewModel createTicketViewModel = this.$viewModel;
        final kotlinx.coroutines.s0 s0Var = this.$scope;
        final n3<AnswerClickData> n3Var = this.$answerClickedData;
        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarE);
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
        y7.n(c0VarD, a1VarK, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        FileActionSheetKt.FileActionSheet(answerClickData.getClickedItem(), new Function0() { // from class: io.intercom.android.sdk.m5.navigation.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$0(createTicketViewModel, answerClickData, s0Var, n3Var);
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$1(createTicketViewModel, answerClickData, s0Var, n3Var);
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$2(createTicketViewModel, answerClickData, s0Var, n3Var);
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$3(s0Var, n3Var);
            }
        }, c0Var, 0);
        c0Var.o();
    }
}
