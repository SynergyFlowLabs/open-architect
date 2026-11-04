package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.AvatarUtils;

/* JADX INFO: loaded from: classes13.dex */
class ChatSnippet extends ChatNotification {
    private TextView contentBody;

    public ChatSnippet(Context context, Conversation conversation, int i10, int i11, InAppNotification.Listener listener, Provider<AppConfig> provider) {
        super(context, conversation, i10, i11, listener, provider);
    }

    private void setBodyText(Part part) {
        if (part.getSummary().isEmpty()) {
            this.contentBody.setText(this.localisedContext.getString(R.string.intercom_image_attached));
        } else if (part.getEventData().getCustomStatePrefix() == null || part.getEventData().getCustomStatePrefix().isEmpty()) {
            this.contentBody.setText(part.getSummary());
        } else {
            this.contentBody.setText(part.getEventData().getCustomStatePrefix());
        }
    }

    private void setupComposeNotification(ComposeView composeView) {
        InAppNotificationCardKt.addInappNotificationCardToView(composeView, this.conversation);
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
        TextView textView = (TextView) this.overlayRoot.findViewById(R.id.chathead_text_header);
        if (textView != null) {
            textView.setText(getHeaderText());
        }
        setBodyText(this.conversation.lastPart());
        ImageView imageView = (ImageView) this.overlayRoot.findViewById(R.id.chathead_avatar);
        if (imageView != null) {
            AvatarUtils.loadAvatarIntoView(this.conversation.lastAdmin().getAvatar(), imageView, this.appConfigProvider.get());
        }
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected View getContentContainer() {
        return this.overlayRoot.findViewById(R.id.chathead_text_body);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        this.contentBody = (TextView) viewGroup2.findViewById(R.id.chathead_text_body);
        return viewGroup2;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    void populateViewsWithData() {
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.chat_snippet_compose_view);
        if (ComposeCompatibilityUtilKt.hideForLegacyActivity(composeView)) {
            setupLegacyNotification();
        } else {
            setupComposeNotification(composeView);
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        View viewFindViewById = this.overlayRoot.findViewById(R.id.chathead_text_body);
        View viewFindViewById2 = this.overlayRoot.findViewById(R.id.chathead_text_container);
        viewFindViewById2.setPivotX(0.0f);
        performReplyPulse(viewFindViewById2, viewFindViewById, runnable);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    protected void updateContentContainer(Part part) {
        setBodyText(part);
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification, io.intercom.android.sdk.overlay.InAppNotification
    protected void updateViewDataDuringReplyPulse(int i10) {
        Part partLastPart = this.conversation.lastPart();
        ImageView imageView = (ImageView) this.overlayRoot.findViewById(R.id.chathead_avatar);
        AvatarUtils.loadAvatarIntoView(this.conversation.lastAdmin().getAvatar(), imageView, this.appConfigProvider.get());
        TextView textView = (TextView) this.overlayRoot.findViewById(R.id.chathead_text_header);
        textView.setText(getHeaderText());
        setBodyText(partLastPart);
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.ticket_header_compose_view);
        if (ComposeCompatibilityUtilKt.hideForLegacyActivity(composeView)) {
            textView.setVisibility(0);
        } else {
            InAppNotificationCardKt.addTicketHeaderToCompose(composeView, this.conversation);
            if (this.conversation.getTicket() != null) {
                textView.setVisibility(8);
                composeView.setVisibility(0);
            } else {
                textView.setVisibility(0);
                composeView.setVisibility(8);
            }
        }
        ComposeView composeView2 = (ComposeView) this.overlayRoot.findViewById(R.id.chathead_avatar_compose_view);
        if (ComposeCompatibilityUtilKt.hideForLegacyActivity(composeView2)) {
            imageView.setVisibility(0);
            return;
        }
        ComposeCompatibilityUtilKt.addAvatarIconToCompose(composeView2, partLastPart.getParticipant(), this.appConfigProvider.get());
        imageView.setVisibility(8);
        composeView2.setVisibility(0);
    }
}
