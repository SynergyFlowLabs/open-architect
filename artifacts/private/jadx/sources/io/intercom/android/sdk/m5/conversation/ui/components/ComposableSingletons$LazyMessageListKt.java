package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.u10;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$LazyMessageListKt {

    @NotNull
    public static final ComposableSingletons$LazyMessageListKt INSTANCE = new ComposableSingletons$LazyMessageListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit> f93lambda1 = androidx.compose.runtime.internal.w.c(1002694257, false, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.foundation.layout.x.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), c0Var, 6);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f94lambda2 = androidx.compose.runtime.internal.w.c(829029502, false, ComposableSingletons$LazyMessageListKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f95lambda3 = androidx.compose.runtime.internal.w.c(1588713059, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-3$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m207getLambda2$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit> m206getLambda1$intercom_sdk_base_release() {
        return f93lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m207getLambda2$intercom_sdk_base_release() {
        return f94lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m208getLambda3$intercom_sdk_base_release() {
        return f95lambda3;
    }
}
