package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreviewUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/ThreadSafeException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42500c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Throwable f42501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f42502b = new Object();

    public final void a(@NotNull Throwable th2) {
        synchronized (this.f42502b) {
            this.f42501a = th2;
            Unit unit = Unit.f312394a;
        }
    }

    public final void b() {
        synchronized (this.f42502b) {
            Throwable th2 = this.f42501a;
            if (th2 != null) {
                this.f42501a = null;
                throw th2;
            }
        }
    }
}
