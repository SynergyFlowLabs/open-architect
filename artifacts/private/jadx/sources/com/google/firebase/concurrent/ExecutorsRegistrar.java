package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
@e.a({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.google.firebase.components.b0<ScheduledExecutorService> f120828a = new com.google.firebase.components.b0<>(new z8.b() { // from class: com.google.firebase.concurrent.q
        @Override // z8.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.firebase.components.b0<ScheduledExecutorService> f120829b = new com.google.firebase.components.b0<>(new z8.b() { // from class: com.google.firebase.concurrent.r
        @Override // z8.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.google.firebase.components.b0<ScheduledExecutorService> f120830c = new com.google.firebase.components.b0<>(new z8.b() { // from class: com.google.firebase.concurrent.s
        @Override // z8.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final com.google.firebase.components.b0<ScheduledExecutorService> f120831d = new com.google.firebase.components.b0<>(new z8.b() { // from class: com.google.firebase.concurrent.t
        @Override // z8.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f120831d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.g(com.google.firebase.components.j0.a(d8.a.class, ScheduledExecutorService.class), com.google.firebase.components.j0.a(d8.a.class, ExecutorService.class), com.google.firebase.components.j0.a(d8.a.class, Executor.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.concurrent.u
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return ExecutorsRegistrar.f120828a.get();
            }
        }).d(), com.google.firebase.components.g.g(com.google.firebase.components.j0.a(d8.b.class, ScheduledExecutorService.class), com.google.firebase.components.j0.a(d8.b.class, ExecutorService.class), com.google.firebase.components.j0.a(d8.b.class, Executor.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.concurrent.v
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return ExecutorsRegistrar.f120830c.get();
            }
        }).d(), com.google.firebase.components.g.g(com.google.firebase.components.j0.a(d8.c.class, ScheduledExecutorService.class), com.google.firebase.components.j0.a(d8.c.class, ExecutorService.class), com.google.firebase.components.j0.a(d8.c.class, Executor.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.concurrent.w
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return ExecutorsRegistrar.f120829b.get();
            }
        }).d(), com.google.firebase.components.g.f(com.google.firebase.components.j0.a(d8.d.class, Executor.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.concurrent.x
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return n0.INSTANCE;
            }
        }).d());
    }
}
