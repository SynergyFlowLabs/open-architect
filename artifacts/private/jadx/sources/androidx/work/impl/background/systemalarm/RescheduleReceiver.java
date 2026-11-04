package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.r0;
import androidx.work.v;

/* JADX INFO: loaded from: classes3.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f76655a = v.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        v.e().a(f76655a, "Received intent " + intent);
        try {
            r0.M(context).Y(goAsync());
        } catch (IllegalStateException e10) {
            v.e().d(f76655a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
