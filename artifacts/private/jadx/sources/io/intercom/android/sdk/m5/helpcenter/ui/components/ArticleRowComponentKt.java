package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nArticleRowComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleRowComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/ArticleRowComponentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,68:1\n1282#2,6:69\n113#3:75\n113#3:76\n113#3:110\n99#4,6:77\n106#4:114\n80#5,6:83\n87#5,3:98\n90#5,2:107\n94#5:113\n391#6,9:89\n400#6:109\n401#6,2:111\n4360#7,6:101\n*S KotlinDebug\n*F\n+ 1 ArticleRowComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/ArticleRowComponentKt\n*L\n28#1:69,6\n29#1:75\n30#1:76\n40#1:110\n25#1:77,6\n25#1:114\n25#1:83,6\n25#1:98,3\n25#1:107,2\n25#1:113\n25#1:89,9\n25#1:109\n25#1:111,2\n25#1:101,6\n*E\n"})
public final class ArticleRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x021f  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ArticleRowComponent(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final CollectionDetailsRow.ArticleRow articleRow, @Nullable Function1<? super String, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Function1<? super String, Unit> function2;
        androidx.compose.ui.a0 a0Var3;
        final Function1<? super String, Unit> function3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var4;
        final Function1<? super String, Unit> function4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(articleRow, "articleRow");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1326302174);
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
            i12 |= c0VarR.D(articleRow) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                function2 = function1;
                i12 |= c0VarR.k0(function2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ArticleRowComponentKt.ArticleRowComponent$lambda$0((String) obj);
                        }
                    };
                } else {
                    function3 = function2;
                }
                androidx.compose.ui.a0 a0VarH = i6.h(a0Var3, 0.0f, 1, null);
                c0VarR.E(1587298991);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                objI0 = c0VarR.i0();
                if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(function3, articleRow);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarT = d5.t(d5.v(i1.j(a0VarH, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, androidx.compose.ui.unit.h.r(12), 1, null);
                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
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
                Function1<? super String, Unit> function5 = function3;
                String title = articleRow.getTitle();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                y3 type04Point5 = intercomTheme.getTypography(c0VarR, i15).getType04Point5();
                long jM714getPrimaryText0d7_KjU = intercomTheme.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU();
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                q50.t(title, x5.q(y5Var, aVar2, 1.0f, false, 2, null), jM714getPrimaryText0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04Point5, c0VarR, 0, 0, 131064);
                c0Var2 = c0VarR;
                IntercomChevronKt.IntercomChevron(d5.t(aVar2, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, 6, 0);
                c0Var2.o();
                a0Var4 = a0Var3;
                function4 = function5;
            } else {
                c0VarR.u();
                a0Var4 = a0Var2;
                function4 = function2;
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.i
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$4(a0Var4, articleRow, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        function2 = function1;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$0((String) obj);
                    }
                };
            } else {
                function3 = function2;
            }
            androidx.compose.ui.a0 a0VarH2 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(1587298991);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(function3, articleRow);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(function3, articleRow);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarT2 = d5.t(d5.v(i1.j(a0VarH2, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, androidx.compose.ui.unit.h.r(12), 1, null);
            a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT2);
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
            Function1<? super String, Unit> function6 = function3;
            String title2 = articleRow.getTitle();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            y3 type04Point6 = intercomTheme2.getTypography(c0VarR, i16).getType04Point5();
            long jM714getPrimaryText0d7_KjU2 = intercomTheme2.getColors(c0VarR, i16).m714getPrimaryText0d7_KjU();
            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
            q50.t(title2, x5.q(y5Var2, aVar4, 1.0f, false, 2, null), jM714getPrimaryText0d7_KjU2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04Point6, c0VarR, 0, 0, 131064);
            c0Var2 = c0VarR;
            IntercomChevronKt.IntercomChevron(d5.t(aVar4, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, 6, 0);
            c0Var2.o();
            a0Var4 = a0Var3;
            function4 = function6;
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$0((String) obj);
                    }
                };
            } else {
                function3 = function2;
            }
            androidx.compose.ui.a0 a0VarH3 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(1587298991);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(function3, articleRow);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(function3, articleRow);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarT3 = d5.t(d5.v(i1.j(a0VarH3, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, androidx.compose.ui.unit.h.r(12), 1, null);
            a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarT3);
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
            Function1<? super String, Unit> function7 = function3;
            String title3 = articleRow.getTitle();
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            y3 type04Point7 = intercomTheme3.getTypography(c0VarR, i17).getType04Point5();
            long jM714getPrimaryText0d7_KjU3 = intercomTheme3.getColors(c0VarR, i17).m714getPrimaryText0d7_KjU();
            androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
            q50.t(title3, x5.q(y5Var3, aVar6, 1.0f, false, 2, null), jM714getPrimaryText0d7_KjU3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04Point7, c0VarR, 0, 0, 131064);
            c0Var2 = c0VarR;
            IntercomChevronKt.IntercomChevron(d5.t(aVar6, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, 6, 0);
            c0Var2.o();
            a0Var4 = a0Var3;
            function4 = function7;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleRowComponentKt.ArticleRowComponent$lambda$4(a0Var4, articleRow, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponent$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponent$lambda$2$lambda$1(Function1 function1, CollectionDetailsRow.ArticleRow articleRow) {
        Intrinsics.checkNotNullParameter(articleRow, "$articleRow");
        function1.invoke(articleRow.getId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponent$lambda$4(androidx.compose.ui.a0 a0Var, CollectionDetailsRow.ArticleRow articleRow, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(articleRow, "$articleRow");
        ArticleRowComponent(a0Var, articleRow, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ArticleRowComponentLongTextPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2014154163);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m342getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleRowComponentKt.ArticleRowComponentLongTextPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponentLongTextPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ArticleRowComponentLongTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ArticleRowComponentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(761606012);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 2 & 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m341getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleRowComponentKt.ArticleRowComponentPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponentPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ArticleRowComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
