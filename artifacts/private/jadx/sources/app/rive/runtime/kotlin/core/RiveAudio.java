package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RiveAudio extends NativeObject {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long cppMakeAudio(byte[] bArr, int i10);

        public static /* synthetic */ RiveAudio make$default(Companion companion, byte[] bArr, RendererType rendererType, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        @NotNull
        public final RiveAudio make(@NotNull byte[] bytes, @NotNull RendererType rendererType) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Intrinsics.checkNotNullParameter(rendererType, "rendererType");
            return new RiveAudio(cppMakeAudio(bytes, rendererType.getValue()));
        }

        private Companion() {
        }
    }

    public RiveAudio(long j10) {
        super(j10);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);
}
