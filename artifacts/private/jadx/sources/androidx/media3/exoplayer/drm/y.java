package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class y implements a0 {
    public static y v() {
        return new y();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void acquire() {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public a0.h b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void e(String str, String str2) {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void f(String str, byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public String g(String str) {
        return "";
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @androidx.annotation.p0
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @androidx.annotation.p0
    public byte[] h(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void j(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public byte[] k(String str) {
        return k1.f61545f;
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public a0.b l(byte[] bArr, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, @androidx.annotation.p0 HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void p(@androidx.annotation.p0 a0.e eVar) {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public int q() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public androidx.media3.decoder.b r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void s(@androidx.annotation.p0 a0.f fVar) {
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public boolean t(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    public void u(@androidx.annotation.p0 a0.d dVar) {
    }
}
