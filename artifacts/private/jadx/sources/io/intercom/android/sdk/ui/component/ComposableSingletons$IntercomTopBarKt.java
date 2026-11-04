package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.ni;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$IntercomTopBarKt {

    @NotNull
    public static final ComposableSingletons$IntercomTopBarKt INSTANCE = new ComposableSingletons$IntercomTopBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f334lambda1 = androidx.compose.runtime.internal.w.c(1581505149, false, ComposableSingletons$IntercomTopBarKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f335lambda2 = androidx.compose.runtime.internal.w.c(697934641, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-2$1
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
                IntercomTopBarKt.m608IntercomTopBarbogVsAg(null, "TopBar Title", null, null, 0L, 0L, null, null, c0Var, 48, com.planner5d.library.engine.input.f.b.W1);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f336lambda3 = androidx.compose.runtime.internal.w.c(323337919, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-3$1
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
                ni.o(u0.e.c(R.drawable.intercom_ic_download, c0Var, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var, 6).m711getOnHeader0d7_KjU(), c0Var, 440, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f337lambda4 = androidx.compose.runtime.internal.w.c(-2021873251, false, ComposableSingletons$IntercomTopBarKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f338lambda5 = androidx.compose.runtime.internal.w.c(-1858201762, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-5$1
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
                IntercomTopBarKt.m608IntercomTopBarbogVsAg(null, "TopBar Title", null, null, 0L, 0L, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m579getLambda4$intercom_sdk_ui_release(), c0Var, 12582960, 125);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m576getLambda1$intercom_sdk_ui_release() {
        return f334lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m577getLambda2$intercom_sdk_ui_release() {
        return f335lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m578getLambda3$intercom_sdk_ui_release() {
        return f336lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_ui_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m579getLambda4$intercom_sdk_ui_release() {
        return f337lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m580getLambda5$intercom_sdk_ui_release() {
        return f338lambda5;
    }
}
