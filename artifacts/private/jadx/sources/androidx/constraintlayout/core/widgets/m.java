package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44837d;

    public boolean a(int i10, int i11) {
        int i12;
        int i13 = this.f44834a;
        return i10 >= i13 && i10 < i13 + this.f44836c && i11 >= (i12 = this.f44835b) && i11 < i12 + this.f44837d;
    }

    public int b() {
        return (this.f44834a + this.f44836c) / 2;
    }

    public int c() {
        return (this.f44835b + this.f44837d) / 2;
    }

    void d(int i10, int i11) {
        this.f44834a -= i10;
        this.f44835b -= i11;
        this.f44836c += i10 * 2;
        this.f44837d += i11 * 2;
    }

    boolean e(m mVar) {
        int i10;
        int i11;
        int i12 = this.f44834a;
        int i13 = mVar.f44834a;
        return i12 >= i13 && i12 < i13 + mVar.f44836c && (i10 = this.f44835b) >= (i11 = mVar.f44835b) && i10 < i11 + mVar.f44837d;
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f44834a = i10;
        this.f44835b = i11;
        this.f44836c = i12;
        this.f44837d = i13;
    }
}
