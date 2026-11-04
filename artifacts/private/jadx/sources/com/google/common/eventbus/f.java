package com.google.common.eventbus;

import com.google.common.base.b0;
import com.google.common.base.j0;
import com.google.common.util.concurrent.a2;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@e
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f118531f = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f118532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f118533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f118534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f118535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f118536e;

    static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f118537a = new a();

        a() {
        }

        private static Logger b(k context) {
            return Logger.getLogger(f.class.getName() + "." + context.b().c());
        }

        private static String c(k context) {
            Method methodD = context.d();
            return "Exception thrown by subscriber method " + methodD.getName() + '(' + methodD.getParameterTypes()[0].getName() + ") on subscriber " + context.c() + " when dispatching event: " + context.a();
        }

        @Override // com.google.common.eventbus.l
        public void a(Throwable exception, k context) {
            Logger loggerB = b(context);
            Level level = Level.SEVERE;
            if (loggerB.isLoggable(level)) {
                loggerB.log(level, c(context), exception);
            }
        }
    }

    public f() {
        this("default");
    }

    final Executor a() {
        return this.f118533b;
    }

    void b(Throwable e10, k context) {
        j0.E(e10);
        j0.E(context);
        try {
            this.f118534c.a(e10, context);
        } catch (Throwable th2) {
            f118531f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, e10), th2);
        }
    }

    public final String c() {
        return this.f118532a;
    }

    public void d(Object event) {
        Iterator<j> itF = this.f118535d.f(event);
        if (itF.hasNext()) {
            this.f118536e.a(event, itF);
        } else {
            if (!(event instanceof c)) {
                d(new c(this, event));
            }
        }
    }

    public void e(Object object) {
        this.f118535d.h(object);
    }

    public void f(Object object) {
        this.f118535d.i(object);
    }

    public String toString() {
        return b0.c(this).s(this.f118532a).toString();
    }

    public f(String identifier) {
        this(identifier, a2.c(), d.d(), a.f118537a);
    }

    public f(l exceptionHandler) {
        this("default", a2.c(), d.d(), exceptionHandler);
    }

    f(String identifier, Executor executor, d dispatcher, l exceptionHandler) {
        this.f118535d = new m(this);
        this.f118532a = (String) j0.E(identifier);
        this.f118533b = (Executor) j0.E(executor);
        this.f118536e = (d) j0.E(dispatcher);
        this.f118534c = (l) j0.E(exceptionHandler);
    }
}
