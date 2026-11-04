package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.runtime.c0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$HomeHeaderKt$lambda3$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$HomeHeaderKt$lambda3$1 INSTANCE = new ComposableSingletons$HomeHeaderKt$lambda3$1();

    ComposableSingletons$HomeHeaderKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        HomeHeaderKt.HomeErrorHeader(null, new HomeUiState.Error.ErrorHeader("#FFFFFF", "#000000"), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, a5.S0, 1);
    }
}
