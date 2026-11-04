package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f9989e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Resources, Boolean> f9993d;

    public static final class a {

        /* JADX INFO: renamed from: androidx.activity.r0$a$a, reason: collision with other inner class name */
        static final class C0026a extends kotlin.jvm.internal.l0 implements Function1<Resources, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0026a f9994a = new C0026a();

            C0026a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function1<Resources, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f9995a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function1<Resources, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f9996a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ r0 c(a aVar, int i10, int i11, Function1 function1, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                function1 = C0026a.f9994a;
            }
            return aVar.b(i10, i11, function1);
        }

        @oj.j
        @oj.n
        @NotNull
        public final r0 a(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
            return c(this, i10, i11, null, 4, null);
        }

        @oj.j
        @oj.n
        @NotNull
        public final r0 b(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @NotNull Function1<? super Resources, Boolean> detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new r0(i10, i11, 0, detectDarkMode, null);
        }

        @oj.n
        @NotNull
        public final r0 d(@androidx.annotation.l int i10) {
            return new r0(i10, i10, 2, b.f9995a, null);
        }

        @oj.n
        @NotNull
        public final r0 e(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
            return new r0(i10, i11, 1, c.f9996a, null);
        }

        private a() {
        }
    }

    public /* synthetic */ r0(int i10, int i11, int i12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, function1);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final r0 a(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        return f9989e.a(i10, i11);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final r0 b(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @NotNull Function1<? super Resources, Boolean> function1) {
        return f9989e.b(i10, i11, function1);
    }

    @oj.n
    @NotNull
    public static final r0 c(@androidx.annotation.l int i10) {
        return f9989e.d(i10);
    }

    @oj.n
    @NotNull
    public static final r0 i(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        return f9989e.e(i10, i11);
    }

    public final int d() {
        return this.f9991b;
    }

    @NotNull
    public final Function1<Resources, Boolean> e() {
        return this.f9993d;
    }

    public final int f() {
        return this.f9992c;
    }

    public final int g(boolean z10) {
        return z10 ? this.f9991b : this.f9990a;
    }

    public final int h(boolean z10) {
        if (this.f9992c == 0) {
            return 0;
        }
        return z10 ? this.f9991b : this.f9990a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r0(int i10, int i11, int i12, Function1<? super Resources, Boolean> function1) {
        this.f9990a = i10;
        this.f9991b = i11;
        this.f9992c = i12;
        this.f9993d = function1;
    }
}
