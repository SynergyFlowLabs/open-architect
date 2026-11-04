package fm;

/* JADX INFO: loaded from: classes13.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f275311b = 3731842424390998726L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f275312a;

    public c(int i10) {
        this.f275312a = i10;
    }

    public int a() {
        return this.f275312a;
    }

    public c(int i10, String str) {
        super(str);
        this.f275312a = i10;
    }

    public c(int i10, Throwable th2) {
        super(th2);
        this.f275312a = i10;
    }

    public c(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f275312a = i10;
    }
}
