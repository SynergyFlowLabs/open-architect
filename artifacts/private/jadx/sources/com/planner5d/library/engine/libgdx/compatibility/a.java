package com.planner5d.library.engine.libgdx.compatibility;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import com.planner5d.library.engine.k;
import com.planner5d.library.engine.m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class a implements vb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f160770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f160771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.engine.b f160772c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference<Context> f160776g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<Runnable> f160773d = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<Runnable> f160774e = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<m> f160775f = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f160777h = new AtomicBoolean(false);

    public a(Context context, com.planner5d.library.engine.b bVar, vb.b bVar2, @NonNull vb.e eVar) {
        int i10 = 2 << 0;
        this.f160776g = new WeakReference<>(context);
        this.f160772c = bVar;
        b bVar3 = (b) eVar.a(this, bVar2);
        this.f160770a = bVar3;
        this.f160771b = new d(this, context, bVar3.i(), bVar2);
        q();
    }

    private void p(boolean z10) {
        View viewI = this.f160770a.i();
        d dVar = z10 ? this.f160771b : null;
        viewI.setOnTouchListener(dVar);
        viewI.setOnKeyListener(dVar);
        viewI.setOnGenericMotionListener(dVar);
    }

    private void q() {
        if (this.f160777h.get()) {
            return;
        }
        p(true);
    }

    @Override // com.planner5d.library.engine.a
    public void a(m mVar) {
        if (this.f160777h.get()) {
            return;
        }
        synchronized (this.f160775f) {
            this.f160775f.c(mVar);
        }
    }

    @Override // com.planner5d.library.engine.a
    public void b() {
        if (this.f160777h.get()) {
            return;
        }
        synchronized (this.f160775f) {
            try {
                Iterator<m> it = this.f160775f.iterator();
                while (it.hasNext()) {
                    it.next().p();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f160772c.p();
    }

    @Override // com.planner5d.library.engine.a
    public com.planner5d.library.engine.b c() {
        return this.f160772c;
    }

    @Override // vb.a
    public void d() {
        if (this.f160777h.get()) {
            return;
        }
        p(false);
        try {
            this.f160771b.f();
        } catch (NullPointerException unused) {
        }
        this.f160770a.o();
    }

    @Override // com.planner5d.library.engine.a
    public void e() {
        if (this.f160777h.get()) {
            return;
        }
        synchronized (this.f160775f) {
            try {
                Iterator<m> it = this.f160775f.iterator();
                while (it.hasNext()) {
                    it.next().dispose();
                }
                this.f160775f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f160772c.dispose();
        } catch (Throwable unused) {
        }
        f();
        this.f160777h.set(true);
        p(false);
    }

    @Override // com.planner5d.library.engine.a
    public void f() {
        if (this.f160777h.get()) {
            return;
        }
        while (true) {
            synchronized (this.f160773d) {
                try {
                    if (this.f160773d.f95174b <= 0) {
                        return;
                    }
                    this.f160774e.clear();
                    this.f160774e.d(this.f160773d);
                    this.f160773d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator<Runnable> it = this.f160774e.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    @Override // com.planner5d.library.engine.a
    public void g() {
        if (this.f160777h.get()) {
            return;
        }
        synchronized (this.f160775f) {
            try {
                Iterator<m> it = this.f160775f.iterator();
                while (it.hasNext()) {
                    it.next().pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f160772c.pause();
    }

    @Override // com.planner5d.library.engine.a
    public Context getContext() {
        return this.f160776g.get();
    }

    @Override // vb.a
    public View getView() {
        return this.f160770a.i();
    }

    @Override // com.planner5d.library.engine.a
    @androidx.annotation.d
    public void i(Runnable runnable) {
        if (this.f160777h.get()) {
            return;
        }
        synchronized (this.f160773d) {
            try {
                this.f160773d.c(runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f160770a.q();
    }

    @Override // com.planner5d.library.engine.a
    public WindowManager j() {
        return (WindowManager) getContext().getSystemService("window");
    }

    @Override // com.planner5d.library.engine.a
    public boolean k() {
        return this.f160777h.get();
    }

    @Override // vb.a
    @l0
    public void l() {
        if (this.f160777h.get()) {
            return;
        }
        p(true);
        q();
        this.f160771b.g();
        b bVar = this.f160770a;
        if (bVar != null) {
            bVar.l();
        }
    }

    @Override // com.planner5d.library.engine.a
    public k m() {
        return this.f160770a;
    }

    @Override // com.planner5d.library.engine.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d h() {
        return this.f160771b;
    }

    public int o() {
        return Build.VERSION.SDK_INT;
    }

    @Override // vb.a
    public void onConfigurationChanged(Configuration configuration) {
        d dVar = this.f160771b;
        if (dVar == null || configuration == null) {
            return;
        }
        dVar.f160585j3 = configuration.hardKeyboardHidden == 1;
    }
}
