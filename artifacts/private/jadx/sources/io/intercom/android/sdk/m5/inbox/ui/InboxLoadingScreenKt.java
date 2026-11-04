package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxLoadingScreenKt {
    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeLoadingContentPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1591477138);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            InboxLoadingScreen(c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxLoadingScreenKt.HomeLoadingContentPreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLoadingContentPreview$lambda$1(int i10, c0 c0Var, int i11) {
        HomeLoadingContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InboxLoadingScreen(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1280547936);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            LoadingScreenKt.LoadingScreen(null, R.drawable.intercom_inbox_loading_state, c0VarR, 0, 1);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxLoadingScreenKt.InboxLoadingScreen$lambda$0(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxLoadingScreen$lambda$0(int i10, c0 c0Var, int i11) {
        InboxLoadingScreen(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
