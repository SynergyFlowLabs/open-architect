package io.grpc;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class d3 extends w.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f288716a = Logger.getLogger(d3.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ThreadLocal<w> f288717b = new ThreadLocal<>();

    d3() {
    }

    @Override // io.grpc.w.m
    public w a() {
        w wVar = f288717b.get();
        if (wVar == null) {
            wVar = w.f291348f;
        }
        return wVar;
    }

    @Override // io.grpc.w.m
    public void b(w wVar, w wVar2) {
        if (a() != wVar) {
            f288716a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (wVar2 != w.f291348f) {
            f288717b.set(wVar2);
        } else {
            f288717b.set(null);
        }
    }

    @Override // io.grpc.w.m
    public w c(w wVar) {
        w wVarA = a();
        f288717b.set(wVar);
        return wVarA;
    }
}
