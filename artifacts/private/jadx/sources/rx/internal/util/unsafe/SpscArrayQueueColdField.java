package rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes14.dex */
abstract class SpscArrayQueueColdField<E> extends ConcurrentCircularArrayQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;

    public SpscArrayQueueColdField(int i10) {
        super(i10);
        this.lookAheadStep = Math.min(i10 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }
}
