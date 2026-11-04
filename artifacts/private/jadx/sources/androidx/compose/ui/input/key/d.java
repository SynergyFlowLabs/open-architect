package androidx.compose.ui.input.key;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38913b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38914c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38915d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38916e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38917a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f38916e;
        }

        public final int b() {
            return d.f38915d;
        }

        public final int c() {
            return d.f38914c;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f38917a = i10;
    }

    public static final /* synthetic */ d d(int i10) {
        return new d(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f38915d)) {
            return "KeyUp";
        }
        if (g(i10, f38916e)) {
            return "KeyDown";
        }
        return g(i10, f38914c) ? com.facebook.internal.a.f99697t : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f38917a, obj);
    }

    public int hashCode() {
        return h(this.f38917a);
    }

    public final /* synthetic */ int j() {
        return this.f38917a;
    }

    @NotNull
    public String toString() {
        return i(this.f38917a);
    }
}
