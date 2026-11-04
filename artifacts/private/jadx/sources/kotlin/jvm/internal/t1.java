package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.e1(version = "1.4")
public final class t1 implements kotlin.reflect.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312804e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f312805f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f312806g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f312807h = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.g f312808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<KTypeProjection> f312809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final kotlin.reflect.s f312810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f312811d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312812a;

        static {
            int[] iArr = new int[kotlin.reflect.u.values().length];
            try {
                iArr[kotlin.reflect.u.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.u.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f312812a = iArr;
        }
    }

    static final class c extends l0 implements Function1<KTypeProjection, CharSequence> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(KTypeProjection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return t1.this.j(it);
        }
    }

    @kotlin.e1(version = "1.6")
    public t1(@NotNull kotlin.reflect.g classifier, @NotNull List<KTypeProjection> arguments, @Nullable kotlin.reflect.s sVar, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f312808a = classifier;
        this.f312809b = arguments;
        this.f312810c = sVar;
        this.f312811d = i10;
    }

    @kotlin.e1(version = "1.6")
    public static /* synthetic */ void D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.h() == null) {
            return "*";
        }
        kotlin.reflect.s sVarG = kTypeProjection.g();
        t1 t1Var = sVarG instanceof t1 ? (t1) sVarG : null;
        if (t1Var == null || (strValueOf = t1Var.l(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.g());
        }
        int i10 = b.f312812a[kTypeProjection.h().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new kotlin.k0();
        }
        return "out " + strValueOf;
    }

    private final String l(boolean z10) {
        String name;
        String strJoinToString$default;
        kotlin.reflect.g gVarJ = J();
        kotlin.reflect.d dVar = gVarJ instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVarJ : null;
        Class<?> clsE = dVar != null ? oj.b.e(dVar) : null;
        if (clsE == null) {
            name = J().toString();
        } else if ((this.f312811d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsE.isArray()) {
            name = p(clsE);
        } else if (z10 && clsE.isPrimitive()) {
            kotlin.reflect.g gVarJ2 = J();
            Intrinsics.checkNotNull(gVarJ2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = oj.b.g((kotlin.reflect.d) gVarJ2).getName();
        } else {
            name = clsE.getName();
        }
        if (d().isEmpty()) {
            strJoinToString$default = "";
        } else {
            boolean z11 = true | false;
            strJoinToString$default = CollectionsKt.joinToString$default(d(), ", ", "<", ">", 0, null, new c(), 24, null);
        }
        String str = name + strJoinToString$default + (A() ? com.planner5d.library.model.payments.a.f222474i : "");
        kotlin.reflect.s sVar = this.f312810c;
        if (sVar instanceof t1) {
            String strL = ((t1) sVar).l(true);
            if (!Intrinsics.areEqual(strL, str)) {
                if (Intrinsics.areEqual(strL, str + '?')) {
                    return str + '!';
                }
                return '(' + str + ".." + strL + ')';
            }
        }
        return str;
    }

    private final String p(Class<?> cls) {
        if (Intrinsics.areEqual(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.areEqual(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.areEqual(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.areEqual(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.areEqual(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.areEqual(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.areEqual(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : kotlinx.serialization.internal.w.f316037a;
    }

    @kotlin.e1(version = "1.6")
    public static /* synthetic */ void r() {
    }

    @Override // kotlin.reflect.s
    public boolean A() {
        return (this.f312811d & 1) != 0;
    }

    @Override // kotlin.reflect.s
    @NotNull
    public kotlin.reflect.g J() {
        return this.f312808a;
    }

    @Override // kotlin.reflect.s
    @NotNull
    public List<KTypeProjection> d() {
        return this.f312809b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (Intrinsics.areEqual(J(), t1Var.J()) && Intrinsics.areEqual(d(), t1Var.d()) && Intrinsics.areEqual(this.f312810c, t1Var.f312810c) && this.f312811d == t1Var.f312811d) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @NotNull
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        return (((J().hashCode() * 31) + d().hashCode()) * 31) + Integer.hashCode(this.f312811d);
    }

    public final int q() {
        return this.f312811d;
    }

    @Nullable
    public final kotlin.reflect.s t() {
        return this.f312810c;
    }

    @NotNull
    public String toString() {
        return l(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull kotlin.reflect.g classifier, @NotNull List<KTypeProjection> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
