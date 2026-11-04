package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomActivityPostBinding implements b {

    @NonNull
    public final LinearLayout appBarLayout;

    @NonNull
    public final FrameLayout conversationCoordinator;

    @NonNull
    public final IntercomToolbar intercomToolbar;

    @NonNull
    public final FrameLayout postContainer;

    @NonNull
    public final View postTouchTarget;

    @NonNull
    public final ContentAwareScrollView postView;

    @NonNull
    public final ReactionInputView reactionInputView;

    @NonNull
    private final RelativeLayout rootView;

    private IntercomActivityPostBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView, @NonNull ReactionInputView reactionInputView) {
        this.rootView = relativeLayout;
        this.appBarLayout = linearLayout;
        this.conversationCoordinator = frameLayout;
        this.intercomToolbar = intercomToolbar;
        this.postContainer = frameLayout2;
        this.postTouchTarget = view;
        this.postView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @NonNull
    public static IntercomActivityPostBinding bind(@NonNull View view) {
        View viewA;
        int i10 = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.conversation_coordinator;
            FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.intercom_toolbar;
                IntercomToolbar intercomToolbar = (IntercomToolbar) c.a(view, i10);
                if (intercomToolbar != null) {
                    i10 = R.id.post_container;
                    FrameLayout frameLayout2 = (FrameLayout) c.a(view, i10);
                    if (frameLayout2 != null && (viewA = c.a(view, (i10 = R.id.post_touch_target))) != null) {
                        i10 = R.id.post_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) c.a(view, i10);
                        if (contentAwareScrollView != null) {
                            i10 = R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) c.a(view, i10);
                            if (reactionInputView != null) {
                                return new IntercomActivityPostBinding((RelativeLayout) view, linearLayout, frameLayout, intercomToolbar, frameLayout2, viewA, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomActivityPostBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityPostBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_post, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
