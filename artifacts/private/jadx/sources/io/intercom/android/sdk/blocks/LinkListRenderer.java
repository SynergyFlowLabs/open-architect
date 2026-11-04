package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.LinkListBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.lib.models.LinkList;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
class LinkListRenderer implements LinkListBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;

    LinkListRenderer(Api api, Provider<AppConfig> provider, String str) {
        this.api = api;
        this.appConfigProvider = provider;
        this.conversationId = str;
    }

    private void addLinkToLayout(LinearLayout linearLayout, final Link link, int i10, final Context context, boolean z10) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        if (z10) {
            layoutParams.gravity = 17;
        }
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(i10);
        textView.setTextSize(16.0f);
        textView.setText(link.getTitle());
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(ScreenUtils.dpToPx(24.0f, context), ScreenUtils.dpToPx(16.0f, context), ScreenUtils.dpToPx(16.0f, context), ScreenUtils.dpToPx(16.0f, context));
        if (io.intercom.android.sdk.models.Link.HELP_CENTER_TYPE.equals(link.getLinkType())) {
            Drawable drawableL = androidx.core.content.d.l(context, R.drawable.intercom_open_help_center);
            drawableL.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableL, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(ScreenUtils.dpToPx(8.0f, context));
        }
        frameLayout.addView(textView);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.LinkListRenderer.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (io.intercom.android.sdk.models.Link.ARTICLE_TYPE.equals(link.getLinkType()) || io.intercom.android.sdk.models.Link.SUGGESTION_TYPE.equals(link.getLinkType())) {
                    Context context2 = context;
                    if (context2 instanceof Activity) {
                        context.startActivity(IntercomArticleActivity.buildIntent(context2, new IntercomArticleActivity.ArticleActivityArguments(link.getArticleId(), "conversation")));
                        return;
                    }
                }
                if (io.intercom.android.sdk.models.Link.HELP_CENTER_TYPE.equals(link.getLinkType())) {
                    Context context3 = context;
                    if (context3 instanceof Activity) {
                        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context3, Collections.EMPTY_LIST, "conversation");
                        return;
                    }
                }
                LinkOpener.handleUrl(link.getUrl(), context, LinkListRenderer.this.api);
            }
        });
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        frameLayout.setBackgroundResource(typedValue.resourceId);
        linearLayout.addView(frameLayout);
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.LinkListBlock
    public View addLinkListBlock(LinkList linkList, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.intercom_card_list_block, viewGroup, false);
        int iPrimaryOrDarkColor = ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get());
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.card_links);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(new ColorDrawable(androidx.core.content.d.g(context, R.color.intercom_container_border)));
        linearLayout.setOrientation(1);
        Iterator<Link> it = linkList.getLinks().iterator();
        while (it.hasNext()) {
            addLinkToLayout(linearLayout, it.next(), iPrimaryOrDarkColor, context, false);
        }
        Link footerLink = linkList.getFooterLink();
        if (!footerLink.getText().isEmpty()) {
            addLinkToLayout(linearLayout, footerLink, iPrimaryOrDarkColor, context, true);
        }
        return frameLayout;
    }
}
