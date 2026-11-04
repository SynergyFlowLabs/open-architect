package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.p0;
import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class h<K extends m, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f96393a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f96394b = new HashMap();

    private static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f96395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<V> f96396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a<K, V> f96397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<K, V> f96398d;

        a() {
            this(null);
        }

        public void a(V v10) {
            if (this.f96396b == null) {
                this.f96396b = new ArrayList();
            }
            this.f96396b.add(v10);
        }

        @p0
        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f96396b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f96396b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k10) {
            this.f96398d = this;
            this.f96397c = this;
            this.f96395a = k10;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f96393a;
        aVar.f96398d = aVar2;
        aVar.f96397c = aVar2.f96397c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f96393a;
        aVar.f96398d = aVar2.f96398d;
        aVar.f96397c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f96398d;
        aVar2.f96397c = aVar.f96397c;
        aVar.f96397c.f96398d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f96397c.f96398d = aVar;
        aVar.f96398d.f96397c = aVar;
    }

    @p0
    public V a(K k10) {
        a<K, V> aVar = this.f96394b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f96394b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f96394b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f96394b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    @p0
    public V f() {
        for (a aVar = this.f96393a.f96398d; !aVar.equals(this.f96393a); aVar = aVar.f96398d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f96394b.remove(aVar.f96395a);
            ((m) aVar.f96395a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f96393a.f96397c;
        boolean z10 = false;
        while (!aVar.equals(this.f96393a)) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb2.append(aVar.f96395a);
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f96397c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
