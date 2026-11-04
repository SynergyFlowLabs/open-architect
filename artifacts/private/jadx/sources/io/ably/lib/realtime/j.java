package io.ably.lib.realtime;

/* JADX INFO: loaded from: classes13.dex */
public enum j {
    initialized(i.initialized),
    connecting(i.connecting),
    connected(i.connected),
    disconnected(i.disconnected),
    suspended(i.suspended),
    closing(i.closing),
    closed(i.closed),
    failed(i.failed);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f287638a;

    j(i iVar) {
        this.f287638a = iVar;
    }

    public i l() {
        return this.f287638a;
    }
}
