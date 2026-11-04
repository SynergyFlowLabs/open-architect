package androidx.compose.ui.text.font;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.o2;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public abstract class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41771c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41770b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final m1 f41772d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final z0 f41773e = new z0("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final z0 f41774f = new z0("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final z0 f41775g = new z0("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final z0 f41776h = new z0("cursive", "FontFamily.Cursive");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final z0 a() {
            return y.f41776h;
        }

        @NotNull
        public final m1 b() {
            return y.f41772d;
        }

        @NotNull
        public final z0 c() {
            return y.f41775g;
        }

        @NotNull
        public final z0 d() {
            return y.f41773e;
        }

        @NotNull
        public final z0 e() {
            return y.f41774f;
        }

        private a() {
        }
    }

    public interface b {
        static /* synthetic */ n7 c(b bVar, y yVar, v0 v0Var, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                yVar = null;
            }
            if ((i12 & 2) != 0) {
                v0Var = v0.f41742b.m();
            }
            if ((i12 & 4) != 0) {
                i10 = q0.f41690b.c();
            }
            if ((i12 & 8) != 0) {
                i11 = r0.f41699b.a();
            }
            return bVar.b(yVar, v0Var, i10, i11);
        }

        @Nullable
        Object a(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

        @NotNull
        n7<Object> b(@Nullable y yVar, @NotNull v0 v0Var, int i10, int i11);
    }

    public /* synthetic */ y(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public static /* synthetic */ void p() {
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean n() {
        return this.f41777a;
    }

    private y(boolean z10) {
        this.f41777a = z10;
    }
}
