package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.runtime.c0;
import androidx.compose.ui.graphics.s0;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeHeaderBackdrop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeHeaderBackdrop.kt\nio/intercom/android/sdk/m5/home/ui/header/ComposableSingletons$HomeHeaderBackdropKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,242:1\n113#2:243\n*S KotlinDebug\n*F\n+ 1 HomeHeaderBackdrop.kt\nio/intercom/android/sdk/m5/home/ui/header/ComposableSingletons$HomeHeaderBackdropKt$lambda-1$1\n*L\n103#1:243\n*E\n"})
final class ComposableSingletons$HomeHeaderBackdropKt$lambda1$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda1$1();

    ComposableSingletons$HomeHeaderBackdropKt$lambda1$1() {
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
        HomeHeaderBackdropKt.m389HomeHeaderBackdropAjpBEmI(androidx.compose.ui.unit.h.r(200), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(s0.b(ColorUtils.parseColor("#326D7D")), false, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(s0.b(ColorUtils.parseColor("#8B0000")), false, null), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 3078, 0);
    }
}
