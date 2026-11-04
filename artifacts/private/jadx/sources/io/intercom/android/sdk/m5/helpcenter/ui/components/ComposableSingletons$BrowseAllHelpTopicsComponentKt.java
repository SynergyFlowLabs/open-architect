package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$BrowseAllHelpTopicsComponentKt {

    @NotNull
    public static final ComposableSingletons$BrowseAllHelpTopicsComponentKt INSTANCE = new ComposableSingletons$BrowseAllHelpTopicsComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f189lambda1 = androidx.compose.runtime.internal.w.c(1224833391, false, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(x5 OutlinedButton, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            ni.o(u0.e.c(R.drawable.intercom_article_book_icon, c0Var, 0), null, null, 0L, c0Var, 56, 12);
            l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0Var, 6);
            String strD = u0.i.d(R.string.intercom_browse_all_help_topics, c0Var, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            q50.t(strD, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0Var, i11).getType04Point5(), intercomTheme.getColors(c0Var, i11).m714getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var, 0, 0, 131070);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f190lambda2 = androidx.compose.runtime.internal.w.c(-1938885306, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(null, c0Var, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f191lambda3 = androidx.compose.runtime.internal.w.c(612498774, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, c0Var, 0, 1);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m343getLambda1$intercom_sdk_base_release() {
        return f189lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m344getLambda2$intercom_sdk_base_release() {
        return f190lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m345getLambda3$intercom_sdk_base_release() {
        return f191lambda3;
    }
}
