package androidx.datastore.core;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i10);

    public final native int nativeGetCounterValue(long j10);

    public final native int nativeIncrementAndGetCounterValue(long j10);

    public final native int nativeTruncateFile(int i10);
}
