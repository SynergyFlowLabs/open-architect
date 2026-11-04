package com.google.android.filament.gltfio;

import androidx.annotation.NonNull;
import androidx.media3.common.s0;
import com.google.android.filament.Engine;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class ResourceLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f104735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f104736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f104737c;

    public ResourceLoader(@NonNull Engine engine) {
        long nativeObject = engine.getNativeObject();
        long jNCreateResourceLoader = nCreateResourceLoader(nativeObject, false);
        this.f104735a = jNCreateResourceLoader;
        long jNCreateStbProvider = nCreateStbProvider(nativeObject);
        this.f104736b = jNCreateStbProvider;
        long jNCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        this.f104737c = jNCreateKtx2Provider;
        nAddTextureProvider(jNCreateResourceLoader, "image/jpeg", jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, s0.X0, jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, "image/ktx2", jNCreateKtx2Provider);
    }

    private static native void nAddResourceData(long j10, String str, Buffer buffer, int i10);

    private static native void nAddTextureProvider(long j10, String str, long j11);

    private static native boolean nAsyncBeginLoad(long j10, long j11);

    private static native void nAsyncCancelLoad(long j10);

    private static native float nAsyncGetLoadProgress(long j10);

    private static native void nAsyncUpdateLoad(long j10);

    private static native long nCreateKtx2Provider(long j10);

    private static native long nCreateResourceLoader(long j10, boolean z10);

    private static native long nCreateStbProvider(long j10);

    private static native void nDestroyResourceLoader(long j10);

    private static native void nDestroyTextureProvider(long j10);

    private static native void nEvictResourceData(long j10);

    private static native boolean nHasResourceData(long j10, String str);

    private static native void nLoadResources(long j10, long j11);

    @NonNull
    public ResourceLoader a(@NonNull String str, @NonNull Buffer buffer) {
        nAddResourceData(this.f104735a, str, buffer, buffer.remaining());
        return this;
    }

    public boolean b(@NonNull FilamentAsset filamentAsset) {
        return nAsyncBeginLoad(this.f104735a, filamentAsset.n());
    }

    public void c() {
        nAsyncCancelLoad(this.f104735a);
    }

    public float d() {
        return nAsyncGetLoadProgress(this.f104735a);
    }

    public void e() {
        nAsyncUpdateLoad(this.f104735a);
    }

    public void f() {
        nDestroyResourceLoader(this.f104735a);
        nDestroyTextureProvider(this.f104736b);
        nDestroyTextureProvider(this.f104737c);
    }

    public void g() {
        nEvictResourceData(this.f104735a);
    }

    public boolean h(@NonNull String str) {
        return nHasResourceData(this.f104735a, str);
    }

    @NonNull
    public ResourceLoader i(@NonNull FilamentAsset filamentAsset) {
        nLoadResources(this.f104735a, filamentAsset.n());
        return this;
    }

    public ResourceLoader(@NonNull Engine engine, boolean z10) {
        long nativeObject = engine.getNativeObject();
        long jNCreateResourceLoader = nCreateResourceLoader(nativeObject, z10);
        this.f104735a = jNCreateResourceLoader;
        long jNCreateStbProvider = nCreateStbProvider(nativeObject);
        this.f104736b = jNCreateStbProvider;
        long jNCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        this.f104737c = jNCreateKtx2Provider;
        nAddTextureProvider(jNCreateResourceLoader, "image/jpeg", jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, s0.X0, jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, "image/ktx2", jNCreateKtx2Provider);
    }
}
