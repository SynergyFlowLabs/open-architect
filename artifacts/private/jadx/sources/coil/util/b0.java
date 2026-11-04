package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.l1;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSystemCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n+ 2 Logs.kt\ncoil/util/-Logs\n*L\n1#1,98:1\n89#1,2:99\n89#1,2:101\n89#1,2:103\n89#1:105\n90#1:110\n89#1:111\n90#1:116\n21#2,4:106\n21#2,4:112\n*S KotlinDebug\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n*L\n39#1:99,2\n48#1:101,2\n71#1:103,2\n74#1:105\n74#1:110\n83#1:111\n83#1:116\n75#1:106,4\n84#1:112,4\n*E\n"})
public final class b0 implements ComponentCallbacks2, coil.network.g.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f87809f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f87810g = "NetworkObserver";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f87811h = "ONLINE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f87812i = "OFFLINE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<coil.m> f87813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Context f87814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private coil.network.g f87815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f87816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f87817e = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b0(@NotNull coil.m mVar) {
        this.f87813a = new WeakReference<>(mVar);
    }

    @l1
    public static /* synthetic */ void c() {
    }

    @l1
    public static /* synthetic */ void e() {
    }

    private final synchronized void h() {
        try {
            coil.m mVar = this.f87813a.get();
            if (mVar == null) {
                j();
            } else if (this.f87815c == null) {
                coil.network.g gVarA = mVar.s().f() ? coil.network.h.a(mVar.l(), this, mVar.p()) : new coil.network.e();
                this.f87815c = gVarA;
                this.f87817e = gVarA.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void k(Function1<? super coil.m, Unit> function1) {
        coil.m mVar = this.f87813a.get();
        if (mVar != null) {
            function1.invoke(mVar);
        } else {
            j();
        }
    }

    @Override // coil.network.g.a
    public synchronized void a(boolean z10) {
        try {
            coil.m mVar = this.f87813a.get();
            if (mVar != null) {
                z zVarP = mVar.p();
                if (zVarP != null && zVarP.g() <= 4) {
                    zVarP.h(f87810g, 4, z10 ? f87811h : f87812i, null);
                }
                this.f87817e = z10;
            } else {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final WeakReference<coil.m> b() {
        return this.f87813a;
    }

    public final boolean d() {
        return this.f87816d;
    }

    public final synchronized boolean f() {
        h();
        return this.f87817e;
    }

    public final synchronized void g() {
        try {
            coil.m mVar = this.f87813a.get();
            if (mVar == null) {
                j();
            } else if (this.f87814b == null) {
                Context contextL = mVar.l();
                this.f87814b = contextL;
                contextL.registerComponentCallbacks(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(boolean z10) {
        this.f87816d = z10;
    }

    public final synchronized void j() {
        try {
            if (this.f87816d) {
                return;
            }
            this.f87816d = true;
            Context context = this.f87814b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            coil.network.g gVar = this.f87815c;
            if (gVar != null) {
                gVar.shutdown();
            }
            this.f87813a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(@NotNull Configuration configuration) {
        try {
            if (this.f87813a.get() == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int i10) {
        try {
            coil.m mVar = this.f87813a.get();
            if (mVar != null) {
                z zVarP = mVar.p();
                if (zVarP != null && zVarP.g() <= 2) {
                    zVarP.h(f87810g, 2, "trimMemory, level=" + i10, null);
                }
                mVar.w(i10);
            } else {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
