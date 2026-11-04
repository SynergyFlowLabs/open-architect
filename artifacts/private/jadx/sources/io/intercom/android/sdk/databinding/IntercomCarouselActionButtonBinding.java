package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomCarouselActionButtonBinding implements b {

    @NonNull
    private final TextView rootView;

    private IntercomCarouselActionButtonBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
