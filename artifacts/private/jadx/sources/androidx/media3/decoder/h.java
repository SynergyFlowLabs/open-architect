package androidx.media3.decoder;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class h extends androidx.media3.decoder.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f62708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62710d;

    public interface a<S extends h> {
        void a(S s10);
    }

    public abstract void D();

    @Override // androidx.media3.decoder.a
    @androidx.annotation.i
    public void o() {
        super.o();
        this.f62708b = 0L;
        this.f62709c = 0;
        this.f62710d = false;
    }
}
