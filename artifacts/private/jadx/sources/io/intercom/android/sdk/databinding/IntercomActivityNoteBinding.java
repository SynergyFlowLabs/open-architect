package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomActivityNoteBinding implements b {

    @NonNull
    public final LinearLayout appBarLayout;

    @NonNull
    public final IntercomToolbar intercomToolbar;

    @NonNull
    public final FrameLayout noteComposerContainer;

    @NonNull
    public final LinearLayout noteLayout;

    @NonNull
    public final View noteTouchTarget;

    @NonNull
    public final ContentAwareScrollView noteView;

    @NonNull
    public final ReactionInputView reactionInputView;

    @NonNull
    private final FrameLayout rootView;

    private IntercomActivityNoteBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView, @NonNull ReactionInputView reactionInputView) {
        this.rootView = frameLayout;
        this.appBarLayout = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.noteComposerContainer = frameLayout2;
        this.noteLayout = linearLayout2;
        this.noteTouchTarget = view;
        this.noteView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @NonNull
    public static IntercomActivityNoteBinding bind(@NonNull View view) {
        View viewA;
        int i10 = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.intercom_toolbar;
            IntercomToolbar intercomToolbar = (IntercomToolbar) c.a(view, i10);
            if (intercomToolbar != null) {
                i10 = R.id.note_composer_container;
                FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
                if (frameLayout != null) {
                    i10 = R.id.note_layout;
                    LinearLayout linearLayout2 = (LinearLayout) c.a(view, i10);
                    if (linearLayout2 != null && (viewA = c.a(view, (i10 = R.id.note_touch_target))) != null) {
                        i10 = R.id.note_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) c.a(view, i10);
                        if (contentAwareScrollView != null) {
                            i10 = R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) c.a(view, i10);
                            if (reactionInputView != null) {
                                return new IntercomActivityNoteBinding((FrameLayout) view, linearLayout, intercomToolbar, frameLayout, linearLayout2, viewA, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomActivityNoteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityNoteBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_note, viewGroup, false);
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
