package io.intercom.android.sdk.m5.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.g0;

/* JADX INFO: loaded from: classes13.dex */
/* synthetic */ class HomeViewModel$uiState$1$1 extends g0 implements Function0<Unit> {
    HomeViewModel$uiState$1$1(Object obj) {
        super(0, obj, HomeViewModel.class, "onRetryClicked", "onRetryClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HomeViewModel) this.receiver).onRetryClicked();
    }
}
