package com.google.android.filament.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class AssetLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Engine f104727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaterialProvider f104728c;

    public AssetLoader(@NonNull Engine engine, @NonNull MaterialProvider materialProvider, @NonNull EntityManager entityManager) {
        long jNCreateAssetLoader = nCreateAssetLoader(engine.getNativeObject(), materialProvider, entityManager.getNativeObject());
        this.f104726a = jNCreateAssetLoader;
        if (jNCreateAssetLoader == 0) {
            throw new IllegalStateException("Unable to parse glTF asset.");
        }
        this.f104727b = engine;
        this.f104728c = materialProvider;
    }

    private static native long nCreateAsset(long j10, Buffer buffer, int i10);

    private static native long nCreateAssetLoader(long j10, Object obj, long j11);

    private static native long nCreateInstance(long j10, long j11);

    private static native long nCreateInstancedAsset(long j10, Buffer buffer, int i10, long[] jArr);

    private static native void nDestroyAsset(long j10, long j11);

    private static native void nDestroyAssetLoader(long j10);

    private static native void nEnableDiagnostics(long j10, boolean z10);

    @p0
    public FilamentAsset a(@NonNull Buffer buffer) {
        long jNCreateAsset = nCreateAsset(this.f104726a, buffer, buffer.remaining());
        if (jNCreateAsset != 0) {
            return new FilamentAsset(this.f104727b, jNCreateAsset);
        }
        return null;
    }

    @p0
    public FilamentInstance b(@NonNull FilamentAsset filamentAsset) {
        long jNCreateInstance = nCreateInstance(this.f104726a, filamentAsset.n());
        if (jNCreateInstance == 0) {
            return null;
        }
        return new FilamentInstance(filamentAsset, jNCreateInstance);
    }

    @p0
    public FilamentAsset c(@NonNull Buffer buffer, @NonNull FilamentInstance[] filamentInstanceArr) {
        int length = filamentInstanceArr.length;
        long[] jArr = new long[length];
        long jNCreateInstancedAsset = nCreateInstancedAsset(this.f104726a, buffer, buffer.remaining(), jArr);
        if (jNCreateInstancedAsset == 0) {
            return null;
        }
        FilamentAsset filamentAsset = new FilamentAsset(this.f104727b, jNCreateInstancedAsset);
        for (int i10 = 0; i10 < length; i10++) {
            filamentInstanceArr[i10] = new FilamentInstance(filamentAsset, jArr[i10]);
        }
        return filamentAsset;
    }

    public void d() {
        nDestroyAssetLoader(this.f104726a);
        this.f104726a = 0L;
    }

    public void e(@NonNull FilamentAsset filamentAsset) {
        nDestroyAsset(this.f104726a, filamentAsset.n());
        filamentAsset.a();
    }

    public void f(boolean z10) {
        nEnableDiagnostics(this.f104726a, z10);
    }
}
