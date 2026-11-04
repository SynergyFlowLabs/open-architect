package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.app.h0;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Intent f48198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final Bundle f48200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final PendingIntent f48201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f48202g;

    public a(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        this(context, i10, intent, i11, null, z10);
    }

    @p0
    private PendingIntent a() {
        Bundle bundle = this.f48200e;
        return bundle == null ? h0.e(this.f48196a, this.f48197b, this.f48198c, this.f48199d, this.f48202g) : h0.d(this.f48196a, this.f48197b, this.f48198c, this.f48199d, bundle, this.f48202g);
    }

    @NonNull
    public Context b() {
        return this.f48196a;
    }

    public int c() {
        return this.f48199d;
    }

    @NonNull
    public Intent d() {
        return this.f48198c;
    }

    @NonNull
    public Bundle e() {
        return this.f48200e;
    }

    @p0
    public PendingIntent f() {
        return this.f48201f;
    }

    public int g() {
        return this.f48197b;
    }

    public boolean h() {
        return this.f48202g;
    }

    public a(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @p0 Bundle bundle, boolean z10) {
        this.f48196a = context;
        this.f48197b = i10;
        this.f48198c = intent;
        this.f48199d = i11;
        this.f48200e = bundle;
        this.f48202g = z10;
        this.f48201f = a();
    }
}
