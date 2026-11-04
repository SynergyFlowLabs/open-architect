package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.n0;
import androidx.navigation.r2;
import androidx.navigation.w0;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
final class HelpCenterScreenKt$HelpCenterNavGraph$1$4 implements pj.o<androidx.compose.animation.g, n0, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ r2 $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterNavGraph$1$4(HelpCenterViewModel helpCenterViewModel, Context context, r2 r2Var) {
        this.$viewModel = helpCenterViewModel;
        this.$context = context;
        this.$navController = r2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(HelpCenterViewModel viewModel, Context context, String articleId) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        viewModel.onArticleClicked();
        context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, MetricTracker.Place.COLLECTION_LIST, false, false, 8, null)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(r2 navController, String subCollectionId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(subCollectionId, "subCollectionId");
        w0.y0(navController, "COLLECTION_DETAILS/" + subCollectionId, null, null, 6, null);
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
        String string;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleB = it.b();
        if (bundleB == null || (string = bundleB.getString("id")) == null) {
            string = "";
        }
        String str = string;
        final HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        final Context context = this.$context;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$4.invoke$lambda$0(helpCenterViewModel, context, (String) obj);
            }
        };
        final r2 r2Var = this.$navController;
        HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen(helpCenterViewModel, str, function1, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$4.invoke$lambda$1(r2Var, (String) obj);
            }
        }, c0Var, 8, 0);
    }
}
