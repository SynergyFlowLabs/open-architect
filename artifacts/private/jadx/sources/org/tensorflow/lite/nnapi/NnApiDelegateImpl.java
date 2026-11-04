package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.c;

/* JADX INFO: loaded from: classes14.dex */
public class NnApiDelegateImpl implements a.b, c, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f339825b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f339826a;

    public NnApiDelegateImpl(a.C2446a options) {
        TensorFlowLite.d();
        this.f339826a = createDelegate(options.d(), options.a(), options.c(), options.f(), options.e(), options.h() != null, options.h() == null || !options.h().booleanValue(), options.b(), options.g());
    }

    private void a() {
        if (this.f339826a == 0) {
            throw new IllegalStateException("Should not access delegate after it has been closed.");
        }
    }

    private static native long createDelegate(int preference, String deviceName, String cacheDir, String modelToken, int maxDelegatedPartitions, boolean overrideDisallowCpu, boolean disallowCpuValue, boolean allowFp16, long nnApiSupportLibraryHandle);

    private static native void deleteDelegate(long delegateHandle);

    private static native int getNnapiErrno(long delegateHandle);

    @Override // org.tensorflow.lite.c
    public long a6() {
        return this.f339826a;
    }

    @Override // org.tensorflow.lite.nnapi.a.b, org.tensorflow.lite.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f339826a;
        if (j10 != 0) {
            deleteDelegate(j10);
            this.f339826a = 0L;
        }
    }

    @Override // org.tensorflow.lite.nnapi.a.b
    public int u6() {
        a();
        return getNnapiErrno(this.f339826a);
    }
}
