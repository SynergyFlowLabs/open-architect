package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$HelpCenterSearchTopBarKt {

    @NotNull
    public static final ComposableSingletons$HelpCenterSearchTopBarKt INSTANCE = new ComposableSingletons$HelpCenterSearchTopBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f6lambda1 = w.c(-456122237, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            String strD = u0.i.d(R.string.intercom_search_for_help, c0Var, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            q50.t(strD, null, intercomTheme.getColors(c0Var, i11).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04(), c0Var, 0, 0, 131066);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f7lambda2 = w.c(202432040, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, c0Var, 0), u0.i.d(R.string.intercom_clear, c0Var, 0), null, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m713getPrimaryIcon0d7_KjU(), c0Var, 8, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f8lambda3 = w.c(-420729176, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_back, c0Var, 0), u0.i.d(R.string.intercom_navigation_back, c0Var, 0), null, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m713getPrimaryIcon0d7_KjU(), c0Var, 8, 4);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m97getLambda1$intercom_sdk_base_release() {
        return f6lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m98getLambda2$intercom_sdk_base_release() {
        return f7lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m99getLambda3$intercom_sdk_base_release() {
        return f8lambda3;
    }
}
