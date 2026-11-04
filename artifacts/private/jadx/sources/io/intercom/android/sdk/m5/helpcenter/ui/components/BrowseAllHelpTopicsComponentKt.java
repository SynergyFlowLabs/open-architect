package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.a4;
import androidx.compose.material3.q50;
import androidx.compose.material3.s3;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBrowseAllHelpTopicsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowseAllHelpTopicsComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/BrowseAllHelpTopicsComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,114:1\n75#2:115\n75#2:118\n113#3:116\n113#3:117\n113#3:119\n113#3:236\n87#4:120\n84#4,9:121\n87#4:195\n84#4,9:196\n94#4:235\n94#4:244\n80#5,6:130\n87#5,3:145\n90#5,2:154\n80#5,6:168\n87#5,3:183\n90#5,2:192\n80#5,6:205\n87#5,3:220\n90#5,2:229\n94#5:234\n94#5:239\n94#5:243\n391#6,9:136\n400#6:156\n391#6,9:174\n400#6:194\n391#6,9:211\n400#6,3:231\n401#6,2:237\n401#6,2:241\n4360#7,6:148\n4360#7,6:186\n4360#7,6:223\n99#8:157\n95#8,10:158\n106#8:240\n*S KotlinDebug\n*F\n+ 1 BrowseAllHelpTopicsComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/BrowseAllHelpTopicsComponentKt\n*L\n35#1:115\n69#1:118\n49#1:116\n50#1:117\n80#1:119\n94#1:236\n70#1:120\n70#1:121,9\n85#1:195\n85#1:196,9\n85#1:235\n70#1:244\n70#1:130,6\n70#1:145,3\n70#1:154,2\n82#1:168,6\n82#1:183,3\n82#1:192,2\n85#1:205,6\n85#1:220,3\n85#1:229,2\n85#1:234\n82#1:239\n70#1:243\n70#1:136,9\n70#1:156\n82#1:174,9\n82#1:194\n85#1:211,9\n85#1:231,3\n82#1:237,2\n70#1:241,2\n70#1:148,6\n82#1:186,6\n85#1:223,6\n82#1:157\n82#1:158,10\n82#1:240\n*E\n"})
public final class BrowseAllHelpTopicsComponentKt {
    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BrowseAllHelpTopicsASItemPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1268619456);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m345getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsASItemPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrowseAllHelpTopicsASItemPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BrowseAllHelpTopicsASItemPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BrowseAllHelpTopicsAsItem(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-384199751);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = i10 | (c0VarR.D(a0Var2) ? 4 : 2);
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            androidx.compose.ui.a0 a0VarJ = i1.j(i6.h(a0Var3, 0.0f, 1, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem$lambda$2(context);
                }
            }, 15, null);
            float f10 = 16;
            androidx.compose.ui.a0 a0VarV = d5.v(a0VarJ, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 0.0f, 0.0f, 12, null);
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar.u(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.e.c cVarQ = aVar.q();
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            a1 a1VarE = u5.e(qVar.w(), cVarQ, c0VarR, 48);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
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
            y7.n(c0VarD2, a1VarE, aVar2.e());
            y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.ui.a0 a0VarQ = x5.q(y5.f16577a, aVar3, 1.0f, false, 2, null);
            a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar.u(), c0VarR, 0);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
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
            y7.n(c0VarD3, a1VarB2, aVar2.e());
            y7.n(c0VarD3, b1VarK3, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar2.f());
            androidx.compose.ui.a0 a0Var4 = a0Var3;
            q50.t(u0.i.d(R.string.intercom_browse_all_help_topics, c0VarR, 0), null, 0L, null, 0L, null, v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), c0VarR, 1572864, 0, 131006);
            c0Var2 = c0VarR;
            c0Var2.o();
            IntercomChevronKt.IntercomChevron(d5.t(aVar3, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, 6, 0);
            c0Var2.o();
            c0Var2.o();
            a0Var2 = a0Var4;
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem$lambda$6(a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrowseAllHelpTopicsAsItem$lambda$2(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, CollectionsKt.emptyList(), MetricTracker.Place.COLLECTION_LIST);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrowseAllHelpTopicsAsItem$lambda$6(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        BrowseAllHelpTopicsAsItem(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BrowseAllHelpTopicsComponent(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1332059523);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = i10 | (c0VarR.D(a0Var2) ? 4 : 2);
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            s3 s3Var = s3.f32666a;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            a0Var2 = a0Var3;
            a4.n(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent$lambda$0(context);
                }
            }, a0Var2, false, null, s3Var.E(intercomTheme.getColors(c0VarR, i14).m690getBackground0d7_KjU(), intercomTheme.getColors(c0VarR, i14).m714getPrimaryText0d7_KjU(), 0L, 0L, c0VarR, s3.f32683r << 12, 12), null, androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), q0.w(intercomTheme.getColors(c0VarR, i14).m714getPrimaryText0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), d5.g(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(8)), null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m343getLambda1$intercom_sdk_base_release(), c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 817889280, 300);
            c0VarR = c0VarR;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent$lambda$1(a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrowseAllHelpTopicsComponent$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, CollectionsKt.emptyList(), MetricTracker.Place.COLLECTION_LIST);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrowseAllHelpTopicsComponent$lambda$1(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        BrowseAllHelpTopicsComponent(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BrowseAllHelpTopicsComponentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1843811940);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m344getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponentPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrowseAllHelpTopicsComponentPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BrowseAllHelpTopicsComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
