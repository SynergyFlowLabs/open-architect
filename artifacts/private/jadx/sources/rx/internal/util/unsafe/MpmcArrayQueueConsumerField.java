package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
abstract class MpmcArrayQueueConsumerField<E> extends MpmcArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(MpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcArrayQueueConsumerField(int i10) {
        super(i10);
    }

    protected final boolean casConsumerIndex(long j10, long j11) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j10, j11);
    }

    protected final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
