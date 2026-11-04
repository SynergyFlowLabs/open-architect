package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class KTX1Loader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final KTX1Loader f104785a = new KTX1Loader();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f104786a;

        public final boolean a() {
            return this.f104786a;
        }

        public final void b(boolean z10) {
            this.f104786a = z10;
        }
    }

    private KTX1Loader() {
    }

    public static /* synthetic */ IndirectLight b(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = new a();
        }
        return kTX1Loader.a(engine, buffer, aVar);
    }

    public static /* synthetic */ Skybox d(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = new a();
        }
        return kTX1Loader.c(engine, buffer, aVar);
    }

    public static /* synthetic */ Texture f(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = new a();
        }
        return kTX1Loader.e(engine, buffer, aVar);
    }

    private final native long nCreateIndirectLight(long j10, Buffer buffer, int i10, boolean z10);

    private final native long nCreateKTXTexture(long j10, Buffer buffer, int i10, boolean z10);

    private final native long nCreateSkybox(long j10, Buffer buffer, int i10, boolean z10);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int i10, float[] fArr);

    @NotNull
    public final IndirectLight a(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull a options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new IndirectLight(nCreateIndirectLight(engine.getNativeObject(), buffer, buffer.remaining(), options.a()));
    }

    @NotNull
    public final Skybox c(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull a options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Skybox(nCreateSkybox(engine.getNativeObject(), buffer, buffer.remaining(), options.a()));
    }

    @NotNull
    public final Texture e(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull a options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Texture(nCreateKTXTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.a()));
    }

    @Nullable
    public final float[] g(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        float[] fArr = new float[27];
        if (nGetSphericalHarmonics(buffer, buffer.remaining(), fArr)) {
            return fArr;
        }
        return null;
    }
}
