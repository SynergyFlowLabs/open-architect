package coil.decode;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.l0;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,310:1\n1#2:311\n80#3:312\n165#3:313\n81#3:314\n82#3:319\n52#4,4:315\n60#4,10:320\n56#4,18:330\n*S KotlinDebug\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n*L\n276#1:312\n276#1:313\n276#1:314\n276#1:319\n276#1:315,4\n276#1:320,10\n276#1:330,18\n*E\n"})
public final class c0 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final v.a f87141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f87142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private okio.n f87143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function0<? extends File> f87144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private r0 f87145e;

    public c0(@NotNull okio.n nVar, @NotNull Function0<? extends File> function0, @Nullable v.a aVar) {
        super(null);
        this.f87141a = aVar;
        this.f87143c = nVar;
        this.f87144d = function0;
    }

    private final void h() {
        if (this.f87142b) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    private final r0 j() {
        Function0<? extends File> function0 = this.f87144d;
        Intrinsics.checkNotNull(function0);
        File fileInvoke = function0.invoke();
        if (!fileInvoke.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        int i10 = 6 | 0;
        return r0.a.g(r0.f335070b, File.createTempFile("tmp", null, fileInvoke), false, 1, null);
    }

    @Override // coil.decode.v
    @NotNull
    public synchronized r0 a() {
        Throwable th2;
        try {
            h();
            r0 r0Var = this.f87145e;
            if (r0Var != null) {
                return r0Var;
            }
            r0 r0VarJ = j();
            okio.m mVarD = l0.d(c().K(r0VarJ, false));
            try {
                okio.n nVar = this.f87143c;
                Intrinsics.checkNotNull(nVar);
                mVarD.Ma(nVar);
                if (mVarD != null) {
                    try {
                        mVarD.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (mVarD != null) {
                    try {
                        mVarD.close();
                    } catch (Throwable th5) {
                        kotlin.p.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            this.f87143c = null;
            this.f87145e = r0VarJ;
            this.f87144d = null;
            return r0VarJ;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override // coil.decode.v
    @Nullable
    public synchronized r0 b() {
        try {
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f87145e;
    }

    @Override // coil.decode.v
    @NotNull
    public okio.v c() {
        return okio.v.f335116b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f87142b = true;
            okio.n nVar = this.f87143c;
            if (nVar != null) {
                coil.util.l.f(nVar);
            }
            r0 r0Var = this.f87145e;
            if (r0Var != null) {
                c().q(r0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.decode.v
    @Nullable
    public v.a d() {
        return this.f87141a;
    }

    @Override // coil.decode.v
    @NotNull
    public synchronized okio.n f() {
        try {
            h();
            okio.n nVar = this.f87143c;
            if (nVar != null) {
                return nVar;
            }
            okio.v vVarC = c();
            r0 r0Var = this.f87145e;
            Intrinsics.checkNotNull(r0Var);
            okio.n nVarE = l0.e(vVarC.M(r0Var));
            this.f87143c = nVarE;
            return nVarE;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.decode.v
    @NotNull
    public okio.n g() {
        return f();
    }
}
