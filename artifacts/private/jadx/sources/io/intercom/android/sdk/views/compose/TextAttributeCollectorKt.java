package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.c4;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.e4;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.text.b4;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.AttributeCollectorValidatorKt;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;
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
@SourceDebugExtension({"SMAP\nTextAttributeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAttributeCollector.kt\nio/intercom/android/sdk/views/compose/TextAttributeCollectorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,368:1\n75#2:369\n113#3:370\n113#3:371\n113#3:372\n113#3:373\n113#3:374\n113#3:411\n113#3:412\n70#4:375\n68#4,8:376\n77#4:416\n80#5,6:384\n87#5,3:399\n90#5,2:408\n94#5:415\n391#6,9:390\n400#6:410\n401#6,2:413\n4360#7,6:402\n85#8:417\n117#8,2:418\n85#8:420\n117#8,2:421\n*S KotlinDebug\n*F\n+ 1 TextAttributeCollector.kt\nio/intercom/android/sdk/views/compose/TextAttributeCollectorKt\n*L\n53#1:369\n80#1:370\n163#1:371\n166#1:372\n167#1:373\n172#1:374\n188#1:411\n189#1:412\n161#1:375\n161#1:376,8\n161#1:416\n161#1:384,6\n161#1:399,3\n161#1:408,2\n161#1:415\n161#1:390,9\n161#1:410\n161#1:413,2\n161#1:402,6\n71#1:417\n71#1:418,2\n73#1:420\n73#1:421,2\n*E\n"})
public final class TextAttributeCollectorKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$TextAttributeCollector$6, reason: invalid class name */
    static final class AnonymousClass6 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ boolean $disabled;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
        final /* synthetic */ Function1<String, Unit> $onValidationError;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ androidx.compose.foundation.shape.e $shape;
        final /* synthetic */ boolean $submitted;
        final /* synthetic */ n3<String> $value$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(boolean z10, boolean z11, boolean z12, androidx.compose.foundation.shape.e eVar, Function1<? super String, Unit> function1, Resources resources, AttributeData attributeData, Function1<? super AttributeData, Unit> function2, n3<String> n3Var) {
            this.$disabled = z10;
            this.$submitted = z11;
            this.$loading = z12;
            this.$shape = eVar;
            this.$onValidationError = function1;
            this.$resources = resources;
            this.$attributeData = attributeData;
            this.$onSubmitAttribute = function2;
            this.$value$delegate = n3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(Function1 function1, Resources resources, AttributeData attributeData, Function1 function2, n3 value$delegate) {
            Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
            Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
            String string = StringsKt.E5(TextAttributeCollectorKt.TextAttributeCollector$lambda$3(value$delegate)).toString();
            if (string.length() == 0) {
                String string2 = resources.getString(R.string.intercom_string_is_incorrect);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                function1.invoke(string2);
            } else {
                Attribute attribute = attributeData.getAttribute();
                int iValidateAttribute = AttributeValidatorUtils.validateAttribute(string, attribute.getRenderType());
                if (iValidateAttribute == 0) {
                    function1.invoke("");
                    function2.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attribute, null, null, null, false, null, null, null, string, 127, null), null, false, 6, null));
                } else {
                    Intrinsics.checkNotNull(resources);
                    function1.invoke(AttributeCollectorValidatorKt.getErrorStringFromCode(resources, iValidateAttribute));
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            boolean z10 = this.$disabled;
            boolean z11 = this.$submitted;
            boolean z12 = this.$loading;
            androidx.compose.foundation.shape.e eVar = this.$shape;
            final Function1<String, Unit> function1 = this.$onValidationError;
            final Resources resources = this.$resources;
            final AttributeData attributeData = this.$attributeData;
            final Function1<AttributeData, Unit> function2 = this.$onSubmitAttribute;
            final n3<String> n3Var = this.$value$delegate;
            TextAttributeCollectorKt.TextAttributeTrailingComponent(z10, z11, z12, eVar, new Function0() { // from class: io.intercom.android.sdk.views.compose.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextAttributeCollectorKt.AnonymousClass6.invoke$lambda$0(function1, resources, attributeData, function2, n3Var);
                }
            }, c0Var, 0);
        }
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void DisabledTextAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1615951967);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m774getLambda8$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.DisabledTextAttributePreview$lambda$15(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledTextAttributePreview$lambda$15(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DisabledTextAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void EmptyTextAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(990171980);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m770getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.EmptyTextAttributePreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyTextAttributePreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        EmptyTextAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FilledTextAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1421911931);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 5 & 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m768getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.FilledTextAttributePreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTextAttributePreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FilledTextAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PhoneAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2075517560);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m767getLambda12$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.PhoneAttributePreview$lambda$17(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneAttributePreview$lambda$17(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PhoneAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedAndDisabledTextAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1140989915);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m765getLambda10$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.SubmittedAndDisabledTextAttributePreview$lambda$16(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedAndDisabledTextAttributePreview$lambda$16(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedAndDisabledTextAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedTextAttributePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(914016734);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 1 ^ 7;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m772getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.SubmittedTextAttributePreview$lambda$14(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedTextAttributePreview$lambda$14(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedTextAttributePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextAttributeCollector(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final AttributeData attributeData, boolean z10, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super AttributeData, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final CountryAreaCode countryAreaCodeFromLocale;
        boolean z11;
        androidx.compose.runtime.internal.c cVarE;
        Intrinsics.checkNotNullParameter(attributeData, "attributeData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1938202913);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z12 = (i11 & 4) != 0 ? false : z10;
        Function1<? super String, Unit> function3 = (i11 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$0((String) obj);
            }
        } : function1;
        Function1<? super AttributeData, Unit> function4 = (i11 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$1((AttributeData) obj);
            }
        } : function2;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        Resources resources = context.getResources();
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        androidx.compose.foundation.shape.e eVarM = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
        if (isPhoneType(attributeData)) {
            PhoneNumberValidator.loadCountryAreaCodes(context);
            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
        } else {
            countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
        }
        boolean zIsFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        boolean zAreEqual = Intrinsics.areEqual(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
        final n3 n3Var = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$2(attributeData);
            }
        }, c0VarR, 8);
        final n3 n3Var2 = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5(attributeData, countryAreaCodeFromLocale);
            }
        }, c0VarR, 8);
        androidx.compose.ui.a0 a0VarA = zAreEqual ? c4.a(a0Var2, e4.Max) : i6.i(a0Var2, androidx.compose.ui.unit.h.r(40));
        String strTextAttributeCollector$lambda$3 = TextAttributeCollector$lambda$3(n3Var);
        boolean z13 = !zIsFormDisabled;
        b4 b4Var = new b4(0, (Boolean) null, getKeyboardType(attributeData), 0, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 123, (DefaultConstructorMarker) null);
        boolean z14 = !zAreEqual;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        int i12 = zAreEqual ? 2 : 1;
        c0VarR.E(1971829893);
        if (isPhoneType(attributeData)) {
            z11 = true;
            cVarE = androidx.compose.runtime.internal.w.e(61348507, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i13) {
                    if ((i13 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    String strTextAttributeCollector$lambda$6 = TextAttributeCollectorKt.TextAttributeCollector$lambda$6(n3Var2);
                    Intrinsics.checkNotNullExpressionValue(strTextAttributeCollector$lambda$6, "access$TextAttributeCollector$lambda$6(...)");
                    q50.t(strTextAttributeCollector$lambda$6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                }
            }, c0VarR, 54);
        } else {
            z11 = true;
            cVarE = null;
        }
        androidx.compose.runtime.internal.c cVar = cVarE;
        c0VarR.A();
        final Function1<? super String, Unit> function5 = function3;
        final boolean z15 = z12;
        final Function1<? super AttributeData, Unit> function6 = function4;
        IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$3, new Function1() { // from class: io.intercom.android.sdk.views.compose.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$8(attributeData, n3Var, n3Var2, (String) obj);
            }
        }, a0VarA, z13, submitted, null, null, androidx.compose.runtime.internal.w.e(-1290485581, z11, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i13) {
                if ((i13 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                AttributeData attributeData2 = attributeData;
                CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                Intrinsics.checkNotNull(countryAreaCode);
                q50.t(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m705getHintText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262138);
            }
        }, c0VarR, 54), cVar, androidx.compose.runtime.internal.w.e(930248561, z11, new AnonymousClass6(zIsFormDisabled, submitted, z15, eVarM, function5, resources, attributeData, function4, n3Var), c0VarR, 54), false, null, b4Var, null, z14, 3, i12, null, eVarM, null, null, c0VarR, 817889280, androidx.profileinstaller.n.c.f73814m, 0, 1715296);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.TextAttributeCollector$lambda$9(a0Var3, attributeData, z15, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$1(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 TextAttributeCollector$lambda$2(AttributeData attributeData) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return d7.g(value, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$3(n3<String> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 TextAttributeCollector$lambda$5(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        return d7.g(isPhoneType(attributeData) ? countryAreaCode.getEmoji() : "", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$6(n3<String> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$8(AttributeData attributeData, n3 value$delegate, n3 countryFlag$delegate, String it) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        Intrinsics.checkNotNullParameter(countryFlag$delegate, "$countryFlag$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        value$delegate.setValue(it);
        if (isPhoneType(attributeData)) {
            countryFlag$delegate.setValue(getCountryAreaCodeFromText(it).getEmoji());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$9(androidx.compose.ui.a0 a0Var, AttributeData attributeData, boolean z10, Function1 function1, Function1 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        TextAttributeCollector(a0Var, attributeData, z10, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextAttributeTrailingComponent(final boolean z10, final boolean z11, final boolean z12, final androidx.compose.foundation.shape.e eVar, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        long jM684getAction0d7_KjU;
        long jM708getOnAction0d7_KjU;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1872215775);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.G(z11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.G(z12) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c0VarR.D(eVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c0VarR.k0(function0) ? 16384 : 8192;
        }
        if ((i11 & 46811) == 9362 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (z11) {
                c0VarR.E(803987533);
                c0VarR.A();
                jM684getAction0d7_KjU = androidx.compose.ui.graphics.q0.f38131b.s();
            } else if (z10) {
                c0VarR.E(803989226);
                jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m700getDisabled0d7_KjU();
                c0VarR.A();
            } else {
                c0VarR.E(803990696);
                jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m684getAction0d7_KjU();
                c0VarR.A();
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            float f10 = 0;
            androidx.compose.ui.a0 a0VarJ = i1.j(i6.B(i6.d(androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(d5.v(aVar, androidx.compose.ui.unit.h.r(8), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.e.c(eVar, androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.r(f10)), null, null, androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.r(f10)), 6, null)), jM684getAction0d7_KjU, null, 2, null), 0.0f, 1, null), androidx.compose.ui.unit.h.r(40)), (z11 || z12 || z10) ? false : true, null, null, null, function0, 14, null);
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            if (z11) {
                c0VarR.E(1118235440);
                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), null, null, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m686getActive0d7_KjU(), c0VarR, 56, 4);
                c0VarR.A();
            } else if (z12) {
                c0VarR.E(305789581);
                os.F(i6.w(aVar, androidx.compose.ui.unit.h.r(20)), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m708getOnAction0d7_KjU(), androidx.compose.ui.unit.h.r(3), 0L, 0, 0.0f, c0VarR, 390, 56);
                c0VarR = c0VarR;
                c0VarR.A();
            } else {
                c0VarR.E(1118249365);
                androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_chevron, c0VarR, 0);
                if (z10) {
                    c0VarR.E(1118255019);
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m710getOnDisabled0d7_KjU();
                } else {
                    c0VarR.E(1118256201);
                    jM708getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m708getOnAction0d7_KjU();
                }
                c0VarR.A();
                ni.o(bVarC, null, null, jM708getOnAction0d7_KjU, c0VarR, 56, 4);
                c0VarR.A();
            }
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAttributeCollectorKt.TextAttributeTrailingComponent$lambda$11(z10, z11, z12, eVar, function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeTrailingComponent$lambda$11(boolean z10, boolean z11, boolean z12, androidx.compose.foundation.shape.e shape, Function0 onClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(shape, "$shape");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        TextAttributeTrailingComponent(z10, z11, z12, shape, onClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final CountryAreaCode getCountryAreaCodeFromText(String str) {
        CountryAreaCode countryAreaCodeFromNumber = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(PhoneNumberValidator.normalizeNumber(str)));
        Intrinsics.checkNotNullExpressionValue(countryAreaCodeFromNumber, "getCountryAreaCodeFromNumber(...)");
        return countryAreaCodeFromNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHint(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        String str;
        String renderType = attributeData.getAttribute().getRenderType();
        if (Intrinsics.areEqual(renderType, "email")) {
            return "email@domain.com";
        }
        if (!Intrinsics.areEqual(renderType, "phone")) {
            return "";
        }
        if (Intrinsics.areEqual(countryAreaCode, CountryAreaCode.UNKNOWN)) {
            str = "+1";
        } else {
            str = '+' + countryAreaCode.getDialCode();
        }
        return str + " 123 456 7890";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int getKeyboardType(AttributeData attributeData) {
        String renderType = attributeData.getAttribute().getRenderType();
        switch (renderType.hashCode()) {
            case -1034364087:
                if (renderType.equals(AttributeType.NUMBER)) {
                    return androidx.compose.ui.text.input.b0.f41811b.g();
                }
                break;
            case 96619420:
                if (renderType.equals("email")) {
                    return androidx.compose.ui.text.input.b0.f41811b.e();
                }
                break;
            case 97526364:
                if (renderType.equals("float")) {
                    return androidx.compose.ui.text.input.b0.f41811b.c();
                }
                break;
            case 106642798:
                if (renderType.equals("phone")) {
                    return androidx.compose.ui.text.input.b0.f41811b.m();
                }
                break;
        }
        return androidx.compose.ui.text.input.b0.f41811b.o();
    }

    private static final boolean isPhoneType(AttributeData attributeData) {
        return Intrinsics.areEqual(attributeData.getAttribute().getRenderType(), "phone");
    }
}
