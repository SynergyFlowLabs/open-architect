package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import com.google.common.util.concurrent.t1;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    @NonNull
    private Context mAppContext;
    private volatile int mStopReason = -256;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.u$a$a, reason: collision with other inner class name */
        @b1({b1.a.LIBRARY_GROUP})
        public static final class C0794a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final h f77441a;

            public C0794a() {
                this(h.f76562c);
            }

            @Override // androidx.work.u.a
            @NonNull
            public h c() {
                return this.f77441a;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                if (o10 == null || C0794a.class != o10.getClass()) {
                    return false;
                }
                return this.f77441a.equals(((C0794a) o10).f77441a);
            }

            public int hashCode() {
                return (C0794a.class.getName().hashCode() * 31) + this.f77441a.hashCode();
            }

            @NonNull
            public String toString() {
                return "Failure {mOutputData=" + this.f77441a + AbstractJsonLexerKt.END_OBJ;
            }

            public C0794a(@NonNull h outputData) {
                this.f77441a = outputData;
            }
        }

        @b1({b1.a.LIBRARY_GROUP})
        public static final class b extends a {
            @Override // androidx.work.u.a
            @NonNull
            public h c() {
                return h.f76562c;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                return o10 != null && b.class == o10.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            @NonNull
            public String toString() {
                return "Retry";
            }
        }

        @b1({b1.a.LIBRARY_GROUP})
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final h f77442a;

            public c() {
                this(h.f76562c);
            }

            @Override // androidx.work.u.a
            @NonNull
            public h c() {
                return this.f77442a;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                if (o10 != null && c.class == o10.getClass()) {
                    return this.f77442a.equals(((c) o10).f77442a);
                }
                return false;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f77442a.hashCode();
            }

            @NonNull
            public String toString() {
                return "Success {mOutputData=" + this.f77442a + AbstractJsonLexerKt.END_OBJ;
            }

            public c(@NonNull h outputData) {
                this.f77442a = outputData;
            }
        }

        @b1({b1.a.LIBRARY_GROUP})
        a() {
        }

        @NonNull
        public static a a() {
            return new C0794a();
        }

        @NonNull
        public static a b(@NonNull h outputData) {
            return new C0794a(outputData);
        }

        @NonNull
        public static a d() {
            return new b();
        }

        @NonNull
        public static a e() {
            return new c();
        }

        @NonNull
        public static a f(@NonNull h outputData) {
            return new c(outputData);
        }

        @NonNull
        public abstract h c();
    }

    public u(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        if (appContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParams == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = appContext;
        this.mWorkerParams = workerParams;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    @NonNull
    public t1<n> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        cVarU.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarU;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.d();
    }

    @NonNull
    public final h getInputData() {
        return this.mWorkerParams.e();
    }

    @w0(28)
    @androidx.annotation.p0
    public final Network getNetwork() {
        return this.mWorkerParams.f();
    }

    @androidx.annotation.g0(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.h();
    }

    @w0(31)
    public final int getStopReason() {
        return this.mStopReason;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.j();
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.b getTaskExecutor() {
        return this.mWorkerParams.k();
    }

    @NonNull
    @w0(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.l();
    }

    @NonNull
    @w0(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m();
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public p0 getWorkerFactory() {
        return this.mWorkerParams.n();
    }

    public final boolean isStopped() {
        return this.mStopReason != -256;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final t1<Void> setForegroundAsync(@NonNull n foregroundInfo) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public t1<Void> setProgressAsync(@NonNull h data) {
        return this.mWorkerParams.g().a(getApplicationContext(), getId(), data);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    @androidx.annotation.l0
    public abstract t1<a> startWork();

    @b1({b1.a.LIBRARY_GROUP})
    public final void stop(int reason) {
        this.mStopReason = reason;
        onStopped();
    }
}
