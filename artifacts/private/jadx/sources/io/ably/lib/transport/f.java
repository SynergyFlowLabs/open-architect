package io.ably.lib.transport;

import io.ably.lib.types.r;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Set<c> f287885a = new HashSet();

    public static class a extends f {
    }

    public static class b extends f implements c {
        @Override // io.ably.lib.transport.f.c
        public void a(r rVar) {
            f(rVar);
        }

        @Override // io.ably.lib.transport.f.c
        public void b() {
            e();
        }
    }

    public interface c {
        void a(r rVar);

        void b();
    }

    public void c(c cVar) {
        boolean zIsEmpty;
        synchronized (this) {
            try {
                zIsEmpty = this.f287885a.isEmpty();
                this.f287885a.add(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsEmpty) {
            h();
        }
    }

    protected synchronized boolean d() {
        return this.f287885a.isEmpty();
    }

    protected void e() {
        c[] cVarArr;
        synchronized (this) {
            try {
                Set<c> set = this.f287885a;
                cVarArr = (c[]) set.toArray(new c[set.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (c cVar : cVarArr) {
            cVar.b();
        }
    }

    protected void f(r rVar) {
        c[] cVarArr;
        synchronized (this) {
            try {
                Set<c> set = this.f287885a;
                cVarArr = (c[]) set.toArray(new c[set.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (c cVar : cVarArr) {
            cVar.a(rVar);
        }
    }

    protected void g() {
    }

    protected void h() {
    }

    public void i(c cVar) {
        boolean zIsEmpty;
        synchronized (this) {
            try {
                this.f287885a.remove(cVar);
                zIsEmpty = this.f287885a.isEmpty();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsEmpty) {
            g();
        }
    }
}
