package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.motion.widget.MotionLayout;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.views.GrayscaleImageView;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomViewHelpCenterReactionBinding implements b {

    @NonNull
    public final GrayscaleImageView intercomReactionHappy;

    @NonNull
    public final GrayscaleImageView intercomReactionNeutral;

    @NonNull
    public final GrayscaleImageView intercomReactionSad;

    @NonNull
    public final TextView intercomReactionTitle;

    @NonNull
    public final MotionLayout motionLayout;

    @NonNull
    private final MotionLayout rootView;

    private IntercomViewHelpCenterReactionBinding(@NonNull MotionLayout motionLayout, @NonNull GrayscaleImageView grayscaleImageView, @NonNull GrayscaleImageView grayscaleImageView2, @NonNull GrayscaleImageView grayscaleImageView3, @NonNull TextView textView, @NonNull MotionLayout motionLayout2) {
        this.rootView = motionLayout;
        this.intercomReactionHappy = grayscaleImageView;
        this.intercomReactionNeutral = grayscaleImageView2;
        this.intercomReactionSad = grayscaleImageView3;
        this.intercomReactionTitle = textView;
        this.motionLayout = motionLayout2;
    }

    @NonNull
    public static IntercomViewHelpCenterReactionBinding bind(@NonNull View view) {
        int i10 = R.id.intercom_reaction_happy;
        GrayscaleImageView grayscaleImageView = (GrayscaleImageView) c.a(view, i10);
        if (grayscaleImageView != null) {
            i10 = R.id.intercom_reaction_neutral;
            GrayscaleImageView grayscaleImageView2 = (GrayscaleImageView) c.a(view, i10);
            if (grayscaleImageView2 != null) {
                i10 = R.id.intercom_reaction_sad;
                GrayscaleImageView grayscaleImageView3 = (GrayscaleImageView) c.a(view, i10);
                if (grayscaleImageView3 != null) {
                    i10 = R.id.intercom_reaction_title;
                    TextView textView = (TextView) c.a(view, i10);
                    if (textView != null) {
                        MotionLayout motionLayout = (MotionLayout) view;
                        return new IntercomViewHelpCenterReactionBinding(motionLayout, grayscaleImageView, grayscaleImageView2, grayscaleImageView3, textView, motionLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomViewHelpCenterReactionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomViewHelpCenterReactionBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_view_help_center_reaction, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public MotionLayout getRoot() {
        return this.rootView;
    }
}
