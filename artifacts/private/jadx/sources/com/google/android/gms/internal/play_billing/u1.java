package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u1 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private transient y1 f109341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private transient y1 f109342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private transient m1 f109343c;

    u1() {
    }

    public static u1 c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        y0.b("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        y0.b("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        y0.b("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return t2.g(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract m1 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m1 values() {
        m1 m1VarA = this.f109343c;
        if (m1VarA == null) {
            m1VarA = a();
            this.f109343c = m1VarA;
        }
        return m1VarA;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@fj.a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@fj.a Object obj) {
        return values().contains(obj);
    }

    abstract y1 d();

    abstract y1 e();

    @Override // java.util.Map
    public final boolean equals(@fj.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final y1 entrySet() {
        y1 y1Var = this.f109341a;
        if (y1Var != null) {
            return y1Var;
        }
        y1 y1VarD = d();
        this.f109341a = y1VarD;
        return y1VarD;
    }

    @Override // java.util.Map
    @fj.a
    public abstract Object get(@fj.a Object obj);

    @Override // java.util.Map
    @fj.a
    public final Object getOrDefault(@fj.a Object obj, @fj.a Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return w2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        y1 y1Var = this.f109342b;
        if (y1Var != null) {
            return y1Var;
        }
        y1 y1VarE = e();
        this.f109342b = y1VarE;
        return y1VarE;
    }

    @Override // java.util.Map
    @fj.a
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @fj.a
    @Deprecated
    public final Object remove(@fj.a Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        y0.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, org.apache.commons.io.k.f336695f));
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
