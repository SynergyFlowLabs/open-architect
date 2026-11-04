package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class j extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f77337c = v.i("DelegatingWkrFctry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<p0> f77338b = new CopyOnWriteArrayList();

    @Override // androidx.work.p0
    @androidx.annotation.p0
    public final u a(@NonNull Context appContext, @NonNull String workerClassName, @NonNull WorkerParameters workerParameters) {
        Iterator<p0> it = this.f77338b.iterator();
        while (it.hasNext()) {
            try {
                u uVarA = it.next().a(appContext, workerClassName, workerParameters);
                if (uVarA != null) {
                    return uVarA;
                }
            } catch (Throwable th2) {
                v.e().d(f77337c, "Unable to instantiate a ListenableWorker (" + workerClassName + ")", th2);
                throw th2;
            }
        }
        return null;
    }

    public final void d(@NonNull p0 workerFactory) {
        this.f77338b.add(workerFactory);
    }

    @NonNull
    @l1
    List<p0> e() {
        return this.f77338b;
    }
}
