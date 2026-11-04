package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.u;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.v;
import androidx.compose.material3.pt;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.core.view.k2;
import androidx.core.view.v3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class IntercomArticleSearchActivity extends IntercomHelpCenterBaseActivity {

    @NotNull
    private static final String IS_FROM_SEARCH_BROWSE = "IS_SEARCH_BROWSE";

    @Nullable
    private IntercomActivityArticleSearchBinding _binding;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final f0 viewModel$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomArticleSearchActivity.viewModel_delegate$lambda$0(this.f291603a);
        }
    });

    @NotNull
    private final f0 args$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomArticleSearchActivity.args_delegate$lambda$1(this.f291604a);
        }
    });

    @w0(parameters = 1)
    public static final class ArticleSearchArgs {
        public static final int $stable = 0;
        private final boolean isFromSearchBrowse;

        public ArticleSearchArgs() {
            this(false, 1, null);
        }

        public static /* synthetic */ ArticleSearchArgs copy$default(ArticleSearchArgs articleSearchArgs, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = articleSearchArgs.isFromSearchBrowse;
            }
            return articleSearchArgs.copy(z10);
        }

        public final boolean component1() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public final ArticleSearchArgs copy(boolean z10) {
            return new ArticleSearchArgs(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArticleSearchArgs) && this.isFromSearchBrowse == ((ArticleSearchArgs) obj).isFromSearchBrowse;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromSearchBrowse);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            return "ArticleSearchArgs(isFromSearchBrowse=" + this.isFromSearchBrowse + ')';
        }

        public ArticleSearchArgs(boolean z10) {
            this.isFromSearchBrowse = z10;
        }

        public /* synthetic */ ArticleSearchArgs(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final Intent buildIntent(@NotNull Context context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntercomArticleSearchActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, z10);
            return intent;
        }

        @NotNull
        public final ArticleSearchArgs getArguments(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return new ArticleSearchArgs(intent.getBooleanExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<c0, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ Function1<k0<String>, Unit> $onTextChanged;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Unit> function0, Function1<? super k0<String>, Unit> function1) {
            this.$onBackClick = function0;
            this.$onTextChanged = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            int i11 = 1 >> 2;
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar(this.$onBackClick, this.$onTextChanged, new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntercomArticleSearchActivity.AnonymousClass1.invoke$lambda$0((String) obj);
                }
            }, c0Var, a5.S0);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nIntercomArticleSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomArticleSearchActivity.kt\nio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$SearchScreenContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,149:1\n87#2:150\n84#2,9:151\n94#2:190\n80#3,6:160\n87#3,3:175\n90#3,2:184\n94#3:189\n391#4,9:166\n400#4,3:186\n4360#5,6:178\n*S KotlinDebug\n*F\n+ 1 IntercomArticleSearchActivity.kt\nio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$SearchScreenContent$2\n*L\n134#1:150\n134#1:151,9\n134#1:190\n134#1:160,6\n134#1:175,3\n134#1:184,2\n134#1:189\n134#1:166,9\n134#1:186,3\n134#1:178,6\n*E\n"})
    static final class AnonymousClass2 implements pj.n<g5, c0, Integer, Unit> {
        final /* synthetic */ ArticleSearchState $articleSearchState;
        final /* synthetic */ Function1<String, Unit> $onArticleClicked;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ArticleSearchState articleSearchState, Function1<? super String, Unit> function1) {
            this.$articleSearchState = articleSearchState;
            this.$onArticleClicked = function1;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var, Integer num) {
            invoke(g5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(g5 paddingValues, c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i10 & 14) == 0) {
                i10 |= c0Var.D(paddingValues) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            a0 a0VarP = d5.p(v.d(i6.f(a0.E, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), paddingValues);
            ArticleSearchState articleSearchState = this.$articleSearchState;
            Function1<String, Unit> function1 = this.$onArticleClicked;
            a1 a1VarB = j0.b(q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP);
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
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            n0 n0Var = n0.f16227a;
            IntercomArticleSearchScreenKt.IntercomArticleSearchScreen(articleSearchState, new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, function1, c0Var, 48);
            c0Var.o();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void SearchScreenContent(final ArticleSearchState articleSearchState, final Function0<Unit> function0, final Function1<? super k0<String>, Unit> function1, final Function1<? super String, Unit> function2, c0 c0Var, final int i10) {
        int i11;
        c0 c0Var2;
        c0 c0VarR = c0Var.R(865873108);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(articleSearchState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            c0Var2 = c0VarR;
            pt.f(null, w.e(-1018273896, true, new AnonymousClass1(function0, function1), c0VarR, 54), null, null, null, 0, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), 0L, null, w.e(955713763, true, new AnonymousClass2(articleSearchState, function2), c0VarR, 54), c0Var2, 805306416, 445);
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.search.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomArticleSearchActivity.SearchScreenContent$lambda$3(this.f291605a, articleSearchState, function0, function1, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchScreenContent$lambda$3(IntercomArticleSearchActivity tmp0_rcvr, ArticleSearchState articleSearchState, Function0 onBackClick, Function1 onTextChanged, Function1 onArticleClicked, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(tmp0_rcvr, "$tmp0_rcvr");
        Intrinsics.checkNotNullParameter(articleSearchState, "$articleSearchState");
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        Intrinsics.checkNotNullParameter(onArticleClicked, "$onArticleClicked");
        tmp0_rcvr.SearchScreenContent(articleSearchState, onBackClick, onTextChanged, onArticleClicked, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchArgs args_delegate$lambda$1(IntercomArticleSearchActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Companion companion = Companion;
        Intent intent = this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    @oj.n
    @NotNull
    public static final Intent buildIntent(@NotNull Context context, boolean z10) {
        return Companion.buildIntent(context, z10);
    }

    private final ArticleSearchArgs getArgs() {
        return (ArticleSearchArgs) this.args$delegate.getValue();
    }

    private final IntercomActivityArticleSearchBinding getBinding() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this._binding;
        if (intercomActivityArticleSearchBinding != null) {
            return intercomActivityArticleSearchBinding;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleSearchViewModel getViewModel() {
        return (ArticleSearchViewModel) this.viewModel$delegate.getValue();
    }

    private final void setupInsets() {
        u.d(this, null, null, 3, null);
        v3 v3VarA = k2.a(getWindow(), getWindow().getDecorView());
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 == 2) {
                z10 = true;
            } else if (i10 != 3) {
                throw new kotlin.k0();
            }
        }
        v3VarA.i(z10);
    }

    private final void subscribeToStates() {
        int i10 = 3 & 1;
        getBinding().articleSearchComposeView.setContent(w.c(-779899693, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity.subscribeToStates.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1, reason: invalid class name and collision with other inner class name */
            static final class C20051 implements Function2<c0, Integer, Unit> {
                final /* synthetic */ IntercomArticleSearchActivity this$0;

                C20051(IntercomArticleSearchActivity intercomArticleSearchActivity) {
                    this.this$0 = intercomArticleSearchActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$0(IntercomArticleSearchActivity this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.onBackPressed();
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1(IntercomArticleSearchActivity this$0, k0 textFlow) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(textFlow, "textFlow");
                    this$0.getViewModel().searchForArticles(textFlow);
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$2(IntercomArticleSearchActivity this$0, String it) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    this$0.getViewModel().addTeammateHelpRow();
                    this$0.getViewModel().sendClickOnSearchResultMetric();
                    this$0.startActivity(IntercomArticleActivity.Companion.buildIntent(this$0, new IntercomArticleActivity.ArticleActivityArguments(it, "search_results", false, false, 12, null)));
                    return Unit.f312394a;
                }

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
                    n7 n7VarB = w6.b(this.this$0.getViewModel().getState(), null, c0Var, 8, 1);
                    IntercomArticleSearchActivity intercomArticleSearchActivity = this.this$0;
                    ArticleSearchState articleSearchState = (ArticleSearchState) n7VarB.getValue();
                    final IntercomArticleSearchActivity intercomArticleSearchActivity2 = this.this$0;
                    Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomArticleSearchActivity.C27831.C20051.invoke$lambda$0(intercomArticleSearchActivity2);
                        }
                    };
                    final IntercomArticleSearchActivity intercomArticleSearchActivity3 = this.this$0;
                    Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchActivity.C27831.C20051.invoke$lambda$1(intercomArticleSearchActivity3, (k0) obj);
                        }
                    };
                    final IntercomArticleSearchActivity intercomArticleSearchActivity4 = this.this$0;
                    intercomArticleSearchActivity.SearchScreenContent(articleSearchState, function0, function1, new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchActivity.C27831.C20051.invoke$lambda$2(intercomArticleSearchActivity4, (String) obj);
                        }
                    }, c0Var, 32768);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i11) {
                if ((i11 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, w.e(-1191058574, true, new C20051(IntercomArticleSearchActivity.this), c0Var, 54), c0Var, 56);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchViewModel viewModel_delegate$lambda$0(IntercomArticleSearchActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArticleSearchViewModel.Companion companion = ArticleSearchViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        Intrinsics.checkNotNullExpressionValue(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(this$0, helpCenterApi, this$0.getArgs().isFromSearchBrowse());
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.intercom_donothing, R.anim.intercom_fade_out);
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this._binding = IntercomActivityArticleSearchBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getRoot());
        setupInsets();
        subscribeToStates();
        overridePendingTransition(R.anim.intercom_fade_in, R.anim.intercom_donothing);
    }
}
