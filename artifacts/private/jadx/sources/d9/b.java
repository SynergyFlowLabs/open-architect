package d9;

/* JADX INFO: loaded from: classes5.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f269694a;

    private b() {
    }

    public static b a() {
        if (f269694a == null) {
            f269694a = new b();
        }
        return f269694a;
    }

    @Override // d9.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
