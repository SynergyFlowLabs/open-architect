package com.facebook.login;

import com.facebook.internal.w0;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    NONE(null),
    ONLY_ME(w0.f100165f1),
    FRIENDS(w0.f100168g1),
    EVERYONE(w0.f100171h1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f100471a;

    e(String str) {
        this.f100471a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] eVarArrValuesCustom = values();
        return (e[]) Arrays.copyOf(eVarArrValuesCustom, eVarArrValuesCustom.length);
    }

    @Nullable
    public final String l() {
        return this.f100471a;
    }
}
