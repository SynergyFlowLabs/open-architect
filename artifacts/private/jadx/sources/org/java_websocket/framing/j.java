package org.java_websocket.framing;

/* JADX INFO: loaded from: classes14.dex */
public class j extends e {
    public j() {
        super(em.c.TEXT);
    }

    @Override // org.java_websocket.framing.e, org.java_websocket.framing.g
    public void j() throws fm.c {
        super.j();
        if (!org.java_websocket.util.c.b(b())) {
            throw new fm.c(1007, "Received text is no valid utf8 string!");
        }
    }
}
