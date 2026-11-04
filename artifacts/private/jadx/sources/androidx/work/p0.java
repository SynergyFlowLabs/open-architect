package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f77433a = v.i("WorkerFactory");

    class a extends p0 {
        a() {
        }

        @Override // androidx.work.p0
        @androidx.annotation.p0
        public u a(@NonNull Context appContext, @NonNull String workerClassName, @NonNull WorkerParameters workerParameters) {
            return null;
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static p0 c() {
        return new a();
    }

    @androidx.annotation.p0
    public abstract u a(@NonNull Context appContext, @NonNull String workerClassName, @NonNull WorkerParameters workerParameters);

    @b1({b1.a.LIBRARY_GROUP})
    @androidx.annotation.p0
    public final u b(@NonNull Context appContext, @NonNull String workerClassName, @NonNull WorkerParameters workerParameters) {
        Class clsAsSubclass;
        u uVarA = a(appContext, workerClassName, workerParameters);
        if (uVarA == null) {
            try {
                clsAsSubclass = Class.forName(workerClassName).asSubclass(u.class);
            } catch (Throwable th2) {
                v.e().d(f77433a, "Invalid class: " + workerClassName, th2);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    uVarA = (u) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                } catch (Throwable th3) {
                    v.e().d(f77433a, "Could not instantiate " + workerClassName, th3);
                }
            }
        }
        if (uVarA == null || !uVarA.isUsed()) {
            return uVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
