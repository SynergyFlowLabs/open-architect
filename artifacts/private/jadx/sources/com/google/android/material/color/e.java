package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.g1;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g1
    private final int f111954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g1
    private final int f111955b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g1
        private int f111956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g1
        private int f111957b;

        @NonNull
        public e c() {
            return new e(this);
        }

        @NonNull
        @z7.a
        public b d(@g1 int i10) {
            this.f111957b = i10;
            return this;
        }

        @NonNull
        @z7.a
        public b e(@g1 int i10) {
            this.f111956a = i10;
            return this;
        }
    }

    @g1
    public int a() {
        return this.f111955b;
    }

    @g1
    public int b() {
        return this.f111954a;
    }

    private e(b bVar) {
        this.f111954a = bVar.f111956a;
        this.f111955b = bVar.f111957b;
    }
}
