package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.n3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1", f = "TicketDetailContent.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTicketDetailContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketDetailContent.kt\nio/intercom/android/sdk/tickets/TicketDetailContentKt$TicketDetailContent$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,372:1\n113#2:373\n*S KotlinDebug\n*F\n+ 1 TicketDetailContent.kt\nio/intercom/android/sdk/tickets/TicketDetailContentKt$TicketDetailContent$2$1\n*L\n79#1:373\n*E\n"})
final class TicketDetailContentKt$TicketDetailContent$2$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<CardState> $cardState$delegate;
    final /* synthetic */ n3<Float> $submissionCardAlpha$delegate;
    final /* synthetic */ n3<androidx.compose.ui.unit.h> $submissionCardOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TicketDetailContentKt$TicketDetailContent$2$1(n3<androidx.compose.ui.unit.h> n3Var, n3<Float> n3Var2, n3<CardState> n3Var3, kotlin.coroutines.d<? super TicketDetailContentKt$TicketDetailContent$2$1> dVar) {
        super(2, dVar);
        this.$submissionCardOffset$delegate = n3Var;
        this.$submissionCardAlpha$delegate = n3Var2;
        this.$cardState$delegate = n3Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new TicketDetailContentKt$TicketDetailContent$2$1(this.$submissionCardOffset$delegate, this.$submissionCardAlpha$delegate, this.$cardState$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            TicketDetailContentKt.TicketDetailContent$lambda$7(this.$submissionCardOffset$delegate, androidx.compose.ui.unit.h.r(0));
            TicketDetailContentKt.TicketDetailContent$lambda$10(this.$submissionCardAlpha$delegate, 1.0f);
            this.label = 1;
            if (d1.b(5000L, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.$cardState$delegate.setValue(CardState.TimelineCard);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((TicketDetailContentKt$TicketDetailContent$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
