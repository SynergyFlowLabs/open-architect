package com.planner5d.library.contest.view.rules;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.v;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.s2;
import androidx.compose.material.wk;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.style.u;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nContestPrizes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestPrizes.kt\ncom/planner5d/library/contest/view/rules/ContestPrizesKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,120:1\n87#2:121\n83#2,10:122\n94#2:164\n80#3,6:132\n87#3,3:147\n90#3,2:156\n94#3:163\n80#3,6:176\n87#3,3:191\n90#3,2:200\n80#3,6:214\n87#3,3:229\n90#3,2:238\n80#3,6:252\n87#3,3:267\n90#3,2:276\n94#3:281\n94#3:285\n80#3,6:298\n87#3,3:313\n90#3,2:322\n94#3:327\n80#3,6:340\n87#3,3:355\n90#3,2:364\n94#3:369\n94#3:373\n391#4,9:138\n400#4:158\n401#4,2:161\n391#4,9:182\n400#4:202\n391#4,9:220\n400#4:240\n391#4,9:258\n400#4,3:278\n401#4,2:283\n391#4,9:304\n400#4,3:324\n391#4,9:346\n400#4,3:366\n401#4,2:371\n4360#5,6:150\n4360#5,6:194\n4360#5,6:232\n4360#5,6:270\n4360#5,6:316\n4360#5,6:358\n1863#6,2:159\n113#7:165\n113#7:169\n113#7:203\n113#7:241\n113#7:287\n113#7:329\n1#8:166\n75#9:167\n75#9:168\n99#10,6:170\n106#10:374\n70#11:204\n67#11,9:205\n70#11:242\n67#11,9:243\n77#11:282\n77#11:286\n70#11:288\n67#11,9:289\n77#11:328\n70#11:330\n67#11,9:331\n77#11:370\n*S KotlinDebug\n*F\n+ 1 ContestPrizes.kt\ncom/planner5d/library/contest/view/rules/ContestPrizesKt\n*L\n38#1:121\n38#1:122,10\n38#1:164\n38#1:132,6\n38#1:147,3\n38#1:156,2\n38#1:163\n81#1:176,6\n81#1:191,3\n81#1:200,2\n86#1:214,6\n86#1:229,3\n86#1:238,2\n88#1:252,6\n88#1:267,3\n88#1:276,2\n88#1:281\n86#1:285\n105#1:298,6\n105#1:313,3\n105#1:322,2\n105#1:327\n112#1:340,6\n112#1:355,3\n112#1:364,2\n112#1:369\n81#1:373\n38#1:138,9\n38#1:158\n38#1:161,2\n81#1:182,9\n81#1:202\n86#1:220,9\n86#1:240\n88#1:258,9\n88#1:278,3\n86#1:283,2\n105#1:304,9\n105#1:324,3\n112#1:346,9\n112#1:366,3\n81#1:371,2\n38#1:150,6\n81#1:194,6\n86#1:232,6\n88#1:270,6\n105#1:316,6\n112#1:358,6\n45#1:159,2\n66#1:165\n83#1:169\n86#1:203\n88#1:241\n105#1:287\n112#1:329\n76#1:167\n78#1:168\n81#1:170,6\n81#1:374\n86#1:204\n86#1:205,9\n88#1:242\n88#1:243,9\n88#1:282\n86#1:286\n105#1:288\n105#1:289,9\n105#1:328\n112#1:330\n112#1:331,9\n112#1:370\n*E\n"})
public final class f {
    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:105:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:112:0x0243  */
    /* JADX WARN: Code duplicated, block: B:114:0x0251  */
    /* JADX WARN: Code duplicated, block: B:117:0x026a  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02df  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x043d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0449  */
    /* JADX WARN: Code duplicated, block: B:137:0x044d  */
    /* JADX WARN: Code duplicated, block: B:140:0x046c  */
    /* JADX WARN: Code duplicated, block: B:142:0x047a  */
    /* JADX WARN: Code duplicated, block: B:145:0x054d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0559  */
    /* JADX WARN: Code duplicated, block: B:149:0x055d  */
    /* JADX WARN: Code duplicated, block: B:152:0x057c  */
    /* JADX WARN: Code duplicated, block: B:154:0x058a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0630  */
    /* JADX WARN: Code duplicated, block: B:161:0x0642  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0189  */
    /* JADX WARN: Code duplicated, block: B:96:0x0195  */
    /* JADX WARN: Code duplicated, block: B:97:0x0199  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    @o
    @d1.c
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@Nullable String str, @v @Nullable Integer num, @androidx.annotation.n @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable c0 c0Var, final int i10, final int i11) {
        String str4;
        int i12;
        Integer num3;
        int i13;
        Integer num4;
        int i14;
        int i15;
        String str5;
        int i16;
        int i17;
        String str6;
        int i18;
        String str7;
        Integer num5;
        String str8;
        String str9;
        Drawable drawableB;
        Context context;
        a0.a aVar;
        androidx.compose.ui.e.a aVar2;
        int iHashCode;
        androidx.compose.ui.node.g.a aVar3;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        float f10;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        d0 d0Var;
        a0.a aVar4;
        float f11;
        ?? r10;
        String str10;
        c0 c0Var2;
        int iHashCode3;
        Function0<androidx.compose.ui.node.g> function0A3;
        c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        c0 c0Var3;
        int iHashCode4;
        Function0<androidx.compose.ui.node.g> function0A4;
        c0 c0VarD4;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4;
        c0 c0Var4;
        final Integer num6;
        final Integer num7;
        final String str11;
        final String str12;
        final String str13;
        int iHashCode5;
        Function0<androidx.compose.ui.node.g> function0A5;
        c0 c0VarD5;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B5;
        s5 s5VarT;
        c0 c0VarR = c0Var.R(96329389);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            str4 = str;
        } else if ((i10 & 6) == 0) {
            str4 = str;
            i12 = (c0VarR.D(str4) ? 4 : 2) | i10;
        } else {
            str4 = str;
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                num3 = num;
                i12 |= c0VarR.D(num3) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    num4 = num2;
                    if (c0VarR.D(num4)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        str5 = str2;
                        if (c0VarR.D(str5)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            str6 = str3;
                            if (c0VarR.D(str6)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 9363) == 9362 || !c0VarR.d()) {
                            if (i19 != 0) {
                                str7 = "1";
                            } else {
                                str7 = str4;
                            }
                            if (i20 != 0) {
                                num3 = null;
                            }
                            if (i13 != 0) {
                                num5 = null;
                            } else {
                                num5 = num4;
                            }
                            if (i15 != 0) {
                                str8 = "25";
                            } else {
                                str8 = str5;
                            }
                            if (i17 != 0) {
                                str9 = "35";
                            } else {
                                str9 = str6;
                            }
                            if (m0.l0()) {
                                m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                            }
                            c0VarR.E(878079651);
                            if (num3 == null) {
                                drawableB = null;
                            } else {
                                drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                            }
                            c0VarR.A();
                            c0VarR.E(878081854);
                            if (drawableB == null) {
                                drawableB = null;
                            } else {
                                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                                if (num5 != null) {
                                    drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                                }
                            }
                            c0VarR.A();
                            aVar = a0.E;
                            a0 a0VarH = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                            aVar2 = androidx.compose.ui.e.f37317a;
                            a1 a1VarE = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK = c0VarR.k();
                            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
                            aVar3 = androidx.compose.ui.node.g.I;
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
                            y7.n(c0VarD, a1VarE, aVar3.e());
                            y7.n(c0VarD, b1VarK, aVar3.g());
                            function2B = aVar3.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar3.f());
                            y5 y5Var = y5.f16577a;
                            f10 = 20;
                            a0 a0VarI = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK = x.k(aVar2.C(), false);
                            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK2 = c0VarR.k();
                            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarI);
                            function0A2 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A2);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD2 = y7.d(c0VarR);
                            y7.n(c0VarD2, a1VarK, aVar3.e());
                            y7.n(c0VarD2, b1VarK2, aVar3.g());
                            function2B2 = aVar3.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar3.f());
                            d0Var = d0.f15956a;
                            if (num3 != null) {
                                c0VarR.E(492004253);
                                a0 a0VarI2 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                                a1 a1VarK2 = x.k(aVar2.C(), false);
                                iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                                b1 b1VarK3 = c0VarR.k();
                                a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarI2);
                                function0A5 = aVar3.a();
                                if (c0VarR.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0VarR.q();
                                if (c0VarR.P()) {
                                    c0VarR.q0(function0A5);
                                } else {
                                    c0VarR.l();
                                }
                                c0VarD5 = y7.d(c0VarR);
                                y7.n(c0VarD5, a1VarK2, aVar3.e());
                                y7.n(c0VarD5, b1VarK3, aVar3.g());
                                function2B5 = aVar3.b();
                                if (c0VarD5.P() || !Intrinsics.areEqual(c0VarD5.i0(), Integer.valueOf(iHashCode5))) {
                                    c0VarD5.Y(Integer.valueOf(iHashCode5));
                                    c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                                }
                                y7.n(c0VarD5, a0VarN3, aVar3.f());
                                androidx.compose.ui.graphics.painter.b bVarG = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                                aVar4 = aVar;
                                String str14 = str7;
                                f11 = f10;
                                r10 = 0;
                                s2.d(bVarG, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                                wk.o(str14, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                c0Var2.A();
                                str10 = str14;
                            } else {
                                aVar4 = aVar;
                                f11 = f10;
                                String str15 = str7;
                                r10 = 0;
                                c0VarR.E(492418847);
                                wk.o(str15, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                                str10 = str15;
                                c0Var2 = c0VarR;
                                c0Var2.A();
                            }
                            c0Var2.o();
                            a0 a0VarI3 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                            a1 a1VarK3 = x.k(aVar2.C(), r10);
                            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                            b1 b1VarK4 = c0Var2.k();
                            a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, a0VarI3);
                            function0A3 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A3);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD3 = y7.d(c0Var2);
                            y7.n(c0VarD3, a1VarK3, aVar3.e());
                            y7.n(c0VarD3, b1VarK4, aVar3.g());
                            function2B3 = aVar3.b();
                            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                                c0VarD3.Y(Integer.valueOf(iHashCode3));
                                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                            }
                            y7.n(c0VarD3, a0VarN4, aVar3.f());
                            y3 y3Var = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                            a0 a0VarB = d0Var.b(aVar4, aVar2.o());
                            cb.a aVar5 = cb.a.f82538a;
                            int i21 = com.planner5d.library.contest.e.f.f150195r3;
                            int i22 = cb.a.f82539b;
                            c0Var3 = c0Var2;
                            wk.o(str8, a0VarB, 0L, aVar5.a(i21, c0Var2, i22 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var, c0Var3, (i12 >> 9) & 14, 0, 65524);
                            c0Var3.o();
                            a0 a0VarI4 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                            a1 a1VarK4 = x.k(aVar2.C(), r10);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                            b1 b1VarK5 = c0Var3.k();
                            a0 a0VarN5 = androidx.compose.ui.m.n(c0Var3, a0VarI4);
                            function0A4 = aVar3.a();
                            if (c0Var3.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var3.q();
                            if (c0Var3.P()) {
                                c0Var3.q0(function0A4);
                            } else {
                                c0Var3.l();
                            }
                            c0VarD4 = y7.d(c0Var3);
                            y7.n(c0VarD4, a1VarK4, aVar3.e());
                            y7.n(c0VarD4, b1VarK5, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN5, aVar3.f());
                            y3 y3Var2 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                            c0Var4 = c0Var3;
                            String str16 = str9;
                            wk.o(str16, d0Var.b(aVar4, aVar2.o()), 0L, aVar5.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i22 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var2, c0Var4, (i12 >> 12) & 14, 0, 65524);
                            c0Var4.o();
                            c0Var4.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                            num6 = num5;
                            num7 = num3;
                            str11 = str16;
                            str12 = str8;
                            str13 = str10;
                        } else {
                            c0VarR.u();
                            str13 = str4;
                            num7 = num3;
                            num6 = num4;
                            str12 = str5;
                            str11 = str6;
                            c0Var4 = c0VarR;
                        }
                        s5VarT = c0Var4.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    str6 = str3;
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH2 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE2 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK6 = c0VarR.k();
                        a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarH2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, b1VarK6, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN6, aVar3.f());
                        y5 y5Var2 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI5 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK5 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK7 = c0VarR.k();
                        a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarI5);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK5, aVar3.e());
                        y7.n(c0VarD2, b1VarK7, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN7, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI6 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK6 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK8 = c0VarR.k();
                            a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarI6);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK6, aVar3.e());
                            y7.n(c0VarD5, b1VarK8, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN8, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG2 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str17 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG2, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str17, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str17;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str18 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str18, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str18;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI7 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK7 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK9 = c0Var2.k();
                        a0 a0VarN9 = androidx.compose.ui.m.n(c0Var2, a0VarI7);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK7, aVar3.e());
                        y7.n(c0VarD3, b1VarK9, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN9, aVar3.f());
                        y3 y3Var3 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB2 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar6 = cb.a.f82538a;
                        int i23 = com.planner5d.library.contest.e.f.f150195r3;
                        int i24 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB2, 0L, aVar6.a(i23, c0Var2, i24 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var3, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI8 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK8 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK10 = c0Var3.k();
                        a0 a0VarN10 = androidx.compose.ui.m.n(c0Var3, a0VarI8);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK8, aVar3.e());
                        y7.n(c0VarD4, b1VarK10, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN10, aVar3.f());
                        y3 y3Var4 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str19 = str9;
                        wk.o(str19, d0Var.b(aVar4, aVar2.o()), 0L, aVar6.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i24 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var4, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str19;
                        str12 = str8;
                        str13 = str10;
                    } else {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH3 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE3 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11 = c0VarR.k();
                        a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarH3);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE3, aVar3.e());
                        y7.n(c0VarD, b1VarK11, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11, aVar3.f());
                        y5 y5Var3 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI9 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK9 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK12 = c0VarR.k();
                        a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarI9);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK9, aVar3.e());
                        y7.n(c0VarD2, b1VarK12, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN12, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI10 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK10 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK13 = c0VarR.k();
                            a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarI10);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK10, aVar3.e());
                            y7.n(c0VarD5, b1VarK13, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN13, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG3 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str110 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG3, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str110, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str110;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str111 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str111, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str111;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI11 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK11 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK14 = c0Var2.k();
                        a0 a0VarN14 = androidx.compose.ui.m.n(c0Var2, a0VarI11);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK11, aVar3.e());
                        y7.n(c0VarD3, b1VarK14, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN14, aVar3.f());
                        y3 y3Var5 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB3 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar7 = cb.a.f82538a;
                        int i25 = com.planner5d.library.contest.e.f.f150195r3;
                        int i26 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB3, 0L, aVar7.a(i25, c0Var2, i26 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var5, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI12 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK12 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK15 = c0Var3.k();
                        a0 a0VarN15 = androidx.compose.ui.m.n(c0Var3, a0VarI12);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK12, aVar3.e());
                        y7.n(c0VarD4, b1VarK15, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN15, aVar3.f());
                        y3 y3Var6 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str112 = str9;
                        wk.o(str112, d0Var.b(aVar4, aVar2.o()), 0L, aVar7.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i26 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var6, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str112;
                        str12 = str8;
                        str13 = str10;
                    }
                    s5VarT = c0Var4.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                str5 = str2;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str6 = str3;
                        if (c0VarR.D(str6)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH4 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE4 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK16 = c0VarR.k();
                        a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarH4);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE4, aVar3.e());
                        y7.n(c0VarD, b1VarK16, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN16, aVar3.f());
                        y5 y5Var4 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI13 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK13 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK17 = c0VarR.k();
                        a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarI13);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK13, aVar3.e());
                        y7.n(c0VarD2, b1VarK17, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN17, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI14 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK14 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK18 = c0VarR.k();
                            a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarI14);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK14, aVar3.e());
                            y7.n(c0VarD5, b1VarK18, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN18, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG4 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str113 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG4, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str113, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str113;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str114 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str114, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str114;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI15 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK15 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK19 = c0Var2.k();
                        a0 a0VarN19 = androidx.compose.ui.m.n(c0Var2, a0VarI15);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK15, aVar3.e());
                        y7.n(c0VarD3, b1VarK19, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN19, aVar3.f());
                        y3 y3Var7 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB4 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar8 = cb.a.f82538a;
                        int i27 = com.planner5d.library.contest.e.f.f150195r3;
                        int i28 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB4, 0L, aVar8.a(i27, c0Var2, i28 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var7, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI16 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK16 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK110 = c0Var3.k();
                        a0 a0VarN110 = androidx.compose.ui.m.n(c0Var3, a0VarI16);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK16, aVar3.e());
                        y7.n(c0VarD4, b1VarK110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN110, aVar3.f());
                        y3 y3Var8 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str115 = str9;
                        wk.o(str115, d0Var.b(aVar4, aVar2.o()), 0L, aVar8.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i28 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var8, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str115;
                        str12 = str8;
                        str13 = str10;
                    } else {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH5 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE5 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111 = c0VarR.k();
                        a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarH5);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE5, aVar3.e());
                        y7.n(c0VarD, b1VarK111, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN111, aVar3.f());
                        y5 y5Var5 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI17 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK17 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK112 = c0VarR.k();
                        a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarI17);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK17, aVar3.e());
                        y7.n(c0VarD2, b1VarK112, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN112, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI18 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK18 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK113 = c0VarR.k();
                            a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarI18);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK18, aVar3.e());
                            y7.n(c0VarD5, b1VarK113, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN113, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG5 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str116 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG5, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str116, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str116;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str117 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str117, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str117;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI19 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK19 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK114 = c0Var2.k();
                        a0 a0VarN114 = androidx.compose.ui.m.n(c0Var2, a0VarI19);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK19, aVar3.e());
                        y7.n(c0VarD3, b1VarK114, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN114, aVar3.f());
                        y3 y3Var9 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB5 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar9 = cb.a.f82538a;
                        int i29 = com.planner5d.library.contest.e.f.f150195r3;
                        int i210 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB5, 0L, aVar9.a(i29, c0Var2, i210 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var9, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI110 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK110 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK115 = c0Var3.k();
                        a0 a0VarN115 = androidx.compose.ui.m.n(c0Var3, a0VarI110);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK110, aVar3.e());
                        y7.n(c0VarD4, b1VarK115, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN115, aVar3.f());
                        y3 y3Var10 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str118 = str9;
                        wk.o(str118, d0Var.b(aVar4, aVar2.o()), 0L, aVar9.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i210 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var10, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str118;
                        str12 = str8;
                        str13 = str10;
                    }
                    s5VarT = c0Var4.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                str6 = str3;
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH6 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE6 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK116 = c0VarR.k();
                    a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarH6);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE6, aVar3.e());
                    y7.n(c0VarD, b1VarK116, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN116, aVar3.f());
                    y5 y5Var6 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI111 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK117 = c0VarR.k();
                    a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarI111);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK111, aVar3.e());
                    y7.n(c0VarD2, b1VarK117, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN117, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI112 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK112 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK118 = c0VarR.k();
                        a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarI112);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK112, aVar3.e());
                        y7.n(c0VarD5, b1VarK118, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN118, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG6 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str119 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG6, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str119, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str119;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str1110 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str1110, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str1110;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI113 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK113 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK119 = c0Var2.k();
                    a0 a0VarN119 = androidx.compose.ui.m.n(c0Var2, a0VarI113);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK113, aVar3.e());
                    y7.n(c0VarD3, b1VarK119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN119, aVar3.f());
                    y3 y3Var11 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB6 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar10 = cb.a.f82538a;
                    int i211 = com.planner5d.library.contest.e.f.f150195r3;
                    int i212 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB6, 0L, aVar10.a(i211, c0Var2, i212 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI114 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK114 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1110 = c0Var3.k();
                    a0 a0VarN1110 = androidx.compose.ui.m.n(c0Var3, a0VarI114);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK114, aVar3.e());
                    y7.n(c0VarD4, b1VarK1110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1110, aVar3.f());
                    y3 y3Var12 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str1111 = str9;
                    wk.o(str1111, d0Var.b(aVar4, aVar2.o()), 0L, aVar10.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i212 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var12, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str1111;
                    str12 = str8;
                    str13 = str10;
                } else {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH7 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE7 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111 = c0VarR.k();
                    a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarH7);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE7, aVar3.e());
                    y7.n(c0VarD, b1VarK1111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111, aVar3.f());
                    y5 y5Var7 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI115 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK115 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1112 = c0VarR.k();
                    a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarI115);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK115, aVar3.e());
                    y7.n(c0VarD2, b1VarK1112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1112, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI116 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK116 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1113 = c0VarR.k();
                        a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, a0VarI116);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK116, aVar3.e());
                        y7.n(c0VarD5, b1VarK1113, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN1113, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG7 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str1112 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG7, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str1112, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str1112;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str1113 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str1113, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str1113;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI117 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK117 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK1114 = c0Var2.k();
                    a0 a0VarN1114 = androidx.compose.ui.m.n(c0Var2, a0VarI117);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK117, aVar3.e());
                    y7.n(c0VarD3, b1VarK1114, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1114, aVar3.f());
                    y3 y3Var13 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB7 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar11 = cb.a.f82538a;
                    int i213 = com.planner5d.library.contest.e.f.f150195r3;
                    int i214 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB7, 0L, aVar11.a(i213, c0Var2, i214 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var13, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI118 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK118 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1115 = c0Var3.k();
                    a0 a0VarN1115 = androidx.compose.ui.m.n(c0Var3, a0VarI118);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK118, aVar3.e());
                    y7.n(c0VarD4, b1VarK1115, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1115, aVar3.f());
                    y3 y3Var14 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str1114 = str9;
                    wk.o(str1114, d0Var.b(aVar4, aVar2.o()), 0L, aVar11.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i214 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var14, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str1114;
                    str12 = str8;
                    str13 = str10;
                }
                s5VarT = c0Var4.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            num4 = num2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    str5 = str2;
                    if (c0VarR.D(str5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str6 = str3;
                        if (c0VarR.D(str6)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH8 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE8 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1116 = c0VarR.k();
                        a0 a0VarN1116 = androidx.compose.ui.m.n(c0VarR, a0VarH8);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE8, aVar3.e());
                        y7.n(c0VarD, b1VarK1116, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1116, aVar3.f());
                        y5 y5Var8 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI119 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK119 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1117 = c0VarR.k();
                        a0 a0VarN1117 = androidx.compose.ui.m.n(c0VarR, a0VarI119);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK119, aVar3.e());
                        y7.n(c0VarD2, b1VarK1117, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1117, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI1110 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK1110 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK1118 = c0VarR.k();
                            a0 a0VarN1118 = androidx.compose.ui.m.n(c0VarR, a0VarI1110);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK1110, aVar3.e());
                            y7.n(c0VarD5, b1VarK1118, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN1118, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG8 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str1115 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG8, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str1115, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str1115;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str1116 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str1116, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str1116;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI1111 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1111 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK1119 = c0Var2.k();
                        a0 a0VarN1119 = androidx.compose.ui.m.n(c0Var2, a0VarI1111);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK1111, aVar3.e());
                        y7.n(c0VarD3, b1VarK1119, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1119, aVar3.f());
                        y3 y3Var15 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB8 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar12 = cb.a.f82538a;
                        int i215 = com.planner5d.library.contest.e.f.f150195r3;
                        int i216 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB8, 0L, aVar12.a(i215, c0Var2, i216 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var15, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI1112 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1112 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK11110 = c0Var3.k();
                        a0 a0VarN11110 = androidx.compose.ui.m.n(c0Var3, a0VarI1112);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK1112, aVar3.e());
                        y7.n(c0VarD4, b1VarK11110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11110, aVar3.f());
                        y3 y3Var16 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str1117 = str9;
                        wk.o(str1117, d0Var.b(aVar4, aVar2.o()), 0L, aVar12.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i216 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var16, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str1117;
                        str12 = str8;
                        str13 = str10;
                    } else {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH9 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE9 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111 = c0VarR.k();
                        a0 a0VarN11111 = androidx.compose.ui.m.n(c0VarR, a0VarH9);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE9, aVar3.e());
                        y7.n(c0VarD, b1VarK11111, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11111, aVar3.f());
                        y5 y5Var9 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI1113 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK1113 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11112 = c0VarR.k();
                        a0 a0VarN11112 = androidx.compose.ui.m.n(c0VarR, a0VarI1113);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK1113, aVar3.e());
                        y7.n(c0VarD2, b1VarK11112, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN11112, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI1114 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK1114 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK11113 = c0VarR.k();
                            a0 a0VarN11113 = androidx.compose.ui.m.n(c0VarR, a0VarI1114);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK1114, aVar3.e());
                            y7.n(c0VarD5, b1VarK11113, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN11113, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG9 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str1118 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG9, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str1118, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str1118;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str1119 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str1119, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str1119;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI1115 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1115 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK11114 = c0Var2.k();
                        a0 a0VarN11114 = androidx.compose.ui.m.n(c0Var2, a0VarI1115);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK1115, aVar3.e());
                        y7.n(c0VarD3, b1VarK11114, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN11114, aVar3.f());
                        y3 y3Var17 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB9 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar13 = cb.a.f82538a;
                        int i217 = com.planner5d.library.contest.e.f.f150195r3;
                        int i218 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB9, 0L, aVar13.a(i217, c0Var2, i218 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var17, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI1116 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1116 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK11115 = c0Var3.k();
                        a0 a0VarN11115 = androidx.compose.ui.m.n(c0Var3, a0VarI1116);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK1116, aVar3.e());
                        y7.n(c0VarD4, b1VarK11115, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11115, aVar3.f());
                        y3 y3Var18 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str11110 = str9;
                        wk.o(str11110, d0Var.b(aVar4, aVar2.o()), 0L, aVar13.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i218 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var18, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str11110;
                        str12 = str8;
                        str13 = str10;
                    }
                    s5VarT = c0Var4.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                str6 = str3;
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH10 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE10 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11116 = c0VarR.k();
                    a0 a0VarN11116 = androidx.compose.ui.m.n(c0VarR, a0VarH10);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE10, aVar3.e());
                    y7.n(c0VarD, b1VarK11116, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11116, aVar3.f());
                    y5 y5Var10 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI1117 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK1117 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11117 = c0VarR.k();
                    a0 a0VarN11117 = androidx.compose.ui.m.n(c0VarR, a0VarI1117);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK1117, aVar3.e());
                    y7.n(c0VarD2, b1VarK11117, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11117, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI1118 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK1118 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11118 = c0VarR.k();
                        a0 a0VarN11118 = androidx.compose.ui.m.n(c0VarR, a0VarI1118);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK1118, aVar3.e());
                        y7.n(c0VarD5, b1VarK11118, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN11118, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG10 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str11111 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG10, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str11111, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str11111;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str11112 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str11112, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str11112;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI1119 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK1119 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK11119 = c0Var2.k();
                    a0 a0VarN11119 = androidx.compose.ui.m.n(c0Var2, a0VarI1119);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK1119, aVar3.e());
                    y7.n(c0VarD3, b1VarK11119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11119, aVar3.f());
                    y3 y3Var19 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB10 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar14 = cb.a.f82538a;
                    int i219 = com.planner5d.library.contest.e.f.f150195r3;
                    int i2110 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB10, 0L, aVar14.a(i219, c0Var2, i2110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var19, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI11110 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11110 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK111110 = c0Var3.k();
                    a0 a0VarN111110 = androidx.compose.ui.m.n(c0Var3, a0VarI11110);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK11110, aVar3.e());
                    y7.n(c0VarD4, b1VarK111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111110, aVar3.f());
                    y3 y3Var110 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str11113 = str9;
                    wk.o(str11113, d0Var.b(aVar4, aVar2.o()), 0L, aVar14.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var110, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str11113;
                    str12 = str8;
                    str13 = str10;
                } else {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH11 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE11 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111 = c0VarR.k();
                    a0 a0VarN111111 = androidx.compose.ui.m.n(c0VarR, a0VarH11);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE11, aVar3.e());
                    y7.n(c0VarD, b1VarK111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111111, aVar3.f());
                    y5 y5Var11 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI11111 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11111 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111112 = c0VarR.k();
                    a0 a0VarN111112 = androidx.compose.ui.m.n(c0VarR, a0VarI11111);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK11111, aVar3.e());
                    y7.n(c0VarD2, b1VarK111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111112, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI11112 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK11112 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111113 = c0VarR.k();
                        a0 a0VarN111113 = androidx.compose.ui.m.n(c0VarR, a0VarI11112);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK11112, aVar3.e());
                        y7.n(c0VarD5, b1VarK111113, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN111113, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG11 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str11114 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG11, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str11114, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str11114;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str11115 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str11115, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str11115;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI11113 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11113 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK111114 = c0Var2.k();
                    a0 a0VarN111114 = androidx.compose.ui.m.n(c0Var2, a0VarI11113);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK11113, aVar3.e());
                    y7.n(c0VarD3, b1VarK111114, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111114, aVar3.f());
                    y3 y3Var111 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB11 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar15 = cb.a.f82538a;
                    int i2111 = com.planner5d.library.contest.e.f.f150195r3;
                    int i2112 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB11, 0L, aVar15.a(i2111, c0Var2, i2112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI11114 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11114 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK111115 = c0Var3.k();
                    a0 a0VarN111115 = androidx.compose.ui.m.n(c0Var3, a0VarI11114);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK11114, aVar3.e());
                    y7.n(c0VarD4, b1VarK111115, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111115, aVar3.f());
                    y3 y3Var112 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str11116 = str9;
                    wk.o(str11116, d0Var.b(aVar4, aVar2.o()), 0L, aVar15.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var112, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str11116;
                    str12 = str8;
                    str13 = str10;
                }
                s5VarT = c0Var4.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            str5 = str2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str6 = str3;
                    if (c0VarR.D(str6)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH12 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE12 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111116 = c0VarR.k();
                    a0 a0VarN111116 = androidx.compose.ui.m.n(c0VarR, a0VarH12);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE12, aVar3.e());
                    y7.n(c0VarD, b1VarK111116, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111116, aVar3.f());
                    y5 y5Var12 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI11115 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11115 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111117 = c0VarR.k();
                    a0 a0VarN111117 = androidx.compose.ui.m.n(c0VarR, a0VarI11115);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK11115, aVar3.e());
                    y7.n(c0VarD2, b1VarK111117, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111117, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI11116 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK11116 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111118 = c0VarR.k();
                        a0 a0VarN111118 = androidx.compose.ui.m.n(c0VarR, a0VarI11116);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK11116, aVar3.e());
                        y7.n(c0VarD5, b1VarK111118, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN111118, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG12 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str11117 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG12, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str11117, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str11117;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str11118 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str11118, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str11118;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI11117 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11117 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK111119 = c0Var2.k();
                    a0 a0VarN111119 = androidx.compose.ui.m.n(c0Var2, a0VarI11117);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK11117, aVar3.e());
                    y7.n(c0VarD3, b1VarK111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111119, aVar3.f());
                    y3 y3Var113 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB12 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar16 = cb.a.f82538a;
                    int i2113 = com.planner5d.library.contest.e.f.f150195r3;
                    int i2114 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB12, 0L, aVar16.a(i2113, c0Var2, i2114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var113, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI11118 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11118 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1111110 = c0Var3.k();
                    a0 a0VarN1111110 = androidx.compose.ui.m.n(c0Var3, a0VarI11118);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK11118, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111110, aVar3.f());
                    y3 y3Var114 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str11119 = str9;
                    wk.o(str11119, d0Var.b(aVar4, aVar2.o()), 0L, aVar16.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var114, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str11119;
                    str12 = str8;
                    str13 = str10;
                } else {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH13 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE13 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111 = c0VarR.k();
                    a0 a0VarN1111111 = androidx.compose.ui.m.n(c0VarR, a0VarH13);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE13, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111, aVar3.f());
                    y5 y5Var13 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI11119 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11119 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111112 = c0VarR.k();
                    a0 a0VarN1111112 = androidx.compose.ui.m.n(c0VarR, a0VarI11119);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK11119, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111112, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI111110 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK111110 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111113 = c0VarR.k();
                        a0 a0VarN1111113 = androidx.compose.ui.m.n(c0VarR, a0VarI111110);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK111110, aVar3.e());
                        y7.n(c0VarD5, b1VarK1111113, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN1111113, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG13 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str111110 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG13, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str111110, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str111110;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str111111 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str111111, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str111111;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI111111 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK111111 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK1111114 = c0Var2.k();
                    a0 a0VarN1111114 = androidx.compose.ui.m.n(c0Var2, a0VarI111111);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK111111, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111114, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111114, aVar3.f());
                    y3 y3Var115 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB13 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar17 = cb.a.f82538a;
                    int i2115 = com.planner5d.library.contest.e.f.f150195r3;
                    int i2116 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB13, 0L, aVar17.a(i2115, c0Var2, i2116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var115, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI111112 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK111112 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1111115 = c0Var3.k();
                    a0 a0VarN1111115 = androidx.compose.ui.m.n(c0Var3, a0VarI111112);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK111112, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111115, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111115, aVar3.f());
                    y3 y3Var116 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str111112 = str9;
                    wk.o(str111112, d0Var.b(aVar4, aVar2.o()), 0L, aVar17.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var116, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str111112;
                    str12 = str8;
                    str13 = str10;
                }
                s5VarT = c0Var4.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            str6 = str3;
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH14 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE14 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111116 = c0VarR.k();
                a0 a0VarN1111116 = androidx.compose.ui.m.n(c0VarR, a0VarH14);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE14, aVar3.e());
                y7.n(c0VarD, b1VarK1111116, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1111116, aVar3.f());
                y5 y5Var14 = y5.f16577a;
                f10 = 20;
                a0 a0VarI111113 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK111113 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111117 = c0VarR.k();
                a0 a0VarN1111117 = androidx.compose.ui.m.n(c0VarR, a0VarI111113);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK111113, aVar3.e());
                y7.n(c0VarD2, b1VarK1111117, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1111117, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI111114 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111114 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111118 = c0VarR.k();
                    a0 a0VarN1111118 = androidx.compose.ui.m.n(c0VarR, a0VarI111114);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK111114, aVar3.e());
                    y7.n(c0VarD5, b1VarK1111118, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN1111118, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG14 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str111113 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG14, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str111113, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str111113;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str111114 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str111114, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str111114;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI111115 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111115 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK1111119 = c0Var2.k();
                a0 a0VarN1111119 = androidx.compose.ui.m.n(c0Var2, a0VarI111115);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK111115, aVar3.e());
                y7.n(c0VarD3, b1VarK1111119, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN1111119, aVar3.f());
                y3 y3Var117 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB14 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar18 = cb.a.f82538a;
                int i2117 = com.planner5d.library.contest.e.f.f150195r3;
                int i2118 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB14, 0L, aVar18.a(i2117, c0Var2, i2118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var117, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI111116 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111116 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK11111110 = c0Var3.k();
                a0 a0VarN11111110 = androidx.compose.ui.m.n(c0Var3, a0VarI111116);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK111116, aVar3.e());
                y7.n(c0VarD4, b1VarK11111110, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN11111110, aVar3.f());
                y3 y3Var118 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str111115 = str9;
                wk.o(str111115, d0Var.b(aVar4, aVar2.o()), 0L, aVar18.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var118, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str111115;
                str12 = str8;
                str13 = str10;
            } else {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH15 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE15 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111 = c0VarR.k();
                a0 a0VarN11111111 = androidx.compose.ui.m.n(c0VarR, a0VarH15);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE15, aVar3.e());
                y7.n(c0VarD, b1VarK11111111, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111, aVar3.f());
                y5 y5Var15 = y5.f16577a;
                f10 = 20;
                a0 a0VarI111117 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK111117 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111112 = c0VarR.k();
                a0 a0VarN11111112 = androidx.compose.ui.m.n(c0VarR, a0VarI111117);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK111117, aVar3.e());
                y7.n(c0VarD2, b1VarK11111112, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111112, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI111118 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111118 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111113 = c0VarR.k();
                    a0 a0VarN11111113 = androidx.compose.ui.m.n(c0VarR, a0VarI111118);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK111118, aVar3.e());
                    y7.n(c0VarD5, b1VarK11111113, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN11111113, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG15 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str111116 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG15, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str111116, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str111116;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str111117 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str111117, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str111117;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI111119 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111119 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK11111114 = c0Var2.k();
                a0 a0VarN11111114 = androidx.compose.ui.m.n(c0Var2, a0VarI111119);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK111119, aVar3.e());
                y7.n(c0VarD3, b1VarK11111114, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111114, aVar3.f());
                y3 y3Var119 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB15 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar19 = cb.a.f82538a;
                int i2119 = com.planner5d.library.contest.e.f.f150195r3;
                int i21110 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB15, 0L, aVar19.a(i2119, c0Var2, i21110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var119, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI1111110 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK1111110 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK11111115 = c0Var3.k();
                a0 a0VarN11111115 = androidx.compose.ui.m.n(c0Var3, a0VarI1111110);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK1111110, aVar3.e());
                y7.n(c0VarD4, b1VarK11111115, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN11111115, aVar3.f());
                y3 y3Var1110 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str111118 = str9;
                wk.o(str111118, d0Var.b(aVar4, aVar2.o()), 0L, aVar19.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1110, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str111118;
                str12 = str8;
                str13 = str10;
            }
            s5VarT = c0Var4.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        num3 = num;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                num4 = num2;
                if (c0VarR.D(num4)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    str5 = str2;
                    if (c0VarR.D(str5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str6 = str3;
                        if (c0VarR.D(str6)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH16 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE16 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111116 = c0VarR.k();
                        a0 a0VarN11111116 = androidx.compose.ui.m.n(c0VarR, a0VarH16);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE16, aVar3.e());
                        y7.n(c0VarD, b1VarK11111116, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11111116, aVar3.f());
                        y5 y5Var16 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI1111111 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK1111111 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111117 = c0VarR.k();
                        a0 a0VarN11111117 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK1111111, aVar3.e());
                        y7.n(c0VarD2, b1VarK11111117, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN11111117, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI1111112 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK1111112 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK11111118 = c0VarR.k();
                            a0 a0VarN11111118 = androidx.compose.ui.m.n(c0VarR, a0VarI1111112);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK1111112, aVar3.e());
                            y7.n(c0VarD5, b1VarK11111118, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN11111118, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG16 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str111119 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG16, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str111119, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str111119;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str1111110 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str1111110, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str1111110;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI1111113 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1111113 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK11111119 = c0Var2.k();
                        a0 a0VarN11111119 = androidx.compose.ui.m.n(c0Var2, a0VarI1111113);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK1111113, aVar3.e());
                        y7.n(c0VarD3, b1VarK11111119, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN11111119, aVar3.f());
                        y3 y3Var1111 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB16 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar110 = cb.a.f82538a;
                        int i21111 = com.planner5d.library.contest.e.f.f150195r3;
                        int i21112 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB16, 0L, aVar110.a(i21111, c0Var2, i21112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1111, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI1111114 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1111114 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK111111110 = c0Var3.k();
                        a0 a0VarN111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI1111114);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK1111114, aVar3.e());
                        y7.n(c0VarD4, b1VarK111111110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111111110, aVar3.f());
                        y3 y3Var1112 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str1111111 = str9;
                        wk.o(str1111111, d0Var.b(aVar4, aVar2.o()), 0L, aVar110.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1112, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str1111111;
                        str12 = str8;
                        str13 = str10;
                    } else {
                        if (i19 != 0) {
                            str7 = "1";
                        } else {
                            str7 = str4;
                        }
                        if (i20 != 0) {
                            num3 = null;
                        }
                        if (i13 != 0) {
                            num5 = null;
                        } else {
                            num5 = num4;
                        }
                        if (i15 != 0) {
                            str8 = "25";
                        } else {
                            str8 = str5;
                        }
                        if (i17 != 0) {
                            str9 = "35";
                        } else {
                            str9 = str6;
                        }
                        if (m0.l0()) {
                            m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                        }
                        c0VarR.E(878079651);
                        if (num3 == null) {
                            drawableB = null;
                        } else {
                            drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                        }
                        c0VarR.A();
                        c0VarR.E(878081854);
                        if (drawableB == null) {
                            drawableB = null;
                        } else {
                            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                            if (num5 != null) {
                                drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                            }
                        }
                        c0VarR.A();
                        aVar = a0.E;
                        a0 a0VarH17 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarE17 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111111111 = c0VarR.k();
                        a0 a0VarN111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH17);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE17, aVar3.e());
                        y7.n(c0VarD, b1VarK111111111, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN111111111, aVar3.f());
                        y5 y5Var17 = y5.f16577a;
                        f10 = 20;
                        a0 a0VarI1111115 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK1111115 = x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111111112 = c0VarR.k();
                        a0 a0VarN111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI1111115);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarK1111115, aVar3.e());
                        y7.n(c0VarD2, b1VarK111111112, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN111111112, aVar3.f());
                        d0Var = d0.f15956a;
                        if (num3 != null) {
                            c0VarR.E(492004253);
                            a0 a0VarI1111116 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                            a1 a1VarK1111116 = x.k(aVar2.C(), false);
                            iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK111111113 = c0VarR.k();
                            a0 a0VarN111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI1111116);
                            function0A5 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A5);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD5 = y7.d(c0VarR);
                            y7.n(c0VarD5, a1VarK1111116, aVar3.e());
                            y7.n(c0VarD5, b1VarK111111113, aVar3.g());
                            function2B5 = aVar3.b();
                            if (c0VarD5.P()) {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            } else {
                                c0VarD5.Y(Integer.valueOf(iHashCode5));
                                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                            }
                            y7.n(c0VarD5, a0VarN111111113, aVar3.f());
                            androidx.compose.ui.graphics.painter.b bVarG17 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                            aVar4 = aVar;
                            String str1111112 = str7;
                            f11 = f10;
                            r10 = 0;
                            s2.d(bVarG17, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                            wk.o(str1111112, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            c0Var2.A();
                            str10 = str1111112;
                        } else {
                            aVar4 = aVar;
                            f11 = f10;
                            String str1111113 = str7;
                            r10 = 0;
                            c0VarR.E(492418847);
                            wk.o(str1111113, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                            str10 = str1111113;
                            c0Var2 = c0VarR;
                            c0Var2.A();
                        }
                        c0Var2.o();
                        a0 a0VarI1111117 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1111117 = x.k(aVar2.C(), r10);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                        b1 b1VarK111111114 = c0Var2.k();
                        a0 a0VarN111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI1111117);
                        function0A3 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A3);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD3 = y7.d(c0Var2);
                        y7.n(c0VarD3, a1VarK1111117, aVar3.e());
                        y7.n(c0VarD3, b1VarK111111114, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN111111114, aVar3.f());
                        y3 y3Var1113 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        a0 a0VarB17 = d0Var.b(aVar4, aVar2.o());
                        cb.a aVar111 = cb.a.f82538a;
                        int i21113 = com.planner5d.library.contest.e.f.f150195r3;
                        int i21114 = cb.a.f82539b;
                        c0Var3 = c0Var2;
                        wk.o(str8, a0VarB17, 0L, aVar111.a(i21113, c0Var2, i21114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1113, c0Var3, (i12 >> 9) & 14, 0, 65524);
                        c0Var3.o();
                        a0 a0VarI1111118 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                        a1 a1VarK1111118 = x.k(aVar2.C(), r10);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                        b1 b1VarK111111115 = c0Var3.k();
                        a0 a0VarN111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI1111118);
                        function0A4 = aVar3.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarK1111118, aVar3.e());
                        y7.n(c0VarD4, b1VarK111111115, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111111115, aVar3.f());
                        y3 y3Var1114 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                        c0Var4 = c0Var3;
                        String str1111114 = str9;
                        wk.o(str1111114, d0Var.b(aVar4, aVar2.o()), 0L, aVar111.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1114, c0Var4, (i12 >> 12) & 14, 0, 65524);
                        c0Var4.o();
                        c0Var4.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        num6 = num5;
                        num7 = num3;
                        str11 = str1111114;
                        str12 = str8;
                        str13 = str10;
                    }
                    s5VarT = c0Var4.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                str6 = str3;
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH18 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE18 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111116 = c0VarR.k();
                    a0 a0VarN111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH18);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE18, aVar3.e());
                    y7.n(c0VarD, b1VarK111111116, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111111116, aVar3.f());
                    y5 y5Var18 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI1111119 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK1111119 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111117 = c0VarR.k();
                    a0 a0VarN111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI1111119);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK1111119, aVar3.e());
                    y7.n(c0VarD2, b1VarK111111117, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111111117, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI11111110 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK11111110 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111111118 = c0VarR.k();
                        a0 a0VarN111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI11111110);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK11111110, aVar3.e());
                        y7.n(c0VarD5, b1VarK111111118, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN111111118, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG18 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str1111115 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG18, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str1111115, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str1111115;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str1111116 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str1111116, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str1111116;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI11111111 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11111111 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK111111119 = c0Var2.k();
                    a0 a0VarN111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI11111111);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK11111111, aVar3.e());
                    y7.n(c0VarD3, b1VarK111111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111111119, aVar3.f());
                    y3 y3Var1115 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB18 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar112 = cb.a.f82538a;
                    int i21115 = com.planner5d.library.contest.e.f.f150195r3;
                    int i21116 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB18, 0L, aVar112.a(i21115, c0Var2, i21116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1115, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI11111112 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11111112 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1111111110 = c0Var3.k();
                    a0 a0VarN1111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI11111112);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK11111112, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111111110, aVar3.f());
                    y3 y3Var1116 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str1111117 = str9;
                    wk.o(str1111117, d0Var.b(aVar4, aVar2.o()), 0L, aVar112.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1116, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str1111117;
                    str12 = str8;
                    str13 = str10;
                } else {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH19 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE19 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111111 = c0VarR.k();
                    a0 a0VarN1111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH19);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE19, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111111, aVar3.f());
                    y5 y5Var19 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI11111113 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11111113 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111112 = c0VarR.k();
                    a0 a0VarN1111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI11111113);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK11111113, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111112, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI11111114 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK11111114 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111111113 = c0VarR.k();
                        a0 a0VarN1111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI11111114);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK11111114, aVar3.e());
                        y7.n(c0VarD5, b1VarK1111111113, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN1111111113, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG19 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str1111118 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG19, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str1111118, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str1111118;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str1111119 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str1111119, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str1111119;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI11111115 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11111115 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK1111111114 = c0Var2.k();
                    a0 a0VarN1111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI11111115);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK11111115, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111114, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111114, aVar3.f());
                    y3 y3Var1117 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB19 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar113 = cb.a.f82538a;
                    int i21117 = com.planner5d.library.contest.e.f.f150195r3;
                    int i21118 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB19, 0L, aVar113.a(i21117, c0Var2, i21118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1117, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI11111116 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11111116 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1111111115 = c0Var3.k();
                    a0 a0VarN1111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI11111116);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK11111116, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111111115, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111111115, aVar3.f());
                    y3 y3Var1118 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str11111110 = str9;
                    wk.o(str11111110, d0Var.b(aVar4, aVar2.o()), 0L, aVar113.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1118, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str11111110;
                    str12 = str8;
                    str13 = str10;
                }
                s5VarT = c0Var4.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            str5 = str2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str6 = str3;
                    if (c0VarR.D(str6)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH110 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE110 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111116 = c0VarR.k();
                    a0 a0VarN1111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH110);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE110, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111116, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111116, aVar3.f());
                    y5 y5Var110 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI11111117 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11111117 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111117 = c0VarR.k();
                    a0 a0VarN1111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI11111117);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK11111117, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111117, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111117, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI11111118 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK11111118 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111111118 = c0VarR.k();
                        a0 a0VarN1111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI11111118);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK11111118, aVar3.e());
                        y7.n(c0VarD5, b1VarK1111111118, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN1111111118, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG110 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str11111111 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG110, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str11111111, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str11111111;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str11111112 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str11111112, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str11111112;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI11111119 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11111119 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK1111111119 = c0Var2.k();
                    a0 a0VarN1111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI11111119);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK11111119, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111119, aVar3.f());
                    y3 y3Var1119 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB110 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar114 = cb.a.f82538a;
                    int i21119 = com.planner5d.library.contest.e.f.f150195r3;
                    int i211110 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB110, 0L, aVar114.a(i21119, c0Var2, i211110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1119, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI111111110 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK111111110 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK11111111110 = c0Var3.k();
                    a0 a0VarN11111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI111111110);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK111111110, aVar3.e());
                    y7.n(c0VarD4, b1VarK11111111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN11111111110, aVar3.f());
                    y3 y3Var11110 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str11111113 = str9;
                    wk.o(str11111113, d0Var.b(aVar4, aVar2.o()), 0L, aVar114.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i211110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11110, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str11111113;
                    str12 = str8;
                    str13 = str10;
                } else {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH111 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE111 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111111 = c0VarR.k();
                    a0 a0VarN11111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH111);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE111, aVar3.e());
                    y7.n(c0VarD, b1VarK11111111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111111111, aVar3.f());
                    y5 y5Var111 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI111111111 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111111111 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111112 = c0VarR.k();
                    a0 a0VarN11111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI111111111);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK111111111, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111111112, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI111111112 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK111111112 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111111113 = c0VarR.k();
                        a0 a0VarN11111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI111111112);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK111111112, aVar3.e());
                        y7.n(c0VarD5, b1VarK11111111113, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN11111111113, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG111 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str11111114 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG111, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str11111114, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str11111114;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str11111115 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str11111115, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str11111115;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI111111113 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK111111113 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK11111111114 = c0Var2.k();
                    a0 a0VarN11111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI111111113);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK111111113, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111111114, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111111114, aVar3.f());
                    y3 y3Var11111 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB111 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar115 = cb.a.f82538a;
                    int i211111 = com.planner5d.library.contest.e.f.f150195r3;
                    int i211112 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB111, 0L, aVar115.a(i211111, c0Var2, i211112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11111, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI111111114 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK111111114 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK11111111115 = c0Var3.k();
                    a0 a0VarN11111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI111111114);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK111111114, aVar3.e());
                    y7.n(c0VarD4, b1VarK11111111115, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN11111111115, aVar3.f());
                    y3 y3Var11112 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str11111116 = str9;
                    wk.o(str11111116, d0Var.b(aVar4, aVar2.o()), 0L, aVar115.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i211112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11112, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str11111116;
                    str12 = str8;
                    str13 = str10;
                }
                s5VarT = c0Var4.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            str6 = str3;
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH112 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE112 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111116 = c0VarR.k();
                a0 a0VarN11111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH112);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE112, aVar3.e());
                y7.n(c0VarD, b1VarK11111111116, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111116, aVar3.f());
                y5 y5Var112 = y5.f16577a;
                f10 = 20;
                a0 a0VarI111111115 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK111111115 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111117 = c0VarR.k();
                a0 a0VarN11111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI111111115);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK111111115, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111117, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111117, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI111111116 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111111116 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111118 = c0VarR.k();
                    a0 a0VarN11111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI111111116);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK111111116, aVar3.e());
                    y7.n(c0VarD5, b1VarK11111111118, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN11111111118, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG112 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str11111117 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG112, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str11111117, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str11111117;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str11111118 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str11111118, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str11111118;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI111111117 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111111117 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK11111111119 = c0Var2.k();
                a0 a0VarN11111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI111111117);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK111111117, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111119, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111119, aVar3.f());
                y3 y3Var11113 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB112 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar116 = cb.a.f82538a;
                int i211113 = com.planner5d.library.contest.e.f.f150195r3;
                int i211114 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB112, 0L, aVar116.a(i211113, c0Var2, i211114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11113, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI111111118 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111111118 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK111111111110 = c0Var3.k();
                a0 a0VarN111111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI111111118);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK111111118, aVar3.e());
                y7.n(c0VarD4, b1VarK111111111110, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN111111111110, aVar3.f());
                y3 y3Var11114 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str11111119 = str9;
                wk.o(str11111119, d0Var.b(aVar4, aVar2.o()), 0L, aVar116.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i211114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11114, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str11111119;
                str12 = str8;
                str13 = str10;
            } else {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH113 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE113 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111111 = c0VarR.k();
                a0 a0VarN111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH113);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE113, aVar3.e());
                y7.n(c0VarD, b1VarK111111111111, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111111111, aVar3.f());
                y5 y5Var113 = y5.f16577a;
                f10 = 20;
                a0 a0VarI111111119 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK111111119 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111112 = c0VarR.k();
                a0 a0VarN111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI111111119);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK111111119, aVar3.e());
                y7.n(c0VarD2, b1VarK111111111112, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111111112, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI1111111110 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK1111111110 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111113 = c0VarR.k();
                    a0 a0VarN111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111110);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK1111111110, aVar3.e());
                    y7.n(c0VarD5, b1VarK111111111113, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN111111111113, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG113 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str111111110 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG113, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str111111110, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str111111110;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str111111111 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str111111111, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str111111111;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI1111111111 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK1111111111 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK111111111114 = c0Var2.k();
                a0 a0VarN111111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI1111111111);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK1111111111, aVar3.e());
                y7.n(c0VarD3, b1VarK111111111114, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111111114, aVar3.f());
                y3 y3Var11115 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB113 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar117 = cb.a.f82538a;
                int i211115 = com.planner5d.library.contest.e.f.f150195r3;
                int i211116 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB113, 0L, aVar117.a(i211115, c0Var2, i211116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11115, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI1111111112 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK1111111112 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK111111111115 = c0Var3.k();
                a0 a0VarN111111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI1111111112);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK1111111112, aVar3.e());
                y7.n(c0VarD4, b1VarK111111111115, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN111111111115, aVar3.f());
                y3 y3Var11116 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str111111112 = str9;
                wk.o(str111111112, d0Var.b(aVar4, aVar2.o()), 0L, aVar117.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i211116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11116, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str111111112;
                str12 = str8;
                str13 = str10;
            }
            s5VarT = c0Var4.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        num4 = num2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                str5 = str2;
                if (c0VarR.D(str5)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str6 = str3;
                    if (c0VarR.D(str6)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH114 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE114 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111116 = c0VarR.k();
                    a0 a0VarN111111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH114);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE114, aVar3.e());
                    y7.n(c0VarD, b1VarK111111111116, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111111111116, aVar3.f());
                    y5 y5Var114 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI1111111113 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK1111111113 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111117 = c0VarR.k();
                    a0 a0VarN111111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111113);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK1111111113, aVar3.e());
                    y7.n(c0VarD2, b1VarK111111111117, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111111111117, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI1111111114 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK1111111114 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111111111118 = c0VarR.k();
                        a0 a0VarN111111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111114);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK1111111114, aVar3.e());
                        y7.n(c0VarD5, b1VarK111111111118, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN111111111118, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG114 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str111111113 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG114, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str111111113, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str111111113;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str111111114 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str111111114, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str111111114;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI1111111115 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK1111111115 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK111111111119 = c0Var2.k();
                    a0 a0VarN111111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI1111111115);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK1111111115, aVar3.e());
                    y7.n(c0VarD3, b1VarK111111111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111111111119, aVar3.f());
                    y3 y3Var11117 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB114 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar118 = cb.a.f82538a;
                    int i211117 = com.planner5d.library.contest.e.f.f150195r3;
                    int i211118 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB114, 0L, aVar118.a(i211117, c0Var2, i211118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11117, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI1111111116 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK1111111116 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1111111111110 = c0Var3.k();
                    a0 a0VarN1111111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI1111111116);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK1111111116, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111111111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111111111110, aVar3.f());
                    y3 y3Var11118 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str111111115 = str9;
                    wk.o(str111111115, d0Var.b(aVar4, aVar2.o()), 0L, aVar118.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i211118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11118, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str111111115;
                    str12 = str8;
                    str13 = str10;
                } else {
                    if (i19 != 0) {
                        str7 = "1";
                    } else {
                        str7 = str4;
                    }
                    if (i20 != 0) {
                        num3 = null;
                    }
                    if (i13 != 0) {
                        num5 = null;
                    } else {
                        num5 = num4;
                    }
                    if (i15 != 0) {
                        str8 = "25";
                    } else {
                        str8 = str5;
                    }
                    if (i17 != 0) {
                        str9 = "35";
                    } else {
                        str9 = str6;
                    }
                    if (m0.l0()) {
                        m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                    }
                    c0VarR.E(878079651);
                    if (num3 == null) {
                        drawableB = null;
                    } else {
                        drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                    }
                    c0VarR.A();
                    c0VarR.E(878081854);
                    if (drawableB == null) {
                        drawableB = null;
                    } else {
                        context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        if (num5 != null) {
                            drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                        }
                    }
                    c0VarR.A();
                    aVar = a0.E;
                    a0 a0VarH115 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarE115 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111111111 = c0VarR.k();
                    a0 a0VarN1111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH115);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE115, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111111111, aVar3.f());
                    y5 y5Var115 = y5.f16577a;
                    f10 = 20;
                    a0 a0VarI1111111117 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK1111111117 = x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111111112 = c0VarR.k();
                    a0 a0VarN1111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111117);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarK1111111117, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111111112, aVar3.f());
                    d0Var = d0.f15956a;
                    if (num3 != null) {
                        c0VarR.E(492004253);
                        a0 a0VarI1111111118 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                        a1 a1VarK1111111118 = x.k(aVar2.C(), false);
                        iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111111111113 = c0VarR.k();
                        a0 a0VarN1111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111118);
                        function0A5 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A5);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD5 = y7.d(c0VarR);
                        y7.n(c0VarD5, a1VarK1111111118, aVar3.e());
                        y7.n(c0VarD5, b1VarK1111111111113, aVar3.g());
                        function2B5 = aVar3.b();
                        if (c0VarD5.P()) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        } else {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN1111111111113, aVar3.f());
                        androidx.compose.ui.graphics.painter.b bVarG115 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                        aVar4 = aVar;
                        String str111111116 = str7;
                        f11 = f10;
                        r10 = 0;
                        s2.d(bVarG115, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                        wk.o(str111111116, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        c0Var2.A();
                        str10 = str111111116;
                    } else {
                        aVar4 = aVar;
                        f11 = f10;
                        String str111111117 = str7;
                        r10 = 0;
                        c0VarR.E(492418847);
                        wk.o(str111111117, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                        str10 = str111111117;
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    c0Var2.o();
                    a0 a0VarI1111111119 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK1111111119 = x.k(aVar2.C(), r10);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                    b1 b1VarK1111111111114 = c0Var2.k();
                    a0 a0VarN1111111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI1111111119);
                    function0A3 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A3);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD3 = y7.d(c0Var2);
                    y7.n(c0VarD3, a1VarK1111111119, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111111114, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111111114, aVar3.f());
                    y3 y3Var11119 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    a0 a0VarB115 = d0Var.b(aVar4, aVar2.o());
                    cb.a aVar119 = cb.a.f82538a;
                    int i211119 = com.planner5d.library.contest.e.f.f150195r3;
                    int i2111110 = cb.a.f82539b;
                    c0Var3 = c0Var2;
                    wk.o(str8, a0VarB115, 0L, aVar119.a(i211119, c0Var2, i2111110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var11119, c0Var3, (i12 >> 9) & 14, 0, 65524);
                    c0Var3.o();
                    a0 a0VarI11111111110 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                    a1 a1VarK11111111110 = x.k(aVar2.C(), r10);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                    b1 b1VarK1111111111115 = c0Var3.k();
                    a0 a0VarN1111111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI11111111110);
                    function0A4 = aVar3.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A4);
                    } else {
                        c0Var3.l();
                    }
                    c0VarD4 = y7.d(c0Var3);
                    y7.n(c0VarD4, a1VarK11111111110, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111111111115, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111111111115, aVar3.f());
                    y3 y3Var111110 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                    c0Var4 = c0Var3;
                    String str111111118 = str9;
                    wk.o(str111111118, d0Var.b(aVar4, aVar2.o()), 0L, aVar119.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2111110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111110, c0Var4, (i12 >> 12) & 14, 0, 65524);
                    c0Var4.o();
                    c0Var4.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    num6 = num5;
                    num7 = num3;
                    str11 = str111111118;
                    str12 = str8;
                    str13 = str10;
                }
                s5VarT = c0Var4.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            str6 = str3;
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH116 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE116 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111116 = c0VarR.k();
                a0 a0VarN1111111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH116);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE116, aVar3.e());
                y7.n(c0VarD, b1VarK1111111111116, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1111111111116, aVar3.f());
                y5 y5Var116 = y5.f16577a;
                f10 = 20;
                a0 a0VarI11111111111 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK11111111111 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111117 = c0VarR.k();
                a0 a0VarN1111111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI11111111111);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK11111111111, aVar3.e());
                y7.n(c0VarD2, b1VarK1111111111117, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1111111111117, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI11111111112 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11111111112 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111111118 = c0VarR.k();
                    a0 a0VarN1111111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI11111111112);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK11111111112, aVar3.e());
                    y7.n(c0VarD5, b1VarK1111111111118, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN1111111111118, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG116 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str111111119 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG116, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str111111119, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str111111119;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str1111111110 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str1111111110, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str1111111110;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI11111111113 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK11111111113 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK1111111111119 = c0Var2.k();
                a0 a0VarN1111111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI11111111113);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK11111111113, aVar3.e());
                y7.n(c0VarD3, b1VarK1111111111119, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN1111111111119, aVar3.f());
                y3 y3Var111111 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB116 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar1110 = cb.a.f82538a;
                int i2111111 = com.planner5d.library.contest.e.f.f150195r3;
                int i2111112 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB116, 0L, aVar1110.a(i2111111, c0Var2, i2111112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111111, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI11111111114 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK11111111114 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK11111111111110 = c0Var3.k();
                a0 a0VarN11111111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI11111111114);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK11111111114, aVar3.e());
                y7.n(c0VarD4, b1VarK11111111111110, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN11111111111110, aVar3.f());
                y3 y3Var111112 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str1111111111 = str9;
                wk.o(str1111111111, d0Var.b(aVar4, aVar2.o()), 0L, aVar1110.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2111112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111112, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str1111111111;
                str12 = str8;
                str13 = str10;
            } else {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH117 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE117 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111111111 = c0VarR.k();
                a0 a0VarN11111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH117);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE117, aVar3.e());
                y7.n(c0VarD, b1VarK11111111111111, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111111111, aVar3.f());
                y5 y5Var117 = y5.f16577a;
                f10 = 20;
                a0 a0VarI11111111115 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK11111111115 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111111112 = c0VarR.k();
                a0 a0VarN11111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI11111111115);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK11111111115, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111111112, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111111112, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI11111111116 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK11111111116 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111111113 = c0VarR.k();
                    a0 a0VarN11111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI11111111116);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK11111111116, aVar3.e());
                    y7.n(c0VarD5, b1VarK11111111111113, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN11111111111113, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG117 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str1111111112 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG117, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str1111111112, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str1111111112;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str1111111113 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str1111111113, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str1111111113;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI11111111117 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK11111111117 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK11111111111114 = c0Var2.k();
                a0 a0VarN11111111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI11111111117);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK11111111117, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111111114, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111111114, aVar3.f());
                y3 y3Var111113 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB117 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar1111 = cb.a.f82538a;
                int i2111113 = com.planner5d.library.contest.e.f.f150195r3;
                int i2111114 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB117, 0L, aVar1111.a(i2111113, c0Var2, i2111114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111113, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI11111111118 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK11111111118 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK11111111111115 = c0Var3.k();
                a0 a0VarN11111111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI11111111118);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK11111111118, aVar3.e());
                y7.n(c0VarD4, b1VarK11111111111115, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN11111111111115, aVar3.f());
                y3 y3Var111114 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str1111111114 = str9;
                wk.o(str1111111114, d0Var.b(aVar4, aVar2.o()), 0L, aVar1111.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2111114 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111114, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str1111111114;
                str12 = str8;
                str13 = str10;
            }
            s5VarT = c0Var4.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        str5 = str2;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                str6 = str3;
                if (c0VarR.D(str6)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) == 9362) {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH118 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE118 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111111116 = c0VarR.k();
                a0 a0VarN11111111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH118);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE118, aVar3.e());
                y7.n(c0VarD, b1VarK11111111111116, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111111116, aVar3.f());
                y5 y5Var118 = y5.f16577a;
                f10 = 20;
                a0 a0VarI11111111119 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK11111111119 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111111117 = c0VarR.k();
                a0 a0VarN11111111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI11111111119);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK11111111119, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111111117, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111111117, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI111111111110 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111111111110 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111111118 = c0VarR.k();
                    a0 a0VarN11111111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI111111111110);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK111111111110, aVar3.e());
                    y7.n(c0VarD5, b1VarK11111111111118, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN11111111111118, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG118 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str1111111115 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG118, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str1111111115, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str1111111115;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str1111111116 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str1111111116, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str1111111116;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI111111111111 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111111111111 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK11111111111119 = c0Var2.k();
                a0 a0VarN11111111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI111111111111);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK111111111111, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111111119, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111111119, aVar3.f());
                y3 y3Var111115 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB118 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar1112 = cb.a.f82538a;
                int i2111115 = com.planner5d.library.contest.e.f.f150195r3;
                int i2111116 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB118, 0L, aVar1112.a(i2111115, c0Var2, i2111116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111115, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI111111111112 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111111111112 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK111111111111110 = c0Var3.k();
                a0 a0VarN111111111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI111111111112);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK111111111112, aVar3.e());
                y7.n(c0VarD4, b1VarK111111111111110, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN111111111111110, aVar3.f());
                y3 y3Var111116 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str1111111117 = str9;
                wk.o(str1111111117, d0Var.b(aVar4, aVar2.o()), 0L, aVar1112.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2111116 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111116, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str1111111117;
                str12 = str8;
                str13 = str10;
            } else {
                if (i19 != 0) {
                    str7 = "1";
                } else {
                    str7 = str4;
                }
                if (i20 != 0) {
                    num3 = null;
                }
                if (i13 != 0) {
                    num5 = null;
                } else {
                    num5 = num4;
                }
                if (i15 != 0) {
                    str8 = "25";
                } else {
                    str8 = str5;
                }
                if (i17 != 0) {
                    str9 = "35";
                } else {
                    str9 = str6;
                }
                if (m0.l0()) {
                    m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
                }
                c0VarR.E(878079651);
                if (num3 == null) {
                    drawableB = null;
                } else {
                    drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
                }
                c0VarR.A();
                c0VarR.E(878081854);
                if (drawableB == null) {
                    drawableB = null;
                } else {
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    if (num5 != null) {
                        drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                c0VarR.A();
                aVar = a0.E;
                a0 a0VarH119 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarE119 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111111111 = c0VarR.k();
                a0 a0VarN111111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH119);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE119, aVar3.e());
                y7.n(c0VarD, b1VarK111111111111111, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111111111111, aVar3.f());
                y5 y5Var119 = y5.f16577a;
                f10 = 20;
                a0 a0VarI111111111113 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK111111111113 = x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111111112 = c0VarR.k();
                a0 a0VarN111111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI111111111113);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarK111111111113, aVar3.e());
                y7.n(c0VarD2, b1VarK111111111111112, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111111111112, aVar3.f());
                d0Var = d0.f15956a;
                if (num3 != null) {
                    c0VarR.E(492004253);
                    a0 a0VarI111111111114 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarK111111111114 = x.k(aVar2.C(), false);
                    iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111111113 = c0VarR.k();
                    a0 a0VarN111111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI111111111114);
                    function0A5 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A5);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD5 = y7.d(c0VarR);
                    y7.n(c0VarD5, a1VarK111111111114, aVar3.e());
                    y7.n(c0VarD5, b1VarK111111111111113, aVar3.g());
                    function2B5 = aVar3.b();
                    if (c0VarD5.P()) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    } else {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN111111111111113, aVar3.f());
                    androidx.compose.ui.graphics.painter.b bVarG119 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                    aVar4 = aVar;
                    String str1111111118 = str7;
                    f11 = f10;
                    r10 = 0;
                    s2.d(bVarG119, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                    wk.o(str1111111118, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    str10 = str1111111118;
                } else {
                    aVar4 = aVar;
                    f11 = f10;
                    String str1111111119 = str7;
                    r10 = 0;
                    c0VarR.E(492418847);
                    wk.o(str1111111119, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                    str10 = str1111111119;
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                c0Var2.o();
                a0 a0VarI111111111115 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111111111115 = x.k(aVar2.C(), r10);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
                b1 b1VarK111111111111114 = c0Var2.k();
                a0 a0VarN111111111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI111111111115);
                function0A3 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarK111111111115, aVar3.e());
                y7.n(c0VarD3, b1VarK111111111111114, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111111111114, aVar3.f());
                y3 y3Var111117 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                a0 a0VarB119 = d0Var.b(aVar4, aVar2.o());
                cb.a aVar1113 = cb.a.f82538a;
                int i2111117 = com.planner5d.library.contest.e.f.f150195r3;
                int i2111118 = cb.a.f82539b;
                c0Var3 = c0Var2;
                wk.o(str8, a0VarB119, 0L, aVar1113.a(i2111117, c0Var2, i2111118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111117, c0Var3, (i12 >> 9) & 14, 0, 65524);
                c0Var3.o();
                a0 a0VarI111111111116 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarK111111111116 = x.k(aVar2.C(), r10);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
                b1 b1VarK111111111111115 = c0Var3.k();
                a0 a0VarN111111111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI111111111116);
                function0A4 = aVar3.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A4);
                } else {
                    c0Var3.l();
                }
                c0VarD4 = y7.d(c0Var3);
                y7.n(c0VarD4, a1VarK111111111116, aVar3.e());
                y7.n(c0VarD4, b1VarK111111111111115, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN111111111111115, aVar3.f());
                y3 y3Var111118 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
                c0Var4 = c0Var3;
                String str11111111110 = str9;
                wk.o(str11111111110, d0Var.b(aVar4, aVar2.o()), 0L, aVar1113.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i2111118 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111118, c0Var4, (i12 >> 12) & 14, 0, 65524);
                c0Var4.o();
                c0Var4.o();
                if (m0.l0()) {
                    m0.z0();
                }
                num6 = num5;
                num7 = num3;
                str11 = str11111111110;
                str12 = str8;
                str13 = str10;
            }
            s5VarT = c0Var4.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        str6 = str3;
        if ((i12 & 9363) == 9362) {
            if (i19 != 0) {
                str7 = "1";
            } else {
                str7 = str4;
            }
            if (i20 != 0) {
                num3 = null;
            }
            if (i13 != 0) {
                num5 = null;
            } else {
                num5 = num4;
            }
            if (i15 != 0) {
                str8 = "25";
            } else {
                str8 = str5;
            }
            if (i17 != 0) {
                str9 = "35";
            } else {
                str9 = str6;
            }
            if (m0.l0()) {
                m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
            }
            c0VarR.E(878079651);
            if (num3 == null) {
                drawableB = null;
            } else {
                drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
            }
            c0VarR.A();
            c0VarR.E(878081854);
            if (drawableB == null) {
                drawableB = null;
            } else {
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                if (num5 != null) {
                    drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                }
            }
            c0VarR.A();
            aVar = a0.E;
            a0 a0VarH1110 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarE1110 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111111116 = c0VarR.k();
            a0 a0VarN111111111111116 = androidx.compose.ui.m.n(c0VarR, a0VarH1110);
            aVar3 = androidx.compose.ui.node.g.I;
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
            y7.n(c0VarD, a1VarE1110, aVar3.e());
            y7.n(c0VarD, b1VarK111111111111116, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN111111111111116, aVar3.f());
            y5 y5Var1110 = y5.f16577a;
            f10 = 20;
            a0 a0VarI111111111117 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
            a1 a1VarK111111111117 = x.k(aVar2.C(), false);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111111117 = c0VarR.k();
            a0 a0VarN111111111111117 = androidx.compose.ui.m.n(c0VarR, a0VarI111111111117);
            function0A2 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarK111111111117, aVar3.e());
            y7.n(c0VarD2, b1VarK111111111111117, aVar3.g());
            function2B2 = aVar3.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN111111111111117, aVar3.f());
            d0Var = d0.f15956a;
            if (num3 != null) {
                c0VarR.E(492004253);
                a0 a0VarI111111111118 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK111111111118 = x.k(aVar2.C(), false);
                iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111111118 = c0VarR.k();
                a0 a0VarN111111111111118 = androidx.compose.ui.m.n(c0VarR, a0VarI111111111118);
                function0A5 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A5);
                } else {
                    c0VarR.l();
                }
                c0VarD5 = y7.d(c0VarR);
                y7.n(c0VarD5, a1VarK111111111118, aVar3.e());
                y7.n(c0VarD5, b1VarK111111111111118, aVar3.g());
                function2B5 = aVar3.b();
                if (c0VarD5.P()) {
                    c0VarD5.Y(Integer.valueOf(iHashCode5));
                    c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                } else {
                    c0VarD5.Y(Integer.valueOf(iHashCode5));
                    c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                }
                y7.n(c0VarD5, a0VarN111111111111118, aVar3.f());
                androidx.compose.ui.graphics.painter.b bVarG1110 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                aVar4 = aVar;
                String str11111111111 = str7;
                f11 = f10;
                r10 = 0;
                s2.d(bVarG1110, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                wk.o(str11111111111, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                c0Var2 = c0VarR;
                c0Var2.o();
                c0Var2.A();
                str10 = str11111111111;
            } else {
                aVar4 = aVar;
                f11 = f10;
                String str11111111112 = str7;
                r10 = 0;
                c0VarR.E(492418847);
                wk.o(str11111111112, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                str10 = str11111111112;
                c0Var2 = c0VarR;
                c0Var2.A();
            }
            c0Var2.o();
            a0 a0VarI111111111119 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
            a1 a1VarK111111111119 = x.k(aVar2.C(), r10);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
            b1 b1VarK111111111111119 = c0Var2.k();
            a0 a0VarN111111111111119 = androidx.compose.ui.m.n(c0Var2, a0VarI111111111119);
            function0A3 = aVar3.a();
            if (c0Var2.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var2.q();
            if (c0Var2.P()) {
                c0Var2.q0(function0A3);
            } else {
                c0Var2.l();
            }
            c0VarD3 = y7.d(c0Var2);
            y7.n(c0VarD3, a1VarK111111111119, aVar3.e());
            y7.n(c0VarD3, b1VarK111111111111119, aVar3.g());
            function2B3 = aVar3.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN111111111111119, aVar3.f());
            y3 y3Var111119 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
            a0 a0VarB1110 = d0Var.b(aVar4, aVar2.o());
            cb.a aVar1114 = cb.a.f82538a;
            int i2111119 = com.planner5d.library.contest.e.f.f150195r3;
            int i21111110 = cb.a.f82539b;
            c0Var3 = c0Var2;
            wk.o(str8, a0VarB1110, 0L, aVar1114.a(i2111119, c0Var2, i21111110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var111119, c0Var3, (i12 >> 9) & 14, 0, 65524);
            c0Var3.o();
            a0 a0VarI1111111111110 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
            a1 a1VarK1111111111110 = x.k(aVar2.C(), r10);
            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
            b1 b1VarK1111111111111110 = c0Var3.k();
            a0 a0VarN1111111111111110 = androidx.compose.ui.m.n(c0Var3, a0VarI1111111111110);
            function0A4 = aVar3.a();
            if (c0Var3.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var3.q();
            if (c0Var3.P()) {
                c0Var3.q0(function0A4);
            } else {
                c0Var3.l();
            }
            c0VarD4 = y7.d(c0Var3);
            y7.n(c0VarD4, a1VarK1111111111110, aVar3.e());
            y7.n(c0VarD4, b1VarK1111111111111110, aVar3.g());
            function2B4 = aVar3.b();
            if (c0VarD4.P()) {
                c0VarD4.Y(Integer.valueOf(iHashCode4));
                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
            } else {
                c0VarD4.Y(Integer.valueOf(iHashCode4));
                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
            }
            y7.n(c0VarD4, a0VarN1111111111111110, aVar3.f());
            y3 y3Var1111110 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
            c0Var4 = c0Var3;
            String str11111111113 = str9;
            wk.o(str11111111113, d0Var.b(aVar4, aVar2.o()), 0L, aVar1114.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21111110 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1111110, c0Var4, (i12 >> 12) & 14, 0, 65524);
            c0Var4.o();
            c0Var4.o();
            if (m0.l0()) {
                m0.z0();
            }
            num6 = num5;
            num7 = num3;
            str11 = str11111111113;
            str12 = str8;
            str13 = str10;
        } else {
            if (i19 != 0) {
                str7 = "1";
            } else {
                str7 = str4;
            }
            if (i20 != 0) {
                num3 = null;
            }
            if (i13 != 0) {
                num5 = null;
            } else {
                num5 = num4;
            }
            if (i15 != 0) {
                str8 = "25";
            } else {
                str8 = str5;
            }
            if (i17 != 0) {
                str9 = "35";
            } else {
                str9 = str6;
            }
            if (m0.l0()) {
                m0.A0(96329389, i12, -1, "com.planner5d.library.contest.view.rules.ContestPrizeRow (ContestPrizes.kt:74)");
            }
            c0VarR.E(878079651);
            if (num3 == null) {
                drawableB = null;
            } else {
                drawableB = j.a.b((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), num3.intValue());
            }
            c0VarR.A();
            c0VarR.E(878081854);
            if (drawableB == null) {
                drawableB = null;
            } else {
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                if (num5 != null) {
                    drawableB.setColorFilter(new PorterDuffColorFilter(androidx.core.content.d.g(context, num5.intValue()), PorterDuff.Mode.SRC_ATOP));
                }
            }
            c0VarR.A();
            aVar = a0.E;
            a0 a0VarH1111 = i6.h(i6.i(d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Gf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40)), 0.0f, 1, null);
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarE1111 = u5.e(q.f16330a.u(), aVar2.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111111111 = c0VarR.k();
            a0 a0VarN1111111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarH1111);
            aVar3 = androidx.compose.ui.node.g.I;
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
            y7.n(c0VarD, a1VarE1111, aVar3.e());
            y7.n(c0VarD, b1VarK1111111111111111, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111111111111111, aVar3.f());
            y5 y5Var1111 = y5.f16577a;
            f10 = 20;
            a0 a0VarI1111111111111 = i6.i(i6.B(aVar, u0.f.b(com.planner5d.library.contest.e.f.B1, c0VarR, 0)), androidx.compose.ui.unit.h.r(f10));
            a1 a1VarK1111111111111 = x.k(aVar2.C(), false);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111111112 = c0VarR.k();
            a0 a0VarN1111111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111111111);
            function0A2 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarK1111111111111, aVar3.e());
            y7.n(c0VarD2, b1VarK1111111111111112, aVar3.g());
            function2B2 = aVar3.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1111111111111112, aVar3.f());
            d0Var = d0.f15956a;
            if (num3 != null) {
                c0VarR.E(492004253);
                a0 a0VarI1111111111112 = i6.i(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarK1111111111112 = x.k(aVar2.C(), false);
                iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111111113 = c0VarR.k();
                a0 a0VarN1111111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarI1111111111112);
                function0A5 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A5);
                } else {
                    c0VarR.l();
                }
                c0VarD5 = y7.d(c0VarR);
                y7.n(c0VarD5, a1VarK1111111111112, aVar3.e());
                y7.n(c0VarD5, b1VarK1111111111111113, aVar3.g());
                function2B5 = aVar3.b();
                if (c0VarD5.P()) {
                    c0VarD5.Y(Integer.valueOf(iHashCode5));
                    c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                } else {
                    c0VarD5.Y(Integer.valueOf(iHashCode5));
                    c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                }
                y7.n(c0VarD5, a0VarN1111111111111113, aVar3.f());
                androidx.compose.ui.graphics.painter.b bVarG1111 = com.google.accompanist.drawablepainter.c.g(drawableB, c0VarR, 0);
                aVar4 = aVar;
                String str11111111114 = str7;
                f11 = f10;
                r10 = 0;
                s2.d(bVarG1111, "Contest price rank", null, null, null, 0.0f, null, c0VarR, 48, 124);
                wk.o(str11111111114, d0Var.b(aVar4, aVar2.i()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, v0.f41742b.k(), null, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Lm, c0VarR, 0), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 0, 65492);
                c0Var2 = c0VarR;
                c0Var2.o();
                c0Var2.A();
                str10 = str11111111114;
            } else {
                aVar4 = aVar;
                f11 = f10;
                String str11111111115 = str7;
                r10 = 0;
                c0VarR.E(492418847);
                wk.o(str11111111115, d0Var.b(aVar4, aVar2.o()), 0L, cb.a.f82538a.a(com.planner5d.library.contest.e.f.f150195r3, c0VarR, cb.a.f82539b << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, i12 & 14, 0, 131060);
                str10 = str11111111115;
                c0Var2 = c0VarR;
                c0Var2.A();
            }
            c0Var2.o();
            a0 a0VarI1111111111113 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var2, r10)), androidx.compose.ui.unit.h.r(f11));
            a1 a1VarK1111111111113 = x.k(aVar2.C(), r10);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, r10));
            b1 b1VarK1111111111111114 = c0Var2.k();
            a0 a0VarN1111111111111114 = androidx.compose.ui.m.n(c0Var2, a0VarI1111111111113);
            function0A3 = aVar3.a();
            if (c0Var2.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var2.q();
            if (c0Var2.P()) {
                c0Var2.q0(function0A3);
            } else {
                c0Var2.l();
            }
            c0VarD3 = y7.d(c0Var2);
            y7.n(c0VarD3, a1VarK1111111111113, aVar3.e());
            y7.n(c0VarD3, b1VarK1111111111111114, aVar3.g());
            function2B3 = aVar3.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN1111111111111114, aVar3.f());
            y3 y3Var1111111 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var2, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
            a0 a0VarB1111 = d0Var.b(aVar4, aVar2.o());
            cb.a aVar1115 = cb.a.f82538a;
            int i21111111 = com.planner5d.library.contest.e.f.f150195r3;
            int i21111112 = cb.a.f82539b;
            c0Var3 = c0Var2;
            wk.o(str8, a0VarB1111, 0L, aVar1115.a(i21111111, c0Var2, i21111112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1111111, c0Var3, (i12 >> 9) & 14, 0, 65524);
            c0Var3.o();
            a0 a0VarI1111111111114 = i6.i(i6.B(aVar4, u0.f.b(com.planner5d.library.contest.e.f.B1, c0Var3, r10)), androidx.compose.ui.unit.h.r(f11));
            a1 a1VarK1111111111114 = x.k(aVar2.C(), r10);
            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, r10));
            b1 b1VarK1111111111111115 = c0Var3.k();
            a0 a0VarN1111111111111115 = androidx.compose.ui.m.n(c0Var3, a0VarI1111111111114);
            function0A4 = aVar3.a();
            if (c0Var3.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var3.q();
            if (c0Var3.P()) {
                c0Var3.q0(function0A4);
            } else {
                c0Var3.l();
            }
            c0VarD4 = y7.d(c0Var3);
            y7.n(c0VarD4, a1VarK1111111111114, aVar3.e());
            y7.n(c0VarD4, b1VarK1111111111111115, aVar3.g());
            function2B4 = aVar3.b();
            if (c0VarD4.P()) {
                c0VarD4.Y(Integer.valueOf(iHashCode4));
                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
            } else {
                c0VarD4.Y(Integer.valueOf(iHashCode4));
                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
            }
            y7.n(c0VarD4, a0VarN1111111111111115, aVar3.f());
            y3 y3Var1111112 = new y3(u0.a.a(com.planner5d.library.contest.e.C1519e.Pg, c0Var3, r10), 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777214, (DefaultConstructorMarker) null);
            c0Var4 = c0Var3;
            String str11111111116 = str9;
            wk.o(str11111111116, d0Var.b(aVar4, aVar2.o()), 0L, aVar1115.a(com.planner5d.library.contest.e.f.f150195r3, c0Var3, i21111112 << 3), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3Var1111112, c0Var4, (i12 >> 12) & 14, 0, 65524);
            c0Var4.o();
            c0Var4.o();
            if (m0.l0()) {
                m0.z0();
            }
            num6 = num5;
            num7 = num3;
            str11 = str11111111116;
            str12 = str8;
            str13 = str10;
        }
        s5VarT = c0Var4.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.e(str13, num7, num6, str12, str11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, Integer num, Integer num2, String str2, String str3, int i10, int i11, c0 c0Var, int i12) {
        d(str, num, num2, str2, str3, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void f(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-870514709);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-870514709, i10, -1, "com.planner5d.library.contest.view.rules.ContestPrizeSeparator (ContestPrizes.kt:64)");
            }
            x.b(i6.h(i6.i(androidx.compose.foundation.v.d(a0.E, u0.a.a(com.planner5d.library.contest.e.C1519e.f149711tg, c0VarR, 0), null, 2, null), androidx.compose.ui.unit.h.r(1)), 0.0f, 1, null), c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.g(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(int i10, c0 c0Var, int i11) {
        f(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void h(@Nullable final List<hb.a> list, @Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-798629829);
        int i11 = (i10 & 6) == 0 ? (c0VarR.k0(list) ? 4 : 2) | i10 : i10;
        if ((i11 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-798629829, i11, -1, "com.planner5d.library.contest.view.rules.ContestPrizes (ContestPrizes.kt:36)");
            }
            a0.a aVar = a0.E;
            a1 a1VarB = j0.b(q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            boolean z10 = false & false;
            d(u0.i.d(com.planner5d.library.contest.e.r.f151656l5, c0VarR, 0), null, null, u0.i.d(com.planner5d.library.contest.e.r.f151680m5, c0VarR, 0), u0.i.d(com.planner5d.library.contest.e.r.f151704n5, c0VarR, 0), c0VarR, 0, 6);
            f(c0VarR, 0);
            c0VarR.E(522936590);
            if (list != null) {
                for (hb.a aVar3 : list) {
                    String strValueOf = String.valueOf(aVar3.f());
                    Integer numValueOf = Integer.valueOf(aVar3.f() == 1 ? com.planner5d.library.contest.e.g.f150627r9 : com.planner5d.library.contest.e.g.f150592p4);
                    int iF = aVar3.f();
                    d(strValueOf, numValueOf, iF != 2 ? iF != 3 ? null : Integer.valueOf(com.planner5d.library.contest.e.C1519e.Qf) : Integer.valueOf(com.planner5d.library.contest.e.C1519e.Og), String.valueOf(aVar3.g()), String.valueOf(aVar3.h()), c0VarR, 0, 0);
                    f(c0VarR, 0);
                }
            }
            c0VarR.A();
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.i(list, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(List list, int i10, c0 c0Var, int i11) {
        h(list, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
