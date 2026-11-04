package io.intercom.android.sdk.m5.home;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$homeResponse$1", f = "HomeViewModel.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
final class HomeViewModel$fetchHomeData$1$homeResponse$1 extends o implements Function2<s0, d<? super NetworkResponse<? extends HomeV2Response>>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$fetchHomeData$1$homeResponse$1(HomeViewModel homeViewModel, d<? super HomeViewModel$fetchHomeData$1$homeResponse$1> dVar) {
        super(2, dVar);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HomeViewModel$fetchHomeData$1$homeResponse$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super NetworkResponse<? extends HomeV2Response>> dVar) {
        return invoke2(s0Var, (d<? super NetworkResponse<HomeV2Response>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        HomeRepository homeRepository = this.this$0.homeRepository;
        this.label = 1;
        Object homeCards = homeRepository.getHomeCards(this);
        return homeCards == objL ? objL : homeCards;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, d<? super NetworkResponse<HomeV2Response>> dVar) {
        return ((HomeViewModel$fetchHomeData$1$homeResponse$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
