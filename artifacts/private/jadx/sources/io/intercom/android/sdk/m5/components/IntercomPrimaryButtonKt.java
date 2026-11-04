package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.a4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,131:1\n113#2:132\n113#2:133\n113#2:134\n*S KotlinDebug\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButtonKt\n*L\n73#1:132\n75#1:133\n88#1:134\n*E\n"})
public final class IntercomPrimaryButtonKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomPrimaryButton(@NotNull String text, @Nullable androidx.compose.ui.a0 a0Var, @androidx.annotation.v @Nullable Integer num, @NotNull Function0<Unit> onClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final String str;
        final Function0<Unit> function0;
        final androidx.compose.ui.a0 a0Var2;
        final Integer num2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-801577387);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(num) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.k0(onClick) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            function0 = onClick;
            num2 = num;
            a0Var2 = a0Var;
            str = text;
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var3 = a0Var;
            if (i14 != 0) {
                num = null;
            }
            Integer num3 = num;
            LegacyIntercomPrimaryButton(text, a0Var3, num3, onClick, c0VarR, i12 & 8190, 0);
            str = text;
            function0 = onClick;
            a0Var2 = a0Var3;
            num2 = num3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.f2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(str, a0Var2, num2, function0, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomPrimaryButton$lambda$0(String text, androidx.compose.ui.a0 a0Var, Integer num, Function0 onClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        IntercomPrimaryButton(text, a0Var, num, onClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "Deprecated component", replaceWith = @kotlin.b1(expression = "IntercomPrimaryButton() from ui module", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void LegacyIntercomPrimaryButton(final String str, androidx.compose.ui.a0 a0Var, @androidx.annotation.v Integer num, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        final Integer num2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(398234558);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(num) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 7168) == 0) {
                i12 |= c0VarR.k0(function1) ? 2048 : 1024;
            }
        }
        if ((i12 & 5771) == 1154 && c0VarR.d()) {
            c0VarR.u();
            num2 = num;
        } else {
            if ((i11 & 2) != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            final Integer num3 = i13 != 0 ? null : num;
            LegacyIntercomPrimaryButton(function1, (androidx.compose.ui.a0) null, false, (pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit>) androidx.compose.runtime.internal.w.e(2099872974, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num4) {
                    invoke(x5Var, c0Var2, num4.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 LegacyIntercomPrimaryButton, androidx.compose.runtime.c0 c0Var2, int i14) {
                    Intrinsics.checkNotNullParameter(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                    if ((i14 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    String str2 = str;
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    q50.t(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0Var2, i15).getType04(), intercomTheme.getColors(c0Var2, i15).m708getOnAction0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var2, 0, 0, 131070);
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    int iIntValue = num4.intValue();
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(6)), c0Var2, 6);
                    ni.o(u0.e.c(iIntValue, c0Var2, 0), null, i6.w(aVar, androidx.compose.ui.unit.h.r(16)), intercomTheme.getColors(c0Var2, i15).m708getOnAction0d7_KjU(), c0Var2, 440, 0);
                }
            }, c0VarR, 54), c0VarR, ((i12 >> 9) & 14) | 3072, 6);
            num2 = num3;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.i2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$1(str, a0Var2, num2, function0, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyIntercomPrimaryButton$lambda$1(String text, androidx.compose.ui.a0 a0Var, Integer num, Function0 onClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        LegacyIntercomPrimaryButton(text, a0Var, num, (Function0<Unit>) onClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyIntercomPrimaryButton$lambda$2(Function0 onClick, androidx.compose.ui.a0 a0Var, boolean z10, pj.n content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(content, "$content");
        LegacyIntercomPrimaryButton((Function0<Unit>) onClick, a0Var, z10, (pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit>) content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1925294537);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m145getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.h2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomPrimaryButtonKt.PrimaryButtonPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PrimaryButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonWithTrailingIconPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1297682962);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m146getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.j2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomPrimaryButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonWithTrailingIconPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PrimaryButtonWithTrailingIconPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void LegacyIntercomPrimaryButton(@NotNull final Function0<Unit> onClick, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @NotNull final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        androidx.compose.ui.a0 a0Var3;
        IntercomTheme intercomTheme;
        int i16;
        androidx.compose.foundation.a1 a1VarA;
        final boolean z12;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1285013288);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.k0(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (c0VarR.k0(content)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) != 1170 && c0VarR.d()) {
                    c0VarR.u();
                    a0Var4 = a0Var2;
                    z12 = z11;
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i16 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                        a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0VarR, i16).m();
                    androidx.compose.material3.r3 r3VarB = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
                    g5 g5VarG = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
                    int i18 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
                    androidx.compose.ui.a0 a0Var5 = a0Var3;
                    boolean z13 = z11;
                    a4.g(onClick, a0Var5, z13, eVarM, r3VarB, null, a1VarA, g5VarG, null, content, c0VarR, i18, 288);
                    z12 = z13;
                    a0Var4 = a0Var5;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, a0Var4, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.k0(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) != 1170) {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i16 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                androidx.compose.foundation.shape.e eVarM2 = intercomTheme.getShapes(c0VarR, i16).m();
                androidx.compose.material3.r3 r3VarB2 = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
                g5 g5VarG2 = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
                int i19 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
                androidx.compose.ui.a0 a0Var6 = a0Var3;
                boolean z14 = z11;
                a4.g(onClick, a0Var6, z14, eVarM2, r3VarB2, null, a1VarA, g5VarG2, null, content, c0VarR, i19, 288);
                z12 = z14;
                a0Var4 = a0Var6;
            } else {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i16 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                androidx.compose.foundation.shape.e eVarM3 = intercomTheme.getShapes(c0VarR, i16).m();
                androidx.compose.material3.r3 r3VarB3 = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
                g5 g5VarG3 = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
                int i110 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
                androidx.compose.ui.a0 a0Var7 = a0Var3;
                boolean z15 = z11;
                a4.g(onClick, a0Var7, z15, eVarM3, r3VarB3, null, a1VarA, g5VarG3, null, content, c0VarR, i110, 288);
                z12 = z15;
                a0Var4 = a0Var7;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, a0Var4, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.k0(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) != 1170) {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i16 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                androidx.compose.foundation.shape.e eVarM4 = intercomTheme.getShapes(c0VarR, i16).m();
                androidx.compose.material3.r3 r3VarB4 = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
                g5 g5VarG4 = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
                int i111 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
                androidx.compose.ui.a0 a0Var8 = a0Var3;
                boolean z16 = z11;
                a4.g(onClick, a0Var8, z16, eVarM4, r3VarB4, null, a1VarA, g5VarG4, null, content, c0VarR, i111, 288);
                z12 = z16;
                a0Var4 = a0Var8;
            } else {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i16 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                androidx.compose.foundation.shape.e eVarM5 = intercomTheme.getShapes(c0VarR, i16).m();
                androidx.compose.material3.r3 r3VarB5 = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
                g5 g5VarG5 = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
                int i112 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
                androidx.compose.ui.a0 a0Var9 = a0Var3;
                boolean z17 = z11;
                a4.g(onClick, a0Var9, z17, eVarM5, r3VarB5, null, a1VarA, g5VarG5, null, content, c0VarR, i112, 288);
                z12 = z17;
                a0Var4 = a0Var9;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, a0Var4, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c0VarR.k0(content)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 5851) != 1170) {
            if (i17 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                z11 = true;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i16 = IntercomTheme.$stable;
            if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
            } else {
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
            }
            androidx.compose.foundation.shape.e eVarM6 = intercomTheme.getShapes(c0VarR, i16).m();
            androidx.compose.material3.r3 r3VarB6 = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
            g5 g5VarG6 = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
            int i113 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
            androidx.compose.ui.a0 a0Var10 = a0Var3;
            boolean z18 = z11;
            a4.g(onClick, a0Var10, z18, eVarM6, r3VarB6, null, a1VarA, g5VarG6, null, content, c0VarR, i113, 288);
            z12 = z18;
            a0Var4 = a0Var10;
        } else {
            if (i17 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                z11 = true;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i16 = IntercomTheme.$stable;
            if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU())) {
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
            } else {
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.w(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
            }
            androidx.compose.foundation.shape.e eVarM7 = intercomTheme.getShapes(c0VarR, i16).m();
            androidx.compose.material3.r3 r3VarB7 = androidx.compose.material3.s3.f32666a.b(intercomTheme.getColors(c0VarR, i16).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i16).m708getOnAction0d7_KjU(), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), c0VarR, androidx.compose.material3.s3.f32683r << 12, 0);
            g5 g5VarG7 = d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
            int i114 = 12582912 | (i12 & 14) | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 << 18) & 1879048192);
            androidx.compose.ui.a0 a0Var11 = a0Var3;
            boolean z19 = z11;
            a4.g(onClick, a0Var11, z19, eVarM7, r3VarB7, null, a1VarA, g5VarG7, null, content, c0VarR, i114, 288);
            z12 = z19;
            a0Var4 = a0Var11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, a0Var4, z12, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
