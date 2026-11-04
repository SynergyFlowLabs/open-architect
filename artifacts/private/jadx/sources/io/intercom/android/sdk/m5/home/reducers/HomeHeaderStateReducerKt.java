package io.intercom.android.sdk.m5.home.reducers;

import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HeaderBackdropType;
import io.intercom.android.sdk.models.HeaderBackgroundModel;
import io.intercom.android.sdk.models.HeaderConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeHeaderStateReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeHeaderStateReducer.kt\nio/intercom/android/sdk/m5/home/reducers/HomeHeaderStateReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1557#2:248\n1628#2,3:249\n1557#2:253\n1628#2,3:254\n1557#2:257\n1628#2,3:258\n1557#2:261\n1628#2,3:262\n1#3:252\n*S KotlinDebug\n*F\n+ 1 HomeHeaderStateReducer.kt\nio/intercom/android/sdk/m5/home/reducers/HomeHeaderStateReducerKt\n*L\n143#1:248\n143#1:249,3\n220#1:253\n220#1:254,3\n221#1:257\n221#1:258,3\n224#1:261\n224#1:262,3\n*E\n"})
public final class HomeHeaderStateReducerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderBackdropType.values().length];
            try {
                iArr[HeaderBackdropType.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderBackdropType.COLORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HeaderBackdropType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:36:0x0457 A[LOOP:0: B:34:0x0451->B:36:0x0457, LOOP_END] */
    @NotNull
    public static final HomeUiState.Content.ContentHeader computeContentHeader(@Nullable ConfigModules configModules, @NotNull TeamPresence teamPresence, boolean z10) {
        Pair pair;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor2;
        HeaderConfig header;
        boolean z11;
        ArrayList arrayList;
        String logoDarkUrl;
        Intrinsics.checkNotNullParameter(teamPresence, "teamPresence");
        if (configModules == null) {
            return new HomeUiState.Content.ContentHeader(false, null, null, new HomeUiState.Content.ContentHeader.ColoredText("", 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null), new HomeUiState.Content.ContentHeader.ColoredText("", 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(q0.f38131b.a(), false, null), null, false, CollectionsKt.emptyList(), new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 68, null);
        }
        HeaderBackdropType type = configModules.getHome().getHeader().getBackground().getType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            pair = new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            pair = z10 ? new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor())) : new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
        }
        HomeUiState.Content.ContentHeader.ColoredText coloredText = (HomeUiState.Content.ContentHeader.ColoredText) pair.component1();
        HomeUiState.Content.ContentHeader.ColoredText coloredText2 = (HomeUiState.Content.ContentHeader.ColoredText) pair.component2();
        int i11 = iArr[configModules.getHome().getHeader().getBackground().getType().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                throw new k0();
            }
            if (z10) {
                closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
            } else {
                closeButtonColor2 = new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", configModules.getCustomization().getHeader().getForegroundColor(), coloredText.getTextColorDark(), 0.5f);
            }
            header = configModules.getHome().getHeader();
            if (StringsKt.w3(header.getContent().getLogoUrl()) || !((logoDarkUrl = header.getContent().getLogoDarkUrl()) == null || StringsKt.w3(logoDarkUrl))) {
                z11 = true;
            } else {
                z11 = false;
            }
            String logoUrl = header.getContent().getLogoUrl();
            String logoDarkUrl2 = header.getContent().getLogoDarkUrl();
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM356getHeaderBackdropStylebw27NRU = m356getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM356getHeaderBackdropStylebw27NRU2 = m356getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
            boolean showAvatars = header.getContent().getShowAvatars();
            List<Participant> listTake = CollectionsKt.take(teamPresence.getBuiltActiveAdmins(), 3);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            for (Participant participant : listTake) {
                Avatar avatar = participant.getAvatar();
                Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                Boolean boolIsBot = participant.isBot();
                Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
                arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
            }
            return new HomeUiState.Content.ContentHeader(z11, logoUrl, logoDarkUrl2, coloredText2, coloredText, headerBackdropStyleM356getHeaderBackdropStylebw27NRU, headerBackdropStyleM356getHeaderBackdropStylebw27NRU2, showAvatars, arrayList, closeButtonColor2);
        }
        closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
        closeButtonColor2 = closeButtonColor;
        header = configModules.getHome().getHeader();
        if (StringsKt.w3(header.getContent().getLogoUrl())) {
            z11 = true;
        } else {
            z11 = true;
        }
        String logoUrl2 = header.getContent().getLogoUrl();
        String logoDarkUrl3 = header.getContent().getLogoDarkUrl();
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM356getHeaderBackdropStylebw27NRU3 = m356getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM356getHeaderBackdropStylebw27NRU4 = m356getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
        boolean showAvatars2 = header.getContent().getShowAvatars();
        List<Participant> listTake2 = CollectionsKt.take(teamPresence.getBuiltActiveAdmins(), 3);
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake2, 10));
        while (r0.hasNext()) {
            Avatar avatar2 = participant.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar2, "getAvatar(...)");
            Boolean boolIsBot2 = participant.isBot();
            Intrinsics.checkNotNullExpressionValue(boolIsBot2, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar2, boolIsBot2.booleanValue()));
        }
        return new HomeUiState.Content.ContentHeader(z11, logoUrl2, logoDarkUrl3, coloredText2, coloredText, headerBackdropStyleM356getHeaderBackdropStylebw27NRU3, headerBackdropStyleM356getHeaderBackdropStylebw27NRU4, showAvatars2, arrayList, closeButtonColor2);
    }

    @NotNull
    public static final HomeUiState.Error.ErrorHeader computeErrorHeader(@Nullable ConfigModules configModules) {
        if (configModules == null) {
            return new HomeUiState.Error.ErrorHeader("#000000", "#FFFFFF");
        }
        return new HomeUiState.Error.ErrorHeader(configModules.getCustomization().getHeader().getBackgroundColor(), configModules.getCustomization().getHeader().getForegroundColor());
    }

    @NotNull
    /* JADX INFO: renamed from: getHeaderBackdropStyle-bw27NRU, reason: not valid java name */
    public static final HomeUiState.Content.ContentHeader.HeaderBackdropStyle m356getHeaderBackdropStylebw27NRU(@NotNull HeaderBackgroundModel headerBackgroundModel, long j10, boolean z10) {
        HeaderBackdropType type;
        List listListOf;
        ArrayList arrayList;
        String imageUrl;
        Boolean fadeToDark;
        Intrinsics.checkNotNullParameter(headerBackgroundModel, "headerBackgroundModel");
        if (!z10 || (type = headerBackgroundModel.getTypeDark()) == null) {
            type = headerBackgroundModel.getType();
        }
        boolean fade = (!z10 || (fadeToDark = headerBackgroundModel.getFadeToDark()) == null) ? headerBackgroundModel.getFade() : fadeToDark.booleanValue();
        boolean z11 = fade;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[type.ordinal()];
        if (i10 == 1) {
            if (z10) {
                String colorDark = headerBackgroundModel.getColorDark();
                if (colorDark != null) {
                    j10 = s0.b(ColorUtils.parseColor(colorDark));
                } else {
                    int i11 = iArr[headerBackgroundModel.getType().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        j10 = s0.b(ColorUtils.parseColor(headerBackgroundModel.getColor()));
                    } else if (i11 != 3) {
                        throw new k0();
                    }
                }
            } else {
                j10 = s0.b(ColorUtils.parseColor(headerBackgroundModel.getColor()));
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(j10, z11, null);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new k0();
            }
            if (!z10 || (imageUrl = headerBackgroundModel.getImageDarkUrl()) == null) {
                imageUrl = headerBackgroundModel.getImageUrl();
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image(j10, imageUrl, z11, null);
        }
        if (z10) {
            List<String> gradientDark = headerBackgroundModel.getGradientDark();
            if (gradientDark != null) {
                List<String> list = gradientDark;
                listListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listListOf.add(q0.n(s0.b(ColorUtils.parseColor((String) it.next()))));
                }
            } else {
                List<String> gradient = headerBackgroundModel.getGradient();
                if (gradient != null) {
                    List<String> list2 = gradient;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(q0.n(s0.b(ColorUtils.parseColor((String) it2.next()))));
                    }
                    listListOf = arrayList;
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new q0[]{q0.n(j10), q0.n(j10)});
                }
            }
        } else {
            List<String> gradient2 = headerBackgroundModel.getGradient();
            if (gradient2 != null) {
                List<String> list3 = gradient2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(q0.n(s0.b(ColorUtils.parseColor((String) it3.next()))));
                }
                listListOf = arrayList;
            } else {
                listListOf = CollectionsKt.listOf((Object[]) new q0[]{q0.n(j10), q0.n(j10)});
            }
        }
        return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(listListOf, z11);
    }
}
