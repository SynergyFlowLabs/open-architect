package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$FooterNoticeKt {

    @NotNull
    public static final ComposableSingletons$FooterNoticeKt INSTANCE = new ComposableSingletons$FooterNoticeKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f32lambda1 = androidx.compose.runtime.internal.w.c(-316510596, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-1$1
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
            FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "You’ll get replies here and in your email: handover_notice990", CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), c0Var, 4528, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f33lambda2 = androidx.compose.runtime.internal.w.c(1192394372, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-2$1
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
            int i11 = 5 << 0;
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "LD");
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "LY");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "You’ll get replies here and in your email: handover_notice990", CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)}), c0Var, 4528, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f34lambda3 = androidx.compose.runtime.internal.w.c(-1618737880, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-3$1
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
            int i11 = 7 ^ 1;
            FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "", CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), c0Var, 4528, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f35lambda4 = androidx.compose.runtime.internal.w.c(-759832452, false, ComposableSingletons$FooterNoticeKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f36lambda5 = androidx.compose.runtime.internal.w.c(1035678920, false, ComposableSingletons$FooterNoticeKt$lambda5$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m127getLambda1$intercom_sdk_base_release() {
        return f32lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m128getLambda2$intercom_sdk_base_release() {
        return f33lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m129getLambda3$intercom_sdk_base_release() {
        return f34lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m130getLambda4$intercom_sdk_base_release() {
        return f35lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m131getLambda5$intercom_sdk_base_release() {
        return f36lambda5;
    }
}
