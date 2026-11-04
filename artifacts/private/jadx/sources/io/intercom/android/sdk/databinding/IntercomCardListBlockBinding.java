package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomCardListBlockBinding implements b {

    @NonNull
    public final LinearLayout cardLinks;

    @NonNull
    private final FrameLayout rootView;

    private IntercomCardListBlockBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.cardLinks = linearLayout;
    }

    @NonNull
    public static IntercomCardListBlockBinding bind(@NonNull View view) {
        int i10 = R.id.card_links;
        LinearLayout linearLayout = (LinearLayout) c.a(view, i10);
        if (linearLayout != null) {
            return new IntercomCardListBlockBinding((FrameLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomCardListBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomCardListBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_card_list_block, viewGroup, false);
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
