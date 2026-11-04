package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFooterNotice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FooterNotice.kt\nio/intercom/android/sdk/m5/components/FooterNoticeKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,217:1\n70#2:218\n67#2,9:219\n77#2:266\n80#3,6:228\n87#3,3:243\n90#3,2:252\n94#3:265\n80#3,6:277\n87#3,3:292\n90#3,2:301\n94#3:307\n80#3,6:320\n87#3,3:335\n90#3,2:344\n94#3:351\n391#4,9:234\n400#4:254\n401#4,2:263\n391#4,9:283\n400#4:303\n401#4,2:305\n391#4,9:326\n400#4:346\n401#4,2:349\n4360#5,6:246\n4360#5,6:295\n4360#5,6:338\n1282#6,6:255\n75#7:261\n1#8:262\n87#9:267\n84#9,9:268\n94#9:308\n113#10:304\n113#10:347\n113#10:348\n113#10:353\n99#11:309\n95#11,10:310\n106#11:352\n*S KotlinDebug\n*F\n+ 1 FooterNotice.kt\nio/intercom/android/sdk/m5/components/FooterNoticeKt\n*L\n40#1:218\n40#1:219,9\n40#1:266\n40#1:228,6\n40#1:243,3\n40#1:252,2\n40#1:265\n73#1:277,6\n73#1:292,3\n73#1:301,2\n73#1:307\n121#1:320,6\n121#1:335,3\n121#1:344,2\n121#1:351\n40#1:234,9\n40#1:254\n40#1:263,2\n73#1:283,9\n73#1:303\n73#1:305,2\n121#1:326,9\n121#1:346\n121#1:349,2\n40#1:246,6\n73#1:295,6\n121#1:338,6\n44#1:255,6\n51#1:261\n73#1:267\n73#1:268,9\n73#1:308\n80#1:304\n128#1:347\n132#1:348\n31#1:353\n121#1:309\n121#1:310,10\n121#1:352\n*E\n"})
public final class FooterNoticeKt {
    private static final float HandoverPillBottomPadding = androidx.compose.ui.unit.h.r(10);

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ExpandedFooterNotice(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String title, @NotNull final String subtitle, @NotNull final List<AvatarWrapper> avatars, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0Var2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1076553086);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
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
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        FooterTitle(title, avatars, c0VarR, ((i10 >> 3) & 14) | 64);
        c0VarR.E(2043466329);
        if (subtitle.length() > 0) {
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            c0Var2 = c0VarR;
            q50.t(subtitle, null, intercomTheme.getColors(c0VarR, i12).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i12).getType04Point5(), c0Var2, (i10 >> 6) & 14, 0, 130042);
        } else {
            c0Var2 = c0VarR;
        }
        c0Var2.A();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.m1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.ExpandedFooterNotice$lambda$6(a0Var2, title, subtitle, avatars, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFooterNotice$lambda$6(androidx.compose.ui.a0 a0Var, String title, String subtitle, List avatars, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(subtitle, "$subtitle");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        ExpandedFooterNotice(a0Var, title, subtitle, avatars, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ExpandedFooterNoticePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1644521079);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m127getLambda1$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.o1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.ExpandedFooterNoticePreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFooterNoticePreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ExpandedFooterNoticePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ExpandedFooterNoticePreviewMultipleAvatars(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(419901737);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m128getLambda2$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.j1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ExpandedFooterNoticePreviewMultipleAvatars(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ExpandedTitleOnlyFooterNoticePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-385296499);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m129getLambda3$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.k1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.ExpandedTitleOnlyFooterNoticePreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTitleOnlyFooterNoticePreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ExpandedTitleOnlyFooterNoticePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FooterNoticePill(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String title, @NotNull final List<AvatarWrapper> avatars, @NotNull final Function0<Unit> onClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2116373339);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
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
        y7.n(c0VarD, a1VarK, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        c0VarR.E(-2063426416);
        Object objI0 = c0VarR.i0();
        Object obj = objI0;
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            androidx.compose.animation.core.w1 w1Var = new androidx.compose.animation.core.w1(Boolean.FALSE);
            w1Var.f(Boolean.TRUE);
            c0VarR.Y(w1Var);
            obj = w1Var;
        }
        c0VarR.A();
        androidx.compose.animation.k.d((androidx.compose.animation.core.w1) obj, null, TransitionsKt.floatingButtonEnterTransition((int) ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(HandoverPillBottomPadding)), null, null, androidx.compose.runtime.internal.w.e(-1063955783, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$FooterNoticePill$1$1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(lVar, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i12) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                FooterNoticeKt.FooterNoticePillWithoutAnimation(title, avatars, onClick, c0Var2, 64);
            }
        }, c0VarR, 54), c0VarR, androidx.compose.animation.core.w1.f13348e | androidx.profileinstaller.n.c.f73814m, 26);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.h1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FooterNoticeKt.FooterNoticePill$lambda$4(a0Var2, title, avatars, onClick, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePill$lambda$4(androidx.compose.ui.a0 a0Var, String title, List avatars, Function0 onClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        FooterNoticePill(a0Var, title, avatars, onClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FooterNoticePillMultipleAvatarsPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(961872365);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m131getLambda5$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.l1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.FooterNoticePillMultipleAvatarsPreview$lambda$14(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePillMultipleAvatarsPreview$lambda$14(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FooterNoticePillMultipleAvatarsPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FooterNoticePillPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(615648759);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m130getLambda4$intercom_sdk_base_release(), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.FooterNoticePillPreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePillPreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FooterNoticePillPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FooterNoticePillWithoutAnimation(final String str, final List<AvatarWrapper> list, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2078164816);
        IntercomCardKt.IntercomCard(function0, d5.r(androidx.compose.ui.a0.E, HandoverPillBottomPadding), false, IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).g(), 0L, 0L, 0.0f, null, 0L, c0VarR, IntercomCardStyle.$stable << 18, 62), null, androidx.compose.runtime.internal.w.e(-1065463783, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt.FooterNoticePillWithoutAnimation.1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(m0Var, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var2, int i11) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i11 & 81) == 16 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                androidx.compose.ui.a0 a0VarS = d5.s(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(10), androidx.compose.ui.unit.h.r(12));
                String str2 = str;
                List<AvatarWrapper> list2 = list;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarS);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
                y7.n(c0VarD, a1VarK, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                FooterNoticeKt.FooterTitle(str2, list2, c0Var2, 64);
                c0Var2.o();
            }
        }, c0VarR, 54), c0VarR, ((i10 >> 6) & 14) | 196656 | (IntercomCardStyle.Style.$stable << 9), 20);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.i1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.FooterNoticePillWithoutAnimation$lambda$7(str, list, function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePillWithoutAnimation$lambda$7(String title, List avatars, Function0 onClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        FooterNoticePillWithoutAnimation(title, avatars, onClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FooterTitle(final String str, List<AvatarWrapper> list, androidx.compose.runtime.c0 c0Var, final int i10) {
        final List<AvatarWrapper> list2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-973759395);
        androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
        androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarM, cVarQ, c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
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
        y7.n(c0VarD, a1VarE, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(1829795659);
        if (list.isEmpty()) {
            list2 = list;
        } else {
            list2 = list;
            AvatarGroupKt.m101AvatarGroupJ8mCjc(list2, null, androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.a0.m(10), c0VarR, 3464, 2);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
        }
        c0VarR.A();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        q50.t(str, null, intercomTheme.getColors(c0VarR, i11).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i11).getType04Point5(), c0VarR, i10 & 14, 0, 130042);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.n1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FooterNoticeKt.FooterTitle$lambda$9(str, list2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterTitle$lambda$9(String title, List avatars, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        FooterTitle(title, avatars, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final float getHandoverPillBottomPadding() {
        return HandoverPillBottomPadding;
    }
}
