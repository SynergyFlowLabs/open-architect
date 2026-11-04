package io.ably.lib.realtime;

/* JADX INFO: loaded from: classes13.dex */
public enum e {
    initialized(d.initialized),
    attaching(d.attaching),
    attached(d.attached),
    detaching(d.detaching),
    detached(d.detached),
    failed(d.failed),
    suspended(d.suspended);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f287601a;

    static {
        int i10 = 2 ^ 2;
    }

    e(d dVar) {
        this.f287601a = dVar;
    }

    public d l() {
        return this.f287601a;
    }

    public boolean n() {
        if (this != attaching && this != attached && this != suspended) {
            return false;
        }
        return true;
    }
}
