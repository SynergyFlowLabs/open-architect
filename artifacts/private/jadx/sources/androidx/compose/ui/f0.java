package androidx.compose.ui;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSensitiveContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensitiveContent.kt\nandroidx/compose/ui/SensitiveContentNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,82:1\n57#2,4:83\n*S KotlinDebug\n*F\n+ 1 SensitiveContent.kt\nandroidx/compose/ui/SensitiveContentNode\n*L\n68#1:83,4\n*E\n"})
final class f0 extends a0.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f37334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f37335t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37336v;

    public f0(boolean z10) {
        this.f37334s = z10;
        this.f37336v = z10;
    }

    private final boolean v9() {
        return this.f37334s;
    }

    public static /* synthetic */ f0 x9(f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = f0Var.f37334s;
        }
        return f0Var.w9(z10);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        if (this.f37336v) {
            if (this.f37335t) {
                s0.a.i("invalid sensitive content state");
            }
            androidx.compose.ui.node.k.v(this).v();
            this.f37335t = true;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f37334s == ((f0) obj).f37334s;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        if (this.f37335t) {
            androidx.compose.ui.node.k.v(this).y();
            this.f37335t = false;
        }
        super.f9();
    }

    public int hashCode() {
        return Boolean.hashCode(this.f37334s);
    }

    @NotNull
    public String toString() {
        return "SensitiveContentNode(_isContentSensitive=" + this.f37334s + ')';
    }

    @NotNull
    public final f0 w9(boolean z10) {
        return new f0(z10);
    }

    public final boolean y9() {
        return this.f37336v;
    }

    public final void z9(boolean z10) {
        this.f37336v = z10;
        if (z10 && !this.f37335t) {
            androidx.compose.ui.node.k.v(this).v();
            this.f37335t = true;
        } else {
            if (z10 || !this.f37335t) {
                return;
            }
            androidx.compose.ui.node.k.v(this).y();
            this.f37335t = false;
        }
    }
}
