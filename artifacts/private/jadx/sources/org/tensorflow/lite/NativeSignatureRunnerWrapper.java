package org.tensorflow.lite;

/* JADX INFO: loaded from: classes14.dex */
final class NativeSignatureRunnerWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f339773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f339774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f339775c = false;

    NativeSignatureRunnerWrapper(long interpreterHandle, long errorHandle, String signatureKey) {
        this.f339774b = errorHandle;
        long jNativeGetSignatureRunner = nativeGetSignatureRunner(interpreterHandle, signatureKey);
        this.f339773a = jNativeGetSignatureRunner;
        if (jNativeGetSignatureRunner != -1) {
            return;
        }
        throw new IllegalArgumentException("Input error: Signature " + signatureKey + " not found.");
    }

    private static native void nativeAllocateTensors(long signatureRunnerHandle, long errorHandle);

    private static native int nativeGetInputIndex(long signatureRunnerHandle, String inputName);

    private static native int nativeGetOutputIndex(long signatureRunnerHandle, String outputName);

    private static native long nativeGetSignatureRunner(long interpreterHandle, String signatureKey);

    private static native int nativeGetSubgraphIndex(long signatureRunnerHandle);

    private static native String[] nativeInputNames(long signatureRunnerHandle);

    private static native void nativeInvoke(long signatureRunnerHandle, long errorHandle);

    private static native String[] nativeOutputNames(long signatureRunnerHandle);

    private static native boolean nativeResizeInput(long signatureRunnerHandle, long errorHandle, String inputName, int[] dims);

    public void a() {
        if (this.f339775c) {
            return;
        }
        nativeAllocateTensors(this.f339773a, this.f339774b);
        this.f339775c = true;
    }

    public int b(String inputName) {
        int iNativeGetInputIndex = nativeGetInputIndex(this.f339773a, inputName);
        if (iNativeGetInputIndex != -1) {
            return iNativeGetInputIndex;
        }
        throw new IllegalArgumentException("Input error: input " + inputName + " not found.");
    }

    public TensorImpl c(String inputName) {
        return TensorImpl.s(this.f339773a, inputName);
    }

    public int d(String outputName) {
        int iNativeGetOutputIndex = nativeGetOutputIndex(this.f339773a, outputName);
        if (iNativeGetOutputIndex != -1) {
            return iNativeGetOutputIndex;
        }
        throw new IllegalArgumentException("Input error: output " + outputName + " not found.");
    }

    public TensorImpl e(String outputName) {
        return TensorImpl.t(this.f339773a, outputName);
    }

    public int f() {
        return nativeGetSubgraphIndex(this.f339773a);
    }

    public String[] g() {
        return nativeInputNames(this.f339773a);
    }

    public void h() {
        nativeInvoke(this.f339773a, this.f339774b);
    }

    public String[] i() {
        return nativeOutputNames(this.f339773a);
    }

    public boolean j(String inputName, int[] dims) {
        this.f339775c = false;
        return nativeResizeInput(this.f339773a, this.f339774b, inputName, dims);
    }
}
