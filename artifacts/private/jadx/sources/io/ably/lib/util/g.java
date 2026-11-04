package io.ably.lib.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g<Event, Listener> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<Listener, g<Event, Listener>.a> f288228a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<Listener> f288229b = new ArrayList();

    protected class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Event f288230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Listener f288231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f288232c;

        a(Event event, Listener listener, boolean z10) {
            this.f288230a = event;
            this.f288231b = listener;
            this.f288232c = z10;
        }

        protected boolean b(Event event, Object... objArr) {
            Event event2 = this.f288230a;
            if (event2 != event && event2 != null) {
                return false;
            }
            g.this.a(this.f288231b, event, objArr);
            return this.f288232c;
        }
    }

    protected abstract void a(Listener listener, Event event, Object... objArr);

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void b(Event event, Object... objArr) {
        try {
            Iterator it = new ArrayList(this.f288229b).iterator();
            while (it.hasNext()) {
                a(it.next(), event, objArr);
            }
            for (Map.Entry entry : new HashMap(this.f288228a).entrySet()) {
                if (((a) entry.getValue()).b(event, objArr)) {
                    this.f288228a.remove(entry.getKey());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        this.f288229b.clear();
        this.f288228a.clear();
    }

    public synchronized void d(Listener listener) {
        try {
            this.f288229b.remove(listener);
            this.f288228a.remove(listener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e(Event event, Listener listener) {
        try {
            g<Event, Listener>.a aVar = this.f288228a.get(listener);
            if (aVar != null && ((a) aVar).f288230a == event) {
                this.f288228a.remove(listener);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f(Listener listener) {
        if (!this.f288229b.contains(listener)) {
            this.f288229b.add(listener);
        }
    }

    public synchronized void g(Event event, Listener listener) {
        this.f288228a.put(listener, new a(event, listener, false));
    }

    public synchronized void h(Listener listener) {
        try {
            this.f288228a.put(listener, new a(null, listener, true));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void i(Event event, Listener listener) {
        try {
            this.f288228a.put(listener, new a(event, listener, true));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
