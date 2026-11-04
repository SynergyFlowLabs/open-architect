package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.l;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.HeadingBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.SubheadingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
class Heading implements HeadingBlock, SubheadingBlock {
    private static final int LARGE_MARGIN_BOTTOM_DP = 32;
    private static final int LARGE_TEXT_SP = 24;
    private static final int MARGIN_BOTTOM_DP = 16;
    private static final int MEDIUM_TEXT_SP = 20;
    private static final int SMALL_TEXT_SP = 15;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Heading$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        static {
            int[] iArr = new int[StyleType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = iArr;
            try {
                iArr[StyleType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.NOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.ARTICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CONTAINER_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CHAT_FULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CAROUSEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    Heading(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    @e.a({"WrongConstant"})
    private void applyGenericCarouselHeadingStyle(TextView textView, BlockMetadata blockMetadata) {
        textView.setBreakStrategy(0);
        textView.setTypeface(null, 1);
        BlockUtils.setMarginBottom(textView, 16);
        String textColor = blockMetadata.getAppearance().getTextColor();
        if (textColor.isEmpty()) {
            return;
        }
        int color = Color.parseColor(textColor);
        textView.setTextColor(color);
        textView.setLinkTextColor(color);
    }

    private void styleAnnouncementHeading(TextView textView, @l int i10, int i11, int i12) {
        textView.setTextSize(i11);
        textView.setTextColor(i10);
        textView.setLinkTextColor(i10);
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.setLargeLineSpacing(textView);
        BlockUtils.setMarginBottom(textView, i12);
    }

    private void styleCarouselHeading1(TextView textView, BlockMetadata blockMetadata) {
        applyGenericCarouselHeadingStyle(textView, blockMetadata);
        textView.setTextSize(48.0f);
        textView.setLineSpacing(ScreenUtils.dpToPx(8.0f, textView.getContext()), 1.0f);
    }

    private void styleCarouselHeading2(TextView textView, BlockMetadata blockMetadata) {
        applyGenericCarouselHeadingStyle(textView, blockMetadata);
        textView.setTextSize(34.0f);
        textView.setLineSpacing(ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
    }

    private void styleChatHeading(TextView textView, int i10) {
        textView.setTextSize(15.0f);
        textView.setTextColor(i10);
        textView.setLinkTextColor(i10);
        BlockUtils.setSmallLineSpacing(textView);
        BlockUtils.setDefaultMarginBottom(textView);
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.HeadingBlock
    public View addHeading(Spanned spanned, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        int color;
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams(textView, -2, -2);
        ConfigModules configModules = this.appConfigProvider.get().getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel actionContrastWhite = configModules.getCustomization().getActionContrastWhite();
            if (actionContrastWhite == null) {
                actionContrastWhite = configModules.getCustomization().getAction();
            }
            color = Color.parseColor(actionContrastWhite.getBackgroundColor());
        } else {
            color = -16777216;
        }
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
                styleAnnouncementHeading(textView, ColorUtils.lightenColor(color), 24, 32);
                FontUtils.setRobotoLightTypeface(textView);
                break;
            case 2:
                styleAnnouncementHeading(textView, ColorUtils.primaryOrBlackAccessibility(context, this.appConfigProvider.get()), 24, 32);
                break;
            case 3:
                styleAnnouncementHeading(textView, ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get()), 24, 32);
                break;
            case 4:
                styleAnnouncementHeading(textView, color, 20, 32);
                break;
            case 5:
                styleChatHeading(textView, androidx.core.content.d.g(context, R.color.intercom_grey_800));
                textView.setTypeface(null, 1);
                break;
            case 6:
                styleCarouselHeading1(textView, blockMetadata);
                break;
            default:
                styleChatHeading(textView, androidx.core.content.d.g(context, R.color.intercom_grey_800));
                textView.setTypeface(null, 1);
                break;
        }
        textView.setText(spanned);
        textView.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity(textView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(textView);
        accessibilityUtils.addHeadingAnnouncement(textView);
        return textView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.SubheadingBlock
    public View addSubheading(Spanned spanned, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        int color;
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams(textView, -2, -2);
        ConfigModules configModules = this.appConfigProvider.get().getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel actionContrastWhite = configModules.getCustomization().getActionContrastWhite();
            if (actionContrastWhite == null) {
                actionContrastWhite = configModules.getCustomization().getAction();
            }
            color = Color.parseColor(actionContrastWhite.getBackgroundColor());
        } else {
            color = -16777216;
        }
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
                styleAnnouncementHeading(textView, ColorUtils.lightenColor(color), 15, 16);
                FontUtils.setRobotoLightTypeface(textView);
                break;
            case 2:
            case 4:
                styleAnnouncementHeading(textView, color, 15, 16);
                break;
            case 3:
                styleAnnouncementHeading(textView, ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get()), 15, 16);
                break;
            case 5:
                styleChatHeading(textView, androidx.core.content.d.g(context, R.color.intercom_grey_800));
                break;
            case 6:
                styleCarouselHeading2(textView, blockMetadata);
                break;
            default:
                styleChatHeading(textView, color);
                break;
        }
        textView.setText(spanned);
        textView.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity(textView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(textView);
        accessibilityUtils.addHeadingAnnouncement(textView);
        return textView;
    }
}
