package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f74716m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f74717n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w3.e f74718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f74719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Runnable f74720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f74721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f74722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Executor f74723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private int f74724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private long f74725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @Nullable
    private w3.d f74726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f74727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Runnable f74728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Runnable f74729l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(long j10, @NotNull TimeUnit autoCloseTimeUnit, @NotNull Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f74719b = new Handler(Looper.getMainLooper());
        this.f74721d = new Object();
        this.f74722e = autoCloseTimeUnit.toMillis(j10);
        this.f74723f = autoCloseExecutor;
        this.f74725h = SystemClock.uptimeMillis();
        this.f74728k = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                d.f(this.f74649a);
            }
        };
        this.f74729l = new Runnable() { // from class: androidx.room.c
            @Override // java.lang.Runnable
            public final void run() {
                d.c(this.f74685a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f74721d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f74725h < this$0.f74722e) {
                    return;
                }
                if (this$0.f74724g != 0) {
                    return;
                }
                Runnable runnable = this$0.f74720c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.f312394a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                w3.d dVar = this$0.f74726i;
                if (dVar != null && dVar.isOpen()) {
                    dVar.close();
                }
                this$0.f74726i = null;
                Unit unit2 = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f74723f.execute(this$0.f74729l);
    }

    public final void d() throws IOException {
        synchronized (this.f74721d) {
            try {
                this.f74727j = true;
                w3.d dVar = this.f74726i;
                if (dVar != null) {
                    dVar.close();
                }
                this.f74726i = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f74721d) {
            try {
                int i10 = this.f74724g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f74724g = i11;
                if (i11 == 0) {
                    if (this.f74726i == null) {
                        return;
                    } else {
                        this.f74719b.postDelayed(this.f74728k, this.f74722e);
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <V> V g(@NotNull Function1<? super w3.d, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            V vInvoke = block.invoke(n());
            e();
            return vInvoke;
        } catch (Throwable th2) {
            e();
            throw th2;
        }
    }

    @Nullable
    public final w3.d h() {
        return this.f74726i;
    }

    @NotNull
    public final w3.e i() {
        w3.e eVar = this.f74718a;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final long j() {
        return this.f74725h;
    }

    @Nullable
    public final Runnable k() {
        return this.f74720c;
    }

    public final int l() {
        return this.f74724g;
    }

    @androidx.annotation.l1
    public final int m() {
        int i10;
        synchronized (this.f74721d) {
            try {
                i10 = this.f74724g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @NotNull
    public final w3.d n() {
        synchronized (this.f74721d) {
            try {
                this.f74719b.removeCallbacks(this.f74728k);
                this.f74724g++;
                if (this.f74727j) {
                    throw new IllegalStateException("Attempting to open already closed database.");
                }
                w3.d dVar = this.f74726i;
                if (dVar != null && dVar.isOpen()) {
                    return dVar;
                }
                w3.d writableDatabase = i().getWritableDatabase();
                this.f74726i = writableDatabase;
                return writableDatabase;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(@NotNull w3.e delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        s(delegateOpenHelper);
    }

    public final boolean p() {
        return !this.f74727j;
    }

    public final void q(@NotNull Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f74720c = onAutoClose;
    }

    public final void r(@Nullable w3.d dVar) {
        this.f74726i = dVar;
    }

    public final void s(@NotNull w3.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f74718a = eVar;
    }

    public final void t(long j10) {
        this.f74725h = j10;
    }

    public final void u(@Nullable Runnable runnable) {
        this.f74720c = runnable;
    }

    public final void v(int i10) {
        this.f74724g = i10;
    }
}
