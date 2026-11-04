package io.grpc.internal;

import com.sun.jna.Callback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<a> f290135a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile io.grpc.u f290136b = io.grpc.u.IDLE;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f290137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f290138b;

        a(Runnable runnable, Executor executor) {
            this.f290137a = runnable;
            this.f290138b = executor;
        }

        void a() {
            this.f290138b.execute(this.f290137a);
        }
    }

    y() {
    }

    io.grpc.u a() {
        io.grpc.u uVar = this.f290136b;
        if (uVar != null) {
            return uVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    void b(@fj.g io.grpc.u uVar) {
        com.google.common.base.j0.F(uVar, "newState");
        if (this.f290136b != uVar && this.f290136b != io.grpc.u.SHUTDOWN) {
            this.f290136b = uVar;
            if (!this.f290135a.isEmpty()) {
                ArrayList<a> arrayList = this.f290135a;
                this.f290135a = new ArrayList<>();
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
    }

    void c(Runnable runnable, Executor executor, io.grpc.u uVar) {
        com.google.common.base.j0.F(runnable, Callback.METHOD_NAME);
        com.google.common.base.j0.F(executor, "executor");
        com.google.common.base.j0.F(uVar, "source");
        a aVar = new a(runnable, executor);
        if (this.f290136b != uVar) {
            aVar.a();
        } else {
            this.f290135a.add(aVar);
        }
    }
}
