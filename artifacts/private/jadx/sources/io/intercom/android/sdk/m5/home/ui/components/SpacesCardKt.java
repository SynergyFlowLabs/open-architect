package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItem;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.reducers.HomeItemBadgeReducerKt;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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
public final class SpacesCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nSpacesCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesCard.kt\nio/intercom/android/sdk/m5/home/ui/components/SpacesCardKt$SpacesCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,48:1\n87#2:49\n83#2,10:50\n94#2:103\n80#3,6:60\n87#3,3:75\n90#3,2:84\n94#3:102\n391#4,9:66\n400#4:86\n401#4,2:100\n4360#5,6:78\n774#6:87\n865#6,2:88\n1872#6,2:90\n1874#6:99\n1282#7,6:92\n113#8:98\n*S KotlinDebug\n*F\n+ 1 SpacesCard.kt\nio/intercom/android/sdk/m5/home/ui/components/SpacesCardKt$SpacesCard$1\n*L\n23#1:49\n23#1:50,10\n23#1:103\n23#1:60,6\n23#1:75,3\n23#1:84,2\n23#1:102\n23#1:66,9\n23#1:86\n23#1:100,2\n23#1:78,6\n24#1:87\n24#1:88,2\n25#1:90,2\n25#1:99\n34#1:92,6\n41#1:98\n*E\n"})
    static final class AnonymousClass1 implements pj.n<m0, c0, Integer, Unit> {
        final /* synthetic */ HomeCards.HomeSpacesData $homeSpacesData;
        final /* synthetic */ Function1<SpaceItemType, Unit> $onItemClick;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1$WhenMappings */
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

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(HomeCards.HomeSpacesData homeSpacesData, Function1<? super SpaceItemType, Unit> function1) {
            this.$homeSpacesData = homeSpacesData;
            this.$onItemClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function1 onItemClick, SpaceItem item) {
            Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
            Intrinsics.checkNotNullParameter(item, "$item");
            onItemClick.invoke(item.getType());
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
            int i11;
            boolean z10;
            char c10;
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HomeCards.HomeSpacesData homeSpacesData = this.$homeSpacesData;
            final Function1<SpaceItemType, Unit> function1 = this.$onItemClick;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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
            List<SpaceItem> spaceItems = homeSpacesData.getSpaceItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : spaceItems) {
                if (ArraysKt.contains(SpaceItemType.values(), ((SpaceItem) obj).getType())) {
                    arrayList.add(obj);
                }
            }
            c0Var.E(-1735936299);
            int i12 = 0;
            for (Object obj2 : arrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final SpaceItem spaceItem = (SpaceItem) obj2;
                int i14 = WhenMappings.$EnumSwitchMapping$0[spaceItem.getType().ordinal()];
                if (i14 == 1) {
                    i11 = R.drawable.intercom_messages_icon;
                } else if (i14 == 2) {
                    i11 = R.drawable.intercom_help_centre_icon;
                } else {
                    if (i14 != 3) {
                        throw new k0();
                    }
                    i11 = R.drawable.intercom_ticket_detail_icon;
                }
                String label = spaceItem.getLabel();
                HomeItemBadge homeItemBadgeReduceHomeItemBadge = HomeItemBadgeReducerKt.reduceHomeItemBadge(spaceItem.getBadge());
                Integer numValueOf = Integer.valueOf(i11);
                c0Var.E(-1302667345);
                boolean zD = c0Var.D(function1) | c0Var.D(spaceItem);
                Object objI0 = c0Var.i0();
                if (zD || objI0 == c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SpacesCardKt.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(function1, spaceItem);
                        }
                    };
                    c0Var.Y(objI0);
                }
                c0Var.A();
                int i15 = i12;
                HomeItemKt.HomeItem(null, numValueOf, null, null, null, label, null, homeItemBadgeReduceHomeItemBadge, (Function0) objI0, c0Var, 0, 93);
                c0Var.E(-1735917837);
                if (i15 != arrayList.size() - 1) {
                    c10 = 16;
                    z10 = false;
                    IntercomDividerKt.IntercomDivider(d5.t(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), c0Var, 6, 0);
                } else {
                    z10 = false;
                    c10 = 16;
                }
                c0Var.A();
                i12 = i13;
            }
            c0Var.A();
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SpacesCard(@NotNull final HomeCards.HomeSpacesData homeSpacesData, @NotNull final Function1<? super SpaceItemType, Unit> onItemClick, @Nullable c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(homeSpacesData, "homeSpacesData");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        c0 c0VarR = c0Var.R(-261271608);
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.w.e(1212336956, true, new AnonymousClass1(homeSpacesData, onItemClick), c0VarR, 54), c0VarR, a5.S0, 3);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpacesCardKt.SpacesCard$lambda$0(homeSpacesData, onItemClick, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacesCard$lambda$0(HomeCards.HomeSpacesData homeSpacesData, Function1 onItemClick, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(homeSpacesData, "$homeSpacesData");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        SpacesCard(homeSpacesData, onItemClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
