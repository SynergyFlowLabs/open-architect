package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$ReactionsComponentKt$lambda1$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$ReactionsComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ReactionsComponentKt$lambda1$1();

    ComposableSingletons$ReactionsComponentKt$lambda1$1() {
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
        ReactionsComponentKt.ReactionsComponent(null, ArticleViewState.ReactionState.Companion.getDefaultReactionState(), new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 28080, 1);
    }
}
