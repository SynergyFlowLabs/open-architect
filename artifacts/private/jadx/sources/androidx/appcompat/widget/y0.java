package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11659i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11660a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11661b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11662c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11663d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11664e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11665f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11666g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11667h = false;

    y0() {
    }

    public int a() {
        return this.f11666g ? this.f11660a : this.f11661b;
    }

    public int b() {
        return this.f11660a;
    }

    public int c() {
        return this.f11661b;
    }

    public int d() {
        return this.f11666g ? this.f11661b : this.f11660a;
    }

    public void e(int i10, int i11) {
        this.f11667h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f11664e = i10;
            this.f11660a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f11665f = i11;
            this.f11661b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f11666g) {
            return;
        }
        this.f11666g = z10;
        if (!this.f11667h) {
            this.f11660a = this.f11664e;
            this.f11661b = this.f11665f;
            return;
        }
        if (z10) {
            int i10 = this.f11663d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f11664e;
            }
            this.f11660a = i10;
            int i11 = this.f11662c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f11665f;
            }
            this.f11661b = i11;
            return;
        }
        int i12 = this.f11662c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f11664e;
        }
        this.f11660a = i12;
        int i13 = this.f11663d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f11665f;
        }
        this.f11661b = i13;
    }

    public void g(int i10, int i11) {
        this.f11662c = i10;
        this.f11663d = i11;
        this.f11667h = true;
        if (this.f11666g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f11660a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f11661b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f11660a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f11661b = i11;
        }
    }
}
