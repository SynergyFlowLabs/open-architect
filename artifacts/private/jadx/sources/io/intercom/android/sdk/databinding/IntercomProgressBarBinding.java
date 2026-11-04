package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomProgressBarBinding implements b {

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    private final ProgressBar rootView;

    private IntercomProgressBarBinding(@NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.progressBar = progressBar2;
    }

    @NonNull
    public static IntercomProgressBarBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgressBar progressBar = (ProgressBar) view;
        return new IntercomProgressBarBinding(progressBar, progressBar);
    }

    @NonNull
    public static IntercomProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_progress_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public ProgressBar getRoot() {
        return this.rootView;
    }
}
