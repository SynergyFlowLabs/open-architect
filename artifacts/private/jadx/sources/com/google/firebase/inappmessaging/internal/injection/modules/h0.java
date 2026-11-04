package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.y2;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f122767a = "fiam_eligible_campaigns_cache_file";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f122768b = "fiam_impressions_store_file";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f122769c = "rate_limit_store_file";

    @q8.e
    @w8.d
    @ij.f
    public y2 a(Application application) {
        return new y2(application, f122767a);
    }

    @q8.e
    @ij.f
    @w8.e
    public y2 b(Application application) {
        return new y2(application, f122768b);
    }

    @q8.e
    @w8.g
    @ij.f
    public y2 c(Application application) {
        return new y2(application, f122769c);
    }
}
