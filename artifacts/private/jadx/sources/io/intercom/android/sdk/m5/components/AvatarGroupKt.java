package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAvatarGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarGroup.kt\nio/intercom/android/sdk/m5/components/AvatarGroupKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n113#2:80\n113#2:81\n55#3:82\n68#3:121\n99#4:83\n97#4,8:84\n106#4:126\n80#5,6:92\n87#5,3:107\n90#5,2:116\n94#5:125\n391#6,9:98\n400#6:118\n401#6,2:123\n4360#7,6:110\n1872#8,2:119\n1874#8:122\n*S KotlinDebug\n*F\n+ 1 AvatarGroup.kt\nio/intercom/android/sdk/m5/components/AvatarGroupKt\n*L\n25#1:80\n28#1:81\n30#1:82\n38#1:121\n29#1:83\n29#1:84,8\n29#1:126\n29#1:92,6\n29#1:107,3\n29#1:116,2\n29#1:125\n29#1:98,9\n29#1:118\n29#1:123,2\n29#1:110,6\n33#1:119,2\n33#1:122\n*E\n"})
public final class AvatarGroupKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: AvatarGroup--J8mCjc, reason: not valid java name */
    public static final void m101AvatarGroupJ8mCjc(@NotNull final List<AvatarWrapper> avatars, @Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, final int i11) {
        int i12;
        long jX;
        int i13;
        Object obj;
        androidx.compose.ui.graphics.q3 overlappedAvatarShape;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-258460642);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        float fR = (i11 & 4) != 0 ? androidx.compose.ui.unit.h.r(38) : f10;
        if ((i11 & 8) != 0) {
            i12 = i10;
            i13 = i12 & (-7169);
            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5().x();
        } else {
            i12 = i10;
            jX = j10;
            i13 = i12;
        }
        float f11 = 2;
        float fR2 = androidx.compose.ui.unit.h.r(f11);
        androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(-fR2));
        androidx.compose.ui.a0 a0VarH = i6.H(a0Var2, null, false, 3, null);
        androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarG, androidx.compose.ui.e.f37317a.w(), c0VarR, 6);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
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
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(700807476);
        int i14 = 0;
        for (Object obj2 : avatars) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AvatarWrapper avatarWrapper = (AvatarWrapper) obj2;
            if (i14 == 0) {
                AvatarShape shape = avatarWrapper.getAvatar().getShape();
                Intrinsics.checkNotNullExpressionValue(shape, "getShape(...)");
                overlappedAvatarShape = AvatarIconKt.getComposeShape(shape);
                obj = null;
            } else {
                AvatarShape shape2 = avatars.get(i14 - 1).getAvatar().getShape();
                Intrinsics.checkNotNullExpressionValue(shape2, "getShape(...)");
                androidx.compose.foundation.shape.n composeShape = AvatarIconKt.getComposeShape(shape2);
                float fR3 = androidx.compose.ui.unit.h.r(fR2 * f11);
                AvatarShape shape3 = avatarWrapper.getAvatar().getShape();
                Intrinsics.checkNotNullExpressionValue(shape3, "getShape(...)");
                obj = null;
                overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape3), composeShape, fR3, null);
            }
            long j11 = jX;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(androidx.compose.ui.a0.E, fR), avatarWrapper, overlappedAvatarShape, false, j11, null, c0VarR, (57344 & (i13 << 3)) | 64, 40);
            jX = j11;
            i14 = i15;
            fR2 = fR2;
        }
        final long j12 = jX;
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            final float f12 = fR;
            final int i16 = i12;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(avatars, a0Var3, f12, j12, i16, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void AvatarGroupPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2091006176);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m104getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarGroupKt.AvatarGroupPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarGroupPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AvatarGroupPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void AvatarGroupWithMixedShapesPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1253949399);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m105getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarGroupKt.AvatarGroupWithMixedShapesPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarGroupWithMixedShapesPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AvatarGroupWithMixedShapesPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarGroup__J8mCjc$lambda$2(List avatars, androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        m101AvatarGroupJ8mCjc(avatars, a0Var, f10, j10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
