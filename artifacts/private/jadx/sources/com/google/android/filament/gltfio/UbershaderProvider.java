package com.google.android.filament.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: loaded from: classes4.dex */
public class UbershaderProvider implements MaterialProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final VertexBuffer.c[] f104738b = VertexBuffer.c.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104739a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104740a;

        static {
            int[] iArr = new int[VertexBuffer.c.values().length];
            f104740a = iArr;
            try {
                iArr[VertexBuffer.c.UV0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104740a[VertexBuffer.c.UV1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104740a[VertexBuffer.c.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public UbershaderProvider(Engine engine) {
        this.f104739a = nCreateUbershaderProvider(engine.getNativeObject());
    }

    private static native long nCreateMaterialInstance(long j10, MaterialProvider.MaterialKey materialKey, int[] iArr, String str, String str2);

    private static native long nCreateUbershaderProvider(long j10);

    private static native void nDestroyMaterials(long j10);

    private static native void nDestroyUbershaderProvider(long j10);

    private static native long nGetMaterial(long j10, MaterialProvider.MaterialKey materialKey, int[] iArr, String str);

    private static native int nGetMaterialCount(long j10);

    private static native void nGetMaterials(long j10, long[] jArr);

    @Override // com.google.android.filament.gltfio.MaterialProvider
    @NonNull
    public Material[] a() {
        int iNGetMaterialCount = nGetMaterialCount(this.f104739a);
        Material[] materialArr = new Material[iNGetMaterialCount];
        long[] jArr = new long[iNGetMaterialCount];
        nGetMaterials(this.f104739a, jArr);
        for (int i10 = 0; i10 < iNGetMaterialCount; i10++) {
            materialArr[i10] = new Material(jArr[i10]);
        }
        return materialArr;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public void b() {
        nDestroyMaterials(this.f104739a);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public boolean c(int i10) {
        int i11 = a.f104740a[f104738b[i10].ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    @p0
    public MaterialInstance d(MaterialProvider.MaterialKey materialKey, @NonNull @d1(min = 8) int[] iArr, @p0 String str, @p0 String str2) {
        long jNCreateMaterialInstance = nCreateMaterialInstance(this.f104739a, materialKey, iArr, str, str2);
        if (jNCreateMaterialInstance == 0) {
            return null;
        }
        return new MaterialInstance((Engine) null, jNCreateMaterialInstance);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public void destroy() {
        nDestroyUbershaderProvider(this.f104739a);
        this.f104739a = 0L;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    @p0
    public Material e(MaterialProvider.MaterialKey materialKey, @NonNull @d1(min = 8) int[] iArr, @p0 String str) {
        long jNGetMaterial = nGetMaterial(this.f104739a, materialKey, iArr, str);
        if (jNGetMaterial == 0) {
            return null;
        }
        return new Material(jNGetMaterial);
    }

    @UsedByNative("AssetLoader.cpp")
    public long getNativeObject() {
        return this.f104739a;
    }
}
