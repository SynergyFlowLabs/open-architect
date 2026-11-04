package io.reactivex.exceptions;

import io.reactivex.internal.util.k;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private b() {
        throw new IllegalStateException("No instances!");
    }

    @cj.f
    public static RuntimeException a(@cj.f Throwable th2) {
        throw k.f(th2);
    }

    public static void b(@cj.f Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
