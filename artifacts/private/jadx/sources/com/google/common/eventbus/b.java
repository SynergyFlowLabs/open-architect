package com.google.common.eventbus;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@e
public class b extends f {
    public b(String identifier, Executor executor) {
        super(identifier, executor, d.c(), f.a.f118537a);
    }

    public b(Executor executor, l subscriberExceptionHandler) {
        super("default", executor, d.c(), subscriberExceptionHandler);
    }

    public b(Executor executor) {
        super("default", executor, d.c(), f.a.f118537a);
    }
}
