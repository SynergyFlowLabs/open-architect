package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f315478a = new f();

    private f() {
    }

    @Override // kotlinx.coroutines.scheduling.h
    public long a() {
        return System.nanoTime();
    }
}
