package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomDefaultLauncherBinding implements b {

    @NonNull
    public final TextView launcherBadgeCount;

    @NonNull
    public final ImageButton launcherIcon;

    @NonNull
    public final FrameLayout launcherRoot;

    @NonNull
    private final FrameLayout rootView;

    private IntercomDefaultLauncherBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.launcherBadgeCount = textView;
        this.launcherIcon = imageButton;
        this.launcherRoot = frameLayout2;
    }

    @NonNull
    public static IntercomDefaultLauncherBinding bind(@NonNull View view) {
        int i10 = R.id.launcher_badge_count;
        TextView textView = (TextView) c.a(view, i10);
        if (textView != null) {
            i10 = R.id.launcher_icon;
            ImageButton imageButton = (ImageButton) c.a(view, i10);
            if (imageButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new IntercomDefaultLauncherBinding(frameLayout, textView, imageButton, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomDefaultLauncherBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomDefaultLauncherBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_default_launcher, viewGroup, false);
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
