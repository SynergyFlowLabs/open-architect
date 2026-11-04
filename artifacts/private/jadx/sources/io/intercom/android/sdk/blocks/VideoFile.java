package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoFileBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
public class VideoFile implements VideoFileBlock {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 36;
    private final Provider<AppConfig> appConfigProvider;
    private final MetricTracker metricTracker;
    private final StyleType style;

    VideoFile(StyleType styleType, Provider<AppConfig> provider, MetricTracker metricTracker) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
    }

    public static /* synthetic */ void a(ImageView imageView, WebView webView, String str, View view) {
        imageView.setVisibility(8);
        webView.loadUrl(str);
    }

    private ImageView getPlayButtonView(Context context) {
        int iDpToPx = ScreenUtils.dpToPx(36.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(0);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private View textFallback(String str, ViewGroup viewGroup) {
        ParagraphView paragraphView = new ParagraphView(viewGroup.getContext(), StyleType.ADMIN, BlockAlignment.LEFT, this.appConfigProvider.get());
        paragraphView.setText(HtmlCompat.fromHtml(str));
        return paragraphView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoFileBlock
    public View addVideoFile(String str, final String str2, String str3, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str2)) {
            return textFallback(str, viewGroup);
        }
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        final WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        BlockUtils.setMarginBottom(webView, 16);
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        webView.loadUrl(str3);
        final ImageView playButtonView = getPlayButtonView(viewGroup.getContext());
        playButtonView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFile.a(playButtonView, webView, str2, view);
            }
        });
        relativeLayout.addView(webView);
        relativeLayout.addView(playButtonView);
        return relativeLayout;
    }
}
