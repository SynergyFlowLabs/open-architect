package androidx.room;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements w3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Object> f75033a = new ArrayList();

    private final void b(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        if (i11 >= this.f75033a.size() && (size = this.f75033a.size()) <= i11) {
            while (true) {
                this.f75033a.add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.f75033a.set(i11, obj);
    }

    @Override // w3.f
    public void G6(int i10, long j10) {
        b(i10, Long.valueOf(j10));
    }

    @Override // w3.f
    public void H5(int i10, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        b(i10, value);
    }

    @Override // w3.f
    public void J7(int i10) {
        b(i10, null);
    }

    @Override // w3.f
    public void Q6(int i10, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        b(i10, value);
    }

    @Override // w3.f
    public void Ve() {
        this.f75033a.clear();
    }

    @NotNull
    public final List<Object> a() {
        return this.f75033a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // w3.f
    public void s9(int i10, double d10) {
        b(i10, Double.valueOf(d10));
    }
}
