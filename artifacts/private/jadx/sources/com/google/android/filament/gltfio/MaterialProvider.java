package com.google.android.filament.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: loaded from: classes4.dex */
@UsedByNative("AssetLoader.cpp")
public interface MaterialProvider {

    @UsedByNative("MaterialKey.cpp")
    public static class MaterialKey {

        @UsedByNative("MaterialKey.cpp")
        public int alphaMode;

        @UsedByNative("MaterialKey.cpp")
        public int aoUV;

        @UsedByNative("MaterialKey.cpp")
        public int baseColorUV;

        @UsedByNative("MaterialKey.cpp")
        public int clearCoatNormalUV;

        @UsedByNative("MaterialKey.cpp")
        public int clearCoatRoughnessUV;

        @UsedByNative("MaterialKey.cpp")
        public int clearCoatUV;

        @UsedByNative("MaterialKey.cpp")
        public boolean doubleSided;

        @UsedByNative("MaterialKey.cpp")
        public int emissiveUV;

        @UsedByNative("MaterialKey.cpp")
        public boolean enableDiagnostics;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasBaseColorTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoat;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoatNormalTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoatRoughnessTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoatTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasEmissiveTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasIOR;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasMetallicRoughnessTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasNormalTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasOcclusionTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasSheen;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasSheenColorTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasSheenRoughnessTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasTextureTransforms;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasTransmission;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasTransmissionTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasVertexColors;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasVolumeThicknessTexture;

        @UsedByNative("MaterialKey.cpp")
        public int metallicRoughnessUV;

        @UsedByNative("MaterialKey.cpp")
        public int normalUV;

        @UsedByNative("MaterialKey.cpp")
        public int sheenColorUV;

        @UsedByNative("MaterialKey.cpp")
        public int sheenRoughnessUV;

        @UsedByNative("MaterialKey.cpp")
        public int transmissionUV;

        @UsedByNative("MaterialKey.cpp")
        public boolean unlit;

        @UsedByNative("MaterialKey.cpp")
        public boolean useSpecularGlossiness;

        @UsedByNative("MaterialKey.cpp")
        public int volumeThicknessUV;

        static {
            nGlobalInit();
        }

        private static native void nConstrainMaterial(MaterialKey materialKey, int[] iArr);

        private static native void nGlobalInit();

        public void a(@NonNull @d1(min = 8) int[] iArr) {
            nConstrainMaterial(this, iArr);
        }
    }

    @NonNull
    Material[] a();

    void b();

    boolean c(int i10);

    @p0
    MaterialInstance d(MaterialKey materialKey, @NonNull @d1(min = 8) int[] iArr, @p0 String str, @p0 String str2);

    void destroy();

    @p0
    Material e(MaterialKey materialKey, @NonNull @d1(min = 8) int[] iArr, @p0 String str);
}
