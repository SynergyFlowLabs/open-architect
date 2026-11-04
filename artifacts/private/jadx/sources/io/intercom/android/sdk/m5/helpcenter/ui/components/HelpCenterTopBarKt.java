package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.ei;
import androidx.compose.material3.ni;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class HelpCenterTopBarKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterTopBar(@NotNull final Function0<Unit> onBackClick, @NotNull final Function0<Unit> onSearchClick, int i10, @Nullable StringProvider stringProvider, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        int i14;
        StringProvider stringRes;
        androidx.compose.runtime.c0 c0Var2;
        final int i15;
        final StringProvider stringProvider2;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onSearchClick, "onSearchClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(644687815);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c0VarR.k0(onBackClick) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.k0(onSearchClick) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                i14 = i10;
                int i16 = c0VarR.K(i14) ? 256 : 128;
                i13 |= i16;
            } else {
                i14 = i10;
            }
            i13 |= i16;
        } else {
            i14 = i10;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                stringRes = stringProvider;
                int i17 = c0VarR.D(stringRes) ? 2048 : 1024;
                i13 |= i17;
            } else {
                stringRes = stringProvider;
            }
            i13 |= i17;
        } else {
            stringRes = stringProvider;
        }
        if ((i13 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
            i15 = i14;
            stringProvider2 = stringRes;
        } else {
            c0VarR.l0();
            if ((i11 & 1) == 0 || c0VarR.y()) {
                if ((i12 & 4) != 0) {
                    i14 = R.drawable.intercom_ic_back;
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    stringRes = new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_get_help, null, 2, null);
                    i13 &= -7169;
                }
            } else {
                c0VarR.u();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
            }
            int i18 = i13;
            int i19 = i14;
            StringProvider stringProvider3 = stringRes;
            c0VarR.Z();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i20 = IntercomTheme.$stable;
            long jM704getHeader0d7_KjU = intercomTheme.getColors(c0VarR, i20).m704getHeader0d7_KjU();
            final long jM711getOnHeader0d7_KjU = intercomTheme.getColors(c0VarR, i20).m711getOnHeader0d7_KjU();
            c0Var2 = c0VarR;
            TopActionBarKt.m172TopActionBarNpQZenA(null, stringProvider3.getText(c0VarR, StringProvider.$stable | ((i18 >> 9) & 14)), null, null, null, onBackClick, Integer.valueOf(i19), false, jM704getHeader0d7_KjU, jM711getOnHeader0d7_KjU, 0L, null, androidx.compose.runtime.internal.w.e(736282477, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(x5Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 TopActionBar, androidx.compose.runtime.c0 c0Var3, int i21) {
                    Intrinsics.checkNotNullParameter(TopActionBar, "$this$TopActionBar");
                    if ((i21 & 81) == 16 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Function0<Unit> function0 = onSearchClick;
                    final long j10 = jM711getOnHeader0d7_KjU;
                    ei.D(function0, null, false, null, null, null, androidx.compose.runtime.internal.w.e(1957925771, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i22) {
                            if ((i22 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                int i23 = 7 | 0;
                                ni.o(u0.e.c(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, c0Var4, 0), u0.i.d(io.intercom.android.sdk.R.string.intercom_search_help_articles, c0Var4, 0), null, j10, c0Var4, 8, 4);
                            }
                        }
                    }, c0Var3, 54), c0Var3, 1572864, 62);
                }
            }, c0VarR, 54), c0Var2, ((i18 << 15) & 458752) | ((i18 << 12) & 3670016), a5.S0, 3229);
            i15 = i19;
            stringProvider2 = stringProvider3;
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterTopBarKt.HelpCenterTopBar$lambda$0(onBackClick, onSearchClick, i15, stringProvider2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterTopBar$lambda$0(Function0 onBackClick, Function0 onSearchClick, int i10, StringProvider stringProvider, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onSearchClick, "$onSearchClick");
        HelpCenterTopBar(onBackClick, onSearchClick, i10, stringProvider, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterTopBarPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-536592516);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterTopBarKt.INSTANCE.m351getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterTopBarKt.HelpCenterTopBarPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterTopBarPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        HelpCenterTopBarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
