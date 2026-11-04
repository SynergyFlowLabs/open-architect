package org.java_websocket.framing;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d extends g {
    public d(em.c cVar) {
        super(cVar);
    }

    @Override // org.java_websocket.framing.g
    public void j() throws fm.c {
        if (!h()) {
            throw new fm.e("Control frame can't have fin==false set");
        }
        if (d()) {
            throw new fm.e("Control frame can't have rsv1==true set");
        }
        if (e()) {
            throw new fm.e("Control frame can't have rsv2==true set");
        }
        if (g()) {
            throw new fm.e("Control frame can't have rsv3==true set");
        }
    }
}
