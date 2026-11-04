package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
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
@SourceDebugExtension({"SMAP\nTicketHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketHeader.kt\nio/intercom/android/sdk/m5/components/TicketHeaderKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n99#2:104\n96#2,9:105\n106#2:146\n80#3,6:114\n87#3,3:129\n90#3,2:138\n94#3:145\n391#4,9:120\n400#4:140\n401#4,2:143\n4360#5,6:132\n113#6:141\n113#6:142\n*S KotlinDebug\n*F\n+ 1 TicketHeader.kt\nio/intercom/android/sdk/m5/components/TicketHeaderKt\n*L\n41#1:104\n41#1:105,9\n41#1:146\n41#1:114,6\n41#1:129,3\n41#1:138,2\n41#1:145\n41#1:120,9\n41#1:140\n41#1:143,2\n41#1:132,6\n46#1:141\n51#1:142\n*E\n"})
public final class TicketHeaderKt {
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SimpleTicketHeader(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String text, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.text.font.v0 v0Var2;
        int i13;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.text.font.v0 v0VarM;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.text.font.v0 v0Var3;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-921635597);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
            i12 |= c0VarR.D(text) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                v0Var2 = v0Var;
                i12 |= c0VarR.D(v0Var2) ? 256 : 128;
            }
            i13 = i12;
            if ((i13 & 731) == 146 || !c0VarR.d()) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    v0VarM = androidx.compose.ui.text.font.v0.f41742b.m();
                } else {
                    v0VarM = v0Var2;
                }
                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0 a0VarH = i6.H(a0Var3, null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                y5 y5Var = y5.f16577a;
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarW = i6.w(aVar2, androidx.compose.ui.unit.h.r(16));
                androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                ni.o(bVarC, null, a0VarW, intercomTheme.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), c0VarR, 440, 0);
                l6.a(i6.B(aVar2, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
                c0Var2 = c0VarR;
                q50.t(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme.getTypography(c0VarR, i16).getType04(), intercomTheme.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), 0L, v0VarM, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), c0Var2, (i13 >> 3) & 14, 24960, 110590);
                c0Var2.o();
                v0Var3 = v0VarM;
                a0Var4 = a0Var3;
            } else {
                c0VarR.u();
                a0Var4 = a0Var2;
                v0Var3 = v0Var2;
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketHeaderKt.SimpleTicketHeader$lambda$2(a0Var4, text, v0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        v0Var2 = v0Var;
        i13 = i12;
        if ((i13 & 731) == 146) {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i15 != 0) {
                v0VarM = androidx.compose.ui.text.font.v0.f41742b.m();
            } else {
                v0VarM = v0Var2;
            }
            androidx.compose.ui.e.c cVarQ2 = androidx.compose.ui.e.f37317a.q();
            androidx.compose.ui.a0 a0VarH2 = i6.H(a0Var3, null, false, 3, null);
            androidx.compose.ui.layout.a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ2, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarH2);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            function0A = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE2, aVar3.e());
            y7.n(c0VarD, b1VarK2, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar3.f());
            y5 y5Var2 = y5.f16577a;
            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarW2 = i6.w(aVar4, androidx.compose.ui.unit.h.r(16));
            androidx.compose.ui.graphics.painter.b bVarC2 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            ni.o(bVarC2, null, a0VarW2, intercomTheme2.getColors(c0VarR, i17).m699getDescriptionText0d7_KjU(), c0VarR, 440, 0);
            l6.a(i6.B(aVar4, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            c0Var2 = c0VarR;
            q50.t(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme2.getTypography(c0VarR, i17).getType04(), intercomTheme2.getColors(c0VarR, i17).m699getDescriptionText0d7_KjU(), 0L, v0VarM, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), c0Var2, (i13 >> 3) & 14, 24960, 110590);
            c0Var2.o();
            v0Var3 = v0VarM;
            a0Var4 = a0Var3;
        } else {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i15 != 0) {
                v0VarM = androidx.compose.ui.text.font.v0.f41742b.m();
            } else {
                v0VarM = v0Var2;
            }
            androidx.compose.ui.e.c cVarQ3 = androidx.compose.ui.e.f37317a.q();
            androidx.compose.ui.a0 a0VarH3 = i6.H(a0Var3, null, false, 3, null);
            androidx.compose.ui.layout.a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ3, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarH3);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            function0A = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE3, aVar5.e());
            y7.n(c0VarD, b1VarK3, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar5.f());
            y5 y5Var3 = y5.f16577a;
            androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarW3 = i6.w(aVar6, androidx.compose.ui.unit.h.r(16));
            androidx.compose.ui.graphics.painter.b bVarC3 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            ni.o(bVarC3, null, a0VarW3, intercomTheme3.getColors(c0VarR, i18).m699getDescriptionText0d7_KjU(), c0VarR, 440, 0);
            l6.a(i6.B(aVar6, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            c0Var2 = c0VarR;
            q50.t(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme3.getTypography(c0VarR, i18).getType04(), intercomTheme3.getColors(c0VarR, i18).m699getDescriptionText0d7_KjU(), 0L, v0VarM, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), c0Var2, (i13 >> 3) & 14, 24960, 110590);
            c0Var2.o();
            v0Var3 = v0VarM;
            a0Var4 = a0Var3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketHeaderKt.SimpleTicketHeader$lambda$2(a0Var4, text, v0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleTicketHeader$lambda$2(androidx.compose.ui.a0 a0Var, String text, androidx.compose.ui.text.font.v0 v0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        SimpleTicketHeader(a0Var, text, v0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketHeader(@Nullable final androidx.compose.ui.a0 a0Var, @NotNull final TicketStatusHeaderArgs args, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(args, "args");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-254158349);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (c0VarR.D(a0Var)) {
                i13 = 4;
                int i15 = 0 | 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(args) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i14 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var2 = a0Var;
            int i16 = 3 | 0;
            SimpleTicketHeader(a0Var2, args.getTitle(), args.getFontWeight(), c0VarR, i12 & 14, 0);
            a0Var = a0Var2;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.h3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketHeaderKt.TicketHeader$lambda$0(a0Var, args, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketHeader$lambda$0(androidx.compose.ui.a0 a0Var, TicketStatusHeaderArgs args, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(args, "$args");
        TicketHeader(a0Var, args, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(uiMode = 16), @d1.c(uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TicketHeaderLongTextPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1234985657);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs("Very long long long long title", null, 2, null);
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(337942641, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderLongTextPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.a0 a0VarH = i6.H(androidx.compose.ui.a0.E, null, false, 3, null);
                    final TicketStatusHeaderArgs ticketStatusHeaderArgs2 = ticketStatusHeaderArgs;
                    u10.c(a0VarH, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-177489460, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderLongTextPreview.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                            if ((i12 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, c0Var3, 0, 1);
                        }
                    }, c0Var2, 54), c0Var2, 12582918, okhttp3.internal.ws.g.f334652s);
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.f3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketHeaderKt.TicketHeaderLongTextPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketHeaderLongTextPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketHeaderLongTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(uiMode = 16), @d1.c(uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TicketHeaderPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1418431454);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs("Bug", null, 2, null);
            int i11 = 3 >> 0;
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(10965256, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i12) {
                    if ((i12 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.a0 a0VarH = i6.H(androidx.compose.ui.a0.E, null, false, 3, null);
                    final TicketStatusHeaderArgs ticketStatusHeaderArgs2 = ticketStatusHeaderArgs;
                    u10.c(a0VarH, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(34012515, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderPreview.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i13) {
                            if ((i13 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, c0Var3, 0, 1);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 12582918, okhttp3.internal.ws.g.f334652s);
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketHeaderKt.TicketHeaderPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketHeaderPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketHeaderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
