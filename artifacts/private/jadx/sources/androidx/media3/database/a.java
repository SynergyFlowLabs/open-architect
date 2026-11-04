package androidx.media3.database;

import android.database.SQLException;
import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a extends IOException {
    public a(SQLException sQLException) {
        super(sQLException);
    }

    public a(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
