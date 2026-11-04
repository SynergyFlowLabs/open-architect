package io.ably.lib.types;

import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes13.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f287917b = -3804072091596832634L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f287918a;

    /* JADX INFO: renamed from: io.ably.lib.types.a$a, reason: collision with other inner class name */
    public static class C1945a extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f287919c = 1;

        C1945a(Throwable th2, r rVar) {
            super(th2, rVar);
        }
    }

    protected a(Throwable th2, r rVar) {
        super(th2);
        this.f287918a = rVar;
    }

    public static a a(r rVar) {
        return b(new Exception(rVar.f288158c), rVar);
    }

    public static a b(Throwable th2, r rVar) {
        int i10 = rVar.f288157b;
        return (i10 < 500 || i10 > 504) ? new a(th2, rVar) : new C1945a(th2, rVar);
    }

    public static a c(Throwable th2) {
        if (th2 instanceof a) {
            return (a) th2;
        }
        if (!(th2 instanceof ConnectException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof NoRouteToHostException)) {
            return th2 instanceof io.ably.lib.network.h ? new C1945a(th2.getCause(), r.e(th2.getCause())) : new a(th2, r.e(th2));
        }
        return new C1945a(th2, r.e(th2));
    }
}
