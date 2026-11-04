package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.ButtonClickListener;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.AvatarUtils;

/* JADX INFO: loaded from: classes13.dex */
class ChatFull extends ChatNotification {
    private final MetricTracker metricTracker;

    private static class ChatFullButtonClickListener implements ButtonClickListener {
        private ChatFullButtonClickListener() {
        }

        @Override // io.intercom.android.sdk.blocks.ButtonClickListener
        public void onButtonClicked(View view, String str) {
        }

        @Override // io.intercom.android.sdk.blocks.ButtonClickListener
        public boolean shouldHandleClicks() {
            return false;
        }
    }

    private static class ChatFullImageClickListener implements ImageClickListener {
        private ChatFullImageClickListener() {
        }

        @Override // io.intercom.android.sdk.blocks.ImageClickListener
        public void onImageClicked(String str, String str2, View view, int i10, int i11) {
        }
    }

    ChatFull(Context context, Conversation conversation, int i10, int i11, InAppNotification.Listener listener, MetricTracker metricTracker, Provider<AppConfig> provider) {
        super(context, conversation, i10, i11, listener, provider);
        this.metricTracker = metricTracker;
    }

    private void setupComposeNotification(ComposeView composeView) {
        ChatFullNotificationKt.addChatFullNotificationToView(composeView, this.conversation, this.appConfigProvider.get());
        composeView.setVisibility(0);
        FrameLayout frameLayout = (FrameLayout) this.overlayRoot.findViewById(R.id.parent_card);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    private void setupLegacyNotification() {
        FrameLayout frameLayout = (FrameLayout) this.overlayRoot.findViewById(R.id.parent_card);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        Blocks blocks = new Blocks(this.localisedContext, LumberMill.getBlocksTwig());
        Injector injector = Injector.get();
        Api api = injector.getApi();
        LinearLayout linearLayoutCreateBlocks = blocks.createBlocks(this.conversation.lastPart().getBlocks(), new ViewHolderGenerator(new UploadingImageCache(), api, this.appConfigProvider, this.conversation.getId(), new ChatFullImageClickListener(), new ChatFullButtonClickListener(), injector.getGson(), this.metricTracker).getChatFullHolder());
        final ViewGroup viewGroup = (ViewGroup) this.overlayRoot.findViewById(R.id.chathead_text_container);
        viewGroup.addView(linearLayoutCreateBlocks);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: io.intercom.android.sdk.overlay.ChatFull.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                int measuredHeight = viewGroup.getMeasuredHeight();
                int i10 = ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin;
                Resources resources = ChatFull.this.localisedContext.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_chat_full_top_margin);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding);
                ChatFull chatFull = ChatFull.this;
                if (measuredHeight < ((chatFull.screenHeight - dimensionPixelSize) - i10) - dimensionPixelSize2) {
                    return true;
                }
                chatFull.overlayRoot.findViewById(R.id.chat_overlay_overflow_fade).setVisibility(0);
                return false;
            }
        });
        TextView textView = (TextView) this.overlayRoot.findViewById(R.id.chathead_text_header);
        if (textView != null) {
            textView.setText(getHeaderText());
        }
        ImageView imageView = (ImageView) this.overlayRoot.findViewById(R.id.chathead_avatar);
        if (imageView != null) {
            AvatarUtils.loadAvatarIntoView(this.conversation.lastAdmin().getAvatar(), imageView, this.appConfigProvider.get());
        }
        api.markConversationAsRead(this.conversation.getId());
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected View getContentContainer() {
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.chat_full_compose_view);
        return (composeView == null || composeView.getVisibility() != 0) ? ((ViewGroup) this.overlayRoot.findViewById(R.id.chathead_text_container)).getChildAt(0) : composeView;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        this.metricTracker.viewedInApp(this.conversation.getId(), this.conversation.lastPart().getId(), 1);
        return viewGroup2;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    void populateViewsWithData() {
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.chat_full_compose_view);
        if (ComposeCompatibilityUtilKt.hideForLegacyActivity(composeView)) {
            setupLegacyNotification();
        } else {
            setupComposeNotification(composeView);
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        runnable.run();
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected void updateContentContainer(Part part) {
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification, io.intercom.android.sdk.overlay.InAppNotification
    protected void updateViewDataDuringReplyPulse(int i10) {
    }
}
