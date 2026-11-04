package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
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
@SourceDebugExtension({"SMAP\nTicketRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketRow.kt\nio/intercom/android/sdk/tickets/list/ui/TicketRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,121:1\n113#2:122\n113#2:160\n113#2:161\n113#2:199\n113#2:204\n99#3:123\n96#3,9:124\n106#3:208\n80#4,6:133\n87#4,3:148\n90#4,2:157\n80#4,6:172\n87#4,3:187\n90#4,2:196\n94#4:202\n94#4:207\n391#5,9:139\n400#5:159\n391#5,9:178\n400#5:198\n401#5,2:200\n401#5,2:205\n4360#6,6:151\n4360#6,6:190\n87#7:162\n84#7,9:163\n94#7:203\n*S KotlinDebug\n*F\n+ 1 TicketRow.kt\nio/intercom/android/sdk/tickets/list/ui/TicketRowKt\n*L\n33#1:122\n41#1:160\n52#1:161\n61#1:199\n72#1:204\n36#1:123\n36#1:124,9\n36#1:208\n36#1:133,6\n36#1:148,3\n36#1:157,2\n53#1:172,6\n53#1:187,3\n53#1:196,2\n53#1:202\n36#1:207\n36#1:139,9\n36#1:159\n53#1:178,9\n53#1:198\n53#1:200,2\n36#1:205,2\n36#1:151,6\n53#1:190,6\n53#1:162\n53#1:163,9\n53#1:203\n*E\n"})
public final class TicketRowKt {
    /* JADX WARN: Code duplicated, block: B:100:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:91:0x023f  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0395  */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketRow(@Nullable a0 a0Var, @NotNull final TicketRowData data, @Nullable g5 g5Var, boolean z10, @Nullable c0 c0Var, final int i10, final int i11) {
        a0 a0Var2;
        int i12;
        g5 g5Var2;
        boolean z11;
        a0 a0Var3;
        g5 g5VarG;
        boolean z12;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        a0.a aVar;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        v0 v0VarO;
        c0 c0Var2;
        final g5 g5Var3;
        final boolean z13;
        final a0 a0Var4;
        Intrinsics.checkNotNullParameter(data, "data");
        c0 c0VarR = c0Var.R(-1789130333);
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
            i12 |= c0VarR.D(data) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                g5Var2 = g5Var;
                int i14 = c0VarR.D(g5Var2) ? 256 : 128;
                i12 |= i14;
            } else {
                g5Var2 = g5Var;
            }
            i12 |= i14;
        } else {
            g5Var2 = g5Var;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                z11 = z10;
                int i15 = c0VarR.G(z11) ? 2048 : 1024;
                i12 |= i15;
            } else {
                z11 = z10;
            }
            i12 |= i15;
        } else {
            z11 = z10;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
            a0Var4 = a0Var2;
            g5Var3 = g5Var2;
            z13 = z11;
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                a0Var3 = i13 != 0 ? a0.E : a0Var2;
                g5VarG = (i11 & 4) != 0 ? d5.g(androidx.compose.ui.unit.h.r(20), androidx.compose.ui.unit.h.r(16)) : g5Var2;
                if ((i11 & 8) != 0) {
                    z12 = !data.isRead();
                }
                c0VarR.Z();
                a0 a0VarP = d5.p(a0Var3, g5VarG);
                androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ = aVar2.q();
                androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE = u5.e(qVar.w(), cVarQ, c0VarR, 48);
                iHashCode = Long.hashCode(v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                function0A = aVar3.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                y5 y5Var = y5.f16577a;
                aVar = a0.E;
                u10.c(i6.w(aVar, androidx.compose.ui.unit.h.r(32)), androidx.compose.foundation.shape.o.k(), q0.w(data.getStatus().m543getColor0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, w.e(1329606754, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(c0 c0Var3, int i16) {
                        if ((i16 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            ni.o(u0.e.c(data.getStatus().getIconRes(), c0Var3, 0), null, d5.r(a0.E, androidx.compose.ui.unit.h.r(8)), data.getStatus().m543getColor0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), c0VarR, 12582918, 120);
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(10)), c0VarR, 6);
                a0 a0VarQ = x5.q(y5Var, aVar, 1.0f, false, 2, null);
                a1 a1VarB = j0.b(qVar.y(), aVar2.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB, aVar3.e());
                y7.n(c0VarD2, b1VarK2, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar3.f());
                n0 n0Var = n0.f16227a;
                String title = data.getTitle();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                y3 y3VarM = y3.m(intercomTheme.getTypography(c0VarR, i16).getType04(), intercomTheme.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                if (data.isRead()) {
                    v0VarO = v0.f41742b.m();
                } else {
                    v0VarO = v0.f41742b.o();
                }
                v0 v0Var = v0VarO;
                androidx.compose.ui.text.style.v.a aVar4 = androidx.compose.ui.text.style.v.f42256b;
                a0 a0Var5 = a0Var3;
                q50.t(title, null, 0L, null, 0L, null, v0Var, null, 0L, null, null, 0L, aVar4.c(), false, 1, 0, null, y3VarM, c0VarR, 0, 24960, 110526);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
                q50.t(data.getSubTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, aVar4.c(), false, 1, 0, null, y3.m(intercomTheme.getTypography(c0VarR, i16).getType04(), intercomTheme.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, 0, 24960, 110590);
                c0Var2 = c0VarR;
                c0Var2.o();
                if (z12) {
                    c0Var2.E(-318867215);
                    ConversationItemKt.UnreadIndicator(null, c0Var2, 0, 1);
                    c0Var2.A();
                } else {
                    c0Var2.E(-318819320);
                    IntercomChevronKt.IntercomChevron(d5.v(aVar, androidx.compose.ui.unit.h.r(6), 0.0f, 0.0f, 0.0f, 14, null), c0Var2, 6, 0);
                    c0Var2.A();
                }
                c0Var2.o();
                g5Var3 = g5VarG;
                z13 = z12;
                a0Var4 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                g5VarG = g5Var2;
            }
            z12 = z11;
            c0VarR.Z();
            a0 a0VarP2 = d5.p(a0Var3, g5VarG);
            androidx.compose.ui.e.a aVar5 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ2 = aVar5.q();
            androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE2 = u5.e(qVar2.w(), cVarQ2, c0VarR, 48);
            iHashCode = Long.hashCode(v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarP2);
            androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
            function0A = aVar6.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE2, aVar6.e());
            y7.n(c0VarD, b1VarK3, aVar6.g());
            function2B = aVar6.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar6.f());
            y5 y5Var2 = y5.f16577a;
            aVar = a0.E;
            u10.c(i6.w(aVar, androidx.compose.ui.unit.h.r(32)), androidx.compose.foundation.shape.o.k(), q0.w(data.getStatus().m543getColor0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, w.e(1329606754, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var3, int i17) {
                    if ((i17 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else {
                        ni.o(u0.e.c(data.getStatus().getIconRes(), c0Var3, 0), null, d5.r(a0.E, androidx.compose.ui.unit.h.r(8)), data.getStatus().m543getColor0d7_KjU(), c0Var3, 440, 0);
                    }
                }
            }, c0VarR, 54), c0VarR, 12582918, 120);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(10)), c0VarR, 6);
            a0 a0VarQ2 = x5.q(y5Var2, aVar, 1.0f, false, 2, null);
            a1 a1VarB2 = j0.b(qVar2.y(), aVar5.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(v.l(c0VarR, 0));
            b1 b1VarK4 = c0VarR.k();
            a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
            function0A2 = aVar6.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarB2, aVar6.e());
            y7.n(c0VarD2, b1VarK4, aVar6.g());
            function2B2 = aVar6.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN4, aVar6.f());
            n0 n0Var2 = n0.f16227a;
            String title2 = data.getTitle();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            y3 y3VarM2 = y3.m(intercomTheme2.getTypography(c0VarR, i17).getType04(), intercomTheme2.getColors(c0VarR, i17).m714getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            if (data.isRead()) {
                v0VarO = v0.f41742b.m();
            } else {
                v0VarO = v0.f41742b.o();
            }
            v0 v0Var2 = v0VarO;
            androidx.compose.ui.text.style.v.a aVar7 = androidx.compose.ui.text.style.v.f42256b;
            a0 a0Var6 = a0Var3;
            q50.t(title2, null, 0L, null, 0L, null, v0Var2, null, 0L, null, null, 0L, aVar7.c(), false, 1, 0, null, y3VarM2, c0VarR, 0, 24960, 110526);
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            q50.t(data.getSubTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, aVar7.c(), false, 1, 0, null, y3.m(intercomTheme2.getTypography(c0VarR, i17).getType04(), intercomTheme2.getColors(c0VarR, i17).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, 0, 24960, 110590);
            c0Var2 = c0VarR;
            c0Var2.o();
            if (z12) {
                c0Var2.E(-318867215);
                ConversationItemKt.UnreadIndicator(null, c0Var2, 0, 1);
                c0Var2.A();
            } else {
                c0Var2.E(-318819320);
                IntercomChevronKt.IntercomChevron(d5.v(aVar, androidx.compose.ui.unit.h.r(6), 0.0f, 0.0f, 0.0f, 14, null), c0Var2, 6, 0);
                c0Var2.A();
            }
            c0Var2.o();
            g5Var3 = g5VarG;
            z13 = z12;
            a0Var4 = a0Var6;
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketRowKt.TicketRow$lambda$2(a0Var4, data, g5Var3, z13, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketRow$lambda$2(a0 a0Var, TicketRowData data, g5 g5Var, boolean z10, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(data, "$data");
        TicketRow(a0Var, data, g5Var, z10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(locale = "en", name = "LTR"), @d1.c(locale = "ar", name = "RTL")})
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketRowPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1396185263);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketRowKt.INSTANCE.m556getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketRowKt.TicketRowPreview$lambda$3(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketRowPreview$lambda$3(int i10, c0 c0Var, int i11) {
        TicketRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
