package kotlin.reflect;

import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
public final class KTypeProjection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f312969c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final KTypeProjection f312970d = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final u f312971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final s f312972b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @a1
        public static /* synthetic */ void d() {
        }

        @oj.n
        @NotNull
        public final KTypeProjection a(@NotNull s type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(u.IN, type);
        }

        @oj.n
        @NotNull
        public final KTypeProjection b(@NotNull s type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(u.OUT, type);
        }

        @NotNull
        public final KTypeProjection c() {
            return KTypeProjection.f312970d;
        }

        @oj.n
        @NotNull
        public final KTypeProjection e(@NotNull s type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(u.INVARIANT, type);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312973a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f312973a = iArr;
        }
    }

    public KTypeProjection(@Nullable u uVar, @Nullable s sVar) {
        String str;
        this.f312971a = uVar;
        this.f312972b = sVar;
        if ((uVar == null) == (sVar == null)) {
            return;
        }
        if (uVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + uVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @oj.n
    @NotNull
    public static final KTypeProjection c(@NotNull s sVar) {
        return f312969c.a(sVar);
    }

    public static /* synthetic */ KTypeProjection e(KTypeProjection kTypeProjection, u uVar, s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uVar = kTypeProjection.f312971a;
        }
        if ((i10 & 2) != 0) {
            sVar = kTypeProjection.f312972b;
        }
        return kTypeProjection.d(uVar, sVar);
    }

    @oj.n
    @NotNull
    public static final KTypeProjection f(@NotNull s sVar) {
        return f312969c.b(sVar);
    }

    @oj.n
    @NotNull
    public static final KTypeProjection i(@NotNull s sVar) {
        return f312969c.e(sVar);
    }

    @Nullable
    public final u a() {
        return this.f312971a;
    }

    @Nullable
    public final s b() {
        return this.f312972b;
    }

    @NotNull
    public final KTypeProjection d(@Nullable u uVar, @Nullable s sVar) {
        return new KTypeProjection(uVar, sVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f312971a == kTypeProjection.f312971a && Intrinsics.areEqual(this.f312972b, kTypeProjection.f312972b);
    }

    @Nullable
    public final s g() {
        return this.f312972b;
    }

    @Nullable
    public final u h() {
        return this.f312971a;
    }

    public int hashCode() {
        u uVar = this.f312971a;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        s sVar = this.f312972b;
        return iHashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        u uVar = this.f312971a;
        int i10 = uVar == null ? -1 : b.f312973a[uVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f312972b);
        }
        if (i10 == 2) {
            return "in " + this.f312972b;
        }
        if (i10 != 3) {
            throw new k0();
        }
        return "out " + this.f312972b;
    }
}
