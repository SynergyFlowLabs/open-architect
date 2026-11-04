package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class HDRLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HDRLoader f104780a = new HDRLoader();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Texture.f f104781a = Texture.f.RGB16F;

        @NotNull
        public final Texture.f a() {
            return this.f104781a;
        }

        public final void b(@NotNull Texture.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.f104781a = fVar;
        }
    }

    private HDRLoader() {
    }

    public static /* synthetic */ Texture b(HDRLoader hDRLoader, Engine engine, Buffer buffer, a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = new a();
        }
        return hDRLoader.a(engine, buffer, aVar);
    }

    private final native long nCreateHDRTexture(long j10, Buffer buffer, int i10, int i11);

    @Nullable
    public final Texture a(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull a options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        long jNCreateHDRTexture = nCreateHDRTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.a().ordinal());
        if (jNCreateHDRTexture != 0) {
            return new Texture(jNCreateHDRTexture);
        }
        int i10 = 5 & 0;
        return null;
    }
}
