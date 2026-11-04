package androidx.databinding;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.lifecycle.o0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
class i0<T> extends WeakReference<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0<T> f49392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f49393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f49394c;

    public i0(e0 e0Var, int i10, a0<T> a0Var, ReferenceQueue<e0> referenceQueue) {
        super(e0Var, referenceQueue);
        this.f49393b = i10;
        this.f49392a = a0Var;
    }

    @p0
    protected e0 a() {
        e0 e0Var = (e0) get();
        if (e0Var == null) {
            e();
        }
        return e0Var;
    }

    public T b() {
        return this.f49394c;
    }

    public void c(o0 o0Var) {
        this.f49392a.b(o0Var);
    }

    public void d(T t10) {
        e();
        this.f49394c = t10;
        if (t10 != null) {
            this.f49392a.e(t10);
        }
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f49394c;
        if (t10 != null) {
            this.f49392a.d(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49394c = null;
        return z10;
    }
}
