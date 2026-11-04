package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.core.w1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.s4;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.t0;
import androidx.compose.foundation.t1;
import androidx.compose.material3.j2;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.xg;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJumpToBottom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumpToBottom.kt\nio/intercom/android/sdk/ui/component/JumpToBottomKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,137:1\n113#2:138\n*S KotlinDebug\n*F\n+ 1 JumpToBottom.kt\nio/intercom/android/sdk/ui/component/JumpToBottomKt\n*L\n34#1:138\n*E\n"})
public final class JumpToBottomKt {
    private static final float JumpBottomPadding = androidx.compose.ui.unit.h.r(12);

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

    /* JADX WARN: Code duplicated, block: B:101:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0106  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: JumpToBottom-kNRdK3w, reason: not valid java name */
    public static final void m609JumpToBottomkNRdK3w(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable String str, long j12, long j13, @NotNull final Function0<Unit> onClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        long jM690getBackground0d7_KjU;
        long chevronColor;
        String str2;
        long jM684getAction0d7_KjU;
        long jM708getOnAction0d7_KjU;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        String str3;
        final long j14;
        final long j15;
        final String str4;
        final androidx.compose.ui.a0 a0Var3;
        final long j16;
        final long j17;
        s5 s5VarT;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1700007899);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            if ((i11 & 2) == 0) {
                jM690getBackground0d7_KjU = j10;
                int i17 = c0VarR.L(jM690getBackground0d7_KjU) ? 32 : 16;
                i12 |= i17;
            } else {
                jM690getBackground0d7_KjU = j10;
            }
            i12 |= i17;
        } else {
            jM690getBackground0d7_KjU = j10;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                chevronColor = j11;
                int i18 = c0VarR.L(chevronColor) ? 256 : 128;
                i12 |= i18;
            } else {
                chevronColor = j11;
            }
            i12 |= i18;
        } else {
            chevronColor = j11;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 7168) == 0) {
                str2 = str;
                i12 |= c0VarR.D(str2) ? 2048 : 1024;
            }
            if ((57344 & i10) == 0) {
                jM684getAction0d7_KjU = j12;
                if ((i11 & 16) == 0 || !c0VarR.L(jM684getAction0d7_KjU)) {
                    i15 = 8192;
                } else {
                    i15 = 16384;
                }
                i12 |= i15;
            } else {
                jM684getAction0d7_KjU = j12;
            }
            if ((458752 & i10) == 0) {
                jM708getOnAction0d7_KjU = j13;
                if ((i11 & 32) == 0 || !c0VarR.L(jM708getOnAction0d7_KjU)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i12 |= i14;
            } else {
                jM708getOnAction0d7_KjU = j13;
            }
            if ((i11 & 64) != 0) {
                if ((3670016 & i10) == 0) {
                    if (c0VarR.k0(onClick)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                }
                if ((2995931 & i12) == 599186 || !c0VarR.d()) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var;
                        }
                        if ((i11 & 2) != 0) {
                            jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            chevronColor = getChevronColor(c0VarR, 0);
                            i12 &= -897;
                        }
                        if (i19 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if ((i11 & 16) != 0) {
                            jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                            i12 &= -458753;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        a0Var2 = a0Var;
                        str3 = str2;
                    }
                    c0VarR.Z();
                    final long j18 = jM708getOnAction0d7_KjU;
                    final String str5 = str3;
                    final long j19 = jM684getAction0d7_KjU;
                    long j20 = jM708getOnAction0d7_KjU;
                    androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var2, c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                            Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                            if ((i20 & 81) == 16 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            String str6 = str5;
                            if (str6 == null) {
                                return;
                            }
                            JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str6, j19, j18, c0Var2, 6, 0);
                        }
                    }, c0VarR, 54);
                    final long j21 = jM690getBackground0d7_KjU;
                    final long j22 = chevronColor;
                    j2.h(cVarE, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var2, c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                            Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                            if ((i20 & 81) == 16 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            c0Var2.E(-1483768023);
                            Object objI0 = c0Var2.i0();
                            Object obj = objI0;
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                w1 w1Var = new w1(Boolean.FALSE);
                                w1Var.f(Boolean.TRUE);
                                c0Var2.Y(w1Var);
                                obj = w1Var;
                            }
                            c0Var2.A();
                            androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                            final Function0<Unit> function0 = onClick;
                            final long j23 = j21;
                            final long j24 = j22;
                            boolean z10 = true | false;
                            androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                                    invoke(lVar, c0Var3, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                    float f10 = 48;
                                    androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                                    Function0<Unit> function1 = function0;
                                    long j25 = j23;
                                    final long j26 = j24;
                                    a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                                    b1 b1VarK = c0Var3.k();
                                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                    if (c0Var3.S() == null) {
                                        androidx.compose.runtime.v.r();
                                    }
                                    c0Var3.q();
                                    if (c0Var3.P()) {
                                        c0Var3.q0(function0A);
                                    } else {
                                        c0Var3.l();
                                    }
                                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                                    y7.n(c0VarD, a1VarK, aVar2.e());
                                    y7.n(c0VarD, b1VarK, aVar2.g());
                                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                        c0VarD.Y(Integer.valueOf(iHashCode));
                                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                    }
                                    y7.n(c0VarD, a0VarN, aVar2.f());
                                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                    xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j25, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                                ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j26, c0Var4, 440, 0);
                                            }
                                        }
                                    }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                                    c0Var3.o();
                                }
                            }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                        }
                    }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
                    j14 = jM690getBackground0d7_KjU;
                    j15 = chevronColor;
                    str4 = str3;
                    a0Var3 = a0Var2;
                    j16 = j20;
                } else {
                    c0VarR.u();
                    long j23 = chevronColor;
                    str4 = str2;
                    j16 = jM708getOnAction0d7_KjU;
                    j14 = jM690getBackground0d7_KjU;
                    j15 = j23;
                    a0Var3 = a0Var;
                }
                j17 = jM684getAction0d7_KjU;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.y
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(a0Var3, j14, j15, str4, j17, j16, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 = 1572864;
            i12 |= i13;
            if ((2995931 & i12) == 599186) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c0VarR.Z();
                final long j110 = jM708getOnAction0d7_KjU;
                final String str6 = str3;
                final long j111 = jM684getAction0d7_KjU;
                long j24 = jM708getOnAction0d7_KjU;
                androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        String str7 = str6;
                        if (str7 == null) {
                            return;
                        }
                        JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str7, j111, j110, c0Var2, 6, 0);
                    }
                }, c0VarR, 54);
                final long j25 = jM690getBackground0d7_KjU;
                final long j26 = chevronColor;
                j2.h(cVarE2, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        c0Var2.E(-1483768023);
                        Object objI0 = c0Var2.i0();
                        Object obj = objI0;
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            w1 w1Var = new w1(Boolean.FALSE);
                            w1Var.f(Boolean.TRUE);
                            c0Var2.Y(w1Var);
                            obj = w1Var;
                        }
                        c0Var2.A();
                        androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                        final Function0<Unit> function0 = onClick;
                        final long j27 = j25;
                        final long j28 = j26;
                        boolean z10 = true | false;
                        androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(lVar, c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                float f10 = 48;
                                androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                                Function0<Unit> function1 = function0;
                                long j29 = j27;
                                final long j210 = j28;
                                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                                b1 b1VarK = c0Var3.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                if (c0Var3.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var3.q();
                                if (c0Var3.P()) {
                                    c0Var3.q0(function0A);
                                } else {
                                    c0Var3.l();
                                }
                                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                                y7.n(c0VarD, a1VarK, aVar2.e());
                                y7.n(c0VarD, b1VarK, aVar2.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar2.f());
                                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j29, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                            ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j210, c0Var4, 440, 0);
                                        }
                                    }
                                }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                                c0Var3.o();
                            }
                        }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                    }
                }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
                j14 = jM690getBackground0d7_KjU;
                j15 = chevronColor;
                str4 = str3;
                a0Var3 = a0Var2;
                j16 = j24;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c0VarR.Z();
                final long j112 = jM708getOnAction0d7_KjU;
                final String str7 = str3;
                final long j113 = jM684getAction0d7_KjU;
                long j27 = jM708getOnAction0d7_KjU;
                androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        String str8 = str7;
                        if (str8 == null) {
                            return;
                        }
                        JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str8, j113, j112, c0Var2, 6, 0);
                    }
                }, c0VarR, 54);
                final long j28 = jM690getBackground0d7_KjU;
                final long j29 = chevronColor;
                j2.h(cVarE3, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        c0Var2.E(-1483768023);
                        Object objI0 = c0Var2.i0();
                        Object obj = objI0;
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            w1 w1Var = new w1(Boolean.FALSE);
                            w1Var.f(Boolean.TRUE);
                            c0Var2.Y(w1Var);
                            obj = w1Var;
                        }
                        c0Var2.A();
                        androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                        final Function0<Unit> function0 = onClick;
                        final long j210 = j28;
                        final long j211 = j29;
                        boolean z10 = true | false;
                        androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(lVar, c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                float f10 = 48;
                                androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                                Function0<Unit> function1 = function0;
                                long j212 = j210;
                                final long j213 = j211;
                                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                                b1 b1VarK = c0Var3.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                if (c0Var3.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var3.q();
                                if (c0Var3.P()) {
                                    c0Var3.q0(function0A);
                                } else {
                                    c0Var3.l();
                                }
                                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                                y7.n(c0VarD, a1VarK, aVar2.e());
                                y7.n(c0VarD, b1VarK, aVar2.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar2.f());
                                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j212, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                            ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j213, c0Var4, 440, 0);
                                        }
                                    }
                                }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                                c0Var3.o();
                            }
                        }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                    }
                }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
                j14 = jM690getBackground0d7_KjU;
                j15 = chevronColor;
                str4 = str3;
                a0Var3 = a0Var2;
                j16 = j27;
            }
            j17 = jM684getAction0d7_KjU;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(a0Var3, j14, j15, str4, j17, j16, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        str2 = str;
        if ((57344 & i10) == 0) {
            jM684getAction0d7_KjU = j12;
            if ((i11 & 16) == 0) {
                i15 = 8192;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        } else {
            jM684getAction0d7_KjU = j12;
        }
        if ((458752 & i10) == 0) {
            jM708getOnAction0d7_KjU = j13;
            if ((i11 & 32) == 0) {
                i14 = 65536;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        } else {
            jM708getOnAction0d7_KjU = j13;
        }
        if ((i11 & 64) != 0) {
            if ((3670016 & i10) == 0) {
                if (c0VarR.k0(onClick)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
            }
            if ((2995931 & i12) == 599186) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c0VarR.Z();
                final long j114 = jM708getOnAction0d7_KjU;
                final String str8 = str3;
                final long j115 = jM684getAction0d7_KjU;
                long j210 = jM708getOnAction0d7_KjU;
                androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        String str9 = str8;
                        if (str9 == null) {
                            return;
                        }
                        JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str9, j115, j114, c0Var2, 6, 0);
                    }
                }, c0VarR, 54);
                final long j211 = jM690getBackground0d7_KjU;
                final long j212 = chevronColor;
                j2.h(cVarE4, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        c0Var2.E(-1483768023);
                        Object objI0 = c0Var2.i0();
                        Object obj = objI0;
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            w1 w1Var = new w1(Boolean.FALSE);
                            w1Var.f(Boolean.TRUE);
                            c0Var2.Y(w1Var);
                            obj = w1Var;
                        }
                        c0Var2.A();
                        androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                        final Function0<Unit> function0 = onClick;
                        final long j213 = j211;
                        final long j214 = j212;
                        boolean z10 = true | false;
                        androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(lVar, c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                float f10 = 48;
                                androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                                Function0<Unit> function1 = function0;
                                long j215 = j213;
                                final long j216 = j214;
                                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                                b1 b1VarK = c0Var3.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                if (c0Var3.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var3.q();
                                if (c0Var3.P()) {
                                    c0Var3.q0(function0A);
                                } else {
                                    c0Var3.l();
                                }
                                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                                y7.n(c0VarD, a1VarK, aVar2.e());
                                y7.n(c0VarD, b1VarK, aVar2.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar2.f());
                                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j215, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                            ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j216, c0Var4, 440, 0);
                                        }
                                    }
                                }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                                c0Var3.o();
                            }
                        }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                    }
                }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
                j14 = jM690getBackground0d7_KjU;
                j15 = chevronColor;
                str4 = str3;
                a0Var3 = a0Var2;
                j16 = j210;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c0VarR, 0);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i11 & 16) != 0) {
                        jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c0VarR.Z();
                final long j116 = jM708getOnAction0d7_KjU;
                final String str9 = str3;
                final long j117 = jM684getAction0d7_KjU;
                long j213 = jM708getOnAction0d7_KjU;
                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        String str10 = str9;
                        if (str10 == null) {
                            return;
                        }
                        JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str10, j117, j116, c0Var2, 6, 0);
                    }
                }, c0VarR, 54);
                final long j214 = jM690getBackground0d7_KjU;
                final long j215 = chevronColor;
                j2.h(cVarE5, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var2, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i20 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        c0Var2.E(-1483768023);
                        Object objI0 = c0Var2.i0();
                        Object obj = objI0;
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            w1 w1Var = new w1(Boolean.FALSE);
                            w1Var.f(Boolean.TRUE);
                            c0Var2.Y(w1Var);
                            obj = w1Var;
                        }
                        c0Var2.A();
                        androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                        final Function0<Unit> function0 = onClick;
                        final long j216 = j214;
                        final long j217 = j215;
                        boolean z10 = true | false;
                        androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(lVar, c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                float f10 = 48;
                                androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                                Function0<Unit> function1 = function0;
                                long j218 = j216;
                                final long j219 = j217;
                                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                                b1 b1VarK = c0Var3.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                if (c0Var3.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var3.q();
                                if (c0Var3.P()) {
                                    c0Var3.q0(function0A);
                                } else {
                                    c0Var3.l();
                                }
                                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                                y7.n(c0VarD, a1VarK, aVar2.e());
                                y7.n(c0VarD, b1VarK, aVar2.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar2.f());
                                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j218, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                            ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j219, c0Var4, 440, 0);
                                        }
                                    }
                                }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                                c0Var3.o();
                            }
                        }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                    }
                }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
                j14 = jM690getBackground0d7_KjU;
                j15 = chevronColor;
                str4 = str3;
                a0Var3 = a0Var2;
                j16 = j213;
            }
            j17 = jM684getAction0d7_KjU;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(a0Var3, j14, j15, str4, j17, j16, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 = 1572864;
        i12 |= i13;
        if ((2995931 & i12) == 599186) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var;
                }
                if ((i11 & 2) != 0) {
                    jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c0VarR, 0);
                    i12 &= -897;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i11 & 16) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            } else {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var;
                }
                if ((i11 & 2) != 0) {
                    jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c0VarR, 0);
                    i12 &= -897;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i11 & 16) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            }
            c0VarR.Z();
            final long j118 = jM708getOnAction0d7_KjU;
            final String str10 = str3;
            final long j119 = jM684getAction0d7_KjU;
            long j216 = jM708getOnAction0d7_KjU;
            androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var2, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i20 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    String str11 = str10;
                    if (str11 == null) {
                        return;
                    }
                    JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str11, j119, j118, c0Var2, 6, 0);
                }
            }, c0VarR, 54);
            final long j217 = jM690getBackground0d7_KjU;
            final long j218 = chevronColor;
            j2.h(cVarE6, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var2, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i20 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    c0Var2.E(-1483768023);
                    Object objI0 = c0Var2.i0();
                    Object obj = objI0;
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        w1 w1Var = new w1(Boolean.FALSE);
                        w1Var.f(Boolean.TRUE);
                        c0Var2.Y(w1Var);
                        obj = w1Var;
                    }
                    c0Var2.A();
                    androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                    final Function0<Unit> function0 = onClick;
                    final long j219 = j217;
                    final long j2110 = j218;
                    boolean z10 = true | false;
                    androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(lVar, c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                            float f10 = 48;
                            androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                            Function0<Unit> function1 = function0;
                            long j2111 = j219;
                            final long j2112 = j2110;
                            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                            b1 b1VarK = c0Var3.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                            if (c0Var3.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var3.q();
                            if (c0Var3.P()) {
                                c0Var3.q0(function0A);
                            } else {
                                c0Var3.l();
                            }
                            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                            y7.n(c0VarD, a1VarK, aVar2.e());
                            y7.n(c0VarD, b1VarK, aVar2.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar2.f());
                            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j2111, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                        ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j2112, c0Var4, 440, 0);
                                    }
                                }
                            }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                            c0Var3.o();
                        }
                    }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                }
            }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
            j14 = jM690getBackground0d7_KjU;
            j15 = chevronColor;
            str4 = str3;
            a0Var3 = a0Var2;
            j16 = j216;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var;
                }
                if ((i11 & 2) != 0) {
                    jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c0VarR, 0);
                    i12 &= -897;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i11 & 16) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            } else {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var;
                }
                if ((i11 & 2) != 0) {
                    jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m690getBackground0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c0VarR, 0);
                    i12 &= -897;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i11 & 16) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            }
            c0VarR.Z();
            final long j1110 = jM708getOnAction0d7_KjU;
            final String str11 = str3;
            final long j1111 = jM684getAction0d7_KjU;
            long j219 = jM708getOnAction0d7_KjU;
            androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(-1557616541, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var2, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i20 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    String str12 = str11;
                    if (str12 == null) {
                        return;
                    }
                    JumpToBottomKt.m610UnreadBadgeeaDK9VM(s4.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str12, j1111, j1110, c0Var2, 6, 0);
                }
            }, c0VarR, 54);
            final long j2110 = jM690getBackground0d7_KjU;
            final long j2111 = chevronColor;
            j2.h(cVarE7, a0Var2, androidx.compose.runtime.internal.w.e(1814183329, true, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var2, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var2, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.c0 BadgedBox, androidx.compose.runtime.c0 c0Var2, int i20) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i20 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    c0Var2.E(-1483768023);
                    Object objI0 = c0Var2.i0();
                    Object obj = objI0;
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        w1 w1Var = new w1(Boolean.FALSE);
                        w1Var.f(Boolean.TRUE);
                        c0Var2.Y(w1Var);
                        obj = w1Var;
                    }
                    c0Var2.A();
                    androidx.compose.animation.d0 d0VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0Var2.W(q1.m())).S7(JumpToBottomKt.getJumpBottomPadding()));
                    final Function0<Unit> function0 = onClick;
                    final long j2112 = j2110;
                    final long j2113 = j2111;
                    boolean z10 = true | false;
                    androidx.compose.animation.k.d((w1) obj, null, d0VarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.w.e(600504953, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(lVar, c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var3, int i21) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                            float f10 = 48;
                            androidx.compose.ui.a0 a0VarI = t0.i(i6.w(d5.r(aVar, JumpToBottomKt.getJumpBottomPadding()), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var3, 6).m701getDivider0d7_KjU(), androidx.compose.foundation.shape.o.c(50));
                            Function0<Unit> function1 = function0;
                            long j2114 = j2112;
                            final long j2115 = j2113;
                            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                            b1 b1VarK = c0Var3.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarI);
                            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                            if (c0Var3.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var3.q();
                            if (c0Var3.P()) {
                                c0Var3.q0(function0A);
                            } else {
                                c0Var3.l();
                            }
                            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                            y7.n(c0VarD, a1VarK, aVar2.e());
                            y7.n(c0VarD, b1VarK, aVar2.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar2.f());
                            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            xg.o(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.o.c(50), j2114, 0L, null, null, androidx.compose.runtime.internal.w.e(2122957953, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
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
                                        ni.o(u0.e.c(R.drawable.intercom_ic_chevron_down, c0Var4, 0), "Jump to bottom", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j2115, c0Var4, 440, 0);
                                    }
                                }
                            }, c0Var3, 54), c0Var3, 12582960, com.planner5d.library.engine.input.f.b.B);
                            c0Var3.o();
                        }
                    }, c0Var2, 54), c0Var2, w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
                }
            }, c0VarR, 54), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 0);
            j14 = jM690getBackground0d7_KjU;
            j15 = chevronColor;
            str4 = str3;
            a0Var3 = a0Var2;
            j16 = j219;
        }
        j17 = jM684getAction0d7_KjU;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(a0Var3, j14, j15, str4, j17, j16, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void JumpToBottomPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1260816059);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$JumpToBottomKt.INSTANCE.m581getLambda1$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JumpToBottomKt.JumpToBottomPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JumpToBottomPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        JumpToBottomPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JumpToBottom_kNRdK3w$lambda$0(androidx.compose.ui.a0 a0Var, long j10, long j11, String str, long j12, long j13, Function0 onClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m609JumpToBottomkNRdK3w(a0Var, j10, j11, str, j12, j13, onClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: UnreadBadge-eaDK9VM, reason: not valid java name */
    public static final void m610UnreadBadgeeaDK9VM(androidx.compose.ui.a0 a0Var, final String str, long j10, long j11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        long jM684getAction0d7_KjU;
        long jM708getOnAction0d7_KjU;
        long j12;
        androidx.compose.ui.a0 a0Var3;
        final long j13;
        final long j14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(885989429);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(str) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM684getAction0d7_KjU = j10;
                int i14 = c0VarR.L(jM684getAction0d7_KjU) ? 256 : 128;
                i12 |= i14;
            } else {
                jM684getAction0d7_KjU = j10;
            }
            i12 |= i14;
        } else {
            jM684getAction0d7_KjU = j10;
        }
        if ((i10 & 7168) == 0) {
            jM708getOnAction0d7_KjU = j11;
            i12 |= ((i11 & 8) == 0 && c0VarR.L(jM708getOnAction0d7_KjU)) ? 2048 : 1024;
        } else {
            jM708getOnAction0d7_KjU = j11;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            j14 = jM684getAction0d7_KjU;
            j13 = jM708getOnAction0d7_KjU;
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                androidx.compose.ui.a0 a0Var4 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
                if ((i11 & 4) != 0) {
                    jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m684getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m708getOnAction0d7_KjU();
                    i12 &= -7169;
                }
                j12 = jM708getOnAction0d7_KjU;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                j12 = jM708getOnAction0d7_KjU;
                a0Var3 = a0Var2;
            }
            final long j15 = j12;
            long j16 = jM684getAction0d7_KjU;
            c0VarR.Z();
            j2.f(a0Var3, j16, 0L, androidx.compose.runtime.internal.w.e(-480925784, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$UnreadBadge$1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(x5Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 Badge, androidx.compose.runtime.c0 c0Var2, int i15) {
                    Intrinsics.checkNotNullParameter(Badge, "$this$Badge");
                    if ((i15 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    y3 type05 = IntercomTheme.INSTANCE.getTypography(c0Var2, 6).getType05();
                    int iA = androidx.compose.ui.text.style.j.f42206b.a();
                    q50.t(str, aVar, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(type05, j15, androidx.compose.ui.unit.a0.m(12), v0.f41742b.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, iA, 0, 0L, null, null, null, 0, 0, null, 16744440, null), c0Var2, 48, 0, 131068);
                }
            }, c0VarR, 54), c0VarR, (i12 & 14) | 3072 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B), 4);
            j13 = j15;
            a0Var2 = a0Var3;
            j14 = j16;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JumpToBottomKt.UnreadBadge_eaDK9VM$lambda$2(a0Var2, str, j14, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadBadge_eaDK9VM$lambda$2(androidx.compose.ui.a0 a0Var, String badgeText, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(badgeText, "$badgeText");
        m610UnreadBadgeeaDK9VM(a0Var, badgeText, j10, j11, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final long getChevronColor(androidx.compose.runtime.c0 c0Var, int i10) {
        long jW;
        c0Var.E(179733836);
        int i11 = WhenMappings.$EnumSwitchMapping$0[IntercomColorsKt.getCurrentThemeMode().getValue().ordinal()];
        if (i11 == 1) {
            c0Var.E(-131337428);
            c0Var.A();
            jW = q0.f38131b.w();
        } else if (i11 == 2) {
            c0Var.E(-131335814);
            jW = IntercomTheme.INSTANCE.getColors(c0Var, 6).m685getActionContrastWhite0d7_KjU();
            c0Var.A();
        } else {
            if (i11 != 3) {
                c0Var.E(-131339113);
                c0Var.A();
                throw new kotlin.k0();
            }
            c0Var.E(223602727);
            int i12 = 2 | 0;
            jW = t1.a(c0Var, 0) ? q0.f38131b.w() : IntercomTheme.INSTANCE.getColors(c0Var, 6).m685getActionContrastWhite0d7_KjU();
            c0Var.A();
        }
        c0Var.A();
        return jW;
    }

    public static final float getJumpBottomPadding() {
        return JumpBottomPadding;
    }
}
