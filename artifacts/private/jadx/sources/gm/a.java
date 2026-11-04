package gm;

import org.java_websocket.framing.e;
import org.java_websocket.framing.f;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends b {
    @Override // gm.b, gm.d
    public void h(f fVar) throws fm.c {
        if ((fVar instanceof e) && (fVar.e() || fVar.g())) {
            throw new fm.e("bad rsv RSV1: " + fVar.d() + " RSV2: " + fVar.e() + " RSV3: " + fVar.g());
        }
        if (fVar instanceof org.java_websocket.framing.d) {
            if (fVar.d() || fVar.e() || fVar.g()) {
                throw new fm.e("bad rsv RSV1: " + fVar.d() + " RSV2: " + fVar.e() + " RSV3: " + fVar.g());
            }
        }
    }
}
