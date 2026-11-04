package io.reactivex.schedulers;

import cj.f;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f303734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f303735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f303736c;

    public d(@f T t10, long j10, @f TimeUnit timeUnit) {
        this.f303734a = t10;
        this.f303735b = j10;
        this.f303736c = (TimeUnit) io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
    }

    public long a() {
        return this.f303735b;
    }

    public long b(@f TimeUnit timeUnit) {
        return timeUnit.convert(this.f303735b, this.f303736c);
    }

    @f
    public TimeUnit c() {
        return this.f303736c;
    }

    @f
    public T d() {
        return this.f303734a;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (io.reactivex.internal.functions.b.c(this.f303734a, dVar.f303734a) && this.f303735b == dVar.f303735b && io.reactivex.internal.functions.b.c(this.f303736c, dVar.f303736c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f303734a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f303735b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31) + this.f303736c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f303735b + ", unit=" + this.f303736c + ", value=" + this.f303734a + "]";
    }
}
