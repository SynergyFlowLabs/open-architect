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
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomActivitySheetBinding implements b {

    @NonNull
    public final IntercomToolbar intercomToolbar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sheetRoot;

    @NonNull
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(@NonNull LinearLayout linearLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    @NonNull
    public static IntercomActivitySheetBinding bind(@NonNull View view) {
        int i10 = R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar = (IntercomToolbar) c.a(view, i10);
        if (intercomToolbar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i11 = R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout) c.a(view, i11);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar, linearLayout, frameLayout);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomActivitySheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivitySheetBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_sheet, viewGroup, false);
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
