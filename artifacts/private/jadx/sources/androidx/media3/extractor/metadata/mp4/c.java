package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.n3;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f67599a;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator<a> f67600d = new Comparator() { // from class: androidx.media3.extractor.metadata.mp4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return n3.n().g(aVar.f67601a, aVar2.f67601a).g(aVar.f67602b, aVar2.f67602b).f(aVar.f67603c, aVar2.f67603c).m();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f67601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f67602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67603c;

        public a(long j10, long j11, int i10) {
            androidx.media3.common.util.a.a(j10 < j11);
            this.f67601a = j10;
            this.f67602b = j11;
            this.f67603c = i10;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f67601a == aVar.f67601a && this.f67602b == aVar.f67602b && this.f67603c == aVar.f67603c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f67601a), Long.valueOf(this.f67602b), Integer.valueOf(this.f67603c));
        }

        public String toString() {
            return k1.S("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f67601a), Long.valueOf(this.f67602b), Integer.valueOf(this.f67603c));
        }
    }

    public c(List<a> list) {
        this.f67599a = list;
        androidx.media3.common.util.a.a(!b(list));
    }

    private static boolean b(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f67602b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f67601a < j10) {
                return true;
            }
            j10 = list.get(i10).f67602b;
        }
        return false;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f67599a.equals(((c) obj).f67599a);
        }
        return false;
    }

    public int hashCode() {
        return this.f67599a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f67599a;
    }
}
