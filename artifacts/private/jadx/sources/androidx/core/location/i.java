package androidx.core.location;

import android.location.LocationManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f47937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j.C0393j f47938b;

    public /* synthetic */ i(LocationManager locationManager, j.C0393j c0393j) {
        this.f47937a = locationManager;
        this.f47938b = c0393j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.f47937a.addGpsStatusListener(this.f47938b));
    }
}
