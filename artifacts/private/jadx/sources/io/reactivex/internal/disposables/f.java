package io.reactivex.internal.disposables;

import io.reactivex.internal.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements io.reactivex.disposables.c, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<io.reactivex.disposables.c> f298687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f298688b;

    public f() {
    }

    @Override // io.reactivex.internal.disposables.c
    public boolean a(io.reactivex.disposables.c cVar) {
        if (!b(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.c
    public boolean b(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "Disposable item is null");
        int i10 = 3 | 0;
        if (this.f298688b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f298688b) {
                    return false;
                }
                List<io.reactivex.disposables.c> list = this.f298687a;
                if (list != null && list.remove(cVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.c
    public boolean c(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "d is null");
        if (!this.f298688b) {
            synchronized (this) {
                try {
                    if (!this.f298688b) {
                        List linkedList = this.f298687a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f298687a = linkedList;
                        }
                        linkedList.add(cVar);
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        cVar.dispose();
        return false;
    }

    public boolean d(io.reactivex.disposables.c... cVarArr) {
        io.reactivex.internal.functions.b.g(cVarArr, "ds is null");
        if (!this.f298688b) {
            synchronized (this) {
                try {
                    if (!this.f298688b) {
                        List linkedList = this.f298687a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f298687a = linkedList;
                        }
                        for (io.reactivex.disposables.c cVar : cVarArr) {
                            io.reactivex.internal.functions.b.g(cVar, "d is null");
                            linkedList.add(cVar);
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        for (io.reactivex.disposables.c cVar2 : cVarArr) {
            cVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        if (this.f298688b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f298688b) {
                    return;
                }
                this.f298688b = true;
                List<io.reactivex.disposables.c> list = this.f298687a;
                this.f298687a = null;
                f(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        if (this.f298688b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f298688b) {
                    return;
                }
                List<io.reactivex.disposables.c> list = this.f298687a;
                this.f298687a = null;
                f(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void f(List<io.reactivex.disposables.c> list) {
        if (list != null) {
            Iterator<io.reactivex.disposables.c> it = list.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                try {
                    it.next().dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new io.reactivex.exceptions.a(arrayList);
                }
                throw k.f((Throwable) arrayList.get(0));
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f298688b;
    }

    public f(io.reactivex.disposables.c... cVarArr) {
        io.reactivex.internal.functions.b.g(cVarArr, "resources is null");
        this.f298687a = new LinkedList();
        for (io.reactivex.disposables.c cVar : cVarArr) {
            io.reactivex.internal.functions.b.g(cVar, "Disposable item is null");
            this.f298687a.add(cVar);
        }
    }

    public f(Iterable<? extends io.reactivex.disposables.c> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "resources is null");
        this.f298687a = new LinkedList();
        for (io.reactivex.disposables.c cVar : iterable) {
            io.reactivex.internal.functions.b.g(cVar, "Disposable item is null");
            this.f298687a.add(cVar);
        }
    }
}
