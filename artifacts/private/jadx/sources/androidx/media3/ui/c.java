package androidx.media3.ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class c implements j0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final PendingIntent f69781a;

    public c(@androidx.annotation.p0 PendingIntent pendingIntent) {
        this.f69781a = pendingIntent;
    }

    @Override // androidx.media3.ui.j0.e
    @androidx.annotation.p0
    public Bitmap a(androidx.media3.common.z0 z0Var, j0.b bVar) {
        byte[] bArr;
        if (z0Var.P0(18) && (bArr = z0Var.u2().f61093k) != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    @Override // androidx.media3.ui.j0.e
    @androidx.annotation.p0
    public CharSequence c(androidx.media3.common.z0 z0Var) {
        if (!z0Var.P0(18)) {
            return null;
        }
        CharSequence charSequence = z0Var.u2().f61084b;
        return !TextUtils.isEmpty(charSequence) ? charSequence : z0Var.u2().f61086d;
    }

    @Override // androidx.media3.ui.j0.e
    public CharSequence d(androidx.media3.common.z0 z0Var) {
        if (!z0Var.P0(18)) {
            return "";
        }
        CharSequence charSequence = z0Var.u2().f61087e;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence charSequence2 = z0Var.u2().f61083a;
        return charSequence2 != null ? charSequence2 : "";
    }

    @Override // androidx.media3.ui.j0.e
    @androidx.annotation.p0
    public PendingIntent e(androidx.media3.common.z0 z0Var) {
        return this.f69781a;
    }
}
