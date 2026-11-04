package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomActivityCarouselBinding implements b {

    @NonNull
    public final ConstraintLayout intercomCarouselCloseContainer;

    @NonNull
    public final ConstraintLayout intercomCarouselRoot;

    @NonNull
    public final ImageButton intercomClose;

    @NonNull
    public final View intercomCloseBackground;

    @NonNull
    public final LinearLayout intercomPageNavigationLayout;

    @NonNull
    public final FrameLayout intercomStateContainer;

    @NonNull
    public final ViewPager intercomViewPager;

    @NonNull
    private final ConstraintLayout rootView;

    private IntercomActivityCarouselBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageButton imageButton, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.intercomCarouselCloseContainer = constraintLayout2;
        this.intercomCarouselRoot = constraintLayout3;
        this.intercomClose = imageButton;
        this.intercomCloseBackground = view;
        this.intercomPageNavigationLayout = linearLayout;
        this.intercomStateContainer = frameLayout;
        this.intercomViewPager = viewPager;
    }

    @NonNull
    public static IntercomActivityCarouselBinding bind(@NonNull View view) {
        View viewA;
        int i10 = R.id.intercom_carousel_close_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) c.a(view, i10);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i10 = R.id.intercom_close;
            ImageButton imageButton = (ImageButton) c.a(view, i10);
            if (imageButton != null && (viewA = c.a(view, (i10 = R.id.intercom_close_background))) != null) {
                i10 = R.id.intercom_page_navigation_layout;
                LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.intercom_state_container;
                    FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
                    if (frameLayout != null) {
                        i10 = R.id.intercom_view_pager;
                        ViewPager viewPager = (ViewPager) c.a(view, i10);
                        if (viewPager != null) {
                            return new IntercomActivityCarouselBinding(constraintLayout2, constraintLayout, constraintLayout2, imageButton, viewA, linearLayout, frameLayout, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomActivityCarouselBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityCarouselBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_carousel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
