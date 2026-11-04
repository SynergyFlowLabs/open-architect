package org.apache.commons.collections4.keyvalue;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<K, V> extends a<K, V> implements Map.Entry<K, V> {
    protected b(K k10, V v10) {
        super(k10, v10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (getValue().equals(r6.getValue()) != false) goto L22;
     */
    @Override // java.util.Map.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "Androeed.ru"
            r0 = 1
            if (r6 != r5) goto L6
            return r0
        L6:
            r4 = 3
            boolean r1 = r6 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto Ld
            return r2
        Ld:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r5.getKey()
            r4 = 7
            if (r1 != 0) goto L1e
            r4 = 7
            java.lang.Object r1 = r6.getKey()
            if (r1 != 0) goto L4e
            goto L2e
        L1e:
            java.lang.Object r1 = r5.getKey()
            r4 = 3
            java.lang.Object r3 = r6.getKey()
            r4 = 2
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4e
        L2e:
            java.lang.Object r1 = r5.getValue()
            if (r1 != 0) goto L3c
            java.lang.Object r5 = r6.getValue()
            if (r5 != 0) goto L4e
            r4 = 3
            goto L4c
        L3c:
            r4 = 5
            java.lang.Object r5 = r5.getValue()
            r4 = 2
            java.lang.Object r6 = r6.getValue()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L4e
        L4c:
            r4 = 1
            return r0
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.collections4.keyvalue.b.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    @Override // org.apache.commons.collections4.keyvalue.a, java.util.Map.Entry
    public V setValue(V v10) {
        return (V) super.setValue(v10);
    }
}
