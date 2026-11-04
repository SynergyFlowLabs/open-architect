package androidx.media3.exoplayer.video;

import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f66240b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private androidx.media3.container.g.e f66241a;

    a() {
    }

    private boolean a(androidx.media3.container.g.d dVar, boolean z10) {
        androidx.media3.container.g.e eVar;
        androidx.media3.container.g.b bVarB;
        int i10 = dVar.f62220a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f66241a) == null || (bVarB = androidx.media3.container.g.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void e(List<androidx.media3.container.g.d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f62220a == 1) {
                this.f66241a = androidx.media3.container.g.e.a(list.get(i10));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(androidx.media3.container.g.e(byteBuffer));
    }

    public void c() {
        this.f66241a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List<androidx.media3.container.g.d> listE = androidx.media3.container.g.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a(listE.get(size), z10)) {
            if (listE.get(size).f62220a == 6 || listE.get(size).f62220a == 3) {
                i10++;
            }
            size--;
        }
        if (i10 <= 1 && size + 1 < 8) {
            return size >= 0 ? listE.get(size).f62221b.limit() : byteBuffer.position();
        }
        return byteBuffer.limit();
    }
}
