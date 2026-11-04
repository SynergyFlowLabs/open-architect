package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketStatusRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketStatusRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/TicketStatusRowKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,153:1\n87#2,6:154\n94#2:234\n80#3,6:160\n87#3,3:175\n90#3,2:184\n80#3,6:198\n87#3,3:213\n90#3,2:222\n94#3:228\n94#3:233\n80#3,6:244\n87#3,3:259\n90#3,2:268\n94#3:274\n391#4,9:166\n400#4:186\n391#4,9:204\n400#4:224\n401#4,2:226\n401#4,2:231\n391#4,9:250\n400#4:270\n401#4,2:272\n4360#5,6:178\n4360#5,6:216\n4360#5,6:262\n99#6:187\n95#6,10:188\n106#6:229\n99#6,6:238\n106#6:275\n113#7:225\n113#7:230\n113#7:271\n75#8:235\n75#8:236\n75#8:237\n*S KotlinDebug\n*F\n+ 1 TicketStatusRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/TicketStatusRowKt\n*L\n41#1:154,6\n41#1:234\n41#1:160,6\n41#1:175,3\n41#1:184,2\n48#1:198,6\n48#1:213,3\n48#1:222,2\n48#1:228\n41#1:233\n92#1:244,6\n92#1:259,3\n92#1:268,2\n92#1:274\n41#1:166,9\n41#1:186\n48#1:204,9\n48#1:224\n48#1:226,2\n41#1:231,2\n92#1:250,9\n92#1:270\n92#1:272,2\n41#1:178,6\n48#1:216,6\n92#1:262,6\n48#1:187\n48#1:188,10\n48#1:229\n92#1:238,6\n92#1:275\n54#1:225\n65#1:230\n104#1:271\n79#1:235\n84#1:236\n90#1:237\n*E\n"})
public final class TicketStatusRowKt {
    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SimplePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1725833053);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketStatusRowKt.INSTANCE.m307getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketStatusRowKt.SimplePreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimplePreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SimplePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0328  */
    /* JADX WARN: Code duplicated, block: B:114:0x0362  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:120:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0400  */
    /* JADX WARN: Code duplicated, block: B:124:0x041f  */
    /* JADX WARN: Code duplicated, block: B:126:0x042d  */
    /* JADX WARN: Code duplicated, block: B:131:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0328, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:114:0x0362, please report this as an issue */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketStatusRow(@NotNull final String eventStatus, @NotNull String str, @NotNull String str2, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str3, @Nullable String str4, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        String str5;
        int i14;
        int i15;
        String str6;
        int i16;
        int i17;
        androidx.compose.ui.a0 a0Var3;
        String str7;
        String str8;
        String str9;
        String lowerCase;
        CharSequence charSequence;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        String str10;
        androidx.compose.ui.a0 a0Var4;
        final String str11;
        final String str12;
        final androidx.compose.ui.a0 a0Var5;
        s5 s5VarT;
        final String statusText = str;
        final String time = str2;
        Intrinsics.checkNotNullParameter(eventStatus, "eventStatus");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(time, "time");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1382529243);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(eventStatus) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(statusText) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(time) ? 256 : 128;
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 7168) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    str5 = str3;
                    if (c0VarR.D(str5)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        str6 = str4;
                        if (c0VarR.D(str6)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i12;
                    if ((i17 & 374491) == 74898 || !c0VarR.d()) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str7 = null;
                        } else {
                            str7 = str5;
                        }
                        if (i15 != 0) {
                            str8 = null;
                        } else {
                            str8 = str6;
                        }
                        if (str7 != null || str8 == null) {
                            androidx.compose.ui.a0 a0Var6 = a0Var3;
                            str9 = str8;
                            String str13 = str7;
                            c0VarR.E(1098677964);
                            statusText = str;
                            lowerCase = statusText.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                                c0VarR.E(1098747900);
                                charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                                c0VarR.A();
                            } else {
                                c0VarR.E(1098996489);
                                charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                                c0VarR.A();
                            }
                            Spanned spannedA = androidx.core.text.c.a(charSequence.toString(), 0);
                            Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
                            androidx.compose.ui.text.f annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                            androidx.compose.ui.a0 a0VarF = i6.F(i6.h(a0Var6, 0.0f, 1, null), null, false, 3, null);
                            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
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
                            androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i19 = IntercomTheme.$stable;
                            str10 = str13;
                            ni.o(bVarC, null, null, intercomTheme.getColors(c0VarR, i19).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                            l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                            a0Var4 = a0Var6;
                            q50.u(annotatedString, null, intercomTheme.getColors(c0VarR, i19).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c0VarR, i19).getType04Point5(), c0VarR, 0, 0, 262138);
                            c0VarR = c0VarR;
                            c0VarR.o();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1097247159);
                            androidx.compose.ui.a0 a0VarF2 = i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null);
                            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                            androidx.compose.foundation.layout.q.f fVarM = qVar.m();
                            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarM, aVar2.m(), c0VarR, 54);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A2);
                            } else {
                                c0VarR.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
                            y7.n(c0VarD2, a1VarB, aVar3.e());
                            y7.n(c0VarD2, b1VarK2, aVar3.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar3.f());
                            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarE2 = u5.e(qVar.w(), aVar2.w(), c0VarR, 0);
                            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar4);
                            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A3);
                            } else {
                                c0VarR.l();
                            }
                            androidx.compose.runtime.c0 c0VarD3 = y7.d(c0VarR);
                            y7.n(c0VarD3, a1VarE2, aVar3.e());
                            y7.n(c0VarD3, b1VarK3, aVar3.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
                            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                                c0VarD3.Y(Integer.valueOf(iHashCode3));
                                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                            }
                            y7.n(c0VarD3, a0VarN3, aVar3.f());
                            y5 y5Var2 = y5.f16577a;
                            androidx.compose.ui.graphics.painter.b bVarC2 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            ni.o(bVarC2, null, null, intercomTheme2.getColors(c0VarR, i20).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                            l6.a(i6.B(aVar4, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                            long jM699getDescriptionText0d7_KjU = intercomTheme2.getColors(c0VarR, i20).m699getDescriptionText0d7_KjU();
                            y3 type04Point5 = intercomTheme2.getTypography(c0VarR, i20).getType04Point5();
                            androidx.compose.ui.text.style.j.a aVar5 = androidx.compose.ui.text.style.j.f42206b;
                            int iA = aVar5.a();
                            androidx.compose.ui.text.style.v.a aVar6 = androidx.compose.ui.text.style.v.f42256b;
                            String str14 = str8;
                            a0Var4 = a0Var3;
                            TextWithSeparatorKt.m171TextWithSeparatorwV1YYcM(str14, str2, null, null, type04Point5, jM699getDescriptionText0d7_KjU, aVar6.c(), 1, androidx.compose.ui.text.style.j.h(iA), c0VarR, ((i17 >> 15) & 14) | 14155776 | ((i17 >> 3) & com.planner5d.library.engine.input.f.b.B), 12);
                            str9 = str14;
                            time = str2;
                            c0VarR.o();
                            l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
                            String str15 = str7;
                            q50.t(str15, null, intercomTheme2.getColors(c0VarR, i20).m699getDescriptionText0d7_KjU(), null, 0L, null, androidx.compose.ui.text.font.v0.f41742b.c(), null, 0L, null, androidx.compose.ui.text.style.j.h(aVar5.a()), 0L, aVar6.c(), false, 1, 0, null, intercomTheme2.getTypography(c0VarR, i20).getType04Point5(), c0VarR, ((i17 >> 12) & 14) | 1572864, 24960, 109498);
                            c0VarR = c0VarR;
                            c0VarR.o();
                            c0VarR.A();
                            statusText = str;
                            str10 = str15;
                        }
                        str11 = str10;
                        str12 = str9;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var5 = a0Var2;
                        str11 = str5;
                        str12 = str6;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                str6 = str4;
                i17 = i12;
                if ((i17 & 374491) == 74898) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i15 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (str7 != null) {
                        androidx.compose.ui.a0 a0Var7 = a0Var3;
                        str9 = str8;
                        String str16 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA2 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA2, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF3 = i6.F(i6.h(a0Var7, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                        androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                        function0A = aVar7.a();
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
                        y7.n(c0VarD, a1VarE3, aVar7.e());
                        y7.n(c0VarD, b1VarK4, aVar7.g());
                        function2B = aVar7.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN4, aVar7.f());
                        y5 y5Var3 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC3 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i110 = IntercomTheme.$stable;
                        str10 = str16;
                        ni.o(bVarC3, null, null, intercomTheme3.getColors(c0VarR, i110).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var7;
                        q50.u(annotatedString2, null, intercomTheme3.getColors(c0VarR, i110).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(c0VarR, i110).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        androidx.compose.ui.a0 a0Var8 = a0Var3;
                        str9 = str8;
                        String str17 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA3 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA3, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF4 = i6.F(i6.h(a0Var8, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE4 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
                        androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                        function0A = aVar8.a();
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
                        y7.n(c0VarD, a1VarE4, aVar8.e());
                        y7.n(c0VarD, b1VarK5, aVar8.g());
                        function2B = aVar8.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar8.f());
                        y5 y5Var4 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC4 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i111 = IntercomTheme.$stable;
                        str10 = str17;
                        ni.o(bVarC4, null, null, intercomTheme4.getColors(c0VarR, i111).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var8;
                        q50.u(annotatedString3, null, intercomTheme4.getColors(c0VarR, i111).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme4.getTypography(c0VarR, i111).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    str11 = str10;
                    str12 = str9;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i15 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (str7 != null) {
                        androidx.compose.ui.a0 a0Var9 = a0Var3;
                        str9 = str8;
                        String str18 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA4 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA4, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString4 = BlockExtensionsKt.toAnnotatedString(spannedA4, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF5 = i6.F(i6.h(a0Var9, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE5 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarF5);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        function0A = aVar9.a();
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
                        y7.n(c0VarD, a1VarE5, aVar9.e());
                        y7.n(c0VarD, b1VarK6, aVar9.g());
                        function2B = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN6, aVar9.f());
                        y5 y5Var5 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC5 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i112 = IntercomTheme.$stable;
                        str10 = str18;
                        ni.o(bVarC5, null, null, intercomTheme5.getColors(c0VarR, i112).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var9;
                        q50.u(annotatedString4, null, intercomTheme5.getColors(c0VarR, i112).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme5.getTypography(c0VarR, i112).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        androidx.compose.ui.a0 a0Var10 = a0Var3;
                        str9 = str8;
                        String str19 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA5 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA5, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString5 = BlockExtensionsKt.toAnnotatedString(spannedA5, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF6 = i6.F(i6.h(a0Var10, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE6 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarF6);
                        androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                        function0A = aVar10.a();
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
                        y7.n(c0VarD, a1VarE6, aVar10.e());
                        y7.n(c0VarD, b1VarK7, aVar10.g());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN7, aVar10.f());
                        y5 y5Var6 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC6 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                        int i113 = IntercomTheme.$stable;
                        str10 = str19;
                        ni.o(bVarC6, null, null, intercomTheme6.getColors(c0VarR, i113).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var10;
                        q50.u(annotatedString5, null, intercomTheme6.getColors(c0VarR, i113).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme6.getTypography(c0VarR, i113).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    str11 = str10;
                    str12 = str9;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            str5 = str3;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    str6 = str4;
                    if (c0VarR.D(str6)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i17 & 374491) == 74898) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i15 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (str7 != null) {
                        androidx.compose.ui.a0 a0Var11 = a0Var3;
                        str9 = str8;
                        String str110 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA6 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA6, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString6 = BlockExtensionsKt.toAnnotatedString(spannedA6, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF7 = i6.F(i6.h(a0Var11, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE7 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarF7);
                        androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                        function0A = aVar11.a();
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
                        y7.n(c0VarD, a1VarE7, aVar11.e());
                        y7.n(c0VarD, b1VarK8, aVar11.g());
                        function2B = aVar11.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN8, aVar11.f());
                        y5 y5Var7 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC7 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                        int i114 = IntercomTheme.$stable;
                        str10 = str110;
                        ni.o(bVarC7, null, null, intercomTheme7.getColors(c0VarR, i114).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var11;
                        q50.u(annotatedString6, null, intercomTheme7.getColors(c0VarR, i114).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme7.getTypography(c0VarR, i114).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        androidx.compose.ui.a0 a0Var12 = a0Var3;
                        str9 = str8;
                        String str111 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA7 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA7, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString7 = BlockExtensionsKt.toAnnotatedString(spannedA7, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF8 = i6.F(i6.h(a0Var12, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE8 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarF8);
                        androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                        function0A = aVar12.a();
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
                        y7.n(c0VarD, a1VarE8, aVar12.e());
                        y7.n(c0VarD, b1VarK9, aVar12.g());
                        function2B = aVar12.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar12.f());
                        y5 y5Var8 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC8 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i115 = IntercomTheme.$stable;
                        str10 = str111;
                        ni.o(bVarC8, null, null, intercomTheme8.getColors(c0VarR, i115).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var12;
                        q50.u(annotatedString7, null, intercomTheme8.getColors(c0VarR, i115).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme8.getTypography(c0VarR, i115).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    str11 = str10;
                    str12 = str9;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i15 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (str7 != null) {
                        androidx.compose.ui.a0 a0Var13 = a0Var3;
                        str9 = str8;
                        String str112 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA8 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA8, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString8 = BlockExtensionsKt.toAnnotatedString(spannedA8, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF9 = i6.F(i6.h(a0Var13, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE9 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarF9);
                        androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                        function0A = aVar13.a();
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
                        y7.n(c0VarD, a1VarE9, aVar13.e());
                        y7.n(c0VarD, b1VarK10, aVar13.g());
                        function2B = aVar13.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN10, aVar13.f());
                        y5 y5Var9 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC9 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i116 = IntercomTheme.$stable;
                        str10 = str112;
                        ni.o(bVarC9, null, null, intercomTheme9.getColors(c0VarR, i116).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var13;
                        q50.u(annotatedString8, null, intercomTheme9.getColors(c0VarR, i116).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme9.getTypography(c0VarR, i116).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        androidx.compose.ui.a0 a0Var14 = a0Var3;
                        str9 = str8;
                        String str113 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA9 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA9, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString9 = BlockExtensionsKt.toAnnotatedString(spannedA9, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF10 = i6.F(i6.h(a0Var14, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE10 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarF10);
                        androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                        function0A = aVar14.a();
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
                        y7.n(c0VarD, a1VarE10, aVar14.e());
                        y7.n(c0VarD, b1VarK11, aVar14.g());
                        function2B = aVar14.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11, aVar14.f());
                        y5 y5Var10 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC10 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                        int i117 = IntercomTheme.$stable;
                        str10 = str113;
                        ni.o(bVarC10, null, null, intercomTheme10.getColors(c0VarR, i117).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var14;
                        q50.u(annotatedString9, null, intercomTheme10.getColors(c0VarR, i117).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme10.getTypography(c0VarR, i117).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    str11 = str10;
                    str12 = str9;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            str6 = str4;
            i17 = i12;
            if ((i17 & 374491) == 74898) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i15 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (str7 != null) {
                    androidx.compose.ui.a0 a0Var15 = a0Var3;
                    str9 = str8;
                    String str114 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA10 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA10, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString10 = BlockExtensionsKt.toAnnotatedString(spannedA10, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF11 = i6.F(i6.h(a0Var15, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE11 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarF11);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    function0A = aVar15.a();
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
                    y7.n(c0VarD, a1VarE11, aVar15.e());
                    y7.n(c0VarD, b1VarK12, aVar15.g());
                    function2B = aVar15.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar15.f());
                    y5 y5Var11 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC11 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i118 = IntercomTheme.$stable;
                    str10 = str114;
                    ni.o(bVarC11, null, null, intercomTheme11.getColors(c0VarR, i118).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var15;
                    q50.u(annotatedString10, null, intercomTheme11.getColors(c0VarR, i118).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme11.getTypography(c0VarR, i118).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    androidx.compose.ui.a0 a0Var16 = a0Var3;
                    str9 = str8;
                    String str115 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA11 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA11, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString11 = BlockExtensionsKt.toAnnotatedString(spannedA11, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF12 = i6.F(i6.h(a0Var16, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE12 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarF12);
                    androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                    function0A = aVar16.a();
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
                    y7.n(c0VarD, a1VarE12, aVar16.e());
                    y7.n(c0VarD, b1VarK13, aVar16.g());
                    function2B = aVar16.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN13, aVar16.f());
                    y5 y5Var12 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC12 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i119 = IntercomTheme.$stable;
                    str10 = str115;
                    ni.o(bVarC12, null, null, intercomTheme12.getColors(c0VarR, i119).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var16;
                    q50.u(annotatedString11, null, intercomTheme12.getColors(c0VarR, i119).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme12.getTypography(c0VarR, i119).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                str11 = str10;
                str12 = str9;
                a0Var5 = a0Var4;
            } else {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i15 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (str7 != null) {
                    androidx.compose.ui.a0 a0Var17 = a0Var3;
                    str9 = str8;
                    String str116 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA12 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA12, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString12 = BlockExtensionsKt.toAnnotatedString(spannedA12, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF13 = i6.F(i6.h(a0Var17, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE13 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarF13);
                    androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                    function0A = aVar17.a();
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
                    y7.n(c0VarD, a1VarE13, aVar17.e());
                    y7.n(c0VarD, b1VarK14, aVar17.g());
                    function2B = aVar17.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN14, aVar17.f());
                    y5 y5Var13 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC13 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i1110 = IntercomTheme.$stable;
                    str10 = str116;
                    ni.o(bVarC13, null, null, intercomTheme13.getColors(c0VarR, i1110).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var17;
                    q50.u(annotatedString12, null, intercomTheme13.getColors(c0VarR, i1110).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme13.getTypography(c0VarR, i1110).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    androidx.compose.ui.a0 a0Var18 = a0Var3;
                    str9 = str8;
                    String str117 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA13 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA13, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString13 = BlockExtensionsKt.toAnnotatedString(spannedA13, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF14 = i6.F(i6.h(a0Var18, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE14 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarF14);
                    androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                    function0A = aVar18.a();
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
                    y7.n(c0VarD, a1VarE14, aVar18.e());
                    y7.n(c0VarD, b1VarK15, aVar18.g());
                    function2B = aVar18.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN15, aVar18.f());
                    y5 y5Var14 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC14 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                    int i1111 = IntercomTheme.$stable;
                    str10 = str117;
                    ni.o(bVarC14, null, null, intercomTheme14.getColors(c0VarR, i1111).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var18;
                    q50.u(annotatedString13, null, intercomTheme14.getColors(c0VarR, i1111).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme14.getTypography(c0VarR, i1111).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                str11 = str10;
                str12 = str9;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                str5 = str3;
                if (c0VarR.D(str5)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    str6 = str4;
                    if (c0VarR.D(str6)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i17 & 374491) == 74898) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i15 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (str7 != null) {
                        androidx.compose.ui.a0 a0Var19 = a0Var3;
                        str9 = str8;
                        String str118 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA14 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA14, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString14 = BlockExtensionsKt.toAnnotatedString(spannedA14, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF15 = i6.F(i6.h(a0Var19, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE15 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarF15);
                        androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                        function0A = aVar19.a();
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
                        y7.n(c0VarD, a1VarE15, aVar19.e());
                        y7.n(c0VarD, b1VarK16, aVar19.g());
                        function2B = aVar19.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN16, aVar19.f());
                        y5 y5Var15 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC15 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                        int i1112 = IntercomTheme.$stable;
                        str10 = str118;
                        ni.o(bVarC15, null, null, intercomTheme15.getColors(c0VarR, i1112).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var19;
                        q50.u(annotatedString14, null, intercomTheme15.getColors(c0VarR, i1112).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme15.getTypography(c0VarR, i1112).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        androidx.compose.ui.a0 a0Var110 = a0Var3;
                        str9 = str8;
                        String str119 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA15 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA15, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString15 = BlockExtensionsKt.toAnnotatedString(spannedA15, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF16 = i6.F(i6.h(a0Var110, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE16 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarF16);
                        androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                        function0A = aVar110.a();
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
                        y7.n(c0VarD, a1VarE16, aVar110.e());
                        y7.n(c0VarD, b1VarK17, aVar110.g());
                        function2B = aVar110.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN17, aVar110.f());
                        y5 y5Var16 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC16 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                        int i1113 = IntercomTheme.$stable;
                        str10 = str119;
                        ni.o(bVarC16, null, null, intercomTheme16.getColors(c0VarR, i1113).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var110;
                        q50.u(annotatedString15, null, intercomTheme16.getColors(c0VarR, i1113).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme16.getTypography(c0VarR, i1113).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    str11 = str10;
                    str12 = str9;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i15 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (str7 != null) {
                        androidx.compose.ui.a0 a0Var111 = a0Var3;
                        str9 = str8;
                        String str1110 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA16 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA16, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString16 = BlockExtensionsKt.toAnnotatedString(spannedA16, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF17 = i6.F(i6.h(a0Var111, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE17 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarF17);
                        androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111.a();
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
                        y7.n(c0VarD, a1VarE17, aVar111.e());
                        y7.n(c0VarD, b1VarK18, aVar111.g());
                        function2B = aVar111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN18, aVar111.f());
                        y5 y5Var17 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC17 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                        int i1114 = IntercomTheme.$stable;
                        str10 = str1110;
                        ni.o(bVarC17, null, null, intercomTheme17.getColors(c0VarR, i1114).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var111;
                        q50.u(annotatedString16, null, intercomTheme17.getColors(c0VarR, i1114).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme17.getTypography(c0VarR, i1114).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    } else {
                        androidx.compose.ui.a0 a0Var112 = a0Var3;
                        str9 = str8;
                        String str1111 = str7;
                        c0VarR.E(1098677964);
                        statusText = str;
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                            c0VarR.E(1098747900);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        } else {
                            c0VarR.E(1098996489);
                            charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c0VarR.A();
                        }
                        Spanned spannedA17 = androidx.core.text.c.a(charSequence.toString(), 0);
                        Intrinsics.checkNotNullExpressionValue(spannedA17, "fromHtml(...)");
                        androidx.compose.ui.text.f annotatedString17 = BlockExtensionsKt.toAnnotatedString(spannedA17, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                        androidx.compose.ui.a0 a0VarF18 = i6.F(i6.h(a0Var112, 0.0f, 1, null), null, false, 3, null);
                        androidx.compose.ui.layout.a1 a1VarE18 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarF18);
                        androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                        function0A = aVar112.a();
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
                        y7.n(c0VarD, a1VarE18, aVar112.e());
                        y7.n(c0VarD, b1VarK19, aVar112.g());
                        function2B = aVar112.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN19, aVar112.f());
                        y5 y5Var18 = y5.f16577a;
                        androidx.compose.ui.graphics.painter.b bVarC18 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                        IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                        int i1115 = IntercomTheme.$stable;
                        str10 = str1111;
                        ni.o(bVarC18, null, null, intercomTheme18.getColors(c0VarR, i1115).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                        l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        a0Var4 = a0Var112;
                        q50.u(annotatedString17, null, intercomTheme18.getColors(c0VarR, i1115).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme18.getTypography(c0VarR, i1115).getType04Point5(), c0VarR, 0, 0, 262138);
                        c0VarR = c0VarR;
                        c0VarR.o();
                        c0VarR.A();
                    }
                    str11 = str10;
                    str12 = str9;
                    a0Var5 = a0Var4;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            str6 = str4;
            i17 = i12;
            if ((i17 & 374491) == 74898) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i15 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (str7 != null) {
                    androidx.compose.ui.a0 a0Var113 = a0Var3;
                    str9 = str8;
                    String str1112 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA18 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA18, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString18 = BlockExtensionsKt.toAnnotatedString(spannedA18, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF19 = i6.F(i6.h(a0Var113, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE19 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarF19);
                    androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                    function0A = aVar113.a();
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
                    y7.n(c0VarD, a1VarE19, aVar113.e());
                    y7.n(c0VarD, b1VarK110, aVar113.g());
                    function2B = aVar113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar113.f());
                    y5 y5Var19 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC19 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                    int i1116 = IntercomTheme.$stable;
                    str10 = str1112;
                    ni.o(bVarC19, null, null, intercomTheme19.getColors(c0VarR, i1116).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var113;
                    q50.u(annotatedString18, null, intercomTheme19.getColors(c0VarR, i1116).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme19.getTypography(c0VarR, i1116).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    androidx.compose.ui.a0 a0Var114 = a0Var3;
                    str9 = str8;
                    String str1113 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA19 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA19, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString19 = BlockExtensionsKt.toAnnotatedString(spannedA19, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF110 = i6.F(i6.h(a0Var114, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE110 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarF110);
                    androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                    function0A = aVar114.a();
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
                    y7.n(c0VarD, a1VarE110, aVar114.e());
                    y7.n(c0VarD, b1VarK111, aVar114.g());
                    function2B = aVar114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111, aVar114.f());
                    y5 y5Var110 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC110 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                    int i1117 = IntercomTheme.$stable;
                    str10 = str1113;
                    ni.o(bVarC110, null, null, intercomTheme110.getColors(c0VarR, i1117).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var114;
                    q50.u(annotatedString19, null, intercomTheme110.getColors(c0VarR, i1117).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme110.getTypography(c0VarR, i1117).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                str11 = str10;
                str12 = str9;
                a0Var5 = a0Var4;
            } else {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i15 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (str7 != null) {
                    androidx.compose.ui.a0 a0Var115 = a0Var3;
                    str9 = str8;
                    String str1114 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA110 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA110, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString110 = BlockExtensionsKt.toAnnotatedString(spannedA110, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF111 = i6.F(i6.h(a0Var115, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE111 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarF111);
                    androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                    function0A = aVar115.a();
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
                    y7.n(c0VarD, a1VarE111, aVar115.e());
                    y7.n(c0VarD, b1VarK112, aVar115.g());
                    function2B = aVar115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN112, aVar115.f());
                    y5 y5Var111 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC111 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                    int i1118 = IntercomTheme.$stable;
                    str10 = str1114;
                    ni.o(bVarC111, null, null, intercomTheme111.getColors(c0VarR, i1118).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var115;
                    q50.u(annotatedString110, null, intercomTheme111.getColors(c0VarR, i1118).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme111.getTypography(c0VarR, i1118).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    androidx.compose.ui.a0 a0Var116 = a0Var3;
                    str9 = str8;
                    String str1115 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA111 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA111, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString111 = BlockExtensionsKt.toAnnotatedString(spannedA111, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF112 = i6.F(i6.h(a0Var116, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE112 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarF112);
                    androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                    function0A = aVar116.a();
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
                    y7.n(c0VarD, a1VarE112, aVar116.e());
                    y7.n(c0VarD, b1VarK113, aVar116.g());
                    function2B = aVar116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN113, aVar116.f());
                    y5 y5Var112 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC112 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                    int i1119 = IntercomTheme.$stable;
                    str10 = str1115;
                    ni.o(bVarC112, null, null, intercomTheme112.getColors(c0VarR, i1119).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var116;
                    q50.u(annotatedString111, null, intercomTheme112.getColors(c0VarR, i1119).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme112.getTypography(c0VarR, i1119).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                str11 = str10;
                str12 = str9;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        str5 = str3;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                str6 = str4;
                if (c0VarR.D(str6)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i12;
            if ((i17 & 374491) == 74898) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i15 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (str7 != null) {
                    androidx.compose.ui.a0 a0Var117 = a0Var3;
                    str9 = str8;
                    String str1116 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA112 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA112, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString112 = BlockExtensionsKt.toAnnotatedString(spannedA112, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF113 = i6.F(i6.h(a0Var117, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE113 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarF113);
                    androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                    function0A = aVar117.a();
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
                    y7.n(c0VarD, a1VarE113, aVar117.e());
                    y7.n(c0VarD, b1VarK114, aVar117.g());
                    function2B = aVar117.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN114, aVar117.f());
                    y5 y5Var113 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC113 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                    int i11110 = IntercomTheme.$stable;
                    str10 = str1116;
                    ni.o(bVarC113, null, null, intercomTheme113.getColors(c0VarR, i11110).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var117;
                    q50.u(annotatedString112, null, intercomTheme113.getColors(c0VarR, i11110).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme113.getTypography(c0VarR, i11110).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    androidx.compose.ui.a0 a0Var118 = a0Var3;
                    str9 = str8;
                    String str1117 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA113 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA113, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString113 = BlockExtensionsKt.toAnnotatedString(spannedA113, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF114 = i6.F(i6.h(a0Var118, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE114 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarF114);
                    androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                    function0A = aVar118.a();
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
                    y7.n(c0VarD, a1VarE114, aVar118.e());
                    y7.n(c0VarD, b1VarK115, aVar118.g());
                    function2B = aVar118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN115, aVar118.f());
                    y5 y5Var114 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC114 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                    int i11111 = IntercomTheme.$stable;
                    str10 = str1117;
                    ni.o(bVarC114, null, null, intercomTheme114.getColors(c0VarR, i11111).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var118;
                    q50.u(annotatedString113, null, intercomTheme114.getColors(c0VarR, i11111).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme114.getTypography(c0VarR, i11111).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                str11 = str10;
                str12 = str9;
                a0Var5 = a0Var4;
            } else {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i15 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (str7 != null) {
                    androidx.compose.ui.a0 a0Var119 = a0Var3;
                    str9 = str8;
                    String str1118 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA114 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA114, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString114 = BlockExtensionsKt.toAnnotatedString(spannedA114, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF115 = i6.F(i6.h(a0Var119, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE115 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarF115);
                    androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                    function0A = aVar119.a();
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
                    y7.n(c0VarD, a1VarE115, aVar119.e());
                    y7.n(c0VarD, b1VarK116, aVar119.g());
                    function2B = aVar119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN116, aVar119.f());
                    y5 y5Var115 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC115 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                    int i11112 = IntercomTheme.$stable;
                    str10 = str1118;
                    ni.o(bVarC115, null, null, intercomTheme115.getColors(c0VarR, i11112).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var119;
                    q50.u(annotatedString114, null, intercomTheme115.getColors(c0VarR, i11112).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme115.getTypography(c0VarR, i11112).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    androidx.compose.ui.a0 a0Var1110 = a0Var3;
                    str9 = str8;
                    String str1119 = str7;
                    c0VarR.E(1098677964);
                    statusText = str;
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                        c0VarR.E(1098747900);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    } else {
                        c0VarR.E(1098996489);
                        charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c0VarR.A();
                    }
                    Spanned spannedA115 = androidx.core.text.c.a(charSequence.toString(), 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA115, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString115 = BlockExtensionsKt.toAnnotatedString(spannedA115, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0 a0VarF116 = i6.F(i6.h(a0Var1110, 0.0f, 1, null), null, false, 3, null);
                    androidx.compose.ui.layout.a1 a1VarE116 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarF116);
                    androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                    function0A = aVar1110.a();
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
                    y7.n(c0VarD, a1VarE116, aVar1110.e());
                    y7.n(c0VarD, b1VarK117, aVar1110.g());
                    function2B = aVar1110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN117, aVar1110.f());
                    y5 y5Var116 = y5.f16577a;
                    androidx.compose.ui.graphics.painter.b bVarC116 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                    IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                    int i11113 = IntercomTheme.$stable;
                    str10 = str1119;
                    ni.o(bVarC116, null, null, intercomTheme116.getColors(c0VarR, i11113).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                    l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    a0Var4 = a0Var1110;
                    q50.u(annotatedString115, null, intercomTheme116.getColors(c0VarR, i11113).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme116.getTypography(c0VarR, i11113).getType04Point5(), c0VarR, 0, 0, 262138);
                    c0VarR = c0VarR;
                    c0VarR.o();
                    c0VarR.A();
                }
                str11 = str10;
                str12 = str9;
                a0Var5 = a0Var4;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        str6 = str4;
        i17 = i12;
        if ((i17 & 374491) == 74898) {
            if (i18 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (i15 != 0) {
                str8 = null;
            } else {
                str8 = str6;
            }
            if (str7 != null) {
                androidx.compose.ui.a0 a0Var1111 = a0Var3;
                str9 = str8;
                String str11110 = str7;
                c0VarR.E(1098677964);
                statusText = str;
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                    c0VarR.E(1098747900);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                } else {
                    c0VarR.E(1098996489);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                }
                Spanned spannedA116 = androidx.core.text.c.a(charSequence.toString(), 0);
                Intrinsics.checkNotNullExpressionValue(spannedA116, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString116 = BlockExtensionsKt.toAnnotatedString(spannedA116, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0 a0VarF117 = i6.F(i6.h(a0Var1111, 0.0f, 1, null), null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarE117 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarF117);
                androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                function0A = aVar1111.a();
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
                y7.n(c0VarD, a1VarE117, aVar1111.e());
                y7.n(c0VarD, b1VarK118, aVar1111.g());
                function2B = aVar1111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar1111.f());
                y5 y5Var117 = y5.f16577a;
                androidx.compose.ui.graphics.painter.b bVarC117 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                int i11114 = IntercomTheme.$stable;
                str10 = str11110;
                ni.o(bVarC117, null, null, intercomTheme117.getColors(c0VarR, i11114).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0Var4 = a0Var1111;
                q50.u(annotatedString116, null, intercomTheme117.getColors(c0VarR, i11114).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme117.getTypography(c0VarR, i11114).getType04Point5(), c0VarR, 0, 0, 262138);
                c0VarR = c0VarR;
                c0VarR.o();
                c0VarR.A();
            } else {
                androidx.compose.ui.a0 a0Var1112 = a0Var3;
                str9 = str8;
                String str11111 = str7;
                c0VarR.E(1098677964);
                statusText = str;
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                    c0VarR.E(1098747900);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                } else {
                    c0VarR.E(1098996489);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                }
                Spanned spannedA117 = androidx.core.text.c.a(charSequence.toString(), 0);
                Intrinsics.checkNotNullExpressionValue(spannedA117, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString117 = BlockExtensionsKt.toAnnotatedString(spannedA117, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0 a0VarF118 = i6.F(i6.h(a0Var1112, 0.0f, 1, null), null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarE118 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarF118);
                androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
                function0A = aVar1112.a();
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
                y7.n(c0VarD, a1VarE118, aVar1112.e());
                y7.n(c0VarD, b1VarK119, aVar1112.g());
                function2B = aVar1112.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN119, aVar1112.f());
                y5 y5Var118 = y5.f16577a;
                androidx.compose.ui.graphics.painter.b bVarC118 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                int i11115 = IntercomTheme.$stable;
                str10 = str11111;
                ni.o(bVarC118, null, null, intercomTheme118.getColors(c0VarR, i11115).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0Var4 = a0Var1112;
                q50.u(annotatedString117, null, intercomTheme118.getColors(c0VarR, i11115).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme118.getTypography(c0VarR, i11115).getType04Point5(), c0VarR, 0, 0, 262138);
                c0VarR = c0VarR;
                c0VarR.o();
                c0VarR.A();
            }
            str11 = str10;
            str12 = str9;
            a0Var5 = a0Var4;
        } else {
            if (i18 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (i15 != 0) {
                str8 = null;
            } else {
                str8 = str6;
            }
            if (str7 != null) {
                androidx.compose.ui.a0 a0Var1113 = a0Var3;
                str9 = str8;
                String str11112 = str7;
                c0VarR.E(1098677964);
                statusText = str;
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                    c0VarR.E(1098747900);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                } else {
                    c0VarR.E(1098996489);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                }
                Spanned spannedA118 = androidx.core.text.c.a(charSequence.toString(), 0);
                Intrinsics.checkNotNullExpressionValue(spannedA118, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString118 = BlockExtensionsKt.toAnnotatedString(spannedA118, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0 a0VarF119 = i6.F(i6.h(a0Var1113, 0.0f, 1, null), null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarE119 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarF119);
                androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
                function0A = aVar1113.a();
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
                y7.n(c0VarD, a1VarE119, aVar1113.e());
                y7.n(c0VarD, b1VarK1110, aVar1113.g());
                function2B = aVar1113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1110, aVar1113.f());
                y5 y5Var119 = y5.f16577a;
                androidx.compose.ui.graphics.painter.b bVarC119 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                int i11116 = IntercomTheme.$stable;
                str10 = str11112;
                ni.o(bVarC119, null, null, intercomTheme119.getColors(c0VarR, i11116).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0Var4 = a0Var1113;
                q50.u(annotatedString118, null, intercomTheme119.getColors(c0VarR, i11116).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme119.getTypography(c0VarR, i11116).getType04Point5(), c0VarR, 0, 0, 262138);
                c0VarR = c0VarR;
                c0VarR.o();
                c0VarR.A();
            } else {
                androidx.compose.ui.a0 a0Var1114 = a0Var3;
                str9 = str8;
                String str11113 = str7;
                c0VarR.E(1098677964);
                statusText = str;
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(eventStatus, MetricTracker.Action.SUBMITTED)) {
                    c0VarR.E(1098747900);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                } else {
                    c0VarR.E(1098996489);
                    charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c0VarR.A();
                }
                Spanned spannedA119 = androidx.core.text.c.a(charSequence.toString(), 0);
                Intrinsics.checkNotNullExpressionValue(spannedA119, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString119 = BlockExtensionsKt.toAnnotatedString(spannedA119, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0 a0VarF1110 = i6.F(i6.h(a0Var1114, 0.0f, 1, null), null, false, 3, null);
                androidx.compose.ui.layout.a1 a1VarE1110 = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarF1110);
                androidx.compose.ui.node.g.a aVar1114 = androidx.compose.ui.node.g.I;
                function0A = aVar1114.a();
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
                y7.n(c0VarD, a1VarE1110, aVar1114.e());
                y7.n(c0VarD, b1VarK1111, aVar1114.g());
                function2B = aVar1114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1111, aVar1114.f());
                y5 y5Var1110 = y5.f16577a;
                androidx.compose.ui.graphics.painter.b bVarC1110 = u0.e.c(R.drawable.intercom_ticket_detail_icon, c0VarR, 0);
                IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                int i11117 = IntercomTheme.$stable;
                str10 = str11113;
                ni.o(bVarC1110, null, null, intercomTheme1110.getColors(c0VarR, i11117).m699getDescriptionText0d7_KjU(), c0VarR, 56, 4);
                l6.a(i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                a0Var4 = a0Var1114;
                q50.u(annotatedString119, null, intercomTheme1110.getColors(c0VarR, i11117).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme1110.getTypography(c0VarR, i11117).getType04Point5(), c0VarR, 0, 0, 262138);
                c0VarR = c0VarR;
                c0VarR.o();
                c0VarR.A();
            }
            str11 = str10;
            str12 = str9;
            a0Var5 = a0Var4;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, a0Var5, str11, str12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketStatusRow$lambda$3(String eventStatus, String statusText, String time, androidx.compose.ui.a0 a0Var, String str, String str2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(eventStatus, "$eventStatus");
        Intrinsics.checkNotNullParameter(statusText, "$statusText");
        Intrinsics.checkNotNullParameter(time, "$time");
        TicketStatusRow(eventStatus, statusText, time, a0Var, str, str2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
