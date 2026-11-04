package app.rive.runtime.kotlin.core;

import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FileAsset extends NativeObject {

    @NotNull
    private final f0 cdnUrl$delegate;

    @NotNull
    private final f0 name$delegate;

    @NotNull
    private final RendererType rendererType;

    @NotNull
    private final f0 uniqueFilename$delegate;

    public /* synthetic */ FileAsset(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cdnUrl_delegate$lambda$2(FileAsset fileAsset) {
        return fileAsset.cppCDNUrl(fileAsset.getCppPointer());
    }

    private final native String cppCDNUrl(long j10);

    private final native boolean cppDecode(long j10, byte[] bArr, int i10);

    private final native String cppName(long j10);

    private final native String cppUniqueFilename(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final String name_delegate$lambda$0(FileAsset fileAsset) {
        return fileAsset.cppName(fileAsset.getCppPointer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uniqueFilename_delegate$lambda$1(FileAsset fileAsset) {
        return fileAsset.cppUniqueFilename(fileAsset.getCppPointer());
    }

    public final boolean decode(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return cppDecode(getCppPointer(), bytes, this.rendererType.getValue());
    }

    @NotNull
    public final String getCdnUrl() {
        return (String) this.cdnUrl$delegate.getValue();
    }

    @NotNull
    public final String getName() {
        return (String) this.name$delegate.getValue();
    }

    @NotNull
    public final String getUniqueFilename() {
        return (String) this.uniqueFilename$delegate.getValue();
    }

    private FileAsset(long j10, int i10) {
        super(j10);
        this.rendererType = RendererType.Companion.fromIndex(i10);
        this.name$delegate = g0.c(new Function0() { // from class: app.rive.runtime.kotlin.core.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FileAsset.name_delegate$lambda$0(this.f77465a);
            }
        });
        this.uniqueFilename$delegate = g0.c(new Function0() { // from class: app.rive.runtime.kotlin.core.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FileAsset.uniqueFilename_delegate$lambda$1(this.f77466a);
            }
        });
        this.cdnUrl$delegate = g0.c(new Function0() { // from class: app.rive.runtime.kotlin.core.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FileAsset.cdnUrl_delegate$lambda$2(this.f77467a);
            }
        });
    }
}
