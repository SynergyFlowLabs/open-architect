package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class HelpCenterLoadingScreen extends androidx.compose.ui.platform.a {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public HelpCenterLoadingScreen(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z10 = false & false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(HelpCenterLoadingScreen tmp0_rcvr, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(tmp0_rcvr, "$tmp0_rcvr");
        tmp0_rcvr.Content(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1926895347);
        if ((i10 & 1) == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            boolean z10 = true | false;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m336getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterLoadingScreen.Content$lambda$0(this.f292801a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public HelpCenterLoadingScreen(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 0 >> 0;
    }

    public /* synthetic */ HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public HelpCenterLoadingScreen(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
