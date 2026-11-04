package io.intercom.android.sdk.m5.helpcenter.ui.components;

import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$CollectionRowComponentKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$CollectionRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$CollectionRowComponentKt$lambda1$1();

    ComposableSingletons$CollectionRowComponentKt$lambda1$1() {
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
        int i11 = 1 | 4;
        CollectionRowComponentKt.CollectionRowComponent(new CollectionRowData("", "Lorem Ipsum Dolor Sit", 0, "Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit", 3, 2), new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$CollectionRowComponentKt$lambda1$1.invoke$lambda$0((String) obj);
            }
        }, null, c0Var, 48, 4);
    }
}
