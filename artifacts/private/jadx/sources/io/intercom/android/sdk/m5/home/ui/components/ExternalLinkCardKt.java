package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nExternalLinkCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalLinkCard.kt\nio/intercom/android/sdk/m5/home/ui/components/ExternalLinkCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,102:1\n75#2:103\n*S KotlinDebug\n*F\n+ 1 ExternalLinkCard.kt\nio/intercom/android/sdk/m5/home/ui/components/ExternalLinkCardKt\n*L\n36#1:103\n*E\n"})
public final class ExternalLinkCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt$ExternalLinkCard$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nExternalLinkCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalLinkCard.kt\nio/intercom/android/sdk/m5/home/ui/components/ExternalLinkCardKt$ExternalLinkCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,102:1\n87#2:103\n83#2,10:104\n94#2:194\n80#3,6:114\n87#3,3:129\n90#3,2:138\n80#3,6:156\n87#3,3:171\n90#3,2:180\n94#3:187\n94#3:193\n391#4,9:120\n400#4:140\n391#4,9:162\n400#4:182\n401#4,2:185\n401#4,2:191\n4360#5,6:132\n4360#5,6:174\n113#6:141\n113#6:142\n113#6:145\n113#6:183\n113#6:184\n113#6:189\n1872#7,2:143\n1874#7:190\n99#8:146\n96#8,9:147\n106#8:188\n*S KotlinDebug\n*F\n+ 1 ExternalLinkCard.kt\nio/intercom/android/sdk/m5/home/ui/components/ExternalLinkCardKt$ExternalLinkCard$1\n*L\n38#1:103\n38#1:104,10\n38#1:194\n38#1:114,6\n38#1:129,3\n38#1:138,2\n49#1:156,6\n49#1:171,3\n49#1:180,2\n49#1:187\n38#1:193\n38#1:120,9\n38#1:140\n49#1:162,9\n49#1:182\n49#1:185,2\n38#1:191,2\n38#1:132,6\n49#1:174,6\n42#1:141\n43#1:142\n56#1:145\n66#1:183\n68#1:184\n78#1:189\n48#1:143,2\n48#1:190\n49#1:146\n49#1:147,9\n49#1:188\n*E\n"})
    static final class AnonymousClass1 implements pj.n<m0, c0, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeCards.HomeExternalLinkData $homeExternalLinkData;

        AnonymousClass1(HomeCards.HomeExternalLinkData homeExternalLinkData, Context context) {
            this.$homeExternalLinkData = homeExternalLinkData;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$0(Link item, Context context) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(context, "$context");
            Injector.get().getMetricTracker().clickedExternalLinkCard();
            LinkOpener.handleUrl(item.getUrl(), context, Injector.get().getApi());
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(m0 IntercomCard, c0 c0Var, int i10) {
            Context context;
            HomeCards.HomeExternalLinkData homeExternalLinkData;
            c0 c0Var2 = c0Var;
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var2.d()) {
                c0Var2.u();
                return;
            }
            HomeCards.HomeExternalLinkData homeExternalLinkData2 = this.$homeExternalLinkData;
            Context context2 = this.$context;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
            b1 b1VarK = c0Var2.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, aVar);
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
            c0Var2.E(-433115947);
            String cardTitle = homeExternalLinkData2.getCardTitle();
            if (cardTitle == null || StringsKt.w3(cardTitle)) {
                context = context2;
                homeExternalLinkData = homeExternalLinkData2;
            } else {
                homeExternalLinkData = homeExternalLinkData2;
                context = context2;
                q50.t(homeExternalLinkData2.getCardTitle(), d5.v(d5.t(aVar, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.h.r(12), 0.0f, androidx.compose.ui.unit.h.r(4), 5, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04SemiBold(), c0Var, 48, 0, 131068);
                c0Var2 = c0Var;
            }
            c0Var2.A();
            c0Var2.E(-433100991);
            int i11 = 0;
            for (Object obj : homeExternalLinkData.getLinks()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Link link = (Link) obj;
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                final Context context3 = context;
                float f10 = 16;
                androidx.compose.ui.a0 a0VarS = d5.s(i1.j(i6.h(aVar3, 0.0f, 1, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExternalLinkCardKt.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$0(link, context3);
                    }
                }, 15, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(12));
                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0Var2, 48);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK2 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarS);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A2);
                } else {
                    c0Var2.l();
                }
                c0 c0VarD2 = y7.d(c0Var2);
                y7.n(c0VarD2, a1VarE, aVar4.e());
                y7.n(c0VarD2, b1VarK2, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar4.f());
                int i13 = i11;
                context = context3;
                q50.t(link.getLabel(), x5.q(y5.f16577a, aVar3, 1.0f, false, 2, null), 0L, null, 0L, null, v0.f41742b.m(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, null, c0Var, 1572864, 24960, 241596);
                c0Var2 = c0Var;
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                ni.o(u0.e.c(R.drawable.intercom_open_help_center, c0Var2, 0), null, i6.w(aVar3, androidx.compose.ui.unit.h.r(f10)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), c0Var2, 440, 0);
                c0Var2.o();
                c0Var2.E(-433061728);
                if (i13 != homeExternalLinkData.getLinks().size() - 1) {
                    IntercomDividerKt.IntercomDivider(d5.t(i6.h(aVar3, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null), c0Var2, 6, 0);
                }
                c0Var2.A();
                i11 = i12;
            }
            c0Var2.A();
            c0Var2.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ExternalLinkCard(@NotNull final HomeCards.HomeExternalLinkData homeExternalLinkData, @Nullable c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(homeExternalLinkData, "homeExternalLinkData");
        c0 c0VarR = c0Var.R(-1463768637);
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.w.e(1810723127, true, new AnonymousClass1(homeExternalLinkData, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())), c0VarR, 54), c0VarR, a5.S0, 3);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExternalLinkCardKt.ExternalLinkCard$lambda$0(homeExternalLinkData, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExternalLinkCard$lambda$0(HomeCards.HomeExternalLinkData homeExternalLinkData, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(homeExternalLinkData, "$homeExternalLinkData");
        ExternalLinkCard(homeExternalLinkData, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ExternalLinkCardPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-144974605);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExternalLinkCardKt.INSTANCE.m368getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExternalLinkCardKt.ExternalLinkCardPreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExternalLinkCardPreview$lambda$1(int i10, c0 c0Var, int i11) {
        ExternalLinkCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
