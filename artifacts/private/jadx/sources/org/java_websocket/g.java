package org.java_websocket;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.java_websocket.framing.h f337900a;

    @Override // org.java_websocket.j
    public void A(f fVar, org.java_websocket.framing.f fVar2) {
        fVar.g(new org.java_websocket.framing.i((org.java_websocket.framing.h) fVar2));
    }

    @Override // org.java_websocket.j
    public im.i F(f fVar, org.java_websocket.drafts.a aVar, im.a aVar2) throws fm.c {
        return new im.e();
    }

    @Override // org.java_websocket.j
    public void G(f fVar, im.a aVar, im.h hVar) throws fm.c {
    }

    @Override // org.java_websocket.j
    public void j(f fVar, im.a aVar) throws fm.c {
    }

    @Override // org.java_websocket.j
    public org.java_websocket.framing.h v(f fVar) {
        if (this.f337900a == null) {
            this.f337900a = new org.java_websocket.framing.h();
        }
        return this.f337900a;
    }

    @Override // org.java_websocket.j
    public void x(f fVar, org.java_websocket.framing.f fVar2) {
    }
}
