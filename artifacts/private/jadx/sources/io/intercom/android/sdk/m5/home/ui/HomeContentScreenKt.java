package io.intercom.android.sdk.m5.home.ui;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.ConversationHistoryCardKt;
import io.intercom.android.sdk.m5.components.SearchBrowseCardKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt;
import io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeContentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeContentScreen.kt\nio/intercom/android/sdk/m5/home/ui/HomeContentScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,134:1\n113#2:135\n113#2:136\n87#3:137\n85#3,8:138\n94#3:195\n80#4,6:146\n87#4,3:161\n90#4,2:170\n94#4:194\n391#5,9:152\n400#5:172\n401#5,2:192\n4360#6,6:164\n1872#7,2:173\n1557#7:187\n1628#7,3:188\n1874#7:191\n1282#8,6:175\n1282#8,6:181\n*S KotlinDebug\n*F\n+ 1 HomeContentScreen.kt\nio/intercom/android/sdk/m5/home/ui/HomeContentScreenKt\n*L\n47#1:135\n48#1:136\n46#1:137\n46#1:138,8\n46#1:195\n46#1:146,6\n46#1:161,3\n46#1:170,2\n46#1:194\n46#1:152,9\n46#1:172\n46#1:192,2\n46#1:164,6\n50#1:173,2\n104#1:187\n104#1:188,3\n50#1:191\n55#1:175,6\n97#1:181,6\n*E\n"})
public final class HomeContentScreenKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceItemType.values().length];
            try {
                iArr[SpaceItemType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpaceItemType.HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpaceItemType.TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeContentScreen(@Nullable a0 a0Var, @NotNull final HomeUiState.Content content, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function1<? super String, Unit> function3, @Nullable Function0<Unit> function4, @Nullable Function1<? super Conversation, Unit> function5, @Nullable Function1<? super TicketType, Unit> function6, @Nullable c0 c0Var, final int i10, final int i11) {
        Iterator it;
        c0 c0Var2;
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(-1476773966);
        a0 a0Var2 = (i11 & 1) != 0 ? a0.E : a0Var;
        final Function0<Unit> function7 = (i11 & 4) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        final Function0<Unit> function8 = (i11 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function1;
        final Function0<Unit> function9 = (i11 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function2;
        final Function1<? super String, Unit> function10 = (i11 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeContentScreenKt.HomeContentScreen$lambda$3((String) obj);
            }
        } : function3;
        final Function0<Unit> function11 = (i11 & 64) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function4;
        final Function1<? super Conversation, Unit> function12 = (i11 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeContentScreenKt.HomeContentScreen$lambda$5((Conversation) obj);
            }
        } : function5;
        final Function1<? super TicketType, Unit> function13 = (i11 & 256) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeContentScreenKt.HomeContentScreen$lambda$6((TicketType) obj);
            }
        } : function6;
        a0 a0VarT = d5.t(a0Var2, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
        a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(10)), androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
        int iHashCode = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        final a0 a0Var3 = a0Var2;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        n0 n0Var = n0.f16227a;
        c0VarR.E(-1359903615);
        Iterator it2 = content.getCards().iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            HomeCards homeCards = (HomeCards) next;
            if (homeCards instanceof HomeCards.HomeSpacesData) {
                c0VarR.E(1732177237);
                HomeCards.HomeSpacesData homeSpacesData = (HomeCards.HomeSpacesData) homeCards;
                c0VarR.E(55880488);
                boolean z10 = ((((i10 & 896) ^ a5.S0) > 256 && c0VarR.D(function7)) || (i10 & a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0VarR.D(function8)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && c0VarR.D(function9)) || (i10 & 24576) == 16384);
                Object objI0 = c0VarR.i0();
                if (z10 || objI0 == c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeContentScreenKt.HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(function7, function8, function9, (SpaceItemType) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                SpacesCardKt.SpacesCard(homeSpacesData, (Function1) objI0, c0VarR, 8);
                c0VarR.A();
            } else if (homeCards instanceof HomeCards.HomeRecentTicketsData) {
                c0VarR.E(1732700610);
                HomeCards.HomeRecentTicketsData homeRecentTicketsData = (HomeCards.HomeRecentTicketsData) homeCards;
                if (!homeRecentTicketsData.getTickets().isEmpty()) {
                    RecentTicketsCardKt.RecentTicketsCard(null, homeCards.getCardTitle(), homeRecentTicketsData.getTickets(), function10, c0VarR, ((i10 >> 6) & 7168) | 512, 1);
                }
                c0VarR.A();
            } else if (homeCards instanceof HomeCards.HomeRecentConversationData) {
                c0VarR.E(1733094620);
                HomeCards.HomeRecentConversationData homeRecentConversationData = (HomeCards.HomeRecentConversationData) homeCards;
                if (!homeRecentConversationData.getConversations().isEmpty()) {
                    ConversationHistoryCardKt.ConversationHistoryCard(null, homeCards.getCardTitle(), homeRecentConversationData.getConversations(), function12, c0VarR, ((i10 >> 12) & 7168) | 512, 1);
                }
                c0VarR.A();
            } else {
                if (homeCards instanceof HomeCards.HomeNewConversationData) {
                    c0VarR.E(1733520498);
                    NewConversationCardKt.NewConversationCard((HomeCards.HomeNewConversationData) homeCards, content.getAdminsAvatars(), content.getBotAvatar(), function11, c0VarR, ((i10 >> 9) & 7168) | 584, 0);
                    c0VarR.A();
                } else {
                    if (homeCards instanceof HomeCards.HomeHelpCenterData) {
                        c0VarR.E(1733905797);
                        c0VarR.E(55935065);
                        boolean zK = c0VarR.K(i12);
                        Object objI1 = c0VarR.i0();
                        if (zK || objI1 == c0.f35327a.a()) {
                            objI1 = new HomeContentScreenKt$HomeContentScreen$8$1$2$1(i12, null);
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        b2.i("", (Function2) objI1, c0VarR, 70);
                        HomeCards.HomeHelpCenterData homeHelpCenterData = (HomeCards.HomeHelpCenterData) homeCards;
                        boolean zIsHelpCenterRequireSearchEnabled = Injector.get().getAppConfigProvider().get().isHelpCenterRequireSearchEnabled();
                        List<Participant> builtActiveAdmins = Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins();
                        c0 c0Var3 = c0VarR;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(builtActiveAdmins, 10));
                        Iterator it3 = builtActiveAdmins.iterator();
                        while (it3.hasNext()) {
                            Participant participant = (Participant) it3.next();
                            Iterator it4 = it3;
                            Avatar avatar = participant.getAvatar();
                            Iterator it5 = it2;
                            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                            Boolean boolIsBot = participant.isBot();
                            Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
                            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
                            it3 = it4;
                            it2 = it5;
                        }
                        it = it2;
                        boolean zIsAccessToTeammateEnabled = Injector.get().getAppConfigProvider().get().isAccessToTeammateEnabled();
                        MetricTracker metricTracker = Injector.get().getMetricTracker();
                        Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                        SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, zIsHelpCenterRequireSearchEnabled, arrayList, zIsAccessToTeammateEnabled, metricTracker, c0Var3, 33288);
                        c0VarR = c0Var3;
                        c0VarR.A();
                    } else {
                        it = it2;
                        if (homeCards instanceof HomeCards.HomeExternalLinkData) {
                            c0VarR.E(1734773921);
                            ExternalLinkCardKt.ExternalLinkCard((HomeCards.HomeExternalLinkData) homeCards, c0VarR, 8);
                            c0VarR.A();
                        } else if (homeCards instanceof HomeCards.HomeMessengerAppData) {
                            c0VarR.E(1734912770);
                            c0 c0Var4 = c0VarR;
                            c0Var2 = c0Var4;
                            LegacyMessengerAppCardKt.LegacyMessengerAppCard(((HomeCards.HomeMessengerAppData) homeCards).getFallbackUrl(), IntercomCardStyle.INSTANCE.m597defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c0Var4, IntercomCardStyle.$stable << 18, 63), true, c0Var2, (IntercomCardStyle.Style.$stable << 3) | a5.S0);
                            c0Var2.A();
                        } else {
                            c0Var2 = c0VarR;
                            if (homeCards instanceof HomeCards.HomeTicketLinksData) {
                                c0Var2.E(1735201845);
                                TicketLinksCardKt.TicketLinksCard((HomeCards.HomeTicketLinksData) homeCards, function13, c0Var2, ((i10 >> 21) & com.planner5d.library.engine.input.f.b.B) | 8);
                                c0Var2.A();
                            } else {
                                c0Var2.E(1735406011);
                                c0Var2.A();
                            }
                        }
                    }
                    c0Var2 = c0VarR;
                }
                c0VarR = c0Var2;
                i12 = i13;
                it2 = it;
            }
            c0Var2 = c0VarR;
            it = it2;
            c0VarR = c0Var2;
            i12 = i13;
            it2 = it;
        }
        c0 c0Var5 = c0VarR;
        c0Var5.A();
        c0Var5.o();
        s5 s5VarT = c0Var5.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeContentScreenKt.HomeContentScreen$lambda$13(a0Var3, content, function7, function8, function9, function10, function11, function12, function13, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(Function0 function0, Function0 function1, Function0 function2, SpaceItemType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        int i11 = 0 >> 1;
        if (i10 == 1) {
            function0.invoke();
        } else if (i10 == 2) {
            function1.invoke();
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            function2.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$13(a0 a0Var, HomeUiState.Content content, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function0 function4, Function1 function5, Function1 function6, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(content, "$content");
        HomeContentScreen(a0Var, content, function0, function1, function2, function3, function4, function5, function6, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$5(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$6(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }
}
