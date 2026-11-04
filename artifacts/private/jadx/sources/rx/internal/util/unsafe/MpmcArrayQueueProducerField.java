package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
abstract class MpmcArrayQueueProducerField<E> extends MpmcArrayQueueL1Pad<E> {
    private static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(MpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public MpmcArrayQueueProducerField(int i10) {
        super(i10);
    }

    protected final boolean casProducerIndex(long j10, long j11) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j10, j11);
    }

    protected final long lvProducerIndex() {
        return this.producerIndex;
    }
}
