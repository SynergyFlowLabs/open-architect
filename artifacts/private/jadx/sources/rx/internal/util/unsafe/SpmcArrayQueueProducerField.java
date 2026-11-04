package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
abstract class SpmcArrayQueueProducerField<E> extends SpmcArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public SpmcArrayQueueProducerField(int i10) {
        super(i10);
    }

    protected final long lvProducerIndex() {
        return this.producerIndex;
    }

    protected final void soTail(long j10) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j10);
    }
}
