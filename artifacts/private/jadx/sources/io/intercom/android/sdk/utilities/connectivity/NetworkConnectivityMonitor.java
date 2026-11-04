package io.intercom.android.sdk.utilities.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.content.d;

/* JADX INFO: loaded from: classes13.dex */
public class NetworkConnectivityMonitor implements ConnectivityBroadcastReceiver.ConnectivityUpdateListener {

    @p0
    private ConnectivityEventListener listener;
    private NetworkState lastState = NetworkState.UNKNOWN;
    private boolean didRegister = false;
    private final ConnectivityBroadcastReceiver receiver = new ConnectivityBroadcastReceiver(this);

    public interface ConnectivityEventListener {
        void onDisconnect();

        void onReconnect();
    }

    @l1
    @p0
    ConnectivityEventListener getListener() {
        return this.listener;
    }

    @Override // io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver.ConnectivityUpdateListener
    public void onUpdate(NetworkState networkState) {
        NetworkState networkState2 = this.lastState;
        if (networkState == networkState2) {
            return;
        }
        ConnectivityEventListener connectivityEventListener = this.listener;
        if (connectivityEventListener != null) {
            NetworkState networkState3 = NetworkState.NOT_CONNECTED;
            if (networkState == networkState3) {
                connectivityEventListener.onDisconnect();
            } else if (networkState == NetworkState.CONNECTED && networkState2 == networkState3) {
                connectivityEventListener.onReconnect();
            }
        }
        this.lastState = networkState;
    }

    public void setListener(@p0 ConnectivityEventListener connectivityEventListener) {
        this.listener = connectivityEventListener;
    }

    public synchronized void startListening(Context context) {
        try {
            if (!this.didRegister) {
                int i10 = 0 << 4;
                d.w(context, this.receiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
                this.didRegister = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void stopListening(Context context) {
        try {
            if (this.didRegister) {
                context.unregisterReceiver(this.receiver);
                this.didRegister = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
