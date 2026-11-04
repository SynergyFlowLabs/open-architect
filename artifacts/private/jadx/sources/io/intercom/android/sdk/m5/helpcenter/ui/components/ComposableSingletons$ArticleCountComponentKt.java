package io.intercom.android.sdk.m5.helpcenter.ui.components;

import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ArticleCountComponentKt {

    @NotNull
    public static final ComposableSingletons$ArticleCountComponentKt INSTANCE = new ComposableSingletons$ArticleCountComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f184lambda1 = androidx.compose.runtime.internal.w.c(-464668656, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleCountComponentKt$lambda-1$1
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
            ArticleCountComponentKt.ArticleCountComponent(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), 12, c0Var, 48, 0);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f185lambda2 = androidx.compose.runtime.internal.w.c(-481008008, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleCountComponentKt$lambda-2$1
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
            ArticleCountComponentKt.ArticleCountComponent(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), 1, c0Var, 48, 0);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m338getLambda1$intercom_sdk_base_release() {
        return f184lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m339getLambda2$intercom_sdk_base_release() {
        return f185lambda2;
    }
}
