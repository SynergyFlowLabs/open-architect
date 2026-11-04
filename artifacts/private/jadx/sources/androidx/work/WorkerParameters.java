package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private UUID f76472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private h f76473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private Set<String> f76474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private a f76475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f76476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private Executor f76477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private androidx.work.impl.utils.taskexecutor.b f76478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private p0 f76479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private f0 f76480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private o f76481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f76482k;

    @b1({b1.a.LIBRARY_GROUP})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public List<String> f76483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public List<Uri> f76484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @w0(28)
        @androidx.annotation.p0
        public Network f76485c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f76483a = list;
            this.f76484b = list;
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID id2, @NonNull h inputData, @NonNull Collection<String> tags, @NonNull a runtimeExtras, @androidx.annotation.g0(from = 0) int runAttemptCount, @androidx.annotation.g0(from = 0) int generation, @NonNull Executor backgroundExecutor, @NonNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NonNull p0 workerFactory, @NonNull f0 progressUpdater, @NonNull o foregroundUpdater) {
        this.f76472a = id2;
        this.f76473b = inputData;
        this.f76474c = new HashSet(tags);
        this.f76475d = runtimeExtras;
        this.f76476e = runAttemptCount;
        this.f76482k = generation;
        this.f76477f = backgroundExecutor;
        this.f76478g = workTaskExecutor;
        this.f76479h = workerFactory;
        this.f76480i = progressUpdater;
        this.f76481j = foregroundUpdater;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public Executor a() {
        return this.f76477f;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public o b() {
        return this.f76481j;
    }

    @androidx.annotation.g0(from = 0)
    public int c() {
        return this.f76482k;
    }

    @NonNull
    public UUID d() {
        return this.f76472a;
    }

    @NonNull
    public h e() {
        return this.f76473b;
    }

    @w0(28)
    @androidx.annotation.p0
    public Network f() {
        return this.f76475d.f76485c;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public f0 g() {
        return this.f76480i;
    }

    @androidx.annotation.g0(from = 0)
    public int h() {
        return this.f76476e;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public a i() {
        return this.f76475d;
    }

    @NonNull
    public Set<String> j() {
        return this.f76474c;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.b k() {
        return this.f76478g;
    }

    @NonNull
    @w0(24)
    public List<String> l() {
        return this.f76475d.f76483a;
    }

    @NonNull
    @w0(24)
    public List<Uri> m() {
        return this.f76475d.f76484b;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public p0 n() {
        return this.f76479h;
    }
}
