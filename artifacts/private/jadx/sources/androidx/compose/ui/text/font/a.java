package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a extends k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f41548o = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final AssetManager f41549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final String f41550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f41551n;

    public /* synthetic */ a(AssetManager assetManager, String str, v0 v0Var, int i10, u0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, v0Var, i10, eVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f41550m, aVar.f41550m) && Intrinsics.areEqual(e(), aVar.e());
    }

    @Override // androidx.compose.ui.text.font.k
    @Nullable
    public Typeface f(@Nullable Context context) {
        return o1.f41681a.a(this.f41549l, this.f41550m, context, e());
    }

    @Override // androidx.compose.ui.text.font.k
    @NotNull
    public String g() {
        return this.f41551n;
    }

    public int hashCode() {
        return (this.f41550m.hashCode() * 31) + e().hashCode();
    }

    @NotNull
    public final AssetManager k() {
        return this.f41549l;
    }

    @NotNull
    public final String l() {
        return this.f41550m;
    }

    @NotNull
    public String toString() {
        return "Font(assetManager, path=" + this.f41550m + ", weight=" + a() + ", style=" + ((Object) q0.i(c())) + ')';
    }

    public /* synthetic */ a(AssetManager assetManager, String str, v0 v0Var, int i10, u0.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i11 & 4) != 0 ? v0.f41742b.m() : v0Var, (i11 & 8) != 0 ? q0.f41690b.c() : i10, eVar, null);
    }

    private a(AssetManager assetManager, String str, v0 v0Var, int i10, u0.e eVar) {
        super(v0Var, i10, eVar, null);
        this.f41549l = assetManager;
        this.f41550m = str;
        j(f(null));
        this.f41551n = "asset:" + str;
    }
}
