package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomBlocksUserLayoutBinding implements b {

    @NonNull
    private final LinearLayout rootView;

    private IntercomBlocksUserLayoutBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static IntercomBlocksUserLayoutBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomBlocksUserLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomBlocksUserLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomBlocksUserLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_blocks_user_layout, viewGroup, false);
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
