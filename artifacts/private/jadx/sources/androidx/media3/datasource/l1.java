package androidx.media3.datasource;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public final class l1 implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p.a f62524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.b1 f62525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62526c;

    public l1(p.a aVar, androidx.media3.common.b1 b1Var, int i10) {
        this.f62524a = aVar;
        this.f62525b = b1Var;
        this.f62526c = i10;
    }

    @Override // androidx.media3.datasource.p.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k1 a() {
        return new k1(this.f62524a.a(), this.f62525b, this.f62526c);
    }
}
