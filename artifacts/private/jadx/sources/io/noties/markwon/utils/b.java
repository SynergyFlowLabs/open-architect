package io.noties.markwon.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f298607a;

    public b(float f10) {
        this.f298607a = f10;
    }

    @NonNull
    public static b a(float f10) {
        return new b(f10);
    }

    @NonNull
    public static b b(@NonNull Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int c(int i10) {
        return (int) ((i10 * this.f298607a) + 0.5f);
    }
}
