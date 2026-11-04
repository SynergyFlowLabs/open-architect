package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.ag;
import androidx.compose.material3.df;
import androidx.compose.material3.kf;
import androidx.compose.material3.ni;
import androidx.compose.material3.os;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nListAttributeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListAttributeCollector.kt\nio/intercom/android/sdk/views/compose/ListAttributeCollectorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,224:1\n1282#2,6:225\n1282#2,6:231\n85#3:237\n117#3,2:238\n85#3:240\n117#3,2:241\n*S KotlinDebug\n*F\n+ 1 ListAttributeCollector.kt\nio/intercom/android/sdk/views/compose/ListAttributeCollectorKt\n*L\n46#1:225,6\n53#1:231,6\n46#1:237\n46#1:238,2\n47#1:240\n47#1:241,2\n*E\n"})
public final class ListAttributeCollectorKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nListAttributeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListAttributeCollector.kt\nio/intercom/android/sdk/views/compose/ListAttributeCollectorKt$ListAttributeCollector$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n113#2:225\n113#2:226\n1282#3,6:227\n*S KotlinDebug\n*F\n+ 1 ListAttributeCollector.kt\nio/intercom/android/sdk/views/compose/ListAttributeCollectorKt$ListAttributeCollector$3\n*L\n60#1:225\n107#1:226\n104#1:227,6\n*E\n"})
    static final class AnonymousClass3 implements pj.n<kf, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ boolean $disabled;
        final /* synthetic */ n3<Boolean> $expanded$delegate;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
        final /* synthetic */ boolean $showDropdownMenu;
        final /* synthetic */ boolean $submitted;
        final /* synthetic */ n3<String> $value$delegate;

        /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4, reason: invalid class name */
        @SourceDebugExtension({"SMAP\nListAttributeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListAttributeCollector.kt\nio/intercom/android/sdk/views/compose/ListAttributeCollectorKt$ListAttributeCollector$3$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1863#2,2:225\n*S KotlinDebug\n*F\n+ 1 ListAttributeCollector.kt\nio/intercom/android/sdk/views/compose/ListAttributeCollectorKt$ListAttributeCollector$3$4\n*L\n109#1:225,2\n*E\n"})
        static final class AnonymousClass4 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
            final /* synthetic */ AttributeData $attributeData;
            final /* synthetic */ n3<Boolean> $expanded$delegate;
            final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
            final /* synthetic */ n3<String> $value$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(AttributeData attributeData, Function1<? super AttributeData, Unit> function1, n3<String> n3Var, n3<Boolean> n3Var2) {
                this.$attributeData = attributeData;
                this.$onSubmitAttribute = function1;
                this.$value$delegate = n3Var;
                this.$expanded$delegate = n3Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(String option, Function1 function1, AttributeData attributeData, n3 value$delegate, n3 expanded$delegate) {
                Intrinsics.checkNotNullParameter(option, "$option");
                Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
                Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
                Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
                ListAttributeCollectorKt.ListAttributeCollector$lambda$6(value$delegate, option);
                ListAttributeCollectorKt.ListAttributeCollector$lambda$3(expanded$delegate, false);
                function1.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, option, 127, null), null, false, 6, null));
                return Unit.f312394a;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                invoke(m0Var, c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.layout.m0 ExposedDropdownMenu, androidx.compose.runtime.c0 c0Var, int i10) {
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
                if ((i10 & 81) == 16 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                List<String> options = this.$attributeData.getAttribute().getOptions();
                if (options == null) {
                    return;
                }
                final Function1<AttributeData, Unit> function1 = this.$onSubmitAttribute;
                final AttributeData attributeData = this.$attributeData;
                final n3<String> n3Var = this.$value$delegate;
                final n3<Boolean> n3Var2 = this.$expanded$delegate;
                for (final String str : options) {
                    androidx.compose.material3.r.i(androidx.compose.runtime.internal.w.e(1941734396, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4$1$1
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
                            } else {
                                q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                            }
                        }
                    }, c0Var, 54), new Function0() { // from class: io.intercom.android.sdk.views.compose.e0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ListAttributeCollectorKt.AnonymousClass3.AnonymousClass4.invoke$lambda$1$lambda$0(str, function1, attributeData, n3Var, n3Var2);
                        }
                    }, null, null, null, false, null, null, null, c0Var, 6, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(boolean z10, boolean z11, AttributeData attributeData, n3<String> n3Var, boolean z12, boolean z13, n3<Boolean> n3Var2, Function1<? super AttributeData, Unit> function1) {
            this.$disabled = z10;
            this.$showDropdownMenu = z11;
            this.$attributeData = attributeData;
            this.$value$delegate = n3Var;
            this.$submitted = z12;
            this.$loading = z13;
            this.$expanded$delegate = n3Var2;
            this.$onSubmitAttribute = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(n3 expanded$delegate) {
            Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
            int i10 = 0 << 0;
            ListAttributeCollectorKt.ListAttributeCollector$lambda$3(expanded$delegate, false);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(kf kfVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(kfVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(kf ExposedDropdownMenuBox, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
            if ((i10 & 14) == 0) {
                i11 = i10 | (c0Var.D(ExposedDropdownMenuBox) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0 a0VarT = kf.t(ExposedDropdownMenuBox, i6.i(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(40)), df.f27099b.b(), false, 2, null);
            String strListAttributeCollector$lambda$5 = ListAttributeCollectorKt.ListAttributeCollector$lambda$5(this.$value$delegate);
            boolean z10 = !this.$disabled;
            Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.views.compose.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ListAttributeCollectorKt.AnonymousClass3.invoke$lambda$0((String) obj);
                }
            };
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2M755getLambda1$intercom_sdk_base_release = ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m755getLambda1$intercom_sdk_base_release();
            final boolean z11 = this.$submitted;
            final boolean z12 = this.$loading;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strListAttributeCollector$lambda$5, function1, a0VarT, z10, true, null, null, function2M755getLambda1$intercom_sdk_base_release, null, androidx.compose.runtime.internal.w.e(-1903726860, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt.ListAttributeCollector.3.2
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
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarW = i6.w(d5.v(aVar, androidx.compose.ui.unit.h.r(8), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.unit.h.r(40));
                    androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
                    boolean z13 = z11;
                    boolean z14 = z12;
                    a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarW);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK, aVar2.e());
                    y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar2.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (z13) {
                        c0Var2.E(-1795451461);
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var2, 0), null, null, IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var2, 56, 4);
                        c0Var2.A();
                    } else if (z14) {
                        c0Var2.E(175868479);
                        os.F(i6.w(aVar, androidx.compose.ui.unit.h.r(20)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), androidx.compose.ui.unit.h.r(3), 0L, 0, 0.0f, c0Var2, 390, 56);
                        c0Var2.A();
                    } else {
                        c0Var2.E(-1795433709);
                        ni.o(u0.e.c(R.drawable.intercom_list_arrow_down, c0Var2, 0), null, null, 0L, c0Var2, 56, 12);
                        c0Var2.A();
                    }
                    c0Var2.o();
                }
            }, c0Var, 54), false, null, null, null, true, 0, 0, null, null, null, null, c0Var, 817913904, 24576, 0, 2080096);
            if (this.$showDropdownMenu) {
                boolean z13 = !this.$attributeData.isFormDisabled() && ListAttributeCollectorKt.ListAttributeCollector$lambda$2(this.$expanded$delegate);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i12 = IntercomTheme.$stable;
                long jM690getBackground0d7_KjU = intercomTheme.getColors(c0Var, i12).m690getBackground0d7_KjU();
                androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0Var, i12).m();
                float fR = androidx.compose.ui.unit.h.r(8);
                c0Var.E(-742015086);
                final n3<Boolean> n3Var = this.$expanded$delegate;
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.views.compose.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ListAttributeCollectorKt.AnonymousClass3.invoke$lambda$2$lambda$1(n3Var);
                        }
                    };
                    c0Var.Y(objI0);
                }
                c0Var.A();
                ExposedDropdownMenuBox.i(z13, (Function0) objI0, null, null, false, eVarM, jM690getBackground0d7_KjU, 0.0f, fR, null, androidx.compose.runtime.internal.w.e(-1185294213, true, new AnonymousClass4(this.$attributeData, this.$onSubmitAttribute, this.$value$delegate, this.$expanded$delegate), c0Var, 54), c0Var, 100663344, (kf.f30035a << 3) | 6 | ((i11 << 3) & com.planner5d.library.engine.input.f.b.B), 668);
            }
        }
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void DisabledListAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(865192767);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m761getLambda7$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListAttributeCollectorKt.DisabledListAttributePreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledListAttributePreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DisabledListAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ListAttributeCollector(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final AttributeData attributeData, boolean z10, boolean z11, @Nullable Function1<? super AttributeData, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(attributeData, "attributeData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1993212876);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z12 = false;
        boolean z13 = (i11 & 4) != 0 ? false : z10;
        boolean z14 = (i11 & 8) != 0 ? false : z11;
        Function1<? super AttributeData, Unit> function2 = (i11 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$0((AttributeData) obj);
            }
        } : function1;
        boolean zIsFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        c0VarR.E(497283745);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        c0VarR.A();
        n3 n3Var2 = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$4(attributeData);
            }
        }, c0VarR, 8);
        if (z13 || (!zIsFormDisabled && !submitted)) {
            z12 = true;
        }
        androidx.compose.ui.a0 a0VarH = i6.h(a0Var2, 0.0f, 1, null);
        boolean zListAttributeCollector$lambda$2 = ListAttributeCollector$lambda$2(n3Var);
        c0VarR.E(497294500);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar.a()) {
            objI1 = new Function1() { // from class: io.intercom.android.sdk.views.compose.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ListAttributeCollectorKt.ListAttributeCollector$lambda$8$lambda$7(n3Var, ((Boolean) obj).booleanValue());
                }
            };
            c0VarR.Y(objI1);
        }
        c0VarR.A();
        final boolean z15 = z14;
        ag.h(zListAttributeCollector$lambda$2, (Function1) objI1, a0VarH, androidx.compose.runtime.internal.w.e(1992435426, true, new AnonymousClass3(zIsFormDisabled, z12, attributeData, n3Var2, submitted, z15, n3Var, function2), c0VarR, 54), c0VarR, 3120, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function1<? super AttributeData, Unit> function3 = function2;
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            final boolean z16 = z13;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListAttributeCollectorKt.ListAttributeCollector$lambda$9(a0Var3, attributeData, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCollector$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ListAttributeCollector$lambda$2(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$3(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 ListAttributeCollector$lambda$4(AttributeData attributeData) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return d7.g(value, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ListAttributeCollector$lambda$5(n3<String> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$6(n3<String> n3Var, String str) {
        n3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCollector$lambda$8$lambda$7(n3 expanded$delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        ListAttributeCollector$lambda$3(expanded$delegate, z10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCollector$lambda$9(androidx.compose.ui.a0 a0Var, AttributeData attributeData, boolean z10, boolean z11, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        ListAttributeCollector(a0Var, attributeData, z10, z11, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ListAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1324269915);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m757getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListAttributeCollectorKt.ListAttributePreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributePreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ListAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedAndDisabledListAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1340154819);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 0 & 7;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m763getLambda9$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListAttributeCollectorKt.SubmittedAndDisabledListAttributePreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedAndDisabledListAttributePreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedAndDisabledListAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedListAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-899805828);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m759getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListAttributeCollectorKt.SubmittedListAttributePreview$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedListAttributePreview$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedListAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
