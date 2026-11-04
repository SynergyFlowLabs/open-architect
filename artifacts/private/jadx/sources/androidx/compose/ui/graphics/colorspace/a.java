package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d f37566b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f37567c = new C0284a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f37568d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f37569e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f37570a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$a, reason: collision with other inner class name */
    public static final class C0284a extends a {
        C0284a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    public static final class b extends a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    public static final class c extends a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            return a.f37567c;
        }

        @NotNull
        public final a b() {
            return a.f37569e;
        }

        @NotNull
        public final a c() {
            return a.f37568d;
        }

        private d() {
        }
    }

    public /* synthetic */ a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    @NotNull
    public final float[] d() {
        return this.f37570a;
    }

    private a(float[] fArr) {
        this.f37570a = fArr;
    }
}
