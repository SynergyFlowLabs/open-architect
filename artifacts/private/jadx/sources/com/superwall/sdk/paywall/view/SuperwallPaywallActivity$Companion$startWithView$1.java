package com.superwall.sdk.paywall.view;

import android.content.Context;
import android.content.Intent;
import com.superwall.sdk.misc.Color_HelpersKt;
import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.SuperwallPaywallActivity$Companion$startWithView$1", f = "SuperwallPaywallActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SuperwallPaywallActivity$Companion$startWithView$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $key;
    final /* synthetic */ PaywallPresentationStyle $presentationStyleOverride;
    final /* synthetic */ PaywallView $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuperwallPaywallActivity$Companion$startWithView$1(PaywallView paywallView, String str, Context context, PaywallPresentationStyle paywallPresentationStyle, kotlin.coroutines.d<? super SuperwallPaywallActivity$Companion$startWithView$1> dVar) {
        super(2, dVar);
        this.$view = paywallView;
        this.$key = str;
        this.$context = context;
        this.$presentationStyleOverride = paywallPresentationStyle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SuperwallPaywallActivity$Companion$startWithView$1(this.$view, this.$key, this.$context, this.$presentationStyleOverride, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        SuperwallPaywallActivity.Companion.prepareViewForDisplay(this.$view, this.$key);
        Intent intent = new Intent(this.$context, (Class<?>) SuperwallPaywallActivity.class);
        String str = this.$key;
        PaywallPresentationStyle paywallPresentationStyle = this.$presentationStyleOverride;
        PaywallView paywallView = this.$view;
        intent.putExtra("viewKey", str);
        intent.putExtra("presentationStyleKey", paywallPresentationStyle);
        intent.putExtra("isLightBackgroundKey", Color_HelpersKt.isLightColor(paywallView.getPaywall().getBackgroundColor()));
        intent.setFlags(536870912);
        this.$context.startActivity(intent);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SuperwallPaywallActivity$Companion$startWithView$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
