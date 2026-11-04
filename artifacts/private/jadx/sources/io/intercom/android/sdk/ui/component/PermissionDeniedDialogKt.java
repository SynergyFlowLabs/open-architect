package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.a4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PermissionDeniedDialogKt {
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PermissionDeniedDialog(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String message, @NotNull final String confirmText, @NotNull final String dismissText, @Nullable Integer num, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Integer num2;
        int i13;
        Function0<Unit> function2;
        int i14;
        int i15;
        Function0<Unit> function3;
        int i16;
        androidx.compose.ui.a0 a0Var3;
        final Integer num3;
        final Function0<Unit> function4;
        final Function0<Unit> function5;
        androidx.compose.runtime.c0 c0Var2;
        final Function0<Unit> function6;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(dismissText, "dismissText");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-537034576);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(message) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(confirmText) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.D(dismissText) ? 2048 : 1024;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((57344 & i10) == 0) {
                num2 = num;
                i12 |= c0VarR.D(num2) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    function2 = function0;
                    if (c0VarR.k0(function2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((3670016 & i10) == 0) {
                        function3 = function1;
                        if (c0VarR.k0(function3)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    if ((2995931 & i12) == 599186 || !c0VarR.d()) {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i13 != 0) {
                            function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function5 = function3;
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var3;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                                invoke(c0Var3, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                                if ((i19 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Function0<Unit> function7 = function5;
                                final String str = confirmText;
                                a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                    @Override // pj.n
                                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                        invoke(x5Var, c0Var4, num4.intValue());
                                        return Unit.f312394a;
                                    }

                                    @androidx.compose.runtime.o
                                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                        if ((i20 & 81) == 16 && c0Var4.d()) {
                                            c0Var4.u();
                                            return;
                                        }
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                        q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                    }
                                }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                            }
                        }, c0VarR, 54), a0Var5, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                                invoke(c0Var3, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                                if ((i19 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Function0<Unit> function7 = function4;
                                final String str = dismissText;
                                a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                    @Override // pj.n
                                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                        invoke(x5Var, c0Var4, num4.intValue());
                                        return Unit.f312394a;
                                    }

                                    @androidx.compose.runtime.o
                                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                        if ((i20 & 81) == 16 && c0Var4.d()) {
                                            c0Var4.u();
                                            return;
                                        }
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                        q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                    }
                                }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                            }
                        }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                                invoke(c0Var3, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                                if ((i19 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                Integer num4 = num3;
                                if (num4 == null) {
                                    return;
                                }
                                ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                            }
                        }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                                invoke(c0Var3, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                                if ((i19 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                                q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                            }
                        }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                        function6 = function4;
                        a0Var4 = a0Var5;
                    } else {
                        c0VarR.u();
                        c0Var2 = c0VarR;
                        a0Var4 = a0Var2;
                        num3 = num2;
                        function6 = function2;
                        function5 = function3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function3 = function1;
                if ((2995931 & i12) == 599186) {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var3;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function5;
                            final String str = confirmText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), a0Var6, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function4;
                            final String str = dismissText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                        }
                    }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                            q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                        }
                    }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    function6 = function4;
                    a0Var4 = a0Var6;
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    androidx.compose.ui.a0 a0Var7 = a0Var3;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function5;
                            final String str = confirmText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), a0Var7, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function4;
                            final String str = dismissText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                        }
                    }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                            q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                        }
                    }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    function6 = function4;
                    a0Var4 = a0Var7;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function2 = function0;
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((2995931 & i12) == 599186) {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    androidx.compose.ui.a0 a0Var8 = a0Var3;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function5;
                            final String str = confirmText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), a0Var8, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function4;
                            final String str = dismissText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                        }
                    }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                            q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                        }
                    }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    function6 = function4;
                    a0Var4 = a0Var8;
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    androidx.compose.ui.a0 a0Var9 = a0Var3;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function5;
                            final String str = confirmText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), a0Var9, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function4;
                            final String str = dismissText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                        }
                    }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                            q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                        }
                    }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    function6 = function4;
                    a0Var4 = a0Var9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function3 = function1;
            if ((2995931 & i12) == 599186) {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function5 = function3;
                }
                androidx.compose.ui.a0 a0Var10 = a0Var3;
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function5;
                        final String str = confirmText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), a0Var10, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function4;
                        final String str = dismissText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                    }
                }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                function6 = function4;
                a0Var4 = a0Var10;
            } else {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function5 = function3;
                }
                androidx.compose.ui.a0 a0Var11 = a0Var3;
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function5;
                        final String str = confirmText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), a0Var11, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function4;
                        final String str = dismissText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                    }
                }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                function6 = function4;
                a0Var4 = a0Var11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        num2 = num;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                function2 = function0;
                if (c0VarR.k0(function2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((2995931 & i12) == 599186) {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    androidx.compose.ui.a0 a0Var12 = a0Var3;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function5;
                            final String str = confirmText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), a0Var12, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function4;
                            final String str = dismissText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                        }
                    }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                            q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                        }
                    }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    function6 = function4;
                    a0Var4 = a0Var12;
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    androidx.compose.ui.a0 a0Var13 = a0Var3;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function5;
                            final String str = confirmText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), a0Var13, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Function0<Unit> function7 = function4;
                            final String str = dismissText;
                            a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                    invoke(x5Var, c0Var4, num4.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i20 & 81) == 16 && c0Var4.d()) {
                                        c0Var4.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                    q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                                }
                            }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                        }
                    }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                        }
                    }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                            invoke(c0Var3, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                            q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                        }
                    }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                    function6 = function4;
                    a0Var4 = a0Var13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function3 = function1;
            if ((2995931 & i12) == 599186) {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function5 = function3;
                }
                androidx.compose.ui.a0 a0Var14 = a0Var3;
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function5;
                        final String str = confirmText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), a0Var14, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function4;
                        final String str = dismissText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                    }
                }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                function6 = function4;
                a0Var4 = a0Var14;
            } else {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function5 = function3;
                }
                androidx.compose.ui.a0 a0Var15 = a0Var3;
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function5;
                        final String str = confirmText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), a0Var15, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function4;
                        final String str = dismissText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                    }
                }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                function6 = function4;
                a0Var4 = a0Var15;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function2 = function0;
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((3670016 & i10) == 0) {
                function3 = function1;
                if (c0VarR.k0(function3)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((2995931 & i12) == 599186) {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function5 = function3;
                }
                androidx.compose.ui.a0 a0Var16 = a0Var3;
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function5;
                        final String str = confirmText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), a0Var16, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function4;
                        final String str = dismissText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                    }
                }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                function6 = function4;
                a0Var4 = a0Var16;
            } else {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function5 = function3;
                }
                androidx.compose.ui.a0 a0Var17 = a0Var3;
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function5;
                        final String str = confirmText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), a0Var17, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Function0<Unit> function7 = function4;
                        final String str = dismissText;
                        a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                                invoke(x5Var, c0Var4, num4.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i20 & 81) == 16 && c0Var4.d()) {
                                    c0Var4.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                                q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                            }
                        }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                    }
                }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                        invoke(c0Var3, num4.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
                function6 = function4;
                a0Var4 = a0Var17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        function3 = function1;
        if ((2995931 & i12) == 599186) {
            if (i17 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i18 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i13 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function2;
            }
            if (i15 != 0) {
                function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function5 = function3;
            }
            androidx.compose.ui.a0 a0Var18 = a0Var3;
            c0Var2 = c0VarR;
            androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Function0<Unit> function7 = function5;
                    final String str = confirmText;
                    a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                            invoke(x5Var, c0Var4, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && c0Var4.d()) {
                                c0Var4.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                            q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                        }
                    }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                }
            }, c0VarR, 54), a0Var18, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Function0<Unit> function7 = function4;
                    final String str = dismissText;
                    a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                            invoke(x5Var, c0Var4, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && c0Var4.d()) {
                                c0Var4.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                            q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                        }
                    }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                }
            }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                }
            }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                    q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                }
            }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
            function6 = function4;
            a0Var4 = a0Var18;
        } else {
            if (i17 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i18 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i13 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.ui.component.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function2;
            }
            if (i15 != 0) {
                function5 = new Function0() { // from class: io.intercom.android.sdk.ui.component.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function5 = function3;
            }
            androidx.compose.ui.a0 a0Var19 = a0Var3;
            c0Var2 = c0VarR;
            androidx.compose.material3.l.b(function4, androidx.compose.runtime.internal.w.e(-1474258584, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Function0<Unit> function7 = function5;
                    final String str = confirmText;
                    a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(2118877259, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                            invoke(x5Var, c0Var4, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && c0Var4.d()) {
                                c0Var4.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                            q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                        }
                    }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                }
            }, c0VarR, 54), a0Var19, androidx.compose.runtime.internal.w.e(-868483802, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Function0<Unit> function7 = function4;
                    final String str = dismissText;
                    a4.p(function7, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-1570315255, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var4, Integer num4) {
                            invoke(x5Var, c0Var4, num4.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var4, int i20) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i20 & 81) == 16 && c0Var4.d()) {
                                c0Var4.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            y3 type04SemiBold = intercomTheme.getTypography(c0Var4, 6).getType04SemiBold();
                            q50.t(str, null, intercomTheme.getColors(c0Var4, 6).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, c0Var4, 0, 0, 131066);
                        }
                    }, c0Var3, 54), c0Var3, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                }
            }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-565596411, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    ni.o(u0.e.c(num4.intValue(), c0Var3, 0), "", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m713getPrimaryIcon0d7_KjU(), c0Var3, 440, 0);
                }
            }, c0VarR, 54), null, androidx.compose.runtime.internal.w.e(40178371, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num4) {
                    invoke(c0Var3, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    y3 type04 = intercomTheme.getTypography(c0Var3, 6).getType04();
                    q50.t(message, null, intercomTheme.getColors(c0Var3, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                }
            }, c0VarR, 54), null, IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null), c0Var2, ((i12 >> 15) & 14) | 1600560 | ((i12 << 6) & 896), 3072, 7840);
            function6 = function4;
            a0Var4 = a0Var19;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(a0Var4, message, confirmText, dismissText, num3, function6, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionDeniedDialog$lambda$2(androidx.compose.ui.a0 a0Var, String message, String confirmText, String dismissText, Integer num, Function0 function0, Function0 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(confirmText, "$confirmText");
        Intrinsics.checkNotNullParameter(dismissText, "$dismissText");
        PermissionDeniedDialog(a0Var, message, confirmText, dismissText, num, function0, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PermissionDeniedDialogPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-501567607);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PermissionDeniedDialogKt.INSTANCE.m585getLambda1$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PermissionDeniedDialogKt.PermissionDeniedDialogPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionDeniedDialogPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PermissionDeniedDialogPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
