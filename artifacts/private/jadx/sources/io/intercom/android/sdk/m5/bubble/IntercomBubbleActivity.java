package io.intercom.android.sdk.m5.bubble;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.f;
import androidx.activity.l;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class IntercomBubbleActivity extends l {
    public static final int $stable = 0;

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        f.b(this, null, w.c(947575690, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                } else {
                    final IntercomBubbleActivity intercomBubbleActivity = IntercomBubbleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, w.e(-397450188, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @o
                        @t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(c0 c0Var2, int i11) {
                            int i12 = 7 | 2;
                            if ((i11 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            Intent intent = intercomBubbleActivity.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                            IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomBubbleActivity, c0Var2, 8);
                        }
                    }, c0Var, 54), c0Var, 3072, 7);
                }
            }
        }), 1, null);
    }
}
