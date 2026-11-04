package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface h {
    t1<Bitmap> a(byte[] bArr);

    boolean b(String str);

    @androidx.annotation.p0
    default t1<Bitmap> c(androidx.media3.common.q0 q0Var) {
        byte[] bArr = q0Var.f61093k;
        if (bArr != null) {
            return a(bArr);
        }
        Uri uri = q0Var.f61095m;
        if (uri != null) {
            return d(uri);
        }
        return null;
    }

    t1<Bitmap> d(Uri uri);
}
