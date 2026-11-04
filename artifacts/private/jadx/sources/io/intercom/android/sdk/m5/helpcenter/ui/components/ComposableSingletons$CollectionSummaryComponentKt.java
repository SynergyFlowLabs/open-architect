package io.intercom.android.sdk.m5.helpcenter.ui.components;

import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.helpcenter.sections.Avatar;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$CollectionSummaryComponentKt {

    @NotNull
    public static final ComposableSingletons$CollectionSummaryComponentKt INSTANCE = new ComposableSingletons$CollectionSummaryComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f196lambda1 = androidx.compose.runtime.internal.w.c(309452486, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionSummaryComponentKt$lambda-1$1
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
                CollectionSummaryComponentKt.CollectionSummaryComponent(new CollectionDetailsUiState.Content("123456", "Recording videos", "How to set up screen and camera recording through our app or Chrome extension.", 5, CollectionsKt.listOf((Object[]) new Author[]{new Author("", "Hannah", new Avatar("", "SK")), new Author("", "Bob", new Avatar("", "PS")), new Author("", "Anna", new Avatar("", "VR"))}), CollectionsKt.emptyList()), null, c0Var, 8, 2);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m350getLambda1$intercom_sdk_base_release() {
        return f196lambda1;
    }
}
