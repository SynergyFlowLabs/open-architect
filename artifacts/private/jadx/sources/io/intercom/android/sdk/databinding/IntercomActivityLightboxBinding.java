package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomActivityLightboxBinding implements b {

    @NonNull
    public final LightBoxImageView fullImage;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(@NonNull RelativeLayout relativeLayout, @NonNull LightBoxImageView lightBoxImageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    @NonNull
    public static IntercomActivityLightboxBinding bind(@NonNull View view) {
        int i10 = R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView) c.a(view, i10);
        if (lightBoxImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new IntercomActivityLightboxBinding(relativeLayout, lightBoxImageView, relativeLayout);
    }

    @NonNull
    public static IntercomActivityLightboxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityLightboxBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_lightbox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
