package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m0 f305866b = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f305867a = new CopyOnWriteArrayList();

    @lm.a.c
    public interface a {
        void a();
    }

    private m0() {
    }

    @NotNull
    public static m0 a() {
        return f305866b;
    }

    public void b(@NotNull a aVar) {
        this.f305867a.add(aVar);
    }

    public void c() {
        Iterator<a> it = this.f305867a.iterator();
        this.f305867a.clear();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
