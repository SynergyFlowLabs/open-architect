package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.p2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f14666v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f14667w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final Object f14668s = f14666v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14669t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j4(boolean z10) {
        this.f14669t = z10;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return this.f14668s;
    }

    public final boolean v9() {
        return this.f14669t;
    }

    public final void w9(boolean z10) {
        this.f14669t = z10;
    }
}
