package androidx.media3.datasource.cache;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f62373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final File f62374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f62375f;

    public i(String str, long j10, long j11) {
        this(str, j10, j11, -9223372036854775807L, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        if (!this.f62370a.equals(iVar.f62370a)) {
            return this.f62370a.compareTo(iVar.f62370a);
        }
        long j10 = this.f62371b - iVar.f62371b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean k() {
        return !this.f62373d;
    }

    public boolean l() {
        return this.f62372c == -1;
    }

    public String toString() {
        return "[" + this.f62371b + ", " + this.f62372c + "]";
    }

    public i(String str, long j10, long j11, long j12, @p0 File file) {
        this.f62370a = str;
        this.f62371b = j10;
        this.f62372c = j11;
        this.f62373d = file != null;
        this.f62374e = file;
        this.f62375f = j12;
    }
}
