package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @androidx.annotation.n
    private final int[] f112060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final q f112061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.f
    private final int f112062c;

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private q f112064b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        @androidx.annotation.n
        private int[] f112063a = new int[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.f
        private int f112065c = r6.a.c.R3;

        @NonNull
        public s d() {
            return new s(this);
        }

        @NonNull
        @z7.a
        public b e(@androidx.annotation.f int i10) {
            this.f112065c = i10;
            return this;
        }

        @NonNull
        @z7.a
        public b f(@p0 q qVar) {
            this.f112064b = qVar;
            return this;
        }

        @NonNull
        @z7.a
        public b g(@NonNull @androidx.annotation.n int[] iArr) {
            this.f112063a = iArr;
            return this;
        }
    }

    @NonNull
    public static s a() {
        return new b().f(q.c()).d();
    }

    @androidx.annotation.f
    public int b() {
        return this.f112062c;
    }

    @p0
    public q c() {
        return this.f112061b;
    }

    @NonNull
    @androidx.annotation.n
    public int[] d() {
        return this.f112060a;
    }

    @g1
    int e(@g1 int i10) {
        q qVar = this.f112061b;
        return (qVar == null || qVar.e() == 0) ? i10 : this.f112061b.e();
    }

    private s(b bVar) {
        this.f112060a = bVar.f112063a;
        this.f112061b = bVar.f112064b;
        this.f112062c = bVar.f112065c;
    }
}
