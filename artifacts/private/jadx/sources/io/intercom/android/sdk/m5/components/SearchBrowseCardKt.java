package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.c4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSearchBrowseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,270:1\n75#2:271\n*S KotlinDebug\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt\n*L\n54#1:271\n*E\n"})
public final class SearchBrowseCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nSearchBrowseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt$SearchBrowseCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n87#2:271\n83#2,10:272\n87#2:394\n83#2,10:395\n94#2:485\n94#2:490\n80#3,6:282\n87#3,3:297\n90#3,2:306\n80#3,6:323\n87#3,3:338\n90#3,2:347\n80#3,6:358\n87#3,3:373\n90#3,2:382\n94#3:388\n94#3:392\n80#3,6:405\n87#3,3:420\n90#3,2:429\n80#3,6:448\n87#3,3:463\n90#3,2:472\n94#3:478\n94#3:484\n94#3:489\n391#4,9:288\n400#4:308\n391#4,9:329\n400#4:349\n391#4,9:364\n400#4:384\n401#4,2:386\n401#4,2:390\n391#4,9:411\n400#4:431\n391#4,9:454\n400#4:474\n401#4,2:476\n401#4,2:482\n401#4,2:487\n4360#5,6:300\n4360#5,6:341\n4360#5,6:376\n4360#5,6:423\n4360#5,6:466\n113#6:309\n113#6:310\n113#6:311\n113#6:312\n113#6:350\n113#6:351\n113#6:385\n113#6:434\n113#6:435\n113#6:436\n113#6:437\n113#6:475\n113#6:480\n113#6:486\n70#7:313\n67#7,9:314\n77#7:393\n99#8,6:352\n106#8:389\n99#8:438\n96#8,9:439\n106#8:479\n1872#9,2:432\n1874#9:481\n*S KotlinDebug\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt$SearchBrowseCard$1\n*L\n60#1:271\n60#1:272,10\n113#1:394\n113#1:395,10\n113#1:485\n60#1:490\n60#1:282,6\n60#1:297,3\n60#1:306,2\n61#1:323,6\n61#1:338,3\n61#1:347,2\n86#1:358,6\n86#1:373,3\n86#1:382,2\n86#1:388\n61#1:392\n113#1:405,6\n113#1:420,3\n113#1:429,2\n126#1:448,6\n126#1:463,3\n126#1:472,2\n126#1:478\n113#1:484\n60#1:489\n60#1:288,9\n60#1:308\n61#1:329,9\n61#1:349\n86#1:364,9\n86#1:384\n86#1:386,2\n61#1:390,2\n113#1:411,9\n113#1:431\n126#1:454,9\n126#1:474\n126#1:476,2\n113#1:482,2\n60#1:487,2\n60#1:300,6\n61#1:341,6\n86#1:376,6\n113#1:423,6\n126#1:466,6\n64#1:309\n65#1:310\n66#1:311\n67#1:312\n90#1:350\n91#1:351\n103#1:385\n124#1:434\n143#1:435\n144#1:436\n145#1:437\n157#1:475\n159#1:480\n166#1:486\n61#1:313\n61#1:314,9\n61#1:393\n86#1:352,6\n86#1:389\n126#1:438\n126#1:439,9\n126#1:479\n122#1:432,2\n122#1:481\n*E\n"})
    static final class AnonymousClass1 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ boolean $accessToTeammateEnabled;
        final /* synthetic */ List<AvatarWrapper> $avatars;
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeCards.HomeHelpCenterData $helpCenterData;
        final /* synthetic */ boolean $isSearchFirstEnabled;
        final /* synthetic */ MetricTracker $metricTracker;

        AnonymousClass1(boolean z10, HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z11, List<AvatarWrapper> list, MetricTracker metricTracker, Context context) {
            this.$isSearchFirstEnabled = z10;
            this.$helpCenterData = homeHelpCenterData;
            this.$accessToTeammateEnabled = z11;
            this.$avatars = list;
            this.$metricTracker = metricTracker;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$0(MetricTracker metricTracker, Context context) {
            Intrinsics.checkNotNullParameter(metricTracker, "$metricTracker");
            Intrinsics.checkNotNullParameter(context, "$context");
            metricTracker.clickedSearchBrowseCard();
            context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, true));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$3(MetricTracker metricTracker, SuggestedArticle it, Context context) {
            Intrinsics.checkNotNullParameter(metricTracker, "$metricTracker");
            Intrinsics.checkNotNullParameter(it, "$it");
            Intrinsics.checkNotNullParameter(context, "$context");
            metricTracker.clickedArticleSuggestion(it.getId());
            context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(it.getId(), "search_browse_card", true, false, 8, null)));
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var, int i10) {
            char c10;
            float fR;
            int i11;
            float f10;
            int i12;
            int i13;
            float f11;
            androidx.compose.ui.a0 a0Var;
            final MetricTracker metricTracker;
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            boolean z10 = this.$isSearchFirstEnabled || !this.$helpCenterData.getSuggestedArticles().isEmpty();
            HomeCards.HomeHelpCenterData homeHelpCenterData = this.$helpCenterData;
            boolean z11 = this.$isSearchFirstEnabled;
            boolean z12 = this.$accessToTeammateEnabled;
            List<AvatarWrapper> list = this.$avatars;
            final MetricTracker metricTracker2 = this.$metricTracker;
            final Context context = this.$context;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            y7.n(c0VarD, a1VarB, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            float fR2 = androidx.compose.ui.unit.h.r(z10 ? 8 : 0);
            float f12 = 0;
            float fR3 = androidx.compose.ui.unit.h.r(f12);
            float fR4 = z10 ? androidx.compose.ui.unit.h.r(8) : androidx.compose.ui.unit.h.r(f12);
            if (z10) {
                f12 = 8;
            }
            androidx.compose.ui.a0 a0VarU = d5.u(aVar, fR4, fR2, androidx.compose.ui.unit.h.r(f12), fR3);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(a0VarU, intercomTheme.getShapes(c0Var, i14).m());
            c0Var.E(343614555);
            long jW = z10 ? androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0Var, i14).m714getPrimaryText0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null) : androidx.compose.ui.graphics.q0.f38131b.s();
            c0Var.A();
            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.i1.j(androidx.compose.foundation.v.d(a0VarA, jW, null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.components.v2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchBrowseCardKt.AnonymousClass1.invoke$lambda$7$lambda$0(metricTracker2, context);
                }
            }, 15, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarJ);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var);
            y7.n(c0VarD2, a1VarK, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
            if (z10) {
                fR = androidx.compose.ui.unit.h.r(8);
                c10 = 16;
            } else {
                c10 = 16;
                fR = androidx.compose.ui.unit.h.r(16);
            }
            androidx.compose.ui.a0 a0VarS = d5.s(a0VarH, fR, androidx.compose.ui.unit.h.r(z10 ? 12 : 20));
            androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.s(), aVar2.q(), c0Var, 54);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK3 = c0Var.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var, a0VarS);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A3);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var);
            y7.n(c0VarD3, a1VarE, aVar3.e());
            y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar3.f());
            y5 y5Var = y5.f16577a;
            Context context2 = context;
            q50.t(u0.i.d(R.string.intercom_search_for_help, c0Var, 0), null, 0L, null, 0L, null, androidx.compose.ui.text.font.v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 1572864, 0, 262078);
            androidx.compose.runtime.c0 c0Var2 = c0Var;
            int i15 = R.drawable.intercom_gif_search_icon;
            float f13 = 16;
            int i16 = 0;
            ni.o(u0.e.c(i15, c0Var2, 0), null, c4.a(i6.w(aVar, androidx.compose.ui.unit.h.r(f13)), String.valueOf(i15)), intercomTheme.getColors(c0Var2, i14).m685getActionContrastWhite0d7_KjU(), c0Var2, 56, 0);
            c0Var2.o();
            c0Var2.o();
            List<SuggestedArticle> suggestedArticles = homeHelpCenterData.getSuggestedArticles();
            c0Var2.E(343677614);
            List<SuggestedArticle> list2 = suggestedArticles;
            int i17 = 6;
            if (list2.isEmpty()) {
                i11 = 6;
                f10 = f13;
                i12 = 0;
                i13 = 2;
                f11 = 0.0f;
                a0Var = null;
            } else {
                androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar2.u(), c0Var2, 0);
                int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK4 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, aVar);
                Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A4);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD4 = y7.d(c0Var2);
                y7.n(c0VarD4, a1VarB2, aVar3.e());
                y7.n(c0VarD4, b1VarK4, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN4, aVar3.f());
                c0Var2.E(-562735688);
                if (list2.isEmpty()) {
                    metricTracker = metricTracker2;
                    a0Var = null;
                } else {
                    metricTracker = metricTracker2;
                    a0Var = null;
                    androidx.compose.runtime.b2.i("", new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(metricTracker, suggestedArticles, null), c0Var2, 70);
                }
                c0Var2.A();
                c0Var2.E(-562721890);
                int i18 = 0;
                for (Object obj : suggestedArticles) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
                    c0Var2.E(-562722059);
                    if (i18 == 0) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(4)), c0Var2, i17);
                    }
                    c0Var2.A();
                    androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                    final Context context3 = context2;
                    float f14 = 4;
                    androidx.compose.ui.a0 a0VarA2 = c4.a(d5.v(androidx.compose.foundation.i1.j(i6.h(aVar4, 0.0f, 1, a0Var), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.components.w2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchBrowseCardKt.AnonymousClass1.invoke$lambda$7$lambda$6$lambda$5$lambda$3(metricTracker, suggestedArticle, context3);
                        }
                    }, 15, null), androidx.compose.ui.unit.h.r(f13), androidx.compose.ui.unit.h.r(f14), 0.0f, androidx.compose.ui.unit.h.r(f14), 4, null), "suggested article");
                    androidx.compose.ui.layout.a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0Var2, 48);
                    int iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, i16));
                    androidx.compose.runtime.b1 b1VarK5 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0Var2, a0VarA2);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A5 = aVar5.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A5);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD5 = y7.d(c0Var2);
                    y7.n(c0VarD5, a1VarE2, aVar5.e());
                    y7.n(c0VarD5, b1VarK5, aVar5.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B5 = aVar5.b();
                    if (c0VarD5.P() || !Intrinsics.areEqual(c0VarD5.i0(), Integer.valueOf(iHashCode5))) {
                        c0VarD5.Y(Integer.valueOf(iHashCode5));
                        c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                    }
                    y7.n(c0VarD5, a0VarN5, aVar5.f());
                    float f15 = f13;
                    q50.t(suggestedArticle.getTitle(), x5.q(y5.f16577a, aVar4, 1.0f, false, 2, null), 0L, null, 0L, null, androidx.compose.ui.text.font.v0.f41742b.m(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 2, 0, null, null, c0Var, 1572864, 24960, 241596);
                    c0Var2 = c0Var;
                    a0Var = null;
                    IntercomChevronKt.IntercomChevron(d5.t(aVar4, androidx.compose.ui.unit.h.r(20), 0.0f, 2, null), c0Var2, 6, 0);
                    c0Var2.o();
                    l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f15)), c0Var2, 6);
                    i16 = 0;
                    i17 = 6;
                    i18 = i19;
                    f13 = f15;
                    context2 = context3;
                    metricTracker = metricTracker;
                }
                i11 = i17;
                f10 = f13;
                i12 = i16;
                i13 = 2;
                f11 = 0.0f;
                c0Var2.A();
                c0Var2.o();
            }
            c0Var2.A();
            c0Var2.E(343755978);
            if (z11 && z12) {
                c0Var2.E(343758114);
                if (!list2.isEmpty()) {
                    IntercomDividerKt.IntercomDivider(d5.t(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f10), f11, i13, a0Var), c0Var2, i11, i12);
                }
                c0Var2.A();
                TeamPresenceRowKt.TeamPresenceRow(a0Var, list, c0Var2, 64, 1);
            }
            c0Var2.A();
            c0Var2.o();
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowse(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1546858090);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m152getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.q2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBrowseCardKt.PreviewSearchBrowse$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowse$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewSearchBrowse(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowseNoSearchFirst(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-678171621);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m154getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.u2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBrowseCardKt.PreviewSearchBrowseNoSearchFirst$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowseNoSearchFirst$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewSearchBrowseNoSearchFirst(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowseNoSuggestions(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1745562356);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m153getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.r2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBrowseCardKt.PreviewSearchBrowseNoSuggestions$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowseNoSuggestions$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewSearchBrowseNoSuggestions(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowseNoSuggestionsNoSearchFirst(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(354688977);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m155getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.t2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBrowseCardKt.PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewSearchBrowseNoSuggestionsNoSearchFirst(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchBrowseCard(@NotNull final HomeCards.HomeHelpCenterData helpCenterData, final boolean z10, @NotNull final List<AvatarWrapper> avatars, final boolean z11, @NotNull final MetricTracker metricTracker, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(helpCenterData, "helpCenterData");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(382156573);
        IntercomCardKt.IntercomCard(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), null, androidx.compose.runtime.internal.w.e(-1020132823, true, new AnonymousClass1(z10, helpCenterData, z11, avatars, metricTracker, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())), c0VarR, 54), c0VarR, 390, 2);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.s2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBrowseCardKt.SearchBrowseCard$lambda$0(helpCenterData, z10, avatars, z11, metricTracker, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBrowseCard$lambda$0(HomeCards.HomeHelpCenterData helpCenterData, boolean z10, List avatars, boolean z11, MetricTracker metricTracker, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(helpCenterData, "$helpCenterData");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(metricTracker, "$metricTracker");
        SearchBrowseCard(helpCenterData, z10, avatars, z11, metricTracker, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
