package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.CutAvatarBoxShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAvatarTriangleGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarTriangleGroup.kt\nio/intercom/android/sdk/m5/components/AvatarTriangleGroupKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n113#2:129\n113#2:130\n113#2:179\n113#2:198\n113#2:200\n60#3,9:131\n49#3:140\n52#3,9:180\n52#3,9:189\n52#3:199\n70#4:141\n67#4,9:142\n77#4:204\n80#5,6:151\n87#5,3:166\n90#5,2:175\n94#5:203\n391#6,9:157\n400#6:177\n401#6,2:201\n4360#7,6:169\n1#8:178\n*S KotlinDebug\n*F\n+ 1 AvatarTriangleGroup.kt\nio/intercom/android/sdk/m5/components/AvatarTriangleGroupKt\n*L\n27#1:129\n33#1:130\n45#1:179\n60#1:198\n62#1:200\n34#1:131,9\n34#1:140\n47#1:180,9\n48#1:189,9\n62#1:199\n35#1:141\n35#1:142,9\n35#1:204\n35#1:151,6\n35#1:166,3\n35#1:175,2\n35#1:203\n35#1:157,9\n35#1:177\n35#1:201,2\n35#1:169,6\n*E\n"})
public final class AvatarTriangleGroupKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: AvatarTriangleGroup--jt2gSs, reason: not valid java name */
    public static final void m102AvatarTriangleGroupjt2gSs(@NotNull final List<AvatarWrapper> avatars, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.graphics.q3 composeShape;
        int i12;
        androidx.compose.ui.graphics.q3 q3Var2;
        float f11;
        androidx.compose.ui.a0 a0Var2;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-534156342);
        androidx.compose.ui.a0 a0Var3 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        if ((i11 & 4) != 0) {
            composeShape = AvatarIconKt.getComposeShape(AvatarShape.CIRCLE);
            i12 = i10 & (-897);
        } else {
            composeShape = q3Var;
            i12 = i10;
        }
        float fR = (i11 & 8) != 0 ? androidx.compose.ui.unit.h.r(32) : f10;
        long jM = androidx.compose.ui.unit.a0.m(12);
        if (avatars.size() > 1) {
            c0VarR.E(643591148);
            float f12 = 2;
            float fR2 = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fR / f12) + androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(1) * f12));
            androidx.compose.ui.a0 a0VarW = i6.w(a0Var3, fR);
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarW);
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
            AvatarWrapper avatarWrapper = avatars.size() > 0 ? avatars.get(0) : AvatarWrapper.Companion.getNULL();
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            float f13 = fR - fR2;
            androidx.compose.ui.a0 a0Var4 = a0Var3;
            float f14 = fR;
            int i13 = i12;
            AvatarIconKt.m173AvatarIconRd90Nhg(d0Var.b(i6.w(aVar3, fR2), aVar.y()), avatarWrapper, new CutAvatarBoxShape(composeShape, androidx.compose.ui.unit.h.r(f12), CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(f13) / f12)), androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(f13))), TuplesKt.to(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(-androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(f13) / f12))), androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(f13)))}), null), false, jM, null, c0VarR, 24640, 40);
            AvatarIconKt.m173AvatarIconRd90Nhg(d0Var.b(i6.w(aVar3, fR2), aVar.g()), 1 < avatars.size() ? avatars.get(1) : AvatarWrapper.Companion.getNULL(), new CutAvatarBoxShape(composeShape, androidx.compose.ui.unit.h.r(f12), CollectionsKt.listOf(TuplesKt.to(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(f13)), androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0)))), null), false, jM, null, c0VarR, 24640, 40);
            androidx.compose.ui.graphics.q3 q3Var3 = composeShape;
            AvatarIconKt.m173AvatarIconRd90Nhg(d0Var.b(i6.w(aVar3, fR2), aVar.e()), 2 < avatars.size() ? avatars.get(2) : AvatarWrapper.Companion.getNULL(), q3Var3, false, jM, null, c0VarR, (i13 & 896) | 24640, 40);
            q3Var2 = q3Var3;
            c0VarR.o();
            c0VarR.A();
            f11 = f14;
            a0Var2 = a0Var4;
        } else {
            androidx.compose.ui.a0 a0Var5 = a0Var3;
            q3Var2 = composeShape;
            float f15 = fR;
            c0VarR.E(645459394);
            AvatarWrapper avatarWrapper2 = avatars.size() > 0 ? avatars.get(0) : AvatarWrapper.Companion.getNULL();
            f11 = f15;
            a0Var2 = a0Var5;
            androidx.compose.ui.a0 a0VarW2 = i6.w(a0Var2, f11);
            AvatarShape shape = avatarWrapper2.getAvatar().getShape();
            Intrinsics.checkNotNullExpressionValue(shape, "getShape(...)");
            AvatarIconKt.m173AvatarIconRd90Nhg(a0VarW2, avatarWrapper2, AvatarIconKt.getComposeShape(shape), false, 0L, null, c0VarR, 64, 56);
            c0VarR.A();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.graphics.q3 q3Var4 = q3Var2;
            final androidx.compose.ui.a0 a0Var6 = a0Var2;
            final float f16 = f11;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarTriangleGroupKt.AvatarTriangleGroup__jt2gSs$lambda$5(avatars, a0Var6, q3Var4, f16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarTriangleGroup__jt2gSs$lambda$5(List avatars, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        m102AvatarTriangleGroupjt2gSs(avatars, a0Var, q3Var, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.o
    @IntercomPreviews
    @d1.c(locale = "ar", name = "RTL")
    private static final void DoubleAvatarsPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2121947035);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 5 >> 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m107getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarTriangleGroupKt.DoubleAvatarsPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DoubleAvatarsPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DoubleAvatarsPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SingleAvatarPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-932654159);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m106getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarTriangleGroupKt.SingleAvatarPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleAvatarPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SingleAvatarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.o
    @IntercomPreviews
    @d1.c(locale = "ar", name = "RTL")
    private static final void TripleAvatarsPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-724464974);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m108getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarTriangleGroupKt.TripleAvatarsPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TripleAvatarsPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TripleAvatarsPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
