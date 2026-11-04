package com.google.android.filament.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f104849a = true;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104850a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104850a = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Texture.e a(Bitmap bitmap) {
        String strName = bitmap.getConfig().name();
        switch (strName.hashCode()) {
            case -189895305:
                if (strName.equals("ALPHA_8")) {
                    return Texture.e.ALPHA;
                }
                break;
            case 223337875:
                if (strName.equals("ARGB_8888")) {
                    return Texture.e.RGBA;
                }
                break;
            case 1717230432:
                if (strName.equals("RGBA_F16")) {
                    return Texture.e.RGBA;
                }
                break;
            case 1857362722:
                if (strName.equals("RGB_565")) {
                    return Texture.e.RGB;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown bitmap configuration");
    }

    private static final Texture.f b(f0 f0Var) {
        int i10 = a.f104850a[f0Var.ordinal()];
        if (i10 == 1) {
            return Texture.f.SRGB8_A8;
        }
        if (i10 != 2 && i10 != 3) {
            throw new k0();
        }
        return Texture.f.RGBA8;
    }

    @NotNull
    public static final Texture c(@NotNull Engine engine, @NotNull Resources resources, int i10, @NotNull f0 type) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type, "type");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = type == f0.COLOR;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i10, options);
        Texture textureA = new Texture.b().k(bitmapDecodeResource.getWidth()).e(bitmapDecodeResource.getHeight()).h(Texture.i.SAMPLER_2D).d(b(type)).g(255).a(engine);
        Intrinsics.checkNotNullExpressionValue(textureA, "build(...)");
        TextureHelper.c(engine, textureA, 0, bitmapDecodeResource);
        textureA.o(engine);
        return textureA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Texture.k d(Bitmap bitmap) {
        String strName = bitmap.getConfig().name();
        switch (strName.hashCode()) {
            case -189895305:
                if (strName.equals("ALPHA_8")) {
                    return Texture.k.USHORT;
                }
                break;
            case 223337875:
                if (strName.equals("ARGB_8888")) {
                    return Texture.k.UBYTE;
                }
                break;
            case 1717230432:
                if (strName.equals("RGBA_F16")) {
                    return Texture.k.HALF;
                }
                break;
            case 1857362722:
                if (strName.equals("RGB_565")) {
                    return Texture.k.USHORT_565;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported bitmap configuration");
    }
}
