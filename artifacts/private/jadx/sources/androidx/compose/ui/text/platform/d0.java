package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.n7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n7<Object> f42068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final d0 f42069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f42070c;

    public d0(@NotNull n7<? extends Object> n7Var, @Nullable d0 d0Var) {
        this.f42068a = n7Var;
        this.f42069b = d0Var;
        this.f42070c = n7Var.getValue();
    }

    @NotNull
    public final Object a() {
        return this.f42070c;
    }

    @NotNull
    public final Typeface b() {
        Object obj = this.f42070c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean c() {
        if (this.f42068a.getValue() != this.f42070c) {
            return true;
        }
        d0 d0Var = this.f42069b;
        return d0Var != null && d0Var.c();
    }

    public /* synthetic */ d0(n7 n7Var, d0 d0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n7Var, (i10 & 2) != 0 ? null : d0Var);
    }
}
