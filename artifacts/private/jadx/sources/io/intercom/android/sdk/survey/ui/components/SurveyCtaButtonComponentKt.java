package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.a4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.r3;
import androidx.compose.material3.s3;
import androidx.compose.material3.t3;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSurveyCtaButtonComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyCtaButtonComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyCtaButtonComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,152:1\n113#2:153\n113#2:154\n113#2:155\n113#2:200\n113#2:202\n113#2:203\n113#2:204\n113#2:205\n113#2:206\n87#3:156\n84#3,9:157\n94#3:210\n80#4,6:166\n87#4,3:181\n90#4,2:190\n94#4:209\n80#4,6:221\n87#4,3:236\n90#4,2:245\n94#4:250\n80#4,6:262\n87#4,3:277\n90#4,2:286\n94#4:291\n80#4,6:303\n87#4,3:318\n90#4,2:327\n94#4:332\n391#5,9:172\n400#5:192\n401#5,2:207\n391#5,9:227\n400#5,3:247\n391#5,9:268\n400#5,3:288\n391#5,9:309\n400#5,3:329\n4360#6,6:184\n4360#6,6:239\n4360#6,6:280\n4360#6,6:321\n1863#7:193\n1864#7:201\n1282#8,6:194\n70#9:211\n67#9,9:212\n77#9:251\n70#9:252\n67#9,9:253\n77#9:292\n70#9:293\n67#9,9:294\n77#9:333\n*S KotlinDebug\n*F\n+ 1 SurveyCtaButtonComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyCtaButtonComponentKt\n*L\n39#1:153\n40#1:154\n43#1:155\n73#1:200\n86#1:202\n87#1:203\n88#1:204\n89#1:205\n90#1:206\n45#1:156\n45#1:157,9\n45#1:210\n45#1:166,6\n45#1:181,3\n45#1:190,2\n45#1:209\n116#1:221,6\n116#1:236,3\n116#1:245,2\n116#1:250\n127#1:262,6\n127#1:277,3\n127#1:286,2\n127#1:291\n138#1:303,6\n138#1:318,3\n138#1:327,2\n138#1:332\n45#1:172,9\n45#1:192\n45#1:207,2\n116#1:227,9\n116#1:247,3\n127#1:268,9\n127#1:288,3\n138#1:309,9\n138#1:329,3\n45#1:184,6\n116#1:239,6\n127#1:280,6\n138#1:321,6\n46#1:193\n46#1:201\n48#1:194,6\n116#1:211\n116#1:212,9\n116#1:251\n127#1:252\n127#1:253,9\n127#1:292\n138#1:293\n138#1:294,9\n138#1:333\n*E\n"})
public final class SurveyCtaButtonComponentKt {
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void DarkButtonPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-41399177);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            SurveyCtaButtonComponent(null, "Submit", null, null, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, "#222222", 1, null)), c0VarR, 48, 29);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyCtaButtonComponentKt.DarkButtonPreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DarkButtonPreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DarkButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LightButtonPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1401512691);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            SurveyCtaButtonComponent(null, "Submit", null, null, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), c0VarR, 48, 29);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyCtaButtonComponentKt.LightButtonPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LightButtonPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        LightButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SecondaryCtaPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1826494403);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            SurveyCtaButtonComponent(null, "Submit", CollectionsKt.listOf(new SurveyState.Content.SecondaryCta("Open website", "https://www.google.com", true)), null, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), c0VarR, 48, 25);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyCtaButtonComponentKt.SecondaryCtaPreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryCtaPreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SecondaryCtaPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:0x029d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:113:0x0330  */
    /* JADX WARN: Code duplicated, block: B:117:0x0397  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0150  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x018d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x020e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyCtaButtonComponent(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String primaryCtaText, @Nullable List<SurveyState.Content.SecondaryCta> list, @Nullable Function0<Unit> function0, @Nullable Function1<? super SurveyState.Content.SecondaryCta, Unit> function1, @NotNull final SurveyUiColors surveyUiColors, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Function0<Unit> function2;
        int i13;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function3;
        int i14;
        int i15;
        androidx.compose.ui.a0 a0Var3;
        List<SurveyState.Content.SecondaryCta> listEmptyList;
        Function0<Unit> function4;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function5;
        androidx.compose.foundation.a1 a1VarA;
        float f10;
        androidx.compose.foundation.shape.n nVarH;
        androidx.compose.ui.a0 a0VarI;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        Iterator it;
        float f11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.foundation.a1 a1Var;
        t3 t3VarC;
        Pair pair;
        long jM;
        androidx.compose.foundation.a1 a1Var2;
        androidx.compose.runtime.c0 c0Var3;
        final long j10;
        final List<SurveyState.Content.SecondaryCta> list2;
        final Function0<Unit> function6;
        final Function1<? super SurveyState.Content.SecondaryCta, Unit> function7;
        final androidx.compose.ui.a0 a0Var4;
        final SurveyState.Content.SecondaryCta secondaryCta;
        final Function1<? super SurveyState.Content.SecondaryCta, Unit> function8;
        androidx.compose.runtime.c0 c0Var4;
        boolean z10;
        boolean zD;
        Object objI0;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1455595547);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
            i12 |= c0VarR.D(primaryCtaText) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 128;
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 7168) == 0) {
                function2 = function0;
                i12 |= c0VarR.k0(function2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c0VarR.D(surveyUiColors)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    if (i17 != 4 && (374491 & i12) == 74898 && c0VarR.d()) {
                        c0VarR.u();
                        list2 = list;
                        a0Var4 = a0Var2;
                        function6 = function2;
                        function7 = function3;
                    } else {
                        if (i16 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i17 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i18 != 0) {
                            function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function4 = function2;
                        }
                        if (i13 != 0) {
                            function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                                }
                            };
                        } else {
                            function5 = function3;
                        }
                        a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                        f10 = 8;
                        nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                        a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                        a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                        y7.n(c0VarD, a1VarB, aVar.e());
                        y7.n(c0VarD, b1VarK, aVar.g());
                        function2B = aVar.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar.f());
                        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(1171126918);
                        it = listEmptyList.iterator();
                        while (it.hasNext()) {
                            secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                            function8 = function5;
                            float f12 = f10;
                            c0Var4 = c0VarR;
                            androidx.compose.ui.a0 a0Var5 = a0Var3;
                            Iterator it2 = it;
                            r3 r3VarB = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                            c0Var4.E(1934484526);
                            if ((i12 & 57344) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zD = c0Var4.D(secondaryCta) | z10;
                            objI0 = c0Var4.i0();
                            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                    }
                                };
                                c0Var4.Y(objI0);
                            }
                            Function0 function9 = (Function0) objI0;
                            c0Var4.A();
                            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                @Override // pj.n
                                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var5, Integer num) {
                                    invoke(x5Var, c0Var5, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var5, int i19) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i19 & 81) == 16 && c0Var5.d()) {
                                        c0Var5.u();
                                        return;
                                    }
                                    androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                                    a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var5, 48);
                                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var5, 0));
                                    b1 b1VarK2 = c0Var5.k();
                                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var5, aVar2);
                                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                                    Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
                                    if (c0Var5.S() == null) {
                                        androidx.compose.runtime.v.r();
                                    }
                                    c0Var5.q();
                                    if (c0Var5.P()) {
                                        c0Var5.q0(function0A2);
                                    } else {
                                        c0Var5.l();
                                    }
                                    androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var5);
                                    y7.n(c0VarD2, a1VarE, aVar3.e());
                                    y7.n(c0VarD2, b1VarK2, aVar3.g());
                                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                    }
                                    y7.n(c0VarD2, a0VarN2, aVar3.f());
                                    y5 y5Var = y5.f16577a;
                                    c0Var5.E(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var5, 0), null, i6.w(d5.t(aVar2, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var5, 440, 0);
                                    }
                                    c0Var5.A();
                                    q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var5, 0, 0, 262138);
                                    c0Var5.o();
                                }
                            }, c0Var4, 54);
                            androidx.compose.foundation.a1 a1Var3 = a1VarA;
                            androidx.compose.foundation.shape.n nVar = nVarH;
                            androidx.compose.ui.a0 a0Var6 = a0VarI;
                            a4.g(function9, a0Var6, false, nVar, r3VarB, null, a1Var3, null, null, cVarE, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f12)), c0Var4, 6);
                            it = it2;
                            function5 = function8;
                            a0VarI = a0Var6;
                            f10 = f12;
                            nVarH = nVar;
                            a1VarA = a1Var3;
                            c0VarR = c0Var4;
                            a0Var3 = a0Var5;
                        }
                        androidx.compose.ui.a0 a0Var7 = a0Var3;
                        Function1<? super SurveyState.Content.SecondaryCta, Unit> function10 = function5;
                        f11 = f10;
                        c0Var2 = c0VarR;
                        a1Var = a1VarA;
                        androidx.compose.foundation.shape.n nVar2 = nVarH;
                        androidx.compose.ui.a0 a0Var8 = a0VarI;
                        t3VarC = null;
                        c0Var2.A();
                        if (listEmptyList.isEmpty()) {
                            pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                        } else {
                            pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                        }
                        long jM2 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                        jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                        if (listEmptyList.isEmpty()) {
                            a1Var2 = a1Var;
                        } else {
                            a1Var2 = null;
                        }
                        c0Var2.E(1171174724);
                        if (listEmptyList.isEmpty()) {
                            s3 s3Var = s3.f32666a;
                            float fR = androidx.compose.ui.unit.h.r(2);
                            float fR2 = androidx.compose.ui.unit.h.r(f11);
                            float fR3 = androidx.compose.ui.unit.h.r(0);
                            float f13 = 4;
                            float fR4 = androidx.compose.ui.unit.h.r(f13);
                            c0Var3 = c0Var2;
                            j10 = jM;
                            t3VarC = s3Var.c(fR, fR2, androidx.compose.ui.unit.h.r(f13), fR4, fR3, c0Var3, (s3.f32683r << 15) | 28086, 0);
                        } else {
                            c0Var3 = c0Var2;
                            j10 = jM;
                        }
                        c0Var3.A();
                        androidx.compose.runtime.c0 c0Var5 = c0Var3;
                        Function0<Unit> function11 = function4;
                        a4.g(function11, a0Var8, false, nVar2, s3.f32666a.b(jM2, 0L, 0L, 0L, c0Var5, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var6, Integer num) {
                                invoke(x5Var, c0Var6, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var6, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var6.d()) {
                                    c0Var6.u();
                                } else {
                                    q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var6, 0, 0, 262138);
                                }
                            }
                        }, c0Var5, 54), c0Var5, ((i12 >> 9) & 14) | 805306416, 388);
                        c0VarR = c0Var5;
                        c0VarR.o();
                        list2 = listEmptyList;
                        function6 = function11;
                        function7 = function10;
                        a0Var4 = a0Var7;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 = androidx.profileinstaller.n.c.f73814m;
                i12 |= i15;
                if (i17 != 4) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i13 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                    f10 = 8;
                    nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                    a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                    a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    y7.n(c0VarD, a1VarB2, aVar2.e());
                    y7.n(c0VarD, b1VarK2, aVar2.g());
                    function2B = aVar2.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN2, aVar2.f());
                    androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(1171126918);
                    it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                        function8 = function5;
                        float f14 = f10;
                        c0Var4 = c0VarR;
                        androidx.compose.ui.a0 a0Var9 = a0Var3;
                        Iterator it3 = it;
                        r3 r3VarB2 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                        c0Var4.E(1934484526);
                        if ((i12 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zD = c0Var4.D(secondaryCta) | z10;
                        objI0 = c0Var4.i0();
                        if (zD) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        }
                        Function0 function12 = (Function0) objI0;
                        c0Var4.A();
                        androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var6, Integer num) {
                                invoke(x5Var, c0Var6, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var6, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var6.d()) {
                                    c0Var6.u();
                                    return;
                                }
                                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var6, 48);
                                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var6, 0));
                                b1 b1VarK3 = c0Var6.k();
                                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var6, aVar3);
                                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                                if (c0Var6.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var6.q();
                                if (c0Var6.P()) {
                                    c0Var6.q0(function0A2);
                                } else {
                                    c0Var6.l();
                                }
                                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var6);
                                y7.n(c0VarD2, a1VarE, aVar4.e());
                                y7.n(c0VarD2, b1VarK3, aVar4.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                }
                                y7.n(c0VarD2, a0VarN3, aVar4.f());
                                y5 y5Var = y5.f16577a;
                                c0Var6.E(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var6, 0), null, i6.w(d5.t(aVar3, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var6, 440, 0);
                                }
                                c0Var6.A();
                                q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var6, 0, 0, 262138);
                                c0Var6.o();
                            }
                        }, c0Var4, 54);
                        androidx.compose.foundation.a1 a1Var4 = a1VarA;
                        androidx.compose.foundation.shape.n nVar3 = nVarH;
                        androidx.compose.ui.a0 a0Var10 = a0VarI;
                        a4.g(function12, a0Var10, false, nVar3, r3VarB2, null, a1Var4, null, null, cVarE2, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f14)), c0Var4, 6);
                        it = it3;
                        function5 = function8;
                        a0VarI = a0Var10;
                        f10 = f14;
                        nVarH = nVar3;
                        a1VarA = a1Var4;
                        c0VarR = c0Var4;
                        a0Var3 = a0Var9;
                    }
                    androidx.compose.ui.a0 a0Var11 = a0Var3;
                    Function1<? super SurveyState.Content.SecondaryCta, Unit> function13 = function5;
                    f11 = f10;
                    c0Var2 = c0VarR;
                    a1Var = a1VarA;
                    androidx.compose.foundation.shape.n nVar4 = nVarH;
                    androidx.compose.ui.a0 a0Var12 = a0VarI;
                    t3VarC = null;
                    c0Var2.A();
                    if (listEmptyList.isEmpty()) {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                    }
                    long jM3 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                    jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                    if (listEmptyList.isEmpty()) {
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = null;
                    }
                    c0Var2.E(1171174724);
                    if (listEmptyList.isEmpty()) {
                        s3 s3Var2 = s3.f32666a;
                        float fR5 = androidx.compose.ui.unit.h.r(2);
                        float fR6 = androidx.compose.ui.unit.h.r(f11);
                        float fR7 = androidx.compose.ui.unit.h.r(0);
                        float f15 = 4;
                        float fR8 = androidx.compose.ui.unit.h.r(f15);
                        c0Var3 = c0Var2;
                        j10 = jM;
                        t3VarC = s3Var2.c(fR5, fR6, androidx.compose.ui.unit.h.r(f15), fR8, fR7, c0Var3, (s3.f32683r << 15) | 28086, 0);
                    } else {
                        c0Var3 = c0Var2;
                        j10 = jM;
                    }
                    c0Var3.A();
                    androidx.compose.runtime.c0 c0Var6 = c0Var3;
                    Function0<Unit> function14 = function4;
                    a4.g(function14, a0Var12, false, nVar4, s3.f32666a.b(jM3, 0L, 0L, 0L, c0Var6, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var7, Integer num) {
                            invoke(x5Var, c0Var7, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var7, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var7.d()) {
                                c0Var7.u();
                            } else {
                                q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var7, 0, 0, 262138);
                            }
                        }
                    }, c0Var6, 54), c0Var6, ((i12 >> 9) & 14) | 805306416, 388);
                    c0VarR = c0Var6;
                    c0VarR.o();
                    list2 = listEmptyList;
                    function6 = function14;
                    function7 = function13;
                    a0Var4 = a0Var11;
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i13 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                    f10 = 8;
                    nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                    a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                    a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    y7.n(c0VarD, a1VarB3, aVar3.e());
                    y7.n(c0VarD, b1VarK3, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar3.f());
                    androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(1171126918);
                    it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                        function8 = function5;
                        float f16 = f10;
                        c0Var4 = c0VarR;
                        androidx.compose.ui.a0 a0Var13 = a0Var3;
                        Iterator it4 = it;
                        r3 r3VarB3 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                        c0Var4.E(1934484526);
                        if ((i12 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zD = c0Var4.D(secondaryCta) | z10;
                        objI0 = c0Var4.i0();
                        if (zD) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        }
                        Function0 function15 = (Function0) objI0;
                        c0Var4.A();
                        androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var7, Integer num) {
                                invoke(x5Var, c0Var7, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var7, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var7.d()) {
                                    c0Var7.u();
                                    return;
                                }
                                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var7, 48);
                                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var7, 0));
                                b1 b1VarK4 = c0Var7.k();
                                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var7, aVar4);
                                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A2 = aVar5.a();
                                if (c0Var7.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var7.q();
                                if (c0Var7.P()) {
                                    c0Var7.q0(function0A2);
                                } else {
                                    c0Var7.l();
                                }
                                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var7);
                                y7.n(c0VarD2, a1VarE, aVar5.e());
                                y7.n(c0VarD2, b1VarK4, aVar5.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar5.b();
                                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                }
                                y7.n(c0VarD2, a0VarN4, aVar5.f());
                                y5 y5Var = y5.f16577a;
                                c0Var7.E(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var7, 0), null, i6.w(d5.t(aVar4, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var7, 440, 0);
                                }
                                c0Var7.A();
                                q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var7, 0, 0, 262138);
                                c0Var7.o();
                            }
                        }, c0Var4, 54);
                        androidx.compose.foundation.a1 a1Var5 = a1VarA;
                        androidx.compose.foundation.shape.n nVar5 = nVarH;
                        androidx.compose.ui.a0 a0Var14 = a0VarI;
                        a4.g(function15, a0Var14, false, nVar5, r3VarB3, null, a1Var5, null, null, cVarE3, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f16)), c0Var4, 6);
                        it = it4;
                        function5 = function8;
                        a0VarI = a0Var14;
                        f10 = f16;
                        nVarH = nVar5;
                        a1VarA = a1Var5;
                        c0VarR = c0Var4;
                        a0Var3 = a0Var13;
                    }
                    androidx.compose.ui.a0 a0Var15 = a0Var3;
                    Function1<? super SurveyState.Content.SecondaryCta, Unit> function16 = function5;
                    f11 = f10;
                    c0Var2 = c0VarR;
                    a1Var = a1VarA;
                    androidx.compose.foundation.shape.n nVar6 = nVarH;
                    androidx.compose.ui.a0 a0Var16 = a0VarI;
                    t3VarC = null;
                    c0Var2.A();
                    if (listEmptyList.isEmpty()) {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                    }
                    long jM4 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                    jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                    if (listEmptyList.isEmpty()) {
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = null;
                    }
                    c0Var2.E(1171174724);
                    if (listEmptyList.isEmpty()) {
                        s3 s3Var3 = s3.f32666a;
                        float fR9 = androidx.compose.ui.unit.h.r(2);
                        float fR10 = androidx.compose.ui.unit.h.r(f11);
                        float fR11 = androidx.compose.ui.unit.h.r(0);
                        float f17 = 4;
                        float fR12 = androidx.compose.ui.unit.h.r(f17);
                        c0Var3 = c0Var2;
                        j10 = jM;
                        t3VarC = s3Var3.c(fR9, fR10, androidx.compose.ui.unit.h.r(f17), fR12, fR11, c0Var3, (s3.f32683r << 15) | 28086, 0);
                    } else {
                        c0Var3 = c0Var2;
                        j10 = jM;
                    }
                    c0Var3.A();
                    androidx.compose.runtime.c0 c0Var7 = c0Var3;
                    Function0<Unit> function17 = function4;
                    a4.g(function17, a0Var16, false, nVar6, s3.f32666a.b(jM4, 0L, 0L, 0L, c0Var7, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var8, Integer num) {
                            invoke(x5Var, c0Var8, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var8, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var8.d()) {
                                c0Var8.u();
                            } else {
                                q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var8, 0, 0, 262138);
                            }
                        }
                    }, c0Var7, 54), c0Var7, ((i12 >> 9) & 14) | 805306416, 388);
                    c0VarR = c0Var7;
                    c0VarR.o();
                    list2 = listEmptyList;
                    function6 = function17;
                    function7 = function16;
                    a0Var4 = a0Var15;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function1;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.D(surveyUiColors)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if (i17 != 4) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i13 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                    f10 = 8;
                    nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                    a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                    a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    function0A = aVar4.a();
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
                    y7.n(c0VarD, a1VarB4, aVar4.e());
                    y7.n(c0VarD, b1VarK4, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN4, aVar4.f());
                    androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(1171126918);
                    it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                        function8 = function5;
                        float f18 = f10;
                        c0Var4 = c0VarR;
                        androidx.compose.ui.a0 a0Var17 = a0Var3;
                        Iterator it5 = it;
                        r3 r3VarB4 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                        c0Var4.E(1934484526);
                        if ((i12 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zD = c0Var4.D(secondaryCta) | z10;
                        objI0 = c0Var4.i0();
                        if (zD) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        }
                        Function0 function18 = (Function0) objI0;
                        c0Var4.A();
                        androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var8, Integer num) {
                                invoke(x5Var, c0Var8, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var8, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var8.d()) {
                                    c0Var8.u();
                                    return;
                                }
                                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var8, 48);
                                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var8, 0));
                                b1 b1VarK5 = c0Var8.k();
                                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0Var8, aVar5);
                                androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A2 = aVar6.a();
                                if (c0Var8.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var8.q();
                                if (c0Var8.P()) {
                                    c0Var8.q0(function0A2);
                                } else {
                                    c0Var8.l();
                                }
                                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var8);
                                y7.n(c0VarD2, a1VarE, aVar6.e());
                                y7.n(c0VarD2, b1VarK5, aVar6.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar6.b();
                                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                }
                                y7.n(c0VarD2, a0VarN5, aVar6.f());
                                y5 y5Var = y5.f16577a;
                                c0Var8.E(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var8, 0), null, i6.w(d5.t(aVar5, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var8, 440, 0);
                                }
                                c0Var8.A();
                                q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var8, 0, 0, 262138);
                                c0Var8.o();
                            }
                        }, c0Var4, 54);
                        androidx.compose.foundation.a1 a1Var6 = a1VarA;
                        androidx.compose.foundation.shape.n nVar7 = nVarH;
                        androidx.compose.ui.a0 a0Var18 = a0VarI;
                        a4.g(function18, a0Var18, false, nVar7, r3VarB4, null, a1Var6, null, null, cVarE4, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f18)), c0Var4, 6);
                        it = it5;
                        function5 = function8;
                        a0VarI = a0Var18;
                        f10 = f18;
                        nVarH = nVar7;
                        a1VarA = a1Var6;
                        c0VarR = c0Var4;
                        a0Var3 = a0Var17;
                    }
                    androidx.compose.ui.a0 a0Var19 = a0Var3;
                    Function1<? super SurveyState.Content.SecondaryCta, Unit> function19 = function5;
                    f11 = f10;
                    c0Var2 = c0VarR;
                    a1Var = a1VarA;
                    androidx.compose.foundation.shape.n nVar8 = nVarH;
                    androidx.compose.ui.a0 a0Var110 = a0VarI;
                    t3VarC = null;
                    c0Var2.A();
                    if (listEmptyList.isEmpty()) {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                    }
                    long jM5 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                    jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                    if (listEmptyList.isEmpty()) {
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = null;
                    }
                    c0Var2.E(1171174724);
                    if (listEmptyList.isEmpty()) {
                        s3 s3Var4 = s3.f32666a;
                        float fR13 = androidx.compose.ui.unit.h.r(2);
                        float fR14 = androidx.compose.ui.unit.h.r(f11);
                        float fR15 = androidx.compose.ui.unit.h.r(0);
                        float f19 = 4;
                        float fR16 = androidx.compose.ui.unit.h.r(f19);
                        c0Var3 = c0Var2;
                        j10 = jM;
                        t3VarC = s3Var4.c(fR13, fR14, androidx.compose.ui.unit.h.r(f19), fR16, fR15, c0Var3, (s3.f32683r << 15) | 28086, 0);
                    } else {
                        c0Var3 = c0Var2;
                        j10 = jM;
                    }
                    c0Var3.A();
                    androidx.compose.runtime.c0 c0Var8 = c0Var3;
                    Function0<Unit> function110 = function4;
                    a4.g(function110, a0Var110, false, nVar8, s3.f32666a.b(jM5, 0L, 0L, 0L, c0Var8, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var9, Integer num) {
                            invoke(x5Var, c0Var9, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var9, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var9.d()) {
                                c0Var9.u();
                            } else {
                                q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var9, 0, 0, 262138);
                            }
                        }
                    }, c0Var8, 54), c0Var8, ((i12 >> 9) & 14) | 805306416, 388);
                    c0VarR = c0Var8;
                    c0VarR.o();
                    list2 = listEmptyList;
                    function6 = function110;
                    function7 = function19;
                    a0Var4 = a0Var19;
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i13 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                    f10 = 8;
                    nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                    a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                    a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    y7.n(c0VarD, a1VarB5, aVar5.e());
                    y7.n(c0VarD, b1VarK5, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar5.f());
                    androidx.compose.foundation.layout.n0 n0Var5 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(1171126918);
                    it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                        function8 = function5;
                        float f110 = f10;
                        c0Var4 = c0VarR;
                        androidx.compose.ui.a0 a0Var111 = a0Var3;
                        Iterator it6 = it;
                        r3 r3VarB5 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                        c0Var4.E(1934484526);
                        if ((i12 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zD = c0Var4.D(secondaryCta) | z10;
                        objI0 = c0Var4.i0();
                        if (zD) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        }
                        Function0 function111 = (Function0) objI0;
                        c0Var4.A();
                        androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var9, Integer num) {
                                invoke(x5Var, c0Var9, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var9, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var9.d()) {
                                    c0Var9.u();
                                    return;
                                }
                                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var9, 48);
                                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var9, 0));
                                b1 b1VarK6 = c0Var9.k();
                                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0Var9, aVar6);
                                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A2 = aVar7.a();
                                if (c0Var9.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var9.q();
                                if (c0Var9.P()) {
                                    c0Var9.q0(function0A2);
                                } else {
                                    c0Var9.l();
                                }
                                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var9);
                                y7.n(c0VarD2, a1VarE, aVar7.e());
                                y7.n(c0VarD2, b1VarK6, aVar7.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar7.b();
                                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                }
                                y7.n(c0VarD2, a0VarN6, aVar7.f());
                                y5 y5Var = y5.f16577a;
                                c0Var9.E(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var9, 0), null, i6.w(d5.t(aVar6, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var9, 440, 0);
                                }
                                c0Var9.A();
                                q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var9, 0, 0, 262138);
                                c0Var9.o();
                            }
                        }, c0Var4, 54);
                        androidx.compose.foundation.a1 a1Var7 = a1VarA;
                        androidx.compose.foundation.shape.n nVar9 = nVarH;
                        androidx.compose.ui.a0 a0Var112 = a0VarI;
                        a4.g(function111, a0Var112, false, nVar9, r3VarB5, null, a1Var7, null, null, cVarE5, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f110)), c0Var4, 6);
                        it = it6;
                        function5 = function8;
                        a0VarI = a0Var112;
                        f10 = f110;
                        nVarH = nVar9;
                        a1VarA = a1Var7;
                        c0VarR = c0Var4;
                        a0Var3 = a0Var111;
                    }
                    androidx.compose.ui.a0 a0Var113 = a0Var3;
                    Function1<? super SurveyState.Content.SecondaryCta, Unit> function112 = function5;
                    f11 = f10;
                    c0Var2 = c0VarR;
                    a1Var = a1VarA;
                    androidx.compose.foundation.shape.n nVar10 = nVarH;
                    androidx.compose.ui.a0 a0Var114 = a0VarI;
                    t3VarC = null;
                    c0Var2.A();
                    if (listEmptyList.isEmpty()) {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                    }
                    long jM6 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                    jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                    if (listEmptyList.isEmpty()) {
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = null;
                    }
                    c0Var2.E(1171174724);
                    if (listEmptyList.isEmpty()) {
                        s3 s3Var5 = s3.f32666a;
                        float fR17 = androidx.compose.ui.unit.h.r(2);
                        float fR18 = androidx.compose.ui.unit.h.r(f11);
                        float fR19 = androidx.compose.ui.unit.h.r(0);
                        float f111 = 4;
                        float fR110 = androidx.compose.ui.unit.h.r(f111);
                        c0Var3 = c0Var2;
                        j10 = jM;
                        t3VarC = s3Var5.c(fR17, fR18, androidx.compose.ui.unit.h.r(f111), fR110, fR19, c0Var3, (s3.f32683r << 15) | 28086, 0);
                    } else {
                        c0Var3 = c0Var2;
                        j10 = jM;
                    }
                    c0Var3.A();
                    androidx.compose.runtime.c0 c0Var9 = c0Var3;
                    Function0<Unit> function113 = function4;
                    a4.g(function113, a0Var114, false, nVar10, s3.f32666a.b(jM6, 0L, 0L, 0L, c0Var9, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var10, Integer num) {
                            invoke(x5Var, c0Var10, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var10, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var10.d()) {
                                c0Var10.u();
                            } else {
                                q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var10, 0, 0, 262138);
                            }
                        }
                    }, c0Var9, 54), c0Var9, ((i12 >> 9) & 14) | 805306416, 388);
                    c0VarR = c0Var9;
                    c0VarR.o();
                    list2 = listEmptyList;
                    function6 = function113;
                    function7 = function112;
                    a0Var4 = a0Var113;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i15;
            if (i17 != 4) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i13 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                f10 = 8;
                nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                y7.n(c0VarD, a1VarB6, aVar6.e());
                y7.n(c0VarD, b1VarK6, aVar6.g());
                function2B = aVar6.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN6, aVar6.f());
                androidx.compose.foundation.layout.n0 n0Var6 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(1171126918);
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                    function8 = function5;
                    float f112 = f10;
                    c0Var4 = c0VarR;
                    androidx.compose.ui.a0 a0Var115 = a0Var3;
                    Iterator it7 = it;
                    r3 r3VarB6 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                    c0Var4.E(1934484526);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zD = c0Var4.D(secondaryCta) | z10;
                    objI0 = c0Var4.i0();
                    if (zD) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    }
                    Function0 function114 = (Function0) objI0;
                    c0Var4.A();
                    androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var10, Integer num) {
                            invoke(x5Var, c0Var10, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var10, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var10.d()) {
                                c0Var10.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var10, 48);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var10, 0));
                            b1 b1VarK7 = c0Var10.k();
                            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0Var10, aVar7);
                            androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar8.a();
                            if (c0Var10.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var10.q();
                            if (c0Var10.P()) {
                                c0Var10.q0(function0A2);
                            } else {
                                c0Var10.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var10);
                            y7.n(c0VarD2, a1VarE, aVar8.e());
                            y7.n(c0VarD2, b1VarK7, aVar8.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar8.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN7, aVar8.f());
                            y5 y5Var = y5.f16577a;
                            c0Var10.E(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var10, 0), null, i6.w(d5.t(aVar7, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var10, 440, 0);
                            }
                            c0Var10.A();
                            q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var10, 0, 0, 262138);
                            c0Var10.o();
                        }
                    }, c0Var4, 54);
                    androidx.compose.foundation.a1 a1Var8 = a1VarA;
                    androidx.compose.foundation.shape.n nVar11 = nVarH;
                    androidx.compose.ui.a0 a0Var116 = a0VarI;
                    a4.g(function114, a0Var116, false, nVar11, r3VarB6, null, a1Var8, null, null, cVarE6, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f112)), c0Var4, 6);
                    it = it7;
                    function5 = function8;
                    a0VarI = a0Var116;
                    f10 = f112;
                    nVarH = nVar11;
                    a1VarA = a1Var8;
                    c0VarR = c0Var4;
                    a0Var3 = a0Var115;
                }
                androidx.compose.ui.a0 a0Var117 = a0Var3;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function115 = function5;
                f11 = f10;
                c0Var2 = c0VarR;
                a1Var = a1VarA;
                androidx.compose.foundation.shape.n nVar12 = nVarH;
                androidx.compose.ui.a0 a0Var118 = a0VarI;
                t3VarC = null;
                c0Var2.A();
                if (listEmptyList.isEmpty()) {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                }
                long jM7 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                if (listEmptyList.isEmpty()) {
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = null;
                }
                c0Var2.E(1171174724);
                if (listEmptyList.isEmpty()) {
                    s3 s3Var6 = s3.f32666a;
                    float fR111 = androidx.compose.ui.unit.h.r(2);
                    float fR112 = androidx.compose.ui.unit.h.r(f11);
                    float fR113 = androidx.compose.ui.unit.h.r(0);
                    float f113 = 4;
                    float fR114 = androidx.compose.ui.unit.h.r(f113);
                    c0Var3 = c0Var2;
                    j10 = jM;
                    t3VarC = s3Var6.c(fR111, fR112, androidx.compose.ui.unit.h.r(f113), fR114, fR113, c0Var3, (s3.f32683r << 15) | 28086, 0);
                } else {
                    c0Var3 = c0Var2;
                    j10 = jM;
                }
                c0Var3.A();
                androidx.compose.runtime.c0 c0Var10 = c0Var3;
                Function0<Unit> function116 = function4;
                a4.g(function116, a0Var118, false, nVar12, s3.f32666a.b(jM7, 0L, 0L, 0L, c0Var10, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var11, Integer num) {
                        invoke(x5Var, c0Var11, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var11, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var11.d()) {
                            c0Var11.u();
                        } else {
                            q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var11, 0, 0, 262138);
                        }
                    }
                }, c0Var10, 54), c0Var10, ((i12 >> 9) & 14) | 805306416, 388);
                c0VarR = c0Var10;
                c0VarR.o();
                list2 = listEmptyList;
                function6 = function116;
                function7 = function115;
                a0Var4 = a0Var117;
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i13 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                f10 = 8;
                nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                a1 a1VarB7 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                y7.n(c0VarD, a1VarB7, aVar7.e());
                y7.n(c0VarD, b1VarK7, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar7.f());
                androidx.compose.foundation.layout.n0 n0Var7 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(1171126918);
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                    function8 = function5;
                    float f114 = f10;
                    c0Var4 = c0VarR;
                    androidx.compose.ui.a0 a0Var119 = a0Var3;
                    Iterator it8 = it;
                    r3 r3VarB7 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                    c0Var4.E(1934484526);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zD = c0Var4.D(secondaryCta) | z10;
                    objI0 = c0Var4.i0();
                    if (zD) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    }
                    Function0 function117 = (Function0) objI0;
                    c0Var4.A();
                    androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var11, Integer num) {
                            invoke(x5Var, c0Var11, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var11, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var11.d()) {
                                c0Var11.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var11, 48);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var11, 0));
                            b1 b1VarK8 = c0Var11.k();
                            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0Var11, aVar8);
                            androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar9.a();
                            if (c0Var11.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var11.q();
                            if (c0Var11.P()) {
                                c0Var11.q0(function0A2);
                            } else {
                                c0Var11.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var11);
                            y7.n(c0VarD2, a1VarE, aVar9.e());
                            y7.n(c0VarD2, b1VarK8, aVar9.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar9.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN8, aVar9.f());
                            y5 y5Var = y5.f16577a;
                            c0Var11.E(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var11, 0), null, i6.w(d5.t(aVar8, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var11, 440, 0);
                            }
                            c0Var11.A();
                            q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var11, 0, 0, 262138);
                            c0Var11.o();
                        }
                    }, c0Var4, 54);
                    androidx.compose.foundation.a1 a1Var9 = a1VarA;
                    androidx.compose.foundation.shape.n nVar13 = nVarH;
                    androidx.compose.ui.a0 a0Var1110 = a0VarI;
                    a4.g(function117, a0Var1110, false, nVar13, r3VarB7, null, a1Var9, null, null, cVarE7, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f114)), c0Var4, 6);
                    it = it8;
                    function5 = function8;
                    a0VarI = a0Var1110;
                    f10 = f114;
                    nVarH = nVar13;
                    a1VarA = a1Var9;
                    c0VarR = c0Var4;
                    a0Var3 = a0Var119;
                }
                androidx.compose.ui.a0 a0Var1111 = a0Var3;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function118 = function5;
                f11 = f10;
                c0Var2 = c0VarR;
                a1Var = a1VarA;
                androidx.compose.foundation.shape.n nVar14 = nVarH;
                androidx.compose.ui.a0 a0Var1112 = a0VarI;
                t3VarC = null;
                c0Var2.A();
                if (listEmptyList.isEmpty()) {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                }
                long jM8 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                if (listEmptyList.isEmpty()) {
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = null;
                }
                c0Var2.E(1171174724);
                if (listEmptyList.isEmpty()) {
                    s3 s3Var7 = s3.f32666a;
                    float fR115 = androidx.compose.ui.unit.h.r(2);
                    float fR116 = androidx.compose.ui.unit.h.r(f11);
                    float fR117 = androidx.compose.ui.unit.h.r(0);
                    float f115 = 4;
                    float fR118 = androidx.compose.ui.unit.h.r(f115);
                    c0Var3 = c0Var2;
                    j10 = jM;
                    t3VarC = s3Var7.c(fR115, fR116, androidx.compose.ui.unit.h.r(f115), fR118, fR117, c0Var3, (s3.f32683r << 15) | 28086, 0);
                } else {
                    c0Var3 = c0Var2;
                    j10 = jM;
                }
                c0Var3.A();
                androidx.compose.runtime.c0 c0Var11 = c0Var3;
                Function0<Unit> function119 = function4;
                a4.g(function119, a0Var1112, false, nVar14, s3.f32666a.b(jM8, 0L, 0L, 0L, c0Var11, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var12, Integer num) {
                        invoke(x5Var, c0Var12, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var12, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var12.d()) {
                            c0Var12.u();
                        } else {
                            q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var12, 0, 0, 262138);
                        }
                    }
                }, c0Var11, 54), c0Var11, ((i12 >> 9) & 14) | 805306416, 388);
                c0VarR = c0Var11;
                c0VarR.o();
                list2 = listEmptyList;
                function6 = function119;
                function7 = function118;
                a0Var4 = a0Var1111;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function2 = function0;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                function3 = function1;
                if (c0VarR.k0(function3)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.D(surveyUiColors)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if (i17 != 4) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i13 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                    f10 = 8;
                    nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                    a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                    a1 a1VarB8 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    y7.n(c0VarD, a1VarB8, aVar8.e());
                    y7.n(c0VarD, b1VarK8, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar8.f());
                    androidx.compose.foundation.layout.n0 n0Var8 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(1171126918);
                    it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                        function8 = function5;
                        float f116 = f10;
                        c0Var4 = c0VarR;
                        androidx.compose.ui.a0 a0Var1113 = a0Var3;
                        Iterator it9 = it;
                        r3 r3VarB8 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                        c0Var4.E(1934484526);
                        if ((i12 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zD = c0Var4.D(secondaryCta) | z10;
                        objI0 = c0Var4.i0();
                        if (zD) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        }
                        Function0 function1110 = (Function0) objI0;
                        c0Var4.A();
                        androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var12, Integer num) {
                                invoke(x5Var, c0Var12, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var12, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var12.d()) {
                                    c0Var12.u();
                                    return;
                                }
                                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var12, 48);
                                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var12, 0));
                                b1 b1VarK9 = c0Var12.k();
                                androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0Var12, aVar9);
                                androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A2 = aVar10.a();
                                if (c0Var12.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var12.q();
                                if (c0Var12.P()) {
                                    c0Var12.q0(function0A2);
                                } else {
                                    c0Var12.l();
                                }
                                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var12);
                                y7.n(c0VarD2, a1VarE, aVar10.e());
                                y7.n(c0VarD2, b1VarK9, aVar10.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar10.b();
                                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                }
                                y7.n(c0VarD2, a0VarN9, aVar10.f());
                                y5 y5Var = y5.f16577a;
                                c0Var12.E(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var12, 0), null, i6.w(d5.t(aVar9, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var12, 440, 0);
                                }
                                c0Var12.A();
                                q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var12, 0, 0, 262138);
                                c0Var12.o();
                            }
                        }, c0Var4, 54);
                        androidx.compose.foundation.a1 a1Var10 = a1VarA;
                        androidx.compose.foundation.shape.n nVar15 = nVarH;
                        androidx.compose.ui.a0 a0Var1114 = a0VarI;
                        a4.g(function1110, a0Var1114, false, nVar15, r3VarB8, null, a1Var10, null, null, cVarE8, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f116)), c0Var4, 6);
                        it = it9;
                        function5 = function8;
                        a0VarI = a0Var1114;
                        f10 = f116;
                        nVarH = nVar15;
                        a1VarA = a1Var10;
                        c0VarR = c0Var4;
                        a0Var3 = a0Var1113;
                    }
                    androidx.compose.ui.a0 a0Var1115 = a0Var3;
                    Function1<? super SurveyState.Content.SecondaryCta, Unit> function1111 = function5;
                    f11 = f10;
                    c0Var2 = c0VarR;
                    a1Var = a1VarA;
                    androidx.compose.foundation.shape.n nVar16 = nVarH;
                    androidx.compose.ui.a0 a0Var1116 = a0VarI;
                    t3VarC = null;
                    c0Var2.A();
                    if (listEmptyList.isEmpty()) {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                    }
                    long jM9 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                    jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                    if (listEmptyList.isEmpty()) {
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = null;
                    }
                    c0Var2.E(1171174724);
                    if (listEmptyList.isEmpty()) {
                        s3 s3Var8 = s3.f32666a;
                        float fR119 = androidx.compose.ui.unit.h.r(2);
                        float fR1110 = androidx.compose.ui.unit.h.r(f11);
                        float fR1111 = androidx.compose.ui.unit.h.r(0);
                        float f117 = 4;
                        float fR1112 = androidx.compose.ui.unit.h.r(f117);
                        c0Var3 = c0Var2;
                        j10 = jM;
                        t3VarC = s3Var8.c(fR119, fR1110, androidx.compose.ui.unit.h.r(f117), fR1112, fR1111, c0Var3, (s3.f32683r << 15) | 28086, 0);
                    } else {
                        c0Var3 = c0Var2;
                        j10 = jM;
                    }
                    c0Var3.A();
                    androidx.compose.runtime.c0 c0Var12 = c0Var3;
                    Function0<Unit> function1112 = function4;
                    a4.g(function1112, a0Var1116, false, nVar16, s3.f32666a.b(jM9, 0L, 0L, 0L, c0Var12, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var13, Integer num) {
                            invoke(x5Var, c0Var13, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var13, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var13.d()) {
                                c0Var13.u();
                            } else {
                                q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var13, 0, 0, 262138);
                            }
                        }
                    }, c0Var12, 54), c0Var12, ((i12 >> 9) & 14) | 805306416, 388);
                    c0VarR = c0Var12;
                    c0VarR.o();
                    list2 = listEmptyList;
                    function6 = function1112;
                    function7 = function1111;
                    a0Var4 = a0Var1115;
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function2;
                    }
                    if (i13 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                    f10 = 8;
                    nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                    a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                    a1 a1VarB9 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    y7.n(c0VarD, a1VarB9, aVar9.e());
                    y7.n(c0VarD, b1VarK9, aVar9.g());
                    function2B = aVar9.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN9, aVar9.f());
                    androidx.compose.foundation.layout.n0 n0Var9 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(1171126918);
                    it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                        function8 = function5;
                        float f118 = f10;
                        c0Var4 = c0VarR;
                        androidx.compose.ui.a0 a0Var1117 = a0Var3;
                        Iterator it10 = it;
                        r3 r3VarB9 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                        c0Var4.E(1934484526);
                        if ((i12 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zD = c0Var4.D(secondaryCta) | z10;
                        objI0 = c0Var4.i0();
                        if (zD) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                                }
                            };
                            c0Var4.Y(objI0);
                        }
                        Function0 function1113 = (Function0) objI0;
                        c0Var4.A();
                        androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var13, Integer num) {
                                invoke(x5Var, c0Var13, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var13, int i19) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i19 & 81) == 16 && c0Var13.d()) {
                                    c0Var13.u();
                                    return;
                                }
                                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var13, 48);
                                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var13, 0));
                                b1 b1VarK10 = c0Var13.k();
                                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0Var13, aVar10);
                                androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A2 = aVar11.a();
                                if (c0Var13.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var13.q();
                                if (c0Var13.P()) {
                                    c0Var13.q0(function0A2);
                                } else {
                                    c0Var13.l();
                                }
                                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var13);
                                y7.n(c0VarD2, a1VarE, aVar11.e());
                                y7.n(c0VarD2, b1VarK10, aVar11.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar11.b();
                                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                                }
                                y7.n(c0VarD2, a0VarN10, aVar11.f());
                                y5 y5Var = y5.f16577a;
                                c0Var13.E(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var13, 0), null, i6.w(d5.t(aVar10, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var13, 440, 0);
                                }
                                c0Var13.A();
                                q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var13, 0, 0, 262138);
                                c0Var13.o();
                            }
                        }, c0Var4, 54);
                        androidx.compose.foundation.a1 a1Var11 = a1VarA;
                        androidx.compose.foundation.shape.n nVar17 = nVarH;
                        androidx.compose.ui.a0 a0Var1118 = a0VarI;
                        a4.g(function1113, a0Var1118, false, nVar17, r3VarB9, null, a1Var11, null, null, cVarE9, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f118)), c0Var4, 6);
                        it = it10;
                        function5 = function8;
                        a0VarI = a0Var1118;
                        f10 = f118;
                        nVarH = nVar17;
                        a1VarA = a1Var11;
                        c0VarR = c0Var4;
                        a0Var3 = a0Var1117;
                    }
                    androidx.compose.ui.a0 a0Var1119 = a0Var3;
                    Function1<? super SurveyState.Content.SecondaryCta, Unit> function1114 = function5;
                    f11 = f10;
                    c0Var2 = c0VarR;
                    a1Var = a1VarA;
                    androidx.compose.foundation.shape.n nVar18 = nVarH;
                    androidx.compose.ui.a0 a0Var11110 = a0VarI;
                    t3VarC = null;
                    c0Var2.A();
                    if (listEmptyList.isEmpty()) {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                    }
                    long jM10 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                    jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                    if (listEmptyList.isEmpty()) {
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = null;
                    }
                    c0Var2.E(1171174724);
                    if (listEmptyList.isEmpty()) {
                        s3 s3Var9 = s3.f32666a;
                        float fR1113 = androidx.compose.ui.unit.h.r(2);
                        float fR1114 = androidx.compose.ui.unit.h.r(f11);
                        float fR1115 = androidx.compose.ui.unit.h.r(0);
                        float f119 = 4;
                        float fR1116 = androidx.compose.ui.unit.h.r(f119);
                        c0Var3 = c0Var2;
                        j10 = jM;
                        t3VarC = s3Var9.c(fR1113, fR1114, androidx.compose.ui.unit.h.r(f119), fR1116, fR1115, c0Var3, (s3.f32683r << 15) | 28086, 0);
                    } else {
                        c0Var3 = c0Var2;
                        j10 = jM;
                    }
                    c0Var3.A();
                    androidx.compose.runtime.c0 c0Var13 = c0Var3;
                    Function0<Unit> function1115 = function4;
                    a4.g(function1115, a0Var11110, false, nVar18, s3.f32666a.b(jM10, 0L, 0L, 0L, c0Var13, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var14, Integer num) {
                            invoke(x5Var, c0Var14, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var14, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var14.d()) {
                                c0Var14.u();
                            } else {
                                q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var14, 0, 0, 262138);
                            }
                        }
                    }, c0Var13, 54), c0Var13, ((i12 >> 9) & 14) | 805306416, 388);
                    c0VarR = c0Var13;
                    c0VarR.o();
                    list2 = listEmptyList;
                    function6 = function1115;
                    function7 = function1114;
                    a0Var4 = a0Var1119;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i15;
            if (i17 != 4) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i13 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                f10 = 8;
                nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                a1 a1VarB10 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK10 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                y7.n(c0VarD, a1VarB10, aVar10.e());
                y7.n(c0VarD, b1VarK10, aVar10.g());
                function2B = aVar10.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN10, aVar10.f());
                androidx.compose.foundation.layout.n0 n0Var10 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(1171126918);
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                    function8 = function5;
                    float f1110 = f10;
                    c0Var4 = c0VarR;
                    androidx.compose.ui.a0 a0Var11111 = a0Var3;
                    Iterator it11 = it;
                    r3 r3VarB10 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                    c0Var4.E(1934484526);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zD = c0Var4.D(secondaryCta) | z10;
                    objI0 = c0Var4.i0();
                    if (zD) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    }
                    Function0 function1116 = (Function0) objI0;
                    c0Var4.A();
                    androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var14, Integer num) {
                            invoke(x5Var, c0Var14, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var14, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var14.d()) {
                                c0Var14.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
                            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var14, 48);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var14, 0));
                            b1 b1VarK11 = c0Var14.k();
                            androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0Var14, aVar11);
                            androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar12.a();
                            if (c0Var14.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var14.q();
                            if (c0Var14.P()) {
                                c0Var14.q0(function0A2);
                            } else {
                                c0Var14.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var14);
                            y7.n(c0VarD2, a1VarE, aVar12.e());
                            y7.n(c0VarD2, b1VarK11, aVar12.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar12.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN11, aVar12.f());
                            y5 y5Var = y5.f16577a;
                            c0Var14.E(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var14, 0), null, i6.w(d5.t(aVar11, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var14, 440, 0);
                            }
                            c0Var14.A();
                            q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var14, 0, 0, 262138);
                            c0Var14.o();
                        }
                    }, c0Var4, 54);
                    androidx.compose.foundation.a1 a1Var12 = a1VarA;
                    androidx.compose.foundation.shape.n nVar19 = nVarH;
                    androidx.compose.ui.a0 a0Var11112 = a0VarI;
                    a4.g(function1116, a0Var11112, false, nVar19, r3VarB10, null, a1Var12, null, null, cVarE10, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f1110)), c0Var4, 6);
                    it = it11;
                    function5 = function8;
                    a0VarI = a0Var11112;
                    f10 = f1110;
                    nVarH = nVar19;
                    a1VarA = a1Var12;
                    c0VarR = c0Var4;
                    a0Var3 = a0Var11111;
                }
                androidx.compose.ui.a0 a0Var11113 = a0Var3;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function1117 = function5;
                f11 = f10;
                c0Var2 = c0VarR;
                a1Var = a1VarA;
                androidx.compose.foundation.shape.n nVar110 = nVarH;
                androidx.compose.ui.a0 a0Var11114 = a0VarI;
                t3VarC = null;
                c0Var2.A();
                if (listEmptyList.isEmpty()) {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                }
                long jM11 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                if (listEmptyList.isEmpty()) {
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = null;
                }
                c0Var2.E(1171174724);
                if (listEmptyList.isEmpty()) {
                    s3 s3Var10 = s3.f32666a;
                    float fR1117 = androidx.compose.ui.unit.h.r(2);
                    float fR1118 = androidx.compose.ui.unit.h.r(f11);
                    float fR1119 = androidx.compose.ui.unit.h.r(0);
                    float f1111 = 4;
                    float fR11110 = androidx.compose.ui.unit.h.r(f1111);
                    c0Var3 = c0Var2;
                    j10 = jM;
                    t3VarC = s3Var10.c(fR1117, fR1118, androidx.compose.ui.unit.h.r(f1111), fR11110, fR1119, c0Var3, (s3.f32683r << 15) | 28086, 0);
                } else {
                    c0Var3 = c0Var2;
                    j10 = jM;
                }
                c0Var3.A();
                androidx.compose.runtime.c0 c0Var14 = c0Var3;
                Function0<Unit> function1118 = function4;
                a4.g(function1118, a0Var11114, false, nVar110, s3.f32666a.b(jM11, 0L, 0L, 0L, c0Var14, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var15, Integer num) {
                        invoke(x5Var, c0Var15, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var15, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var15.d()) {
                            c0Var15.u();
                        } else {
                            q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var15, 0, 0, 262138);
                        }
                    }
                }, c0Var14, 54), c0Var14, ((i12 >> 9) & 14) | 805306416, 388);
                c0VarR = c0Var14;
                c0VarR.o();
                list2 = listEmptyList;
                function6 = function1118;
                function7 = function1117;
                a0Var4 = a0Var11113;
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i13 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                f10 = 8;
                nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                a1 a1VarB11 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                y7.n(c0VarD, a1VarB11, aVar11.e());
                y7.n(c0VarD, b1VarK11, aVar11.g());
                function2B = aVar11.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11, aVar11.f());
                androidx.compose.foundation.layout.n0 n0Var11 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(1171126918);
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                    function8 = function5;
                    float f1112 = f10;
                    c0Var4 = c0VarR;
                    androidx.compose.ui.a0 a0Var11115 = a0Var3;
                    Iterator it12 = it;
                    r3 r3VarB11 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                    c0Var4.E(1934484526);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zD = c0Var4.D(secondaryCta) | z10;
                    objI0 = c0Var4.i0();
                    if (zD) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    }
                    Function0 function1119 = (Function0) objI0;
                    c0Var4.A();
                    androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var15, Integer num) {
                            invoke(x5Var, c0Var15, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var15, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var15.d()) {
                                c0Var15.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var15, 48);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var15, 0));
                            b1 b1VarK12 = c0Var15.k();
                            androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0Var15, aVar12);
                            androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar13.a();
                            if (c0Var15.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var15.q();
                            if (c0Var15.P()) {
                                c0Var15.q0(function0A2);
                            } else {
                                c0Var15.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var15);
                            y7.n(c0VarD2, a1VarE, aVar13.e());
                            y7.n(c0VarD2, b1VarK12, aVar13.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar13.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN12, aVar13.f());
                            y5 y5Var = y5.f16577a;
                            c0Var15.E(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var15, 0), null, i6.w(d5.t(aVar12, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var15, 440, 0);
                            }
                            c0Var15.A();
                            q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var15, 0, 0, 262138);
                            c0Var15.o();
                        }
                    }, c0Var4, 54);
                    androidx.compose.foundation.a1 a1Var13 = a1VarA;
                    androidx.compose.foundation.shape.n nVar111 = nVarH;
                    androidx.compose.ui.a0 a0Var11116 = a0VarI;
                    a4.g(function1119, a0Var11116, false, nVar111, r3VarB11, null, a1Var13, null, null, cVarE11, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f1112)), c0Var4, 6);
                    it = it12;
                    function5 = function8;
                    a0VarI = a0Var11116;
                    f10 = f1112;
                    nVarH = nVar111;
                    a1VarA = a1Var13;
                    c0VarR = c0Var4;
                    a0Var3 = a0Var11115;
                }
                androidx.compose.ui.a0 a0Var11117 = a0Var3;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function11110 = function5;
                f11 = f10;
                c0Var2 = c0VarR;
                a1Var = a1VarA;
                androidx.compose.foundation.shape.n nVar112 = nVarH;
                androidx.compose.ui.a0 a0Var11118 = a0VarI;
                t3VarC = null;
                c0Var2.A();
                if (listEmptyList.isEmpty()) {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                }
                long jM12 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                if (listEmptyList.isEmpty()) {
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = null;
                }
                c0Var2.E(1171174724);
                if (listEmptyList.isEmpty()) {
                    s3 s3Var11 = s3.f32666a;
                    float fR11111 = androidx.compose.ui.unit.h.r(2);
                    float fR11112 = androidx.compose.ui.unit.h.r(f11);
                    float fR11113 = androidx.compose.ui.unit.h.r(0);
                    float f1113 = 4;
                    float fR11114 = androidx.compose.ui.unit.h.r(f1113);
                    c0Var3 = c0Var2;
                    j10 = jM;
                    t3VarC = s3Var11.c(fR11111, fR11112, androidx.compose.ui.unit.h.r(f1113), fR11114, fR11113, c0Var3, (s3.f32683r << 15) | 28086, 0);
                } else {
                    c0Var3 = c0Var2;
                    j10 = jM;
                }
                c0Var3.A();
                androidx.compose.runtime.c0 c0Var15 = c0Var3;
                Function0<Unit> function11111 = function4;
                a4.g(function11111, a0Var11118, false, nVar112, s3.f32666a.b(jM12, 0L, 0L, 0L, c0Var15, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var16, Integer num) {
                        invoke(x5Var, c0Var16, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var16, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var16.d()) {
                            c0Var16.u();
                        } else {
                            q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var16, 0, 0, 262138);
                        }
                    }
                }, c0Var15, 54), c0Var15, ((i12 >> 9) & 14) | 805306416, 388);
                c0VarR = c0Var15;
                c0VarR.o();
                list2 = listEmptyList;
                function6 = function11111;
                function7 = function11110;
                a0Var4 = a0Var11117;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function3 = function1;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c0VarR.D(surveyUiColors)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            if (i17 != 4) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i13 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                f10 = 8;
                nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                a1 a1VarB12 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                y7.n(c0VarD, a1VarB12, aVar12.e());
                y7.n(c0VarD, b1VarK12, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN12, aVar12.f());
                androidx.compose.foundation.layout.n0 n0Var12 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(1171126918);
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                    function8 = function5;
                    float f1114 = f10;
                    c0Var4 = c0VarR;
                    androidx.compose.ui.a0 a0Var11119 = a0Var3;
                    Iterator it13 = it;
                    r3 r3VarB12 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                    c0Var4.E(1934484526);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zD = c0Var4.D(secondaryCta) | z10;
                    objI0 = c0Var4.i0();
                    if (zD) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    }
                    Function0 function11112 = (Function0) objI0;
                    c0Var4.A();
                    androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var16, Integer num) {
                            invoke(x5Var, c0Var16, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var16, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var16.d()) {
                                c0Var16.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
                            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var16, 48);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var16, 0));
                            b1 b1VarK13 = c0Var16.k();
                            androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0Var16, aVar13);
                            androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar14.a();
                            if (c0Var16.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var16.q();
                            if (c0Var16.P()) {
                                c0Var16.q0(function0A2);
                            } else {
                                c0Var16.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var16);
                            y7.n(c0VarD2, a1VarE, aVar14.e());
                            y7.n(c0VarD2, b1VarK13, aVar14.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar14.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN13, aVar14.f());
                            y5 y5Var = y5.f16577a;
                            c0Var16.E(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var16, 0), null, i6.w(d5.t(aVar13, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var16, 440, 0);
                            }
                            c0Var16.A();
                            q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var16, 0, 0, 262138);
                            c0Var16.o();
                        }
                    }, c0Var4, 54);
                    androidx.compose.foundation.a1 a1Var14 = a1VarA;
                    androidx.compose.foundation.shape.n nVar113 = nVarH;
                    androidx.compose.ui.a0 a0Var111110 = a0VarI;
                    a4.g(function11112, a0Var111110, false, nVar113, r3VarB12, null, a1Var14, null, null, cVarE12, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f1114)), c0Var4, 6);
                    it = it13;
                    function5 = function8;
                    a0VarI = a0Var111110;
                    f10 = f1114;
                    nVarH = nVar113;
                    a1VarA = a1Var14;
                    c0VarR = c0Var4;
                    a0Var3 = a0Var11119;
                }
                androidx.compose.ui.a0 a0Var111111 = a0Var3;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function11113 = function5;
                f11 = f10;
                c0Var2 = c0VarR;
                a1Var = a1VarA;
                androidx.compose.foundation.shape.n nVar114 = nVarH;
                androidx.compose.ui.a0 a0Var111112 = a0VarI;
                t3VarC = null;
                c0Var2.A();
                if (listEmptyList.isEmpty()) {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                }
                long jM13 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                if (listEmptyList.isEmpty()) {
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = null;
                }
                c0Var2.E(1171174724);
                if (listEmptyList.isEmpty()) {
                    s3 s3Var12 = s3.f32666a;
                    float fR11115 = androidx.compose.ui.unit.h.r(2);
                    float fR11116 = androidx.compose.ui.unit.h.r(f11);
                    float fR11117 = androidx.compose.ui.unit.h.r(0);
                    float f1115 = 4;
                    float fR11118 = androidx.compose.ui.unit.h.r(f1115);
                    c0Var3 = c0Var2;
                    j10 = jM;
                    t3VarC = s3Var12.c(fR11115, fR11116, androidx.compose.ui.unit.h.r(f1115), fR11118, fR11117, c0Var3, (s3.f32683r << 15) | 28086, 0);
                } else {
                    c0Var3 = c0Var2;
                    j10 = jM;
                }
                c0Var3.A();
                androidx.compose.runtime.c0 c0Var16 = c0Var3;
                Function0<Unit> function11114 = function4;
                a4.g(function11114, a0Var111112, false, nVar114, s3.f32666a.b(jM13, 0L, 0L, 0L, c0Var16, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var17, Integer num) {
                        invoke(x5Var, c0Var17, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var17, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var17.d()) {
                            c0Var17.u();
                        } else {
                            q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var17, 0, 0, 262138);
                        }
                    }
                }, c0Var16, 54), c0Var16, ((i12 >> 9) & 14) | 805306416, 388);
                c0VarR = c0Var16;
                c0VarR.o();
                list2 = listEmptyList;
                function6 = function11114;
                function7 = function11113;
                a0Var4 = a0Var111111;
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function2;
                }
                if (i13 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
                f10 = 8;
                nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
                a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
                a1 a1VarB13 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK13 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                y7.n(c0VarD, a1VarB13, aVar13.e());
                y7.n(c0VarD, b1VarK13, aVar13.g());
                function2B = aVar13.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN13, aVar13.f());
                androidx.compose.foundation.layout.n0 n0Var13 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(1171126918);
                it = listEmptyList.iterator();
                while (it.hasNext()) {
                    secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                    function8 = function5;
                    float f1116 = f10;
                    c0Var4 = c0VarR;
                    androidx.compose.ui.a0 a0Var111113 = a0Var3;
                    Iterator it14 = it;
                    r3 r3VarB13 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                    c0Var4.E(1934484526);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zD = c0Var4.D(secondaryCta) | z10;
                    objI0 = c0Var4.i0();
                    if (zD) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                            }
                        };
                        c0Var4.Y(objI0);
                    }
                    Function0 function11115 = (Function0) objI0;
                    c0Var4.A();
                    androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var17, Integer num) {
                            invoke(x5Var, c0Var17, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var17, int i19) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i19 & 81) == 16 && c0Var17.d()) {
                                c0Var17.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var17, 48);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var17, 0));
                            b1 b1VarK14 = c0Var17.k();
                            androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0Var17, aVar14);
                            androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar15.a();
                            if (c0Var17.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var17.q();
                            if (c0Var17.P()) {
                                c0Var17.q0(function0A2);
                            } else {
                                c0Var17.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var17);
                            y7.n(c0VarD2, a1VarE, aVar15.e());
                            y7.n(c0VarD2, b1VarK14, aVar15.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar15.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN14, aVar15.f());
                            y5 y5Var = y5.f16577a;
                            c0Var17.E(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var17, 0), null, i6.w(d5.t(aVar14, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var17, 440, 0);
                            }
                            c0Var17.A();
                            q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var17, 0, 0, 262138);
                            c0Var17.o();
                        }
                    }, c0Var4, 54);
                    androidx.compose.foundation.a1 a1Var15 = a1VarA;
                    androidx.compose.foundation.shape.n nVar115 = nVarH;
                    androidx.compose.ui.a0 a0Var111114 = a0VarI;
                    a4.g(function11115, a0Var111114, false, nVar115, r3VarB13, null, a1Var15, null, null, cVarE13, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f1116)), c0Var4, 6);
                    it = it14;
                    function5 = function8;
                    a0VarI = a0Var111114;
                    f10 = f1116;
                    nVarH = nVar115;
                    a1VarA = a1Var15;
                    c0VarR = c0Var4;
                    a0Var3 = a0Var111113;
                }
                androidx.compose.ui.a0 a0Var111115 = a0Var3;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function11116 = function5;
                f11 = f10;
                c0Var2 = c0VarR;
                a1Var = a1VarA;
                androidx.compose.foundation.shape.n nVar116 = nVarH;
                androidx.compose.ui.a0 a0Var111116 = a0VarI;
                t3VarC = null;
                c0Var2.A();
                if (listEmptyList.isEmpty()) {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
                }
                long jM14 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
                jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
                if (listEmptyList.isEmpty()) {
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = null;
                }
                c0Var2.E(1171174724);
                if (listEmptyList.isEmpty()) {
                    s3 s3Var13 = s3.f32666a;
                    float fR11119 = androidx.compose.ui.unit.h.r(2);
                    float fR111110 = androidx.compose.ui.unit.h.r(f11);
                    float fR111111 = androidx.compose.ui.unit.h.r(0);
                    float f1117 = 4;
                    float fR111112 = androidx.compose.ui.unit.h.r(f1117);
                    c0Var3 = c0Var2;
                    j10 = jM;
                    t3VarC = s3Var13.c(fR11119, fR111110, androidx.compose.ui.unit.h.r(f1117), fR111112, fR111111, c0Var3, (s3.f32683r << 15) | 28086, 0);
                } else {
                    c0Var3 = c0Var2;
                    j10 = jM;
                }
                c0Var3.A();
                androidx.compose.runtime.c0 c0Var17 = c0Var3;
                Function0<Unit> function11117 = function4;
                a4.g(function11117, a0Var111116, false, nVar116, s3.f32666a.b(jM14, 0L, 0L, 0L, c0Var17, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var18, Integer num) {
                        invoke(x5Var, c0Var18, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var18, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var18.d()) {
                            c0Var18.u();
                        } else {
                            q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var18, 0, 0, 262138);
                        }
                    }
                }, c0Var17, 54), c0Var17, ((i12 >> 9) & 14) | 805306416, 388);
                c0VarR = c0Var17;
                c0VarR.o();
                list2 = listEmptyList;
                function6 = function11117;
                function7 = function11116;
                a0Var4 = a0Var111115;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i15;
        if (i17 != 4) {
            if (i16 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i17 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if (i18 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function2;
            }
            if (i13 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
            f10 = 8;
            nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
            a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
            a1 a1VarB14 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK14 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
            y7.n(c0VarD, a1VarB14, aVar14.e());
            y7.n(c0VarD, b1VarK14, aVar14.g());
            function2B = aVar14.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN14, aVar14.f());
            androidx.compose.foundation.layout.n0 n0Var14 = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(1171126918);
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                function8 = function5;
                float f1118 = f10;
                c0Var4 = c0VarR;
                androidx.compose.ui.a0 a0Var111117 = a0Var3;
                Iterator it15 = it;
                r3 r3VarB14 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                c0Var4.E(1934484526);
                if ((i12 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zD = c0Var4.D(secondaryCta) | z10;
                objI0 = c0Var4.i0();
                if (zD) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                        }
                    };
                    c0Var4.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                        }
                    };
                    c0Var4.Y(objI0);
                }
                Function0 function11118 = (Function0) objI0;
                c0Var4.A();
                androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var18, Integer num) {
                        invoke(x5Var, c0Var18, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var18, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var18.d()) {
                            c0Var18.u();
                            return;
                        }
                        androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var18, 48);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var18, 0));
                        b1 b1VarK15 = c0Var18.k();
                        androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0Var18, aVar15);
                        androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar16.a();
                        if (c0Var18.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var18.q();
                        if (c0Var18.P()) {
                            c0Var18.q0(function0A2);
                        } else {
                            c0Var18.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var18);
                        y7.n(c0VarD2, a1VarE, aVar16.e());
                        y7.n(c0VarD2, b1VarK15, aVar16.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar16.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN15, aVar16.f());
                        y5 y5Var = y5.f16577a;
                        c0Var18.E(410193571);
                        if (secondaryCta2.isExternalUrl()) {
                            ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var18, 0), null, i6.w(d5.t(aVar15, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var18, 440, 0);
                        }
                        c0Var18.A();
                        q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var18, 0, 0, 262138);
                        c0Var18.o();
                    }
                }, c0Var4, 54);
                androidx.compose.foundation.a1 a1Var16 = a1VarA;
                androidx.compose.foundation.shape.n nVar117 = nVarH;
                androidx.compose.ui.a0 a0Var111118 = a0VarI;
                a4.g(function11118, a0Var111118, false, nVar117, r3VarB14, null, a1Var16, null, null, cVarE14, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f1118)), c0Var4, 6);
                it = it15;
                function5 = function8;
                a0VarI = a0Var111118;
                f10 = f1118;
                nVarH = nVar117;
                a1VarA = a1Var16;
                c0VarR = c0Var4;
                a0Var3 = a0Var111117;
            }
            androidx.compose.ui.a0 a0Var111119 = a0Var3;
            Function1<? super SurveyState.Content.SecondaryCta, Unit> function11119 = function5;
            f11 = f10;
            c0Var2 = c0VarR;
            a1Var = a1VarA;
            androidx.compose.foundation.shape.n nVar118 = nVarH;
            androidx.compose.ui.a0 a0Var1111110 = a0VarI;
            t3VarC = null;
            c0Var2.A();
            if (listEmptyList.isEmpty()) {
                pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
            } else {
                pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
            }
            long jM15 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
            jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
            if (listEmptyList.isEmpty()) {
                a1Var2 = a1Var;
            } else {
                a1Var2 = null;
            }
            c0Var2.E(1171174724);
            if (listEmptyList.isEmpty()) {
                s3 s3Var14 = s3.f32666a;
                float fR111113 = androidx.compose.ui.unit.h.r(2);
                float fR111114 = androidx.compose.ui.unit.h.r(f11);
                float fR111115 = androidx.compose.ui.unit.h.r(0);
                float f1119 = 4;
                float fR111116 = androidx.compose.ui.unit.h.r(f1119);
                c0Var3 = c0Var2;
                j10 = jM;
                t3VarC = s3Var14.c(fR111113, fR111114, androidx.compose.ui.unit.h.r(f1119), fR111116, fR111115, c0Var3, (s3.f32683r << 15) | 28086, 0);
            } else {
                c0Var3 = c0Var2;
                j10 = jM;
            }
            c0Var3.A();
            androidx.compose.runtime.c0 c0Var18 = c0Var3;
            Function0<Unit> function111110 = function4;
            a4.g(function111110, a0Var1111110, false, nVar118, s3.f32666a.b(jM15, 0L, 0L, 0L, c0Var18, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var19, Integer num) {
                    invoke(x5Var, c0Var19, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var19, int i19) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i19 & 81) == 16 && c0Var19.d()) {
                        c0Var19.u();
                    } else {
                        q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var19, 0, 0, 262138);
                    }
                }
            }, c0Var18, 54), c0Var18, ((i12 >> 9) & 14) | 805306416, 388);
            c0VarR = c0Var18;
            c0VarR.o();
            list2 = listEmptyList;
            function6 = function111110;
            function7 = function11119;
            a0Var4 = a0Var111119;
        } else {
            if (i16 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i17 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if (i18 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function2;
            }
            if (i13 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            a1VarA = androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), surveyUiColors.m424getButtonBorder0d7_KjU());
            f10 = 8;
            nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f10));
            a0VarI = i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
            a1 a1VarB15 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK15 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
            y7.n(c0VarD, a1VarB15, aVar15.e());
            y7.n(c0VarD, b1VarK15, aVar15.g());
            function2B = aVar15.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN15, aVar15.f());
            androidx.compose.foundation.layout.n0 n0Var15 = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(1171126918);
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                function8 = function5;
                float f11110 = f10;
                c0Var4 = c0VarR;
                androidx.compose.ui.a0 a0Var1111111 = a0Var3;
                Iterator it16 = it;
                r3 r3VarB15 = s3.f32666a.b(surveyUiColors.m423getButton0d7_KjU(), 0L, 0L, 0L, c0Var4, s3.f32683r << 12, 14);
                c0Var4.E(1934484526);
                if ((i12 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zD = c0Var4.D(secondaryCta) | z10;
                objI0 = c0Var4.i0();
                if (zD) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                        }
                    };
                    c0Var4.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(function8, secondaryCta);
                        }
                    };
                    c0Var4.Y(objI0);
                }
                Function0 function111111 = (Function0) objI0;
                c0Var4.A();
                androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(468620518, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var19, Integer num) {
                        invoke(x5Var, c0Var19, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var19, int i19) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i19 & 81) == 16 && c0Var19.d()) {
                            c0Var19.u();
                            return;
                        }
                        androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var19, 48);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var19, 0));
                        b1 b1VarK16 = c0Var19.k();
                        androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0Var19, aVar16);
                        androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar17.a();
                        if (c0Var19.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var19.q();
                        if (c0Var19.P()) {
                            c0Var19.q0(function0A2);
                        } else {
                            c0Var19.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var19);
                        y7.n(c0VarD2, a1VarE, aVar17.e());
                        y7.n(c0VarD2, b1VarK16, aVar17.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar17.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN16, aVar17.f());
                        y5 y5Var = y5.f16577a;
                        c0Var19.E(410193571);
                        if (secondaryCta2.isExternalUrl()) {
                            ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var19, 0), null, i6.w(d5.t(aVar16, androidx.compose.ui.unit.h.r(4), 0.0f, 2, null), androidx.compose.ui.unit.h.r(24)), surveyUiColors2.m427getOnButton0d7_KjU(), c0Var19, 440, 0);
                        }
                        c0Var19.A();
                        q50.t(secondaryCta2.getButtonText(), null, surveyUiColors2.m427getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var19, 0, 0, 262138);
                        c0Var19.o();
                    }
                }, c0Var4, 54);
                androidx.compose.foundation.a1 a1Var17 = a1VarA;
                androidx.compose.foundation.shape.n nVar119 = nVarH;
                androidx.compose.ui.a0 a0Var1111112 = a0VarI;
                a4.g(function111111, a0Var1111112, false, nVar119, r3VarB15, null, a1Var17, null, null, cVarE15, c0Var4, 805306416, androidx.constraintlayout.core.motion.utils.v.c.f44017r);
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f11110)), c0Var4, 6);
                it = it16;
                function5 = function8;
                a0VarI = a0Var1111112;
                f10 = f11110;
                nVarH = nVar119;
                a1VarA = a1Var17;
                c0VarR = c0Var4;
                a0Var3 = a0Var1111111;
            }
            androidx.compose.ui.a0 a0Var1111113 = a0Var3;
            Function1<? super SurveyState.Content.SecondaryCta, Unit> function111112 = function5;
            f11 = f10;
            c0Var2 = c0VarR;
            a1Var = a1VarA;
            androidx.compose.foundation.shape.n nVar1110 = nVarH;
            androidx.compose.ui.a0 a0Var1111114 = a0VarI;
            t3VarC = null;
            c0Var2.A();
            if (listEmptyList.isEmpty()) {
                pair = new Pair(androidx.compose.ui.graphics.q0.n(surveyUiColors.m423getButton0d7_KjU()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m427getOnButton0d7_KjU()));
            } else {
                pair = new Pair(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), androidx.compose.ui.graphics.q0.n(surveyUiColors.m426getOnBackground0d7_KjU()));
            }
            long jM16 = ((androidx.compose.ui.graphics.q0) pair.component1()).M();
            jM = ((androidx.compose.ui.graphics.q0) pair.component2()).M();
            if (listEmptyList.isEmpty()) {
                a1Var2 = a1Var;
            } else {
                a1Var2 = null;
            }
            c0Var2.E(1171174724);
            if (listEmptyList.isEmpty()) {
                s3 s3Var15 = s3.f32666a;
                float fR111117 = androidx.compose.ui.unit.h.r(2);
                float fR111118 = androidx.compose.ui.unit.h.r(f11);
                float fR111119 = androidx.compose.ui.unit.h.r(0);
                float f11111 = 4;
                float fR1111110 = androidx.compose.ui.unit.h.r(f11111);
                c0Var3 = c0Var2;
                j10 = jM;
                t3VarC = s3Var15.c(fR111117, fR111118, androidx.compose.ui.unit.h.r(f11111), fR1111110, fR111119, c0Var3, (s3.f32683r << 15) | 28086, 0);
            } else {
                c0Var3 = c0Var2;
                j10 = jM;
            }
            c0Var3.A();
            androidx.compose.runtime.c0 c0Var19 = c0Var3;
            Function0<Unit> function111113 = function4;
            a4.g(function111113, a0Var1111114, false, nVar1110, s3.f32666a.b(jM16, 0L, 0L, 0L, c0Var19, s3.f32683r << 12, 14), t3VarC, a1Var2, null, null, androidx.compose.runtime.internal.w.e(767351755, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var110, Integer num) {
                    invoke(x5Var, c0Var110, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var110, int i19) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i19 & 81) == 16 && c0Var110.d()) {
                        c0Var110.u();
                    } else {
                        q50.t(primaryCtaText, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var110, 0, 0, 262138);
                    }
                }
            }, c0Var19, 54), c0Var19, ((i12 >> 9) & 14) | 805306416, 388);
            c0VarR = c0Var19;
            c0VarR.o();
            list2 = listEmptyList;
            function6 = function111113;
            function7 = function111112;
            a0Var4 = a0Var1111113;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(a0Var4, primaryCtaText, list2, function6, function7, surveyUiColors, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyCtaButtonComponent$lambda$1(SurveyState.Content.SecondaryCta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, SurveyState.Content.SecondaryCta it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        function1.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyCtaButtonComponent$lambda$6(androidx.compose.ui.a0 a0Var, String primaryCtaText, List list, Function0 function0, Function1 function1, SurveyUiColors surveyUiColors, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(primaryCtaText, "$primaryCtaText");
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        SurveyCtaButtonComponent(a0Var, primaryCtaText, list, function0, function1, surveyUiColors, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
