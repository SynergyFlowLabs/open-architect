package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.work.impl.r0;
import androidx.work.impl.utils.r;
import androidx.work.v;

/* JADX INFO: loaded from: classes3.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f76645a = v.i("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f76646b = "androidx.work.impl.background.systemalarm.UpdateProxies";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f76647c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f76648d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f76649e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f76650f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f76651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f76652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f76653c;

        a(final Intent val$intent, final Context val$context, final BroadcastReceiver.PendingResult val$pendingResult) {
            this.f76651a = val$intent;
            this.f76652b = val$context;
            this.f76653c = val$pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f76651a.getBooleanExtra(ConstraintProxyUpdateReceiver.f76647c, false);
                boolean booleanExtra2 = this.f76651a.getBooleanExtra(ConstraintProxyUpdateReceiver.f76648d, false);
                boolean booleanExtra3 = this.f76651a.getBooleanExtra(ConstraintProxyUpdateReceiver.f76649e, false);
                boolean booleanExtra4 = this.f76651a.getBooleanExtra(ConstraintProxyUpdateReceiver.f76650f, false);
                v.e().a(ConstraintProxyUpdateReceiver.f76645a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                r.e(this.f76652b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                r.e(this.f76652b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                r.e(this.f76652b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                r.e(this.f76652b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f76653c.finish();
            }
        }
    }

    @NonNull
    public static Intent a(@NonNull Context context, boolean batteryNotLowProxyEnabled, boolean batteryChargingProxyEnabled, boolean storageNotLowProxyEnabled, boolean networkStateProxyEnabled) {
        Intent intent = new Intent(f76646b);
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra(f76647c, batteryNotLowProxyEnabled).putExtra(f76648d, batteryChargingProxyEnabled).putExtra(f76649e, storageNotLowProxyEnabled).putExtra(f76650f, networkStateProxyEnabled);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull final Context context, @p0 final Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (f76646b.equals(action)) {
            r0.M(context).U().b(new a(intent, context, goAsync()));
            return;
        }
        v.e().a(f76645a, "Ignoring unknown action " + action);
    }
}
