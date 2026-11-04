package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.material3.l10;
import androidx.compose.material3.u00;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ConversationScreenKt {

    @NotNull
    public static final ComposableSingletons$ConversationScreenKt INSTANCE = new ComposableSingletons$ConversationScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> f84lambda1 = androidx.compose.runtime.internal.w.c(-394269711, false, new pj.n<u00, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationScreenKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(u00 u00Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(u00Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(u00 it, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (c0Var.D(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            l10.j(it, null, false, intercomTheme.getShapes(c0Var, i12).m(), 0L, 0L, ColorExtensionsKt.m731getAccessibleColorOnDarkBackground8_81llA(intercomTheme.getColors(c0Var, i12).m684getAction0d7_KjU()), 0L, 0L, c0Var, i11 & 14, 438);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> m197getLambda1$intercom_sdk_base_release() {
        return f84lambda1;
    }
}
