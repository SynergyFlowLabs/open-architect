package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.gson.f;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.MessengerCardBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.ThemeUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;

/* JADX INFO: loaded from: classes13.dex */
public class MessengerCard implements MessengerCardBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private final f gson;
    private final MetricTracker metricTracker;

    public MessengerCard(Provider<AppConfig> provider, f fVar, MetricTracker metricTracker, String str) {
        this.appConfigProvider = provider;
        this.gson = fVar;
        this.metricTracker = metricTracker;
        this.conversationId = str;
    }

    private View textFallback(String str, ViewGroup viewGroup) {
        ParagraphView paragraphView = new ParagraphView(viewGroup.getContext(), StyleType.ADMIN, BlockAlignment.LEFT, this.appConfigProvider.get());
        paragraphView.setText(HtmlCompat.fromHtml(str));
        return paragraphView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.MessengerCardBlock
    @e.a({"SetJavaScriptEnabled"})
    public View addCard(String str, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str2)) {
            return textFallback(str, viewGroup);
        }
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.intercom_messenger_card_block, viewGroup, false);
        frameLayout.getLayoutTransition().enableTransitionType(4);
        ProgressBar progressBar = (ProgressBar) frameLayout.findViewById(R.id.loading_view);
        CardWebView cardWebViewCreateCardWebView = MessengerCardWebViewPresenter.createCardWebView(context);
        frameLayout.addView(cardWebViewCreateCardWebView);
        new MessengerCardWebViewPresenter(cardWebViewCreateCardWebView, progressBar, str2, ColorUtils.primaryOrDarkColor(cardWebViewCreateCardWebView.getContext(), this.appConfigProvider.get()), this.gson, this.metricTracker, context.getCacheDir(), this.conversationId, false, context).setUpWebView();
        cardWebViewCreateCardWebView.loadUrl(ThemeUtils.appendInterfaceStyleToUrl(context, str2));
        return frameLayout;
    }
}
