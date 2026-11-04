package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class k extends d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f41599k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final v0 f41600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Typeface f41603j;

    public /* synthetic */ k(v0 v0Var, int i10, u0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0Var, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.x
    @NotNull
    public final v0 a() {
        return this.f41600g;
    }

    @Override // androidx.compose.ui.text.font.x
    public final int c() {
        return this.f41601h;
    }

    @Nullable
    public abstract Typeface f(@Nullable Context context);

    @Nullable
    public abstract String g();

    @Nullable
    public final Typeface h() {
        return this.f41603j;
    }

    @Nullable
    public final Typeface i(@NotNull Context context) {
        if (!this.f41602i && this.f41603j == null) {
            this.f41603j = f(context);
        }
        this.f41602i = true;
        return this.f41603j;
    }

    public final void j(@Nullable Typeface typeface) {
        this.f41603j = typeface;
    }

    private k(v0 v0Var, int i10, u0.e eVar) {
        super(o0.f41676b.b(), l.f41606a, eVar, null);
        this.f41600g = v0Var;
        this.f41601h = i10;
    }
}
