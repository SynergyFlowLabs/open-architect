package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.compose.ui.platform.ComposeView;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomPreviewChatSnippetOverlayBinding implements b {

    @NonNull
    public final FrameLayout chatAvatarContainer;

    @NonNull
    public final FrameLayout chatFullBody;

    @NonNull
    public final ComposeView chatSnippetComposeView;

    @NonNull
    public final ImageView chatheadAvatar;

    @NonNull
    public final ComposeView chatheadAvatarComposeView;

    @NonNull
    public final FrameLayout chatheadRoot;

    @NonNull
    public final TextView chatheadTextBody;

    @NonNull
    public final LinearLayout chatheadTextContainer;

    @NonNull
    public final TextView chatheadTextHeader;

    @NonNull
    public final FrameLayout parentCard;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ComposeView composeView, @NonNull ImageView imageView, @NonNull ComposeView composeView2, @NonNull FrameLayout frameLayout4, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull FrameLayout frameLayout5, @NonNull ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatSnippetComposeView = composeView;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.parentCard = frameLayout5;
        this.ticketHeaderComposeView = composeView3;
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding bind(@NonNull View view) {
        int i10 = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) c.a(view, i10);
            if (frameLayout2 != null) {
                i10 = R.id.chat_snippet_compose_view;
                ComposeView composeView = (ComposeView) c.a(view, i10);
                if (composeView != null) {
                    i10 = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) c.a(view, i10);
                    if (imageView != null) {
                        i10 = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) c.a(view, i10);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i10 = R.id.chathead_text_body;
                            TextView textView = (TextView) c.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.chathead_text_container;
                                LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.chathead_text_header;
                                    TextView textView2 = (TextView) c.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = R.id.parent_card;
                                        FrameLayout frameLayout4 = (FrameLayout) c.a(view, i10);
                                        if (frameLayout4 != null) {
                                            i10 = R.id.ticket_header_compose_view;
                                            ComposeView composeView3 = (ComposeView) c.a(view, i10);
                                            if (composeView3 != null) {
                                                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, imageView, composeView2, frameLayout3, textView, linearLayout, textView2, frameLayout4, composeView3);
                                            }
                                        }
                                    }
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
    public static IntercomPreviewChatSnippetOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
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
