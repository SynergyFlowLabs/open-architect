package io.intercom.android.sdk.m5;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.f;
import androidx.activity.r0;
import androidx.activity.u;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class IntercomRootActivity extends IntercomBaseComponentActivity {
    public static final int $stable = 0;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        r0 r0VarD;
        super.onCreate(bundle);
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i10 == 1) {
            r0VarD = r0.f9989e.d(0);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new k0();
                }
                if ((getResources().getConfiguration().uiMode & 48) == 32) {
                    r0VarD = r0.f9989e.d(0);
                }
            }
            r0VarD = r0.f9989e.e(0, 0);
        }
        u.c(this, r0VarD, r0VarD);
        f.b(this, null, w.c(1535831366, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i11) {
                if ((i11 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                final IntercomRootActivity intercomRootActivity = IntercomRootActivity.this;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, w.e(-1535408283, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @o
                    @t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(c0 c0Var2, int i12) {
                        if ((i12 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        Intent intent = intercomRootActivity.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomRootActivity, c0Var2, 8);
                    }
                }, c0Var, 54), c0Var, 56);
            }
        }), 1, null);
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Injector.get().getDataLayer().clearOpenResponse();
    }
}
