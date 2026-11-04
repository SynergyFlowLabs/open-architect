package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
public final class k1 implements w3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w3.d f74947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f74948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2.g f74949c;

    public k1(@NotNull w3.d delegate, @NotNull Executor queryCallbackExecutor, @NotNull b2.g queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f74947a = delegate;
        this.f74948b = queryCallbackExecutor;
        this.f74949c = queryCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(k1 this$0, String sql) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        this$0.f74949c.a(sql, CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(k1 this$0, String sql, List inputArguments) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        Intrinsics.checkNotNullParameter(inputArguments, "$inputArguments");
        this$0.f74949c.a(sql, inputArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(k1 this$0, String query) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        this$0.f74949c.a(query, CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(k1 this$0, String query, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(bindArgs, "$bindArgs");
        this$0.f74949c.a(query, ArraysKt.toList(bindArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(k1 this$0, w3.g query, n1 queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.f74949c.a(query.b(), queryInterceptorProgram.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(k1 this$0, w3.g query, n1 queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.f74949c.a(query.b(), queryInterceptorProgram.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(k1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74949c.a("TRANSACTION SUCCESSFUL", CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(k1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74949c.a("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(k1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74949c.a("BEGIN DEFERRED TRANSACTION", CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(k1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74949c.a("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(k1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74949c.a("BEGIN DEFERRED TRANSACTION", CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(k1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74949c.a("END TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // w3.d
    public boolean B3() {
        return this.f74947a.B3();
    }

    @Override // w3.d
    @NotNull
    public Cursor C5(@NotNull final String query, @NotNull final Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f74948b.execute(new Runnable() { // from class: androidx.room.b1
            @Override // java.lang.Runnable
            public final void run() {
                k1.N(this.f74650a, query, bindArgs);
            }
        });
        return this.f74947a.C5(query, bindArgs);
    }

    @Override // w3.d
    @androidx.annotation.w0(api = 16)
    public void C6(boolean z10) {
        this.f74947a.C6(z10);
    }

    @Override // w3.d
    public boolean E3() {
        return this.f74947a.E3();
    }

    @Override // w3.d
    public void Ea() {
        this.f74948b.execute(new Runnable() { // from class: androidx.room.y0
            @Override // java.lang.Runnable
            public final void run() {
                k1.y(this.f75134a);
            }
        });
        this.f74947a.Ea();
    }

    @Override // w3.d
    @androidx.annotation.w0(api = 16)
    public boolean Ge() {
        return this.f74947a.Ge();
    }

    @Override // w3.d
    public long J6() {
        return this.f74947a.J6();
    }

    @Override // w3.d
    public void Je(int i10) {
        this.f74947a.Je(i10);
    }

    @Override // w3.d
    public int N1(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.f74947a.N1(table, str, objArr);
    }

    @Override // w3.d
    public void Q1() {
        this.f74948b.execute(new Runnable() { // from class: androidx.room.d1
            @Override // java.lang.Runnable
            public final void run() {
                k1.q(this.f74741a);
            }
        });
        this.f74947a.Q1();
    }

    @Override // w3.d
    @Nullable
    public String S() {
        return this.f74947a.S();
    }

    @Override // w3.d
    public void Sb(@NotNull String sql, @e.a({"ArrayReturn"}) @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f74947a.Sb(sql, objArr);
    }

    @Override // w3.d
    public boolean U3(int i10) {
        return this.f74947a.U3(i10);
    }

    @Override // w3.d
    public void Ue(long j10) {
        this.f74947a.Ue(j10);
    }

    @Override // w3.d
    public boolean V9() {
        return this.f74947a.V9();
    }

    @Override // w3.d
    public void W9() {
        this.f74948b.execute(new Runnable() { // from class: androidx.room.e1
            @Override // java.lang.Runnable
            public final void run() {
                k1.X(this.f74803a);
            }
        });
        this.f74947a.W9();
    }

    @Override // w3.d
    @Nullable
    public List<Pair<String, String>> X1() {
        return this.f74947a.X1();
    }

    @Override // w3.d
    public void X8(@NotNull final String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f74948b.execute(new Runnable() { // from class: androidx.room.c1
            @Override // java.lang.Runnable
            public final void run() {
                k1.E(this.f74686a, sql);
            }
        });
        this.f74947a.X8(sql);
    }

    @Override // w3.d
    @androidx.annotation.w0(api = 16)
    public void Y1() {
        this.f74947a.Y1();
    }

    @Override // w3.d
    public boolean b9() {
        return this.f74947a.b9();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74947a.close();
    }

    @Override // w3.d
    public void da(@NotNull final String sql, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        CollectionsKt.addAll(listCreateListBuilder, bindArgs);
        final List listBuild = CollectionsKt.build(listCreateListBuilder);
        this.f74948b.execute(new Runnable() { // from class: androidx.room.g1
            @Override // java.lang.Runnable
            public final void run() {
                k1.H(this.f74837a, sql, listBuild);
            }
        });
        this.f74947a.da(sql, listBuild.toArray(new Object[0]));
    }

    @Override // w3.d
    public long f7(@NotNull String table, int i10, @NotNull ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f74947a.f7(table, i10, values);
    }

    @Override // w3.d
    public long fa(long j10) {
        return this.f74947a.fa(j10);
    }

    @Override // w3.d
    public int getVersion() {
        return this.f74947a.getVersion();
    }

    @Override // w3.d
    public boolean hc(long j10) {
        return this.f74947a.hc(j10);
    }

    @Override // w3.d
    public void he(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f74948b.execute(new Runnable() { // from class: androidx.room.z0
            @Override // java.lang.Runnable
            public final void run() {
                k1.x(this.f75135a);
            }
        });
        this.f74947a.he(transactionListener);
    }

    @Override // w3.d
    public boolean isOpen() {
        return this.f74947a.isOpen();
    }

    @Override // w3.d
    public void j3() {
        this.f74948b.execute(new Runnable() { // from class: androidx.room.f1
            @Override // java.lang.Runnable
            public final void run() {
                k1.r(this.f74818a);
            }
        });
        this.f74947a.j3();
    }

    @Override // w3.d
    public void kc(int i10) {
        this.f74947a.kc(i10);
    }

    @Override // w3.d
    public int od(@NotNull String table, int i10, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f74947a.od(table, i10, values, str, objArr);
    }

    @Override // w3.d
    public boolean pe() {
        return this.f74947a.pe();
    }

    @Override // w3.d
    @NotNull
    public Cursor qf(@NotNull final w3.g query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final n1 n1Var = new n1();
        query.c(n1Var);
        this.f74948b.execute(new Runnable() { // from class: androidx.room.h1
            @Override // java.lang.Runnable
            public final void run() {
                k1.R(this.f74848a, query, n1Var);
            }
        });
        return this.f74947a.qf(query);
    }

    @Override // w3.d
    public void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f74947a.setLocale(locale);
    }

    @Override // w3.d
    public long t1() {
        return this.f74947a.t1();
    }

    @Override // w3.d
    @NotNull
    public Cursor u4(@NotNull final w3.g query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        final n1 n1Var = new n1();
        query.c(n1Var);
        this.f74948b.execute(new Runnable() { // from class: androidx.room.j1
            @Override // java.lang.Runnable
            public final void run() {
                k1.T(this.f74923a, query, n1Var);
            }
        });
        return this.f74947a.qf(query);
    }

    @Override // w3.d
    public void ua(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f74948b.execute(new Runnable() { // from class: androidx.room.i1
            @Override // java.lang.Runnable
            public final void run() {
                k1.t(this.f74880a);
            }
        });
        this.f74947a.ua(transactionListener);
    }

    @Override // w3.d
    @NotNull
    public w3.i uc(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new t1(this.f74947a.uc(sql), sql, this.f74948b, this.f74949c);
    }

    @Override // w3.d
    public boolean wd() {
        return this.f74947a.wd();
    }

    @Override // w3.d
    @NotNull
    public Cursor yd(@NotNull final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f74948b.execute(new Runnable() { // from class: androidx.room.a1
            @Override // java.lang.Runnable
            public final void run() {
                k1.I(this.f74643a, query);
            }
        });
        return this.f74947a.yd(query);
    }

    @Override // w3.d
    public boolean z1() {
        return this.f74947a.z1();
    }
}
