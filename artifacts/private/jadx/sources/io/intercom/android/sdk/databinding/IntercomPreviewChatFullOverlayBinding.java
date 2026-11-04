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
public final class IntercomPreviewChatFullOverlayBinding implements b {

    @NonNull
    public final FrameLayout chatAvatarContainer;

    @NonNull
    public final FrameLayout chatFullBody;

    @NonNull
    public final ComposeView chatFullComposeView;

    @NonNull
    public final View chatOverlayOverflowFade;

    @NonNull
    public final ImageView chatheadAvatar;

    @NonNull
    public final ComposeView chatheadAvatarComposeView;

    @NonNull
    public final FrameLayout chatheadRoot;

    @NonNull
    public final LinearLayout chatheadTextContainer;

    @NonNull
    public final TextView chatheadTextHeader;

    @NonNull
    public final FrameLayout parentCard;

    @NonNull
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ComposeView composeView, @NonNull View view, @NonNull ImageView imageView, @NonNull ComposeView composeView2, @NonNull FrameLayout frameLayout4, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout5) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatFullComposeView = composeView;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = frameLayout5;
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding bind(@NonNull View view) {
        View viewA;
        int i10 = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) c.a(view, i10);
            if (frameLayout2 != null) {
                i10 = R.id.chat_full_compose_view;
                ComposeView composeView = (ComposeView) c.a(view, i10);
                if (composeView != null && (viewA = c.a(view, (i10 = R.id.chat_overlay_overflow_fade))) != null) {
                    i10 = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) c.a(view, i10);
                    if (imageView != null) {
                        i10 = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) c.a(view, i10);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i10 = R.id.chathead_text_container;
                            LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
                            if (linearLayout != null) {
                                i10 = R.id.chathead_text_header;
                                TextView textView = (TextView) c.a(view, i10);
                                if (textView != null) {
                                    i10 = R.id.parent_card;
                                    FrameLayout frameLayout4 = (FrameLayout) c.a(view, i10);
                                    if (frameLayout4 != null) {
                                        return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, viewA, imageView, composeView2, frameLayout3, linearLayout, textView, frameLayout4);
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
    public static IntercomPreviewChatFullOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
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
