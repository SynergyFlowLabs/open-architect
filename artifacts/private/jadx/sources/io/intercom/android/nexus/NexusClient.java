package io.intercom.android.nexus;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.intercom.twig.Twig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.b0;

/* JADX INFO: loaded from: classes13.dex */
public class NexusClient implements NexusTopicProvider {

    @p0
    private ScheduledExecutorService backgroundTaskExecutor;
    private final b0 client;
    private final NexusEventPropagator eventPropagator;
    private ScheduledFuture future;
    private long heartbeatInterval;
    private final List<NexusSocket> sockets;
    private final List<String> topics;
    private final Twig twig;

    private static class NexusThreadFactory implements ThreadFactory {
        private final ThreadFactory defaultFactory;
        private int threadCount;

        private NexusThreadFactory() {
            this.defaultFactory = Executors.defaultThreadFactory();
            this.threadCount = 0;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.defaultFactory.newThread(runnable);
            this.threadCount++;
            threadNewThread.setName("IntercomNexus-" + this.threadCount);
            return threadNewThread;
        }
    }

    public NexusClient(Twig twig) {
        this(twig, defaultOkHttpClientBuilder().f());
    }

    public static b0.a defaultOkHttpClientBuilder() {
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVar.j0(130L, timeUnit).R0(130L, timeUnit).k(20L, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePing() {
        if (this.heartbeatInterval > 0) {
            this.future = this.backgroundTaskExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusClient.1
                @Override // java.lang.Runnable
                public void run() {
                    NexusClient.this.fire(NexusEvent.getPingEvent());
                    NexusClient.this.schedulePing();
                }
            }, this.heartbeatInterval, TimeUnit.SECONDS);
        }
    }

    private void subscribeToTopics(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getSubscribeEvent(list));
    }

    private void unSubscribeFromTopics(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getUnsubscribeEvent(list));
    }

    public void addEventListener(@NonNull NexusListener nexusListener) {
        this.eventPropagator.addListener(nexusListener);
    }

    public synchronized void addTopics(@NonNull List<String> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(this.topics);
            subscribeToTopics(arrayList);
            this.topics.addAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clearTopics() {
        unSubscribeFromTopics(this.topics);
        this.topics.clear();
    }

    public void connect(NexusConfig nexusConfig, boolean z10) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.e("No endpoints present", new Object[0]);
            return;
        }
        if (this.backgroundTaskExecutor == null) {
            this.backgroundTaskExecutor = Executors.newScheduledThreadPool(nexusConfig.getEndpoints().size() + 1, new NexusThreadFactory());
        }
        for (String str : nexusConfig.getEndpoints()) {
            this.twig.i("Adding socket", new Object[0]);
            NexusClient nexusClient = this;
            NexusSocket nexusSocket = new NexusSocket(str, nexusConfig.getConnectionTimeout(), z10, this.twig, this.backgroundTaskExecutor, this.client, this.eventPropagator, nexusClient);
            nexusSocket.connect();
            nexusClient.sockets.add(nexusSocket);
            this = nexusClient;
        }
        NexusClient nexusClient2 = this;
        nexusClient2.heartbeatInterval = nexusConfig.getPresenceHeartbeatInterval();
        if (z10) {
            nexusClient2.schedulePing();
        }
    }

    public synchronized void disconnect() {
        try {
            if (!this.sockets.isEmpty()) {
                for (NexusSocket nexusSocket : this.sockets) {
                    this.twig.i("disconnecting socket", new Object[0]);
                    nexusSocket.disconnect();
                }
                this.sockets.clear();
                this.twig.i("client disconnected", new Object[0]);
            }
            ScheduledFuture scheduledFuture = this.future;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void fire(NexusEvent nexusEvent) {
        try {
            this.eventPropagator.cacheEvent(nexusEvent);
            String stringEncodedJsonObject = nexusEvent.toStringEncodedJsonObject();
            if (!stringEncodedJsonObject.isEmpty()) {
                Iterator<NexusSocket> it = this.sockets.iterator();
                while (it.hasNext()) {
                    it.next().fire(stringEncodedJsonObject);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.intercom.android.nexus.NexusTopicProvider
    @NonNull
    public synchronized List<String> getTopics() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.topics;
    }

    public synchronized boolean isConnected() {
        try {
            Iterator<NexusSocket> it = this.sockets.iterator();
            while (it.hasNext()) {
                if (it.next().isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void localUpdate(@NonNull NexusEvent nexusEvent) {
        try {
            this.eventPropagator.notifyEvent(nexusEvent);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void removeEventListener(@NonNull NexusListener nexusListener) {
        this.eventPropagator.removeListener(nexusListener);
    }

    public synchronized void removeTopics(@NonNull List<String> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (this.topics.contains(str)) {
                    arrayList.add(str);
                }
            }
            unSubscribeFromTopics(arrayList);
            this.topics.removeAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setTopics(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        ArrayList arrayList2 = new ArrayList(this.topics);
        arrayList2.removeAll(list);
        subscribeToTopics(arrayList);
        unSubscribeFromTopics(arrayList2);
        this.topics.clear();
        this.topics.addAll(list);
    }

    public NexusClient(Twig twig, b0 b0Var) {
        this(twig, b0Var, new NexusEventPropagator(twig));
    }

    NexusClient(Twig twig, b0 b0Var, NexusEventPropagator nexusEventPropagator) {
        this.sockets = new ArrayList();
        this.topics = new ArrayList();
        this.twig = twig;
        this.eventPropagator = nexusEventPropagator;
        this.client = b0Var;
    }
}
