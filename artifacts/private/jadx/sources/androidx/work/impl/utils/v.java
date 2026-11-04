package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.impl.r0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f77275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.q f77276b = new androidx.work.impl.q();

    public v(@NonNull r0 workManagerImpl) {
        this.f77275a = workManagerImpl;
    }

    @NonNull
    public androidx.work.a0 a() {
        return this.f77276b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f77275a.S().k().d();
            this.f77276b.a(androidx.work.a0.f76489a);
        } catch (Throwable th2) {
            this.f77276b.a(new androidx.work.a0.b.a(th2));
        }
    }
}
