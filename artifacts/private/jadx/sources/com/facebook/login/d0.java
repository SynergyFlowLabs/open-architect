package com.facebook.login;

import com.facebook.AccessToken;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public enum d0 {
    FACEBOOK(AccessToken.f98376v),
    INSTAGRAM(com.facebook.g0.O);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100461b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f100465a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final d0 a(@Nullable String str) {
            d0[] d0VarArrValuesCustom = d0.valuesCustom();
            int length = d0VarArrValuesCustom.length;
            int i10 = 0;
            while (i10 < length) {
                d0 d0Var = d0VarArrValuesCustom[i10];
                i10++;
                if (Intrinsics.areEqual(d0Var.toString(), str)) {
                    return d0Var;
                }
            }
            return d0.FACEBOOK;
        }

        private a() {
        }
    }

    d0(String str) {
        this.f100465a = str;
    }

    @oj.n
    @NotNull
    public static final d0 l(@Nullable String str) {
        return f100461b.a(str);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static d0[] valuesCustom() {
        d0[] d0VarArrValuesCustom = values();
        return (d0[]) Arrays.copyOf(d0VarArrValuesCustom, d0VarArrValuesCustom.length);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f100465a;
    }
}
