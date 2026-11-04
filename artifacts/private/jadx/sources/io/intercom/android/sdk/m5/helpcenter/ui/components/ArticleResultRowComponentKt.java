package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.HighlightTagHandler;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nArticleResultRowComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleResultRowComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/ArticleResultRowComponentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,100:1\n1282#2,6:101\n113#3:107\n113#3:108\n113#3:184\n113#3:189\n99#4:109\n96#4,9:110\n106#4:193\n80#5,6:119\n87#5,3:134\n90#5,2:143\n80#5,6:156\n87#5,3:171\n90#5,2:180\n94#5:187\n94#5:192\n391#6,9:125\n400#6:145\n391#6,9:162\n400#6:182\n401#6,2:185\n401#6,2:190\n4360#7,6:137\n4360#7,6:174\n87#8:146\n84#8,9:147\n94#8:188\n75#9:183\n*S KotlinDebug\n*F\n+ 1 ArticleResultRowComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/ArticleResultRowComponentKt\n*L\n38#1:101,6\n39#1:107\n40#1:108\n56#1:184\n67#1:189\n35#1:109\n35#1:110,9\n35#1:193\n35#1:119,6\n35#1:134,3\n35#1:143,2\n43#1:156,6\n43#1:171,3\n43#1:180,2\n43#1:187\n35#1:192\n35#1:125,9\n35#1:145\n43#1:162,9\n43#1:182\n43#1:185,2\n35#1:190,2\n35#1:137,6\n43#1:174,6\n43#1:146\n43#1:147,9\n43#1:188\n46#1:183\n*E\n"})
public final class ArticleResultRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x031f  */
    /* JADX WARN: Code duplicated, block: B:89:0x034b  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ArticleResultRowComponent(@NotNull final ArticleSearchResultRow.ArticleResultRow item, @NotNull final Function1<? super String, Unit> onClick, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        androidx.compose.runtime.c0 c0Var2;
        Object obj;
        int i13;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-506618245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(item) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.k0(onClick) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                androidx.compose.ui.a0 a0VarH = i6.h(a0Var3, 0.0f, 1, null);
                c0VarR.E(-866808730);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                objI0 = c0VarR.i0();
                if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$1$lambda$0(onClick, item);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                float f10 = 16;
                androidx.compose.ui.a0 a0VarV = d5.v(d5.t(i1.j(a0VarH, false, null, null, null, (Function0) objI0, 15, null), 0.0f, androidx.compose.ui.unit.h.r(f10), 1, null), androidx.compose.ui.unit.h.r(f10), 0.0f, 0.0f, 0.0f, 14, null);
                androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ = aVar.q();
                androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE = u5.e(qVar.w(), cVarQ, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                function0A = aVar2.a();
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
                y7.n(c0VarD, a1VarE, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                y5 y5Var = y5.f16577a;
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar3, 1.0f, false, 2, null);
                a1 a1VarB = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
                function0A2 = aVar2.a();
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
                y7.n(c0VarD2, a1VarB, aVar2.e());
                y7.n(c0VarD2, b1VarK2, aVar2.g());
                function2B2 = aVar2.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar2.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                androidx.compose.ui.text.f annotatedString = BlockExtensionsKt.toAnnotatedString(highlightedText(item.getTitleText()), context, (2 & 2) != 0 ? new c3(0L, 0L, (v0) null, (q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                y3 type04 = intercomTheme.getTypography(c0VarR, i15).getType04();
                androidx.compose.ui.text.style.v.a aVar4 = androidx.compose.ui.text.style.v.f42256b;
                androidx.compose.ui.a0 a0Var5 = a0Var3;
                q50.u(annotatedString, null, intercomTheme.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, aVar4.c(), false, 0, 0, null, null, type04, c0VarR, 0, a5.S0, 258042);
                c0Var2 = c0VarR;
                c0Var2.E(1612603933);
                if (item.getSummaryVisibility() == 0 || StringsKt.w3(item.getSummaryText())) {
                    obj = null;
                    i13 = 2;
                } else {
                    l6.a(i6.i(a0Var5, androidx.compose.ui.unit.h.r(4)), c0Var2, 0);
                    obj = null;
                    i13 = 2;
                    q50.u(BlockExtensionsKt.toAnnotatedString(highlightedText(item.getSummaryText()), context, (2 & 2) != 0 ? new c3(0L, 0L, (v0) null, (q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null), null, s0.d(4286611584L), null, 0L, null, null, null, 0L, null, null, 0L, aVar4.c(), false, 0, 0, null, null, intercomTheme.getTypography(c0Var2, i15).getType04Point5(), c0Var2, a5.S0, a5.S0, 258042);
                    c0Var2 = c0Var2;
                }
                c0Var2.A();
                c0Var2.o();
                IntercomChevronKt.IntercomChevron(d5.t(aVar3, androidx.compose.ui.unit.h.r(22), 0.0f, i13, obj), c0Var2, 6, 0);
                c0Var2.o();
                a0Var4 = a0Var5;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                a0Var4 = a0Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$4(item, onClick, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.ui.a0 a0VarH2 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(-866808730);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$1$lambda$0(onClick, item);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$1$lambda$0(onClick, item);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            float f11 = 16;
            androidx.compose.ui.a0 a0VarV2 = d5.v(d5.t(i1.j(a0VarH2, false, null, null, null, (Function0) objI0, 15, null), 0.0f, androidx.compose.ui.unit.h.r(f11), 1, null), androidx.compose.ui.unit.h.r(f11), 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.e.a aVar5 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ2 = aVar5.q();
            androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE2 = u5.e(qVar2.w(), cVarQ2, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
            androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
            function0A = aVar6.a();
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
            androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarQ2 = x5.q(y5Var2, aVar7, 1.0f, false, 2, null);
            a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar2.y(), aVar5.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
            function0A2 = aVar6.a();
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
            androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
            Context context2 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            androidx.compose.ui.text.f annotatedString2 = BlockExtensionsKt.toAnnotatedString(highlightedText(item.getTitleText()), context2, (2 & 2) != 0 ? new c3(0L, 0L, (v0) null, (q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            y3 type05 = intercomTheme2.getTypography(c0VarR, i16).getType04();
            androidx.compose.ui.text.style.v.a aVar8 = androidx.compose.ui.text.style.v.f42256b;
            androidx.compose.ui.a0 a0Var6 = a0Var3;
            q50.u(annotatedString2, null, intercomTheme2.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, aVar8.c(), false, 0, 0, null, null, type05, c0VarR, 0, a5.S0, 258042);
            c0Var2 = c0VarR;
            c0Var2.E(1612603933);
            if (item.getSummaryVisibility() == 0) {
                obj = null;
                i13 = 2;
            } else {
                obj = null;
                i13 = 2;
            }
            c0Var2.A();
            c0Var2.o();
            IntercomChevronKt.IntercomChevron(d5.t(aVar7, androidx.compose.ui.unit.h.r(22), 0.0f, i13, obj), c0Var2, 6, 0);
            c0Var2.o();
            a0Var4 = a0Var6;
        } else {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.ui.a0 a0VarH3 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(-866808730);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$1$lambda$0(onClick, item);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$1$lambda$0(onClick, item);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            float f12 = 16;
            androidx.compose.ui.a0 a0VarV3 = d5.v(d5.t(i1.j(a0VarH3, false, null, null, null, (Function0) objI0, 15, null), 0.0f, androidx.compose.ui.unit.h.r(f12), 1, null), androidx.compose.ui.unit.h.r(f12), 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.e.a aVar9 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ3 = aVar9.q();
            androidx.compose.foundation.layout.q qVar3 = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE3 = u5.e(qVar3.w(), cVarQ3, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK5 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarV3);
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
            y7.n(c0VarD, a1VarE3, aVar10.e());
            y7.n(c0VarD, b1VarK5, aVar10.g());
            function2B = aVar10.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN5, aVar10.f());
            y5 y5Var3 = y5.f16577a;
            androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarQ3 = x5.q(y5Var3, aVar11, 1.0f, false, 2, null);
            a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(qVar3.y(), aVar9.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarQ3);
            function0A2 = aVar10.a();
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
            y7.n(c0VarD2, a1VarB3, aVar10.e());
            y7.n(c0VarD2, b1VarK6, aVar10.g());
            function2B2 = aVar10.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN6, aVar10.f());
            androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
            Context context3 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            androidx.compose.ui.text.f annotatedString3 = BlockExtensionsKt.toAnnotatedString(highlightedText(item.getTitleText()), context3, (2 & 2) != 0 ? new c3(0L, 0L, (v0) null, (q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            y3 type06 = intercomTheme3.getTypography(c0VarR, i17).getType04();
            androidx.compose.ui.text.style.v.a aVar12 = androidx.compose.ui.text.style.v.f42256b;
            androidx.compose.ui.a0 a0Var7 = a0Var3;
            q50.u(annotatedString3, null, intercomTheme3.getColors(c0VarR, i17).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, aVar12.c(), false, 0, 0, null, null, type06, c0VarR, 0, a5.S0, 258042);
            c0Var2 = c0VarR;
            c0Var2.E(1612603933);
            if (item.getSummaryVisibility() == 0) {
                obj = null;
                i13 = 2;
            } else {
                obj = null;
                i13 = 2;
            }
            c0Var2.A();
            c0Var2.o();
            IntercomChevronKt.IntercomChevron(d5.t(aVar11, androidx.compose.ui.unit.h.r(22), 0.0f, i13, obj), c0Var2, 6, 0);
            c0Var2.o();
            a0Var4 = a0Var7;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$4(item, onClick, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleResultRowComponent$lambda$1$lambda$0(Function1 onClick, ArticleSearchResultRow.ArticleResultRow item) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(item, "$item");
        onClick.invoke(item.getId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleResultRowComponent$lambda$4(ArticleSearchResultRow.ArticleResultRow item, Function1 onClick, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        ArticleResultRowComponent(item, onClick, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ArticleRowComponentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(387759007);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleResultRowComponentKt.INSTANCE.m340getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleResultRowComponentKt.ArticleRowComponentPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponentPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ArticleRowComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final Spanned highlightedText(String str) {
        Spanned spannedB = androidx.core.text.c.b("&zwj;" + str, 0, null, new HighlightTagHandler());
        Intrinsics.checkNotNullExpressionValue(spannedB, "fromHtml(...)");
        return spannedB;
    }
}
