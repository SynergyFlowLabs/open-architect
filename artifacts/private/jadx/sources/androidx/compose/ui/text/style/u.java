package androidx.compose.ui.text.style;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f42245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42246d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final u f42247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final u f42248f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42250b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u a() {
            return u.f42248f;
        }

        @NotNull
        public final u b() {
            return u.f42247e;
        }

        private a() {
        }
    }

    @oj.g
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f42251b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42252c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f42253d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f42254e = e(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42255a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f42253d;
            }

            public final int b() {
                return b.f42252c;
            }

            public final int c() {
                return b.f42254e;
            }

            private a() {
            }
        }

        private /* synthetic */ b(int i10) {
            this.f42255a = i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        private static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).j();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String i(int i10) {
            if (g(i10, f42252c)) {
                return "Linearity.Linear";
            }
            if (g(i10, f42253d)) {
                return "Linearity.FontHinting";
            }
            return g(i10, f42254e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f42255a, obj);
        }

        public int hashCode() {
            return h(this.f42255a);
        }

        public final /* synthetic */ int j() {
            return this.f42255a;
        }

        @NotNull
        public String toString() {
            return i(this.f42255a);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f42245c = new a(defaultConstructorMarker);
        b.a aVar = b.f42251b;
        f42247e = new u(aVar.a(), false, defaultConstructorMarker);
        f42248f = new u(aVar.b(), true, defaultConstructorMarker);
    }

    public /* synthetic */ u(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public static /* synthetic */ u d(u uVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = uVar.f42249a;
        }
        if ((i11 & 2) != 0) {
            z10 = uVar.f42250b;
        }
        return uVar.c(i10, z10);
    }

    @NotNull
    public final u c(int i10, boolean z10) {
        return new u(i10, z10, null);
    }

    public final int e() {
        return this.f42249a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return b.g(this.f42249a, uVar.f42249a) && this.f42250b == uVar.f42250b;
    }

    public final boolean f() {
        return this.f42250b;
    }

    public int hashCode() {
        return (b.h(this.f42249a) * 31) + Boolean.hashCode(this.f42250b);
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, f42247e)) {
            return "TextMotion.Static";
        }
        return Intrinsics.areEqual(this, f42248f) ? "TextMotion.Animated" : "Invalid";
    }

    private u(int i10, boolean z10) {
        this.f42249a = i10;
        this.f42250b = z10;
    }
}
