package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f71412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f71413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.d0
    private final int f71414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f71415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f71416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f71417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f71418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f71419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f71420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f71421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private kotlin.reflect.d<?> f71422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Object f71423l;

    @SourceDebugExtension({"SMAP\nNavOptions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptions.android.kt\nandroidx/navigation/NavOptions$Builder\n*L\n1#1,481:1\n334#1:482\n208#1:483\n340#1,2:484\n*S KotlinDebug\n*F\n+ 1 NavOptions.android.kt\nandroidx/navigation/NavOptions$Builder\n*L\n-1#1:482\n-1#1:483\n-1#1:484,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f71424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f71425b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f71427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private kotlin.reflect.d<?> f71428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Object f71429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f71430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f71431h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.d0
        private int f71426c = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f71432i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f71433j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f71434k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f71435l = -1;

        public static /* synthetic */ a q(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.h(i10, z10, z11);
        }

        public static /* synthetic */ a r(a aVar, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.j(obj, z10, z11);
        }

        public static /* synthetic */ a s(a aVar, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.l(str, z10, z11);
        }

        public static /* synthetic */ a t(a aVar, kotlin.reflect.d dVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.n(dVar, z10, z11);
        }

        public static /* synthetic */ a u(a aVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            aVar.n(kotlin.jvm.internal.j1.d(Object.class), z10, z11);
            return aVar;
        }

        @NotNull
        public final w2 a() {
            String str = this.f71427d;
            if (str != null) {
                return new w2(this.f71424a, this.f71425b, str, this.f71430g, this.f71431h, this.f71432i, this.f71433j, this.f71434k, this.f71435l);
            }
            kotlin.reflect.d<?> dVar = this.f71428e;
            if (dVar != null) {
                return new w2(this.f71424a, this.f71425b, dVar, this.f71430g, this.f71431h, this.f71432i, this.f71433j, this.f71434k, this.f71435l);
            }
            Object obj = this.f71429f;
            if (obj == null) {
                return new w2(this.f71424a, this.f71425b, this.f71426c, this.f71430g, this.f71431h, this.f71432i, this.f71433j, this.f71434k, this.f71435l);
            }
            boolean z10 = this.f71424a;
            boolean z11 = this.f71425b;
            Intrinsics.checkNotNull(obj);
            return new w2(z10, z11, obj, this.f71430g, this.f71431h, this.f71432i, this.f71433j, this.f71434k, this.f71435l);
        }

        @NotNull
        public final a b(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f71432i = i10;
            return this;
        }

        @NotNull
        public final a c(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f71433j = i10;
            return this;
        }

        @NotNull
        public final a d(boolean z10) {
            this.f71424a = z10;
            return this;
        }

        @NotNull
        public final a e(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f71434k = i10;
            return this;
        }

        @NotNull
        public final a f(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f71435l = i10;
            return this;
        }

        @oj.j
        @NotNull
        public final a g(@androidx.annotation.d0 int i10, boolean z10) {
            return q(this, i10, z10, false, 4, null);
        }

        @oj.j
        @NotNull
        public final a h(@androidx.annotation.d0 int i10, boolean z10, boolean z11) {
            this.f71426c = i10;
            this.f71427d = null;
            this.f71430g = z10;
            this.f71431h = z11;
            return this;
        }

        @oj.j
        @NotNull
        public final <T> a i(@NotNull T route, boolean z10) {
            Intrinsics.checkNotNullParameter(route, "route");
            return r(this, route, z10, false, 4, null);
        }

        @oj.j
        @NotNull
        public final <T> a j(@NotNull T route, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.f71429f = route;
            h(androidx.navigation.serialization.p.k(kotlinx.serialization.m0.i(kotlin.jvm.internal.j1.d(route.getClass()))), z10, z11);
            return this;
        }

        @oj.j
        @NotNull
        public final a k(@Nullable String str, boolean z10) {
            return s(this, str, z10, false, 4, null);
        }

        @oj.j
        @NotNull
        public final a l(@Nullable String str, boolean z10, boolean z11) {
            this.f71427d = str;
            this.f71426c = -1;
            this.f71430g = z10;
            this.f71431h = z11;
            return this;
        }

        @oj.j
        @NotNull
        public final <T> a m(@NotNull kotlin.reflect.d<T> route, boolean z10) {
            Intrinsics.checkNotNullParameter(route, "route");
            int i10 = 2 | 0;
            return t(this, route, z10, false, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.j
        @NotNull
        public final <T> a n(@NotNull kotlin.reflect.d<T> route, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.f71428e = route;
            this.f71426c = -1;
            this.f71430g = z10;
            this.f71431h = z11;
            return this;
        }

        @oj.j
        public final /* synthetic */ <T> a o(boolean z10) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            n(kotlin.jvm.internal.j1.d(Object.class), z10, false);
            return this;
        }

        @oj.j
        public final /* synthetic */ <T> a p(boolean z10, boolean z11) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            n(kotlin.jvm.internal.j1.d(Object.class), z10, z11);
            return this;
        }

        @NotNull
        public final a v(boolean z10) {
            this.f71425b = z10;
            return this;
        }
    }

    public w2(boolean z10, boolean z11, @androidx.annotation.d0 int i10, boolean z12, boolean z13, @androidx.annotation.a @androidx.annotation.b int i11, @androidx.annotation.a @androidx.annotation.b int i12, @androidx.annotation.a @androidx.annotation.b int i13, @androidx.annotation.a @androidx.annotation.b int i14) {
        this.f71412a = z10;
        this.f71413b = z11;
        this.f71414c = i10;
        this.f71415d = z12;
        this.f71416e = z13;
        this.f71417f = i11;
        this.f71418g = i12;
        this.f71419h = i13;
        this.f71420i = i14;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int a() {
        return this.f71417f;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int b() {
        return this.f71418g;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int c() {
        return this.f71419h;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int d() {
        return this.f71420i;
    }

    @androidx.annotation.d0
    @kotlin.l(message = "Use popUpToId instead.", replaceWith = @kotlin.b1(expression = "popUpToId", imports = {}))
    public final int e() {
        return this.f71414c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof w2)) {
            w2 w2Var = (w2) obj;
            if (this.f71412a == w2Var.f71412a && this.f71413b == w2Var.f71413b && this.f71414c == w2Var.f71414c && Intrinsics.areEqual(this.f71421j, w2Var.f71421j) && Intrinsics.areEqual(this.f71422k, w2Var.f71422k) && Intrinsics.areEqual(this.f71423l, w2Var.f71423l) && this.f71415d == w2Var.f71415d && this.f71416e == w2Var.f71416e && this.f71417f == w2Var.f71417f && this.f71418g == w2Var.f71418g && this.f71419h == w2Var.f71419h && this.f71420i == w2Var.f71420i) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.d0
    public final int f() {
        return this.f71414c;
    }

    @Nullable
    public final String g() {
        return this.f71421j;
    }

    @Nullable
    public final kotlin.reflect.d<?> h() {
        return this.f71422k;
    }

    public int hashCode() {
        int i10 = (((((k() ? 1 : 0) * 31) + (m() ? 1 : 0)) * 31) + this.f71414c) * 31;
        String str = this.f71421j;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        kotlin.reflect.d<?> dVar = this.f71422k;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.f71423l;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (j() ? 1 : 0)) * 31) + (l() ? 1 : 0)) * 31) + this.f71417f) * 31) + this.f71418g) * 31) + this.f71419h) * 31) + this.f71420i;
    }

    @Nullable
    public final Object i() {
        return this.f71423l;
    }

    public final boolean j() {
        return this.f71415d;
    }

    public final boolean k() {
        return this.f71412a;
    }

    public final boolean l() {
        return this.f71416e;
    }

    public final boolean m() {
        return this.f71413b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w2.class.getSimpleName());
        sb2.append("(");
        if (this.f71412a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f71413b) {
            sb2.append("restoreState ");
        }
        String str = this.f71421j;
        if ((str != null || this.f71414c != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.f71421j;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                kotlin.reflect.d<?> dVar = this.f71422k;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.f71423l;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.f71414c));
                    }
                }
            }
            if (this.f71415d) {
                sb2.append(" inclusive");
            }
            if (this.f71416e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.f71417f != -1 || this.f71418g != -1 || this.f71419h != -1 || this.f71420i != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f71417f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f71418g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f71419h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f71420i));
            sb2.append(")");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public w2(boolean z10, boolean z11, @Nullable String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, y1.f71443f.c(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f71421j = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w2(boolean z10, boolean z11, @Nullable kotlin.reflect.d<?> dVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, androidx.navigation.serialization.p.k(kotlinx.serialization.m0.i(dVar)), z12, z13, i10, i11, i12, i13);
        Intrinsics.checkNotNull(dVar);
        this.f71422k = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w2(boolean z10, boolean z11, @NotNull Object popUpToRouteObject, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, androidx.navigation.serialization.p.k(kotlinx.serialization.m0.i(kotlin.jvm.internal.j1.d(popUpToRouteObject.getClass()))), z12, z13, i10, i11, i12, i13);
        Intrinsics.checkNotNullParameter(popUpToRouteObject, "popUpToRouteObject");
        this.f71423l = popUpToRouteObject;
    }
}
