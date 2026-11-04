package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private b() {
    }

    @androidx.annotation.p0
    public static Cursor a(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr2, @androidx.annotation.p0 String str2, @androidx.annotation.p0 CancellationSignal cancellationSignal) throws Exception {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e10) {
            if (e10 instanceof OperationCanceledException) {
                throw new androidx.core.os.u();
            }
            throw e10;
        }
    }

    @androidx.annotation.p0
    @Deprecated
    public static Cursor b(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr2, @androidx.annotation.p0 String str2, @androidx.annotation.p0 androidx.core.os.f fVar) {
        return a(contentResolver, uri, strArr, str, strArr2, str2, fVar != null ? (CancellationSignal) fVar.b() : null);
    }
}
