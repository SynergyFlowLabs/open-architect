package io.intercom.android.sdk.m5.home;

import androidx.media3.extractor.metadata.dvbsi.b;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$openMessengerResponseData$1", f = "HomeViewModel.kt", i = {}, l = {b.f67479d}, m = "invokeSuspend", n = {}, s = {})
final class HomeViewModel$fetchHomeData$1$openMessengerResponseData$1 extends o implements Function2<s0, d<? super OpenMessengerResponse>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(HomeViewModel homeViewModel, d<? super HomeViewModel$fetchHomeData$1$openMessengerResponseData$1> dVar) {
        super(2, dVar);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        CommonRepository commonRepository = this.this$0.commonRepository;
        this.label = 1;
        Object objOpenMessenger = commonRepository.openMessenger(this);
        return objOpenMessenger == objL ? objL : objOpenMessenger;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super OpenMessengerResponse> dVar) {
        return ((HomeViewModel$fetchHomeData$1$openMessengerResponseData$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
