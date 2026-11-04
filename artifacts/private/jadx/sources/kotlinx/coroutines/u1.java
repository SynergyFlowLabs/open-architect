package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u1 extends s1 {
    @NotNull
    protected abstract Thread E1();

    protected void J1(long j10, @NotNull t1.c cVar) {
        y0.f315719h.z2(j10, cVar);
    }

    protected final void O1() {
        Thread threadE1 = E1();
        if (Thread.currentThread() != threadE1) {
            b bVar = c.f313549a;
            if (bVar != null) {
                bVar.g(threadE1);
            } else {
                LockSupport.unpark(threadE1);
            }
        }
    }
}
