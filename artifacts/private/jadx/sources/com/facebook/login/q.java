package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f101532d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f101533e = "openid";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<String> f101534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f101535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f101536c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public q(@Nullable Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String a() {
        return this.f101536c;
    }

    @NotNull
    public final String b() {
        return this.f101535b;
    }

    @NotNull
    public final Set<String> c() {
        return this.f101534a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(Collection collection, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public q(@Nullable Collection<String> collection, @NotNull String nonce) {
        this(collection, nonce, g0.c());
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        g0 g0Var = g0.f100483a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(Collection collection, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        collection = (i10 & 1) != 0 ? null : collection;
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(collection, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public q(@Nullable Collection<String> collection, @NotNull String nonce, @NotNull String codeVerifier) {
        boolean z10;
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        f0 f0Var = f0.f100476a;
        if (f0.a(nonce)) {
            g0 g0Var = g0.f100483a;
            if (g0.d(codeVerifier)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.f101534a = setUnmodifiableSet;
            this.f101535b = nonce;
            this.f101536c = codeVerifier;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
