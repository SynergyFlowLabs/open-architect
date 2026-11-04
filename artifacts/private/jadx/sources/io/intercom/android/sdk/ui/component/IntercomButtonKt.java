package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.a4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.s3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomButton.kt\nio/intercom/android/sdk/ui/component/IntercomButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n113#2:129\n*S KotlinDebug\n*F\n+ 1 IntercomButton.kt\nio/intercom/android/sdk/ui/component/IntercomButtonKt\n*L\n38#1:129\n*E\n"})
public final class IntercomButtonKt {
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomButton(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final IntercomButton.Style style, @NotNull final String text, @androidx.annotation.v @Nullable Integer num, @NotNull final Function0<Unit> onClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Integer num2;
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var3;
        final Integer num3;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1819808567);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
            i12 |= c0VarR.D(style) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(text) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 7168) == 0) {
                num2 = num;
                i12 |= c0VarR.D(num2) ? 2048 : 1024;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.k0(onClick)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 46811) == 9362 || !c0VarR.d()) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i16 != 0) {
                    num2 = null;
                }
                final Integer num4 = num2;
                a0Var2 = a0Var3;
                a4.n(onClick, a0Var2, false, IntercomTheme.INSTANCE.getShapes(c0VarR, 6).m(), s3.f32666a.E(style.m594getBackgroundColor0d7_KjU(), style.m595getContentColor0d7_KjU(), 0L, 0L, c0VarR, s3.f32683r << 12, 12), null, style.getBorder(), d5.g(androidx.compose.ui.unit.h.r(12), androidx.compose.ui.unit.h.r(10)), null, androidx.compose.runtime.internal.w.e(905924137, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num5) {
                        invoke(x5Var, c0Var2, num5.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 OutlinedButton, androidx.compose.runtime.c0 c0Var2, int i17) {
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i17 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        q50.t(text, null, style.m595getContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, 6).getType04(), c0Var2, 0, 0, 131066);
                        Integer num5 = num4;
                        if (num5 == null) {
                            return;
                        }
                        IntercomButton.Style style2 = style;
                        int iIntValue = num5.intValue();
                        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(6)), c0Var2, 6);
                        ni.o(u0.e.c(iIntValue, c0Var2, 0), null, i6.w(aVar, androidx.compose.ui.unit.h.r(16)), style2.m595getContentColor0d7_KjU(), c0Var2, 440, 0);
                    }
                }, c0VarR, 54), c0VarR, ((i14 >> 12) & 14) | 817889280 | ((i14 << 3) & com.planner5d.library.engine.input.f.b.B), 292);
                num3 = num4;
            } else {
                c0VarR.u();
                num3 = num2;
            }
            a0Var4 = a0Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomButtonKt.IntercomButton$lambda$0(a0Var4, style, text, num3, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        num2 = num;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c0VarR.k0(onClick)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 46811) == 9362) {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i16 != 0) {
                num2 = null;
            }
            final Integer num5 = num2;
            a0Var2 = a0Var3;
            a4.n(onClick, a0Var2, false, IntercomTheme.INSTANCE.getShapes(c0VarR, 6).m(), s3.f32666a.E(style.m594getBackgroundColor0d7_KjU(), style.m595getContentColor0d7_KjU(), 0L, 0L, c0VarR, s3.f32683r << 12, 12), null, style.getBorder(), d5.g(androidx.compose.ui.unit.h.r(12), androidx.compose.ui.unit.h.r(10)), null, androidx.compose.runtime.internal.w.e(905924137, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num6) {
                    invoke(x5Var, c0Var2, num6.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 OutlinedButton, androidx.compose.runtime.c0 c0Var2, int i17) {
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i17 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    q50.t(text, null, style.m595getContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, 6).getType04(), c0Var2, 0, 0, 131066);
                    Integer num6 = num5;
                    if (num6 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = style;
                    int iIntValue = num6.intValue();
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(6)), c0Var2, 6);
                    ni.o(u0.e.c(iIntValue, c0Var2, 0), null, i6.w(aVar, androidx.compose.ui.unit.h.r(16)), style2.m595getContentColor0d7_KjU(), c0Var2, 440, 0);
                }
            }, c0VarR, 54), c0VarR, ((i14 >> 12) & 14) | 817889280 | ((i14 << 3) & com.planner5d.library.engine.input.f.b.B), 292);
            num3 = num5;
        } else {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i16 != 0) {
                num2 = null;
            }
            final Integer num6 = num2;
            a0Var2 = a0Var3;
            a4.n(onClick, a0Var2, false, IntercomTheme.INSTANCE.getShapes(c0VarR, 6).m(), s3.f32666a.E(style.m594getBackgroundColor0d7_KjU(), style.m595getContentColor0d7_KjU(), 0L, 0L, c0VarR, s3.f32683r << 12, 12), null, style.getBorder(), d5.g(androidx.compose.ui.unit.h.r(12), androidx.compose.ui.unit.h.r(10)), null, androidx.compose.runtime.internal.w.e(905924137, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num7) {
                    invoke(x5Var, c0Var2, num7.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 OutlinedButton, androidx.compose.runtime.c0 c0Var2, int i17) {
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i17 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    q50.t(text, null, style.m595getContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, 6).getType04(), c0Var2, 0, 0, 131066);
                    Integer num7 = num6;
                    if (num7 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = style;
                    int iIntValue = num7.intValue();
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(6)), c0Var2, 6);
                    ni.o(u0.e.c(iIntValue, c0Var2, 0), null, i6.w(aVar, androidx.compose.ui.unit.h.r(16)), style2.m595getContentColor0d7_KjU(), c0Var2, 440, 0);
                }
            }, c0VarR, 54), c0VarR, ((i14 >> 12) & 14) | 817889280 | ((i14 << 3) & com.planner5d.library.engine.input.f.b.B), 292);
            num3 = num6;
        }
        a0Var4 = a0Var2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomButtonKt.IntercomButton$lambda$0(a0Var4, style, text, num3, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomButton$lambda$0(androidx.compose.ui.a0 a0Var, IntercomButton.Style style, String text, Integer num, Function0 onClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(style, "$style");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        IntercomButton(a0Var, style, text, num, onClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void OutlinedButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2065130974);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m575getLambda3$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomButtonKt.OutlinedButtonPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedButtonPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        OutlinedButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1818981662);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m573getLambda1$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomButtonKt.PrimaryButtonPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PrimaryButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonWithTrailingIconPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-340414909);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m574getLambda2$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonWithTrailingIconPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PrimaryButtonWithTrailingIconPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
