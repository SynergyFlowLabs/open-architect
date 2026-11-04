package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.foundation.v;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.y0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomArticleSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomArticleSearchScreen.kt\nio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,129:1\n75#2:130\n1574#3:131\n1394#3,6:132\n*S KotlinDebug\n*F\n+ 1 IntercomArticleSearchScreen.kt\nio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchScreenKt\n*L\n43#1:130\n120#1:131\n123#1:132,6\n*E\n"})
public final class IntercomArticleSearchScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nIntercomArticleSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomArticleSearchScreen.kt\nio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,129:1\n1282#2,6:130\n87#3:136\n83#3,10:137\n94#3:180\n80#4,6:147\n87#4,3:162\n90#4,2:171\n94#4:179\n391#5,9:153\n400#5:173\n401#5,2:177\n4360#6,6:165\n113#7:174\n113#7:175\n113#7:176\n*S KotlinDebug\n*F\n+ 1 IntercomArticleSearchScreen.kt\nio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1\n*L\n52#1:130,6\n88#1:136\n88#1:137,10\n88#1:180\n88#1:147,6\n88#1:162,3\n88#1:171,2\n88#1:179\n88#1:153,9\n88#1:173\n88#1:177,2\n88#1:165,6\n98#1:174\n99#1:175\n100#1:176\n*E\n"})
    static final class AnonymousClass1 implements Function2<c0, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<String, Unit> $onArticleClicked;
        final /* synthetic */ Function0<Unit> $onClearSearchClick;
        final /* synthetic */ ArticleSearchState $state;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ArticleSearchState articleSearchState, Function1<? super String, Unit> function1, Function0<Unit> function0, Context context) {
            this.$state = articleSearchState;
            this.$onArticleClicked = function1;
            this.$onClearSearchClick = function0;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(final ArticleSearchState state, final Function1 onArticleClicked, w0 LazyColumn) {
            Intrinsics.checkNotNullParameter(state, "$state");
            Intrinsics.checkNotNullParameter(onArticleClicked, "$onArticleClicked");
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            w0.g(LazyColumn, ((ArticleSearchState.Content) state).getSearchResults().size(), null, null, w.c(1308683973, true, new pj.o<androidx.compose.foundation.lazy.i, Integer, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1
                @Override // pj.o
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, c0 c0Var, Integer num2) {
                    invoke(iVar, num.intValue(), c0Var, num2.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.lazy.i items, int i10, c0 c0Var, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                        i12 = (c0Var.K(i10) ? 32 : 16) | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 721) == 144 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    ArticleSearchResultRow articleSearchResultRow = ((ArticleSearchState.Content) state).getSearchResults().get(i10);
                    if (articleSearchResultRow instanceof ArticleSearchResultRow.ArticleResultRow) {
                        c0Var.E(-1577698623);
                        int i13 = 7 & 4;
                        ArticleResultRowComponentKt.ArticleResultRowComponent((ArticleSearchResultRow.ArticleResultRow) articleSearchResultRow, onArticleClicked, null, c0Var, 0, 4);
                        c0Var.A();
                        return;
                    }
                    if (!(articleSearchResultRow instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                        c0Var.E(-1577703168);
                        c0Var.A();
                        throw new k0();
                    }
                    c0Var.E(-1577693088);
                    TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchResultRow.TeammateHelpRow) articleSearchResultRow).getTeamPresenceState(), false, null, c0Var, 0, 6);
                    c0Var.A();
                }
            }), 6, null);
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
            String searchTerm;
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            ArticleSearchState articleSearchState = this.$state;
            if (articleSearchState instanceof ArticleSearchState.Content) {
                c0Var.E(484447755);
                a0 a0VarD = v.d(a0.E, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null);
                c0Var.E(154178788);
                boolean zD = c0Var.D(this.$state) | c0Var.D(this.$onArticleClicked);
                final ArticleSearchState articleSearchState2 = this.$state;
                final Function1<String, Unit> function1 = this.$onArticleClicked;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0(articleSearchState2, function1, (w0) obj);
                        }
                    };
                    c0Var.Y(objI0);
                }
                c0Var.A();
                androidx.compose.foundation.lazy.h.h(a0VarD, null, null, false, null, null, null, false, null, (Function1) objI0, c0Var, 0, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                c0Var.A();
                return;
            }
            if (Intrinsics.areEqual(articleSearchState, ArticleSearchState.Error.INSTANCE)) {
                c0Var.E(485142124);
                HelpCenterErrorScreenKt.HelpCenterErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), i6.f(a0.E, 0.0f, 1, null), c0Var, 48, 0);
                c0Var.A();
                return;
            }
            if (Intrinsics.areEqual(articleSearchState, ArticleSearchState.Initial.INSTANCE)) {
                c0Var.E(485341516);
                c0Var.A();
                this.$onClearSearchClick.invoke();
                return;
            }
            if (Intrinsics.areEqual(articleSearchState, ArticleSearchState.Loading.INSTANCE)) {
                c0Var.E(485420287);
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(i6.f(a0.E, 0.0f, 1, null), c0Var, 6, 0);
                c0Var.A();
                return;
            }
            if (!(articleSearchState instanceof ArticleSearchState.NoResults) && !(articleSearchState instanceof ArticleSearchState.NoResultsNoTeamHelp)) {
                c0Var.E(154175038);
                c0Var.A();
                throw new k0();
            }
            c0Var.E(485632916);
            ArticleSearchState articleSearchState3 = this.$state;
            if (articleSearchState3 instanceof ArticleSearchState.NoResults) {
                searchTerm = ((ArticleSearchState.NoResults) articleSearchState3).getSearchTerm();
            } else {
                searchTerm = articleSearchState3 instanceof ArticleSearchState.NoResultsNoTeamHelp ? ((ArticleSearchState.NoResultsNoTeamHelp) articleSearchState3).getSearchTerm() : "";
            }
            Context context = this.$context;
            ArticleSearchState articleSearchState4 = this.$state;
            a0.a aVar = a0.E;
            a1 a1VarB = j0.b(q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            androidx.compose.ui.text.f noResultsMessage = IntercomArticleSearchScreenKt.getNoResultsMessage(context, searchTerm);
            float f10 = 20;
            q50.u(noResultsMessage, d5.v(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(32), androidx.compose.ui.unit.h.r(f10), 0.0f, 8, null), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(16), null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, null, null, c0Var, 24576, 0, 523240);
            c0Var.E(145075595);
            if (articleSearchState4 instanceof ArticleSearchState.NoResults) {
                TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchState.NoResults) articleSearchState4).getTeamPresenceState(), false, null, c0Var, 0, 6);
            }
            c0Var.A();
            c0Var.o();
            c0Var.A();
        }
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomArticleSearchScreen(@NotNull final ArticleSearchState state, @NotNull final Function0<Unit> onClearSearchClick, @NotNull final Function1<? super String, Unit> onArticleClicked, @Nullable c0 c0Var, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClearSearchClick, "onClearSearchClick");
        Intrinsics.checkNotNullParameter(onArticleClicked, "onArticleClicked");
        c0 c0VarR = c0Var.R(-1211464960);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(onClearSearchClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(onArticleClicked) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            u10.c(null, null, intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU(), intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), 0.0f, 0.0f, null, w.e(1420291739, true, new AnonymousClass1(state, onArticleClicked, onClearSearchClick, context), c0VarR, 54), c0VarR, 12582912, 115);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.search.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomArticleSearchScreenKt.IntercomArticleSearchScreen$lambda$0(state, onClearSearchClick, onArticleClicked, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomArticleSearchScreen$lambda$0(ArticleSearchState state, Function0 onClearSearchClick, Function1 onArticleClicked, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onClearSearchClick, "$onClearSearchClick");
        Intrinsics.checkNotNullParameter(onArticleClicked, "$onArticleClicked");
        IntercomArticleSearchScreen(state, onClearSearchClick, onArticleClicked, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.f getNoResultsMessage(Context context, String str) {
        String str2 = '\'' + str + '\'';
        String string = context.getString(R.string.intercom_no_results_for_searchterm);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strK2 = StringsKt.k2(string, "{searchTerm}", str2, false, 4, null);
        androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
        int iR3 = StringsKt.r3(strK2, str2, 0, false, 6, null);
        String strSubstring = strK2.substring(0, iR3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        bVar.p(strSubstring);
        int iZ = bVar.z(new c3(0L, 0L, v0.f41742b.c(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65531, (DefaultConstructorMarker) null));
        try {
            String strSubstring2 = strK2.substring(iR3, str2.length() + iR3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            bVar.p(strSubstring2);
            Unit unit = Unit.f312394a;
            bVar.u(iZ);
            String strSubstring3 = strK2.substring(iR3 + str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            bVar.p(strSubstring3);
            return bVar.C();
        } catch (Throwable th2) {
            bVar.u(iZ);
            throw th2;
        }
    }
}
