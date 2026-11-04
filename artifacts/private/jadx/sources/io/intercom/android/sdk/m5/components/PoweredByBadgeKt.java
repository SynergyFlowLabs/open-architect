package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.d4;
import androidx.compose.material3.e4;
import androidx.compose.material3.m4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.wi;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.PoweredBy;
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
@SourceDebugExtension({"SMAP\nPoweredByBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PoweredByBadge.kt\nio/intercom/android/sdk/m5/components/PoweredByBadgeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,122:1\n75#2:123\n133#3:124\n113#3:126\n113#3:127\n113#3:128\n49#4:125\n*S KotlinDebug\n*F\n+ 1 PoweredByBadge.kt\nio/intercom/android/sdk/m5/components/PoweredByBadgeKt\n*L\n88#1:123\n91#1:124\n82#1:126\n83#1:127\n84#1:128\n91#1:125\n*E\n"})
public final class PoweredByBadgeKt {
    private static final float HorizontalPadding;
    private static final float IconSize;
    private static final float VerticalPadding = androidx.compose.ui.unit.h.r(6);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoweredBy.PoweredByIconType.values().length];
            try {
                iArr[PoweredBy.PoweredByIconType.INTERCOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoweredBy.PoweredByIconType.FIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f10 = 16;
        HorizontalPadding = androidx.compose.ui.unit.h.r(f10);
        IconSize = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:105:0x0155  */
    /* JADX WARN: Code duplicated, block: B:107:0x015b  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: PoweredByBadge-wBJOh4Y, reason: not valid java name */
    public static final void m170PoweredByBadgewBJOh4Y(@NotNull final String text, @NotNull final PoweredBy.PoweredByIconType icon, @NotNull final Function0<Unit> onClick, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j12;
        long j13;
        androidx.compose.ui.a0 a0Var3;
        long jM712getPoweredByBackgroundColor0d7_KjU;
        androidx.compose.ui.a0 a0Var4;
        long j14;
        long jM729generateTextColor8_81llA;
        int i13;
        int i14;
        final long j15;
        final androidx.compose.ui.a0 a0Var5;
        final long j16;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(546776392);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(icon) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(onClick) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 7168) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    int i16 = c0VarR.L(j12) ? 16384 : 8192;
                    i12 |= i16;
                } else {
                    j12 = j10;
                }
                i12 |= i16;
            } else {
                j12 = j10;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j13 = j11;
                    int i17 = c0VarR.L(j13) ? 131072 : 65536;
                    i12 |= i17;
                } else {
                    j13 = j11;
                }
                i12 |= i17;
            } else {
                j13 = j11;
            }
            if ((374491 & i12) == 74898 || !c0VarR.d()) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jM712getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m712getPoweredByBackgroundColor0d7_KjU();
                        i12 &= -57345;
                    } else {
                        jM712getPoweredByBackgroundColor0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        if (androidx.compose.ui.graphics.q0.y(jM712getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.q0.f38131b.s())) {
                            jM729generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU();
                        } else {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jM712getPoweredByBackgroundColor0d7_KjU);
                        }
                        i12 &= -458753;
                        a0Var4 = a0Var3;
                        j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                        j13 = jM729generateTextColor8_81llA;
                    } else {
                        a0Var4 = a0Var3;
                        j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    a0Var4 = a0Var2;
                    j14 = j12;
                }
                c0VarR.Z();
                i13 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                if (i13 == 1) {
                    i14 = R.drawable.intercom_logo;
                } else {
                    if (i13 != 2) {
                        throw new kotlin.k0();
                    }
                    i14 = R.drawable.intercom_fin_ai_agent;
                }
                int i18 = i12;
                androidx.compose.ui.a0 a0VarJ = wi.j(a0Var4);
                final int i19 = i14;
                final long j17 = j13;
                d4 d4VarB = e4.f27241a.b(j14, 0L, 0L, 0L, c0VarR, ((i18 >> 12) & 14) | (e4.f27242b << 12), 14);
                c0VarR = c0VarR;
                m4.h(onClick, a0VarJ, false, IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m(), d4VarB, null, null, null, androidx.compose.runtime.internal.w.e(803643315, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(m0Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.m0 Card, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarS = d5.s(aVar, PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding);
                        androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
                        androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                        int i21 = i19;
                        long j18 = j17;
                        String str = text;
                        androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarM, cVarQ, c0Var2, 54);
                        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarS);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                        y7.n(c0VarD, a1VarE, aVar2.e());
                        y7.n(c0VarD, b1VarK, aVar2.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar2.f());
                        y5 y5Var = y5.f16577a;
                        ni.o(u0.e.c(i21, c0Var2, 0), null, i6.w(aVar, PoweredByBadgeKt.IconSize), j18, c0Var2, 440, 0);
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                        q50.t(str, null, j18, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(c0Var2, 0), c0Var2, 0, 0, 131066);
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, ((i18 >> 6) & 14) | 100663296, 228);
                j15 = j14;
                a0Var5 = a0Var4;
                j16 = j17;
            } else {
                c0VarR.u();
                a0Var5 = a0Var2;
                j15 = j12;
                j16 = j13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.o2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(text, icon, onClick, a0Var5, j15, j16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i16;
            } else {
                j12 = j10;
            }
            i12 |= i16;
        } else {
            j12 = j10;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j13 = j11;
                if (c0VarR.L(j13)) {
                }
                i12 |= i17;
            } else {
                j13 = j11;
            }
            i12 |= i17;
        } else {
            j13 = j11;
        }
        if ((374491 & i12) == 74898) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 16) != 0) {
                    jM712getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m712getPoweredByBackgroundColor0d7_KjU();
                    i12 &= -57345;
                } else {
                    jM712getPoweredByBackgroundColor0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.q0.y(jM712getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.q0.f38131b.s())) {
                        jM729generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU();
                    } else {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jM712getPoweredByBackgroundColor0d7_KjU);
                    }
                    i12 &= -458753;
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                    j13 = jM729generateTextColor8_81llA;
                } else {
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                }
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 16) != 0) {
                    jM712getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m712getPoweredByBackgroundColor0d7_KjU();
                    i12 &= -57345;
                } else {
                    jM712getPoweredByBackgroundColor0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.q0.y(jM712getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.q0.f38131b.s())) {
                        jM729generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU();
                    } else {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jM712getPoweredByBackgroundColor0d7_KjU);
                    }
                    i12 &= -458753;
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                    j13 = jM729generateTextColor8_81llA;
                } else {
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                }
            }
            c0VarR.Z();
            i13 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i13 == 1) {
                i14 = R.drawable.intercom_logo;
            } else {
                if (i13 != 2) {
                    throw new kotlin.k0();
                }
                i14 = R.drawable.intercom_fin_ai_agent;
            }
            int i110 = i12;
            androidx.compose.ui.a0 a0VarJ2 = wi.j(a0Var4);
            final int i111 = i14;
            final long j18 = j13;
            d4 d4VarB2 = e4.f27241a.b(j14, 0L, 0L, 0L, c0VarR, ((i110 >> 12) & 14) | (e4.f27242b << 12), 14);
            c0VarR = c0VarR;
            m4.h(onClick, a0VarJ2, false, IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m(), d4VarB2, null, null, null, androidx.compose.runtime.internal.w.e(803643315, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(m0Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.m0 Card, androidx.compose.runtime.c0 c0Var2, int i20) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i20 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarS = d5.s(aVar, PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding);
                    androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
                    androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                    int i21 = i111;
                    long j19 = j18;
                    String str = text;
                    androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarM, cVarQ, c0Var2, 54);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarS);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarE, aVar2.e());
                    y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar2.f());
                    y5 y5Var = y5.f16577a;
                    ni.o(u0.e.c(i21, c0Var2, 0), null, i6.w(aVar, PoweredByBadgeKt.IconSize), j19, c0Var2, 440, 0);
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                    q50.t(str, null, j19, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(c0Var2, 0), c0Var2, 0, 0, 131066);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, ((i110 >> 6) & 14) | 100663296, 228);
            j15 = j14;
            a0Var5 = a0Var4;
            j16 = j18;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 16) != 0) {
                    jM712getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m712getPoweredByBackgroundColor0d7_KjU();
                    i12 &= -57345;
                } else {
                    jM712getPoweredByBackgroundColor0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.q0.y(jM712getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.q0.f38131b.s())) {
                        jM729generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU();
                    } else {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jM712getPoweredByBackgroundColor0d7_KjU);
                    }
                    i12 &= -458753;
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                    j13 = jM729generateTextColor8_81llA;
                } else {
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                }
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 16) != 0) {
                    jM712getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m712getPoweredByBackgroundColor0d7_KjU();
                    i12 &= -57345;
                } else {
                    jM712getPoweredByBackgroundColor0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.q0.y(jM712getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.q0.f38131b.s())) {
                        jM729generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU();
                    } else {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jM712getPoweredByBackgroundColor0d7_KjU);
                    }
                    i12 &= -458753;
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                    j13 = jM729generateTextColor8_81llA;
                } else {
                    a0Var4 = a0Var3;
                    j14 = jM712getPoweredByBackgroundColor0d7_KjU;
                }
            }
            c0VarR.Z();
            i13 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i13 == 1) {
                i14 = R.drawable.intercom_logo;
            } else {
                if (i13 != 2) {
                    throw new kotlin.k0();
                }
                i14 = R.drawable.intercom_fin_ai_agent;
            }
            int i112 = i12;
            androidx.compose.ui.a0 a0VarJ3 = wi.j(a0Var4);
            final int i113 = i14;
            final long j19 = j13;
            d4 d4VarB3 = e4.f27241a.b(j14, 0L, 0L, 0L, c0VarR, ((i112 >> 12) & 14) | (e4.f27242b << 12), 14);
            c0VarR = c0VarR;
            m4.h(onClick, a0VarJ3, false, IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m(), d4VarB3, null, null, null, androidx.compose.runtime.internal.w.e(803643315, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(m0Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.m0 Card, androidx.compose.runtime.c0 c0Var2, int i20) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i20 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarS = d5.s(aVar, PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding);
                    androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
                    androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                    int i21 = i113;
                    long j110 = j19;
                    String str = text;
                    androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarM, cVarQ, c0Var2, 54);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarS);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarE, aVar2.e());
                    y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar2.f());
                    y5 y5Var = y5.f16577a;
                    ni.o(u0.e.c(i21, c0Var2, 0), null, i6.w(aVar, PoweredByBadgeKt.IconSize), j110, c0Var2, 440, 0);
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                    q50.t(str, null, j110, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(c0Var2, 0), c0Var2, 0, 0, 131066);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, ((i112 >> 6) & 14) | 100663296, 228);
            j15 = j14;
            a0Var5 = a0Var4;
            j16 = j19;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.o2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(text, icon, onClick, a0Var5, j15, j16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PoweredByBadgePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(233774014);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            boolean z10 = false;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m149getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PoweredByBadgeKt.PoweredByBadgePreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PoweredByBadgePreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PoweredByBadgePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PoweredByBadge_wBJOh4Y$lambda$0(String text, PoweredBy.PoweredByIconType icon, Function0 onClick, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(icon, "$icon");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m170PoweredByBadgewBJOh4Y(text, icon, onClick, a0Var, j10, j11, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TransparentPoweredByBadgePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1988629996);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m151getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.n2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PoweredByBadgeKt.TransparentPoweredByBadgePreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransparentPoweredByBadgePreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TransparentPoweredByBadgePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final float getPoweredByBadgeHeight(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1418088879);
        float fY = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).y(getTextStyle(c0Var, 0).x());
        float f10 = VerticalPadding;
        float fR = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(Math.max(fY, IconSize)) + f10) + f10);
        c0Var.A();
        return fR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final y3 getTextStyle(androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(634566382);
        y3 type05 = IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType05();
        c0Var.A();
        return type05;
    }
}
