package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f75052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l0 f75053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Executor f75054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f75055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f75056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0.c f75057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private f0 f75058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final e0 f75059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f75060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final ServiceConnection f75061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Runnable f75062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Runnable f75063l;

    @SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient$1\n*L\n102#1:131,2\n*E\n"})
    public static final class a extends l0.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.l0.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.l0.c
        public void c(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (r0.this.m().get()) {
                return;
            }
            try {
                f0 f0VarJ = r0.this.j();
                if (f0VarJ != null) {
                    f0VarJ.Nb(r0.this.d(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public static final class b extends e0.b {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(r0 this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.f().p((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.e0
        public void p2(@NotNull final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor executorE = r0.this.e();
            final r0 r0Var = r0.this;
            executorE.execute(new Runnable() { // from class: androidx.room.s0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.b.n(r0Var, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            r0.this.q(f0.b.i(service));
            r0.this.e().execute(r0.this.l());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            r0.this.e().execute(r0.this.i());
            r0.this.q(null);
        }
    }

    public r0(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull l0 invalidationTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f75052a = name;
        this.f75053b = invalidationTracker;
        this.f75054c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f75055d = applicationContext;
        this.f75059h = new b();
        this.f75060i = new AtomicBoolean(false);
        c cVar = new c();
        this.f75061j = cVar;
        this.f75062k = new Runnable() { // from class: androidx.room.p0
            @Override // java.lang.Runnable
            public final void run() {
                r0.r(this.f75035a);
            }
        };
        this.f75063l = new Runnable() { // from class: androidx.room.q0
            @Override // java.lang.Runnable
            public final void run() {
                r0.n(this.f75048a);
            }
        };
        p(new a((String[]) invalidationTracker.m().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f75053b.t(this$0.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(r0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            f0 f0Var = this$0.f75058g;
            if (f0Var != null) {
                this$0.f75056e = f0Var.Xc(this$0.f75059h, this$0.f75052a);
                this$0.f75053b.c(this$0.h());
            }
        } catch (RemoteException unused) {
        }
    }

    @NotNull
    public final e0 c() {
        return this.f75059h;
    }

    public final int d() {
        return this.f75056e;
    }

    @NotNull
    public final Executor e() {
        return this.f75054c;
    }

    @NotNull
    public final l0 f() {
        return this.f75053b;
    }

    @NotNull
    public final String g() {
        return this.f75052a;
    }

    @NotNull
    public final l0.c h() {
        l0.c cVar = this.f75057f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @NotNull
    public final Runnable i() {
        return this.f75063l;
    }

    @Nullable
    public final f0 j() {
        return this.f75058g;
    }

    @NotNull
    public final ServiceConnection k() {
        return this.f75061j;
    }

    @NotNull
    public final Runnable l() {
        return this.f75062k;
    }

    @NotNull
    public final AtomicBoolean m() {
        return this.f75060i;
    }

    public final void o(int i10) {
        this.f75056e = i10;
    }

    public final void p(@NotNull l0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f75057f = cVar;
    }

    public final void q(@Nullable f0 f0Var) {
        this.f75058g = f0Var;
    }

    public final void s() {
        if (this.f75060i.compareAndSet(false, true)) {
            this.f75053b.t(h());
            try {
                f0 f0Var = this.f75058g;
                if (f0Var != null) {
                    f0Var.lf(this.f75059h, this.f75056e);
                }
            } catch (RemoteException unused) {
            }
            this.f75055d.unbindService(this.f75061j);
        }
    }
}
