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
import io.intercom.android.sdk.views.ContentAwareScrollView;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomFragmentCarouselScreenBinding implements b {

    @NonNull
    public final LinearLayout intercomCarouselActionLayout;

    @NonNull
    public final FrameLayout intercomCarouselContentContainer;

    @NonNull
    public final LinearLayout intercomCarouselFragmentRoot;

    @NonNull
    public final View intercomCarouselGradient;

    @NonNull
    public final ContentAwareScrollView intercomCarouselScrollView;

    @NonNull
    private final LinearLayout rootView;

    private IntercomFragmentCarouselScreenBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView) {
        this.rootView = linearLayout;
        this.intercomCarouselActionLayout = linearLayout2;
        this.intercomCarouselContentContainer = frameLayout;
        this.intercomCarouselFragmentRoot = linearLayout3;
        this.intercomCarouselGradient = view;
        this.intercomCarouselScrollView = contentAwareScrollView;
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding bind(@NonNull View view) {
        int i10 = R.id.intercom_carousel_action_layout;
        LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.intercom_carousel_content_container;
            FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
            if (frameLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i10 = R.id.intercom_carousel_gradient;
                View viewA = c.a(view, i10);
                if (viewA != null) {
                    i10 = R.id.intercom_carousel_scroll_view;
                    ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) c.a(view, i10);
                    if (contentAwareScrollView != null) {
                        return new IntercomFragmentCarouselScreenBinding(linearLayout2, linearLayout, frameLayout, linearLayout2, viewA, contentAwareScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
