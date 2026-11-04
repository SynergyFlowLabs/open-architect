package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 {
    @NotNull
    public static final GenericArrayType a(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        GenericArrayType genericArrayTypeB = a0.b(type);
        Intrinsics.checkNotNullExpressionValue(genericArrayTypeB, "arrayOf(this)");
        return genericArrayTypeB;
    }

    @NotNull
    public static final GenericArrayType b(@NotNull kotlin.reflect.d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return a(oj.b.e(dVar));
    }

    @kotlin.s
    @NotNull
    public static final GenericArrayType c(@NotNull kotlin.reflect.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return a(kotlin.reflect.a0.f(sVar));
    }

    @NotNull
    public static final Class<?> d(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Class<?> clsJ = a0.j(type);
        Intrinsics.checkNotNullExpressionValue(clsJ, "getRawType(this)");
        return clsJ;
    }

    public static final /* synthetic */ <T extends Annotation> Set<Annotation> e(Set<? extends Annotation> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return a0.o(set, Annotation.class);
    }

    @kotlin.s
    public static final /* synthetic */ <T> WildcardType f() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        Type typeF = kotlin.reflect.a0.f(null);
        if (typeF instanceof Class) {
            typeF = Util.a((Class) typeF);
            Intrinsics.checkNotNullExpressionValue(typeF, "boxIfPrimitive(type)");
        }
        WildcardType wildcardTypeP = a0.p(typeF);
        Intrinsics.checkNotNullExpressionValue(wildcardTypeP, "subtypeOf(type)");
        return wildcardTypeP;
    }

    @kotlin.s
    public static final /* synthetic */ <T> WildcardType g() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        Type typeF = kotlin.reflect.a0.f(null);
        if (typeF instanceof Class) {
            typeF = Util.a((Class) typeF);
            Intrinsics.checkNotNullExpressionValue(typeF, "boxIfPrimitive(type)");
        }
        WildcardType wildcardTypeQ = a0.q(typeF);
        Intrinsics.checkNotNullExpressionValue(wildcardTypeQ, "supertypeOf(type)");
        return wildcardTypeQ;
    }
}
