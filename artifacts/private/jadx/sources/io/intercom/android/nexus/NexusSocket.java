package io.intercom.android.nexus;

import androidx.annotation.p0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.j0;
import okhttp3.k0;
import okio.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class NexusSocket {
    private static final j0 CLOSED_SOCKET = new j0() { // from class: io.intercom.android.nexus.NexusSocket.4
        @Override // okhttp3.j0
        public void cancel() {
        }

        @Override // okhttp3.j0
        public boolean close(int i10, String str) {
            return false;
        }

        @Override // okhttp3.j0
        public long queueSize() {
            return 0L;
        }

        @Override // okhttp3.j0
        public d0 request() {
            throw new NullPointerException("ClosedSocket has no request");
        }

        @Override // okhttp3.j0
        public boolean send(String str) {
            return false;
        }

        @Override // okhttp3.j0
        public boolean send(o oVar) {
            return false;
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.1.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;
    private final b0 client;
    private final long connectionTimeoutSeconds;
    private final NexusListener listener;

    @p0
    private ScheduledFuture reconnectFuture;
    private final boolean shouldSendPing;
    private final ScheduledExecutorService timeoutExecutor;

    @p0
    private ScheduledFuture timeoutFuture;
    private final NexusTopicProvider topicProvider;
    private final Twig twig;
    private final String url;
    private j0 socket = CLOSED_SOCKET;
    private final Runnable timeoutRunnable = new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.1
        @Override // java.lang.Runnable
        public void run() {
            NexusSocket.this.timedOut();
        }
    };
    private long lastReconnectAt = 0;
    private int reconnectAttempts = 0;
    private final k0 webSocketListener = new k0() { // from class: io.intercom.android.nexus.NexusSocket.3
        private void parseJsonString(String str) {
            if (!str.isEmpty() && !str.equals(" ") && !str.endsWith("|")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("eventName");
                    if (!strOptString.isEmpty() && !strOptString.equals("ACK")) {
                        NexusSocket.this.twig.internal("onMessage TEXT: " + str);
                        NexusSocket.this.listener.notifyEvent(new NexusEvent(jSONObject));
                        return;
                    }
                    NexusSocket.this.twig.internal("onMessage ACK: " + str);
                } catch (JSONException e10) {
                    NexusSocket.this.twig.internal("onMessage: json parse exception for message: '" + str + " " + e10);
                }
            }
        }

        @Override // okhttp3.k0
        public void onClosed(j0 j0Var, int i10, String str) {
            if (i10 != NexusSocket.OK_CLIENT_DISCONNECT) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            NexusSocket.this.twig.internal("onClose code: " + i10 + " reason: " + str);
        }

        @Override // okhttp3.k0
        public void onClosing(j0 j0Var, int i10, String str) {
            NexusSocket.this.twig.internal("Server requested close:  " + i10 + " - '" + str + "'");
            j0Var.close(i10, str);
        }

        @Override // okhttp3.k0
        public void onFailure(j0 j0Var, Throwable th2, f0 f0Var) {
            if (NexusSocket.shouldReconnectFromFailure(th2, f0Var)) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            NexusSocket.this.twig.internal("onFailure: " + th2.getMessage());
            NexusSocket.this.listener.onConnectFailed();
        }

        @Override // okhttp3.k0
        public void onMessage(j0 j0Var, String str) {
            NexusSocket.this.resetTimeout();
            parseJsonString(str);
        }

        @Override // okhttp3.k0
        public void onOpen(j0 j0Var, f0 f0Var) {
            NexusSocket.this.twig.internal("onOpen: " + f0Var.f0());
            NexusSocket.this.socket = j0Var;
            NexusSocket.this.resetTimeout();
            List<String> topics = NexusSocket.this.topicProvider.getTopics();
            if (!topics.isEmpty()) {
                NexusSocket.this.fire(NexusEvent.getSubscribeEvent(topics).toStringEncodedJsonObject());
            }
            if (NexusSocket.this.shouldSendPing) {
                NexusSocket.this.fire(NexusEvent.getPingEvent().toStringEncodedJsonObject());
            }
            NexusSocket.this.listener.onConnect();
        }

        @Override // okhttp3.k0
        public void onMessage(j0 j0Var, o oVar) {
            NexusSocket.this.twig.internal("Received bytes message " + oVar + ", resetting timeout");
            NexusSocket.this.resetTimeout();
        }
    };

    NexusSocket(String str, int i10, boolean z10, Twig twig, ScheduledExecutorService scheduledExecutorService, b0 b0Var, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = str;
        this.connectionTimeoutSeconds = i10;
        this.shouldSendPing = z10;
        this.twig = twig;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.client = b0Var;
        this.timeoutExecutor = scheduledExecutorService;
    }

    static long calculateReconnectTimerInSeconds(int i10) {
        int iMin = (int) Math.min(Math.pow(2.0d, i10), 900.0d);
        return iMin + new Random().nextInt(iMin + 1);
    }

    private static boolean isAndroidLifecycleException(@p0 Throwable th2) {
        if (th2 == null) {
            return false;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        if (th2 instanceof SocketTimeoutException) {
            return message.contains("Read timed out") && message.length() < 50;
        }
        if (th2 instanceof ConnectException) {
            return message.contains("Connection refused") || message.contains("Network unreachable");
        }
        if (th2 instanceof SocketException) {
            return message.contains("Software caused connection abort") || message.contains("Connection reset by peer") || message.contains("Connection reset") || message.contains("Broken pipe") || message.contains("Socket closed");
        }
        if (th2 instanceof IllegalStateException) {
            return message.contains("WebSocket is closed") || message.contains(MetricTracker.Action.CLOSED);
        }
        if (th2 instanceof UnknownHostException) {
            return message.contains("Unable to resolve host") || message.contains("No address associated with hostname");
        }
        if (th2 instanceof IOException) {
            return message.contains("Unexpected end of stream") || message.contains("Stream was reset") || message.contains("Connection closed");
        }
        return false;
    }

    private void modifyReconnectAttempts() {
        if (System.currentTimeMillis() - this.lastReconnectAt > TimeUnit.SECONDS.toMillis(900L) * 2) {
            this.twig.d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            this.twig.d("incrementing reconnection attempts", new Object[0]);
            this.reconnectAttempts++;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        if (this.reconnectFuture != null) {
            return;
        }
        modifyReconnectAttempts();
        long jCalculateReconnectTimerInSeconds = calculateReconnectTimerInSeconds(this.reconnectAttempts);
        this.twig.internal("Scheduling reconnect in: " + jCalculateReconnectTimerInSeconds + " for attempt: " + this.reconnectAttempts);
        this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.2
            @Override // java.lang.Runnable
            public void run() {
                NexusSocket.this.connect();
                NexusSocket.this.reconnectFuture = null;
            }
        }, jCalculateReconnectTimerInSeconds, TimeUnit.SECONDS);
    }

    static boolean shouldReconnectFromFailure(@p0 Throwable th2, @p0 f0 f0Var) {
        if (f0Var == null && th2 != null && isAndroidLifecycleException(th2)) {
            return false;
        }
        if (f0Var == null) {
            return true;
        }
        int iE = f0Var.E();
        return iE >= 500 && iE <= 599;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            scheduleReconnect();
        } else {
            disconnect(4001, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    void connect() {
        this.twig.d("connecting to a socket...", new Object[0]);
        this.client.b(new d0.a().B(this.url + HEADER).b(), this.webSocketListener);
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    void disconnect() {
        disconnect(OK_CLIENT_DISCONNECT, "Disconnect called by client");
    }

    void fire(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            this.twig.internal("firing: " + str);
            this.socket.send(str);
        } catch (IllegalStateException e10) {
            this.twig.internal("Error when firing '" + str + "': " + e10);
        }
    }

    boolean isConnected() {
        return this.socket != CLOSED_SOCKET;
    }

    private void disconnect(int i10, String str) {
        if (!this.socket.close(i10, str)) {
            this.twig.internal("Could not close socket while disconnecting, it may be already closed");
        }
    }
}
