package w3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f385884c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f385885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object[] f385886b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(f fVar, int i10, Object obj) {
            if (obj == null) {
                fVar.J7(i10);
                return;
            }
            if (obj instanceof byte[]) {
                fVar.Q6(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                fVar.s9(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                fVar.s9(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                fVar.G6(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                fVar.G6(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                fVar.G6(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                fVar.G6(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                fVar.H5(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                fVar.G6(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @n
        public final void b(@NotNull f statement, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Object obj = objArr[i10];
                    i10++;
                    a(statement, i10, obj);
                }
            }
        }

        private a() {
        }
    }

    public b(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f385885a = query;
        this.f385886b = objArr;
    }

    @n
    public static final void d(@NotNull f fVar, @Nullable Object[] objArr) {
        f385884c.b(fVar, objArr);
    }

    @Override // w3.g
    public int a() {
        Object[] objArr = this.f385886b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // w3.g
    @NotNull
    public String b() {
        return this.f385885a;
    }

    @Override // w3.g
    public void c(@NotNull f statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f385884c.b(statement, this.f385886b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
