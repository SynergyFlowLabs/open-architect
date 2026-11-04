package com.google.common.cache;

import com.google.common.base.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@i
public final class z {
    private z() {
    }

    public static <K, V> w<K, V> c(final w<K, V> listener, final Executor executor) {
        j0.E(listener);
        j0.E(executor);
        return new w() { // from class: com.google.common.cache.y
            @Override // com.google.common.cache.w
            public final void b(a0 a0Var) {
                executor.execute(new Runnable() { // from class: com.google.common.cache.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        wVar.b(a0Var);
                    }
                });
            }
        };
    }
}
