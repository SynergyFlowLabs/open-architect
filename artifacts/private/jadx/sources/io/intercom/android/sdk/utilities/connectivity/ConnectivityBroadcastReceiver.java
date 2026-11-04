package io.intercom.android.sdk.utilities.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes13.dex */
class ConnectivityBroadcastReceiver extends BroadcastReceiver {
    private final ConnectivityUpdateListener connectivityUpdateListener;

    interface ConnectivityUpdateListener {
        void onUpdate(NetworkState networkState);
    }

    ConnectivityBroadcastReceiver(ConnectivityUpdateListener connectivityUpdateListener) {
        this.connectivityUpdateListener = connectivityUpdateListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@p0 Context context, @p0 Intent intent) {
        if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        this.connectivityUpdateListener.onUpdate(intent.getBooleanExtra("noConnectivity", false) ? NetworkState.NOT_CONNECTED : NetworkState.CONNECTED);
    }
}
