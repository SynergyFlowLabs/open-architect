package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44156e;

    public void a(androidx.constraintlayout.core.motion.f fVar) {
        this.f44153b = fVar.l();
        this.f44154c = fVar.w();
        this.f44155d = fVar.q();
        this.f44156e = fVar.h();
        this.f44152a = (int) fVar.t();
    }

    public int b() {
        return this.f44156e - this.f44154c;
    }

    public int c() {
        return this.f44155d - this.f44153b;
    }
}
