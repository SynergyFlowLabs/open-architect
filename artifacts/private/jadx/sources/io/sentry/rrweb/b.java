package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.util.y;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.rrweb.c f306647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f306648b;

    public static final class a {
        public boolean a(@NotNull b bVar, @NotNull String str, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            str.getClass();
            if (str.equals("type")) {
                bVar.f306647a = (io.sentry.rrweb.c) y.c((io.sentry.rrweb.c) y3Var.i4(iLogger, new io.sentry.rrweb.c.a()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f306648b = y3Var.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C2232b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306649a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306650b = "timestamp";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306651c = "tag";
    }

    public static final class c {
        public void a(@NotNull b bVar, @NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.f("type").j(iLogger, bVar.f306647a);
            z3Var.f("timestamp").c(bVar.f306648b);
        }
    }

    protected b(@NotNull io.sentry.rrweb.c cVar) {
        this.f306647a = cVar;
        this.f306648b = System.currentTimeMillis();
    }

    public long e() {
        return this.f306648b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f306648b == bVar.f306648b && this.f306647a == bVar.f306647a;
    }

    @NotNull
    public io.sentry.rrweb.c f() {
        return this.f306647a;
    }

    public void g(long j10) {
        this.f306648b = j10;
    }

    public void h(@NotNull io.sentry.rrweb.c cVar) {
        this.f306647a = cVar;
    }

    public int hashCode() {
        return y.b(this.f306647a, Long.valueOf(this.f306648b));
    }

    protected b() {
        this(io.sentry.rrweb.c.Custom);
    }
}
