package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomCarouselActionButtonTickBinding implements b {

    @NonNull
    private final ImageView rootView;

    private IntercomCarouselActionButtonTickBinding(@NonNull ImageView imageView) {
        this.rootView = imageView;
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonTickBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button_tick, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
