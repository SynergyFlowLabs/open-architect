package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.RendererType;
import com.android.volley.o;
import com.android.volley.q;
import com.android.volley.s;
import com.android.volley.toolbox.m;
import com.android.volley.v;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RiveFileRequest extends s<File> {

    @Nullable
    private final FileAssetLoader assetLoader;

    @NotNull
    private final v.b<File> listener;

    @NotNull
    private final RendererType rendererType;

    public /* synthetic */ RiveFileRequest(String str, RendererType rendererType, v.b bVar, v.a aVar, FileAssetLoader fileAssetLoader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rendererType, bVar, aVar, (i10 & 16) != 0 ? null : fileAssetLoader);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0008 A[Catch: UnsupportedEncodingException -> 0x0020, TryCatch #0 {UnsupportedEncodingException -> 0x0020, blocks: (B:4:0x0003, B:7:0x000c, B:6:0x0008), top: B:12:0x0003 }] */
    @Override // com.android.volley.s
    @NotNull
    protected v<File> parseNetworkResponse(@Nullable o oVar) {
        byte[] bArr;
        if (oVar != null) {
            try {
                bArr = oVar.f89471b;
                if (bArr == null) {
                    bArr = new byte[0];
                }
            } catch (UnsupportedEncodingException e10) {
                return v.a(new q(e10));
            }
        } else {
            bArr = new byte[0];
        }
        return v.c(new File(bArr, this.rendererType, this.assetLoader), m.e(oVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileRequest(@NotNull String url, @NotNull RendererType rendererType, @NotNull v.b<File> listener, @NotNull v.a errorListener, @Nullable FileAssetLoader fileAssetLoader) {
        super(0, url, errorListener);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(rendererType, "rendererType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.rendererType = rendererType;
        this.listener = listener;
        this.assetLoader = fileAssetLoader;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.s
    public void deliverResponse(@NotNull File response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.listener.onResponse(response);
    }
}
