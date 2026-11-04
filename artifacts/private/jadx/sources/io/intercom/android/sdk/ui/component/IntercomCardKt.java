package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.a1;
import androidx.compose.foundation.layout.m0;
import androidx.compose.material3.d4;
import androidx.compose.material3.e4;
import androidx.compose.material3.f4;
import androidx.compose.material3.m4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomCard.kt\nio/intercom/android/sdk/ui/component/IntercomCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,128:1\n113#2:129\n113#2:130\n1282#3,6:131\n*S KotlinDebug\n*F\n+ 1 IntercomCard.kt\nio/intercom/android/sdk/ui/component/IntercomCardKt\n*L\n32#1:129\n41#1:130\n57#1:131,6\n*E\n"})
public final class IntercomCardKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IntercomCard(@Nullable androidx.compose.ui.a0 a0Var, @Nullable IntercomCardStyle.Style style, @NotNull final pj.n<? super m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        IntercomCardStyle.Style style2;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.ui.a0 a0Var3;
        IntercomCardStyle.Style styleM597defaultStyleqUnfpCA;
        androidx.compose.runtime.c0 c0Var3;
        final IntercomCardStyle.Style style3;
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1083788517);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            if ((i11 & 2) == 0) {
                style2 = style;
                int i14 = c0VarR.D(style2) ? 32 : 16;
                i12 |= i14;
            } else {
                style2 = style;
            }
            i12 |= i14;
        } else {
            style2 = style;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(content) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            style3 = style2;
            c0Var3 = c0VarR;
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                androidx.compose.ui.a0 a0Var4 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
                if ((i11 & 2) != 0) {
                    c0Var2 = c0VarR;
                    i12 &= -113;
                    a0Var3 = a0Var4;
                    styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                } else {
                    c0Var2 = c0VarR;
                    a0Var3 = a0Var4;
                    styleM597defaultStyleqUnfpCA = style2;
                }
            } else {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                a0Var3 = a0Var2;
                styleM597defaultStyleqUnfpCA = style2;
                c0Var2 = c0VarR;
            }
            c0Var2.Z();
            float fM606getElevationD9Ej5fM = styleM597defaultStyleqUnfpCA.m606getElevationD9Ej5fM();
            q3 shape = styleM597defaultStyleqUnfpCA.getShape();
            q0 q0VarM607getShadowColorQN2ZGVo = styleM597defaultStyleqUnfpCA.m607getShadowColorQN2ZGVo();
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.draw.x.f(a0Var3, fM606getElevationD9Ej5fM, shape, false, 0L, q0VarM607getShadowColorQN2ZGVo != null ? q0VarM607getShadowColorQN2ZGVo.M() : q0.f38131b.a(), 12, null);
            q3 shape2 = styleM597defaultStyleqUnfpCA.getShape();
            e4 e4Var = e4.f27241a;
            long jM604getBackgroundColor0d7_KjU = styleM597defaultStyleqUnfpCA.m604getBackgroundColor0d7_KjU();
            long jM605getContentColor0d7_KjU = styleM597defaultStyleqUnfpCA.m605getContentColor0d7_KjU();
            int i15 = e4.f27242b;
            androidx.compose.runtime.c0 c0Var4 = c0Var2;
            c0Var3 = c0Var4;
            m4.g(a0VarF, shape2, e4Var.b(jM604getBackgroundColor0d7_KjU, jM605getContentColor0d7_KjU, 0L, 0L, c0Var4, i15 << 12, 12), e4Var.c(androidx.compose.ui.unit.h.r(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, (i15 << 18) | 6, 62), styleM597defaultStyleqUnfpCA.getBorder(), content, c0Var3, (i12 << 9) & 458752, 0);
            a0Var2 = a0Var3;
            style3 = styleM597defaultStyleqUnfpCA;
        }
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomCardKt.IntercomCard$lambda$0(a0Var2, style3, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomCard$lambda$0(androidx.compose.ui.a0 a0Var, IntercomCardStyle.Style style, pj.n content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(content, "$content");
        IntercomCard(a0Var, style, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomCard$lambda$2(Function0 onClick, androidx.compose.ui.a0 a0Var, boolean z10, IntercomCardStyle.Style style, androidx.compose.foundation.interaction.j jVar, pj.n content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(content, "$content");
        IntercomCard(onClick, a0Var, z10, style, jVar, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x012b  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0154  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IntercomCard(@NotNull final Function0<Unit> onClick, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable IntercomCardStyle.Style style, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        IntercomCardStyle.Style style2;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        androidx.compose.ui.a0 a0Var3;
        boolean z12;
        IntercomCardStyle.Style styleM597defaultStyleqUnfpCA;
        int i18;
        androidx.compose.ui.a0 a0Var4;
        boolean z13;
        IntercomCardStyle.Style style3;
        Object objI0;
        androidx.compose.foundation.interaction.j jVar3;
        final boolean z14;
        final androidx.compose.foundation.interaction.j jVar4;
        final IntercomCardStyle.Style style4;
        final androidx.compose.ui.a0 a0Var5;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(254499300);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.k0(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
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
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        style2 = style;
                        int i20 = c0VarR.D(style2) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        style2 = style;
                    }
                    i12 |= i20;
                } else {
                    style2 = style;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (c0VarR.k0(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898 && c0VarR.d()) {
                            c0VarR.u();
                            a0Var5 = a0Var2;
                            z14 = z11;
                            style4 = style2;
                            jVar4 = jVar2;
                        } else {
                            c0VarR.l0();
                            if ((i10 & 1) == 0 && !c0VarR.y()) {
                                c0VarR.u();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                androidx.compose.ui.a0 a0Var6 = a0Var2;
                                i18 = i12;
                                a0Var4 = a0Var6;
                                z13 = z11;
                                style3 = style2;
                            } else {
                                if (i19 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if ((i11 & 8) != 0) {
                                    styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                    i12 &= -7169;
                                } else {
                                    styleM597defaultStyleqUnfpCA = style2;
                                }
                                if (i15 != 0) {
                                    c0VarR.E(-2091443309);
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = androidx.compose.foundation.interaction.i.a();
                                        c0VarR.Y(objI0);
                                    }
                                    c0VarR.A();
                                    boolean z15 = z12;
                                    i18 = i12;
                                    a0Var4 = a0Var3;
                                    z13 = z15;
                                    style3 = styleM597defaultStyleqUnfpCA;
                                    jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                                } else {
                                    boolean z16 = z12;
                                    i18 = i12;
                                    a0Var4 = a0Var3;
                                    z13 = z16;
                                    style3 = styleM597defaultStyleqUnfpCA;
                                }
                                c0VarR.Z();
                                q3 shape = style3.getShape();
                                e4 e4Var = e4.f27241a;
                                long jM604getBackgroundColor0d7_KjU = style3.m604getBackgroundColor0d7_KjU();
                                long jM605getContentColor0d7_KjU = style3.m605getContentColor0d7_KjU();
                                int i21 = e4.f27242b;
                                d4 d4VarB = e4Var.b(jM604getBackgroundColor0d7_KjU, jM605getContentColor0d7_KjU, 0L, 0L, c0VarR, i21 << 12, 12);
                                f4 f4VarC = e4Var.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21 << 18, 62);
                                a1 border = style3.getBorder();
                                int i22 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                                int i23 = i18 << 9;
                                m4.h(onClick, a0Var4, z13, shape, d4VarB, f4VarC, border, jVar3, content, c0VarR, (i23 & 234881024) | i22 | (29360128 & i23), 0);
                                z14 = z13;
                                jVar4 = jVar3;
                                style4 = style3;
                                a0Var5 = a0Var4;
                            }
                            jVar3 = jVar2;
                            c0VarR.Z();
                            q3 shape2 = style3.getShape();
                            e4 e4Var2 = e4.f27241a;
                            long jM604getBackgroundColor0d7_KjU2 = style3.m604getBackgroundColor0d7_KjU();
                            long jM605getContentColor0d7_KjU2 = style3.m605getContentColor0d7_KjU();
                            int i24 = e4.f27242b;
                            d4 d4VarB2 = e4Var2.b(jM604getBackgroundColor0d7_KjU2, jM605getContentColor0d7_KjU2, 0L, 0L, c0VarR, i24 << 12, 12);
                            f4 f4VarC2 = e4Var2.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i24 << 18, 62);
                            a1 border2 = style3.getBorder();
                            int i25 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                            int i26 = i18 << 9;
                            m4.h(onClick, a0Var4, z13, shape2, d4VarB2, f4VarC2, border2, jVar3, content, c0VarR, (i26 & 234881024) | i25 | (29360128 & i26), 0);
                            z14 = z13;
                            jVar4 = jVar3;
                            style4 = style3;
                            a0Var5 = a0Var4;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 = androidx.profileinstaller.n.c.f73814m;
                    i12 |= i17;
                    if ((374491 & i12) != 74898) {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z17 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z17;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z18 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z18;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z19 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z19;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z110 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z110;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape3 = style3.getShape();
                        e4 e4Var3 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU3 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU3 = style3.m605getContentColor0d7_KjU();
                        int i27 = e4.f27242b;
                        d4 d4VarB3 = e4Var3.b(jM604getBackgroundColor0d7_KjU3, jM605getContentColor0d7_KjU3, 0L, 0L, c0VarR, i27 << 12, 12);
                        f4 f4VarC3 = e4Var3.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i27 << 18, 62);
                        a1 border3 = style3.getBorder();
                        int i28 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i29 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape3, d4VarB3, f4VarC3, border3, jVar3, content, c0VarR, (i29 & 234881024) | i28 | (29360128 & i29), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z111 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z111;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z112 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z112;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z113 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z113;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z114 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z114;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape4 = style3.getShape();
                        e4 e4Var4 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU4 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU4 = style3.m605getContentColor0d7_KjU();
                        int i210 = e4.f27242b;
                        d4 d4VarB4 = e4Var4.b(jM604getBackgroundColor0d7_KjU4, jM605getContentColor0d7_KjU4, 0L, 0L, c0VarR, i210 << 12, 12);
                        f4 f4VarC4 = e4Var4.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i210 << 18, 62);
                        a1 border4 = style3.getBorder();
                        int i211 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i212 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape4, d4VarB4, f4VarC4, border4, jVar3, content, c0VarR, (i212 & 234881024) | i211 | (29360128 & i212), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c0VarR.k0(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z115 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z115;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z116 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z116;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z117 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z117;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z118 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z118;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape5 = style3.getShape();
                        e4 e4Var5 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU5 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU5 = style3.m605getContentColor0d7_KjU();
                        int i213 = e4.f27242b;
                        d4 d4VarB5 = e4Var5.b(jM604getBackgroundColor0d7_KjU5, jM605getContentColor0d7_KjU5, 0L, 0L, c0VarR, i213 << 12, 12);
                        f4 f4VarC5 = e4Var5.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i213 << 18, 62);
                        a1 border5 = style3.getBorder();
                        int i214 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i215 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape5, d4VarB5, f4VarC5, border5, jVar3, content, c0VarR, (i215 & 234881024) | i214 | (29360128 & i215), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z119 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z119;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z1110 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z1110;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z1111 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z1111;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z1112 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z1112;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape6 = style3.getShape();
                        e4 e4Var6 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU6 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU6 = style3.m605getContentColor0d7_KjU();
                        int i216 = e4.f27242b;
                        d4 d4VarB6 = e4Var6.b(jM604getBackgroundColor0d7_KjU6, jM605getContentColor0d7_KjU6, 0L, 0L, c0VarR, i216 << 12, 12);
                        f4 f4VarC6 = e4Var6.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i216 << 18, 62);
                        a1 border6 = style3.getBorder();
                        int i217 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i218 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape6, d4VarB6, f4VarC6, border6, jVar3, content, c0VarR, (i218 & 234881024) | i217 | (29360128 & i218), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 = androidx.profileinstaller.n.c.f73814m;
                i12 |= i17;
                if ((374491 & i12) != 74898) {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1113 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1113;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1114 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1114;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1115 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1115;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1116 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1116;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape7 = style3.getShape();
                    e4 e4Var7 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU7 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU7 = style3.m605getContentColor0d7_KjU();
                    int i219 = e4.f27242b;
                    d4 d4VarB7 = e4Var7.b(jM604getBackgroundColor0d7_KjU7, jM605getContentColor0d7_KjU7, 0L, 0L, c0VarR, i219 << 12, 12);
                    f4 f4VarC7 = e4Var7.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i219 << 18, 62);
                    a1 border7 = style3.getBorder();
                    int i2110 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i2111 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape7, d4VarB7, f4VarC7, border7, jVar3, content, c0VarR, (i2111 & 234881024) | i2110 | (29360128 & i2111), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1117 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1117;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1118 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1118;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1119 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1119;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z11110 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11110;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape8 = style3.getShape();
                    e4 e4Var8 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU8 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU8 = style3.m605getContentColor0d7_KjU();
                    int i2112 = e4.f27242b;
                    d4 d4VarB8 = e4Var8.b(jM604getBackgroundColor0d7_KjU8, jM605getContentColor0d7_KjU8, 0L, 0L, c0VarR, i2112 << 12, 12);
                    f4 f4VarC8 = e4Var8.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2112 << 18, 62);
                    a1 border8 = style3.getBorder();
                    int i2113 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i2114 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape8, d4VarB8, f4VarC8, border8, jVar3, content, c0VarR, (i2114 & 234881024) | i2113 | (29360128 & i2114), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    style2 = style;
                    if (c0VarR.D(style2)) {
                    }
                    i12 |= i20;
                } else {
                    style2 = style;
                }
                i12 |= i20;
            } else {
                style2 = style;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c0VarR.k0(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11111 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11112 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11112;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11113 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11113;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11114 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11114;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape9 = style3.getShape();
                        e4 e4Var9 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU9 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU9 = style3.m605getContentColor0d7_KjU();
                        int i2115 = e4.f27242b;
                        d4 d4VarB9 = e4Var9.b(jM604getBackgroundColor0d7_KjU9, jM605getContentColor0d7_KjU9, 0L, 0L, c0VarR, i2115 << 12, 12);
                        f4 f4VarC9 = e4Var9.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2115 << 18, 62);
                        a1 border9 = style3.getBorder();
                        int i2116 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i2117 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape9, d4VarB9, f4VarC9, border9, jVar3, content, c0VarR, (i2117 & 234881024) | i2116 | (29360128 & i2117), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11115 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11115;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11116 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11116;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11117 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11117;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11118 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11118;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape10 = style3.getShape();
                        e4 e4Var10 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU10 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU10 = style3.m605getContentColor0d7_KjU();
                        int i2118 = e4.f27242b;
                        d4 d4VarB10 = e4Var10.b(jM604getBackgroundColor0d7_KjU10, jM605getContentColor0d7_KjU10, 0L, 0L, c0VarR, i2118 << 12, 12);
                        f4 f4VarC10 = e4Var10.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2118 << 18, 62);
                        a1 border10 = style3.getBorder();
                        int i2119 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i21110 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape10, d4VarB10, f4VarC10, border10, jVar3, content, c0VarR, (i21110 & 234881024) | i2119 | (29360128 & i21110), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 = androidx.profileinstaller.n.c.f73814m;
                i12 |= i17;
                if ((374491 & i12) != 74898) {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z11119 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11119;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111110 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111110;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111112 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111112;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape11 = style3.getShape();
                    e4 e4Var11 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU11 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU11 = style3.m605getContentColor0d7_KjU();
                    int i21111 = e4.f27242b;
                    d4 d4VarB11 = e4Var11.b(jM604getBackgroundColor0d7_KjU11, jM605getContentColor0d7_KjU11, 0L, 0L, c0VarR, i21111 << 12, 12);
                    f4 f4VarC11 = e4Var11.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21111 << 18, 62);
                    a1 border11 = style3.getBorder();
                    int i21112 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i21113 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape11, d4VarB11, f4VarC11, border11, jVar3, content, c0VarR, (i21113 & 234881024) | i21112 | (29360128 & i21113), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111113 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111113;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111114 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111114;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111115 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111115;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111116 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111116;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape12 = style3.getShape();
                    e4 e4Var12 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU12 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU12 = style3.m605getContentColor0d7_KjU();
                    int i21114 = e4.f27242b;
                    d4 d4VarB12 = e4Var12.b(jM604getBackgroundColor0d7_KjU12, jM605getContentColor0d7_KjU12, 0L, 0L, c0VarR, i21114 << 12, 12);
                    f4 f4VarC12 = e4Var12.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21114 << 18, 62);
                    a1 border12 = style3.getBorder();
                    int i21115 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i21116 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape12, d4VarB12, f4VarC12, border12, jVar3, content, c0VarR, (i21116 & 234881024) | i21115 | (29360128 & i21116), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111117 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111117;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111118 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111118;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111119 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111119;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111110 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111110;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape13 = style3.getShape();
                    e4 e4Var13 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU13 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU13 = style3.m605getContentColor0d7_KjU();
                    int i21117 = e4.f27242b;
                    d4 d4VarB13 = e4Var13.b(jM604getBackgroundColor0d7_KjU13, jM605getContentColor0d7_KjU13, 0L, 0L, c0VarR, i21117 << 12, 12);
                    f4 f4VarC13 = e4Var13.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21117 << 18, 62);
                    a1 border13 = style3.getBorder();
                    int i21118 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i21119 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape13, d4VarB13, f4VarC13, border13, jVar3, content, c0VarR, (i21119 & 234881024) | i21118 | (29360128 & i21119), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1111111 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111112 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111112;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1111113 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111113;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111114 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111114;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape14 = style3.getShape();
                    e4 e4Var14 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU14 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU14 = style3.m605getContentColor0d7_KjU();
                    int i211110 = e4.f27242b;
                    d4 d4VarB14 = e4Var14.b(jM604getBackgroundColor0d7_KjU14, jM605getContentColor0d7_KjU14, 0L, 0L, c0VarR, i211110 << 12, 12);
                    f4 f4VarC14 = e4Var14.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211110 << 18, 62);
                    a1 border14 = style3.getBorder();
                    int i211111 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i211112 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape14, d4VarB14, f4VarC14, border14, jVar3, content, c0VarR, (i211112 & 234881024) | i211111 | (29360128 & i211112), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i17;
            if ((374491 & i12) != 74898) {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111115 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111115;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111116 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111116;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111117 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111117;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111118 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111118;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape15 = style3.getShape();
                e4 e4Var15 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU15 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU15 = style3.m605getContentColor0d7_KjU();
                int i211113 = e4.f27242b;
                d4 d4VarB15 = e4Var15.b(jM604getBackgroundColor0d7_KjU15, jM605getContentColor0d7_KjU15, 0L, 0L, c0VarR, i211113 << 12, 12);
                f4 f4VarC15 = e4Var15.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211113 << 18, 62);
                a1 border15 = style3.getBorder();
                int i211114 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i211115 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape15, d4VarB15, f4VarC15, border15, jVar3, content, c0VarR, (i211115 & 234881024) | i211114 | (29360128 & i211115), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            } else {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111119 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111119;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z11111110 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111110;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z11111111 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111111;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z11111112 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111112;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape16 = style3.getShape();
                e4 e4Var16 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU16 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU16 = style3.m605getContentColor0d7_KjU();
                int i211116 = e4.f27242b;
                d4 d4VarB16 = e4Var16.b(jM604getBackgroundColor0d7_KjU16, jM605getContentColor0d7_KjU16, 0L, 0L, c0VarR, i211116 << 12, 12);
                f4 f4VarC16 = e4Var16.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211116 << 18, 62);
                a1 border16 = style3.getBorder();
                int i211117 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i211118 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape16, d4VarB16, f4VarC16, border16, jVar3, content, c0VarR, (i211118 & 234881024) | i211117 | (29360128 & i211118), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    style2 = style;
                    if (c0VarR.D(style2)) {
                    }
                    i12 |= i20;
                } else {
                    style2 = style;
                }
                i12 |= i20;
            } else {
                style2 = style;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c0VarR.k0(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11111113 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111113;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11111114 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111114;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11111115 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111115;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11111116 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111116;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape17 = style3.getShape();
                        e4 e4Var17 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU17 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU17 = style3.m605getContentColor0d7_KjU();
                        int i211119 = e4.f27242b;
                        d4 d4VarB17 = e4Var17.b(jM604getBackgroundColor0d7_KjU17, jM605getContentColor0d7_KjU17, 0L, 0L, c0VarR, i211119 << 12, 12);
                        f4 f4VarC17 = e4Var17.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211119 << 18, 62);
                        a1 border17 = style3.getBorder();
                        int i2111110 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i2111111 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape17, d4VarB17, f4VarC17, border17, jVar3, content, c0VarR, (i2111111 & 234881024) | i2111110 | (29360128 & i2111111), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) == 0) {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11111117 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111117;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z11111118 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111118;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        } else {
                            if (i19 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                                i12 &= -7169;
                            } else {
                                styleM597defaultStyleqUnfpCA = style2;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-2091443309);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                boolean z11111119 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z11111119;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                boolean z111111110 = z12;
                                i18 = i12;
                                a0Var4 = a0Var3;
                                z13 = z111111110;
                                style3 = styleM597defaultStyleqUnfpCA;
                                jVar3 = jVar2;
                            }
                        }
                        c0VarR.Z();
                        q3 shape18 = style3.getShape();
                        e4 e4Var18 = e4.f27241a;
                        long jM604getBackgroundColor0d7_KjU18 = style3.m604getBackgroundColor0d7_KjU();
                        long jM605getContentColor0d7_KjU18 = style3.m605getContentColor0d7_KjU();
                        int i2111112 = e4.f27242b;
                        d4 d4VarB18 = e4Var18.b(jM604getBackgroundColor0d7_KjU18, jM605getContentColor0d7_KjU18, 0L, 0L, c0VarR, i2111112 << 12, 12);
                        f4 f4VarC18 = e4Var18.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2111112 << 18, 62);
                        a1 border18 = style3.getBorder();
                        int i2111113 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                        int i2111114 = i18 << 9;
                        m4.h(onClick, a0Var4, z13, shape18, d4VarB18, f4VarC18, border18, jVar3, content, c0VarR, (i2111114 & 234881024) | i2111113 | (29360128 & i2111114), 0);
                        z14 = z13;
                        jVar4 = jVar3;
                        style4 = style3;
                        a0Var5 = a0Var4;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 = androidx.profileinstaller.n.c.f73814m;
                i12 |= i17;
                if ((374491 & i12) != 74898) {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111111 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111111;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111111112 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111112;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111113 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111113;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111111114 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111114;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape19 = style3.getShape();
                    e4 e4Var19 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU19 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU19 = style3.m605getContentColor0d7_KjU();
                    int i2111115 = e4.f27242b;
                    d4 d4VarB19 = e4Var19.b(jM604getBackgroundColor0d7_KjU19, jM605getContentColor0d7_KjU19, 0L, 0L, c0VarR, i2111115 << 12, 12);
                    f4 f4VarC19 = e4Var19.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2111115 << 18, 62);
                    a1 border19 = style3.getBorder();
                    int i2111116 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i2111117 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape19, d4VarB19, f4VarC19, border19, jVar3, content, c0VarR, (i2111117 & 234881024) | i2111116 | (29360128 & i2111117), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111115 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111115;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111111116 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111116;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111117 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111117;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111111118 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111118;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape110 = style3.getShape();
                    e4 e4Var110 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU110 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU110 = style3.m605getContentColor0d7_KjU();
                    int i2111118 = e4.f27242b;
                    d4 d4VarB110 = e4Var110.b(jM604getBackgroundColor0d7_KjU110, jM605getContentColor0d7_KjU110, 0L, 0L, c0VarR, i2111118 << 12, 12);
                    f4 f4VarC110 = e4Var110.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2111118 << 18, 62);
                    a1 border110 = style3.getBorder();
                    int i2111119 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i21111110 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape110, d4VarB110, f4VarC110, border110, jVar3, content, c0VarR, (i21111110 & 234881024) | i2111119 | (29360128 & i21111110), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111119 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111119;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111111110 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111110;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1111111111 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111111;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111111112 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111112;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape111 = style3.getShape();
                    e4 e4Var111 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU111 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU111 = style3.m605getContentColor0d7_KjU();
                    int i21111111 = e4.f27242b;
                    d4 d4VarB111 = e4Var111.b(jM604getBackgroundColor0d7_KjU111, jM605getContentColor0d7_KjU111, 0L, 0L, c0VarR, i21111111 << 12, 12);
                    f4 f4VarC111 = e4Var111.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21111111 << 18, 62);
                    a1 border111 = style3.getBorder();
                    int i21111112 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i21111113 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape111, d4VarB111, f4VarC111, border111, jVar3, content, c0VarR, (i21111113 & 234881024) | i21111112 | (29360128 & i21111113), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1111111113 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111113;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111111114 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111114;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z1111111115 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111115;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z1111111116 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z1111111116;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape112 = style3.getShape();
                    e4 e4Var112 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU112 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU112 = style3.m605getContentColor0d7_KjU();
                    int i21111114 = e4.f27242b;
                    d4 d4VarB112 = e4Var112.b(jM604getBackgroundColor0d7_KjU112, jM605getContentColor0d7_KjU112, 0L, 0L, c0VarR, i21111114 << 12, 12);
                    f4 f4VarC112 = e4Var112.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21111114 << 18, 62);
                    a1 border112 = style3.getBorder();
                    int i21111115 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i21111116 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape112, d4VarB112, f4VarC112, border112, jVar3, content, c0VarR, (i21111116 & 234881024) | i21111115 | (29360128 & i21111116), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i17;
            if ((374491 & i12) != 74898) {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111111117 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111117;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111111118 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111118;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111111119 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111119;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z11111111110 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111111110;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape113 = style3.getShape();
                e4 e4Var113 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU113 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU113 = style3.m605getContentColor0d7_KjU();
                int i21111117 = e4.f27242b;
                d4 d4VarB113 = e4Var113.b(jM604getBackgroundColor0d7_KjU113, jM605getContentColor0d7_KjU113, 0L, 0L, c0VarR, i21111117 << 12, 12);
                f4 f4VarC113 = e4Var113.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21111117 << 18, 62);
                a1 border113 = style3.getBorder();
                int i21111118 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i21111119 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape113, d4VarB113, f4VarC113, border113, jVar3, content, c0VarR, (i21111119 & 234881024) | i21111118 | (29360128 & i21111119), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            } else {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z11111111111 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111111111;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z11111111112 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111111112;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z11111111113 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111111113;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z11111111114 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z11111111114;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape114 = style3.getShape();
                e4 e4Var114 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU114 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU114 = style3.m605getContentColor0d7_KjU();
                int i211111110 = e4.f27242b;
                d4 d4VarB114 = e4Var114.b(jM604getBackgroundColor0d7_KjU114, jM605getContentColor0d7_KjU114, 0L, 0L, c0VarR, i211111110 << 12, 12);
                f4 f4VarC114 = e4Var114.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211111110 << 18, 62);
                a1 border114 = style3.getBorder();
                int i211111111 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i211111112 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape114, d4VarB114, f4VarC114, border114, jVar3, content, c0VarR, (i211111112 & 234881024) | i211111111 | (29360128 & i211111112), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                style2 = style;
                if (c0VarR.D(style2)) {
                }
                i12 |= i20;
            } else {
                style2 = style;
            }
            i12 |= i20;
        } else {
            style2 = style;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z11111111115 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11111111115;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z11111111116 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11111111116;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z11111111117 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11111111117;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z11111111118 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11111111118;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape115 = style3.getShape();
                    e4 e4Var115 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU115 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU115 = style3.m605getContentColor0d7_KjU();
                    int i211111113 = e4.f27242b;
                    d4 d4VarB115 = e4Var115.b(jM604getBackgroundColor0d7_KjU115, jM605getContentColor0d7_KjU115, 0L, 0L, c0VarR, i211111113 << 12, 12);
                    f4 f4VarC115 = e4Var115.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211111113 << 18, 62);
                    a1 border115 = style3.getBorder();
                    int i211111114 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i211111115 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape115, d4VarB115, f4VarC115, border115, jVar3, content, c0VarR, (i211111115 & 234881024) | i211111114 | (29360128 & i211111115), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) == 0) {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z11111111119 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z11111111119;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111111111110 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111111110;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                            i12 &= -7169;
                        } else {
                            styleM597defaultStyleqUnfpCA = style2;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-2091443309);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            boolean z111111111111 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111111111;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            boolean z111111111112 = z12;
                            i18 = i12;
                            a0Var4 = a0Var3;
                            z13 = z111111111112;
                            style3 = styleM597defaultStyleqUnfpCA;
                            jVar3 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    q3 shape116 = style3.getShape();
                    e4 e4Var116 = e4.f27241a;
                    long jM604getBackgroundColor0d7_KjU116 = style3.m604getBackgroundColor0d7_KjU();
                    long jM605getContentColor0d7_KjU116 = style3.m605getContentColor0d7_KjU();
                    int i211111116 = e4.f27242b;
                    d4 d4VarB116 = e4Var116.b(jM604getBackgroundColor0d7_KjU116, jM605getContentColor0d7_KjU116, 0L, 0L, c0VarR, i211111116 << 12, 12);
                    f4 f4VarC116 = e4Var116.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211111116 << 18, 62);
                    a1 border116 = style3.getBorder();
                    int i211111117 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                    int i211111118 = i18 << 9;
                    m4.h(onClick, a0Var4, z13, shape116, d4VarB116, f4VarC116, border116, jVar3, content, c0VarR, (i211111118 & 234881024) | i211111117 | (29360128 & i211111118), 0);
                    z14 = z13;
                    jVar4 = jVar3;
                    style4 = style3;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i17;
            if ((374491 & i12) != 74898) {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z111111111113 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111113;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z111111111114 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111114;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z111111111115 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111115;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z111111111116 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111116;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape117 = style3.getShape();
                e4 e4Var117 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU117 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU117 = style3.m605getContentColor0d7_KjU();
                int i211111119 = e4.f27242b;
                d4 d4VarB117 = e4Var117.b(jM604getBackgroundColor0d7_KjU117, jM605getContentColor0d7_KjU117, 0L, 0L, c0VarR, i211111119 << 12, 12);
                f4 f4VarC117 = e4Var117.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i211111119 << 18, 62);
                a1 border117 = style3.getBorder();
                int i2111111110 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i2111111111 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape117, d4VarB117, f4VarC117, border117, jVar3, content, c0VarR, (i2111111111 & 234881024) | i2111111110 | (29360128 & i2111111111), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            } else {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z111111111117 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111117;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z111111111118 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111118;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z111111111119 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z111111111119;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111111111110 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111110;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape118 = style3.getShape();
                e4 e4Var118 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU118 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU118 = style3.m605getContentColor0d7_KjU();
                int i2111111112 = e4.f27242b;
                d4 d4VarB118 = e4Var118.b(jM604getBackgroundColor0d7_KjU118, jM605getContentColor0d7_KjU118, 0L, 0L, c0VarR, i2111111112 << 12, 12);
                f4 f4VarC118 = e4Var118.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2111111112 << 18, 62);
                a1 border118 = style3.getBorder();
                int i2111111113 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i2111111114 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape118, d4VarB118, f4VarC118, border118, jVar3, content, c0VarR, (i2111111114 & 234881024) | i2111111113 | (29360128 & i2111111114), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c0VarR.k0(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) != 74898) {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111111111111 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111111;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111111111112 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111112;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111111111113 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111113;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111111111114 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111114;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape119 = style3.getShape();
                e4 e4Var119 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU119 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU119 = style3.m605getContentColor0d7_KjU();
                int i2111111115 = e4.f27242b;
                d4 d4VarB119 = e4Var119.b(jM604getBackgroundColor0d7_KjU119, jM605getContentColor0d7_KjU119, 0L, 0L, c0VarR, i2111111115 << 12, 12);
                f4 f4VarC119 = e4Var119.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2111111115 << 18, 62);
                a1 border119 = style3.getBorder();
                int i2111111116 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i2111111117 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape119, d4VarB119, f4VarC119, border119, jVar3, content, c0VarR, (i2111111117 & 234881024) | i2111111116 | (29360128 & i2111111117), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            } else {
                c0VarR.l0();
                if ((i10 & 1) == 0) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111111111115 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111115;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111111111116 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111116;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        styleM597defaultStyleqUnfpCA = style2;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-2091443309);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        boolean z1111111111117 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111117;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        boolean z1111111111118 = z12;
                        i18 = i12;
                        a0Var4 = a0Var3;
                        z13 = z1111111111118;
                        style3 = styleM597defaultStyleqUnfpCA;
                        jVar3 = jVar2;
                    }
                }
                c0VarR.Z();
                q3 shape1110 = style3.getShape();
                e4 e4Var1110 = e4.f27241a;
                long jM604getBackgroundColor0d7_KjU1110 = style3.m604getBackgroundColor0d7_KjU();
                long jM605getContentColor0d7_KjU1110 = style3.m605getContentColor0d7_KjU();
                int i2111111118 = e4.f27242b;
                d4 d4VarB1110 = e4Var1110.b(jM604getBackgroundColor0d7_KjU1110, jM605getContentColor0d7_KjU1110, 0L, 0L, c0VarR, i2111111118 << 12, 12);
                f4 f4VarC1110 = e4Var1110.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i2111111118 << 18, 62);
                a1 border1110 = style3.getBorder();
                int i2111111119 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
                int i21111111110 = i18 << 9;
                m4.h(onClick, a0Var4, z13, shape1110, d4VarB1110, f4VarC1110, border1110, jVar3, content, c0VarR, (i21111111110 & 234881024) | i2111111119 | (29360128 & i21111111110), 0);
                z14 = z13;
                jVar4 = jVar3;
                style4 = style3;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i17;
        if ((374491 & i12) != 74898) {
            c0VarR.l0();
            if ((i10 & 1) == 0) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM597defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c0VarR.E(-2091443309);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    boolean z1111111111119 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z1111111111119;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    boolean z11111111111110 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111110;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = jVar2;
                }
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM597defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c0VarR.E(-2091443309);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    boolean z11111111111111 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111111;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    boolean z11111111111112 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111112;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = jVar2;
                }
            }
            c0VarR.Z();
            q3 shape1111 = style3.getShape();
            e4 e4Var1111 = e4.f27241a;
            long jM604getBackgroundColor0d7_KjU1111 = style3.m604getBackgroundColor0d7_KjU();
            long jM605getContentColor0d7_KjU1111 = style3.m605getContentColor0d7_KjU();
            int i21111111111 = e4.f27242b;
            d4 d4VarB1111 = e4Var1111.b(jM604getBackgroundColor0d7_KjU1111, jM605getContentColor0d7_KjU1111, 0L, 0L, c0VarR, i21111111111 << 12, 12);
            f4 f4VarC1111 = e4Var1111.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21111111111 << 18, 62);
            a1 border1111 = style3.getBorder();
            int i21111111112 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
            int i21111111113 = i18 << 9;
            m4.h(onClick, a0Var4, z13, shape1111, d4VarB1111, f4VarC1111, border1111, jVar3, content, c0VarR, (i21111111113 & 234881024) | i21111111112 | (29360128 & i21111111113), 0);
            z14 = z13;
            jVar4 = jVar3;
            style4 = style3;
            a0Var5 = a0Var4;
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM597defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c0VarR.E(-2091443309);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    boolean z11111111111113 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111113;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    boolean z11111111111114 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111114;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = jVar2;
                }
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    styleM597defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0VarR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    styleM597defaultStyleqUnfpCA = style2;
                }
                if (i15 != 0) {
                    c0VarR.E(-2091443309);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    boolean z11111111111115 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111115;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    boolean z11111111111116 = z12;
                    i18 = i12;
                    a0Var4 = a0Var3;
                    z13 = z11111111111116;
                    style3 = styleM597defaultStyleqUnfpCA;
                    jVar3 = jVar2;
                }
            }
            c0VarR.Z();
            q3 shape1112 = style3.getShape();
            e4 e4Var1112 = e4.f27241a;
            long jM604getBackgroundColor0d7_KjU1112 = style3.m604getBackgroundColor0d7_KjU();
            long jM605getContentColor0d7_KjU1112 = style3.m605getContentColor0d7_KjU();
            int i21111111114 = e4.f27242b;
            d4 d4VarB1112 = e4Var1112.b(jM604getBackgroundColor0d7_KjU1112, jM605getContentColor0d7_KjU1112, 0L, 0L, c0VarR, i21111111114 << 12, 12);
            f4 f4VarC1112 = e4Var1112.c(style3.m606getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, i21111111114 << 18, 62);
            a1 border1112 = style3.getBorder();
            int i21111111115 = i18 & androidx.media3.exoplayer.analytics.b.f62802b0;
            int i21111111116 = i18 << 9;
            m4.h(onClick, a0Var4, z13, shape1112, d4VarB1112, f4VarC1112, border1112, jVar3, content, c0VarR, (i21111111116 & 234881024) | i21111111115 | (29360128 & i21111111116), 0);
            z14 = z13;
            jVar4 = jVar3;
            style4 = style3;
            a0Var5 = a0Var4;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomCardKt.IntercomCard$lambda$2(onClick, a0Var5, z14, style4, jVar4, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
