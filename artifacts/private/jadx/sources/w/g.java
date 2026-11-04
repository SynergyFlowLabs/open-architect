package w;

import androidx.compose.foundation.b2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.l1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@b2
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f385806e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k1 f385807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1 f385808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f385809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final b f385810d;

    @oj.g
    @b2
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C2523a f385811b = new C2523a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f385812c = e(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f385813d = e(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f385814e = e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f385815a;

        /* JADX INFO: renamed from: w.g$a$a, reason: collision with other inner class name */
        public static final class C2523a {
            public /* synthetic */ C2523a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f385814e;
            }

            public final int b() {
                return a.f385813d;
            }

            public final int c() {
                return a.f385812c;
            }

            private C2523a() {
            }
        }

        private /* synthetic */ a(int i10) {
            this.f385815a = i10;
        }

        public static final /* synthetic */ a d(int i10) {
            return new a(i10);
        }

        public static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).j();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String i(int i10) {
            if (g(i10, f385812c)) {
                return "Source.Keyboard";
            }
            if (g(i10, f385813d)) {
                return "Source.DragAndDrop";
            }
            if (g(i10, f385814e)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return f(this.f385815a, obj);
        }

        public int hashCode() {
            return h(this.f385815a);
        }

        public final /* synthetic */ int j() {
            return this.f385815a;
        }

        @NotNull
        public String toString() {
            return i(this.f385815a);
        }
    }

    public /* synthetic */ g(k1 k1Var, l1 l1Var, int i10, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(k1Var, l1Var, i10, bVar);
    }

    @NotNull
    public final k1 a() {
        return this.f385807a;
    }

    @NotNull
    public final l1 b() {
        return this.f385808b;
    }

    @Nullable
    public final b c() {
        return this.f385810d;
    }

    public final int d() {
        return this.f385809c;
    }

    private g(k1 k1Var, l1 l1Var, int i10, b bVar) {
        this.f385807a = k1Var;
        this.f385808b = l1Var;
        this.f385809c = i10;
        this.f385810d = bVar;
    }

    public /* synthetic */ g(k1 k1Var, l1 l1Var, int i10, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(k1Var, l1Var, i10, (i11 & 8) != 0 ? null : bVar, null);
    }
}
