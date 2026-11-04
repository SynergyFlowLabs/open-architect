package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomMessengerCardBlockBinding implements b {

    @NonNull
    public final ProgressBar loadingView;

    @NonNull
    private final FrameLayout rootView;

    private IntercomMessengerCardBlockBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.loadingView = progressBar;
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding bind(@NonNull View view) {
        int i10 = R.id.loading_view;
        ProgressBar progressBar = (ProgressBar) c.a(view, i10);
        if (progressBar != null) {
            return new IntercomMessengerCardBlockBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_messenger_card_block, viewGroup, false);
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
