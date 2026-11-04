package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$GifGridKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$GifGridKt$lambda2$1 INSTANCE = new ComposableSingletons$GifGridKt$lambda2$1();

    ComposableSingletons$GifGridKt$lambda2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Block it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(String it) {
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
        } else {
            int i11 = 2 | 0;
            GifGridKt.GifGrid(null, CollectionsKt.emptyList(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$GifGridKt$lambda2$1.invoke$lambda$0((Block) obj);
                }
            }, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$GifGridKt$lambda2$1.invoke$lambda$1((String) obj);
                }
            }, c0Var, 3504, 1);
        }
    }
}
