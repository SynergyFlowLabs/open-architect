package com.google.android.gms.common.util;

import android.os.StrictMode;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(31)
final class g0 {
    @androidx.annotation.u
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
