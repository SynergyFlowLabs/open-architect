package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.t0;
import androidx.compose.material3.ld;
import androidx.compose.material3.os;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import com.facebook.internal.z0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBooleanAttributeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BooleanAttributeCollector.kt\nio/intercom/android/sdk/views/compose/BooleanAttributeCollectorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,263:1\n113#2:264\n113#2:265\n113#2:303\n113#2:337\n113#2:338\n113#2:339\n99#3,6:266\n106#3:302\n99#3,6:304\n106#3:343\n80#4,6:272\n87#4,3:287\n90#4,2:296\n94#4:301\n80#4,6:310\n87#4,3:325\n90#4,2:334\n94#4:342\n391#5,9:278\n400#5,3:298\n391#5,9:316\n400#5:336\n401#5,2:340\n4360#6,6:290\n4360#6,6:328\n85#7:344\n117#7,2:345\n*S KotlinDebug\n*F\n+ 1 BooleanAttributeCollector.kt\nio/intercom/android/sdk/views/compose/BooleanAttributeCollectorKt\n*L\n63#1:264\n70#1:265\n123#1:303\n151#1:337\n152#1:338\n154#1:339\n66#1:266,6\n66#1:302\n133#1:304,6\n133#1:343\n66#1:272,6\n66#1:287,3\n66#1:296,2\n66#1:301\n133#1:310,6\n133#1:325,3\n133#1:334,2\n133#1:342\n66#1:278,9\n66#1:298,3\n133#1:316,9\n133#1:336\n133#1:340,2\n66#1:290,6\n133#1:328,6\n52#1:344\n52#1:345,2\n*E\n"})
public final class BooleanAttributeCollectorKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BooleanAttributeCollector(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final AttributeData attributeData, boolean z10, boolean z11, @Nullable Function1<? super AttributeData, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(attributeData, "attributeData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2100686120);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z12 = (i11 & 4) != 0 ? false : z10;
        boolean z13 = (i11 & 8) != 0 ? false : z11;
        final Function1<? super AttributeData, Unit> function2 = (i11 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$0((AttributeData) obj);
            }
        } : function1;
        final boolean zIsFormDisabled = attributeData.isFormDisabled();
        final boolean submitted = attributeData.getAttribute().getSubmitted();
        final n3 n3Var = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$1(submitted, zIsFormDisabled, attributeData);
            }
        }, c0VarR, 8);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        long jM696getCollectorBorder0d7_KjU = intercomTheme.getColors(c0VarR, i12).m696getCollectorBorder0d7_KjU();
        float fR = androidx.compose.ui.unit.h.r(1);
        androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0VarR, i12).m();
        final boolean z14 = z12;
        androidx.compose.ui.a0 a0VarI = t0.i(i6.i(i6.h(androidx.compose.ui.draw.j.a(a0Var2, eVarM), 0.0f, 1, null), androidx.compose.ui.unit.h.r(40)), fR, jM696getCollectorBorder0d7_KjU, eVarM);
        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.u(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarI);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        BooleanAttributeCollectorOption(y5Var, z14 ? null : BooleanAttributeCollector$lambda$2(n3Var), true, eVarM, zIsFormDisabled, submitted, z13 && Intrinsics.areEqual(BooleanAttributeCollector$lambda$2(n3Var), Boolean.TRUE), new Function0() { // from class: io.intercom.android.sdk.views.compose.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$4(function2, attributeData, n3Var);
            }
        }, c0VarR, 390);
        Boolean boolBooleanAttributeCollector$lambda$2 = null;
        ld.k(i6.d(androidx.compose.ui.a0.E, 0.0f, 1, null), fR, jM696getCollectorBorder0d7_KjU, c0VarR, 54, 0);
        if (!z14) {
            boolBooleanAttributeCollector$lambda$2 = BooleanAttributeCollector$lambda$2(n3Var);
        }
        BooleanAttributeCollectorOption(y5Var, boolBooleanAttributeCollector$lambda$2, false, eVarM, zIsFormDisabled, submitted, z13 && Intrinsics.areEqual(BooleanAttributeCollector$lambda$2(n3Var), Boolean.FALSE), new Function0() { // from class: io.intercom.android.sdk.views.compose.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$5(function2, attributeData, n3Var);
            }
        }, c0VarR, 390);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final boolean z15 = z13;
            final Function1<? super AttributeData, Unit> function3 = function2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$7(a0Var3, attributeData, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 BooleanAttributeCollector$lambda$1(boolean z10, boolean z11, AttributeData attributeData) {
        String value;
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        return d7.g(((z10 || z11) && (value = attributeData.getAttribute().getValue()) != null) ? StringsKt.D5(value) : null, null, 2, null);
    }

    private static final Boolean BooleanAttributeCollector$lambda$2(n3<Boolean> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$6$lambda$4(Function1 function1, AttributeData attributeData, n3 value$delegate) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        value$delegate.setValue(Boolean.TRUE);
        function1.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, z0.P, 127, null), null, false, 6, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$6$lambda$5(Function1 function1, AttributeData attributeData, n3 value$delegate) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        value$delegate.setValue(Boolean.FALSE);
        function1.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, "false", 127, null), null, false, 6, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$7(androidx.compose.ui.a0 a0Var, AttributeData attributeData, boolean z10, boolean z11, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        BooleanAttributeCollector(a0Var, attributeData, z10, z11, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BooleanAttributeCollectorOption(final x5 x5Var, final Boolean bool, final boolean z10, final androidx.compose.foundation.shape.e eVar, final boolean z11, final boolean z12, final boolean z13, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Function0<Unit> function1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1323902640);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(x5Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.D(bool) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c0VarR.D(eVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c0VarR.G(z11) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c0VarR.G(z12) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= c0VarR.G(z13) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            function1 = function0;
            i11 |= c0VarR.k0(function1) ? 8388608 : 4194304;
        } else {
            function1 = function0;
        }
        if ((i11 & 23967451) == 4793490 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.foundation.shape.f fVarC = androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.r(0));
            androidx.compose.foundation.shape.e eVarC = z10 ? androidx.compose.foundation.shape.e.c(eVar, null, fVarC, fVarC, null, 9, null) : androidx.compose.foundation.shape.e.c(eVar, fVarC, null, null, fVarC, 6, null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            long jM697getCollectorSelected0d7_KjU = intercomTheme.getColors(c0VarR, i12).m697getCollectorSelected0d7_KjU();
            long jW = androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(i6.d(aVar, 0.0f, 1, null), eVarC);
            if (!Intrinsics.areEqual(bool, Boolean.valueOf(z10))) {
                jM697getCollectorSelected0d7_KjU = androidx.compose.ui.graphics.q0.f38131b.s();
            }
            androidx.compose.ui.a0 a0VarQ = x5.q(x5Var, i1.j(androidx.compose.foundation.v.d(a0VarA, jM697getCollectorSelected0d7_KjU, null, 2, null), (z11 || z12) ? false : true, null, null, null, function1, 14, null), 1.0f, false, 2, null);
            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarQ);
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
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            c0VarR.E(872785261);
            if (z13) {
                os.F(i6.w(aVar, androidx.compose.ui.unit.h.r(20)), intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), androidx.compose.ui.unit.h.r(3), 0L, 0, 0.0f, c0VarR, 390, 56);
                l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            }
            c0VarR.A();
            String strD = u0.i.d(z10 ? R.string.intercom_attribute_collector_positive : R.string.intercom_attribute_collector_negative, c0VarR, 0);
            int iA = androidx.compose.ui.text.style.j.f42206b.a();
            c0VarR.E(872804846);
            if (!z11 && !Intrinsics.areEqual(bool, Boolean.valueOf(!z10))) {
                jW = intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU();
            }
            long j10 = jW;
            c0VarR.A();
            q50.t(strD, null, j10, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iA), 0L, 0, false, 0, 0, null, null, c0VarR, 0, 0, 261114);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BooleanAttributeCollectorKt.BooleanAttributeCollectorOption$lambda$9(x5Var, bool, z10, eVar, z11, z12, z13, function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollectorOption$lambda$9(x5 this_BooleanAttributeCollectorOption, Boolean bool, boolean z10, androidx.compose.foundation.shape.e shape, boolean z11, boolean z12, boolean z13, Function0 onClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(this_BooleanAttributeCollectorOption, "$this_BooleanAttributeCollectorOption");
        Intrinsics.checkNotNullParameter(shape, "$shape");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        BooleanAttributeCollectorOption(this_BooleanAttributeCollectorOption, bool, z10, shape, z11, z12, z13, onClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BooleanAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1269323591);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m748getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BooleanAttributeCollectorKt.BooleanAttributePreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributePreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BooleanAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void DisabledBooleanAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2015578211);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 3 << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m752getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BooleanAttributeCollectorKt.DisabledBooleanAttributePreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledBooleanAttributePreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DisabledBooleanAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedAndDisabledBooleanAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1476435233);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m754getLambda8$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BooleanAttributeCollectorKt.SubmittedAndDisabledBooleanAttributePreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedAndDisabledBooleanAttributePreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedAndDisabledBooleanAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedBooleanAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-875849702);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m750getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BooleanAttributeCollectorKt.SubmittedBooleanAttributePreview$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedBooleanAttributePreview$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedBooleanAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
