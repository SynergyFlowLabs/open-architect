package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
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
@SourceDebugExtension({"SMAP\nNewConversationCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewConversationCard.kt\nio/intercom/android/sdk/m5/home/ui/components/NewConversationCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,248:1\n113#2:249\n113#2:250\n113#2:251\n113#2:252\n*S KotlinDebug\n*F\n+ 1 NewConversationCard.kt\nio/intercom/android/sdk/m5/home/ui/components/NewConversationCardKt\n*L\n59#1:249\n67#1:250\n104#1:251\n107#1:252\n*E\n"})
public final class NewConversationCardKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.TEAMMATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.BOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.FIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OpenMessengerResponse.IconType.values().length];
            try {
                iArr2[OpenMessengerResponse.IconType.PAPER_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NewConversationCard(@NotNull final HomeCards.HomeNewConversationData newConversation, @NotNull final List<AvatarWrapper> adminAvatars, @Nullable AvatarWrapper avatarWrapper, @NotNull final Function0<Unit> onNewConversationClicked, @Nullable c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(newConversation, "newConversation");
        Intrinsics.checkNotNullParameter(adminAvatars, "adminAvatars");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "onNewConversationClicked");
        c0 c0VarR = c0Var.R(-773584515);
        final AvatarWrapper avatarWrapper2 = (i11 & 4) != 0 ? null : avatarWrapper;
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.w.e(-1464624655, true, new pj.n<m0, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCard.1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, c0 c0Var2, Integer num) {
                invoke(m0Var, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(m0 IntercomCard, c0 c0Var2, int i12) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i12 & 81) == 16 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                if (newConversation.getHomeCard() != null) {
                    c0Var2.E(995075445);
                    NewConversationCardKt.NewConversationCardV2(newConversation.getHomeCard(), onNewConversationClicked, c0Var2, 8);
                    c0Var2.A();
                } else {
                    c0Var2.E(995264607);
                    NewConversationCardKt.NewConversationCardV1(newConversation, adminAvatars, avatarWrapper2, onNewConversationClicked, c0Var2, 584, 0);
                    c0Var2.A();
                }
            }
        }, c0VarR, 54), c0VarR, a5.S0, 3);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCard$lambda$0(newConversation, adminAvatars, avatarWrapper2, onNewConversationClicked, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCard$lambda$0(HomeCards.HomeNewConversationData newConversation, List adminAvatars, AvatarWrapper avatarWrapper, Function0 onNewConversationClicked, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(newConversation, "$newConversation");
        Intrinsics.checkNotNullParameter(adminAvatars, "$adminAvatars");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCard(newConversation, adminAvatars, avatarWrapper, onNewConversationClicked, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void NewConversationCardBotPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-322151692);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m372getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCardBotPreview$lambda$4(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardBotPreview$lambda$4(int i10, c0 c0Var, int i11) {
        NewConversationCardBotPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void NewConversationCardFinWithHumanAccessPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1635839473);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m373getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCardFinWithHumanAccessPreview$lambda$5(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardFinWithHumanAccessPreview$lambda$5(int i10, c0 c0Var, int i11) {
        NewConversationCardFinWithHumanAccessPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void NewConversationCardFinWithoutHumanAccessPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1289284327);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m374getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCardFinWithoutHumanAccessPreview$lambda$6(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardFinWithoutHumanAccessPreview$lambda$6(int i10, c0 c0Var, int i11) {
        NewConversationCardFinWithoutHumanAccessPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void NewConversationCardTeammatePreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(605107279);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m371getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCardTeammatePreview$lambda$3(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardTeammatePreview$lambda$3(int i10, c0 c0Var, int i11) {
        NewConversationCardTeammatePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use NewConversationCardV2 instead")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NewConversationCardV1(final HomeCards.HomeNewConversationData homeNewConversationData, final List<AvatarWrapper> list, AvatarWrapper avatarWrapper, final Function0<Unit> function0, c0 c0Var, final int i10, final int i11) {
        c0 c0VarR = c0Var.R(-1141879848);
        Integer numValueOf = null;
        final AvatarWrapper avatarWrapper2 = (i11 & 4) != 0 ? null : avatarWrapper;
        androidx.compose.ui.a0 a0VarW = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarB = i6.b(a0VarW, 0.0f, androidx.compose.ui.unit.h.r(64), 1, null);
        IconType icon = homeNewConversationData.getAction().getIcon();
        int i12 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i12 == 1) {
            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i12 == 2) {
            numValueOf = Integer.valueOf(R.drawable.intercom_conversation_card_question);
        } else if (i12 == 3) {
            numValueOf = Integer.valueOf(R.drawable.intercom_chevron);
        }
        IconType icon2 = homeNewConversationData.getAction().getIcon();
        if ((icon2 != null ? WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()] : -1) == 1) {
            a0VarW = i6.w(a0VarW, androidx.compose.ui.unit.h.r(16));
        }
        HomeItemKt.HomeItem(a0VarB, numValueOf, androidx.compose.runtime.internal.w.e(1023934521, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV1.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IconType.values().length];
                    try {
                        iArr[IconType.FIN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IconType.FACE_PILE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var2, int i13) {
                int i14 = 7 << 2;
                if ((i13 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                IconType icon3 = homeNewConversationData.getAction().getIcon();
                int i15 = icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()];
                if (i15 == 1) {
                    c0Var2.E(1718791131);
                    if (avatarWrapper2 != null) {
                        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(32)), avatarWrapper2, null, false, 0L, null, c0Var2, 70, 60);
                    }
                    c0Var2.A();
                    return;
                }
                if (i15 != 2) {
                    c0Var2.E(-83081034);
                    c0Var2.A();
                    return;
                }
                c0Var2.E(1719018020);
                if (avatarWrapper2 != null) {
                    List<AvatarWrapper> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AvatarWrapper) it.next()).getAvatar());
                    }
                    BotAndHumansFacePileKt.m103BotAndHumansFacePilehGBTI10(null, avatarWrapper2.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), androidx.compose.ui.unit.h.r(36), null, c0Var2, 3648, 17);
                }
                c0Var2.A();
            }
        }, c0VarR, 54), a0VarW, null, homeNewConversationData.getAction().getLabel(), homeNewConversationData.getAction().getSubtitle(), null, function0, c0VarR, ((i10 << 15) & 234881024) | 390, 144);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final AvatarWrapper avatarWrapper3 = avatarWrapper2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCardV1$lambda$1(homeNewConversationData, list, avatarWrapper3, function0, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardV1$lambda$1(HomeCards.HomeNewConversationData newConversationData, List adminAvatars, AvatarWrapper avatarWrapper, Function0 onNewConversationClicked, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(newConversationData, "$newConversationData");
        Intrinsics.checkNotNullParameter(adminAvatars, "$adminAvatars");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCardV1(newConversationData, adminAvatars, avatarWrapper, onNewConversationClicked, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NewConversationCardV2(final OpenMessengerResponse.NewConversationData.HomeCard homeCard, final Function0<Unit> function0, c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(341363796);
        androidx.compose.ui.a0 a0VarW = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarB = i6.b(a0VarW, 0.0f, androidx.compose.ui.unit.h.r(64), 1, null);
        OpenMessengerResponse.IconType icon = homeCard.getIcon();
        Integer icon2 = icon != null ? icon.getIcon() : null;
        OpenMessengerResponse.IconType icon3 = homeCard.getIcon();
        if ((icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[icon3.ordinal()]) == 1) {
            a0VarW = i6.w(a0VarW, androidx.compose.ui.unit.h.r(16));
        }
        HomeItemKt.HomeItem(a0VarB, icon2, androidx.compose.runtime.internal.w.e(94824693, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV2.1
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
                AvatarDetails avatarDetails = homeCard.getAvatarDetails();
                if ((avatarDetails != null ? avatarDetails.getAvatarType() : null) == AvatarType.FACEPILE) {
                    Avatar avatarBuild = homeCard.getAvatarDetails().getAvatars().get(0).build();
                    Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
                    List listDrop = CollectionsKt.drop(homeCard.getAvatarDetails().getAvatars(), 1);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
                    Iterator it = listDrop.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Avatar.Builder) it.next()).build());
                    }
                    BotAndHumansFacePileKt.m103BotAndHumansFacePilehGBTI10(null, avatarBuild, BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), androidx.compose.ui.unit.h.r(36), null, c0Var2, 3648, 17);
                }
            }
        }, c0VarR, 54), a0VarW, null, homeCard.getText(), homeCard.getSubtitle(), null, function0, c0VarR, ((i10 << 21) & 234881024) | 390, 144);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewConversationCardKt.NewConversationCardV2$lambda$2(homeCard, function0, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardV2$lambda$2(OpenMessengerResponse.NewConversationData.HomeCard homeCard, Function0 onNewConversationClicked, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(homeCard, "$homeCard");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCardV2(homeCard, onNewConversationClicked, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
