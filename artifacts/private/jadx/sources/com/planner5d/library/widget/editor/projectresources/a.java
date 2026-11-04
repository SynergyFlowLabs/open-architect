package com.planner5d.library.widget.editor.projectresources;

import androidx.collection.d1;
import com.android.tools.r8.RecordTag;
import com.planner5d.library.activity.helper.s0;
import com.planner5d.library.model.manager.builtin.u0;
import com.planner5d.library.services.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1<Long, C1742a> f258045a = new d1<>(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f258046b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f258047c = new Object();

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.projectresources.a$a, reason: collision with other inner class name */
    private static class C1742a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List<b> f258048a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f258049b = 0;
    }

    private static final class b extends RecordTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.widget.editor.editaction.e f258050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.planner5d.library.widget.editor.editaction.e f258051b;

        private /* synthetic */ boolean a(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f258050a, bVar.f258050a) && Objects.equals(this.f258051b, bVar.f258051b)) {
                    int i10 = 2 << 1;
                    return true;
                }
            }
            return false;
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f258050a, this.f258051b};
        }

        public com.planner5d.library.widget.editor.editaction.e e() {
            return this.f258051b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public com.planner5d.library.widget.editor.editaction.e f() {
            return this.f258050a;
        }

        public final int hashCode() {
            return u0.a(this.f258050a, this.f258051b);
        }

        public final String toString() {
            return s0.a(b(), b.class, "a;b");
        }

        private b(com.planner5d.library.widget.editor.editaction.e actionForward, com.planner5d.library.widget.editor.editaction.e actionBack) {
            this.f258050a = actionForward;
            this.f258051b = actionBack;
        }
    }

    @ij.a
    public a() {
    }

    private com.planner5d.library.widget.editor.editaction.e b() {
        synchronized (this.f258047c) {
            try {
                int i10 = i() - 1;
                if (!e()) {
                    return null;
                }
                g(this.f258046b).f258049b = i10;
                return h().get(i10).f258051b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private com.planner5d.library.widget.editor.editaction.e d() {
        synchronized (this.f258047c) {
            try {
                int i10 = i();
                if (!f()) {
                    return null;
                }
                g(this.f258046b).f258049b = i10 + 1;
                return h().get(i10).f258050a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C1742a g(long j10) {
        C1742a c1742aF = this.f258045a.f(Long.valueOf(j10));
        if (c1742aF != null) {
            return c1742aF;
        }
        C1742a c1742a = new C1742a();
        this.f258045a.j(Long.valueOf(j10), c1742a);
        return c1742a;
    }

    private List<b> h() {
        return g(this.f258046b).f258048a;
    }

    private int i() {
        return g(this.f258046b).f258049b;
    }

    private void l(com.planner5d.library.widget.editor.editaction.e eVar) {
        l.f224379e.o(eVar);
    }

    public <T extends com.planner5d.library.widget.editor.editaction.e> T a(T t10, com.planner5d.library.widget.editor.editaction.e eVar) {
        synchronized (this.f258047c) {
            while (h().size() > i()) {
                try {
                    h().remove(i());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            h().add(new b(t10, eVar));
            g(this.f258046b).f258049b = h().size();
            l(t10);
        }
        return t10;
    }

    public void c() {
        this.f258045a.l(Long.valueOf(this.f258046b));
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f258047c) {
            try {
                z10 = i() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f258047c) {
            try {
                z10 = i() < h().size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean j(com.planner5d.library.widget.editor.editaction.e eVar, com.planner5d.library.widget.editor.editaction.e eVar2) {
        synchronized (this.f258047c) {
            try {
                boolean z10 = false;
                if (h().isEmpty()) {
                    return false;
                }
                b bVar = h().get(h().size() - 1);
                if (bVar.f258051b == eVar2 && bVar.f258050a == eVar) {
                    z10 = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.planner5d.library.widget.editor.editaction.e k(boolean z10) {
        com.planner5d.library.widget.editor.editaction.e eVarB;
        synchronized (this.f258047c) {
            try {
                eVarB = z10 ? b() : d();
                if (eVarB != null) {
                    l(eVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVarB;
    }

    public void m(com.planner5d.library.widget.editor.editaction.e eVar, com.planner5d.library.widget.editor.editaction.e eVar2) {
        if (h().isEmpty()) {
            return;
        }
        synchronized (this.f258047c) {
            try {
                if (j(eVar, eVar2)) {
                    int size = h().size() - 1;
                    h().remove(size);
                    if (i() > size) {
                        g(this.f258046b).f258049b = i() - 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(long j10) {
        this.f258046b = j10;
    }
}
