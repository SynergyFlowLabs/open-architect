package com.superwall.sdk.paywall.view.survey;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.survey.SurveyManager$presentSurveyIfAvailable$2$7", f = "SurveyManager.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
final class SurveyManager$presentSurveyIfAvailable$2$7 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;

    SurveyManager$presentSurveyIfAvailable$2$7(kotlin.coroutines.d<? super SurveyManager$presentSurveyIfAvailable$2$7> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SurveyManager$presentSurveyIfAvailable$2$7(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            InternalSuperwallEvent.SurveyClose surveyClose = new InternalSuperwallEvent.SurveyClose(null, 1, null);
            Superwall companion = Superwall.Companion.getInstance();
            this.label = 1;
            if (TrackingKt.track(companion, surveyClose, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((Result) obj).j();
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SurveyManager$presentSurveyIfAvailable$2$7) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
