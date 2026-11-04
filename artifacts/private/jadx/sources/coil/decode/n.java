package coil.decode;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.l0;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/FileImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r0 f87178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final okio.v f87179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f87180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Closeable f87181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final v.a f87182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f87183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private okio.n f87184g;

    public n(@NotNull r0 r0Var, @NotNull okio.v vVar, @Nullable String str, @Nullable Closeable closeable, @Nullable v.a aVar) {
        super(null);
        this.f87178a = r0Var;
        this.f87179b = vVar;
        this.f87180c = str;
        this.f87181d = closeable;
        this.f87182e = aVar;
    }

    private final void h() {
        if (this.f87183f) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    @Override // coil.decode.v
    @NotNull
    public synchronized r0 a() {
        h();
        return this.f87178a;
    }

    @Override // coil.decode.v
    @NotNull
    public r0 b() {
        return a();
    }

    @Override // coil.decode.v
    @NotNull
    public okio.v c() {
        return this.f87179b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f87183f = true;
            okio.n nVar = this.f87184g;
            if (nVar != null) {
                coil.util.l.f(nVar);
            }
            Closeable closeable = this.f87181d;
            if (closeable != null) {
                coil.util.l.f(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.decode.v
    @Nullable
    public v.a d() {
        return this.f87182e;
    }

    @Override // coil.decode.v
    @NotNull
    public synchronized okio.n f() {
        h();
        okio.n nVar = this.f87184g;
        if (nVar != null) {
            return nVar;
        }
        okio.n nVarE = l0.e(c().M(this.f87178a));
        this.f87184g = nVarE;
        return nVarE;
    }

    @Override // coil.decode.v
    @Nullable
    public synchronized okio.n g() {
        try {
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f87184g;
    }

    @Nullable
    public final String j() {
        return this.f87180c;
    }

    @NotNull
    public final r0 l() {
        return this.f87178a;
    }
}
