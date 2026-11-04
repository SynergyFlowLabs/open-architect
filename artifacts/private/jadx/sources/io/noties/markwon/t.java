package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
class t implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i> f298604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i> f298605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<i> f298606c = new HashSet(3);

    t(@NonNull List<i> list) {
        this.f298604a = list;
        this.f298605b = new ArrayList(list.size());
    }

    private void a(@NonNull i iVar) {
        if (!this.f298605b.contains(iVar)) {
            if (this.f298606c.contains(iVar)) {
                throw new IllegalStateException("Cyclic dependency chain found: " + this.f298606c);
            }
            this.f298606c.add(iVar);
            iVar.a(this);
            this.f298606c.remove(iVar);
            if (!this.f298605b.contains(iVar)) {
                if (io.noties.markwon.core.a.class.isAssignableFrom(iVar.getClass())) {
                    this.f298605b.add(0, iVar);
                } else {
                    this.f298605b.add(iVar);
                }
            }
        }
    }

    @p0
    private static <P extends i> P d(@NonNull List<i> list, @NonNull Class<P> cls) {
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            if (cls.isAssignableFrom(p10.getClass())) {
                return p10;
            }
        }
        return null;
    }

    @NonNull
    private <P extends i> P e(@NonNull Class<P> cls) {
        P p10 = (P) d(this.f298605b, cls);
        if (p10 != null) {
            return p10;
        }
        P p11 = (P) d(this.f298604a, cls);
        if (p11 != null) {
            a(p11);
            return p11;
        }
        throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.f298604a);
    }

    @Override // io.noties.markwon.i.b
    @NonNull
    public <P extends i> P b(@NonNull Class<P> cls) {
        return (P) e(cls);
    }

    @Override // io.noties.markwon.i.b
    public <P extends i> void c(@NonNull Class<P> cls, @NonNull i.a<? super P> aVar) {
        aVar.a(e(cls));
    }

    @NonNull
    List<i> f() {
        Iterator<i> it = this.f298604a.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this.f298605b;
    }
}
