package androidx.room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements w3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w3.i f75082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f75083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Executor f75084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2.g f75085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Object> f75086e;

    public t1(@NotNull w3.i delegate, @NotNull String sqlStatement, @NotNull Executor queryCallbackExecutor, @NotNull b2.g queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f75082a = delegate;
        this.f75083b = sqlStatement;
        this.f75084c = queryCallbackExecutor;
        this.f75085d = queryCallback;
        this.f75086e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f75085d.a(this$0.f75083b, this$0.f75086e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f75085d.a(this$0.f75083b, this$0.f75086e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f75085d.a(this$0.f75083b, this$0.f75086e);
    }

    private final void j(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f75086e.size()) {
            int size = (i11 - this.f75086e.size()) + 1;
            for (int i12 = 0; i12 < size; i12++) {
                this.f75086e.add(null);
            }
        }
        this.f75086e.set(i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f75085d.a(this$0.f75083b, this$0.f75086e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f75085d.a(this$0.f75083b, this$0.f75086e);
    }

    @Override // w3.i
    public long B5() {
        this.f75084c.execute(new Runnable() { // from class: androidx.room.o1
            @Override // java.lang.Runnable
            public final void run() {
                t1.l(this.f75034a);
            }
        });
        return this.f75082a.B5();
    }

    @Override // w3.f
    public void G6(int i10, long j10) {
        j(i10, Long.valueOf(j10));
        this.f75082a.G6(i10, j10);
    }

    @Override // w3.f
    public void H5(int i10, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        j(i10, value);
        this.f75082a.H5(i10, value);
    }

    @Override // w3.f
    public void J7(int i10) {
        j(i10, null);
        this.f75082a.J7(i10);
    }

    @Override // w3.f
    public void Q6(int i10, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        j(i10, value);
        this.f75082a.Q6(i10, value);
    }

    @Override // w3.f
    public void Ve() {
        this.f75086e.clear();
        this.f75082a.Ve();
    }

    @Override // w3.i
    public long Yb() {
        this.f75084c.execute(new Runnable() { // from class: androidx.room.p1
            @Override // java.lang.Runnable
            public final void run() {
                t1.g(this.f75036a);
            }
        });
        return this.f75082a.Yb();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f75082a.close();
    }

    @Override // w3.i
    public void execute() {
        this.f75084c.execute(new Runnable() { // from class: androidx.room.r1
            @Override // java.lang.Runnable
            public final void run() {
                t1.f(this.f75067a);
            }
        });
        this.f75082a.execute();
    }

    @Override // w3.i
    public int j2() {
        this.f75084c.execute(new Runnable() { // from class: androidx.room.s1
            @Override // java.lang.Runnable
            public final void run() {
                t1.h(this.f75074a);
            }
        });
        return this.f75082a.j2();
    }

    @Override // w3.i
    @Nullable
    public String ra() {
        this.f75084c.execute(new Runnable() { // from class: androidx.room.q1
            @Override // java.lang.Runnable
            public final void run() {
                t1.m(this.f75049a);
            }
        });
        return this.f75082a.ra();
    }

    @Override // w3.f
    public void s9(int i10, double d10) {
        j(i10, Double.valueOf(d10));
        this.f75082a.s9(i10, d10);
    }
}
