package com.android.volley;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
class c0 implements s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<s<?>>> f89424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f89425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final t f89426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final g f89427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final BlockingQueue<s<?>> f89428e;

    c0(@NonNull t tVar) {
        this.f89424a = new HashMap();
        this.f89426c = tVar;
        this.f89425b = tVar.i();
        this.f89427d = null;
        this.f89428e = null;
    }

    @Override // com.android.volley.s.c
    public synchronized void a(s<?> sVar) {
        BlockingQueue<s<?>> blockingQueue;
        try {
            String cacheKey = sVar.getCacheKey();
            List<s<?>> listRemove = this.f89424a.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (b0.f89376b) {
                    b0.f("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                s<?> sVarRemove = listRemove.remove(0);
                this.f89424a.put(cacheKey, listRemove);
                sVarRemove.setNetworkRequestCompleteListener(this);
                t tVar = this.f89426c;
                if (tVar != null) {
                    tVar.n(sVarRemove);
                } else if (this.f89427d != null && (blockingQueue = this.f89428e) != null) {
                    try {
                        blockingQueue.put(sVarRemove);
                    } catch (InterruptedException e10) {
                        b0.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f89427d.d();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.s.c
    public void b(s<?> sVar, v<?> vVar) {
        List<s<?>> listRemove;
        f.a aVar = vVar.f89655b;
        if (aVar == null || aVar.a()) {
            a(sVar);
            return;
        }
        String cacheKey = sVar.getCacheKey();
        synchronized (this) {
            try {
                listRemove = this.f89424a.remove(cacheKey);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listRemove != null) {
            if (b0.f89376b) {
                b0.f("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<s<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f89425b.a(it.next(), vVar);
            }
        }
    }

    synchronized boolean c(s<?> sVar) {
        try {
            String cacheKey = sVar.getCacheKey();
            if (!this.f89424a.containsKey(cacheKey)) {
                this.f89424a.put(cacheKey, null);
                sVar.setNetworkRequestCompleteListener(this);
                if (b0.f89376b) {
                    b0.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List<s<?>> arrayList = this.f89424a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            sVar.addMarker("waiting-for-response");
            arrayList.add(sVar);
            this.f89424a.put(cacheKey, arrayList);
            if (b0.f89376b) {
                b0.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    c0(@NonNull g gVar, @NonNull BlockingQueue<s<?>> blockingQueue, w wVar) {
        this.f89424a = new HashMap();
        this.f89426c = null;
        this.f89425b = wVar;
        this.f89427d = gVar;
        this.f89428e = blockingQueue;
    }
}
