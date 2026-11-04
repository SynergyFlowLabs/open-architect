package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements nk.j {
    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new nk.h("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }

    public boolean b(String str, String str2) throws nk.h {
        return f(str).equals(f(str2));
    }
}
