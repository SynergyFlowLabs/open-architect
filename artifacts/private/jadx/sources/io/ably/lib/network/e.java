package io.ably.lib.network;

import java.net.URI;

/* JADX INFO: loaded from: classes13.dex */
public class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f287430a;

    public e(u uVar) {
        this.f287430a = uVar;
    }

    @Override // io.ably.lib.network.t
    public s a(String str, w wVar) {
        d dVar = new d(URI.create(str), wVar, this.f287430a);
        if (this.f287430a.f()) {
            dVar.F0(this.f287430a.e());
        }
        return dVar;
    }

    @Override // io.ably.lib.network.t
    public boolean b() {
        return true;
    }
}
