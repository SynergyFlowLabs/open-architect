package io.intercom.android.sdk.m5.helpcenter.ui.components;

import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleResultRowComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ArticleResultRowComponentKt$lambda1$1();

    ComposableSingletons$ArticleResultRowComponentKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

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
        int i11 = 3 ^ 2;
        int i12 = (4 ^ 0) >> 0;
        ArticleResultRowComponentKt.ArticleResultRowComponent(new ArticleSearchResultRow.ArticleResultRow("", "<highlight>Lorem Ipsum</highlight> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "There are many variations of passages of <highlight>Lorem Ipsum</highlight> available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.", 0), new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$ArticleResultRowComponentKt$lambda1$1.invoke$lambda$0((String) obj);
            }
        }, androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), c0Var, 48, 0);
    }
}
