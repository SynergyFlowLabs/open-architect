package com.superwall.sdk.paywall.view;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ActivityEncapsulatable {
    @Nullable
    WeakReference<Activity> getEncapsulatingActivity();

    void setEncapsulatingActivity(@Nullable WeakReference<Activity> weakReference);
}
