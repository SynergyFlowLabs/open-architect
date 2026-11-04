package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public abstract class b extends g2.a {
    @g6.a
    public static boolean d(@NonNull Context context, @p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return g2.a.b(intent);
    }
}
