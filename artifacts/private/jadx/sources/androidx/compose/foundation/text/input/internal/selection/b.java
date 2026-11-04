package androidx.compose.foundation.text.input.internal.selection;

import android.content.ClipDescription;
import androidx.compose.ui.platform.m1;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19798d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m1 f19799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19801c;

    public b(@NotNull m1 m1Var) {
        this.f19799a = m1Var;
    }

    public final boolean a() {
        return this.f19800b;
    }

    public final boolean b() {
        return this.f19801c;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        boolean z10;
        ClipDescription primaryClipDescription;
        boolean zHasPrimaryClip = this.f19799a.a().hasPrimaryClip();
        this.f19800b = zHasPrimaryClip;
        if (zHasPrimaryClip && (primaryClipDescription = this.f19799a.a().getPrimaryClipDescription()) != null) {
            z10 = primaryClipDescription.hasMimeType("text/*");
        }
        this.f19801c = z10;
        return Unit.f312394a;
    }
}
