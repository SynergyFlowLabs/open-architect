package io.intercom.android.sdk.helpcenter.articles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.compose.foundation.b5;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.t7;
import androidx.compose.foundation.layout.v6;
import androidx.compose.foundation.q4;
import androidx.compose.material3.pt;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l3;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.core.view.k2;
import androidx.core.view.v3;
import androidx.media3.exoplayer.a5;
import com.facebook.internal.z0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomTopBarIcon;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class IntercomArticleActivity extends IntercomHelpCenterBaseActivity {

    @NotNull
    private static final String ARTICLE_ID = "ARTICLE_ID";

    @NotNull
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";

    @NotNull
    private static final String METRIC_PLACE = "METRIC_PLACE";

    @NotNull
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";

    @NotNull
    private final f0 arguments$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomArticleActivity.arguments_delegate$lambda$0(this.f291564a);
        }
    });

    @NotNull
    private final l3 scrollBy = e6.b(0);

    @NotNull
    private final f0 viewModel$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomArticleActivity.viewModel_delegate$lambda$2(this.f291565a);
        }
    });

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @w0(parameters = 1)
    public static final class ArticleActivityArguments {
        public static final int $stable = 0;

        @NotNull
        private final String articleId;
        private final boolean isFromSearchBrowse;

        @NotNull
        private final String metricPlace;
        private final boolean shouldHideReactions;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public ArticleActivityArguments(@NotNull String articleId, @NotNull String metricPlace) {
            this(articleId, metricPlace, false, false, 12, null);
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        }

        public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = articleActivityArguments.articleId;
            }
            if ((i10 & 2) != 0) {
                str2 = articleActivityArguments.metricPlace;
            }
            if ((i10 & 4) != 0) {
                z10 = articleActivityArguments.isFromSearchBrowse;
            }
            if ((i10 & 8) != 0) {
                z11 = articleActivityArguments.shouldHideReactions;
            }
            return articleActivityArguments.copy(str, str2, z10, z11);
        }

        @NotNull
        public final String component1() {
            return this.articleId;
        }

        @NotNull
        public final String component2() {
            return this.metricPlace;
        }

        public final boolean component3() {
            return this.isFromSearchBrowse;
        }

        public final boolean component4() {
            return this.shouldHideReactions;
        }

        @NotNull
        public final ArticleActivityArguments copy(@NotNull String articleId, @NotNull String metricPlace, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            return new ArticleActivityArguments(articleId, metricPlace, z10, z11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleActivityArguments)) {
                return false;
            }
            ArticleActivityArguments articleActivityArguments = (ArticleActivityArguments) obj;
            return Intrinsics.areEqual(this.articleId, articleActivityArguments.articleId) && Intrinsics.areEqual(this.metricPlace, articleActivityArguments.metricPlace) && this.isFromSearchBrowse == articleActivityArguments.isFromSearchBrowse && this.shouldHideReactions == articleActivityArguments.shouldHideReactions;
        }

        @NotNull
        public final String getArticleId() {
            return this.articleId;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final boolean getShouldHideReactions() {
            return this.shouldHideReactions;
        }

        public int hashCode() {
            return (((((this.articleId.hashCode() * 31) + this.metricPlace.hashCode()) * 31) + Boolean.hashCode(this.isFromSearchBrowse)) * 31) + Boolean.hashCode(this.shouldHideReactions);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            return "ArticleActivityArguments(articleId=" + this.articleId + ", metricPlace=" + this.metricPlace + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", shouldHideReactions=" + this.shouldHideReactions + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public ArticleActivityArguments(@NotNull String articleId, @NotNull String metricPlace, boolean z10) {
            this(articleId, metricPlace, z10, false, 8, null);
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        }

        @oj.j
        public ArticleActivityArguments(@NotNull String articleId, @NotNull String metricPlace, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            this.articleId = articleId;
            this.metricPlace = metricPlace;
            this.isFromSearchBrowse = z10;
            this.shouldHideReactions = z11;
        }

        public /* synthetic */ ArticleActivityArguments(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final Intent buildIntent(@NotNull Context context, @NotNull ArticleActivityArguments articleActivityArguments) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(articleActivityArguments, "articleActivityArguments");
            Intent intent = new Intent(context, (Class<?>) IntercomArticleActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
            intent.putExtra(IntercomArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
            intent.putExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
            intent.putExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
            return intent;
        }

        @e.a({"WrongConstant"})
        @NotNull
        public final ArticleActivityArguments getArguments(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra(IntercomArticleActivity.ARTICLE_ID);
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = intent.getStringExtra(IntercomArticleActivity.METRIC_PLACE);
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            return new ArticleActivityArguments(stringExtra, str, intent.getBooleanExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleActivityArguments arguments_delegate$lambda$0(IntercomArticleActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Companion companion = Companion;
        Intent intent = this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    @oj.n
    @NotNull
    public static final Intent buildIntent(@NotNull Context context, @NotNull ArticleActivityArguments articleActivityArguments) {
        return Companion.buildIntent(context, articleActivityArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleActivityArguments getArguments() {
        return (ArticleActivityArguments) this.arguments$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCookies() {
        Injector injector = Injector.get();
        String str = "intercom-session-" + injector.getAppIdentity().appId();
        String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
        Intrinsics.checkNotNullExpressionValue(encryptedUserId, "getEncryptedUserId(...)");
        CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewModel viewModel_delegate$lambda$2(final IntercomArticleActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z10 = (this$0.getResources().getConfiguration().uiMode & 48) == 32;
        ArticleViewModel.Companion companion = ArticleViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        Intrinsics.checkNotNullExpressionValue(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(this$0, helpCenterApi, Injector.get().getAppConfigProvider().get().getHelpCenterUrl(), this$0.getArguments().getMetricPlace(), this$0.getArguments().isFromSearchBrowse(), this$0.getArguments().getShouldHideReactions(), new Function1() { // from class: io.intercom.android.sdk.helpcenter.articles.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntercomArticleActivity.viewModel_delegate$lambda$2$lambda$1(this.f291566a, ((Integer) obj).intValue());
            }
        }, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity this$0, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scrollBy.j(i10);
        return Unit.f312394a;
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    @e.a({"SetJavaScriptEnabled"})
    protected void onCreate(@Nullable Bundle bundle) {
        androidx.activity.u.d(this, null, null, 3, null);
        super.onCreate(bundle);
        androidx.activity.compose.f.b(this, null, androidx.compose.runtime.internal.w.c(1674700077, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                } else {
                    final IntercomArticleActivity intercomArticleActivity = IntercomArticleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(-199442729, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1.1

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1", f = "IntercomArticleActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class C20031 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
                            int label;
                            final /* synthetic */ IntercomArticleActivity this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C20031(IntercomArticleActivity intercomArticleActivity, kotlin.coroutines.d<? super C20031> dVar) {
                                super(2, dVar);
                                this.this$0 = intercomArticleActivity;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                                return new C20031(this.this$0, dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                kotlin.coroutines.intrinsics.b.l();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj);
                                this.this$0.getViewModel().fragmentLoaded(this.this$0.getArguments().getArticleId());
                                return Unit.f312394a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                                return ((C20031) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                            }
                        }

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<c0, Integer, Unit> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            AnonymousClass2(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$0(IntercomArticleActivity this$0) {
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.finish();
                                return Unit.f312394a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                                invoke(c0Var, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(c0 c0Var, int i10) {
                                if ((i10 & 11) == 2 && c0Var.d()) {
                                    c0Var.u();
                                    return;
                                }
                                int i11 = R.drawable.intercom_ic_close;
                                final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                IntercomTopBarIcon intercomTopBarIcon = new IntercomTopBarIcon(i11, null, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.m
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass2.invoke$lambda$0(intercomArticleActivity);
                                    }
                                });
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i12 = IntercomTheme.$stable;
                                IntercomTopBarKt.m608IntercomTopBarbogVsAg(null, null, intercomTopBarIcon, null, intercomTheme.getColors(c0Var, i12).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var, i12).m714getPrimaryText0d7_KjU(), null, null, c0Var, IntercomTopBarIcon.$stable << 6, 203);
                            }
                        }

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3, reason: invalid class name */
                        @SourceDebugExtension({"SMAP\nIntercomArticleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomArticleActivity.kt\nio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$onCreate$1$1$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,273:1\n87#2:274\n84#2,9:275\n94#2:314\n80#3,6:284\n87#3,3:299\n90#3,2:308\n94#3:313\n391#4,9:290\n400#4,3:310\n4360#5,6:302\n*S KotlinDebug\n*F\n+ 1 IntercomArticleActivity.kt\nio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$onCreate$1$1$3\n*L\n111#1:274\n111#1:275,9\n111#1:314\n111#1:284,6\n111#1:299,3\n111#1:308,2\n111#1:313\n111#1:290,9\n111#1:310,3\n111#1:302,6\n*E\n"})
                        static final class AnonymousClass3 implements pj.n<g5, c0, Integer, Unit> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            AnonymousClass3(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final WebView invoke$lambda$7$lambda$2(String articleUrl, IntercomArticleActivity this$0, Map headers, Context it) {
                                Intrinsics.checkNotNullParameter(articleUrl, "$articleUrl");
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(headers, "$headers");
                                Intrinsics.checkNotNullParameter(it, "it");
                                WebView webView = new WebView(it);
                                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                ArticleWebViewClient articleWebViewClient = new ArticleWebViewClient(articleUrl, new IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(this$0, webView), Injector.get().getAppConfigProvider().get().getHelpCenterUrls());
                                webView.getSettings().setJavaScriptEnabled(true);
                                webView.setWebViewClient(articleWebViewClient);
                                this$0.setCookies();
                                webView.loadUrl(articleUrl, headers);
                                return webView;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$3(WebView it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return Unit.f312394a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$4(IntercomArticleActivity this$0) {
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getViewModel().sadReactionTapped();
                                return Unit.f312394a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$5(IntercomArticleActivity this$0) {
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getViewModel().neutralReactionTapped();
                                return Unit.f312394a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6(IntercomArticleActivity this$0) {
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getViewModel().happyReactionTapped();
                                return Unit.f312394a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$8(IntercomArticleActivity this$0) {
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getViewModel().fragmentLoaded(this$0.getArguments().getArticleId());
                                return Unit.f312394a;
                            }

                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var, Integer num) {
                                invoke(g5Var, c0Var, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(g5 paddingValues, c0 c0Var, int i10) {
                                int i11;
                                ErrorState withoutCTA;
                                c0 c0Var2 = c0Var;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (c0Var2.D(paddingValues) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) == 18 && c0Var2.d()) {
                                    c0Var2.u();
                                    return;
                                }
                                ArticleViewState articleViewState = (ArticleViewState) w6.b(this.this$0.getViewModel().getState(), null, c0Var2, 8, 1).getValue();
                                if (articleViewState instanceof ArticleViewState.Initial) {
                                    c0Var2.E(2087911002);
                                    LoadingScreenKt.LoadingScreen(d5.p(androidx.compose.ui.a0.E, paddingValues), io.intercom.android.sdk.R.drawable.intercom_article_webview_loading_state, c0Var2, 0, 0);
                                    c0Var2.A();
                                    return;
                                }
                                if (!(articleViewState instanceof ArticleViewState.Content)) {
                                    if (!(articleViewState instanceof ArticleViewState.Error)) {
                                        c0Var2.E(344449645);
                                        c0Var2.A();
                                        throw new k0();
                                    }
                                    c0Var2.E(2093971533);
                                    ArticleViewState.Error error = (ArticleViewState.Error) articleViewState;
                                    boolean z10 = error.getRetryButtonVisibility() == 0;
                                    androidx.compose.ui.a0 a0VarP = d5.p(androidx.compose.ui.a0.E, paddingValues);
                                    if (z10) {
                                        int message = error.getMessage();
                                        final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                        withoutCTA = new ErrorState.WithCTA(0, message, null, 0, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.s
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass3.invoke$lambda$8(intercomArticleActivity);
                                            }
                                        }, 13, null);
                                    } else {
                                        withoutCTA = new ErrorState.WithoutCTA(0, error.getMessage(), null, 5, null);
                                    }
                                    IntercomErrorScreenKt.IntercomErrorScreen(withoutCTA, a0VarP, c0Var2, 0, 0);
                                    c0Var2.A();
                                    return;
                                }
                                c0Var2.E(2088410288);
                                b5 b5VarF = q4.f(0, c0Var2, 0, 1);
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(i6.f(q4.m(d5.p(aVar, paddingValues), b5VarF, false, null, false, 14, null), 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null);
                                final IntercomArticleActivity intercomArticleActivity2 = this.this$0;
                                a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                                b1 b1VarK = c0Var2.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarD);
                                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                if (c0Var2.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var2.q();
                                if (c0Var2.P()) {
                                    c0Var2.q0(function0A);
                                } else {
                                    c0Var2.l();
                                }
                                c0 c0VarD = y7.d(c0Var2);
                                y7.n(c0VarD, a1VarB, aVar2.e());
                                y7.n(c0VarD, b1VarK, aVar2.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar2.f());
                                n0 n0Var = n0.f16227a;
                                ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
                                final String articleUrl = content.getArticleUrl();
                                final Map mapMapOf = MapsKt.mapOf(TuplesKt.to("MobileClientDisplayType", "AndroidIntercomHeaderless"), TuplesKt.to("MobileClient", "AndroidIntercomWebView"), TuplesKt.to("MobileClientReactionsHidden", z0.P));
                                androidx.compose.ui.viewinterop.e.a(new Function1() { // from class: io.intercom.android.sdk.helpcenter.articles.n
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass3.invoke$lambda$7$lambda$2(articleUrl, intercomArticleActivity2, mapMapOf, (Context) obj);
                                    }
                                }, null, new Function1() { // from class: io.intercom.android.sdk.helpcenter.articles.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass3.invoke$lambda$7$lambda$3((WebView) obj);
                                    }
                                }, c0Var2, a5.S0, 2);
                                ArticleViewState.ReactionState reactionState = content.getReactionState();
                                boolean z11 = reactionState.getReactionComponentVisibility() == 0;
                                c0Var2.E(-286419031);
                                if (z11) {
                                    ReactionsComponentKt.ReactionsComponent(i6.h(aVar, 0.0f, 1, null), reactionState, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass3.invoke$lambda$7$lambda$4(intercomArticleActivity2);
                                        }
                                    }, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass3.invoke$lambda$7$lambda$5(intercomArticleActivity2);
                                        }
                                    }, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.r
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C20021.AnonymousClass3.invoke$lambda$7$lambda$6(intercomArticleActivity2);
                                        }
                                    }, c0Var, 6, 0);
                                    if (content.getReactionState().getTeamHelpVisibility() == 0) {
                                        c0Var2 = c0Var;
                                        TeamPresenceComponentKt.TeamPresenceComponent(content.getTeamPresenceState(), false, null, c0Var2, 0, 6);
                                    } else {
                                        c0Var2 = c0Var;
                                    }
                                }
                                c0Var2.A();
                                c0Var2.o();
                                c0Var2.A();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(c0 c0Var2, int i11) {
                            if ((i11 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            v3 v3VarA = k2.a(intercomArticleActivity.getWindow(), intercomArticleActivity.getWindow().getDecorView());
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            v3VarA.i(ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0Var2, i12).m690getBackground0d7_KjU()));
                            b2.i(Unit.f312394a, new C20031(intercomArticleActivity, null), c0Var2, 70);
                            pt.f(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, intercomTheme.getColors(c0Var2, i12).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0Var2, 8)), androidx.compose.runtime.internal.w.e(547021723, true, new AnonymousClass2(intercomArticleActivity), c0Var2, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(-494666138, true, new AnonymousClass3(intercomArticleActivity), c0Var2, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                        }
                    }, c0Var, 54), c0Var, 3072, 7);
                }
            }
        }), 1, null);
    }
}
