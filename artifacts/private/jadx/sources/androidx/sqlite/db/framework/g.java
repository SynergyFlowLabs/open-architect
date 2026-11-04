package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class g implements w3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SQLiteProgram f75352a;

    public g(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f75352a = delegate;
    }

    @Override // w3.f
    public void G6(int i10, long j10) {
        this.f75352a.bindLong(i10, j10);
    }

    @Override // w3.f
    public void H5(int i10, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f75352a.bindString(i10, value);
    }

    @Override // w3.f
    public void J7(int i10) {
        this.f75352a.bindNull(i10);
    }

    @Override // w3.f
    public void Q6(int i10, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f75352a.bindBlob(i10, value);
    }

    @Override // w3.f
    public void Ve() {
        this.f75352a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75352a.close();
    }

    @Override // w3.f
    public void s9(int i10, double d10) {
        this.f75352a.bindDouble(i10, d10);
    }
}
