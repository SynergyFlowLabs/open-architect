package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.collection.b3;
import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: loaded from: classes4.dex */
@UsedByNative("AssetLoader.cpp")
public class MaterialInstance {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Material.d[] f104077e = Material.d.values();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f104078f = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Material f104079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f104080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f104081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f104082d;

    public enum a {
        BOOL,
        BOOL2,
        BOOL3,
        BOOL4
    }

    public enum b {
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        MAT3,
        MAT4
    }

    public enum c {
        INT,
        INT2,
        INT3,
        INT4
    }

    public enum d {
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    public enum e {
        KEEP,
        ZERO,
        REPLACE,
        INCR_CLAMP,
        INCR_WRAP,
        DECR_CLAMP,
        DECR_WRAP,
        INVERT
    }

    public MaterialInstance(Engine engine, long j10) {
        this.f104081c = j10;
        this.f104082d = nGetMaterial(j10);
    }

    @NonNull
    public static MaterialInstance b(@NonNull MaterialInstance materialInstance, String str) {
        long jNDuplicate = nDuplicate(materialInstance.f104081c, str);
        if (jNDuplicate != 0) {
            return new MaterialInstance(materialInstance.f(), jNDuplicate);
        }
        throw new IllegalStateException("Couldn't duplicate MaterialInstance");
    }

    private static native long nDuplicate(long j10, String str);

    private static native int nGetCullingMode(long j10);

    private static native int nGetDepthFunc(long j10);

    private static native float nGetMaskThreshold(long j10);

    private static native long nGetMaterial(long j10);

    private static native String nGetName(long j10);

    private static native int nGetShadowCullingMode(long j10);

    private static native float nGetSpecularAntiAliasingThreshold(long j10);

    private static native float nGetSpecularAntiAliasingVariance(long j10);

    private static native boolean nIsColorWriteEnabled(long j10);

    private static native boolean nIsDepthCullingEnabled(long j10);

    private static native boolean nIsDepthWriteEnabled(long j10);

    private static native boolean nIsDoubleSided(long j10);

    private static native boolean nIsStencilWriteEnabled(long j10);

    private static native void nSetBooleanParameterArray(long j10, @NonNull String str, int i10, @NonNull @d1(min = 1) boolean[] zArr, @g0(from = 0) int i11, @g0(from = 1) int i12);

    private static native void nSetColorWrite(long j10, boolean z10);

    private static native void nSetCullingMode(long j10, long j11);

    private static native void nSetCullingModeSeparate(long j10, long j11, long j12);

    private static native void nSetDepthCulling(long j10, boolean z10);

    private static native void nSetDepthFunc(long j10, long j11);

    private static native void nSetDepthWrite(long j10, boolean z10);

    private static native void nSetDoubleSided(long j10, boolean z10);

    private static native void nSetFloatParameterArray(long j10, @NonNull String str, int i10, @NonNull @d1(min = 1) float[] fArr, @g0(from = 0) int i11, @g0(from = 1) int i12);

    private static native void nSetIntParameterArray(long j10, @NonNull String str, int i10, @NonNull @d1(min = 1) int[] iArr, @g0(from = 0) int i11, @g0(from = 1) int i12);

    private static native void nSetMaskThreshold(long j10, float f10);

    private static native void nSetParameterBool(long j10, @NonNull String str, boolean z10);

    private static native void nSetParameterBool2(long j10, @NonNull String str, boolean z10, boolean z11);

    private static native void nSetParameterBool3(long j10, @NonNull String str, boolean z10, boolean z11, boolean z12);

    private static native void nSetParameterBool4(long j10, @NonNull String str, boolean z10, boolean z11, boolean z12, boolean z13);

    private static native void nSetParameterFloat(long j10, @NonNull String str, float f10);

    private static native void nSetParameterFloat2(long j10, @NonNull String str, float f10, float f11);

    private static native void nSetParameterFloat3(long j10, @NonNull String str, float f10, float f11, float f12);

    private static native void nSetParameterFloat4(long j10, @NonNull String str, float f10, float f11, float f12, float f13);

    private static native void nSetParameterInt(long j10, @NonNull String str, int i10);

    private static native void nSetParameterInt2(long j10, @NonNull String str, int i10, int i11);

    private static native void nSetParameterInt3(long j10, @NonNull String str, int i10, int i11, int i12);

    private static native void nSetParameterInt4(long j10, @NonNull String str, int i10, int i11, int i12, int i13);

    private static native void nSetParameterTexture(long j10, @NonNull String str, long j11, long j12);

    private static native void nSetPolygonOffset(long j10, float f10, float f11);

    private static native void nSetScissor(long j10, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13);

    private static native void nSetSpecularAntiAliasingThreshold(long j10, float f10);

    private static native void nSetSpecularAntiAliasingVariance(long j10, float f10);

    private static native void nSetStencilCompareFunction(long j10, long j11, long j12);

    private static native void nSetStencilOpDepthFail(long j10, long j11, long j12);

    private static native void nSetStencilOpDepthStencilPass(long j10, long j11, long j12);

    private static native void nSetStencilOpStencilFail(long j10, long j11, long j12);

    private static native void nSetStencilReadMask(long j10, int i10, long j11);

    private static native void nSetStencilReferenceValue(long j10, int i10, long j11);

    private static native void nSetStencilWrite(long j10, boolean z10);

    private static native void nSetStencilWriteMask(long j10, int i10, long j11);

    private static native void nUnsetScissor(long j10);

    public void A(@NonNull String str, float f10, float f11, float f12) {
        nSetParameterFloat3(h(), str, f10, f11, f12);
    }

    public void B(@NonNull String str, float f10, float f11, float f12, float f13) {
        nSetParameterFloat4(h(), str, f10, f11, f12, f13);
    }

    public void C(@NonNull String str, int i10) {
        nSetParameterInt(h(), str, i10);
    }

    public void D(@NonNull String str, int i10, int i11) {
        nSetParameterInt2(h(), str, i10, i11);
    }

    public void E(@NonNull String str, int i10, int i11, int i12) {
        nSetParameterInt3(h(), str, i10, i11, i12);
    }

    public void F(@NonNull String str, int i10, int i11, int i12, int i13) {
        nSetParameterInt4(h(), str, i10, i11, i12, i13);
    }

    public void G(@NonNull String str, @NonNull Colors.d dVar, float f10, float f11, float f12) {
        float[] fArrD = Colors.d(dVar, f10, f11, f12);
        nSetParameterFloat3(h(), str, fArrD[0], fArrD[1], fArrD[2]);
    }

    public void H(@NonNull String str, @NonNull Colors.e eVar, float f10, float f11, float f12, float f13) {
        float[] fArrF = Colors.f(eVar, f10, f11, f12, f13);
        nSetParameterFloat4(h(), str, fArrF[0], fArrF[1], fArrF[2], fArrF[3]);
    }

    public void I(@NonNull String str, @NonNull a aVar, @NonNull boolean[] zArr, @g0(from = 0) int i10, @g0(from = 1) int i11) {
        nSetBooleanParameterArray(h(), str, aVar.ordinal(), zArr, i10, i11);
    }

    public void J(@NonNull String str, @NonNull b bVar, @NonNull float[] fArr, @g0(from = 0) int i10, @g0(from = 1) int i11) {
        nSetFloatParameterArray(h(), str, bVar.ordinal(), fArr, i10, i11);
    }

    public void K(@NonNull String str, @NonNull c cVar, @NonNull int[] iArr, @g0(from = 0) int i10, @g0(from = 1) int i11) {
        nSetIntParameterArray(h(), str, cVar.ordinal(), iArr, i10, i11);
    }

    public void L(@NonNull String str, @NonNull Texture texture, @NonNull TextureSampler textureSampler) {
        nSetParameterTexture(h(), str, texture.getNativeObject(), textureSampler.f104403a);
    }

    public void M(@NonNull String str, boolean z10) {
        nSetParameterBool(h(), str, z10);
    }

    public void N(@NonNull String str, boolean z10, boolean z11) {
        nSetParameterBool2(h(), str, z10, z11);
    }

    public void O(@NonNull String str, boolean z10, boolean z11, boolean z12) {
        nSetParameterBool3(h(), str, z10, z11, z12);
    }

    public void P(@NonNull String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        nSetParameterBool4(h(), str, z10, z11, z12, z13);
    }

    public void Q(float f10, float f11) {
        nSetPolygonOffset(h(), f10, f11);
    }

    public void R(@g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13) {
        nSetScissor(h(), i10, i11, i12, i13);
    }

    public void S(float f10) {
        nSetSpecularAntiAliasingThreshold(h(), f10);
    }

    public void T(float f10) {
        nSetSpecularAntiAliasingVariance(h(), f10);
    }

    public void U(TextureSampler.b bVar) {
        V(bVar, d.FRONT_AND_BACK);
    }

    public void V(TextureSampler.b bVar, d dVar) {
        nSetStencilCompareFunction(h(), bVar.ordinal(), f104078f[dVar.ordinal()]);
    }

    public void W(e eVar) {
        X(eVar, d.FRONT_AND_BACK);
    }

    public void X(e eVar, d dVar) {
        nSetStencilOpDepthFail(h(), eVar.ordinal(), f104078f[dVar.ordinal()]);
    }

    public void Y(e eVar) {
        Z(eVar, d.FRONT_AND_BACK);
    }

    public void Z(e eVar, d dVar) {
        nSetStencilOpDepthStencilPass(h(), eVar.ordinal(), f104078f[dVar.ordinal()]);
    }

    void a() {
        this.f104081c = 0L;
    }

    public void a0(e eVar) {
        b0(eVar, d.FRONT_AND_BACK);
    }

    public void b0(e eVar, d dVar) {
        nSetStencilOpStencilFail(h(), eVar.ordinal(), f104078f[dVar.ordinal()]);
    }

    @NonNull
    public Material.d c() {
        return f104077e[nGetCullingMode(h())];
    }

    public void c0(@g0(from = 0, to = b3.f12144d) int i10) {
        d0(i10, d.FRONT_AND_BACK);
    }

    public TextureSampler.b d() {
        return TextureSampler.d.f104421e[nGetDepthFunc(h())];
    }

    public void d0(@g0(from = 0, to = b3.f12144d) int i10, d dVar) {
        nSetStencilReadMask(h(), i10, f104078f[dVar.ordinal()]);
    }

    public float e() {
        return nGetMaskThreshold(h());
    }

    public void e0(@g0(from = 0, to = b3.f12144d) int i10) {
        f0(i10, d.FRONT_AND_BACK);
    }

    @NonNull
    public Material f() {
        if (this.f104079a == null) {
            this.f104079a = new Material(this.f104082d);
        }
        return this.f104079a;
    }

    public void f0(@g0(from = 0, to = b3.f12144d) int i10, d dVar) {
        nSetStencilReferenceValue(h(), i10, f104078f[dVar.ordinal()]);
    }

    @NonNull
    public String g() {
        if (this.f104080b == null) {
            this.f104080b = nGetName(h());
        }
        return this.f104080b;
    }

    public void g0(boolean z10) {
        nSetStencilWrite(h(), z10);
    }

    public long h() {
        long j10 = this.f104081c;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed MaterialInstance");
    }

    public void h0(int i10) {
        i0(i10, d.FRONT_AND_BACK);
    }

    @NonNull
    public Material.d i() {
        return f104077e[nGetShadowCullingMode(h())];
    }

    public void i0(@g0(from = 0, to = b3.f12144d) int i10, d dVar) {
        nSetStencilWriteMask(h(), i10, f104078f[dVar.ordinal()]);
    }

    public float j() {
        return nGetSpecularAntiAliasingThreshold(h());
    }

    public void j0() {
        nUnsetScissor(h());
    }

    public float k() {
        return nGetSpecularAntiAliasingVariance(h());
    }

    public boolean l() {
        return nIsColorWriteEnabled(h());
    }

    public boolean m() {
        return nIsDepthCullingEnabled(h());
    }

    public boolean n() {
        return nIsDepthWriteEnabled(h());
    }

    public boolean o() {
        return nIsDoubleSided(h());
    }

    public boolean p() {
        return nIsStencilWriteEnabled(h());
    }

    public void q(boolean z10) {
        nSetColorWrite(h(), z10);
    }

    public void r(@NonNull Material.d dVar) {
        nSetCullingMode(h(), dVar.ordinal());
    }

    public void s(@NonNull Material.d dVar, @NonNull Material.d dVar2) {
        nSetCullingModeSeparate(h(), dVar.ordinal(), dVar2.ordinal());
    }

    public void t(boolean z10) {
        nSetDepthCulling(h(), z10);
    }

    public void u(TextureSampler.b bVar) {
        nSetDepthFunc(h(), bVar.ordinal());
    }

    public void v(boolean z10) {
        nSetDepthWrite(h(), z10);
    }

    public void w(boolean z10) {
        nSetDoubleSided(h(), z10);
    }

    public void x(float f10) {
        nSetMaskThreshold(h(), f10);
    }

    public void y(@NonNull String str, float f10) {
        nSetParameterFloat(h(), str, f10);
    }

    public void z(@NonNull String str, float f10, float f11) {
        nSetParameterFloat2(h(), str, f10, f11);
    }

    MaterialInstance(@NonNull Material material, long j10) {
        this.f104079a = material;
        this.f104082d = material.m();
        this.f104081c = j10;
    }

    MaterialInstance(long j10) {
        this.f104081c = j10;
        this.f104082d = nGetMaterial(j10);
    }
}
