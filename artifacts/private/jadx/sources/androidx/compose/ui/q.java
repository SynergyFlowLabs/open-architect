package androidx.compose.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f40995b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f40996c = e(Float.NaN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f40997d = e(-3.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f40998e = e(-4.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f40999a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return q.f40996c;
        }

        public final float b() {
            return q.f40998e;
        }

        public final float c() {
            return q.f40997d;
        }

        private a() {
        }
    }

    private /* synthetic */ q(float f10) {
        this.f40999a = f10;
    }

    public static final /* synthetic */ q d(float f10) {
        return new q(f10);
    }

    private static float e(float f10) {
        return f10;
    }

    public static boolean f(float f10, Object obj) {
        return (obj instanceof q) && Float.compare(f10, ((q) obj).j()) == 0;
    }

    public static final boolean g(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int h(float f10) {
        return Float.hashCode(f10);
    }

    @NotNull
    public static String i(float f10) {
        if (f10 == -3.0f) {
            return "Normal";
        }
        return f10 == -4.0f ? "High" : "Default";
    }

    public boolean equals(Object obj) {
        return f(this.f40999a, obj);
    }

    public int hashCode() {
        return h(this.f40999a);
    }

    public final /* synthetic */ float j() {
        return this.f40999a;
    }

    @NotNull
    public String toString() {
        return i(this.f40999a);
    }
}
