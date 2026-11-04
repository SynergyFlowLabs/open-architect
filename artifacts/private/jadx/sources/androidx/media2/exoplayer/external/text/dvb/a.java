package androidx.media2.exoplayer.external.text.dvb;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.e;
import androidx.media2.exoplayer.external.util.x;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends androidx.media2.exoplayer.external.text.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f56698o;

    public a(List<byte[]> initializationData) {
        super("DvbDecoder");
        x xVar = new x(initializationData.get(0));
        this.f56698o = new b(xVar.J(), xVar.J());
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected e y(byte[] data, int length, boolean reset) {
        if (reset) {
            this.f56698o.r();
        }
        return new c(this.f56698o.b(data, length));
    }
}
