package xd;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f390623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f390624b;

    public b() {
        this(new String[0], new long[0]);
    }

    public long[] a() {
        return this.f390624b;
    }

    public String[] b() {
        return this.f390623a;
    }

    public int c() {
        return this.f390623a.length + this.f390624b.length;
    }

    public b(String[] strArr, long[] jArr) {
        this.f390623a = strArr;
        this.f390624b = jArr;
    }
}
