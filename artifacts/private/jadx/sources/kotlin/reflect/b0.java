package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.s
final class b0 implements WildcardType, x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f312977c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final b0 f312978d = new b0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Type f312979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Type f312980b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b0 a() {
            return b0.f312978d;
        }

        private a() {
        }
    }

    public b0(@Nullable Type type, @Nullable Type type2) {
        this.f312979a = type;
        this.f312980b = type2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.f312980b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.x
    @NotNull
    public String getTypeName() {
        if (this.f312980b != null) {
            return "? super " + a0.j(this.f312980b);
        }
        Type type = this.f312979a;
        if (type == null || Intrinsics.areEqual(type, Object.class)) {
            return com.planner5d.library.model.payments.a.f222474i;
        }
        return "? extends " + a0.j(this.f312979a);
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type type = this.f312979a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
