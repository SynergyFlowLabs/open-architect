package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.u10;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$MessageMetadataKt {

    @NotNull
    public static final ComposableSingletons$MessageMetadataKt INSTANCE = new ComposableSingletons$MessageMetadataKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f104lambda1 = androidx.compose.runtime.internal.w.c(1395125050, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-1$1
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
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            MessageMetadataKt.MessageMetadata(CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), "Lisa", null, null, 1726738186L, c0Var, 27704, 4);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f105lambda2 = androidx.compose.runtime.internal.w.c(-563128999, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-2$1
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
            androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m217getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f106lambda3 = androidx.compose.runtime.internal.w.c(-1894671055, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 7 ^ 2;
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PL");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "IS");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            MessageMetadataKt.MessageMetadata(CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)}), "This Lisa Agent has very long and boring name", null, "AI Agent", 1726738186L, c0Var, 27704, 4);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f107lambda4 = androidx.compose.runtime.internal.w.c(764966992, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-4$1
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
            androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m219getLambda3$intercom_sdk_base_release(), c0Var, 12582912, 127);
            c0Var.o();
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m217getLambda1$intercom_sdk_base_release() {
        return f104lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m218getLambda2$intercom_sdk_base_release() {
        return f105lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m219getLambda3$intercom_sdk_base_release() {
        return f106lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m220getLambda4$intercom_sdk_base_release() {
        return f107lambda4;
    }
}
