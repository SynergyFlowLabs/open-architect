package androidx.media2.session;

import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
class p extends x {
    p() {
    }

    @Override // androidx.media2.session.x, androidx.media2.session.w.b
    public IBinder a(Intent intent) {
        return MediaLibraryService.f58610c.equals(intent.getAction()) ? j() : super.a(intent);
    }
}
