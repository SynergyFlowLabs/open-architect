package vj;

import kotlin.internal.f;
import oj.i;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "ProcessKt")
public final class a {
    @f
    private static final Void a(int i10) {
        System.exit(i10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
