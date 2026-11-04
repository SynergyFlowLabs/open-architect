package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g implements w3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SQLiteStatement f75353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f75353b = delegate;
    }

    @Override // w3.i
    public long B5() {
        return this.f75353b.simpleQueryForLong();
    }

    @Override // w3.i
    public long Yb() {
        return this.f75353b.executeInsert();
    }

    @Override // w3.i
    public void execute() {
        this.f75353b.execute();
    }

    @Override // w3.i
    public int j2() {
        return this.f75353b.executeUpdateDelete();
    }

    @Override // w3.i
    @Nullable
    public String ra() {
        return this.f75353b.simpleQueryForString();
    }
}
