package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.compose.ui.platform.ComposeView;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomPreviewNotificationBinding implements b {

    @NonNull
    public final ComposeView chatSnippetComposeView;

    @NonNull
    public final TextView inAppNotificationMessageSummary;

    @NonNull
    public final FrameLayout notificationRoot;

    @NonNull
    public final FrameLayout parentCard;

    @NonNull
    public final ImageView previewAvatar;

    @NonNull
    public final ComposeView previewAvatarComposeView;

    @NonNull
    public final TextView replyFromTextview;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewNotificationBinding(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView, @NonNull ComposeView composeView2, @NonNull TextView textView2, @NonNull ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatSnippetComposeView = composeView;
        this.inAppNotificationMessageSummary = textView;
        this.notificationRoot = frameLayout2;
        this.parentCard = frameLayout3;
        this.previewAvatar = imageView;
        this.previewAvatarComposeView = composeView2;
        this.replyFromTextview = textView2;
        this.ticketHeaderComposeView = composeView3;
    }

    @NonNull
    public static IntercomPreviewNotificationBinding bind(@NonNull View view) {
        int i10 = R.id.chat_snippet_compose_view;
        ComposeView composeView = (ComposeView) c.a(view, i10);
        if (composeView != null) {
            i10 = R.id.in_app_notification_message_summary;
            TextView textView = (TextView) c.a(view, i10);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i10 = R.id.parent_card;
                FrameLayout frameLayout2 = (FrameLayout) c.a(view, i10);
                if (frameLayout2 != null) {
                    i10 = R.id.preview_avatar;
                    ImageView imageView = (ImageView) c.a(view, i10);
                    if (imageView != null) {
                        i10 = R.id.preview_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) c.a(view, i10);
                        if (composeView2 != null) {
                            i10 = R.id.reply_from_textview;
                            TextView textView2 = (TextView) c.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.ticket_header_compose_view;
                                ComposeView composeView3 = (ComposeView) c.a(view, i10);
                                if (composeView3 != null) {
                                    return new IntercomPreviewNotificationBinding(frameLayout, composeView, textView, frameLayout, frameLayout2, imageView, composeView2, textView2, composeView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomPreviewNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomPreviewNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_notification, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
