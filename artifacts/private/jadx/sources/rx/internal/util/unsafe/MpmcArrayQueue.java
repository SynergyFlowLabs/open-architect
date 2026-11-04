package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
public class MpmcArrayQueue<E> extends MpmcArrayQueueConsumerField<E> {
    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;
    long p40;
    long p41;
    long p42;
    long p43;
    long p44;
    long p45;
    long p46;

    public MpmcArrayQueue(int i10) {
        super(Math.max(2, i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e10) {
        long j10;
        long[] jArr;
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        long j11 = 1;
        long j12 = mpmcArrayQueue.mask + 1;
        long[] jArr2 = mpmcArrayQueue.sequenceBuffer;
        long j13 = Long.MAX_VALUE;
        while (true) {
            long jLvProducerIndex = mpmcArrayQueue.lvProducerIndex();
            long j14 = j12;
            long jCalcSequenceOffset = mpmcArrayQueue.calcSequenceOffset(jLvProducerIndex);
            long jLvSequence = mpmcArrayQueue.lvSequence(jArr2, jCalcSequenceOffset) - jLvProducerIndex;
            if (jLvSequence == 0) {
                j10 = j11;
                long j15 = jLvProducerIndex + j10;
                if (mpmcArrayQueue.casProducerIndex(jLvProducerIndex, j15)) {
                    mpmcArrayQueue.spElement(mpmcArrayQueue.calcElementOffset(jLvProducerIndex), e10);
                    mpmcArrayQueue.soSequence(jArr2, jCalcSequenceOffset, j15);
                    return true;
                }
                jArr = jArr2;
            } else {
                j10 = j11;
                jArr = jArr2;
                if (jLvSequence < 0) {
                    long j16 = jLvProducerIndex - j14;
                    if (j16 <= j13) {
                        long jLvConsumerIndex = lvConsumerIndex();
                        if (j16 <= jLvConsumerIndex) {
                            return false;
                        }
                        j13 = jLvConsumerIndex;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            jArr2 = jArr;
            j12 = j14;
            j11 = j10;
            mpmcArrayQueue = this;
        }
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        long jLvConsumerIndex;
        E eLpElement;
        do {
            jLvConsumerIndex = lvConsumerIndex();
            eLpElement = lpElement(calcElementOffset(jLvConsumerIndex));
            if (eLpElement != null) {
                break;
            }
        } while (jLvConsumerIndex != lvProducerIndex());
        return eLpElement;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        long[] jArr = mpmcArrayQueue.sequenceBuffer;
        long jLvProducerIndex = -1;
        while (true) {
            long jLvConsumerIndex = mpmcArrayQueue.lvConsumerIndex();
            long j10 = jLvProducerIndex;
            long jCalcSequenceOffset = mpmcArrayQueue.calcSequenceOffset(jLvConsumerIndex);
            long j11 = jLvConsumerIndex + 1;
            long jLvSequence = mpmcArrayQueue.lvSequence(jArr, jCalcSequenceOffset) - j11;
            if (jLvSequence != 0) {
                if (jLvSequence < 0 && jLvConsumerIndex >= j10) {
                    jLvProducerIndex = lvProducerIndex();
                    if (jLvConsumerIndex == jLvProducerIndex) {
                        return null;
                    }
                }
                mpmcArrayQueue = this;
            } else if (mpmcArrayQueue.casConsumerIndex(jLvConsumerIndex, j11)) {
                long jCalcElementOffset = mpmcArrayQueue.calcElementOffset(jLvConsumerIndex);
                E eLpElement = mpmcArrayQueue.lpElement(jCalcElementOffset);
                mpmcArrayQueue.spElement(jCalcElementOffset, null);
                mpmcArrayQueue.soSequence(jArr, jCalcSequenceOffset, jLvConsumerIndex + mpmcArrayQueue.mask + 1);
                return eLpElement;
            }
            jLvProducerIndex = j10;
            mpmcArrayQueue = this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }
}
