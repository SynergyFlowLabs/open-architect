package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$AvatarTriangleGroupKt {

    @NotNull
    public static final ComposableSingletons$AvatarTriangleGroupKt INSTANCE = new ComposableSingletons$AvatarTriangleGroupKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f11lambda1 = androidx.compose.runtime.internal.w.c(-1436103865, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-1$1
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
            AvatarTriangleGroupKt.m102AvatarTriangleGroupjt2gSs(CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), null, null, 0.0f, c0Var, 8, 14);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f12lambda2 = androidx.compose.runtime.internal.w.c(-549018737, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-2$1
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
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "RS");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarTriangleGroupKt.m102AvatarTriangleGroupjt2gSs(CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, new AvatarWrapper(avatarCreate2, false, 2, null)}), null, null, 0.0f, c0Var, 8, 14);
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f13lambda3 = androidx.compose.runtime.internal.w.c(848463324, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-3$1
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
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "RS");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            AvatarTriangleGroupKt.m102AvatarTriangleGroupjt2gSs(CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)}), null, null, 0.0f, c0Var, 8, 14);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m106getLambda1$intercom_sdk_base_release() {
        return f11lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m107getLambda2$intercom_sdk_base_release() {
        return f12lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m108getLambda3$intercom_sdk_base_release() {
        return f13lambda3;
    }
}
