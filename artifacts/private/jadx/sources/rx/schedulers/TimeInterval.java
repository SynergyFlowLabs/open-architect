package rx.schedulers;

/* JADX INFO: loaded from: classes14.dex */
public class TimeInterval<T> {
    private final long intervalInMilliseconds;
    private final T value;

    public TimeInterval(long j10, T t10) {
        this.value = t10;
        this.intervalInMilliseconds = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        if (this.intervalInMilliseconds != timeInterval.intervalInMilliseconds) {
            return false;
        }
        T t10 = this.value;
        if (t10 == null) {
            if (timeInterval.value != null) {
                return false;
            }
        } else if (!t10.equals(timeInterval.value)) {
            return false;
        }
        return true;
    }

    public long getIntervalInMilliseconds() {
        return this.intervalInMilliseconds;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        long j10 = this.intervalInMilliseconds;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + 31) * 31;
        T t10 = this.value;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.intervalInMilliseconds + ", value=" + this.value + "]";
    }
}
