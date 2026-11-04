package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
public final class z3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21810h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function1<y3, Unit> f21812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function1<y3, Unit> f21813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<y3, Unit> f21814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<y3, Unit> f21815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function1<y3, Unit> f21816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Function1<y3, Unit> f21817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f21809g = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final z3 f21811i = new z3(null, null, null, null, null, null, 63, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final z3 a() {
            return z3.f21811i;
        }

        private a() {
        }
    }

    public z3() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Nullable
    public final Function1<y3, Unit> b() {
        return this.f21812a;
    }

    @Nullable
    public final Function1<y3, Unit> c() {
        return this.f21813b;
    }

    @Nullable
    public final Function1<y3, Unit> d() {
        return this.f21814c;
    }

    @Nullable
    public final Function1<y3, Unit> e() {
        return this.f21815d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.f21812a == z3Var.f21812a && this.f21813b == z3Var.f21813b && this.f21814c == z3Var.f21814c && this.f21815d == z3Var.f21815d && this.f21816e == z3Var.f21816e && this.f21817f == z3Var.f21817f;
    }

    @Nullable
    public final Function1<y3, Unit> f() {
        return this.f21816e;
    }

    @Nullable
    public final Function1<y3, Unit> g() {
        return this.f21817f;
    }

    public int hashCode() {
        Function1<y3, Unit> function1 = this.f21812a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<y3, Unit> function2 = this.f21813b;
        int iHashCode2 = (iHashCode + (function2 != null ? function2.hashCode() : 0)) * 31;
        Function1<y3, Unit> function3 = this.f21814c;
        int iHashCode3 = (iHashCode2 + (function3 != null ? function3.hashCode() : 0)) * 31;
        Function1<y3, Unit> function4 = this.f21815d;
        int iHashCode4 = (iHashCode3 + (function4 != null ? function4.hashCode() : 0)) * 31;
        Function1<y3, Unit> function5 = this.f21816e;
        int iHashCode5 = (iHashCode4 + (function5 != null ? function5.hashCode() : 0)) * 31;
        Function1<y3, Unit> function6 = this.f21817f;
        return iHashCode5 + (function6 != null ? function6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z3(@Nullable Function1<? super y3, Unit> function1, @Nullable Function1<? super y3, Unit> function2, @Nullable Function1<? super y3, Unit> function3, @Nullable Function1<? super y3, Unit> function4, @Nullable Function1<? super y3, Unit> function5, @Nullable Function1<? super y3, Unit> function6) {
        this.f21812a = function1;
        this.f21813b = function2;
        this.f21814c = function3;
        this.f21815d = function4;
        this.f21816e = function5;
        this.f21817f = function6;
    }

    public /* synthetic */ z3(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function2, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? null : function4, (i10 & 16) != 0 ? null : function5, (i10 & 32) != 0 ? null : function6);
    }
}
