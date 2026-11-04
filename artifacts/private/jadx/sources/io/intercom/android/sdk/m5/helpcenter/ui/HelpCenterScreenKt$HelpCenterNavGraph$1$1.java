package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.navigation.a3;
import androidx.navigation.n0;
import androidx.navigation.r2;
import androidx.navigation.w0;
import androidx.navigation.x3;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
final class HelpCenterScreenKt$HelpCenterNavGraph$1$1 implements pj.o<androidx.compose.animation.g, n0, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ r2 $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterNavGraph$1$1(HelpCenterViewModel helpCenterViewModel, List<String> list, r2 r2Var) {
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
        this.$navController = r2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(r2 navController, String collectionId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        w0.y0(navController, "COLLECTION_DETAILS/" + collectionId, null, null, 6, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(r2 navController, String collectionId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        navController.w0("COLLECTION_DETAILS/" + collectionId + "?startDestination=true", new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3$lambda$2((a3) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(a3 navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.p("COLLECTIONS", new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3$lambda$2$lambda$1((x3) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(x3 popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.c(true);
        return Unit.f312394a;
    }

    @Override // pj.o
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(gVar, n0Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.animation.g composable, n0 it, androidx.compose.runtime.c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        List<String> list = this.$collectionIds;
        final r2 r2Var = this.$navController;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$0(r2Var, (String) obj);
            }
        };
        final r2 r2Var2 = this.$navController;
        HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(helpCenterViewModel, list, function1, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3(r2Var2, (String) obj);
            }
        }, c0Var, 72);
    }
}
