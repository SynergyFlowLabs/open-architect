package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d3<T> {
    private final boolean isNullableAllowed;

    @NotNull
    private final String name = "nav_type";

    @NotNull
    public static final b Companion = new b(null);

    @oj.f
    @NotNull
    public static final d3<Integer> IntType = new x();

    @oj.f
    @NotNull
    public static final d3<Integer> ReferenceType = new a();

    @oj.f
    @NotNull
    public static final d3<int[]> IntArrayType = new v();

    @oj.f
    @NotNull
    public static final d3<List<Integer>> IntListType = new w();

    @oj.f
    @NotNull
    public static final d3<Long> LongType = new a0();

    @oj.f
    @NotNull
    public static final d3<long[]> LongArrayType = new y();

    @oj.f
    @NotNull
    public static final d3<List<Long>> LongListType = new z();

    @oj.f
    @NotNull
    public static final d3<Float> FloatType = new t();

    @oj.f
    @NotNull
    public static final d3<float[]> FloatArrayType = new r();

    @oj.f
    @NotNull
    public static final d3<List<Float>> FloatListType = new s();

    @oj.f
    @NotNull
    public static final d3<Boolean> BoolType = new p();

    @oj.f
    @NotNull
    public static final d3<boolean[]> BoolArrayType = new n();

    @oj.f
    @NotNull
    public static final d3<List<Boolean>> BoolListType = new o();

    @oj.f
    @NotNull
    public static final d3<String> StringType = new d4();

    @oj.f
    @NotNull
    public static final d3<String[]> StringArrayType = new b4();

    @oj.f
    @NotNull
    public static final d3<List<String>> StringListType = new c4();

    @SourceDebugExtension({"SMAP\nNavType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$Companion$ReferenceType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,478:1\n106#2:479\n90#2:480\n*S KotlinDebug\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$Companion$ReferenceType$1\n*L\n168#1:479\n173#1:480\n*E\n"})
    public static final class a extends d3<Integer> {
        a() {
            super(false);
        }

        @Override // androidx.navigation.d3
        @androidx.annotation.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return Integer.valueOf(androidx.savedstate.f.G(androidx.savedstate.f.b(bundle), key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer parseValue(String value) {
            int i10;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.u2(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void c(Bundle bundle, String key, @androidx.annotation.c int i10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            androidx.savedstate.n.t(androidx.savedstate.n.c(bundle), key, i10);
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return androidx.constraintlayout.core.motion.utils.v.b.f43991h;
        }

        @Override // androidx.navigation.d3
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            c(bundle, str, num.intValue());
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public d3<?> a(@Nullable String str, @Nullable String str2) {
            String strSubstring;
            d3<?> d3VarA = e3.a(str);
            if (d3VarA != null) {
                return d3VarA;
            }
            d3<Integer> d3Var = d3.ReferenceType;
            if (Intrinsics.areEqual(d3Var.getName(), str)) {
                return d3Var;
            }
            if (str != null && str.length() != 0) {
                try {
                    if (!StringsKt.u2(str, ".", false, 2, null) || str2 == null) {
                        strSubstring = str;
                    } else {
                        strSubstring = str2 + str;
                    }
                    boolean zM1 = StringsKt.M1(str, okhttp3.v.f334777p, false, 2, null);
                    if (zM1) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                    Class<?> cls = Class.forName(strSubstring);
                    Intrinsics.checkNotNull(cls);
                    d3<?> d3VarD = d(cls, zM1);
                    if (d3VarD != null) {
                        return d3VarD;
                    }
                    throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            return d3.StringType;
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final d3<Object> b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return e3.b(value);
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final d3<Object> c(@Nullable Object obj) {
            d3<Object> d3VarC = e3.c(obj);
            if (d3VarC != null) {
                return d3VarC;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                d3<String[]> d3Var = d3.StringArrayType;
                Intrinsics.checkNotNull(d3Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return d3Var;
            }
            Intrinsics.checkNotNull(obj);
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new d(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new f(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new e(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new c(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new g(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        @Nullable
        public final d3<?> d(@NotNull Class<?> clazz, boolean z10) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z10 ? new d(clazz) : new e(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z10) {
                return new c(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z10 ? new f(clazz) : new g(clazz);
            }
            return null;
        }

        private b() {
        }
    }

    @SourceDebugExtension({"SMAP\nNavType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,478:1\n1#2:479\n1310#3,2:480\n*S KotlinDebug\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$EnumType\n*L\n401#1:480,2\n*E\n"})
    public static final class c<D extends Enum<?>> extends g<D> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<D> f70898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Class<D> type) {
            super(false, type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.f70898b = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.d3.g, androidx.navigation.d3
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D parseValue(@NotNull String value) {
            D d10;
            Intrinsics.checkNotNullParameter(value, "value");
            D[] enumConstants = this.f70898b.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (StringsKt.N1(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f70898b.getName() + '.');
        }

        @Override // androidx.navigation.d3.g, androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f70898b.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
    }

    public static final class d<D extends Parcelable> extends d3<D[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<D[]> f70899a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f70899a = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D[] get(@NotNull Bundle bundle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.d3
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D[] parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f70899a.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(@Nullable D[] dArr, @Nullable D[] dArr2) {
            return ArraysKt.contentDeepEquals(dArr, dArr2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                int i10 = 7 >> 1;
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(d.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f70899a, ((d) obj).f70899a);
        }

        @Override // androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f70899a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.f70899a.hashCode();
        }
    }

    public static final class e<D> extends d3<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<D> f70900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f70900a = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(e.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f70900a, ((e) obj).f70900a);
        }

        @Override // androidx.navigation.d3
        @Nullable
        public D get(@NotNull Bundle bundle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f70900a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.f70900a.hashCode();
        }

        @Override // androidx.navigation.d3
        public D parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.d3
        public void put(@NotNull Bundle bundle, @NotNull String key, D d10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f70900a.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }
    }

    public static final class f<D extends Serializable> extends d3<D[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<D[]> f70901a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f70901a = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D[] get(@NotNull Bundle bundle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.d3
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D[] parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f70901a.cast(dArr);
            bundle.putSerializable(key, dArr);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(@Nullable D[] dArr, @Nullable D[] dArr2) {
            return ArraysKt.contentDeepEquals(dArr, dArr2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(f.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f70901a, ((f) obj).f70901a);
        }

        @Override // androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f70901a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.f70901a.hashCode();
        }
    }

    public d3(boolean z10) {
        this.isNullableAllowed = z10;
    }

    @oj.n
    @NotNull
    public static d3<?> fromArgType(@Nullable String str, @Nullable String str2) {
        return Companion.a(str, str2);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final d3<Object> inferFromValue(@NotNull String str) {
        return Companion.b(str);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final d3<Object> inferFromValueType(@Nullable Object obj) {
        return Companion.c(obj);
    }

    @Nullable
    public abstract T get(@NotNull Bundle bundle, @NotNull String str);

    @NotNull
    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final T parseAndPut(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return (T) e3.d(this, bundle, key, value);
    }

    public abstract T parseValue(@NotNull String str);

    public T parseValue(@NotNull String value, T t10) {
        Intrinsics.checkNotNullParameter(value, "value");
        return parseValue(value);
    }

    public abstract void put(@NotNull Bundle bundle, @NotNull String str, T t10);

    @NotNull
    public String serializeAsValue(T t10) {
        return String.valueOf(t10);
    }

    @NotNull
    public String toString() {
        return getName();
    }

    public boolean valueEquals(T t10, T t11) {
        return Intrinsics.areEqual(t10, t11);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final T parseAndPut(@NotNull Bundle bundle, @NotNull String key, @Nullable String str, T t10) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) e3.e(this, bundle, key, str, t10);
    }

    @SourceDebugExtension({"SMAP\nNavType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,478:1\n1#2:479\n*E\n"})
    public static class g<D extends Serializable> extends d3<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<D> f70902a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f70902a = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D get(@NotNull Bundle bundle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.d3
        @NotNull
        /* JADX INFO: renamed from: b */
        public D parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(@NotNull Bundle bundle, @NotNull String key, @NotNull D value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f70902a.cast(value);
            bundle.putSerializable(key, value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return Intrinsics.areEqual(this.f70902a, ((g) obj).f70902a);
            }
            return false;
        }

        @Override // androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f70902a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.f70902a.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, @NotNull Class<D> type) {
            super(z10);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f70902a = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
