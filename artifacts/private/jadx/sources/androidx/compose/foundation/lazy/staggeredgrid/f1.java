package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17825c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f17824b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final f1 f17826d = new f1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final f1 f17827e = new f1(1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f1 a() {
            return f1.f17826d;
        }

        @NotNull
        public final f1 b() {
            return f1.f17827e;
        }

        private a() {
        }
    }

    private f1(int i10) {
        this.f17828a = i10;
    }

    public final int c() {
        return this.f17828a;
    }
}
