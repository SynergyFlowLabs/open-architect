package io.intercom.android.sdk.m5.navigation;

import androidx.compose.runtime.n3;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1", f = "CreateTicketDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<AnswerClickData> $answerClickedData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(n3<AnswerClickData> n3Var, kotlin.coroutines.d<? super CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1> dVar) {
        super(2, dVar);
        this.$answerClickedData = n3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(this.$answerClickedData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.$answerClickedData.setValue(null);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
