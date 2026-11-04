package gm;

import fm.e;
import org.java_websocket.framing.f;

/* JADX INFO: loaded from: classes13.dex */
public class b implements d {
    @Override // gm.d
    public d a() {
        return new b();
    }

    @Override // gm.d
    public boolean b(String str) {
        return true;
    }

    @Override // gm.d
    public void c(f fVar) {
    }

    @Override // gm.d
    public String d() {
        return "";
    }

    @Override // gm.d
    public boolean e(String str) {
        return true;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    @Override // gm.d
    public void f(f fVar) throws fm.c {
    }

    @Override // gm.d
    public String g() {
        return "";
    }

    @Override // gm.d
    public void h(f fVar) throws fm.c {
        if (fVar.d() || fVar.e() || fVar.g()) {
            throw new e("bad rsv RSV1: " + fVar.d() + " RSV2: " + fVar.e() + " RSV3: " + fVar.g());
        }
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // gm.d
    public void reset() {
    }

    @Override // gm.d
    public String toString() {
        return getClass().getSimpleName();
    }
}
