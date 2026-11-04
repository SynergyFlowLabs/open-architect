package kotlin.reflect;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.s
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
final class w implements ParameterizedType, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f312997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Type f312998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Type[] f312999c;

    /* synthetic */ class a extends g0 implements Function1<Type, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313000a = new a();

        a() {
            super(1, a0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return a0.j(p10);
        }
    }

    public w(@NotNull Class<?> rawType, @Nullable Type type, @NotNull List<? extends Type> typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f312997a = rawType;
        this.f312998b = type;
        this.f312999c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return Intrinsics.areEqual(this.f312997a, parameterizedType.getRawType()) && Intrinsics.areEqual(this.f312998b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.f312999c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return this.f312998b;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.f312997a;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.x
    @NotNull
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f312998b;
        if (type != null) {
            sb2.append(a0.j(type));
            sb2.append("$");
            sb2.append(this.f312997a.getSimpleName());
        } else {
            sb2.append(a0.j(this.f312997a));
        }
        Type[] typeArr = this.f312999c;
        if (!(typeArr.length == 0)) {
            ArraysKt___ArraysKt.joinTo(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f313000a);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f312997a.hashCode();
        Type type = this.f312998b;
        return Arrays.hashCode(getActualTypeArguments()) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
