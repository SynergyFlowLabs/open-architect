package rx.schedulers;

/* JADX INFO: loaded from: classes14.dex */
public final class Timestamped<T> {
    private final long timestampMillis;
    private final T value;

    public Timestamped(long j10, T t10) {
        this.value = t10;
        this.timestampMillis = j10;
    }

    public boolean equals(Object obj) {
        T t10;
        T t11;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Timestamped)) {
            Timestamped timestamped = (Timestamped) obj;
            return this.timestampMillis == timestamped.timestampMillis && ((t10 = this.value) == (t11 = timestamped.value) || (t10 != null && t10.equals(t11)));
        }
        return false;
    }

    public long getTimestampMillis() {
        return this.timestampMillis;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        long j10 = this.timestampMillis;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + 31) * 31;
        T t10 = this.value;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.timestampMillis), this.value.toString());
    }
}
