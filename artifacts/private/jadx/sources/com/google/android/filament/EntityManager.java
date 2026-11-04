package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import com.google.android.filament.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes4.dex */
public class EntityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103921a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final EntityManager f103922a = new EntityManager();

        private a() {
        }
    }

    @NonNull
    public static EntityManager f() {
        return a.f103922a;
    }

    private static native int nCreate(long j10);

    private static native void nCreateArray(long j10, int i10, int[] iArr);

    private static native void nDestroy(long j10, int i10);

    private static native void nDestroyArray(long j10, int i10, int[] iArr);

    private static native long nGetEntityManager();

    private static native boolean nIsAlive(long j10, int i10);

    @h
    public int a() {
        return nCreate(this.f103921a);
    }

    @NonNull
    @h
    public int[] b(@g0(from = 1) int i10) {
        if (i10 < 1) {
            throw new ArrayIndexOutOfBoundsException("n must be at least 1");
        }
        int[] iArr = new int[i10];
        nCreateArray(this.f103921a, i10, iArr);
        return iArr;
    }

    @NonNull
    public int[] c(@NonNull @h int[] iArr) {
        nCreateArray(this.f103921a, iArr.length, iArr);
        return iArr;
    }

    public void d(@h int i10) {
        nDestroy(this.f103921a, i10);
    }

    public void e(@NonNull @h int[] iArr) {
        nDestroyArray(this.f103921a, iArr.length, iArr);
    }

    public boolean g(@h int i10) {
        return nIsAlive(this.f103921a, i10);
    }

    @UsedByReflection("AssetLoader.java")
    public long getNativeObject() {
        return this.f103921a;
    }

    private EntityManager() {
        this.f103921a = nGetEntityManager();
    }

    EntityManager(long j10) {
        nGetEntityManager();
        this.f103921a = j10;
    }
}
