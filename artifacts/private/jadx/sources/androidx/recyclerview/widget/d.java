package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Executor f74151h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f74152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f74153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Executor f74154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<T>> f74155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private List<T> f74156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private List<T> f74157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f74158g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f74159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f74160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f74162d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0728a extends k.b {
            C0728a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f74159a.get(i10);
                Object obj2 = a.this.f74160b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f74153b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f74159a.get(i10);
                Object obj2 = a.this.f74160b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f74153b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            @p0
            public Object c(int i10, int i11) {
                Object obj = a.this.f74159a.get(i10);
                Object obj2 = a.this.f74160b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f74153b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.k.b
            public int d() {
                return a.this.f74160b.size();
            }

            @Override // androidx.recyclerview.widget.k.b
            public int e() {
                return a.this.f74159a.size();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k.e f74165a;

            b(k.e eVar) {
                this.f74165a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f74158g == aVar.f74161c) {
                    dVar.c(aVar.f74160b, this.f74165a, aVar.f74162d);
                }
            }
        }

        a(List list, List list2, int i10, Runnable runnable) {
            this.f74159a = list;
            this.f74160b = list2;
            this.f74161c = i10;
            this.f74162d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f74154c.execute(new b(k.b(new C0728a())));
        }
    }

    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f74167a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f74167a.post(runnable);
        }
    }

    public d(@NonNull RecyclerView.h hVar, @NonNull k.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new androidx.recyclerview.widget.c.a(fVar).a());
    }

    private void d(@NonNull List<T> list, @p0 Runnable runnable) {
        Iterator<b<T>> it = this.f74155d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f74157f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@NonNull b<T> bVar) {
        this.f74155d.add(bVar);
    }

    @NonNull
    public List<T> b() {
        return this.f74157f;
    }

    void c(@NonNull List<T> list, @NonNull k.e eVar, @p0 Runnable runnable) {
        List<T> list2 = this.f74157f;
        this.f74156e = list;
        this.f74157f = Collections.unmodifiableList(list);
        eVar.d(this.f74152a);
        d(list2, runnable);
    }

    public void e(@NonNull b<T> bVar) {
        this.f74155d.remove(bVar);
    }

    public void f(@p0 List<T> list) {
        g(list, null);
    }

    public void g(@p0 List<T> list, @p0 Runnable runnable) {
        int i10 = this.f74158g + 1;
        this.f74158g = i10;
        List<T> list2 = this.f74156e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f74157f;
        if (list == null) {
            int size = list2.size();
            this.f74156e = null;
            this.f74157f = Collections.EMPTY_LIST;
            this.f74152a.c(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f74153b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f74156e = list;
        this.f74157f = Collections.unmodifiableList(list);
        this.f74152a.b(0, list.size());
        d(list3, runnable);
    }

    public d(@NonNull v vVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.f74155d = new CopyOnWriteArrayList();
        this.f74157f = Collections.EMPTY_LIST;
        this.f74152a = vVar;
        this.f74153b = cVar;
        if (cVar.c() != null) {
            this.f74154c = cVar.c();
        } else {
            this.f74154c = f74151h;
        }
    }
}
