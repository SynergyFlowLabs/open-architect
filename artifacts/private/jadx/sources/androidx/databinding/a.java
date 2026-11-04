package androidx.databinding;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient c0 f49262a;

    @Override // androidx.databinding.u
    public void a(@NonNull u.a aVar) {
        synchronized (this) {
            try {
                if (this.f49262a == null) {
                    this.f49262a = new c0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f49262a.a(aVar);
    }

    @Override // androidx.databinding.u
    public void b(@NonNull u.a aVar) {
        synchronized (this) {
            try {
                c0 c0Var = this.f49262a;
                if (c0Var == null) {
                    return;
                }
                c0Var.n(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        synchronized (this) {
            try {
                c0 c0Var = this.f49262a;
                if (c0Var == null) {
                    return;
                }
                c0Var.h(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        synchronized (this) {
            try {
                c0 c0Var = this.f49262a;
                if (c0Var == null) {
                    return;
                }
                c0Var.h(this, i10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
