package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageOutput f63866a = new a();

    class a implements ImageOutput {
        a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j10, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j10, Bitmap bitmap);
}
