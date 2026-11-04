package com.google.android.play.core.review;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    private c() {
    }

    @NonNull
    public static b a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new e(new j(context));
    }
}
