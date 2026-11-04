package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.annotation.v;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ButtonBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.FacebookBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.TwitterBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ButtonSelector;

/* JADX INFO: loaded from: classes13.dex */
class Button implements ButtonBlock, FacebookBlock, TwitterBlock {
    private static final int FACEBOOK_LOGO_PADDING_LEFT_DP = 20;
    private static final int TWITTER_LOGO_PADDING_LEFT_DP = 16;
    private final Provider<AppConfig> appConfigProvider;

    @p0
    private final ButtonClickListener buttonClickListener;
    private final StyleType style;

    public Button(StyleType styleType, Provider<AppConfig> provider, @p0 ButtonClickListener buttonClickListener) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.buttonClickListener = buttonClickListener;
    }

    private View createButtonWithLogo(Context context, String str, int i10, @v int i11) {
        FrameLayout frameLayout = new FrameLayout(context);
        BlockUtils.createLayoutParams(frameLayout, -1, ScreenUtils.dpToPx(44.0f, context));
        BlockUtils.setDefaultMarginBottom(frameLayout);
        BackgroundUtils.setBackground(frameLayout, new ButtonSelector(context, R.drawable.intercom_border, this.appConfigProvider.get().getPrimaryColor()));
        ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
        ImageView imageView = new ImageView(context);
        BlockUtils.createLayoutParams(imageView, -2, -1);
        imageView.setImageResource(i11);
        imageView.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        if (ColorUtils.isColorLight(this.appConfigProvider.get().getPrimaryColor())) {
            androidx.core.graphics.drawable.c.n(imageView.getDrawable(), androidx.core.content.d.g(context, R.color.intercom_accessibility_black));
        }
        imageView.setPadding(i10, 0, 0, 0);
        ((LinearLayout.LayoutParams) imageView.getLayoutParams()).gravity = 8388627;
        TextView textView = new TextView(context);
        BlockUtils.createLayoutParams(textView, -1, -1);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(ColorUtils.whiteOrBlackAccessibility(context, this.appConfigProvider.get()));
        textView.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        textView.setGravity(17);
        FontUtils.setRobotoMediumTypeface(textView);
        frameLayout.addView(imageView);
        frameLayout.addView(textView);
        return frameLayout;
    }

    private TextView createDefaultTextView(Context context, Spanned spanned, BlockAlignment blockAlignment) {
        AppConfig appConfig = this.appConfigProvider.get();
        ParagraphView paragraphView = new ParagraphView(context, this.style, blockAlignment, appConfig);
        paragraphView.setTextColor(appConfig.getPrimaryColor());
        paragraphView.setPaintFlags(paragraphView.getPaintFlags() | 8);
        paragraphView.setGravity(blockAlignment.getGravity());
        paragraphView.setText(spanned);
        return paragraphView;
    }

    private android.widget.Button createFullWidthButton(Context context, Spanned spanned) {
        AppConfig appConfig = this.appConfigProvider.get();
        android.widget.Button button = new android.widget.Button(context);
        button.setTextSize(16.0f);
        button.setTextColor(ColorUtils.whiteOrBlackAccessibility(context, appConfig));
        button.setAllCaps(false);
        button.setGravity(17);
        button.setText(spanned);
        BlockUtils.createLayoutParams(button, -1, -2);
        BlockUtils.setDefaultMarginBottom(button);
        BackgroundUtils.setBackground(button, new ButtonSelector(context, R.drawable.intercom_border, appConfig.getPrimaryColor()));
        FontUtils.setRobotoMediumTypeface(button);
        return button;
    }

    private View setButtonDefaults(View view, final String str, BlockAlignment blockAlignment, boolean z10) {
        ButtonClickListener buttonClickListener = this.buttonClickListener;
        if (buttonClickListener != null && buttonClickListener.shouldHandleClicks()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Button.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Button.this.buttonClickListener.onButtonClicked(view2, str);
                }
            });
        }
        BlockUtils.setLayoutMarginsAndGravity(view, blockAlignment.getGravity(), z10);
        return view;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ButtonBlock
    public View addButton(Spanned spanned, String str, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        StyleType styleType = this.style;
        View viewCreateFullWidthButton = (styleType == StyleType.NOTE || styleType == StyleType.ARTICLE || styleType == StyleType.POST || styleType == StyleType.CONTAINER_CARD) ? createFullWidthButton(context, spanned) : createDefaultTextView(context, spanned, blockAlignment);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(viewCreateFullWidthButton);
        return setButtonDefaults(viewCreateFullWidthButton, str, blockAlignment, blockMetadata.isLastObject());
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.FacebookBlock
    public View addFacebookButton(String str, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        String string = context.getString(R.string.intercom_facebook_like);
        StyleType styleType = this.style;
        View viewCreateButtonWithLogo = (styleType == StyleType.NOTE || styleType == StyleType.ARTICLE || styleType == StyleType.POST || styleType == StyleType.CONTAINER_CARD) ? createButtonWithLogo(context, string, ScreenUtils.dpToPx(20.0f, context), R.drawable.intercom_icn_fb) : createDefaultTextView(context, HtmlCompat.fromHtml(string), blockAlignment);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(viewCreateButtonWithLogo);
        return setButtonDefaults(viewCreateButtonWithLogo, str, blockAlignment, blockMetadata.isLastObject());
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.TwitterBlock
    public View addTwitterButton(String str, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        String string = context.getString(R.string.intercom_twitter_follow);
        StyleType styleType = this.style;
        View viewCreateButtonWithLogo = (styleType == StyleType.NOTE || styleType == StyleType.ARTICLE || styleType == StyleType.POST || styleType == StyleType.CONTAINER_CARD) ? createButtonWithLogo(context, string, ScreenUtils.dpToPx(16.0f, context), R.drawable.intercom_icn_twitter) : createDefaultTextView(context, HtmlCompat.fromHtml(string), blockAlignment);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(viewCreateButtonWithLogo);
        return setButtonDefaults(viewCreateButtonWithLogo, str, blockAlignment, blockMetadata.isLastObject());
    }
}
