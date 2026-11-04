package io.intercom.android.sdk.m5.components.avatar;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$AvatarIconKt {

    @NotNull
    public static final ComposableSingletons$AvatarIconKt INSTANCE = new ComposableSingletons$AvatarIconKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f75lambda1 = w.c(478319767, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.foundation.layout.q.f fVarU = androidx.compose.foundation.layout.q.f16330a.u();
            a0.a aVar = a0.E;
            a1 a1VarE = u5.e(fVarU, androidx.compose.ui.e.f37317a.w(), c0Var, 6);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            float f10 = 36;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), avatarWrapper, null, false, 0L, null, c0Var, 70, 60);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var, 6);
            Avatar avatarCreate2 = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), new AvatarWrapper(avatarCreate2, false, 2, null), null, false, 0L, null, c0Var, 70, 60);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f76lambda2 = w.c(1133377969, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.foundation.layout.q.f fVarU = androidx.compose.foundation.layout.q.f16330a.u();
            a0.a aVar = a0.E;
            a1 a1VarE = u5.e(fVarU, androidx.compose.ui.e.f37317a.w(), c0Var, 6);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            float f10 = 36;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), avatarWrapper, null, true, 0L, null, c0Var, 3142, 52);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var, 6);
            Avatar avatarCreate2 = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), new AvatarWrapper(avatarCreate2, false, 2, null), null, true, 0L, null, c0Var, 3142, 52);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f77lambda3 = w.c(-613127653, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.foundation.layout.q.f fVarU = androidx.compose.foundation.layout.q.f16330a.u();
            a0.a aVar = a0.E;
            a1 a1VarE = u5.e(fVarU, androidx.compose.ui.e.f37317a.w(), c0Var, 6);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            float f10 = 36;
            a0 a0VarW = i6.w(aVar, androidx.compose.ui.unit.h.r(f10));
            AvatarShape avatarShape = AvatarShape.SQUIRCLE;
            AvatarIconKt.m173AvatarIconRd90Nhg(a0VarW, avatarWrapper, AvatarIconKt.getComposeShape(avatarShape), false, 0L, null, c0Var, 70, 56);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var, 6);
            Avatar avatarCreate2 = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), new AvatarWrapper(avatarCreate2, false, 2, null), AvatarIconKt.getComposeShape(avatarShape), false, 0L, null, c0Var, 70, 56);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f78lambda4 = w.c(1717030665, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.foundation.layout.q.f fVarU = androidx.compose.foundation.layout.q.f16330a.u();
            a0.a aVar = a0.E;
            a1 a1VarE = u5.e(fVarU, androidx.compose.ui.e.f37317a.w(), c0Var, 6);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            float f10 = 36;
            float f11 = 4;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), avatarWrapper, new OverlappedAvatarShape(androidx.compose.foundation.shape.o.k(), null, androidx.compose.ui.unit.h.r(f11), 2, null), false, 0L, null, c0Var, 70, 56);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var, 6);
            Avatar avatarCreate2 = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), new AvatarWrapper(avatarCreate2, false, 2, null), new OverlappedAvatarShape(androidx.compose.foundation.shape.o.k(), null, androidx.compose.ui.unit.h.r(f11), 2, null), false, 0L, null, c0Var, 70, 56);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f79lambda5 = w.c(1497731705, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.foundation.layout.q.f fVarU = androidx.compose.foundation.layout.q.f16330a.u();
            a0.a aVar = a0.E;
            a1 a1VarE = u5.e(fVarU, androidx.compose.ui.e.f37317a.w(), c0Var, 6);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            float f10 = 36;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), new AvatarWrapper(avatarCreate, true), null, false, 0L, null, c0Var, 70, 60);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(16)), c0Var, 6);
            Avatar avatarCreate2 = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), new AvatarWrapper(avatarCreate2, true), null, false, 0L, null, c0Var, 70, 60);
            c0Var.o();
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m176getLambda1$intercom_sdk_base_release() {
        return f75lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m177getLambda2$intercom_sdk_base_release() {
        return f76lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m178getLambda3$intercom_sdk_base_release() {
        return f77lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m179getLambda4$intercom_sdk_base_release() {
        return f78lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m180getLambda5$intercom_sdk_base_release() {
        return f79lambda5;
    }
}
