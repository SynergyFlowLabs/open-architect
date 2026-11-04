package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavTypeKt\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n90#2:884\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavTypeKt\n*L\n316#1:884\n*E\n"})
public final class e3 {
    @Nullable
    public static final d3<?> a(@Nullable String str) {
        d3<Integer> d3Var = d3.IntType;
        if (Intrinsics.areEqual(d3Var.getName(), str)) {
            return d3Var;
        }
        d3 d3Var2 = d3.IntArrayType;
        if (Intrinsics.areEqual(d3Var2.getName(), str)) {
            return d3Var2;
        }
        d3<List<Integer>> d3Var3 = d3.IntListType;
        if (Intrinsics.areEqual(d3Var3.getName(), str)) {
            return d3Var3;
        }
        d3<Long> d3Var4 = d3.LongType;
        if (Intrinsics.areEqual(d3Var4.getName(), str)) {
            return d3Var4;
        }
        d3 d3Var5 = d3.LongArrayType;
        if (Intrinsics.areEqual(d3Var5.getName(), str)) {
            return d3Var5;
        }
        d3<List<Long>> d3Var6 = d3.LongListType;
        if (Intrinsics.areEqual(d3Var6.getName(), str)) {
            return d3Var6;
        }
        d3<Boolean> d3Var7 = d3.BoolType;
        if (Intrinsics.areEqual(d3Var7.getName(), str)) {
            return d3Var7;
        }
        d3 d3Var8 = d3.BoolArrayType;
        if (Intrinsics.areEqual(d3Var8.getName(), str)) {
            return d3Var8;
        }
        d3<List<Boolean>> d3Var9 = d3.BoolListType;
        if (Intrinsics.areEqual(d3Var9.getName(), str)) {
            return d3Var9;
        }
        d3<String> d3Var10 = d3.StringType;
        if (Intrinsics.areEqual(d3Var10.getName(), str)) {
            return d3Var10;
        }
        d3 d3Var11 = d3.StringArrayType;
        if (Intrinsics.areEqual(d3Var11.getName(), str)) {
            return d3Var11;
        }
        d3<List<String>> d3Var12 = d3.StringListType;
        if (Intrinsics.areEqual(d3Var12.getName(), str)) {
            return d3Var12;
        }
        d3<Float> d3Var13 = d3.FloatType;
        if (Intrinsics.areEqual(d3Var13.getName(), str)) {
            return d3Var13;
        }
        d3 d3Var14 = d3.FloatArrayType;
        if (Intrinsics.areEqual(d3Var14.getName(), str)) {
            return d3Var14;
        }
        d3<List<Float>> d3Var15 = d3.FloatListType;
        if (Intrinsics.areEqual(d3Var15.getName(), str)) {
            return d3Var15;
        }
        return null;
    }

    @NotNull
    public static final d3<Object> b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            try {
                try {
                    try {
                        d3<Integer> d3Var = d3.IntType;
                        d3Var.parseValue(value);
                        Intrinsics.checkNotNull(d3Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return d3Var;
                    } catch (IllegalArgumentException unused) {
                        d3<Long> d3Var2 = d3.LongType;
                        d3Var2.parseValue(value);
                        Intrinsics.checkNotNull(d3Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return d3Var2;
                    }
                } catch (IllegalArgumentException unused2) {
                    d3<Boolean> d3Var3 = d3.BoolType;
                    d3Var3.parseValue(value);
                    Intrinsics.checkNotNull(d3Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return d3Var3;
                }
            } catch (IllegalArgumentException unused3) {
                d3<String> d3Var4 = d3.StringType;
                Intrinsics.checkNotNull(d3Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return d3Var4;
            }
        } catch (IllegalArgumentException unused4) {
            d3<Float> d3Var5 = d3.FloatType;
            d3Var5.parseValue(value);
            Intrinsics.checkNotNull(d3Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var5;
        }
    }

    @Nullable
    public static final d3<Object> c(@Nullable Object obj) {
        if (obj instanceof Integer) {
            d3<Integer> d3Var = d3.IntType;
            Intrinsics.checkNotNull(d3Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var;
        }
        if (obj instanceof int[]) {
            d3<int[]> d3Var2 = d3.IntArrayType;
            Intrinsics.checkNotNull(d3Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var2;
        }
        if (obj instanceof Long) {
            d3<Long> d3Var3 = d3.LongType;
            Intrinsics.checkNotNull(d3Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var3;
        }
        if (obj instanceof long[]) {
            d3<long[]> d3Var4 = d3.LongArrayType;
            Intrinsics.checkNotNull(d3Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var4;
        }
        if (obj instanceof Float) {
            d3<Float> d3Var5 = d3.FloatType;
            Intrinsics.checkNotNull(d3Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var5;
        }
        if (obj instanceof float[]) {
            d3<float[]> d3Var6 = d3.FloatArrayType;
            Intrinsics.checkNotNull(d3Var6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var6;
        }
        if (obj instanceof Boolean) {
            d3<Boolean> d3Var7 = d3.BoolType;
            Intrinsics.checkNotNull(d3Var7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var7;
        }
        if (obj instanceof boolean[]) {
            d3<boolean[]> d3Var8 = d3.BoolArrayType;
            Intrinsics.checkNotNull(d3Var8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return d3Var8;
        }
        if (!(obj instanceof String) && obj != null) {
            return null;
        }
        d3<String> d3Var9 = d3.StringType;
        Intrinsics.checkNotNull(d3Var9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
        return d3Var9;
    }

    public static final <T> T d(@NotNull d3<T> d3Var, @NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(d3Var, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        T value2 = d3Var.parseValue(value);
        d3Var.put(bundle, key, value2);
        return value2;
    }

    public static final <T> T e(@NotNull d3<T> d3Var, @NotNull Bundle bundle, @NotNull String key, @Nullable String str, T t10) {
        Intrinsics.checkNotNullParameter(d3Var, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str == null) {
            return t10;
        }
        T value = d3Var.parseValue(str, t10);
        d3Var.put(bundle, key, value);
        return value;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static final <T> T f(@NotNull d3<T> d3Var, @NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(d3Var, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return d3Var.parseAndPut(bundle, key, g3.f71010a.a(value));
    }
}
