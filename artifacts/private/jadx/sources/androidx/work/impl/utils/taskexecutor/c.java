package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.impl.utils.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.n0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f77269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f77270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f77271c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f77272d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable command) {
            c.this.f77271c.post(command);
        }
    }

    public c(@NonNull Executor backgroundExecutor) {
        x xVar = new x(backgroundExecutor);
        this.f77269a = xVar;
        this.f77270b = b2.c(xVar);
    }

    @Override // androidx.work.impl.utils.taskexecutor.b
    @NonNull
    public n0 a() {
        return this.f77270b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.b
    @NonNull
    public Executor c() {
        return this.f77272d;
    }

    @Override // androidx.work.impl.utils.taskexecutor.b
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public x d() {
        return this.f77269a;
    }
}
