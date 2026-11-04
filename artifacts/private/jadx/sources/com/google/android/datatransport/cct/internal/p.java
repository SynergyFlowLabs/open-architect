package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class p {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(@p0 s sVar);

        @NonNull
        public abstract a c(@p0 b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final SparseArray<b> f103363d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103365a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f103363d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.f103365a = i10;
        }

        @p0
        public static b b(int i10) {
            return f103363d.get(i10);
        }

        public int k() {
            return this.f103365a;
        }
    }

    @NonNull
    public static a a() {
        return new f.b();
    }

    @p0
    public abstract s b();

    @p0
    public abstract b c();
}
