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
public final class IntercomNotificationPillBinding implements b {

    @NonNull
    public final TextView notificationPill;

    @NonNull
    private final TextView rootView;

    private IntercomNotificationPillBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    @NonNull
    public static IntercomNotificationPillBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new IntercomNotificationPillBinding(textView, textView);
    }

    @NonNull
    public static IntercomNotificationPillBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomNotificationPillBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, false);
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
