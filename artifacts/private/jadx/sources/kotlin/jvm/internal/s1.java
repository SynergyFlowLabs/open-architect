package kotlin.jvm.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.e1(version = "1.4")
@SourceDebugExtension({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class s1 implements kotlin.reflect.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f312797f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f312798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f312799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.u f312800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f312801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private volatile List<? extends kotlin.reflect.s> f312802e;

    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.s1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2259a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f312803a;

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
                f312803a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull kotlin.reflect.t typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C2259a.f312803a[typeParameter.j().ordinal()];
            if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        private a() {
        }
    }

    public s1(@Nullable Object obj, @NotNull String name, @NotNull kotlin.reflect.u variance, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.f312798a = obj;
        this.f312799b = name;
        this.f312800c = variance;
        this.f312801d = z10;
    }

    public static /* synthetic */ void a() {
    }

    public final void b(@NotNull List<? extends kotlin.reflect.s> upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.f312802e == null) {
            this.f312802e = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (Intrinsics.areEqual(this.f312798a, s1Var.f312798a) && Intrinsics.areEqual(getName(), s1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.t
    public boolean g() {
        return this.f312801d;
    }

    @Override // kotlin.reflect.t
    @NotNull
    public String getName() {
        return this.f312799b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.t
    @NotNull
    public List<kotlin.reflect.s> getUpperBounds() {
        List list = this.f312802e;
        List list2 = list;
        if (list == null) {
            List listListOf = CollectionsKt.listOf(j1.n(Object.class));
            this.f312802e = listListOf;
            list2 = listListOf;
        }
        return list2;
    }

    public int hashCode() {
        Object obj = this.f312798a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.t
    @NotNull
    public kotlin.reflect.u j() {
        return this.f312800c;
    }

    @NotNull
    public String toString() {
        return f312797f.a(this);
    }
}
