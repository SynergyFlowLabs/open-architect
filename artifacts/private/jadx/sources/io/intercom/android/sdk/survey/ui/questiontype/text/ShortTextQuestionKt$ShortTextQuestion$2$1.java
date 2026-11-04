package io.intercom.android.sdk.survey.ui.questiontype.text;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$2$1", f = "ShortTextQuestion.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
final class ShortTextQuestionKt$ShortTextQuestion$2$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ androidx.compose.foundation.relocation.a $bringIntoViewRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTextQuestionKt$ShortTextQuestion$2$1(androidx.compose.foundation.relocation.a aVar, kotlin.coroutines.d<? super ShortTextQuestionKt$ShortTextQuestion$2$1> dVar) {
        super(2, dVar);
        this.$bringIntoViewRequester = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ShortTextQuestionKt$ShortTextQuestion$2$1(this.$bringIntoViewRequester, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.relocation.a aVar = this.$bringIntoViewRequester;
            this.label = 1;
            if (androidx.compose.foundation.relocation.a.b(aVar, null, this, 1, null) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ShortTextQuestionKt$ShortTextQuestion$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
