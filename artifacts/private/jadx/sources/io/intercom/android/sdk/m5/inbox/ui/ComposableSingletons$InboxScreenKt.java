package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.material3.ni;
import androidx.compose.runtime.c0;
import io.intercom.android.sdk.ui.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$InboxScreenKt {

    @NotNull
    public static final ComposableSingletons$InboxScreenKt INSTANCE = new ComposableSingletons$InboxScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f235lambda1 = androidx.compose.runtime.internal.w.c(-455897824, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-1$1
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
                ni.o(u0.e.c(R.drawable.intercom_ic_edit, c0Var, 0), null, null, 0L, c0Var, 56, 12);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit> f236lambda2 = androidx.compose.runtime.internal.w.c(877667555, false, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-2$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
            invoke(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
            } else {
                InboxScreenKt.InboxLoadingRow(c0Var, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit> f237lambda3 = androidx.compose.runtime.internal.w.c(64179351, false, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-3$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
            invoke(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
            } else {
                InboxLoadingScreenKt.InboxLoadingScreen(c0Var, 0);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m400getLambda1$intercom_sdk_base_release() {
        return f235lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit> m401getLambda2$intercom_sdk_base_release() {
        return f236lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit> m402getLambda3$intercom_sdk_base_release() {
        return f237lambda3;
    }
}
