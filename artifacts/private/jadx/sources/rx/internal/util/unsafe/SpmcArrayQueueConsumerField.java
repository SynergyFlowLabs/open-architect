package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
abstract class SpmcArrayQueueConsumerField<E> extends SpmcArrayQueueL2Pad<E> {
    protected static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(SpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public SpmcArrayQueueConsumerField(int i10) {
        super(i10);
    }

    protected final boolean casHead(long j10, long j11) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j10, j11);
    }

    protected final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
