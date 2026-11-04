package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Iterator;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nAttributeCollectorCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeCollectorCard.kt\nio/intercom/android/sdk/views/compose/AttributeCollectorCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,242:1\n75#2:243\n*S KotlinDebug\n*F\n+ 1 AttributeCollectorCard.kt\nio/intercom/android/sdk/views/compose/AttributeCollectorCardKt\n*L\n40#1:243\n*E\n"})
public final class AttributeCollectorCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$AttributeCollectorCard$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nAttributeCollectorCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeCollectorCard.kt\nio/intercom/android/sdk/views/compose/AttributeCollectorCardKt$AttributeCollectorCard$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,242:1\n113#2:243\n113#2:327\n113#2:365\n113#2:370\n113#2:377\n87#3:244\n84#3,9:245\n87#3:289\n83#3,10:290\n94#3:381\n94#3:385\n80#4,6:254\n87#4,3:269\n90#4,2:278\n80#4,6:300\n87#4,3:315\n90#4,2:324\n80#4,6:338\n87#4,3:353\n90#4,2:362\n94#4:368\n94#4:380\n94#4:384\n391#5,9:260\n400#5:280\n391#5,9:306\n400#5:326\n391#5,9:344\n400#5:364\n401#5,2:366\n401#5,2:378\n401#5,2:382\n4360#6,6:272\n4360#6,6:318\n4360#6,6:356\n360#7,7:281\n1#8:288\n99#9:328\n96#9,9:329\n106#9:369\n1282#10,6:371\n85#11:386\n117#11,2:387\n*S KotlinDebug\n*F\n+ 1 AttributeCollectorCard.kt\nio/intercom/android/sdk/views/compose/AttributeCollectorCardKt$AttributeCollectorCard$2\n*L\n47#1:243\n64#1:327\n80#1:365\n94#1:370\n130#1:377\n46#1:244\n46#1:245,9\n55#1:289\n55#1:290,10\n55#1:381\n46#1:385\n46#1:254,6\n46#1:269,3\n46#1:278,2\n55#1:300,6\n55#1:315,3\n55#1:324,2\n66#1:338,6\n66#1:353,3\n66#1:362,2\n66#1:368\n55#1:380\n46#1:384\n46#1:260,9\n46#1:280\n55#1:306,9\n55#1:326\n66#1:344,9\n66#1:364\n66#1:366,2\n55#1:378,2\n46#1:382,2\n46#1:272,6\n55#1:318,6\n66#1:356,6\n49#1:281,7\n66#1:328\n66#1:329,9\n66#1:369\n107#1:371,6\n56#1:386\n56#1:387,2\n*E\n"})
    static final class AnonymousClass2 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ List<Attribute> $attributes;
        final /* synthetic */ List<String> $failedAttributeIdentifiers;
        final /* synthetic */ boolean $isFormDisabled;
        final /* synthetic */ List<String> $loadingAttributeIdentifiers;
        final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
        final /* synthetic */ String $partId;
        final /* synthetic */ Resources $resources;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<Attribute> list, List<String> list2, Resources resources, List<String> list3, String str, boolean z10, Function1<? super AttributeData, Unit> function1) {
            this.$attributes = list;
            this.$failedAttributeIdentifiers = list2;
            this.$resources = resources;
            this.$loadingAttributeIdentifiers = list3;
            this.$partId = str;
            this.$isFormDisabled = z10;
            this.$onSubmitAttribute = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n3 invoke$lambda$10$lambda$9$lambda$2() {
            return d7.g("", null, 2, null);
        }

        private static final String invoke$lambda$10$lambda$9$lambda$3(n3<String> n3Var) {
            return n3Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3 validationError$delegate, String it) {
            Intrinsics.checkNotNullParameter(validationError$delegate, "$validationError$delegate");
            Intrinsics.checkNotNullParameter(it, "it");
            validationError$delegate.setValue(it);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:120:0x049a A[PHI: r4
          0x049a: PHI (r4v20 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>) = 
          (r4v4 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v5 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v7 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v8 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v10 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v11 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v12 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v15 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v21 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
         binds: [B:119:0x0498, B:110:0x046a, B:107:0x045d, B:149:?, B:145:?, B:148:?, B:147:?, B:146:?, B:83:0x03f5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:121:0x04a6 A[PHI: r4
          0x04a6: PHI (r4v13 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>) = 
          (r4v4 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v7 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
          (r4v14 kotlin.jvm.functions.Function1<io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit>)
         binds: [B:119:0x0498, B:107:0x045d, B:87:0x0402] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:123:0x04be  */
        /* JADX WARN: Code duplicated, block: B:125:0x04c6  */
        /* JADX WARN: Failed to find 'out' block for switch in B:82:0x03f2. Please report as an issue. */
        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.ui.a0.a aVar;
            IntercomTheme intercomTheme;
            int i11;
            Function1<AttributeData, Unit> function1;
            final n3 n3Var;
            boolean zD;
            Object objI0;
            androidx.compose.runtime.c0 c0Var2 = c0Var;
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var2.d()) {
                c0Var2.u();
                return;
            }
            float f10 = 24;
            androidx.compose.ui.a0 a0VarR = d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f10));
            List<Attribute> list = this.$attributes;
            List<String> list2 = this.$failedAttributeIdentifiers;
            Resources resources = this.$resources;
            List<String> list3 = this.$loadingAttributeIdentifiers;
            String str = this.$partId;
            boolean z10 = this.$isFormDisabled;
            Function1<AttributeData, Unit> function2 = this.$onSubmitAttribute;
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
            b1 b1VarK = c0Var2.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarR);
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            Iterator<Attribute> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (!it.next().hasValue()) {
                    break;
                } else {
                    i12++;
                }
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : list.size() - 1;
            c0Var2.E(1866899712);
            int i13 = iIntValue + 1;
            int i14 = 0;
            while (i14 < i13) {
                Attribute attribute = list.get(i14);
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
                Function1<AttributeData, Unit> function3 = function2;
                a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(mVarY, aVar4.u(), c0Var2, 0);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK2 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, aVar3);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                int i15 = i13;
                Function0<androidx.compose.ui.node.g> function0A2 = aVar5.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A2);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                float f11 = f10;
                y7.n(c0VarD2, a1VarB2, aVar5.e());
                y7.n(c0VarD2, b1VarK2, aVar5.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar5.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar5.f());
                androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                n3 n3Var2 = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$2();
                    }
                }, c0Var2, 56);
                String string = list2.contains(attribute.getIdentifier()) ? resources.getString(R.string.intercom_something_went_wrong_try_again) : "";
                Intrinsics.checkNotNull(string);
                boolean zContains = list3.contains(attribute.getIdentifier());
                c0Var2.E(672001750);
                if (i14 > 0) {
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f11)), c0Var2, 6);
                }
                c0Var2.A();
                androidx.compose.ui.a0 a0VarH = i6.h(aVar3, 0.0f, 1, null);
                a1 a1VarE = u5.e(qVar.w(), aVar4.w(), c0Var2, 0);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK3 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarH);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar5.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarE, aVar5.e());
                y7.n(c0VarD3, b1VarK3, aVar5.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar5.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar5.f());
                androidx.compose.ui.a0 a0VarQ = x5.q(y5.f16577a, aVar3, 1.0f, false, 2, null);
                String name = list.size() > 1 ? (i14 + 1) + ". " + attribute.getName() : attribute.getName();
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                y3 type04 = intercomTheme2.getTypography(c0Var2, i16).getType04();
                androidx.compose.ui.text.style.v.a aVar6 = androidx.compose.ui.text.style.v.f42256b;
                List<Attribute> list4 = list;
                List<String> list5 = list2;
                Resources resources2 = resources;
                List<String> list6 = list3;
                String str2 = str;
                boolean z11 = z10;
                int i17 = i14;
                Function1<AttributeData, Unit> function4 = function3;
                q50.t(name, a0VarQ, 0L, null, 0L, null, null, null, 0L, null, null, 0L, aVar6.c(), false, 2, 0, null, type04, c0Var, 0, 24960, 110588);
                androidx.compose.runtime.c0 c0Var3 = c0Var;
                c0Var3.E(-86962638);
                if (i17 != 0 || list4.size() <= 1) {
                    aVar = aVar3;
                    intercomTheme = intercomTheme2;
                    i11 = i16;
                } else {
                    aVar = aVar3;
                    i11 = i16;
                    intercomTheme = intercomTheme2;
                    q50.t('(' + i15 + " / " + list4.size() + ')', d5.v(aVar3, androidx.compose.ui.unit.h.r(8), 0.0f, 0.0f, 0.0f, 14, null), u0.a.a(R.color.intercom_attribute_input_hint, c0Var3, 0), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0Var3, i16).getType04(), c0Var, 48, 0, 131064);
                    c0Var3 = c0Var;
                }
                c0Var3.A();
                c0Var3.o();
                AttributeData attributeData = new AttributeData(attribute, str2, z11);
                androidx.compose.ui.a0.a aVar7 = aVar;
                float f12 = 12;
                androidx.compose.ui.a0 a0VarV = d5.v(i6.h(aVar7, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(f12), 0.0f, 0.0f, 13, null);
                String renderType = attribute.getRenderType();
                switch (renderType.hashCode()) {
                    case -1034364087:
                        function1 = function4;
                        if (!renderType.equals(AttributeType.NUMBER)) {
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit = Unit.f312394a;
                            function4 = function1;
                            n3Var = n3Var2;
                        } else {
                            c0Var3.E(672066800);
                            c0Var3.E(672076166);
                            n3Var = n3Var2;
                            zD = c0Var3.D(n3Var);
                            objI0 = c0Var3.i0();
                            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            c0Var3.A();
                            TextAttributeCollectorKt.TextAttributeCollector(a0VarV, attributeData, zContains, (Function1) objI0, function1, c0Var3, 70, 0);
                            function4 = function1;
                            c0Var3.A();
                            Unit unit2 = Unit.f312394a;
                        }
                        break;
                    case 3322014:
                        function1 = function4;
                        if (renderType.equals(AttributeType.LIST)) {
                            c0Var3.E(672092489);
                            ListAttributeCollectorKt.ListAttributeCollector(a0VarV, attributeData, string.length() > 0, zContains, function1, c0Var3, 70, 0);
                            c0Var3.A();
                            Unit unit3 = Unit.f312394a;
                        } else {
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit4 = Unit.f312394a;
                        }
                        function4 = function1;
                        n3Var = n3Var2;
                        break;
                    case 3556653:
                        function1 = function4;
                        if (!renderType.equals("text")) {
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit5 = Unit.f312394a;
                            function4 = function1;
                            n3Var = n3Var2;
                        } else {
                            c0Var3.E(672066800);
                            c0Var3.E(672076166);
                            n3Var = n3Var2;
                            zD = c0Var3.D(n3Var);
                            objI0 = c0Var3.i0();
                            if (zD) {
                                objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            c0Var3.A();
                            TextAttributeCollectorKt.TextAttributeCollector(a0VarV, attributeData, zContains, (Function1) objI0, function1, c0Var3, 70, 0);
                            function4 = function1;
                            c0Var3.A();
                            Unit unit6 = Unit.f312394a;
                        }
                        break;
                    case 64711720:
                        if (renderType.equals("boolean")) {
                            c0Var3.E(672079756);
                            BooleanAttributeCollectorKt.BooleanAttributeCollector(a0VarV, attributeData, string.length() > 0, zContains, function4, c0Var3, 70, 0);
                            c0Var3.A();
                            Unit unit7 = Unit.f312394a;
                        } else {
                            function1 = function4;
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit8 = Unit.f312394a;
                            function4 = function1;
                        }
                        n3Var = n3Var2;
                        break;
                    case 75849770:
                        if (!renderType.equals(AttributeType.WEBSITE)) {
                            function1 = function4;
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit9 = Unit.f312394a;
                            function4 = function1;
                            n3Var = n3Var2;
                        }
                        function1 = function4;
                        c0Var3.E(672066800);
                        c0Var3.E(672076166);
                        n3Var = n3Var2;
                        zD = c0Var3.D(n3Var);
                        objI0 = c0Var3.i0();
                        if (zD) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        c0Var3.A();
                        TextAttributeCollectorKt.TextAttributeCollector(a0VarV, attributeData, zContains, (Function1) objI0, function1, c0Var3, 70, 0);
                        function4 = function1;
                        c0Var3.A();
                        Unit unit10 = Unit.f312394a;
                        break;
                    case 96619420:
                        if (!renderType.equals("email")) {
                            function1 = function4;
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit11 = Unit.f312394a;
                            function4 = function1;
                            n3Var = n3Var2;
                        }
                        function1 = function4;
                        c0Var3.E(672066800);
                        c0Var3.E(672076166);
                        n3Var = n3Var2;
                        zD = c0Var3.D(n3Var);
                        objI0 = c0Var3.i0();
                        if (zD) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        c0Var3.A();
                        TextAttributeCollectorKt.TextAttributeCollector(a0VarV, attributeData, zContains, (Function1) objI0, function1, c0Var3, 70, 0);
                        function4 = function1;
                        c0Var3.A();
                        Unit unit12 = Unit.f312394a;
                        break;
                    case 97526364:
                        if (!renderType.equals("float")) {
                            function1 = function4;
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit13 = Unit.f312394a;
                            function4 = function1;
                            n3Var = n3Var2;
                        }
                        function1 = function4;
                        c0Var3.E(672066800);
                        c0Var3.E(672076166);
                        n3Var = n3Var2;
                        zD = c0Var3.D(n3Var);
                        objI0 = c0Var3.i0();
                        if (zD) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        c0Var3.A();
                        TextAttributeCollectorKt.TextAttributeCollector(a0VarV, attributeData, zContains, (Function1) objI0, function1, c0Var3, 70, 0);
                        function4 = function1;
                        c0Var3.A();
                        Unit unit14 = Unit.f312394a;
                        break;
                    case 106642798:
                        if (!renderType.equals("phone")) {
                            function1 = function4;
                            c0Var3.E(-639614028);
                            c0Var3.A();
                            Unit unit15 = Unit.f312394a;
                            function4 = function1;
                            n3Var = n3Var2;
                        }
                        function1 = function4;
                        c0Var3.E(672066800);
                        c0Var3.E(672076166);
                        n3Var = n3Var2;
                        zD = c0Var3.D(n3Var);
                        objI0 = c0Var3.i0();
                        if (zD) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.views.compose.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(n3Var, (String) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        c0Var3.A();
                        TextAttributeCollectorKt.TextAttributeCollector(a0VarV, attributeData, zContains, (Function1) objI0, function1, c0Var3, 70, 0);
                        function4 = function1;
                        c0Var3.A();
                        Unit unit16 = Unit.f312394a;
                        break;
                    default:
                        function1 = function4;
                        c0Var3.E(-639614028);
                        c0Var3.A();
                        Unit unit17 = Unit.f312394a;
                        function4 = function1;
                        n3Var = n3Var2;
                        break;
                }
                c0Var3.E(672105265);
                if (invoke$lambda$10$lambda$9$lambda$3(n3Var).length() > 0 || string.length() > 0) {
                    androidx.compose.ui.a0 a0VarV2 = d5.v(i6.h(aVar7, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(f12), 0.0f, 0.0f, 13, null);
                    String strInvoke$lambda$10$lambda$9$lambda$3 = invoke$lambda$10$lambda$9$lambda$3(n3Var);
                    if (strInvoke$lambda$10$lambda$9$lambda$3.length() == 0) {
                        strInvoke$lambda$10$lambda$9$lambda$3 = string;
                    }
                    q50.t(strInvoke$lambda$10$lambda$9$lambda$3, a0VarV2, u0.a.a(R.color.intercom_attribute_collector_error, c0Var3, 0), null, 0L, null, null, null, 0L, null, null, 0L, aVar6.c(), false, 3, 0, null, intercomTheme.getTypography(c0Var3, i11).getType04(), c0Var, 48, 24960, 110584);
                }
                c0Var.A();
                c0Var.o();
                i14 = i17 + 1;
                c0Var2 = c0Var;
                f10 = f11;
                resources = resources2;
                list3 = list6;
                list = list4;
                list2 = list5;
                function2 = function4;
                str = str2;
                z10 = z11;
                i13 = i15;
            }
            c0Var.A();
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AttributeCollectorCard(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<Attribute> attributes, @Nullable List<String> list, @Nullable List<String> list2, @NotNull final String partId, boolean z10, @Nullable Function1<? super AttributeData, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(partId, "partId");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-136461083);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        List<String> listEmptyList = (i11 & 4) != 0 ? CollectionsKt.emptyList() : list;
        List<String> listEmptyList2 = (i11 & 8) != 0 ? CollectionsKt.emptyList() : list2;
        boolean z11 = (i11 & 32) != 0 ? false : z10;
        Function1<? super AttributeData, Unit> function2 = (i11 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$0((AttributeData) obj);
            }
        } : function1;
        Resources resources = ((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).getResources();
        IntercomCardStyle.Style styleM596conversationCardStylePEIptTM = IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31);
        final boolean z12 = z11;
        final Function1<? super AttributeData, Unit> function3 = function2;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(attributes, listEmptyList, resources, listEmptyList2, partId, z12, function3);
        final List<String> list3 = listEmptyList;
        final List<String> list4 = listEmptyList2;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        IntercomCardKt.IntercomCard(a0Var3, styleM596conversationCardStylePEIptTM, androidx.compose.runtime.internal.w.e(-1007698855, true, anonymousClass2, c0VarR, 54), c0VarR, (i10 & 14) | a5.S0 | (IntercomCardStyle.Style.$stable << 3), 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$1(a0Var3, attributes, list3, list4, partId, z12, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributeCollectorCard$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributeCollectorCard$lambda$1(androidx.compose.ui.a0 a0Var, List attributes, List list, List list2, String partId, boolean z10, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(attributes, "$attributes");
        Intrinsics.checkNotNullParameter(partId, "$partId");
        AttributeCollectorCard(a0Var, attributes, list, list2, partId, z10, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BooleanAttributeCard(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-96019153);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m740getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributeCollectorCardKt.BooleanAttributeCard$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCard$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BooleanAttributeCard(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ListAttributeCard(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-100505407);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m742getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributeCollectorCardKt.ListAttributeCard$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCard$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ListAttributeCard(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MultipleAttributeCard(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(327354419);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            boolean z10 = true | false;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m746getLambda8$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributeCollectorCardKt.MultipleAttributeCard$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleAttributeCard$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MultipleAttributeCard(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextAttributeCard(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1807263952);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m744getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.views.compose.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributeCollectorCardKt.TextAttributeCard$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCard$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextAttributeCard(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
