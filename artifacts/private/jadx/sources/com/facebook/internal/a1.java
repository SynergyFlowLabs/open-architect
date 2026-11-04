package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum a1 {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99713b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final EnumSet<a1> f99714c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f99719a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final EnumSet<a1> a(long j10) {
            EnumSet<a1> result = EnumSet.noneOf(a1.class);
            for (a1 a1Var : a1.f99714c) {
                if ((a1Var.n() & j10) != 0) {
                    result.add(a1Var);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }

        private a() {
        }
    }

    static {
        EnumSet<a1> enumSetAllOf = EnumSet.allOf(a1.class);
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f99714c = enumSetAllOf;
    }

    a1(long j10) {
        this.f99719a = j10;
    }

    @oj.n
    @NotNull
    public static final EnumSet<a1> o(long j10) {
        return f99713b.a(j10);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a1[] valuesCustom() {
        a1[] a1VarArrValuesCustom = values();
        return (a1[]) Arrays.copyOf(a1VarArrValuesCustom, a1VarArrValuesCustom.length);
    }

    public final long n() {
        return this.f99719a;
    }
}
