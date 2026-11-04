package androidx.startup;

import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public final class d extends RuntimeException {
    public d(@NonNull String str) {
        super(str);
    }

    public d(@NonNull Throwable th2) {
        super(th2);
    }

    public d(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
    }
}
