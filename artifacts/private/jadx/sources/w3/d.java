package w3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.w0;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends Closeable {
    default boolean B3() {
        return false;
    }

    @NotNull
    Cursor C5(@NotNull String str, @NotNull Object[] objArr);

    @w0(api = 16)
    void C6(boolean z10);

    boolean E3();

    void Ea();

    @w0(api = 16)
    boolean Ge();

    long J6();

    void Je(int i10);

    int N1(@NotNull String str, @Nullable String str2, @Nullable Object[] objArr);

    void Q1();

    @Nullable
    String S();

    default void Sb(@NotNull String sql, @e.a({"ArrayReturn"}) @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        throw new UnsupportedOperationException();
    }

    boolean U3(int i10);

    void Ue(long j10);

    boolean V9();

    void W9();

    @Nullable
    List<Pair<String, String>> X1();

    void X8(@NotNull String str) throws SQLException;

    @w0(api = 16)
    void Y1();

    boolean b9();

    void da(@NotNull String str, @NotNull Object[] objArr) throws SQLException;

    long f7(@NotNull String str, int i10, @NotNull ContentValues contentValues) throws SQLException;

    long fa(long j10);

    int getVersion();

    boolean hc(long j10);

    void he(@NotNull SQLiteTransactionListener sQLiteTransactionListener);

    boolean isOpen();

    void j3();

    void kc(int i10);

    int od(@NotNull String str, int i10, @NotNull ContentValues contentValues, @Nullable String str2, @Nullable Object[] objArr);

    boolean pe();

    @NotNull
    Cursor qf(@NotNull g gVar);

    void setLocale(@NotNull Locale locale);

    long t1();

    @w0(api = 16)
    @NotNull
    Cursor u4(@NotNull g gVar, @Nullable CancellationSignal cancellationSignal);

    void ua(@NotNull SQLiteTransactionListener sQLiteTransactionListener);

    @NotNull
    i uc(@NotNull String str);

    boolean wd();

    @NotNull
    Cursor yd(@NotNull String str);

    boolean z1();
}
