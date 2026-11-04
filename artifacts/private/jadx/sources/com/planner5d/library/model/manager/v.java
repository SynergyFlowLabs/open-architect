package com.planner5d.library.model.manager;

import androidx.annotation.NonNull;
import com.activeandroid.Model;
import com.activeandroid.query.Select;
import com.activeandroid.util.TransactionUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v<T extends Model> implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f222342c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f222343d = false;

    public static /* synthetic */ Model h(Model model) {
        return model;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(Model model) throws Exception {
        if (!w(model)) {
            return Boolean.FALSE;
        }
        t(model);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ij.c cVar) {
        final Model model = (Model) cVar.get();
        if (((Boolean) TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f197697a.l(model);
            }
        })).booleanValue()) {
            r();
        }
    }

    @androidx.annotation.m1
    private void n() {
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                List<T> listK = k();
                if (listK.isEmpty()) {
                    return;
                }
                Iterator<T> it = listK.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    if (p(next)) {
                        i(next);
                    }
                    if (it.hasNext()) {
                        com.planner5d.library.services.utility.o3.c(10000L);
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    @androidx.annotation.m1
    private boolean p(T t10) {
        try {
            return q(t10, new JSONObject());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public void r() {
        boolean z10;
        synchronized (this.f222342c) {
            try {
                z10 = this.f222343d;
                if (!z10) {
                    this.f222343d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            n();
        }
        synchronized (this.f222342c) {
            if (!z10) {
                try {
                    this.f222343d = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @androidx.annotation.m1
    protected void i(T t10) {
        t10.delete();
    }

    protected abstract Class<T> j();

    @NonNull
    @androidx.annotation.m1
    protected List<T> k() {
        return new Select().from(j()).limit(5).execute();
    }

    public Observable<Void> o() {
        return com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.model.manager.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f197712a.r();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    @androidx.annotation.m1
    protected abstract boolean q(T t10, JSONObject jSONObject) throws Exception;

    @androidx.annotation.m1
    protected void t(T t10) {
        t10.save();
    }

    public void u(final T t10) {
        v(new ij.c() { // from class: com.planner5d.library.model.manager.t
            @Override // ij.c
            public final Object get() {
                return v.h(t10);
            }
        });
    }

    public void v(final ij.c<T> cVar) {
        com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.model.manager.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f222248a.m(cVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    @androidx.annotation.m1
    protected boolean w(T t10) {
        return true;
    }
}
