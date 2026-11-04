package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.moduleinstall.internal.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private b() {
    }

    @NonNull
    public static c a(@NonNull Activity activity) {
        return new a0(activity);
    }

    @NonNull
    public static c b(@NonNull Context context) {
        return new a0(context);
    }
}
