package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class d implements nk.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f335374a = new c();

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return b((String) obj);
        }
        throw new nk.h("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }

    public String b(String str) {
        return this.f335374a.f(str);
    }

    public boolean c(String str, String str2) {
        return b(str).equals(b(str2));
    }

    @Override // nk.j
    public String f(String str) {
        return b(str);
    }
}
