package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private final Account f106559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f106560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f106561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f106562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f106563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.h
    private final View f106564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f106565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f106566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.signin.a f106567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f106568j;

    @g6.a
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        private Account f106569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.collection.c f106570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f106571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f106572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.android.gms.signin.a f106573e = com.google.android.gms.signin.a.f110915j;

        @NonNull
        @g6.a
        public h a() {
            int i10 = 7 >> 0;
            return new h(this.f106569a, this.f106570b, null, 0, null, this.f106571c, this.f106572d, this.f106573e, false);
        }

        @NonNull
        @g6.a
        public a b(@NonNull String str) {
            this.f106571c = str;
            return this;
        }

        @NonNull
        public final a c(@NonNull Collection collection) {
            if (this.f106570b == null) {
                this.f106570b = new androidx.collection.c();
            }
            this.f106570b.addAll(collection);
            return this;
        }

        @NonNull
        public final a d(@fj.h Account account) {
            this.f106569a = account;
            return this;
        }

        @NonNull
        public final a e(@NonNull String str) {
            this.f106572d = str;
            return this;
        }
    }

    @g6.a
    public h(@NonNull Account account, @NonNull Set<Scope> set, @NonNull Map<com.google.android.gms.common.api.a<?>, k0> map, int i10, @fj.h View view, @NonNull String str, @NonNull String str2, @fj.h com.google.android.gms.signin.a aVar) {
        this(account, set, map, i10, view, str, str2, aVar, false);
    }

    @NonNull
    @g6.a
    public static h a(@NonNull Context context) {
        return new com.google.android.gms.common.api.l.a(context).p();
    }

    @androidx.annotation.p0
    @g6.a
    public Account b() {
        return this.f106559a;
    }

    @androidx.annotation.p0
    @g6.a
    @Deprecated
    public String c() {
        Account account = this.f106559a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @g6.a
    public Account d() {
        Account account = this.f106559a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    @g6.a
    public Set<Scope> e() {
        return this.f106561c;
    }

    @NonNull
    @g6.a
    public Set<Scope> f(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        k0 k0Var = (k0) this.f106562d.get(aVar);
        if (k0Var != null && !k0Var.f106594a.isEmpty()) {
            HashSet hashSet = new HashSet(this.f106560b);
            hashSet.addAll(k0Var.f106594a);
            return hashSet;
        }
        return this.f106560b;
    }

    @g6.a
    public int g() {
        return this.f106563e;
    }

    @NonNull
    @g6.a
    public String h() {
        return this.f106565g;
    }

    @NonNull
    @g6.a
    public Set<Scope> i() {
        return this.f106560b;
    }

    @androidx.annotation.p0
    @g6.a
    public View j() {
        return this.f106564f;
    }

    @NonNull
    public final com.google.android.gms.signin.a k() {
        return this.f106567i;
    }

    @androidx.annotation.p0
    public final Integer l() {
        return this.f106568j;
    }

    @androidx.annotation.p0
    public final String m() {
        return this.f106566h;
    }

    @NonNull
    public final Map n() {
        return this.f106562d;
    }

    public final void o(@NonNull Integer num) {
        this.f106568j = num;
    }

    public h(@fj.h Account account, @NonNull Set set, @NonNull Map map, int i10, @fj.h View view, @NonNull String str, @NonNull String str2, @fj.h com.google.android.gms.signin.a aVar, boolean z10) {
        this.f106559a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f106560b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f106562d = map;
        this.f106564f = view;
        this.f106563e = i10;
        this.f106565g = str;
        this.f106566h = str2;
        this.f106567i = aVar == null ? com.google.android.gms.signin.a.f110915j : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((k0) it.next()).f106594a);
        }
        this.f106561c = Collections.unmodifiableSet(hashSet);
    }
}
