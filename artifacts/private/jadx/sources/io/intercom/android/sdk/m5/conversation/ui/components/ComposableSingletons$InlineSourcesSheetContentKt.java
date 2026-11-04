package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.u10;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$InlineSourcesSheetContentKt {

    @NotNull
    public static final ComposableSingletons$InlineSourcesSheetContentKt INSTANCE = new ComposableSingletons$InlineSourcesSheetContentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f91lambda1 = androidx.compose.runtime.internal.w.c(-402572306, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$InlineSourcesSheetContentKt$lambda-1$1
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
                InlineSourcesSheetContentKt.InlineSourcesSheetContent(CollectionsKt.listOf(new InlineSource("", "article", "1", "http://www.developer.intercom.com", "Your pay as you go bill explained")), CollectionsKt.listOf((Object[]) new Source[]{new Source("1", "article", "Your pay as you go bill explained", "http://www.developer.intercom.com"), new Source("2", "external", "External article", "http://www.google.com/lol")}), null, c0Var, 0, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f92lambda2 = androidx.compose.runtime.internal.w.c(-1732890285, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$InlineSourcesSheetContentKt$lambda-2$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m204getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m204getLambda1$intercom_sdk_base_release() {
        return f91lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m205getLambda2$intercom_sdk_base_release() {
        return f92lambda2;
    }
}
