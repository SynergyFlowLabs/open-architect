package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14592a = 0;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a extends g3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f14593b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14594c = 0;

        private a() {
            super(null);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b extends g3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14595c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.input.pointer.c0 f14596b;

        public b(@NotNull androidx.compose.ui.input.pointer.c0 c0Var) {
            super(null);
            this.f14596b = c0Var;
        }

        @NotNull
        public final androidx.compose.ui.input.pointer.c0 a() {
            return this.f14596b;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class c extends g3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f14597b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14598c = 0;

        private c() {
            super(null);
        }
    }

    public /* synthetic */ g3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g3() {
    }
}
