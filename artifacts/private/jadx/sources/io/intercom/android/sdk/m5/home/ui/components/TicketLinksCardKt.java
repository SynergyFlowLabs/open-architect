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
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketLinksCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt$TicketLinksCard$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nTicketLinksCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketLinksCard.kt\nio/intercom/android/sdk/m5/home/ui/components/TicketLinksCardKt$TicketLinksCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,115:1\n87#2:116\n83#2,10:117\n94#2:209\n80#3,6:127\n87#3,3:142\n90#3,2:151\n80#3,6:169\n87#3,3:184\n90#3,2:193\n94#3:202\n94#3:208\n391#4,9:133\n400#4:153\n391#4,9:175\n400#4:195\n401#4,2:200\n401#4,2:206\n4360#5,6:145\n4360#5,6:187\n113#6:154\n113#6:155\n113#6:158\n113#6:196\n113#6:197\n113#6:204\n1872#7,2:156\n1874#7:205\n99#8:159\n96#8,9:160\n106#8:203\n75#9:198\n75#9:199\n*S KotlinDebug\n*F\n+ 1 TicketLinksCard.kt\nio/intercom/android/sdk/m5/home/ui/components/TicketLinksCardKt$TicketLinksCard$1\n*L\n38#1:116\n38#1:117,10\n38#1:209\n38#1:127,6\n38#1:142,3\n38#1:151,2\n49#1:169,6\n49#1:184,3\n49#1:193,2\n49#1:202\n38#1:208\n38#1:133,9\n38#1:153\n49#1:175,9\n49#1:195\n49#1:200,2\n38#1:206,2\n38#1:145,6\n49#1:187,6\n42#1:154\n43#1:155\n53#1:158\n63#1:196\n65#1:197\n79#1:204\n48#1:156,2\n48#1:205\n49#1:159\n49#1:160,9\n49#1:203\n66#1:198\n70#1:199\n*E\n"})
    static final class AnonymousClass1 implements pj.n<m0, c0, Integer, Unit> {
        final /* synthetic */ Function1<TicketType, Unit> $onTicketLinkClicked;
        final /* synthetic */ HomeCards.HomeTicketLinksData $ticketLinksData;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(HomeCards.HomeTicketLinksData homeTicketLinksData, Function1<? super TicketType, Unit> function1) {
            this.$ticketLinksData = homeTicketLinksData;
            this.$onTicketLinkClicked = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$0(Function1 onTicketLinkClicked, TicketLink item) {
            Intrinsics.checkNotNullParameter(onTicketLinkClicked, "$onTicketLinkClicked");
            Intrinsics.checkNotNullParameter(item, "$item");
            onTicketLinkClicked.invoke(item.getTicketType());
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
            Function1<TicketType, Unit> function1;
            HomeCards.HomeTicketLinksData homeTicketLinksData;
            c0 c0Var2 = c0Var;
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var2.d()) {
                c0Var2.u();
                return;
            }
            HomeCards.HomeTicketLinksData homeTicketLinksData2 = this.$ticketLinksData;
            Function1<TicketType, Unit> function2 = this.$onTicketLinkClicked;
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
            c0Var2.E(466717469);
            String cardTitle = homeTicketLinksData2.getCardTitle();
            if (cardTitle == null || StringsKt.w3(cardTitle)) {
                function1 = function2;
                homeTicketLinksData = homeTicketLinksData2;
            } else {
                homeTicketLinksData = homeTicketLinksData2;
                function1 = function2;
                q50.t(homeTicketLinksData2.getCardTitle(), d5.v(d5.t(aVar, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.h.r(12), 0.0f, androidx.compose.ui.unit.h.r(4), 5, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04SemiBold(), c0Var, 48, 0, 131068);
                c0Var2 = c0Var;
            }
            c0Var2.A();
            c0Var2.E(466732020);
            int i11 = 0;
            for (Object obj : homeTicketLinksData.getLinks()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final TicketLink ticketLink = (TicketLink) obj;
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                final Function1<TicketType, Unit> function3 = function1;
                float f10 = 16;
                androidx.compose.ui.a0 a0VarS = d5.s(i1.j(i6.h(aVar3, 0.0f, 1, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TicketLinksCardKt.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$0(function3, ticketLink);
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
                function1 = function3;
                q50.t(ticketLink.getTicketTypeName(), x5.q(y5.f16577a, aVar3, 1.0f, false, 2, null), 0L, null, 0L, null, v0.f41742b.m(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, null, c0Var, 1572864, 24960, 241596);
                c0Var2 = c0Var;
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                coil.compose.c.g(new coil.request.i.a((Context) c0Var2.W(AndroidCompositionLocals_androidKt.g())).j(ticketLink.getIconUrl()).i(true).f(), null, IntercomImageLoaderKt.getImageLoader((Context) c0Var2.W(AndroidCompositionLocals_androidKt.g())), i6.w(aVar3, androidx.compose.ui.unit.h.r(f10)), null, null, null, null, 0.0f, r0.a.d(r0.f38151b, IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), 0, 2, null), 0, false, null, c0Var2, 3640, 0, 7664);
                c0Var2.o();
                c0Var2.E(466773453);
                if (i13 != homeTicketLinksData.getLinks().size() - 1) {
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
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ExternalLinkCardPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1962060809);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketLinksCardKt.INSTANCE.m375getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketLinksCardKt.ExternalLinkCardPreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExternalLinkCardPreview$lambda$1(int i10, c0 c0Var, int i11) {
        ExternalLinkCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketLinksCard(@NotNull final HomeCards.HomeTicketLinksData ticketLinksData, @NotNull final Function1<? super TicketType, Unit> onTicketLinkClicked, @Nullable c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(ticketLinksData, "ticketLinksData");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "onTicketLinkClicked");
        c0 c0VarR = c0Var.R(-1931742368);
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.w.e(1008312684, true, new AnonymousClass1(ticketLinksData, onTicketLinkClicked), c0VarR, 54), c0VarR, a5.S0, 3);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketLinksCardKt.TicketLinksCard$lambda$0(ticketLinksData, onTicketLinkClicked, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketLinksCard$lambda$0(HomeCards.HomeTicketLinksData ticketLinksData, Function1 onTicketLinkClicked, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(ticketLinksData, "$ticketLinksData");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "$onTicketLinkClicked");
        TicketLinksCard(ticketLinksData, onTicketLinkClicked, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
