package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a0 {
    private a0() {
    }

    @g6.a
    @Deprecated
    public static void a(@NonNull Context context, @NonNull SharedPreferences.Editor editor, @NonNull String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
