package coil.decode;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f87163c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final i f87164d = new i(false, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f87165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f87166b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(boolean z10, int i10) {
        this.f87165a = z10;
        this.f87166b = i10;
    }

    public final int a() {
        return this.f87166b;
    }

    public final boolean b() {
        return this.f87165a;
    }
}
