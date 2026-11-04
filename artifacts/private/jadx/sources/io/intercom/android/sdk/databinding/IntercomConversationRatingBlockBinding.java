package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomConversationRatingBlockBinding implements b {

    @NonNull
    public final LinearLayout intercomRatingOptionsLayout;

    @NonNull
    public final IntercomPrimaryButton intercomRatingTellUsMoreButton;

    @NonNull
    public final ImageView intercomYouRatedImageView;

    @NonNull
    public final LinearLayout intercomYouRatedLayout;

    @NonNull
    public final TextView rateYourConversationTextView;

    @NonNull
    private final LinearLayout rootView;

    private IntercomConversationRatingBlockBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull IntercomPrimaryButton intercomPrimaryButton, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.intercomRatingOptionsLayout = linearLayout2;
        this.intercomRatingTellUsMoreButton = intercomPrimaryButton;
        this.intercomYouRatedImageView = imageView;
        this.intercomYouRatedLayout = linearLayout3;
        this.rateYourConversationTextView = textView;
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding bind(@NonNull View view) {
        int i10 = R.id.intercom_rating_options_layout;
        LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.intercom_rating_tell_us_more_button;
            IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) c.a(view, i10);
            if (intercomPrimaryButton != null) {
                i10 = R.id.intercom_you_rated_image_view;
                ImageView imageView = (ImageView) c.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.intercom_you_rated_layout;
                    LinearLayout linearLayout2 = (LinearLayout) c.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = R.id.rate_your_conversation_text_view;
                        TextView textView = (TextView) c.a(view, i10);
                        if (textView != null) {
                            return new IntercomConversationRatingBlockBinding((LinearLayout) view, linearLayout, intercomPrimaryButton, imageView, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
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
