package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
abstract class i5 {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a extends i5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f14613d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f14614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f14615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f14616c;

        public /* synthetic */ a(float f10, long j10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, j10, f11);
        }

        public final long a() {
            return this.f14615b;
        }

        public final float b() {
            return this.f14616c;
        }

        public final float c() {
            return this.f14614a;
        }

        private a(float f10, long j10, float f11) {
            super(null);
            this.f14614a = f10;
            this.f14615b = j10;
            this.f14616c = f11;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b extends i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f14617a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f14618b = 0;

        private b() {
            super(null);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class c extends i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f14619a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f14620b = 0;

        private c() {
            super(null);
        }
    }

    public /* synthetic */ i5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i5() {
    }
}
