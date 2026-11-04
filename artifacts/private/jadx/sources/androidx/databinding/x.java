package androidx.databinding;

import androidx.annotation.p0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class x<T> extends b implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49442c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f49443b;

    public x(T t10) {
        this.f49443b = t10;
    }

    @p0
    public T f() {
        return this.f49443b;
    }

    public void g(T t10) {
        if (t10 != this.f49443b) {
            this.f49443b = t10;
            c();
        }
    }

    public x() {
    }

    public x(u... uVarArr) {
        super(uVarArr);
    }
}
