package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomToolbarBinding implements b {

    @NonNull
    public final FrameLayout intercomLeftItemLayout;

    @NonNull
    public final ImageView intercomToolbarAvatar;

    @NonNull
    public final View intercomToolbarAvatarActiveState;

    @NonNull
    public final ImageButton intercomToolbarClose;

    @NonNull
    public final View intercomToolbarDivider;

    @NonNull
    public final ImageButton intercomToolbarInbox;

    @NonNull
    public final TextView intercomToolbarSubtitle;

    @NonNull
    public final TextView intercomToolbarTitle;

    @NonNull
    public final LinearLayout intercomToolbarTitleContainer;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RelativeLayout toolbarContentContainer;

    @NonNull
    public final ProgressBar toolbarProgressBar;

    @NonNull
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageButton imageButton, @NonNull View view2, @NonNull ImageButton imageButton2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    @NonNull
    public static IntercomToolbarBinding bind(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.intercom_toolbar_avatar;
            ImageView imageView = (ImageView) c.a(view, i10);
            if (imageView != null && (viewA = c.a(view, (i10 = R.id.intercom_toolbar_avatar_active_state))) != null) {
                i10 = R.id.intercom_toolbar_close;
                ImageButton imageButton = (ImageButton) c.a(view, i10);
                if (imageButton != null && (viewA2 = c.a(view, (i10 = R.id.intercom_toolbar_divider))) != null) {
                    i10 = R.id.intercom_toolbar_inbox;
                    ImageButton imageButton2 = (ImageButton) c.a(view, i10);
                    if (imageButton2 != null) {
                        i10 = R.id.intercom_toolbar_subtitle;
                        TextView textView = (TextView) c.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.intercom_toolbar_title;
                            TextView textView2 = (TextView) c.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.intercom_toolbar_title_container;
                                LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.toolbar_content_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) c.a(view, i10);
                                    if (relativeLayout != null) {
                                        i10 = R.id.toolbar_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) c.a(view, i10);
                                        if (progressBar != null) {
                                            i10 = R.id.wallpaper_image;
                                            ImageView imageView2 = (ImageView) c.a(view, i10);
                                            if (imageView2 != null) {
                                                return new IntercomToolbarBinding((FrameLayout) view, frameLayout, imageView, viewA, imageButton, viewA2, imageButton2, textView, textView2, linearLayout, relativeLayout, progressBar, imageView2);
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
    public static IntercomToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_toolbar, viewGroup, false);
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
