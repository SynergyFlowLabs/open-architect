package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.s2;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCircularAvatarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularAvatarComponent.kt\nio/intercom/android/sdk/survey/ui/components/CircularAvatarComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 ImagePainter.kt\ncoil/compose/ImagePainterKt\n*L\n1#1,108:1\n113#2:109\n70#3:110\n66#3,10:111\n70#3:148\n67#3,9:149\n77#3:194\n70#3:195\n67#3,9:196\n77#3:235\n77#3:244\n80#4,6:121\n87#4,3:136\n90#4,2:145\n80#4,6:158\n87#4,3:173\n90#4,2:182\n94#4:193\n80#4,6:205\n87#4,3:220\n90#4,2:229\n94#4:234\n94#4:243\n391#5,9:127\n400#5:147\n391#5,9:164\n400#5:184\n401#5,2:191\n391#5,9:211\n400#5,3:231\n401#5,2:241\n4360#6,6:139\n4360#6,6:176\n4360#6,6:223\n1282#7,6:185\n75#8:236\n74#8:238\n67#9:237\n68#9:239\n66#9:240\n*S KotlinDebug\n*F\n+ 1 CircularAvatarComponent.kt\nio/intercom/android/sdk/survey/ui/components/CircularAvatarComponentKt\n*L\n35#1:109\n37#1:110\n37#1:111,10\n44#1:148\n44#1:149,9\n44#1:194\n61#1:195\n61#1:196,9\n61#1:235\n37#1:244\n37#1:121,6\n37#1:136,3\n37#1:145,2\n44#1:158,6\n44#1:173,3\n44#1:182,2\n44#1:193\n61#1:205,6\n61#1:220,3\n61#1:229,2\n61#1:234\n37#1:243\n37#1:127,9\n37#1:147\n44#1:164,9\n44#1:184\n44#1:191,2\n61#1:211,9\n61#1:231,3\n37#1:241,2\n37#1:139,6\n44#1:176,6\n61#1:223,6\n54#1:185,6\n82#1:236\n80#1:238\n80#1:237\n80#1:239\n80#1:240\n*E\n"})
public final class CircularAvatarComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: CircularAvatar-aM-cp0Q, reason: not valid java name */
    public static final void m467CircularAvataraMcp0Q(@NotNull final Avatar avatar, final long j10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        char c10;
        String str;
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-276383091);
        float fR = (i11 & 4) != 0 ? androidx.compose.ui.unit.h.r(40) : f10;
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
        y7.n(c0VarD, a1VarK, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        final String strD = u0.i.d(R.string.intercom_surveys_sender_image, c0VarR, 0);
        String initials = avatar.getInitials();
        Intrinsics.checkNotNullExpressionValue(initials, "getInitials(...)");
        if (initials.length() > 0) {
            c0VarR.E(-2071598305);
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(i6.w(aVar, fR), androidx.compose.foundation.shape.o.k()), j10, null, 2, null);
            a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarD);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
            y7.n(c0VarD2, a1VarK2, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            String initials2 = avatar.getInitials();
            Intrinsics.checkNotNullExpressionValue(initials2, "getInitials(...)");
            androidx.compose.ui.a0 a0VarB = d0Var.b(aVar, aVar2.i());
            c0VarR.E(592336280);
            boolean zD = c0VarR.D(strD);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(strD, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            str = strD;
            c10 = 0;
            q50.t(initials2, androidx.compose.ui.semantics.t.f(a0VarB, false, (Function1) objI0, 1, null), ColorExtensionsKt.m729generateTextColor8_81llA(j10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 0, 0, 262136);
            c0VarR = c0VarR;
            c0VarR.o();
            c0VarR.A();
        } else {
            c10 = 0;
            str = strD;
            c0VarR.E(-2071004283);
            androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(i6.w(aVar, fR), androidx.compose.foundation.shape.o.k()), j10, null, 2, null);
            a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarD2);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
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
            y7.n(c0VarD3, a1VarK3, aVar3.e());
            y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar3.f());
            s2.d(u0.e.c(R.drawable.intercom_default_avatar_icon, c0VarR, 0), str, d0Var.b(aVar, aVar2.i()), null, androidx.compose.ui.layout.l.f39405a.a(), 0.0f, androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, ColorExtensionsKt.m729generateTextColor8_81llA(j10), 0, 2, null), c0VarR, 24584, 40);
            c0VarR.o();
            c0VarR.A();
        }
        c0VarR.E(-1313708522);
        String imageUrl = avatar.getImageUrl();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
        if (imageUrl.length() > 0) {
            String imageUrl2 = avatar.getImageUrl();
            coil.j imageLoader = IntercomImageLoaderKt.getImageLoader((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()));
            c0VarR.h0(1750824323);
            coil.request.i.a aVarJ = new coil.request.i.a((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).j(imageUrl2);
            aVarJ.i(true);
            q4.e[] eVarArr = new q4.e[1];
            eVarArr[c10] = new q4.b();
            aVarJ.r0(eVarArr);
            AsyncImagePainter asyncImagePainterC = coil.compose.g.c(aVarJ.f(), imageLoader, null, null, null, 0, null, c0VarR, 72, 124);
            c0VarR.w0();
            s2.d(asyncImagePainterC, str, i6.w(aVar, fR), null, null, 0.0f, null, c0VarR, 0, 120);
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final float f11 = fR;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$6(avatar, j10, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(String contentDescription, androidx.compose.ui.semantics.e0 semantics) {
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.b0.v1(semantics, contentDescription);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularAvatar_aM_cp0Q$lambda$6(Avatar avatar, long j10, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatar, "$avatar");
        m467CircularAvataraMcp0Q(avatar, j10, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewDefaultAvatar(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1706634993);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            Avatar avatarCreate = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            m467CircularAvataraMcp0Q(avatarCreate, androidx.compose.ui.graphics.q0.f38131b.y(), 0.0f, c0VarR, 56, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CircularAvatarComponentKt.PreviewDefaultAvatar$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewDefaultAvatar$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewDefaultAvatar(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewInitialAvatar(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1788709612);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            Avatar avatarCreate = Avatar.create("", "PS");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            m467CircularAvataraMcp0Q(avatarCreate, androidx.compose.ui.graphics.q0.f38131b.c(), 0.0f, c0VarR, 56, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CircularAvatarComponentKt.PreviewInitialAvatar$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewInitialAvatar$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewInitialAvatar(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
