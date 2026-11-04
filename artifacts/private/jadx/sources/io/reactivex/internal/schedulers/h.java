package io.reactivex.internal.schedulers;

import io.reactivex.j0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f303260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f303257c = "RxNewThreadScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f303259e = "rx2.newthread-priority";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f303258d = new k(f303257c, Math.max(1, Math.min(10, Integer.getInteger(f303259e, 5).intValue())));

    public h() {
        this(f303258d);
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return new i(this.f303260b);
    }

    public h(ThreadFactory threadFactory) {
        this.f303260b = threadFactory;
    }
}
