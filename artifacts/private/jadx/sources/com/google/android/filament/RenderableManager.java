package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class RenderableManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104146b = "Filament";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final VertexBuffer.c[] f104147c = VertexBuffer.c.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104148a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0950a f104149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104150b;

        /* JADX INFO: renamed from: com.google.android.filament.RenderableManager$a$a, reason: collision with other inner class name */
        private static class C0950a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104151a;

            C0950a(long j10) {
                this.f104151a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                RenderableManager.nDestroyBuilder(this.f104151a);
            }
        }

        public enum b {
            DYNAMIC,
            STATIC_BOUNDS,
            STATIC
        }

        public a(@g0(from = 1) int i10) {
            long jNCreateBuilder = RenderableManager.nCreateBuilder(i10);
            this.f104150b = jNCreateBuilder;
            this.f104149a = new C0950a(jNCreateBuilder);
        }

        @NonNull
        public a a(@g0(from = 0) int i10, @g0(from = 0, to = 32767) int i11) {
            RenderableManager.nBuilderBlendOrder(this.f104150b, i10, i11);
            return this;
        }

        @NonNull
        public a b(@NonNull d dVar) {
            RenderableManager.nBuilderBoundingBox(this.f104150b, dVar.a()[0], dVar.a()[1], dVar.a()[2], dVar.b()[0], dVar.b()[1], dVar.b()[2]);
            return this;
        }

        public void c(@NonNull Engine engine, @h int i10) {
            if (RenderableManager.nBuilderBuild(this.f104150b, engine.getNativeObject(), i10)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Renderable component for entity " + i10 + ", see log.");
        }

        @NonNull
        public a d(boolean z10) {
            RenderableManager.nBuilderCastShadows(this.f104150b, z10);
            return this;
        }

        @NonNull
        public a e(@g0(from = 0, to = 3) int i10) {
            RenderableManager.nBuilderChannel(this.f104150b, i10);
            return this;
        }

        @NonNull
        public a f(boolean z10) {
            RenderableManager.nBuilderCulling(this.f104150b, z10);
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            RenderableManager.nBuilderEnableSkinningBuffers(this.f104150b, z10);
            return this;
        }

        @NonNull
        public a h(boolean z10) {
            RenderableManager.nBuilderFog(this.f104150b, z10);
            return this;
        }

        @NonNull
        public a i(@g0(from = 0) int i10, @NonNull b bVar, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer) {
            RenderableManager.nBuilderGeometry(this.f104150b, i10, bVar.l(), vertexBuffer.j(), indexBuffer.h());
            return this;
        }

        @NonNull
        public a j(@g0(from = 0) int i10, @NonNull b bVar, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer, @g0(from = 0) int i11, @g0(from = 0) int i12) {
            RenderableManager.nBuilderGeometry(this.f104150b, i10, bVar.l(), vertexBuffer.j(), indexBuffer.h(), i11, i12);
            return this;
        }

        @NonNull
        public a k(@g0(from = 0) int i10, @NonNull b bVar, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @g0(from = 0) int i14) {
            RenderableManager.nBuilderGeometry(this.f104150b, i10, bVar.l(), vertexBuffer.j(), indexBuffer.h(), i11, i12, i13, i14);
            return this;
        }

        @NonNull
        public a l(b bVar) {
            RenderableManager.nBuilderGeometryType(this.f104150b, bVar.ordinal());
            return this;
        }

        @NonNull
        public a m(@g0(from = 0) int i10, boolean z10) {
            RenderableManager.nBuilderGlobalBlendOrderEnabled(this.f104150b, i10, z10);
            return this;
        }

        @NonNull
        public a n(@g0(from = 1, to = 32767) int i10) {
            RenderableManager.nBuilderInstances(this.f104150b, i10);
            return this;
        }

        @NonNull
        public a o(@g0(from = 0, to = b3.f12144d) int i10, @g0(from = 0, to = b3.f12144d) int i11) {
            RenderableManager.nBuilderLayerMask(this.f104150b, i10 & 255, i11 & 255);
            return this;
        }

        @NonNull
        public a p(@g0(from = 0, to = 7) int i10, boolean z10) {
            RenderableManager.nBuilderLightChannel(this.f104150b, i10, z10);
            return this;
        }

        @NonNull
        public a q(@g0(from = 0) int i10, @NonNull MaterialInstance materialInstance) {
            RenderableManager.nBuilderMaterial(this.f104150b, i10, materialInstance.h());
            return this;
        }

        @NonNull
        public a r(@g0(from = 0, to = b3.f12144d) int i10) {
            RenderableManager.nBuilderMorphing(this.f104150b, i10);
            return this;
        }

        @NonNull
        public a s(@g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12) {
            RenderableManager.nBuilderSetMorphTargetBufferOffsetAt(this.f104150b, i10, i11, i12);
            return this;
        }

        @NonNull
        public a t(@NonNull MorphTargetBuffer morphTargetBuffer) {
            RenderableManager.nBuilderMorphingStandard(this.f104150b, morphTargetBuffer.h());
            return this;
        }

        @NonNull
        public a u(@g0(from = 0, to = 7) int i10) {
            RenderableManager.nBuilderPriority(this.f104150b, i10);
            return this;
        }

        @NonNull
        public a v(boolean z10) {
            RenderableManager.nBuilderReceiveShadows(this.f104150b, z10);
            return this;
        }

        @NonNull
        public a w(boolean z10) {
            RenderableManager.nBuilderScreenSpaceContactShadows(this.f104150b, z10);
            return this;
        }

        @NonNull
        public a x(@g0(from = 0, to = b3.f12144d) int i10) {
            RenderableManager.nBuilderSkinning(this.f104150b, i10);
            return this;
        }

        @NonNull
        public a y(@g0(from = 0, to = b3.f12144d) int i10, @NonNull Buffer buffer) {
            if (RenderableManager.nBuilderSkinningBones(this.f104150b, i10, buffer, buffer.remaining()) >= 0) {
                return this;
            }
            throw new BufferOverflowException();
        }

        @NonNull
        public a z(SkinningBuffer skinningBuffer, @g0(from = 0, to = b3.f12144d) int i10, int i11) {
            RenderableManager.nBuilderSkinningBuffer(this.f104150b, skinningBuffer != null ? skinningBuffer.h() : 0L, i10, i11);
            return this;
        }
    }

    public enum b {
        POINTS(0),
        LINES(1),
        LINE_STRIP(3),
        TRIANGLES(4),
        TRIANGLE_STRIP(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f104162a;

        static {
            int i10 = 3 ^ 3;
        }

        b(int i10) {
            this.f104162a = i10;
        }

        int l() {
            return this.f104162a;
        }
    }

    RenderableManager(long j10) {
        this.f104148a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBlendOrder(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoundingBox(long j10, float f10, float f11, float f12, float f13, float f14, float f15);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j10, long j11, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannel(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCulling(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnableSkinningBuffers(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFog(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j10, int i10, int i11, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j10, int i10, int i11, long j11, long j12, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j10, int i10, int i11, long j11, long j12, int i12, int i13, int i14, int i15);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometryType(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGlobalBlendOrderEnabled(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInstances(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayerMask(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMaterial(long j10, int i10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphing(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphingStandard(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPriority(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReceiveShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderScreenSpaceContactShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSetMorphTargetBufferOffsetAt(long j10, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinning(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nBuilderSkinningBones(long j10, int i10, Buffer buffer, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinningBuffer(long j10, long j11, int i10, int i11);

    private static native void nClearMaterialInstanceAt(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i10);

    private static native void nDestroy(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetAxisAlignedBoundingBox(long j10, int i10, float[] fArr, float[] fArr2);

    private static native int nGetEnabledAttributesAt(long j10, int i10, int i11);

    private static native boolean nGetFogEnabled(long j10, int i10);

    private static native int nGetInstance(long j10, int i10);

    private static native boolean nGetLightChannel(long j10, int i10, int i11);

    private static native long nGetMaterialInstanceAt(long j10, int i10, int i11);

    private static native int nGetMorphTargetCount(long j10, int i10);

    private static native int nGetPrimitiveCount(long j10, int i10);

    private static native boolean nHasComponent(long j10, int i10);

    private static native boolean nIsShadowCaster(long j10, int i10);

    private static native boolean nIsShadowReceiver(long j10, int i10);

    private static native void nSetAxisAlignedBoundingBox(long j10, int i10, float f10, float f11, float f12, float f13, float f14, float f15);

    private static native void nSetBlendOrderAt(long j10, int i10, int i11, int i12);

    private static native int nSetBonesAsMatrices(long j10, int i10, Buffer buffer, int i11, int i12, int i13);

    private static native int nSetBonesAsQuaternions(long j10, int i10, Buffer buffer, int i11, int i12, int i13);

    private static native void nSetCastShadows(long j10, int i10, boolean z10);

    private static native void nSetChannel(long j10, int i10, int i11);

    private static native void nSetCulling(long j10, int i10, boolean z10);

    private static native void nSetFogEnabled(long j10, int i10, boolean z10);

    private static native void nSetGeometryAt(long j10, int i10, int i11, int i12, long j11, long j12, int i13, int i14);

    private static native void nSetGlobalBlendOrderEnabledAt(long j10, int i10, int i11, boolean z10);

    private static native void nSetLayerMask(long j10, int i10, int i11, int i12);

    private static native void nSetLightChannel(long j10, int i10, int i11, boolean z10);

    private static native void nSetMaterialInstanceAt(long j10, int i10, int i11, long j11);

    private static native void nSetMorphTargetBufferOffsetAt(long j10, int i10, int i11, int i12, long j11, int i13);

    private static native void nSetMorphWeights(long j10, int i10, float[] fArr, int i11);

    private static native void nSetPriority(long j10, int i10, int i11);

    private static native void nSetReceiveShadows(long j10, int i10, boolean z10);

    private static native void nSetScreenSpaceContactShadows(long j10, int i10, boolean z10);

    private static native void nSetSkinningBuffer(long j10, int i10, long j11, int i11, int i12);

    public void C(@i int i10, @g0(from = 0) int i11) {
        nClearMaterialInstanceAt(this.f104148a, i10, i11);
    }

    public void D(@h int i10) {
        nDestroy(this.f104148a, i10);
    }

    @NonNull
    public d E(@i int i10, @p0 d dVar) {
        if (dVar == null) {
            dVar = new d();
        }
        nGetAxisAlignedBoundingBox(this.f104148a, i10, dVar.a(), dVar.b());
        return dVar;
    }

    public Set<VertexBuffer.c> F(@i int i10, @g0(from = 0) int i11) {
        int iNGetEnabledAttributesAt = nGetEnabledAttributesAt(this.f104148a, i10, i11);
        EnumSet enumSetNoneOf = EnumSet.noneOf(VertexBuffer.c.class);
        VertexBuffer.c[] cVarArr = f104147c;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            if (((1 << i12) & iNGetEnabledAttributesAt) != 0) {
                enumSetNoneOf.add(cVarArr[i12]);
            }
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public boolean G(@i int i10) {
        return nGetFogEnabled(this.f104148a, i10);
    }

    @i
    public int H(@h int i10) {
        return nGetInstance(this.f104148a, i10);
    }

    public boolean I(@i int i10, @g0(from = 0, to = 7) int i11) {
        return nGetLightChannel(this.f104148a, i10, i11);
    }

    @NonNull
    public MaterialInstance J(@i int i10, @g0(from = 0) int i11) {
        return new MaterialInstance(nGetMaterialInstanceAt(this.f104148a, i10, i11));
    }

    @g0(from = 0)
    public int K(@i int i10) {
        return nGetMorphTargetCount(this.f104148a, i10);
    }

    public long L() {
        return this.f104148a;
    }

    @g0(from = 0)
    public int M(@i int i10) {
        return nGetPrimitiveCount(this.f104148a, i10);
    }

    public boolean N(@h int i10) {
        return nHasComponent(this.f104148a, i10);
    }

    public boolean O(@i int i10) {
        return nIsShadowCaster(this.f104148a, i10);
    }

    public boolean P(@i int i10) {
        return nIsShadowReceiver(this.f104148a, i10);
    }

    public void Q(@i int i10, @NonNull d dVar) {
        nSetAxisAlignedBoundingBox(this.f104148a, i10, dVar.a()[0], dVar.a()[1], dVar.a()[2], dVar.b()[0], dVar.b()[1], dVar.b()[2]);
    }

    public void R(@i int i10, @g0(from = 0) int i11, @g0(from = 0, to = okhttp3.internal.ws.g.f334653t) int i12) {
        nSetBlendOrderAt(this.f104148a, i10, i11, i12);
    }

    public void S(@i int i10, @NonNull Buffer buffer, @g0(from = 0, to = b3.f12144d) int i11, @g0(from = 0) int i12) {
        if (nSetBonesAsMatrices(this.f104148a, i10, buffer, buffer.remaining(), i11, i12) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void T(@i int i10, @NonNull Buffer buffer, @g0(from = 0, to = b3.f12144d) int i11, @g0(from = 0) int i12) {
        if (nSetBonesAsQuaternions(this.f104148a, i10, buffer, buffer.remaining(), i11, i12) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void U(@i int i10, boolean z10) {
        nSetCastShadows(this.f104148a, i10, z10);
    }

    public void V(@i int i10, @g0(from = 0, to = 3) int i11) {
        nSetChannel(this.f104148a, i10, i11);
    }

    public void W(@i int i10, boolean z10) {
        nSetCulling(this.f104148a, i10, z10);
    }

    public void X(@i int i10, boolean z10) {
        nSetFogEnabled(this.f104148a, i10, z10);
    }

    public void Y(@i int i10, @g0(from = 0) int i11, @NonNull b bVar, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer) {
        nSetGeometryAt(this.f104148a, i10, i11, bVar.l(), vertexBuffer.j(), indexBuffer.h(), 0, indexBuffer.g());
    }

    public void Z(@i int i10, @g0(from = 0) int i11, @NonNull b bVar, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer, @g0(from = 0) int i12, @g0(from = 0) int i13) {
        nSetGeometryAt(this.f104148a, i10, i11, bVar.l(), vertexBuffer.j(), indexBuffer.h(), i12, i13);
    }

    public void a0(@i int i10, @g0(from = 0) int i11, boolean z10) {
        nSetGlobalBlendOrderEnabledAt(this.f104148a, i10, i11, z10);
    }

    public void b0(@i int i10, @g0(from = 0, to = b3.f12144d) int i11, @g0(from = 0, to = b3.f12144d) int i12) {
        nSetLayerMask(this.f104148a, i10, i11, i12);
    }

    public void c0(@i int i10, @g0(from = 0, to = 7) int i11, boolean z10) {
        nSetLightChannel(this.f104148a, i10, i11, z10);
    }

    public void d0(@i int i10, @g0(from = 0) int i11, @NonNull MaterialInstance materialInstance) {
        int iT = materialInstance.f().t();
        if ((nGetEnabledAttributesAt(this.f104148a, i10, i11) & iT) != iT) {
            n.a().k("setMaterialInstanceAt() on primitive " + i11 + " of Renderable at " + i10 + ": declared attributes " + F(i10, i11) + " do no satisfy required attributes " + materialInstance.f().s());
        }
        nSetMaterialInstanceAt(this.f104148a, i10, i11, materialInstance.h());
    }

    public void e0(@i int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13) {
        nSetMorphTargetBufferOffsetAt(this.f104148a, i10, i11, i12, 0L, i13);
    }

    public void f0(@i int i10, @NonNull float[] fArr, @g0(from = 0) int i11) {
        nSetMorphWeights(this.f104148a, i10, fArr, i11);
    }

    public void g0(@i int i10, @g0(from = 0, to = 7) int i11) {
        nSetPriority(this.f104148a, i10, i11);
    }

    public void h0(@i int i10, boolean z10) {
        nSetReceiveShadows(this.f104148a, i10, z10);
    }

    public void i0(@i int i10, boolean z10) {
        nSetScreenSpaceContactShadows(this.f104148a, i10, z10);
    }

    public void j0(@i int i10, @NonNull SkinningBuffer skinningBuffer, int i11, int i12) {
        nSetSkinningBuffer(this.f104148a, i10, skinningBuffer.h(), i11, i12);
    }
}
