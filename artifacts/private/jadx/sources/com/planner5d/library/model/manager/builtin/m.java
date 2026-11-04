package com.planner5d.library.model.manager.builtin;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f181095c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f181096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<SQLiteDatabase> f181097b;

    public m(@Nullable SQLiteDatabase sQLiteDatabase, @NotNull i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f181096a = builtInDataManager;
        this.f181097b = new AtomicReference<>(sQLiteDatabase);
    }

    @Nullable
    public final SQLiteDatabase a() {
        return this.f181097b.get();
    }

    public final void b(@NotNull Function1<? super SQLiteDatabase, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                close();
            } else {
                handler.invoke(sQLiteDatabaseA);
                close();
            }
        } catch (Throwable th2) {
            close();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f181097b.set(null);
        this.f181096a.B0(this);
    }
}
