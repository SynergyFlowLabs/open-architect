package io.reactivex.disposables;

import io.reactivex.internal.util.k;
import io.reactivex.internal.util.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements c, io.reactivex.internal.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s<c> f298659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f298660b;

    public b() {
    }

    @Override // io.reactivex.internal.disposables.c
    public boolean a(@cj.f c cVar) {
        if (!b(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.c
    public boolean b(@cj.f c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "disposables is null");
        if (this.f298660b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f298660b) {
                    return false;
                }
                s<c> sVar = this.f298659a;
                if (sVar != null && sVar.e(cVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.c
    public boolean c(@cj.f c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "disposable is null");
        if (!this.f298660b) {
            synchronized (this) {
                try {
                    if (!this.f298660b) {
                        s<c> sVar = this.f298659a;
                        if (sVar == null) {
                            sVar = new s<>();
                            this.f298659a = sVar;
                        }
                        sVar.a(cVar);
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

    public boolean d(@cj.f c... cVarArr) {
        io.reactivex.internal.functions.b.g(cVarArr, "disposables is null");
        if (!this.f298660b) {
            synchronized (this) {
                try {
                    if (!this.f298660b) {
                        s<c> sVar = this.f298659a;
                        if (sVar == null) {
                            sVar = new s<>(cVarArr.length + 1);
                            this.f298659a = sVar;
                        }
                        for (c cVar : cVarArr) {
                            io.reactivex.internal.functions.b.g(cVar, "A Disposable in the disposables array is null");
                            sVar.a(cVar);
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        for (c cVar2 : cVarArr) {
            cVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        if (this.f298660b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f298660b) {
                    return;
                }
                this.f298660b = true;
                s<c> sVar = this.f298659a;
                this.f298659a = null;
                f(sVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        if (this.f298660b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f298660b) {
                    return;
                }
                s<c> sVar = this.f298659a;
                this.f298659a = null;
                f(sVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void f(s<c> sVar) {
        if (sVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : sVar.b()) {
            if (obj instanceof c) {
                try {
                    ((c) obj).dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new io.reactivex.exceptions.a(arrayList);
            }
            throw k.f((Throwable) arrayList.get(0));
        }
    }

    public int g() {
        if (this.f298660b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f298660b) {
                    return 0;
                }
                s<c> sVar = this.f298659a;
                return sVar != null ? sVar.g() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f298660b;
    }

    public b(@cj.f c... cVarArr) {
        io.reactivex.internal.functions.b.g(cVarArr, "disposables is null");
        this.f298659a = new s<>(cVarArr.length + 1);
        for (c cVar : cVarArr) {
            io.reactivex.internal.functions.b.g(cVar, "A Disposable in the disposables array is null");
            this.f298659a.a(cVar);
        }
    }

    public b(@cj.f Iterable<? extends c> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "disposables is null");
        this.f298659a = new s<>();
        for (c cVar : iterable) {
            io.reactivex.internal.functions.b.g(cVar, "A Disposable item in the disposables sequence is null");
            this.f298659a.a(cVar);
        }
    }
}
