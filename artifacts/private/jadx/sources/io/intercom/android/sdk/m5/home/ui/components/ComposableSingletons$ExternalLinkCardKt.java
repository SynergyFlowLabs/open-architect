package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.c0;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ExternalLinkCardKt {

    @NotNull
    public static final ComposableSingletons$ExternalLinkCardKt INSTANCE = new ComposableSingletons$ExternalLinkCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f205lambda1 = androidx.compose.runtime.internal.w.c(19664413, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$ExternalLinkCardKt$lambda-1$1
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
            } else {
                ExternalLinkCardKt.ExternalLinkCard(new HomeCards.HomeExternalLinkData("External Links", HomeCardType.EXTERNAL_LINKS, CollectionsKt.listOf((Object[]) new Link[]{new Link("Ask the community", "https://stackoverflow.com/"), new Link("Knowledge base", "https://stackoverflow.com/")})), c0Var, 8);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m368getLambda1$intercom_sdk_base_release() {
        return f205lambda1;
    }
}
