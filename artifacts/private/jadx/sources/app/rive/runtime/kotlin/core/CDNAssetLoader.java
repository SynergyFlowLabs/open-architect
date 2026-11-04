package app.rive.runtime.kotlin.core;

import android.content.Context;
import com.android.volley.a0;
import com.android.volley.t;
import com.android.volley.toolbox.e0;
import com.android.volley.v;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class CDNAssetLoader extends FileAssetLoader {

    @NotNull
    private final f0 queue$delegate;
    private final String tag;

    public CDNAssetLoader(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = getClass().getSimpleName();
        this.queue$delegate = g0.c(new Function0() { // from class: app.rive.runtime.kotlin.core.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.a(context);
            }
        });
    }

    private final t getQueue() {
        return (t) this.queue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContents$lambda$1(FileAsset fileAsset, byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        fileAsset.decode(bytes);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadContents$lambda$2(CDNAssetLoader cDNAssetLoader, a0 a0Var) {
        String str = cDNAssetLoader.tag;
        a0Var.printStackTrace();
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(@NotNull final FileAsset asset, @NotNull byte[] inBandBytes) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(inBandBytes, "inBandBytes");
        String cdnUrl = asset.getCdnUrl();
        if (cdnUrl.length() == 0) {
            return false;
        }
        getQueue().a(new BytesRequest(cdnUrl, new Function1() { // from class: app.rive.runtime.kotlin.core.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CDNAssetLoader.loadContents$lambda$1(asset, (byte[]) obj);
            }
        }, new v.a() { // from class: app.rive.runtime.kotlin.core.c
            @Override // com.android.volley.v.a
            public final void b(a0 a0Var) {
                CDNAssetLoader.loadContents$lambda$2(this.f77464a, a0Var);
            }
        }));
        return true;
    }
}
