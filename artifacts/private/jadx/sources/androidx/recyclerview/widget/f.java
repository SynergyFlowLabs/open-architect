package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class f implements v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f74209f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f74210g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f74211h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f74212i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f74213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f74214b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f74215c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f74216d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f74217e = null;

    public f(@NonNull v vVar) {
        this.f74213a = vVar;
    }

    @Override // androidx.recyclerview.widget.v
    @e.a({"UnknownNullness"})
    public void a(int i10, int i11, Object obj) {
        int i12;
        if (this.f74214b == 3) {
            int i13 = this.f74215c;
            int i14 = this.f74216d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f74217e == obj) {
                this.f74215c = Math.min(i10, i13);
                this.f74216d = Math.max(i14 + i13, i12) - this.f74215c;
                return;
            }
        }
        e();
        this.f74215c = i10;
        this.f74216d = i11;
        this.f74217e = obj;
        this.f74214b = 3;
    }

    @Override // androidx.recyclerview.widget.v
    public void b(int i10, int i11) {
        int i12;
        if (this.f74214b == 1 && i10 >= (i12 = this.f74215c)) {
            int i13 = this.f74216d;
            if (i10 <= i12 + i13) {
                this.f74216d = i13 + i11;
                this.f74215c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f74215c = i10;
        this.f74216d = i11;
        this.f74214b = 1;
    }

    @Override // androidx.recyclerview.widget.v
    public void c(int i10, int i11) {
        int i12;
        if (this.f74214b == 2 && (i12 = this.f74215c) >= i10 && i12 <= i10 + i11) {
            this.f74216d += i11;
            this.f74215c = i10;
        } else {
            e();
            this.f74215c = i10;
            this.f74216d = i11;
            this.f74214b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.v
    public void d(int i10, int i11) {
        e();
        this.f74213a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f74214b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f74213a.b(this.f74215c, this.f74216d);
        } else if (i10 == 2) {
            this.f74213a.c(this.f74215c, this.f74216d);
        } else if (i10 == 3) {
            this.f74213a.a(this.f74215c, this.f74216d, this.f74217e);
        }
        this.f74217e = null;
        this.f74214b = 0;
    }
}
