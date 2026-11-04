package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class c extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41559n = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final File f41560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final String f41561m;

    public /* synthetic */ c(File file, v0 v0Var, int i10, u0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, v0Var, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.k
    @Nullable
    public Typeface f(@Nullable Context context) {
        return o1.f41681a.b(this.f41560l, context, e());
    }

    @Override // androidx.compose.ui.text.font.k
    @Nullable
    public String g() {
        return this.f41561m;
    }

    @NotNull
    public final File k() {
        return this.f41560l;
    }

    @NotNull
    public String toString() {
        return "Font(file=" + this.f41560l + ", weight=" + a() + ", style=" + ((Object) q0.i(c())) + ')';
    }

    public /* synthetic */ c(File file, v0 v0Var, int i10, u0.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? v0.f41742b.m() : v0Var, (i11 & 4) != 0 ? q0.f41690b.c() : i10, eVar, null);
    }

    private c(File file, v0 v0Var, int i10, u0.e eVar) {
        super(v0Var, i10, eVar, null);
        this.f41560l = file;
        j(f(null));
    }
}
