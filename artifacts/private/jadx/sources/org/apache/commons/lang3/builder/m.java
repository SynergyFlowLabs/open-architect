package org.apache.commons.lang3.builder;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class m extends s {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final long f336988j3 = 1;

    @Override // org.apache.commons.lang3.builder.s
    public void C(StringBuffer stringBuffer, String str, Object obj) {
        if (org.apache.commons.lang3.m.T(obj.getClass()) || String.class.equals(obj.getClass()) || !h1(obj.getClass())) {
            super.C(stringBuffer, str, obj);
        } else {
            stringBuffer.append(o.z0(obj, this));
        }
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void D(StringBuffer stringBuffer, String str, Collection<?> collection) {
        s(stringBuffer, collection);
        U(stringBuffer, collection);
        N(stringBuffer, str, collection.toArray());
    }

    protected boolean h1(Class<?> cls) {
        return true;
    }
}
