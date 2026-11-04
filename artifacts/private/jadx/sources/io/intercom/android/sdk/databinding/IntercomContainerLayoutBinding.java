package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomContainerLayoutBinding implements b {

    @NonNull
    public final LinearLayout cellLayout;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    private final FrameLayout rootView;

    private IntercomContainerLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.cellLayout = linearLayout;
        this.progressBar = progressBar;
    }

    @NonNull
    public static IntercomContainerLayoutBinding bind(@NonNull View view) {
        int i10 = R.id.cellLayout;
        LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) c.a(view, i10);
            if (progressBar != null) {
                return new IntercomContainerLayoutBinding((FrameLayout) view, linearLayout, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomContainerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomContainerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_container_layout, viewGroup, false);
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
